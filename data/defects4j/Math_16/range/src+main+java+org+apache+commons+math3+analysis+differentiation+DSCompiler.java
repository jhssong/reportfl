{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/analysis/differentiation/DSCompiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DSCompiler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 125,
      "end_line": 1764,
      "comment": " Class holding \"compiled\" computation rules for derivative structures.\n * \u003cp\u003eThis class implements the computation rules described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www.math.american.edu/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002. However, in order to avoid performances bottlenecks, the recursive\n * rules are \"compiled\" once in an unfold form. This class does this recursion unrolling\n * and stores the computation rules as simple loops with pre-computed indirection arrays.\u003c/p\u003e\n * \u003cp\u003e\n * This class maps all derivative computation into single dimension arrays that hold the\n * value and partial derivatives. The class does not hold these arrays, which remains under\n * the responsibility of the caller. For each combination of number of free parameters and\n * derivation order, only one compiler is necessary, and this compiler will be used to\n * perform computations on all arrays provided to it, which can represent hundreds or\n * thousands of different parameters kept together with all theur partial derivatives.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The arrays on which compilers operate contain only the partial derivatives together\n * with the 0\u003csup\u003eth\u003c/sup\u003e derivative, i.e. the value. The partial derivatives are stored in\n * a compiler-specific order, which can be retrieved using methods {@link\n * #getPartialDerivativeIndex(int...) getPartialDerivativeIndex} and {@link\n * #getPartialDerivativeOrders(int)}. The value is guaranteed to be stored as the first element\n * (i.e. the {@link #getPartialDerivativeIndex(int...) getPartialDerivativeIndex} method returns\n * 0 when called with 0 for all derivation orders and {@link #getPartialDerivativeOrders(int)\n * getPartialDerivativeOrders} returns an array filled with 0 when called with 0 as the index).\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note that the ordering changes with number of parameters and derivation order. For example\n * given 2 parameters x and y, df/dy is stored at index 2 when derivation order is set to 1 (in\n * this case the array has three elements: f, df/dx and df/dy). If derivation order is set to\n * 2, then df/dy will be stored at index 3 (in this case the array has six elements: f, df/dx,\n * df/dxdx, df/dy, df/dxdy and df/dydy).\n * \u003c/p\u003e\n * \u003cp\u003e\n * Given this structure, users can perform some simple operations like adding, subtracting\n * or multiplying constants and negating the elements by themselves, knowing if they want to\n * mutate their array or create a new array. These simple operations are not provided by\n * the compiler. The compiler provides only the more complex operations between several arrays.\n * \u003c/p\u003e\n * \u003cp\u003eThis class is mainly used as the engine for scalar variable {@link DerivativeStructure}.\n * It can also be used directly to hold several variables in arrays for more complex data\n * structures. User can for example store a vector of n variables depending on three x, y\n * and z free parameters in one array as follows:\n * \u003cpre\u003e\n *   // parameter 0 is x, parameter 1 is y, parameter 2 is z\n *   int parameters \u003d 3;\n *   DSCompiler compiler \u003d DSCompiler.getCompiler(parameters, order);\n *   int size \u003d compiler.getSize();\n *\n *   // pack all elements in a single array\n *   double[] array \u003d new double[n * size];\n *   for (int i \u003d 0; i \u003c n; ++i) {\n *\n *     // we know value is guaranteed to be the first element\n *     array[i * size] \u003d v[i];\n *\n *     // we don\u0027t know where first derivatives are stored, so we ask the compiler\n *     array[i * size + compiler.getPartialDerivativeIndex(1, 0, 0) \u003d dvOnDx[i][0];\n *     array[i * size + compiler.getPartialDerivativeIndex(0, 1, 0) \u003d dvOnDy[i][0];\n *     array[i * size + compiler.getPartialDerivativeIndex(0, 0, 1) \u003d dvOnDz[i][0];\n *\n *     // we let all higher order derivatives set to 0\n *\n *   }\n * \u003c/pre\u003e\n * Then in another function, user can perform some operations on all elements stored\n * in the single array, such as a simple product of all variables:\n * \u003cpre\u003e\n *   // compute the product of all elements\n *   double[] product \u003d new double[size];\n *   prod[0] \u003d 1.0;\n *   for (int i \u003d 0; i \u003c n; ++i) {\n *     double[] tmp \u003d product.clone();\n *     compiler.multiply(tmp, 0, array, i * size, product, 0);\n *   }\n *\n *   // value\n *   double p \u003d product[0];\n *\n *   // first derivatives\n *   double dPdX \u003d product[compiler.getPartialDerivativeIndex(1, 0, 0)];\n *   double dPdY \u003d product[compiler.getPartialDerivativeIndex(0, 1, 0)];\n *   double dPdZ \u003d product[compiler.getPartialDerivativeIndex(0, 0, 1)];\n *\n *   // cross derivatives (assuming order was at least 2)\n *   double dPdXdX \u003d product[compiler.getPartialDerivativeIndex(2, 0, 0)];\n *   double dPdXdY \u003d product[compiler.getPartialDerivativeIndex(1, 1, 0)];\n *   double dPdXdZ \u003d product[compiler.getPartialDerivativeIndex(1, 0, 1)];\n *   double dPdYdY \u003d product[compiler.getPartialDerivativeIndex(0, 2, 0)];\n *   double dPdYdZ \u003d product[compiler.getPartialDerivativeIndex(0, 1, 1)];\n *   double dPdZdZ \u003d product[compiler.getPartialDerivativeIndex(0, 0, 2)];\n * \u003c/p\u003e\n * @see DerivativeStructure\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "compilers"
      ],
      "begin_line": 128,
      "end_line": 129,
      "comment": " Array of all compilers created so far. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Number of free parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Derivation order. "
    },
    {
      "type": "field",
      "varNames": [
        "sizes"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Number of partial derivatives (including the single 0 order derivative element). "
    },
    {
      "type": "field",
      "varNames": [
        "derivativesIndirection"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " Indirection array for partial derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerIndirection"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Indirection array of the lower derivative elements. "
    },
    {
      "type": "field",
      "varNames": [
        "multIndirection"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Indirection arrays for multiplication. "
    },
    {
      "type": "field",
      "varNames": [
        "compIndirection"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Indirection arrays for function composition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.DSCompiler(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 158,
      "end_line": 178,
      "comment": " Private constructor, reserved for the factory method {@link #getCompiler(int, int)}.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 163,col 9)-(line 163,col 93)",
        "(line 164,col 9)-(line 166,col 81)",
        "(line 167,col 9)-(line 169,col 75)",
        "(line 170,col 9)-(line 172,col 102)",
        "(line 173,col 9)-(line 176,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(int, int)",
      "begin_line": 185,
      "end_line": 225,
      "comment": " Get the compiler for number of free parameters and order.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @return cached rules set\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 93)",
        "(line 198,col 9)-(line 198,col 95)",
        "(line 199,col 9)-(line 199,col 88)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 49)",
        "(line 223,col 9)-(line 223,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 234,
      "end_line": 251,
      "comment": " Compile the sizes array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return sizes array\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 260,
      "end_line": 295,
      "comment": " Compile the derivatives indirection array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return derivatives indirection array\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 70)",
        "(line 269,col 9)-(line 269,col 75)",
        "(line 270,col 9)-(line 270,col 82)",
        "(line 273,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 293,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 308,
      "end_line": 327,
      "comment": " Compile the lower derivatives indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all elements\n     * except derivatives for last derivation order.\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return lower derivatives indirection array\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 317,col 9)-(line 317,col 64)",
        "(line 318,col 9)-(line 318,col 69)",
        "(line 319,col 9)-(line 319,col 62)",
        "(line 320,col 9)-(line 320,col 88)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, int[])",
      "begin_line": 342,
      "end_line": 390,
      "comment": " Compile the multiplication indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all pairs of elements\n     * involved when computing a multiplication. This allows a straightforward\n     * loop-based multiplication (see {@link #multiply(double[], int, double[], int, double[], int)}).\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @param lowerIndirection lower derivatives indirection array\n     * @return multiplication indirection array\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 352,col 9)-(line 352,col 63)",
        "(line 353,col 9)-(line 353,col 68)",
        "(line 354,col 9)-(line 354,col 69)",
        "(line 356,col 9)-(line 356,col 86)",
        "(line 358,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, int[][], int[][], int[])",
      "begin_line": 407,
      "end_line": 504,
      "comment": " Compile the function composition indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all sets of elements\n     * involved when computing a composition. This allows a straightforward\n     * loop-based composition (see {@link #compose(double[], int, double[], double[], int)}).\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @param sizes sizes array\n     * @param derivativesIndirection derivatives indirection array\n     * @param lowerIndirection lower derivatives indirection array\n     * @return multiplication indirection array\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 63)",
        "(line 419,col 9)-(line 419,col 68)",
        "(line 420,col 9)-(line 420,col 69)",
        "(line 423,col 9)-(line 423,col 86)",
        "(line 429,col 9)-(line 500,col 9)",
        "(line 502,col 9)-(line 502,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(int...)",
      "begin_line": 538,
      "end_line": 548,
      "comment": " Get the index of a partial derivative in the array.\n     * \u003cp\u003e\n     * If all orders are set to 0, then the 0\u003csup\u003eth\u003c/sup\u003e order derivative\n     * is returned, which is the value of the function.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe indices of derivatives are between 0 and {@link #getSize() getSize()} - 1.\n     * Their specific order is fixed for a given compiler, but otherwise not\n     * publicly specified. There are however some simple cases which have guaranteed\n     * indices:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003ethe index of 0\u003csup\u003eth\u003c/sup\u003e order derivative is always 0\u003c/li\u003e\n     *   \u003cli\u003eif there is only 1 {@link #getFreeParameters() free parameter}, then the\n     *   derivatives are sorted in increasing derivation order (i.e. f at index 0, df/dp\n     *   at index 1, d\u003csup\u003e2\u003c/sup\u003ef/dp\u003csup\u003e2\u003c/sup\u003e at index 2 ...\n     *   d\u003csup\u003ek\u003c/sup\u003ef/dp\u003csup\u003ek\u003c/sup\u003e at index k),\u003c/li\u003e\n     *   \u003cli\u003eif the {@link #getOrder() derivation order} is 1, then the derivatives\n     *   are sorted in incresing free parameter order (i.e. f at index 0, df/dx\u003csub\u003e1\u003c/sub\u003e\n     *   at index 1, df/dx\u003csub\u003e2\u003c/sub\u003e at index 2 ... df/dx\u003csub\u003ek\u003c/sub\u003e at index k),\u003c/li\u003e\n     *   \u003cli\u003eall other cases are not publicly specified\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * This method is the inverse of method {@link #getPartialDerivativeOrders(int)}\n     * \u003c/p\u003e\n     * @param orders derivation orders with respect to each parameter\n     * @return index of the partial derivative\n     * @exception DimensionMismatchException if the numbers of parameters does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     * @see #getPartialDerivativeOrders(int)\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(int, int, int[][], int...)",
      "begin_line": 560,
      "end_line": 591,
      "comment": " Get the index of a partial derivative in an array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param sizes sizes array\n     * @param orders derivation orders with respect to each parameter\n     * (the lenght of this array must match the number of parameters)\n     * @return index of the partial derivative\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 26)",
        "(line 567,col 9)-(line 567,col 30)",
        "(line 568,col 9)-(line 568,col 26)",
        "(line 569,col 9)-(line 587,col 9)",
        "(line 589,col 9)-(line 589,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(int, int, int[][], int, int, int[][])",
      "begin_line": 604,
      "end_line": 610,
      "comment": " Convert an index from one (parameters, order) structure to another.\n     * @param index index of a partial derivative in source derivative structure\n     * @param srcP number of free parameters in source derivative structure\n     * @param srcDerivativesIndirection derivatives indirection array for the source\n     * derivative structure\n     * @param destP number of free parameters in destination derivative structure\n     * @param destO derivation order in destination derivative structure\n     * @param destSizes sizes array for the destination derivative structure\n     * @return index of the partial derivative with the \u003cem\u003esame\u003c/em\u003e characteristics\n     * in destination derivative structure\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 100)",
        "(line 609,col 9)-(line 609,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders(int)",
      "begin_line": 620,
      "end_line": 622,
      "comment": " Get the derivation orders for a specific index in the array.\n     * \u003cp\u003e\n     * This method is the inverse of {@link #getPartialDerivativeIndex(int...)}.\n     * \u003c/p\u003e\n     * @param index of the partial derivative\n     * @return orders derivation orders with respect to each parameter\n     * @see #getPartialDerivativeIndex(int...)\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getFreeParameters()",
      "begin_line": 627,
      "end_line": 629,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getOrder()",
      "begin_line": 634,
      "end_line": 636,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize()",
      "begin_line": 645,
      "end_line": 647,
      "comment": " Get the array size required for holding partial derivatives data.\n     * \u003cp\u003e\n     * This number includes the single 0 order derivative element, which is\n     * guaranteed to be stored in the first element of the array.\n     * \u003c/p\u003e\n     * @return array size required for holding partial derivatives data\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double[], int)",
      "begin_line": 661,
      "end_line": 668,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double, double[], int, double[], int)",
      "begin_line": 685,
      "end_line": 695,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param a3 third scale factor\n     * @param c3 third base (unscaled) component\n     * @param offset3 offset of third operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 694,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double, double[], int, double, double[], int, double[], int)",
      "begin_line": 715,
      "end_line": 727,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param a3 third scale factor\n     * @param c3 third base (unscaled) component\n     * @param offset3 offset of third operand in its array\n     * @param a4 fourth scale factor\n     * @param c4 fourth base (unscaled) component\n     * @param offset4 offset of fourth operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.add(double[], int, double[], int, double[], int)",
      "begin_line": 738,
      "end_line": 744,
      "comment": " Perform addition of two derivative structures.\n     * @param lhs array holding left hand side of addition\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of addition\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 743,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(double[], int, double[], int, double[], int)",
      "begin_line": 754,
      "end_line": 760,
      "comment": " Perform subtraction of two derivative structures.\n     * @param lhs array holding left hand side of subtraction\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of subtraction\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 759,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(double[], int, double[], int, double[], int)",
      "begin_line": 772,
      "end_line": 785,
      "comment": " Perform multiplication of two derivative structures.\n     * @param lhs array holding left hand side of multiplication\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of multiplication\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (for\n     * multiplication the result array \u003cem\u003ecannot\u003c/em\u003e be one of\n     * the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.divide(double[], int, double[], int, double[], int)",
      "begin_line": 797,
      "end_line": 803,
      "comment": " Perform division of two derivative structures.\n     * @param lhs array holding left hand side of division\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of division\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (for\n     * division the result array \u003cem\u003ecannot\u003c/em\u003e be one of\n     * the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 58)",
        "(line 801,col 9)-(line 801,col 47)",
        "(line 802,col 9)-(line 802,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.remainder(double[], int, double[], int, double[], int)",
      "begin_line": 814,
      "end_line": 830,
      "comment": " Perform remainder of two derivative structures.\n     * @param lhs array holding left hand side of remainder\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of remainder\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 59)",
        "(line 820,col 9)-(line 820,col 82)",
        "(line 823,col 9)-(line 823,col 35)",
        "(line 826,col 9)-(line 828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, double, double[], int)",
      "begin_line": 841,
      "end_line": 862,
      "comment": " Compute power of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param p power to apply\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 50)",
        "(line 847,col 9)-(line 847,col 68)",
        "(line 848,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 25)",
        "(line 853,col 9)-(line 853,col 31)",
        "(line 854,col 9)-(line 857,col 9)",
        "(line 860,col 9)-(line 860,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, int, double[], int)",
      "begin_line": 873,
      "end_line": 915,
      "comment": " Compute integer power of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param n power to apply\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 881,col 9)",
        "(line 885,col 9)-(line 885,col 50)",
        "(line 887,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 906,col 31)",
        "(line 907,col 9)-(line 910,col 9)",
        "(line 913,col 9)-(line 913,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, double[], int, double[], int)",
      "begin_line": 927,
      "end_line": 935,
      "comment": " Compute power of a derivative structure.\n     * @param x array holding the base\n     * @param xOffset offset of the base in its array\n     * @param y array holding the exponent\n     * @param yOffset offset of the exponent in its array\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 52)",
        "(line 931,col 9)-(line 931,col 33)",
        "(line 932,col 9)-(line 932,col 53)",
        "(line 933,col 9)-(line 933,col 48)",
        "(line 934,col 9)-(line 934,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(double[], int, int, double[], int)",
      "begin_line": 946,
      "end_line": 973,
      "comment": " Compute n\u003csup\u003eth\u003c/sup\u003e root of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param n order of the root\n     * @param result array where result must be stored (for\n     * n\u003csup\u003eth\u003c/sup\u003e root the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 50)",
        "(line 952,col 9)-(line 952,col 18)",
        "(line 953,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 43)",
        "(line 964,col 9)-(line 964,col 64)",
        "(line 965,col 9)-(line 968,col 9)",
        "(line 971,col 9)-(line 971,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.exp(double[], int, double[], int)",
      "begin_line": 983,
      "end_line": 993,
      "comment": " Compute exponential of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * exponential the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 50)",
        "(line 988,col 9)-(line 988,col 68)",
        "(line 991,col 9)-(line 991,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.expm1(double[], int, double[], int)",
      "begin_line": 1003,
      "end_line": 1014,
      "comment": " Compute exp(x) - 1 of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * exponential the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 50)",
        "(line 1008,col 9)-(line 1008,col 61)",
        "(line 1009,col 9)-(line 1009,col 82)",
        "(line 1012,col 9)-(line 1012,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log(double[], int, double[], int)",
      "begin_line": 1024,
      "end_line": 1042,
      "comment": " Compute natural logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 50)",
        "(line 1029,col 9)-(line 1029,col 59)",
        "(line 1030,col 9)-(line 1037,col 9)",
        "(line 1040,col 9)-(line 1040,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log1p(double[], int, double[], int)",
      "begin_line": 1051,
      "end_line": 1069,
      "comment": " Computes shifted logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * shifted logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 50)",
        "(line 1056,col 9)-(line 1056,col 61)",
        "(line 1057,col 9)-(line 1064,col 9)",
        "(line 1067,col 9)-(line 1067,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log10(double[], int, double[], int)",
      "begin_line": 1078,
      "end_line": 1096,
      "comment": " Computes base 10 logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * base 10 logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 50)",
        "(line 1083,col 9)-(line 1083,col 61)",
        "(line 1084,col 9)-(line 1091,col 9)",
        "(line 1094,col 9)-(line 1094,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(double[], int, double[], int)",
      "begin_line": 1106,
      "end_line": 1122,
      "comment": " Compute cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 50)",
        "(line 1111,col 9)-(line 1111,col 59)",
        "(line 1112,col 9)-(line 1117,col 9)",
        "(line 1120,col 9)-(line 1120,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(double[], int, double[], int)",
      "begin_line": 1132,
      "end_line": 1148,
      "comment": " Compute sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 50)",
        "(line 1137,col 9)-(line 1137,col 59)",
        "(line 1138,col 9)-(line 1143,col 9)",
        "(line 1146,col 9)-(line 1146,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(double[], int, double[], int)",
      "begin_line": 1158,
      "end_line": 1203,
      "comment": " Compute tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 56)",
        "(line 1163,col 9)-(line 1163,col 62)",
        "(line 1164,col 9)-(line 1164,col 24)",
        "(line 1166,col 9)-(line 1198,col 9)",
        "(line 1201,col 9)-(line 1201,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.acos(double[], int, double[], int)",
      "begin_line": 1213,
      "end_line": 1260,
      "comment": " Compute arc cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 50)",
        "(line 1218,col 9)-(line 1218,col 48)",
        "(line 1219,col 9)-(line 1219,col 39)",
        "(line 1220,col 9)-(line 1255,col 9)",
        "(line 1258,col 9)-(line 1258,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.asin(double[], int, double[], int)",
      "begin_line": 1270,
      "end_line": 1317,
      "comment": " Compute arc sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 50)",
        "(line 1275,col 9)-(line 1275,col 48)",
        "(line 1276,col 9)-(line 1276,col 39)",
        "(line 1277,col 9)-(line 1312,col 9)",
        "(line 1315,col 9)-(line 1315,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atan(double[], int, double[], int)",
      "begin_line": 1327,
      "end_line": 1374,
      "comment": " Compute arc tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 50)",
        "(line 1332,col 9)-(line 1332,col 48)",
        "(line 1333,col 9)-(line 1333,col 39)",
        "(line 1334,col 9)-(line 1369,col 9)",
        "(line 1372,col 9)-(line 1372,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(double[], int, double[], int, double[], int)",
      "begin_line": 1386,
      "end_line": 1422,
      "comment": " Compute two arguments arc tangent of a derivative structure.\n     * @param y array holding the first operand\n     * @param yOffset offset of the first operand in its array\n     * @param x array holding the second operand\n     * @param xOffset offset of the second operand in its array\n     * @param result array where result must be stored (for\n     * two arguments arc tangent the result array \u003cem\u003ecannot\u003c/em\u003e\n     * be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1391,col 46)",
        "(line 1392,col 9)-(line 1392,col 50)",
        "(line 1393,col 9)-(line 1393,col 46)",
        "(line 1394,col 9)-(line 1394,col 50)",
        "(line 1395,col 9)-(line 1395,col 39)",
        "(line 1396,col 9)-(line 1396,col 35)",
        "(line 1398,col 9)-(line 1420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.cosh(double[], int, double[], int)",
      "begin_line": 1432,
      "end_line": 1448,
      "comment": " Compute hyperbolic cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 50)",
        "(line 1437,col 9)-(line 1437,col 60)",
        "(line 1438,col 9)-(line 1443,col 9)",
        "(line 1446,col 9)-(line 1446,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.sinh(double[], int, double[], int)",
      "begin_line": 1458,
      "end_line": 1474,
      "comment": " Compute hyperbolic sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 50)",
        "(line 1463,col 9)-(line 1463,col 60)",
        "(line 1464,col 9)-(line 1469,col 9)",
        "(line 1472,col 9)-(line 1472,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.tanh(double[], int, double[], int)",
      "begin_line": 1484,
      "end_line": 1529,
      "comment": " Compute hyperbolic tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1488,col 9)-(line 1488,col 56)",
        "(line 1489,col 9)-(line 1489,col 63)",
        "(line 1490,col 9)-(line 1490,col 24)",
        "(line 1492,col 9)-(line 1524,col 9)",
        "(line 1527,col 9)-(line 1527,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(double[], int, double[], int)",
      "begin_line": 1539,
      "end_line": 1586,
      "comment": " Compute inverse hyperbolic cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1543,col 50)",
        "(line 1544,col 9)-(line 1544,col 48)",
        "(line 1545,col 9)-(line 1545,col 40)",
        "(line 1546,col 9)-(line 1581,col 9)",
        "(line 1584,col 9)-(line 1584,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(double[], int, double[], int)",
      "begin_line": 1596,
      "end_line": 1643,
      "comment": " Compute inverse hyperbolic sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1600,col 9)-(line 1600,col 50)",
        "(line 1601,col 9)-(line 1601,col 48)",
        "(line 1602,col 9)-(line 1602,col 40)",
        "(line 1603,col 9)-(line 1638,col 9)",
        "(line 1641,col 9)-(line 1641,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(double[], int, double[], int)",
      "begin_line": 1653,
      "end_line": 1700,
      "comment": " Compute inverse hyperbolic tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1657,col 9)-(line 1657,col 50)",
        "(line 1658,col 9)-(line 1658,col 48)",
        "(line 1659,col 9)-(line 1659,col 40)",
        "(line 1660,col 9)-(line 1695,col 9)",
        "(line 1698,col 9)-(line 1698,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(double[], int, double[], double[], int)",
      "begin_line": 1712,
      "end_line": 1727,
      "comment": " Compute composition of a derivative structure by a function.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. at {@code operand[operandOffset]}).\n     * @param result array where result must be stored (for\n     * composition the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(double[], int, double...)",
      "begin_line": 1735,
      "end_line": 1748,
      "comment": " Evaluate Taylor expansion of a derivative structure.\n     * @param ds array holding the derivative structure\n     * @param dsOffset offset of the derivative structure in its array\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1736,col 25)",
        "(line 1737,col 9)-(line 1746,col 9)",
        "(line 1747,col 9)-(line 1747,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 1754,
      "end_line": 1762,
      "comment": " Check rules set compatibility.\n     * @param compiler other compiler to check against instance\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 1756,col 9)-(line 1758,col 9)",
        "(line 1759,col 9)-(line 1761,col 9)"
      ]
    }
  ]
}
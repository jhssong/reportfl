{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/analysis/differentiation/DSCompiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DSCompiler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 125,
      "end_line": 1762,
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
        "(line 163,col 9)-(line 163,col 73)",
        "(line 164,col 9)-(line 166,col 81)",
        "(line 167,col 9)-(line 169,col 75)",
        "(line 170,col 9)-(line 172,col 102)",
        "(line 173,col 9)-(line 176,col 77)"
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
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 233,
      "end_line": 249,
      "comment": " Compile the sizes array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @return sizes array\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 65)",
        "(line 237,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 258,
      "end_line": 293,
      "comment": " Compile the derivatives indirection array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return derivatives indirection array\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 70)",
        "(line 267,col 9)-(line 267,col 75)",
        "(line 268,col 9)-(line 268,col 82)",
        "(line 271,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 306,
      "end_line": 325,
      "comment": " Compile the lower derivatives indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all elements\n     * except derivatives for last derivation order.\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return lower derivatives indirection array\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 315,col 9)-(line 315,col 64)",
        "(line 316,col 9)-(line 316,col 69)",
        "(line 317,col 9)-(line 317,col 62)",
        "(line 318,col 9)-(line 318,col 88)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, int[])",
      "begin_line": 340,
      "end_line": 388,
      "comment": " Compile the multiplication indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all pairs of elements\n     * involved when computing a multiplication. This allows a straightforward\n     * loop-based multiplication (see {@link #multiply(double[], int, double[], int, double[], int)}).\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @param lowerIndirection lower derivatives indirection array\n     * @return multiplication indirection array\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 350,col 9)-(line 350,col 63)",
        "(line 351,col 9)-(line 351,col 68)",
        "(line 352,col 9)-(line 352,col 69)",
        "(line 354,col 9)-(line 354,col 86)",
        "(line 356,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, int[][], int[][])",
      "begin_line": 404,
      "end_line": 500,
      "comment": " Compile the function composition indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all sets of elements\n     * involved when computing a composition. This allows a straightforward\n     * loop-based composition (see {@link #compose(double[], int, double[], double[], int)}).\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @param sizes sizes array\n     * @param derivativesIndirection derivatives indirection array\n     * @return multiplication indirection array\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 63)",
        "(line 415,col 9)-(line 415,col 68)",
        "(line 416,col 9)-(line 416,col 69)",
        "(line 419,col 9)-(line 419,col 86)",
        "(line 425,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 498,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(int...)",
      "begin_line": 534,
      "end_line": 544,
      "comment": " Get the index of a partial derivative in the array.\n     * \u003cp\u003e\n     * If all orders are set to 0, then the 0\u003csup\u003eth\u003c/sup\u003e order derivative\n     * is returned, which is the value of the function.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe indices of derivatives are between 0 and {@link #getSize() getSize()} - 1.\n     * Their specific order is fixed for a given compiler, but otherwise not\n     * publicly specified. There are however some simple cases which have guaranteed\n     * indices:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003ethe index of 0\u003csup\u003eth\u003c/sup\u003e order derivative is always 0\u003c/li\u003e\n     *   \u003cli\u003eif there is only 1 {@link #getFreeParameters() free parameter}, then the\n     *   derivatives are sorted in increasing derivation order (i.e. f at index 0, df/dp\n     *   at index 1, d\u003csup\u003e2\u003c/sup\u003ef/dp\u003csup\u003e2\u003c/sup\u003e at index 2 ...\n     *   d\u003csup\u003ek\u003c/sup\u003ef/dp\u003csup\u003ek\u003c/sup\u003e at index k),\u003c/li\u003e\n     *   \u003cli\u003eif the {@link #getOrder() derivation order} is 1, then the derivatives\n     *   are sorted in incresing free parameter order (i.e. f at index 0, df/dx\u003csub\u003e1\u003c/sub\u003e\n     *   at index 1, df/dx\u003csub\u003e2\u003c/sub\u003e at index 2 ... df/dx\u003csub\u003ek\u003c/sub\u003e at index k),\u003c/li\u003e\n     *   \u003cli\u003eall other cases are not publicly specified\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * This method is the inverse of method {@link #getPartialDerivativeOrders(int)}\n     * \u003c/p\u003e\n     * @param orders derivation orders with respect to each parameter\n     * @return index of the partial derivative\n     * @exception DimensionMismatchException if the numbers of parameters does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     * @see #getPartialDerivativeOrders(int)\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 540,col 9)",
        "(line 542,col 9)-(line 542,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(int, int, int[][], int...)",
      "begin_line": 556,
      "end_line": 587,
      "comment": " Get the index of a partial derivative in an array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param sizes sizes array\n     * @param orders derivation orders with respect to each parameter\n     * (the lenght of this array must match the number of parameters)\n     * @return index of the partial derivative\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 26)",
        "(line 563,col 9)-(line 563,col 30)",
        "(line 564,col 9)-(line 564,col 26)",
        "(line 565,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 585,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(int, int, int[][], int, int, int[][])",
      "begin_line": 600,
      "end_line": 606,
      "comment": " Convert an index from one (parameters, order) structure to another.\n     * @param index index of a partial derivative in source derivative structure\n     * @param srcP number of free parameters in source derivative structure\n     * @param srcDerivativesIndirection derivatives indirection array for the source\n     * derivative structure\n     * @param destP number of free parameters in destination derivative structure\n     * @param destO derivation order in destination derivative structure\n     * @param destSizes sizes array for the destination derivative structure\n     * @return index of the partial derivative with the \u003cem\u003esame\u003c/em\u003e characteristics\n     * in destination derivative structure\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 38)",
        "(line 604,col 9)-(line 604,col 100)",
        "(line 605,col 9)-(line 605,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders(int)",
      "begin_line": 616,
      "end_line": 618,
      "comment": " Get the derivation orders for a specific index in the array.\n     * \u003cp\u003e\n     * This method is the inverse of {@link #getPartialDerivativeIndex(int...)}.\n     * \u003c/p\u003e\n     * @param index of the partial derivative\n     * @return orders derivation orders with respect to each parameter\n     * @see #getPartialDerivativeIndex(int...)\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getFreeParameters()",
      "begin_line": 623,
      "end_line": 625,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getOrder()",
      "begin_line": 630,
      "end_line": 632,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize()",
      "begin_line": 641,
      "end_line": 643,
      "comment": " Get the array size required for holding partial derivatives data.\n     * \u003cp\u003e\n     * This number includes the single 0 order derivative element, which is\n     * guaranteed to be stored in the first element of the array.\n     * \u003c/p\u003e\n     * @return array size required for holding partial derivatives data\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double[], int)",
      "begin_line": 657,
      "end_line": 664,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 663,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double, double[], int, double[], int)",
      "begin_line": 681,
      "end_line": 691,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param a3 third scale factor\n     * @param c3 third base (unscaled) component\n     * @param offset3 offset of third operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double, double[], int, double, double[], int, double[], int)",
      "begin_line": 711,
      "end_line": 723,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param a3 third scale factor\n     * @param c3 third base (unscaled) component\n     * @param offset3 offset of third operand in its array\n     * @param a4 fourth scale factor\n     * @param c4 fourth base (unscaled) component\n     * @param offset4 offset of fourth operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.add(double[], int, double[], int, double[], int)",
      "begin_line": 734,
      "end_line": 740,
      "comment": " Perform addition of two derivative structures.\n     * @param lhs array holding left hand side of addition\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of addition\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 739,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(double[], int, double[], int, double[], int)",
      "begin_line": 750,
      "end_line": 756,
      "comment": " Perform subtraction of two derivative structures.\n     * @param lhs array holding left hand side of subtraction\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of subtraction\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 755,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(double[], int, double[], int, double[], int)",
      "begin_line": 768,
      "end_line": 781,
      "comment": " Perform multiplication of two derivative structures.\n     * @param lhs array holding left hand side of multiplication\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of multiplication\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (for\n     * multiplication the result array \u003cem\u003ecannot\u003c/em\u003e be one of\n     * the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 780,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.divide(double[], int, double[], int, double[], int)",
      "begin_line": 793,
      "end_line": 799,
      "comment": " Perform division of two derivative structures.\n     * @param lhs array holding left hand side of division\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of division\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (for\n     * division the result array \u003cem\u003ecannot\u003c/em\u003e be one of\n     * the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 58)",
        "(line 797,col 9)-(line 797,col 47)",
        "(line 798,col 9)-(line 798,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.remainder(double[], int, double[], int, double[], int)",
      "begin_line": 810,
      "end_line": 826,
      "comment": " Perform remainder of two derivative structures.\n     * @param lhs array holding left hand side of remainder\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of remainder\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 59)",
        "(line 816,col 9)-(line 816,col 82)",
        "(line 819,col 9)-(line 819,col 35)",
        "(line 822,col 9)-(line 824,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, double, double[], int)",
      "begin_line": 837,
      "end_line": 858,
      "comment": " Compute power of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param p power to apply\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 50)",
        "(line 843,col 9)-(line 843,col 68)",
        "(line 844,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 25)",
        "(line 849,col 9)-(line 849,col 31)",
        "(line 850,col 9)-(line 853,col 9)",
        "(line 856,col 9)-(line 856,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, int, double[], int)",
      "begin_line": 869,
      "end_line": 911,
      "comment": " Compute integer power of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param n power to apply\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 877,col 9)",
        "(line 881,col 9)-(line 881,col 50)",
        "(line 883,col 9)-(line 900,col 9)",
        "(line 902,col 9)-(line 902,col 31)",
        "(line 903,col 9)-(line 906,col 9)",
        "(line 909,col 9)-(line 909,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, double[], int, double[], int)",
      "begin_line": 923,
      "end_line": 931,
      "comment": " Compute power of a derivative structure.\n     * @param x array holding the base\n     * @param xOffset offset of the base in its array\n     * @param y array holding the exponent\n     * @param yOffset offset of the exponent in its array\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 52)",
        "(line 927,col 9)-(line 927,col 33)",
        "(line 928,col 9)-(line 928,col 53)",
        "(line 929,col 9)-(line 929,col 48)",
        "(line 930,col 9)-(line 930,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(double[], int, int, double[], int)",
      "begin_line": 942,
      "end_line": 969,
      "comment": " Compute n\u003csup\u003eth\u003c/sup\u003e root of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param n order of the root\n     * @param result array where result must be stored (for\n     * n\u003csup\u003eth\u003c/sup\u003e root the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 50)",
        "(line 948,col 9)-(line 948,col 18)",
        "(line 949,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 43)",
        "(line 960,col 9)-(line 960,col 64)",
        "(line 961,col 9)-(line 964,col 9)",
        "(line 967,col 9)-(line 967,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.exp(double[], int, double[], int)",
      "begin_line": 979,
      "end_line": 989,
      "comment": " Compute exponential of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * exponential the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 50)",
        "(line 984,col 9)-(line 984,col 68)",
        "(line 987,col 9)-(line 987,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.expm1(double[], int, double[], int)",
      "begin_line": 999,
      "end_line": 1010,
      "comment": " Compute exp(x) - 1 of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * exponential the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 50)",
        "(line 1004,col 9)-(line 1004,col 61)",
        "(line 1005,col 9)-(line 1005,col 82)",
        "(line 1008,col 9)-(line 1008,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log(double[], int, double[], int)",
      "begin_line": 1020,
      "end_line": 1038,
      "comment": " Compute natural logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 50)",
        "(line 1025,col 9)-(line 1025,col 59)",
        "(line 1026,col 9)-(line 1033,col 9)",
        "(line 1036,col 9)-(line 1036,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log1p(double[], int, double[], int)",
      "begin_line": 1047,
      "end_line": 1065,
      "comment": " Computes shifted logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * shifted logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 50)",
        "(line 1052,col 9)-(line 1052,col 61)",
        "(line 1053,col 9)-(line 1060,col 9)",
        "(line 1063,col 9)-(line 1063,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log10(double[], int, double[], int)",
      "begin_line": 1074,
      "end_line": 1092,
      "comment": " Computes base 10 logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * base 10 logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 50)",
        "(line 1079,col 9)-(line 1079,col 61)",
        "(line 1080,col 9)-(line 1087,col 9)",
        "(line 1090,col 9)-(line 1090,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(double[], int, double[], int)",
      "begin_line": 1102,
      "end_line": 1118,
      "comment": " Compute cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 50)",
        "(line 1107,col 9)-(line 1107,col 59)",
        "(line 1108,col 9)-(line 1113,col 9)",
        "(line 1116,col 9)-(line 1116,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(double[], int, double[], int)",
      "begin_line": 1128,
      "end_line": 1144,
      "comment": " Compute sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1132,col 50)",
        "(line 1133,col 9)-(line 1133,col 59)",
        "(line 1134,col 9)-(line 1139,col 9)",
        "(line 1142,col 9)-(line 1142,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(double[], int, double[], int)",
      "begin_line": 1154,
      "end_line": 1199,
      "comment": " Compute tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 56)",
        "(line 1159,col 9)-(line 1159,col 62)",
        "(line 1160,col 9)-(line 1160,col 24)",
        "(line 1162,col 9)-(line 1194,col 9)",
        "(line 1197,col 9)-(line 1197,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.acos(double[], int, double[], int)",
      "begin_line": 1209,
      "end_line": 1256,
      "comment": " Compute arc cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 50)",
        "(line 1214,col 9)-(line 1214,col 48)",
        "(line 1215,col 9)-(line 1215,col 39)",
        "(line 1216,col 9)-(line 1251,col 9)",
        "(line 1254,col 9)-(line 1254,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.asin(double[], int, double[], int)",
      "begin_line": 1266,
      "end_line": 1313,
      "comment": " Compute arc sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 50)",
        "(line 1271,col 9)-(line 1271,col 48)",
        "(line 1272,col 9)-(line 1272,col 39)",
        "(line 1273,col 9)-(line 1308,col 9)",
        "(line 1311,col 9)-(line 1311,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atan(double[], int, double[], int)",
      "begin_line": 1323,
      "end_line": 1370,
      "comment": " Compute arc tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 50)",
        "(line 1328,col 9)-(line 1328,col 48)",
        "(line 1329,col 9)-(line 1329,col 39)",
        "(line 1330,col 9)-(line 1365,col 9)",
        "(line 1368,col 9)-(line 1368,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(double[], int, double[], int, double[], int)",
      "begin_line": 1382,
      "end_line": 1420,
      "comment": " Compute two arguments arc tangent of a derivative structure.\n     * @param y array holding the first operand\n     * @param yOffset offset of the first operand in its array\n     * @param x array holding the second operand\n     * @param xOffset offset of the second operand in its array\n     * @param result array where result must be stored (for\n     * two arguments arc tangent the result array \u003cem\u003ecannot\u003c/em\u003e\n     * be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 46)",
        "(line 1388,col 9)-(line 1388,col 50)",
        "(line 1389,col 9)-(line 1389,col 46)",
        "(line 1390,col 9)-(line 1390,col 50)",
        "(line 1391,col 9)-(line 1391,col 39)",
        "(line 1392,col 9)-(line 1392,col 35)",
        "(line 1394,col 9)-(line 1416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.cosh(double[], int, double[], int)",
      "begin_line": 1430,
      "end_line": 1446,
      "comment": " Compute hyperbolic cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 50)",
        "(line 1435,col 9)-(line 1435,col 60)",
        "(line 1436,col 9)-(line 1441,col 9)",
        "(line 1444,col 9)-(line 1444,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.sinh(double[], int, double[], int)",
      "begin_line": 1456,
      "end_line": 1472,
      "comment": " Compute hyperbolic sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1460,col 9)-(line 1460,col 50)",
        "(line 1461,col 9)-(line 1461,col 60)",
        "(line 1462,col 9)-(line 1467,col 9)",
        "(line 1470,col 9)-(line 1470,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.tanh(double[], int, double[], int)",
      "begin_line": 1482,
      "end_line": 1527,
      "comment": " Compute hyperbolic tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1486,col 56)",
        "(line 1487,col 9)-(line 1487,col 63)",
        "(line 1488,col 9)-(line 1488,col 24)",
        "(line 1490,col 9)-(line 1522,col 9)",
        "(line 1525,col 9)-(line 1525,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(double[], int, double[], int)",
      "begin_line": 1537,
      "end_line": 1584,
      "comment": " Compute inverse hyperbolic cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1541,col 50)",
        "(line 1542,col 9)-(line 1542,col 48)",
        "(line 1543,col 9)-(line 1543,col 40)",
        "(line 1544,col 9)-(line 1579,col 9)",
        "(line 1582,col 9)-(line 1582,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(double[], int, double[], int)",
      "begin_line": 1594,
      "end_line": 1641,
      "comment": " Compute inverse hyperbolic sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1598,col 9)-(line 1598,col 50)",
        "(line 1599,col 9)-(line 1599,col 48)",
        "(line 1600,col 9)-(line 1600,col 40)",
        "(line 1601,col 9)-(line 1636,col 9)",
        "(line 1639,col 9)-(line 1639,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(double[], int, double[], int)",
      "begin_line": 1651,
      "end_line": 1698,
      "comment": " Compute inverse hyperbolic tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1655,col 50)",
        "(line 1656,col 9)-(line 1656,col 48)",
        "(line 1657,col 9)-(line 1657,col 40)",
        "(line 1658,col 9)-(line 1693,col 9)",
        "(line 1696,col 9)-(line 1696,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(double[], int, double[], double[], int)",
      "begin_line": 1710,
      "end_line": 1725,
      "comment": " Compute composition of a derivative structure by a function.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. at {@code operand[operandOffset]}).\n     * @param result array where result must be stored (for\n     * composition the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1712,col 9)-(line 1724,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(double[], int, double...)",
      "begin_line": 1733,
      "end_line": 1746,
      "comment": " Evaluate Taylor expansion of a derivative structure.\n     * @param ds array holding the derivative structure\n     * @param dsOffset offset of the derivative structure in its array\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     ",
      "child_ranges": [
        "(line 1734,col 9)-(line 1734,col 25)",
        "(line 1735,col 9)-(line 1744,col 9)",
        "(line 1745,col 9)-(line 1745,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 1752,
      "end_line": 1760,
      "comment": " Check rules set compatibility.\n     * @param compiler other compiler to check against instance\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1756,col 9)",
        "(line 1757,col 9)-(line 1759,col 9)"
      ]
    }
  ]
}
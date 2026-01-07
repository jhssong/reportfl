{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/differentiation/DSCompiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DSCompiler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 128,
      "end_line": 1781,
      "comment": " Class holding \"compiled\" computation rules for derivative structures.\n * \u003cp\u003eThis class implements the computation rules described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www.math.american.edu/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002. However, in order to avoid performances bottlenecks, the recursive\n * rules are \"compiled\" once in an unfold form. This class does this recursion unrolling\n * and stores the computation rules as simple loops with pre-computed indirection arrays.\u003c/p\u003e\n * \u003cp\u003e\n * This class maps all derivative computation into single dimension arrays that hold the\n * value and partial derivatives. The class does not hold these arrays, which remains under\n * the responsibility of the caller. For each combination of number of free parameters and\n * derivation order, only one compiler is necessary, and this compiler will be used to\n * perform computations on all arrays provided to it, which can represent hundreds or\n * thousands of different parameters kept together with all theur partial derivatives.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The arrays on which compilers operate contain only the partial derivatives together\n * with the 0\u003csup\u003eth\u003c/sup\u003e derivative, i.e. the value. The partial derivatives are stored in\n * a compiler-specific order, which can be retrieved using methods {@link\n * #getPartialDerivativeIndex(int...) getPartialDerivativeIndex} and {@link\n * #getPartialDerivativeOrders(int)}. The value is guaranteed to be stored as the first element\n * (i.e. the {@link #getPartialDerivativeIndex(int...) getPartialDerivativeIndex} method returns\n * 0 when called with 0 for all derivation orders and {@link #getPartialDerivativeOrders(int)\n * getPartialDerivativeOrders} returns an array filled with 0 when called with 0 as the index).\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note that the ordering changes with number of parameters and derivation order. For example\n * given 2 parameters x and y, df/dy is stored at index 2 when derivation order is set to 1 (in\n * this case the array has three elements: f, df/dx and df/dy). If derivation order is set to\n * 2, then df/dy will be stored at index 3 (in this case the array has six elements: f, df/dx,\n * df/dxdx, df/dy, df/dxdy and df/dydy).\n * \u003c/p\u003e\n * \u003cp\u003e\n * Given this structure, users can perform some simple operations like adding, subtracting\n * or multiplying constants and negating the elements by themselves, knowing if they want to\n * mutate their array or create a new array. These simple operations are not provided by\n * the compiler. The compiler provides only the more complex operations between several arrays.\n * \u003c/p\u003e\n * \u003cp\u003eThis class is mainly used as the engine for scalar variable {@link DerivativeStructure}.\n * It can also be used directly to hold several variables in arrays for more complex data\n * structures. User can for example store a vector of n variables depending on three x, y\n * and z free parameters in one array as follows:\n * \u003cpre\u003e\n *   // parameter 0 is x, parameter 1 is y, parameter 2 is z\n *   int parameters \u003d 3;\n *   DSCompiler compiler \u003d DSCompiler.getCompiler(parameters, order);\n *   int size \u003d compiler.getSize();\n *\n *   // pack all elements in a single array\n *   double[] array \u003d new double[n * size];\n *   for (int i \u003d 0; i \u003c n; ++i) {\n *\n *     // we know value is guaranteed to be the first element\n *     array[i * size] \u003d v[i];\n *\n *     // we don\u0027t know where first derivatives are stored, so we ask the compiler\n *     array[i * size + compiler.getPartialDerivativeIndex(1, 0, 0) \u003d dvOnDx[i][0];\n *     array[i * size + compiler.getPartialDerivativeIndex(0, 1, 0) \u003d dvOnDy[i][0];\n *     array[i * size + compiler.getPartialDerivativeIndex(0, 0, 1) \u003d dvOnDz[i][0];\n *\n *     // we let all higher order derivatives set to 0\n *\n *   }\n * \u003c/pre\u003e\n * Then in another function, user can perform some operations on all elements stored\n * in the single array, such as a simple product of all variables:\n * \u003cpre\u003e\n *   // compute the product of all elements\n *   double[] product \u003d new double[size];\n *   prod[0] \u003d 1.0;\n *   for (int i \u003d 0; i \u003c n; ++i) {\n *     double[] tmp \u003d product.clone();\n *     compiler.multiply(tmp, 0, array, i * size, product, 0);\n *   }\n *\n *   // value\n *   double p \u003d product[0];\n *\n *   // first derivatives\n *   double dPdX \u003d product[compiler.getPartialDerivativeIndex(1, 0, 0)];\n *   double dPdY \u003d product[compiler.getPartialDerivativeIndex(0, 1, 0)];\n *   double dPdZ \u003d product[compiler.getPartialDerivativeIndex(0, 0, 1)];\n *\n *   // cross derivatives (assuming order was at least 2)\n *   double dPdXdX \u003d product[compiler.getPartialDerivativeIndex(2, 0, 0)];\n *   double dPdXdY \u003d product[compiler.getPartialDerivativeIndex(1, 1, 0)];\n *   double dPdXdZ \u003d product[compiler.getPartialDerivativeIndex(1, 0, 1)];\n *   double dPdYdY \u003d product[compiler.getPartialDerivativeIndex(0, 2, 0)];\n *   double dPdYdZ \u003d product[compiler.getPartialDerivativeIndex(0, 1, 1)];\n *   double dPdZdZ \u003d product[compiler.getPartialDerivativeIndex(0, 0, 2)];\n * \u003c/p\u003e\n * @see DerivativeStructure\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "compilers"
      ],
      "begin_line": 131,
      "end_line": 132,
      "comment": " Array of all compilers created so far. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Number of free parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Derivation order. "
    },
    {
      "type": "field",
      "varNames": [
        "sizes"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " Number of partial derivatives (including the single 0 order derivative element). "
    },
    {
      "type": "field",
      "varNames": [
        "derivativesIndirection"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Indirection array for partial derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerIndirection"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Indirection array of the lower derivative elements. "
    },
    {
      "type": "field",
      "varNames": [
        "multIndirection"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Indirection arrays for multiplication. "
    },
    {
      "type": "field",
      "varNames": [
        "compIndirection"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Indirection arrays for function composition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.DSCompiler(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 162,
      "end_line": 183,
      "comment": " Private constructor, reserved for the factory method {@link #getCompiler(int, int)}.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @throws NumberIsTooLargeException if order is too large\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 32)",
        "(line 168,col 9)-(line 168,col 73)",
        "(line 169,col 9)-(line 171,col 81)",
        "(line 172,col 9)-(line 174,col 75)",
        "(line 175,col 9)-(line 177,col 102)",
        "(line 178,col 9)-(line 181,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(int, int)",
      "begin_line": 191,
      "end_line": 231,
      "comment": " Get the compiler for number of free parameters and order.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @return cached rules set\n     * @throws NumberIsTooLargeException if order is too large\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 203,col 93)",
        "(line 204,col 9)-(line 204,col 95)",
        "(line 205,col 9)-(line 205,col 88)",
        "(line 207,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 49)",
        "(line 229,col 9)-(line 229,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 239,
      "end_line": 255,
      "comment": " Compile the sizes array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @return sizes array\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 65)",
        "(line 243,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 264,
      "end_line": 299,
      "comment": " Compile the derivatives indirection array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return derivatives indirection array\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 70)",
        "(line 273,col 9)-(line 273,col 75)",
        "(line 274,col 9)-(line 274,col 82)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 285,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 312,
      "end_line": 331,
      "comment": " Compile the lower derivatives indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all elements\n     * except derivatives for last derivation order.\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @return lower derivatives indirection array\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 321,col 9)-(line 321,col 64)",
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 323,col 62)",
        "(line 324,col 9)-(line 324,col 88)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, int[])",
      "begin_line": 346,
      "end_line": 394,
      "comment": " Compile the multiplication indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all pairs of elements\n     * involved when computing a multiplication. This allows a straightforward\n     * loop-based multiplication (see {@link #multiply(double[], int, double[], int, double[], int)}).\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @param lowerIndirection lower derivatives indirection array\n     * @return multiplication indirection array\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 356,col 9)-(line 356,col 63)",
        "(line 357,col 9)-(line 357,col 68)",
        "(line 358,col 9)-(line 358,col 69)",
        "(line 360,col 9)-(line 360,col 86)",
        "(line 362,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, int[][], int[][])",
      "begin_line": 411,
      "end_line": 508,
      "comment": " Compile the function composition indirection array.\n     * \u003cp\u003e\n     * This indirection array contains the indices of all sets of elements\n     * involved when computing a composition. This allows a straightforward\n     * loop-based composition (see {@link #compose(double[], int, double[], double[], int)}).\n     * \u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param valueCompiler compiler for the value part\n     * @param derivativeCompiler compiler for the derivative part\n     * @param sizes sizes array\n     * @param derivativesIndirection derivatives indirection array\n     * @return multiplication indirection array\n     * @throws NumberIsTooLargeException if order is too large\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 422,col 63)",
        "(line 423,col 9)-(line 423,col 68)",
        "(line 424,col 9)-(line 424,col 69)",
        "(line 427,col 9)-(line 427,col 86)",
        "(line 433,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 506,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(int...)",
      "begin_line": 542,
      "end_line": 552,
      "comment": " Get the index of a partial derivative in the array.\n     * \u003cp\u003e\n     * If all orders are set to 0, then the 0\u003csup\u003eth\u003c/sup\u003e order derivative\n     * is returned, which is the value of the function.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe indices of derivatives are between 0 and {@link #getSize() getSize()} - 1.\n     * Their specific order is fixed for a given compiler, but otherwise not\n     * publicly specified. There are however some simple cases which have guaranteed\n     * indices:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003ethe index of 0\u003csup\u003eth\u003c/sup\u003e order derivative is always 0\u003c/li\u003e\n     *   \u003cli\u003eif there is only 1 {@link #getFreeParameters() free parameter}, then the\n     *   derivatives are sorted in increasing derivation order (i.e. f at index 0, df/dp\n     *   at index 1, d\u003csup\u003e2\u003c/sup\u003ef/dp\u003csup\u003e2\u003c/sup\u003e at index 2 ...\n     *   d\u003csup\u003ek\u003c/sup\u003ef/dp\u003csup\u003ek\u003c/sup\u003e at index k),\u003c/li\u003e\n     *   \u003cli\u003eif the {@link #getOrder() derivation order} is 1, then the derivatives\n     *   are sorted in increasing free parameter order (i.e. f at index 0, df/dx\u003csub\u003e1\u003c/sub\u003e\n     *   at index 1, df/dx\u003csub\u003e2\u003c/sub\u003e at index 2 ... df/dx\u003csub\u003ek\u003c/sub\u003e at index k),\u003c/li\u003e\n     *   \u003cli\u003eall other cases are not publicly specified\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * This method is the inverse of method {@link #getPartialDerivativeOrders(int)}\n     * \u003c/p\u003e\n     * @param orders derivation orders with respect to each parameter\n     * @return index of the partial derivative\n     * @exception DimensionMismatchException if the numbers of parameters does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     * @see #getPartialDerivativeOrders(int)\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 550,col 9)-(line 550,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(int, int, int[][], int...)",
      "begin_line": 564,
      "end_line": 595,
      "comment": " Get the index of a partial derivative in an array.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param sizes sizes array\n     * @param orders derivation orders with respect to each parameter\n     * (the lenght of this array must match the number of parameters)\n     * @return index of the partial derivative\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 26)",
        "(line 571,col 9)-(line 571,col 30)",
        "(line 572,col 9)-(line 572,col 26)",
        "(line 573,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(int, int, int[][], int, int, int[][])",
      "begin_line": 609,
      "end_line": 616,
      "comment": " Convert an index from one (parameters, order) structure to another.\n     * @param index index of a partial derivative in source derivative structure\n     * @param srcP number of free parameters in source derivative structure\n     * @param srcDerivativesIndirection derivatives indirection array for the source\n     * derivative structure\n     * @param destP number of free parameters in destination derivative structure\n     * @param destO derivation order in destination derivative structure\n     * @param destSizes sizes array for the destination derivative structure\n     * @return index of the partial derivative with the \u003cem\u003esame\u003c/em\u003e characteristics\n     * in destination derivative structure\n     * @throws NumberIsTooLargeException if order is too large\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 38)",
        "(line 614,col 9)-(line 614,col 100)",
        "(line 615,col 9)-(line 615,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders(int)",
      "begin_line": 626,
      "end_line": 628,
      "comment": " Get the derivation orders for a specific index in the array.\n     * \u003cp\u003e\n     * This method is the inverse of {@link #getPartialDerivativeIndex(int...)}.\n     * \u003c/p\u003e\n     * @param index of the partial derivative\n     * @return orders derivation orders with respect to each parameter\n     * @see #getPartialDerivativeIndex(int...)\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getFreeParameters()",
      "begin_line": 633,
      "end_line": 635,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getOrder()",
      "begin_line": 640,
      "end_line": 642,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize()",
      "begin_line": 651,
      "end_line": 653,
      "comment": " Get the array size required for holding partial derivatives data.\n     * \u003cp\u003e\n     * This number includes the single 0 order derivative element, which is\n     * guaranteed to be stored in the first element of the array.\n     * \u003c/p\u003e\n     * @return array size required for holding partial derivatives data\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double[], int)",
      "begin_line": 667,
      "end_line": 674,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 673,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double, double[], int, double[], int)",
      "begin_line": 691,
      "end_line": 701,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param a3 third scale factor\n     * @param c3 third base (unscaled) component\n     * @param offset3 offset of third operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(double, double[], int, double, double[], int, double, double[], int, double, double[], int, double[], int)",
      "begin_line": 721,
      "end_line": 733,
      "comment": " Compute linear combination.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param c1 first base (unscaled) component\n     * @param offset1 offset of first operand in its array\n     * @param a2 second scale factor\n     * @param c2 second base (unscaled) component\n     * @param offset2 offset of second operand in its array\n     * @param a3 third scale factor\n     * @param c3 third base (unscaled) component\n     * @param offset3 offset of third operand in its array\n     * @param a4 fourth scale factor\n     * @param c4 fourth base (unscaled) component\n     * @param offset4 offset of fourth operand in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.add(double[], int, double[], int, double[], int)",
      "begin_line": 744,
      "end_line": 750,
      "comment": " Perform addition of two derivative structures.\n     * @param lhs array holding left hand side of addition\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of addition\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 749,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(double[], int, double[], int, double[], int)",
      "begin_line": 760,
      "end_line": 766,
      "comment": " Perform subtraction of two derivative structures.\n     * @param lhs array holding left hand side of subtraction\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of subtraction\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(double[], int, double[], int, double[], int)",
      "begin_line": 778,
      "end_line": 791,
      "comment": " Perform multiplication of two derivative structures.\n     * @param lhs array holding left hand side of multiplication\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of multiplication\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (for\n     * multiplication the result array \u003cem\u003ecannot\u003c/em\u003e be one of\n     * the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.divide(double[], int, double[], int, double[], int)",
      "begin_line": 803,
      "end_line": 809,
      "comment": " Perform division of two derivative structures.\n     * @param lhs array holding left hand side of division\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of division\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (for\n     * division the result array \u003cem\u003ecannot\u003c/em\u003e be one of\n     * the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 58)",
        "(line 807,col 9)-(line 807,col 47)",
        "(line 808,col 9)-(line 808,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.remainder(double[], int, double[], int, double[], int)",
      "begin_line": 820,
      "end_line": 836,
      "comment": " Perform remainder of two derivative structures.\n     * @param lhs array holding left hand side of remainder\n     * @param lhsOffset offset of the left hand side in its array\n     * @param rhs array right hand side of remainder\n     * @param rhsOffset offset of the right hand side in its array\n     * @param result array where result must be stored (it may be\n     * one of the input arrays)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 82)",
        "(line 826,col 9)-(line 826,col 82)",
        "(line 829,col 9)-(line 829,col 35)",
        "(line 832,col 9)-(line 834,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, double, double[], int)",
      "begin_line": 847,
      "end_line": 868,
      "comment": " Compute power of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param p power to apply\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 50)",
        "(line 853,col 9)-(line 853,col 68)",
        "(line 854,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 25)",
        "(line 859,col 9)-(line 859,col 31)",
        "(line 860,col 9)-(line 863,col 9)",
        "(line 866,col 9)-(line 866,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, int, double[], int)",
      "begin_line": 879,
      "end_line": 921,
      "comment": " Compute integer power of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param n power to apply\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 887,col 9)",
        "(line 891,col 9)-(line 891,col 50)",
        "(line 893,col 9)-(line 910,col 9)",
        "(line 912,col 9)-(line 912,col 31)",
        "(line 913,col 9)-(line 916,col 9)",
        "(line 919,col 9)-(line 919,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(double[], int, double[], int, double[], int)",
      "begin_line": 933,
      "end_line": 941,
      "comment": " Compute power of a derivative structure.\n     * @param x array holding the base\n     * @param xOffset offset of the base in its array\n     * @param y array holding the exponent\n     * @param yOffset offset of the exponent in its array\n     * @param result array where result must be stored (for\n     * power the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 52)",
        "(line 937,col 9)-(line 937,col 33)",
        "(line 938,col 9)-(line 938,col 53)",
        "(line 939,col 9)-(line 939,col 48)",
        "(line 940,col 9)-(line 940,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(double[], int, int, double[], int)",
      "begin_line": 952,
      "end_line": 979,
      "comment": " Compute n\u003csup\u003eth\u003c/sup\u003e root of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param n order of the root\n     * @param result array where result must be stored (for\n     * n\u003csup\u003eth\u003c/sup\u003e root the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 50)",
        "(line 958,col 9)-(line 958,col 18)",
        "(line 959,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 43)",
        "(line 970,col 9)-(line 970,col 64)",
        "(line 971,col 9)-(line 974,col 9)",
        "(line 977,col 9)-(line 977,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.exp(double[], int, double[], int)",
      "begin_line": 989,
      "end_line": 999,
      "comment": " Compute exponential of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * exponential the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 50)",
        "(line 994,col 9)-(line 994,col 68)",
        "(line 997,col 9)-(line 997,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.expm1(double[], int, double[], int)",
      "begin_line": 1009,
      "end_line": 1020,
      "comment": " Compute exp(x) - 1 of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * exponential the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 50)",
        "(line 1014,col 9)-(line 1014,col 61)",
        "(line 1015,col 9)-(line 1015,col 82)",
        "(line 1018,col 9)-(line 1018,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log(double[], int, double[], int)",
      "begin_line": 1030,
      "end_line": 1048,
      "comment": " Compute natural logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 50)",
        "(line 1035,col 9)-(line 1035,col 59)",
        "(line 1036,col 9)-(line 1043,col 9)",
        "(line 1046,col 9)-(line 1046,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log1p(double[], int, double[], int)",
      "begin_line": 1057,
      "end_line": 1075,
      "comment": " Computes shifted logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * shifted logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 50)",
        "(line 1062,col 9)-(line 1062,col 61)",
        "(line 1063,col 9)-(line 1070,col 9)",
        "(line 1073,col 9)-(line 1073,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.log10(double[], int, double[], int)",
      "begin_line": 1084,
      "end_line": 1102,
      "comment": " Computes base 10 logarithm of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * base 10 logarithm the result array \u003cem\u003ecannot\u003c/em\u003e be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 50)",
        "(line 1089,col 9)-(line 1089,col 61)",
        "(line 1090,col 9)-(line 1097,col 9)",
        "(line 1100,col 9)-(line 1100,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(double[], int, double[], int)",
      "begin_line": 1112,
      "end_line": 1128,
      "comment": " Compute cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1116,col 9)-(line 1116,col 50)",
        "(line 1117,col 9)-(line 1117,col 59)",
        "(line 1118,col 9)-(line 1123,col 9)",
        "(line 1126,col 9)-(line 1126,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(double[], int, double[], int)",
      "begin_line": 1138,
      "end_line": 1154,
      "comment": " Compute sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 50)",
        "(line 1143,col 9)-(line 1143,col 59)",
        "(line 1144,col 9)-(line 1149,col 9)",
        "(line 1152,col 9)-(line 1152,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(double[], int, double[], int)",
      "begin_line": 1164,
      "end_line": 1209,
      "comment": " Compute tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 56)",
        "(line 1169,col 9)-(line 1169,col 62)",
        "(line 1170,col 9)-(line 1170,col 24)",
        "(line 1172,col 9)-(line 1204,col 9)",
        "(line 1207,col 9)-(line 1207,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.acos(double[], int, double[], int)",
      "begin_line": 1219,
      "end_line": 1266,
      "comment": " Compute arc cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 50)",
        "(line 1224,col 9)-(line 1224,col 48)",
        "(line 1225,col 9)-(line 1225,col 39)",
        "(line 1226,col 9)-(line 1261,col 9)",
        "(line 1264,col 9)-(line 1264,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.asin(double[], int, double[], int)",
      "begin_line": 1276,
      "end_line": 1323,
      "comment": " Compute arc sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 50)",
        "(line 1281,col 9)-(line 1281,col 48)",
        "(line 1282,col 9)-(line 1282,col 39)",
        "(line 1283,col 9)-(line 1318,col 9)",
        "(line 1321,col 9)-(line 1321,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atan(double[], int, double[], int)",
      "begin_line": 1333,
      "end_line": 1380,
      "comment": " Compute arc tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * arc tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1337,col 50)",
        "(line 1338,col 9)-(line 1338,col 48)",
        "(line 1339,col 9)-(line 1339,col 39)",
        "(line 1340,col 9)-(line 1375,col 9)",
        "(line 1378,col 9)-(line 1378,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(double[], int, double[], int, double[], int)",
      "begin_line": 1392,
      "end_line": 1431,
      "comment": " Compute two arguments arc tangent of a derivative structure.\n     * @param y array holding the first operand\n     * @param yOffset offset of the first operand in its array\n     * @param x array holding the second operand\n     * @param xOffset offset of the second operand in its array\n     * @param result array where result must be stored (for\n     * two arguments arc tangent the result array \u003cem\u003ecannot\u003c/em\u003e\n     * be the input array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1397,col 46)",
        "(line 1398,col 9)-(line 1398,col 50)",
        "(line 1399,col 9)-(line 1399,col 46)",
        "(line 1400,col 9)-(line 1400,col 50)",
        "(line 1401,col 9)-(line 1401,col 39)",
        "(line 1402,col 9)-(line 1402,col 35)",
        "(line 1404,col 9)-(line 1426,col 9)",
        "(line 1429,col 9)-(line 1429,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.cosh(double[], int, double[], int)",
      "begin_line": 1441,
      "end_line": 1457,
      "comment": " Compute hyperbolic cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1445,col 50)",
        "(line 1446,col 9)-(line 1446,col 60)",
        "(line 1447,col 9)-(line 1452,col 9)",
        "(line 1455,col 9)-(line 1455,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.sinh(double[], int, double[], int)",
      "begin_line": 1467,
      "end_line": 1483,
      "comment": " Compute hyperbolic sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 50)",
        "(line 1472,col 9)-(line 1472,col 60)",
        "(line 1473,col 9)-(line 1478,col 9)",
        "(line 1481,col 9)-(line 1481,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.tanh(double[], int, double[], int)",
      "begin_line": 1493,
      "end_line": 1538,
      "comment": " Compute hyperbolic tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * hyperbolic tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1497,col 9)-(line 1497,col 56)",
        "(line 1498,col 9)-(line 1498,col 63)",
        "(line 1499,col 9)-(line 1499,col 24)",
        "(line 1501,col 9)-(line 1533,col 9)",
        "(line 1536,col 9)-(line 1536,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(double[], int, double[], int)",
      "begin_line": 1548,
      "end_line": 1595,
      "comment": " Compute inverse hyperbolic cosine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic cosine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 50)",
        "(line 1553,col 9)-(line 1553,col 48)",
        "(line 1554,col 9)-(line 1554,col 40)",
        "(line 1555,col 9)-(line 1590,col 9)",
        "(line 1593,col 9)-(line 1593,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(double[], int, double[], int)",
      "begin_line": 1605,
      "end_line": 1652,
      "comment": " Compute inverse hyperbolic sine of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic sine the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 50)",
        "(line 1610,col 9)-(line 1610,col 48)",
        "(line 1611,col 9)-(line 1611,col 40)",
        "(line 1612,col 9)-(line 1647,col 9)",
        "(line 1650,col 9)-(line 1650,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(double[], int, double[], int)",
      "begin_line": 1662,
      "end_line": 1709,
      "comment": " Compute inverse hyperbolic tangent of a derivative structure.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param result array where result must be stored (for\n     * inverse hyperbolic tangent the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 50)",
        "(line 1667,col 9)-(line 1667,col 48)",
        "(line 1668,col 9)-(line 1668,col 40)",
        "(line 1669,col 9)-(line 1704,col 9)",
        "(line 1707,col 9)-(line 1707,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(double[], int, double[], double[], int)",
      "begin_line": 1721,
      "end_line": 1736,
      "comment": " Compute composition of a derivative structure by a function.\n     * @param operand array holding the operand\n     * @param operandOffset offset of the operand in its array\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. at {@code operand[operandOffset]}).\n     * @param result array where result must be stored (for\n     * composition the result array \u003cem\u003ecannot\u003c/em\u003e be the input\n     * array)\n     * @param resultOffset offset of the result in its array\n     ",
      "child_ranges": [
        "(line 1723,col 9)-(line 1735,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(double[], int, double...)",
      "begin_line": 1745,
      "end_line": 1765,
      "comment": " Evaluate Taylor expansion of a derivative structure.\n     * @param ds array holding the derivative structure\n     * @param dsOffset offset of the derivative structure in its array\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     * @throws MathArithmeticException if factorials becomes too large\n     ",
      "child_ranges": [
        "(line 1747,col 9)-(line 1747,col 25)",
        "(line 1748,col 9)-(line 1763,col 9)",
        "(line 1764,col 9)-(line 1764,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DSCompiler.checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 1771,
      "end_line": 1779,
      "comment": " Check rules set compatibility.\n     * @param compiler other compiler to check against instance\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 1773,col 9)-(line 1775,col 9)",
        "(line 1776,col 9)-(line 1778,col 9)"
      ]
    }
  ]
}
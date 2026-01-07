{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 1512,
      "comment": "\n * Class defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., {@code getEntry(0)}\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@code code map} and {@code mapToSelf} methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The {@code map}\n * versions create a new vector to hold the result and do not change the instance.\n * The {@code mapToSelf} version uses the instance itself to store the\n * results, so the instance is changed by this method. In all cases, the result\n * vector is returned by the methods, allowing the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.4).mapToSelf(new Tan()).mapToSelf(new Power(2.3));\n * \u003c/pre\u003e\n *\n * @version $Id$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDimension()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns the size of the vector.\n     *\n     * @return the size of this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getEntry(int)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Return the entry at the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.setEntry(int, double)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Set a single element.\n     *\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.addToEntry(int, double)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Change an entry at the specified index.\n     *\n     * @param index Index location of entry to be set.\n     * @param increment Value to add to the vector entry.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the index is not valid.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Construct a new vector by appending a vector to this vector.\n     *\n     * @param v vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.append(double)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Construct a new vector by appending a double to this vector.\n     *\n     * @param d double to append.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getSubVector(int, int)",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Get a subvector from consecutive elements.\n     *\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     * @throws org.apache.commons.math3.exception.NotPositiveException\n     * if the number of elements is not positive\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Set a sequence of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.isNaN()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Check whether any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.isInfinite()",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkVectorDimensions(int)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 31)",
        "(line 177,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkIndex(int)",
      "begin_line": 188,
      "end_line": 194,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkIndices(int, int)",
      "begin_line": 204,
      "end_line": 219,
      "comment": "\n     * Checks that the indices of a subvector are valid.\n     *\n     * @param start the index of the first entry of the subvector\n     * @param end the index of the last entry of the subvector (inclusive)\n     * @throws OutOfRangeException if {@code start} of {@code end} are not valid\n     * @throws NumberIsTooSmallException if {@code end \u003c start}\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 39)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 230,
      "end_line": 240,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 33)",
        "(line 232,col 9)-(line 232,col 37)",
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 251,
      "end_line": 261,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 33)",
        "(line 253,col 9)-(line 253,col 47)",
        "(line 254,col 9)-(line 254,col 46)",
        "(line 255,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAdd(double)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 281,
      "end_line": 286,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.copy()",
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 303,
      "end_line": 311,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 33)",
        "(line 305,col 9)-(line 305,col 21)",
        "(line 306,col 9)-(line 306,col 37)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 324,
      "end_line": 333,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     * @throws MathArithmeticException if {@code this} or {@code v} is the null\n     * vector\n     * @throws DimensionMismatchException if the dimensions of {@code this} and\n     * {@code v} do not match\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 38)",
        "(line 326,col 9)-(line 326,col 41)",
        "(line 328,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 352,
      "end_line": 353,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @deprecated As of version 3.1, this method is deprecated, and will be\n     * removed in version 4.0. This decision follows the discussion reported in\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-803?focusedCommentId\u003d13399150#comment-13399150\"\u003eMATH-803\u003c/a\u003e.\n     * Uses of this method involving sparse implementations of\n     * {@link RealVector} might lead to wrong results. Since there is no\n     * satisfactory correction to this bug, this method is deprecated. Users who\n     * want to preserve this feature are advised to implement\n     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for\n     * the sake of efficiency).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 372,
      "end_line": 373,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @deprecated As of version 3.1, this method is deprecated, and will be\n     * removed in version 4.0. This decision follows the discussion reported in\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-803?focusedCommentId\u003d13399150#comment-13399150\"\u003eMATH-803\u003c/a\u003e.\n     * Uses of this method involving sparse implementations of\n     * {@link RealVector} might lead to wrong results. Since there is no\n     * satisfactory correction to this bug, this method is deprecated. Users who\n     * want to preserve this feature are advised to implement\n     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for\n     * the sake of efficiency).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 389,
      "end_line": 399,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 33)",
        "(line 391,col 9)-(line 391,col 21)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getNorm()",
      "begin_line": 411,
      "end_line": 420,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 23)",
        "(line 413,col 9)-(line 413,col 46)",
        "(line 414,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Norm()",
      "begin_line": 432,
      "end_line": 440,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 24)",
        "(line 434,col 9)-(line 434,col 46)",
        "(line 435,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfNorm()",
      "begin_line": 452,
      "end_line": 460,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 24)",
        "(line 454,col 9)-(line 454,col 46)",
        "(line 455,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 473,
      "end_line": 482,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 33)",
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 40)",
        "(line 477,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 498,
      "end_line": 507,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 33)",
        "(line 500,col 9)-(line 500,col 21)",
        "(line 501,col 9)-(line 501,col 40)",
        "(line 502,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinIndex()",
      "begin_line": 515,
      "end_line": 527,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 29)",
        "(line 517,col 9)-(line 517,col 51)",
        "(line 518,col 9)-(line 518,col 46)",
        "(line 519,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinValue()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 43)",
        "(line 537,col 9)-(line 537,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxIndex()",
      "begin_line": 546,
      "end_line": 558,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 29)",
        "(line 548,col 9)-(line 548,col 51)",
        "(line 549,col 9)-(line 549,col 46)",
        "(line 550,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxValue()",
      "begin_line": 566,
      "end_line": 569,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 43)",
        "(line 568,col 9)-(line 568,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiply(double)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 590,
      "end_line": 592,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtract(double)",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 612,
      "end_line": 614,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivide(double)",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 644,
      "end_line": 659,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 42)",
        "(line 646,col 9)-(line 646,col 39)",
        "(line 647,col 9)-(line 647,col 33)",
        "(line 648,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 671,
      "end_line": 677,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws MathArithmeticException if {@code this} or {@code v} is the null\n     * vector\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 45)",
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.set(double)",
      "begin_line": 684,
      "end_line": 690,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 40)",
        "(line 686,col 9)-(line 689,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.toArray()",
      "begin_line": 699,
      "end_line": 706,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 33)",
        "(line 701,col 9)-(line 701,col 42)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitVector()",
      "begin_line": 715,
      "end_line": 721,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws ArithmeticException if the norm is {@code null}.\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 38)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitize()",
      "begin_line": 730,
      "end_line": 736,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math3.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 38)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.sparseIterator()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 767,
      "end_line": 797,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 39)",
        "(line 769,col 9)-(line 796,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 772,
      "end_line": 772,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 775,
      "end_line": 775,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d059195f-9cea-4b97-aa00-3e95a0b8f25a.hasNext()",
      "begin_line": 778,
      "end_line": 780,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 779,col 17)-(line 779,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d2c173a7-2255-4934-93f4-9b74555b7a5b.next()",
      "begin_line": 783,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 784,col 17)-(line 789,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-01dee3f7-9c56-48f8-9516-e169e2ae92bc.remove()",
      "begin_line": 793,
      "end_line": 795,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 794,col 17)-(line 794,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 826,
      "end_line": 833,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 86)",
        "(line 828,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 864,
      "end_line": 872,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 33)",
        "(line 866,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 884,
      "end_line": 891,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 39)",
        "(line 886,col 9)-(line 886,col 39)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 905,
      "end_line": 913,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 33)",
        "(line 908,col 9)-(line 908,col 50)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 944,
      "end_line": 947,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 958,
      "end_line": 965,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process and modify the entries\n     * of this vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 39)",
        "(line 960,col 9)-(line 960,col 39)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 979,
      "end_line": 987,
      "comment": "\n     * Visits (and possibly alters) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 33)",
        "(line 982,col 9)-(line 982,col 50)",
        "(line 983,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 1018,
      "end_line": 1021,
      "comment": "\n     * Visits (and possibly change) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1024,
      "end_line": 1068,
      "comment": " An entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 1026,
      "end_line": 1026,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 1029,
      "end_line": 1031,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1030,col 13)-(line 1030,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 1038,
      "end_line": 1040,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 1039,col 13)-(line 1039,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 1047,
      "end_line": 1049,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 1048,col 13)-(line 1048,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 1057,col 13)-(line 1057,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 1065,
      "end_line": 1067,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 1066,col 13)-(line 1066,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.equals(java.lang.Object)",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two real vectors. If all coordinates of two real\n     * vectors are exactly the same, and none are {@code NaN}, the two real\n     * vectors are considered to be equal. {@code NaN} coordinates are\n     * considered to affect globally the vector and be equals to each other -\n     * i.e, if either (or all) coordinates of the real vector are equal to\n     * {@code NaN}, the real vector is equal to a vector with all {@code NaN}\n     * coordinates.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete subclasses of\n     * {@link RealVector}.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.hashCode()",
      "begin_line": 1099,
      "end_line": 1102,
      "comment": "\n     * {@inheritDoc}. This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete\n     * subclasses of {@link RealVector}.\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 1117,
      "end_line": 1172,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 1119,
      "end_line": 1119,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1121,
      "end_line": 1121,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1123,
      "end_line": 1123,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 1126,
      "end_line": 1133,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1127,col 13)-(line 1127,col 33)",
        "(line 1128,col 13)-(line 1128,col 34)",
        "(line 1129,col 13)-(line 1129,col 31)",
        "(line 1130,col 13)-(line 1132,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 1140,
      "end_line": 1150,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 1141,col 13)-(line 1143,col 13)",
        "(line 1144,col 13)-(line 1146,col 62)",
        "(line 1147,col 13)-(line 1149,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 1153,
      "end_line": 1155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1154,col 13)-(line 1154,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 1158,
      "end_line": 1166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1159,col 13)-(line 1159,col 40)",
        "(line 1160,col 13)-(line 1162,col 13)",
        "(line 1163,col 13)-(line 1163,col 36)",
        "(line 1164,col 13)-(line 1164,col 26)",
        "(line 1165,col 13)-(line 1165,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 1169,
      "end_line": 1171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1170,col 13)-(line 1170,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1192,
      "end_line": 1511,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1510,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8c71affe-412f-427c-a021-8750d6585f41.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1204,
      "end_line": 1207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1206,col 17)-(line 1206,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-caced9a1-7cc1-40c0-b40c-97eec6c02abf.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1210,
      "end_line": 1213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1212,col 17)-(line 1212,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cee5ee73-d150-4bad-a63a-238a917f136a.iterator()",
      "begin_line": 1216,
      "end_line": 1239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1218,col 17)-(line 1218,col 55)",
        "(line 1219,col 17)-(line 1238,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1221,
      "end_line": 1221,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-dd76d9c4-03a9-4b2c-96da-eab213465676.hasNext()",
      "begin_line": 1224,
      "end_line": 1226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1225,col 25)-(line 1225,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1d69f1ae-a869-45f4-8576-2d3f1343bf93.next()",
      "begin_line": 1229,
      "end_line": 1232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1230,col 25)-(line 1230,col 56)",
        "(line 1231,col 25)-(line 1231,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-80944e5b-6b2f-4e0a-ab59-32074dc2a50c.remove()",
      "begin_line": 1235,
      "end_line": 1237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1236,col 25)-(line 1236,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6d7970bd-865e-4dfd-afda-3c8dbcdc838d.sparseIterator()",
      "begin_line": 1242,
      "end_line": 1266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1244,col 17)-(line 1244,col 61)",
        "(line 1246,col 17)-(line 1265,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1248,
      "end_line": 1248,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e6331206-0316-4b9b-9c58-be090856031e.hasNext()",
      "begin_line": 1251,
      "end_line": 1253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1252,col 25)-(line 1252,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c2115d17-7fb6-4d36-b439-90cc77cda76d.next()",
      "begin_line": 1256,
      "end_line": 1259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1257,col 25)-(line 1257,col 56)",
        "(line 1258,col 25)-(line 1258,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-dab40326-2287-4118-8c94-0d55ea48de70.remove()",
      "begin_line": 1262,
      "end_line": 1264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1263,col 25)-(line 1263,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cb64af88-4d01-4408-be59-e6158c1c2c60.copy()",
      "begin_line": 1269,
      "end_line": 1272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1271,col 17)-(line 1271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cf120a31-f18a-4ce0-b8a4-5a0d938c55ca.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1275,
      "end_line": 1278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1277,col 17)-(line 1277,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-da7b88f2-a132-4324-b45d-c80e3092d451.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1281,
      "end_line": 1284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1283,col 17)-(line 1283,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f30b73c5-8398-4600-8829-1d48da559a95.mapAdd(double)",
      "begin_line": 1287,
      "end_line": 1290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1289,col 17)-(line 1289,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-51db1702-a025-43bf-b2e4-010db33b14cc.mapAddToSelf(double)",
      "begin_line": 1293,
      "end_line": 1296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1295,col 17)-(line 1295,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cb85687b-1b32-45e2-84ad-c63a4fe2f261.mapSubtract(double)",
      "begin_line": 1299,
      "end_line": 1302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1301,col 17)-(line 1301,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c42bba56-3250-47f8-a6a6-0b38dd74c2e3.mapSubtractToSelf(double)",
      "begin_line": 1305,
      "end_line": 1308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1307,col 17)-(line 1307,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c740f018-01fd-4257-a674-4e41191580c0.mapMultiply(double)",
      "begin_line": 1311,
      "end_line": 1314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1313,col 17)-(line 1313,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-80b7832c-c629-4607-8e3c-25f63ae5bda5.mapMultiplyToSelf(double)",
      "begin_line": 1317,
      "end_line": 1320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1319,col 17)-(line 1319,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f073c060-e3c1-4470-9e43-e7f1a552dd48.mapDivide(double)",
      "begin_line": 1323,
      "end_line": 1326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1325,col 17)-(line 1325,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-3f9f9889-fadc-40fd-b114-611ba94f1cf0.mapDivideToSelf(double)",
      "begin_line": 1329,
      "end_line": 1332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1331,col 17)-(line 1331,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5aed7878-859d-417f-9491-122d3ce7bb81.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1335,
      "end_line": 1338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1337,col 17)-(line 1337,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fab0c996-bd24-4dcf-9a9a-d8238cdbf49e.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1341,
      "end_line": 1344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1343,col 17)-(line 1343,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6e58d776-7df2-49d4-86fd-1c0a1bef0a3a.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1347,
      "end_line": 1350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1349,col 17)-(line 1349,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1719f31b-acc1-48be-8187-dbf9f28a3a4a.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1353,
      "end_line": 1356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1355,col 17)-(line 1355,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f10a3a33-0189-4b0b-8b28-7133b8f99ab0.getNorm()",
      "begin_line": 1359,
      "end_line": 1362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1361,col 17)-(line 1361,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d45f3275-d91d-41b5-b3c2-ed567ad0919c.getL1Norm()",
      "begin_line": 1365,
      "end_line": 1368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1367,col 17)-(line 1367,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1ea30ab2-7795-4b3b-b214-e5d6787e6613.getLInfNorm()",
      "begin_line": 1371,
      "end_line": 1374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1373,col 17)-(line 1373,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-55e62a45-73eb-4ced-873c-cd4eb74c9860.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1377,
      "end_line": 1380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1379,col 17)-(line 1379,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-469a6346-6b03-41f3-815d-eeffa52490a6.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1383,
      "end_line": 1386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1385,col 17)-(line 1385,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0290ea13-aaf1-4b54-a1ba-41f0de8a1d16.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1389,
      "end_line": 1392,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1391,col 17)-(line 1391,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e8ea9746-3497-4f2a-abe5-c8648531202a.unitVector()",
      "begin_line": 1395,
      "end_line": 1398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1397,col 17)-(line 1397,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f5ee168a-16bb-4c55-8e16-00965136ff14.unitize()",
      "begin_line": 1401,
      "end_line": 1404,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1403,col 17)-(line 1403,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-baad2221-1871-4bc2-970a-b79da476ec3d.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1407,
      "end_line": 1410,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1409,col 17)-(line 1409,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7cd64520-640c-4f54-9e90-f7ec67d4ce4a.getEntry(int)",
      "begin_line": 1413,
      "end_line": 1416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1415,col 17)-(line 1415,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2f476d7d-1df9-4911-9357-7c9e2bf66ede.setEntry(int, double)",
      "begin_line": 1419,
      "end_line": 1422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1421,col 17)-(line 1421,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e6936ec4-2595-470d-9bee-81952e7e0727.addToEntry(int, double)",
      "begin_line": 1425,
      "end_line": 1428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1427,col 17)-(line 1427,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8e518e26-ac52-4035-89d4-453217080355.getDimension()",
      "begin_line": 1431,
      "end_line": 1434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1433,col 17)-(line 1433,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9d83d565-d62b-4407-aebb-7724c30a01d3.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1437,
      "end_line": 1440,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1439,col 17)-(line 1439,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-74001a08-b5e9-4e89-a644-83ed73c41927.append(double)",
      "begin_line": 1443,
      "end_line": 1446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1445,col 17)-(line 1445,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-09e0c2ad-99a0-4c97-928c-e311d97de82b.getSubVector(int, int)",
      "begin_line": 1449,
      "end_line": 1452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1451,col 17)-(line 1451,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-445d7669-a14f-47f5-b503-574048005d44.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1455,
      "end_line": 1458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1457,col 17)-(line 1457,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f1371e65-f060-4283-86ce-2867877c14b1.set(double)",
      "begin_line": 1461,
      "end_line": 1464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1463,col 17)-(line 1463,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6c37e270-c40b-43d3-81f8-6e07d4f5af9b.toArray()",
      "begin_line": 1467,
      "end_line": 1470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1469,col 17)-(line 1469,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4c90bbf9-1a1a-4624-b5c8-35c5030db5e4.isNaN()",
      "begin_line": 1473,
      "end_line": 1476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1475,col 17)-(line 1475,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b9fefe31-6c8a-42a3-813b-eb26463e60dc.isInfinite()",
      "begin_line": 1479,
      "end_line": 1482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1481,col 17)-(line 1481,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d9a29ba2-265a-453f-b821-aa8b51d33f80.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1485,
      "end_line": 1488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1487,col 17)-(line 1487,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c959a171-7dc8-4f1c-9f96-4e968c996627.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1491,
      "end_line": 1494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1493,col 17)-(line 1493,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1497,
      "end_line": 1509,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1499,
      "end_line": 1502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1501,col 21)-(line 1501,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1505,
      "end_line": 1508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1507,col 21)-(line 1507,col 66)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 1651,
      "comment": "\n * Class defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., {@code getEntry(0)}\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@code code map} and {@code mapToSelf} methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The {@code map}\n * versions create a new vector to hold the result and do not change the instance.\n * The {@code mapToSelf} version uses the instance itself to store the\n * results, so the instance is changed by this method. In all cases, the result\n * vector is returned by the methods, allowing the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.4).mapToSelf(new Tan()).mapToSelf(new Power(2.3));\n * \u003c/pre\u003e\n *\n * @version $Id$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDimension()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Returns the size of the vector.\n     *\n     * @return the size of this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getEntry(int)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Return the entry at the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws OutOfRangeException if the index is not valid.\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.setEntry(int, double)",
      "begin_line": 86,
      "end_line": 87,
      "comment": "\n     * Set a single element.\n     *\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws OutOfRangeException if the index is not valid.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.addToEntry(int, double)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Change an entry at the specified index.\n     *\n     * @param index Index location of entry to be set.\n     * @param increment Value to add to the vector entry.\n     * @throws OutOfRangeException if the index is not valid.\n     * @since 3.0\n     ",
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
      "begin_line": 127,
      "end_line": 128,
      "comment": "\n     * Get a subvector from consecutive elements.\n     *\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws OutOfRangeException if the index is not valid.\n     * @throws NotPositiveException if the number of elements is not positive.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 137,
      "end_line": 138,
      "comment": "\n     * Set a sequence of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.isNaN()",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Check whether any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.isInfinite()",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 163,
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
      "end_line": 181,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 31)",
        "(line 178,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkIndex(int)",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkIndices(int, int)",
      "begin_line": 206,
      "end_line": 222,
      "comment": "\n     * Checks that the indices of a subvector are valid.\n     *\n     * @param start the index of the first entry of the subvector\n     * @param end the index of the last entry of the subvector (inclusive)\n     * @throws OutOfRangeException if {@code start} of {@code end} are not valid\n     * @throws NumberIsTooSmallException if {@code end \u003c start}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 39)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 233,
      "end_line": 243,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 33)",
        "(line 235,col 9)-(line 235,col 37)",
        "(line 236,col 9)-(line 236,col 40)",
        "(line 237,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 254,
      "end_line": 264,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 33)",
        "(line 256,col 9)-(line 256,col 47)",
        "(line 257,col 9)-(line 257,col 40)",
        "(line 258,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAdd(double)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.copy()",
      "begin_line": 296,
      "end_line": 296,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 306,
      "end_line": 314,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 33)",
        "(line 308,col 9)-(line 308,col 21)",
        "(line 309,col 9)-(line 309,col 37)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 327,
      "end_line": 337,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     * @throws MathArithmeticException if {@code this} or {@code v} is the null\n     * vector\n     * @throws DimensionMismatchException if the dimensions of {@code this} and\n     * {@code v} do not match\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 38)",
        "(line 330,col 9)-(line 330,col 41)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @deprecated As of version 3.1, this method is deprecated, and will be\n     * removed in version 4.0. This decision follows the discussion reported in\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-803?focusedCommentId\u003d13399150#comment-13399150\"\u003eMATH-803\u003c/a\u003e.\n     * Uses of this method involving sparse implementations of\n     * {@link RealVector} might lead to wrong results. Since there is no\n     * satisfactory correction to this bug, this method is deprecated. Users who\n     * want to preserve this feature are advised to implement\n     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for\n     * the sake of efficiency).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @deprecated As of version 3.1, this method is deprecated, and will be\n     * removed in version 4.0. This decision follows the discussion reported in\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-803?focusedCommentId\u003d13399150#comment-13399150\"\u003eMATH-803\u003c/a\u003e.\n     * Uses of this method involving sparse implementations of\n     * {@link RealVector} might lead to wrong results. Since there is no\n     * satisfactory correction to this bug, this method is deprecated. Users who\n     * want to preserve this feature are advised to implement\n     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for\n     * the sake of efficiency).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 395,
      "end_line": 405,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidean distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 33)",
        "(line 397,col 9)-(line 397,col 21)",
        "(line 398,col 9)-(line 398,col 40)",
        "(line 399,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getNorm()",
      "begin_line": 417,
      "end_line": 426,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 23)",
        "(line 419,col 9)-(line 419,col 40)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Norm()",
      "begin_line": 438,
      "end_line": 446,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 24)",
        "(line 440,col 9)-(line 440,col 40)",
        "(line 441,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfNorm()",
      "begin_line": 458,
      "end_line": 466,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 24)",
        "(line 460,col 9)-(line 460,col 40)",
        "(line 461,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 479,
      "end_line": 489,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 33)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 483,col 9)-(line 483,col 40)",
        "(line 484,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 505,
      "end_line": 515,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 33)",
        "(line 508,col 9)-(line 508,col 21)",
        "(line 509,col 9)-(line 509,col 40)",
        "(line 510,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinIndex()",
      "begin_line": 523,
      "end_line": 535,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 29)",
        "(line 525,col 9)-(line 525,col 51)",
        "(line 526,col 9)-(line 526,col 46)",
        "(line 527,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinValue()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 43)",
        "(line 545,col 9)-(line 545,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxIndex()",
      "begin_line": 554,
      "end_line": 566,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 29)",
        "(line 556,col 9)-(line 556,col 51)",
        "(line 557,col 9)-(line 557,col 46)",
        "(line 558,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxValue()",
      "begin_line": 574,
      "end_line": 577,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 43)",
        "(line 576,col 9)-(line 576,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiply(double)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtract(double)",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivide(double)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 652,
      "end_line": 667,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 42)",
        "(line 654,col 9)-(line 654,col 39)",
        "(line 655,col 9)-(line 655,col 33)",
        "(line 656,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 679,
      "end_line": 686,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @throws MathArithmeticException if {@code this} or {@code v} is the null\n     * vector\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 45)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.set(double)",
      "begin_line": 693,
      "end_line": 699,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 40)",
        "(line 695,col 9)-(line 698,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.toArray()",
      "begin_line": 708,
      "end_line": 715,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 33)",
        "(line 710,col 9)-(line 710,col 42)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitVector()",
      "begin_line": 724,
      "end_line": 730,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws MathArithmeticException if the norm is zero.\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 38)",
        "(line 726,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitize()",
      "begin_line": 738,
      "end_line": 744,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws MathArithmeticException if the norm is zero.\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 38)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.sparseIterator()",
      "begin_line": 765,
      "end_line": 768,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     * @deprecated As of 3.1, this method is deprecated, because its interface\n     * is too confusing (see\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-875\"\u003eJIRA MATH-875\u003c/a\u003e).\n     * This method will be completely removed in 4.0.\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 780,
      "end_line": 814,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 39)",
        "(line 782,col 9)-(line 813,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 785,
      "end_line": 785,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-620db775-0b85-44c0-be09-4c673c4d950c.hasNext()",
      "begin_line": 791,
      "end_line": 793,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 792,col 17)-(line 792,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-48fc5eee-b1bb-4304-8fc4-fcf8a028fef9.next()",
      "begin_line": 796,
      "end_line": 803,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 797,col 17)-(line 802,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-37eab5a9-ed93-41f2-90f1-1afc846513c6.remove()",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all circumstances.\n             ",
      "child_ranges": [
        "(line 811,col 17)-(line 811,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 826,
      "end_line": 828,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 843,
      "end_line": 850,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 40)",
        "(line 845,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 865,
      "end_line": 868,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws DimensionMismatchException if {@code y} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 882,
      "end_line": 891,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws DimensionMismatchException if {@code y} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 33)",
        "(line 885,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 903,
      "end_line": 910,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 39)",
        "(line 905,col 9)-(line 905,col 39)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 925,
      "end_line": 934,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 33)",
        "(line 929,col 9)-(line 929,col 50)",
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 948,
      "end_line": 950,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 967,
      "end_line": 971,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 983,
      "end_line": 990,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process and modify the entries\n     * of this vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 39)",
        "(line 985,col 9)-(line 985,col 39)",
        "(line 986,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 1005,
      "end_line": 1014,
      "comment": "\n     * Visits (and possibly alters) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 33)",
        "(line 1009,col 9)-(line 1009,col 50)",
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 1047,
      "end_line": 1051,
      "comment": "\n     * Visits (and possibly change) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1054,
      "end_line": 1098,
      "comment": " An entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 1056,
      "end_line": 1056,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 1059,
      "end_line": 1061,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1060,col 13)-(line 1060,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 1068,
      "end_line": 1070,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 1069,col 13)-(line 1069,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 1078,col 13)-(line 1078,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 1086,
      "end_line": 1088,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 1087,col 13)-(line 1087,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 1096,col 13)-(line 1096,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.equals(java.lang.Object)",
      "begin_line": 1122,
      "end_line": 1126,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two real vectors. If all coordinates of two real\n     * vectors are exactly the same, and none are {@code NaN}, the two real\n     * vectors are considered to be equal. {@code NaN} coordinates are\n     * considered to affect globally the vector and be equals to each other -\n     * i.e, if either (or all) coordinates of the real vector are equal to\n     * {@code NaN}, the real vector is equal to a vector with all {@code NaN}\n     * coordinates.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete subclasses of\n     * {@link RealVector} (the current implementation throws an exception).\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     * @throws MathUnsupportedOperationException if this method is not\n     * overridden.\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.hashCode()",
      "begin_line": 1136,
      "end_line": 1139,
      "comment": "\n     * {@inheritDoc}. This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete\n     * subclasses of {@link RealVector} (current implementation throws an\n     * exception).\n     *\n     * @throws MathUnsupportedOperationException if this method is not\n     * overridden.\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 1159,
      "end_line": 1219,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     *\n     * @deprecated As of 3.1, this class is deprecated, see\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-875\"\u003eJIRA MATH-875\u003c/a\u003e.\n     * This class will be completely removed in 4.0.\n\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 1162,
      "end_line": 1162,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1164,
      "end_line": 1164,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1166,
      "end_line": 1166,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 1169,
      "end_line": 1176,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1170,col 13)-(line 1170,col 33)",
        "(line 1171,col 13)-(line 1171,col 34)",
        "(line 1172,col 13)-(line 1172,col 31)",
        "(line 1173,col 13)-(line 1175,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 1183,
      "end_line": 1193,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 1184,col 13)-(line 1186,col 13)",
        "(line 1187,col 13)-(line 1189,col 62)",
        "(line 1190,col 13)-(line 1192,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 1196,
      "end_line": 1198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1197,col 13)-(line 1197,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 1201,
      "end_line": 1209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1202,col 13)-(line 1202,col 40)",
        "(line 1203,col 13)-(line 1205,col 13)",
        "(line 1206,col 13)-(line 1206,col 36)",
        "(line 1207,col 13)-(line 1207,col 26)",
        "(line 1208,col 13)-(line 1208,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": "\n         * {@inheritDoc}\n         *\n         * @throws MathUnsupportedOperationException in all circumstances.\n         ",
      "child_ranges": [
        "(line 1217,col 13)-(line 1217,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1239,
      "end_line": 1650,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1649,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-08aa2eb4-cfb2-405b-ae04-988d81e2bcc2.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1255,
      "end_line": 1259,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all circumstances.\n             ",
      "child_ranges": [
        "(line 1258,col 17)-(line 1258,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8ce7a94c-42fd-4adf-b9d5-64d6879baf8b.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1262,
      "end_line": 1265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1264,col 17)-(line 1264,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c8e8c723-d66e-4655-b07b-2d57733f1eab.iterator()",
      "begin_line": 1268,
      "end_line": 1296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1270,col 17)-(line 1270,col 55)",
        "(line 1271,col 17)-(line 1295,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1273,
      "end_line": 1273,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6a7959f2-24a8-47b3-8978-234cd7438b83.hasNext()",
      "begin_line": 1276,
      "end_line": 1278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1277,col 25)-(line 1277,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2c75fef4-63db-4dc3-9351-5ee1a7e564c4.next()",
      "begin_line": 1281,
      "end_line": 1284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1282,col 25)-(line 1282,col 56)",
        "(line 1283,col 25)-(line 1283,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-472fbbb8-a30e-4b51-900b-4a0ee8a9ae33.remove()",
      "begin_line": 1292,
      "end_line": 1294,
      "comment": "\n                     * {@inheritDoc}\n                     *\n                     * @throws MathUnsupportedOperationException in all\n                     * circumstances.\n                     ",
      "child_ranges": [
        "(line 1293,col 25)-(line 1293,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6ce54409-b66a-4d48-9f79-b162ff39dc34.sparseIterator()",
      "begin_line": 1299,
      "end_line": 1329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1301,col 17)-(line 1301,col 61)",
        "(line 1303,col 17)-(line 1328,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1305,
      "end_line": 1305,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-39f73836-7f44-42bc-b145-da5764ea6386.hasNext()",
      "begin_line": 1308,
      "end_line": 1310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1309,col 25)-(line 1309,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a4220977-1f1b-4adb-9e8e-671e2d719994.next()",
      "begin_line": 1313,
      "end_line": 1316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1314,col 25)-(line 1314,col 56)",
        "(line 1315,col 25)-(line 1315,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9ac1d64c-b576-4fa1-81dc-16b23ef154f5.remove()",
      "begin_line": 1324,
      "end_line": 1327,
      "comment": "\n                     * {@inheritDoc}\n                     *\n                     * @throws MathUnsupportedOperationException in all\n                     * circumstances.\n                     ",
      "child_ranges": [
        "(line 1326,col 25)-(line 1326,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9c70f9e5-a12b-4208-95ab-13e923907552.copy()",
      "begin_line": 1332,
      "end_line": 1335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1334,col 17)-(line 1334,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6936da1b-cff3-440d-b88a-175aeb7eb4b2.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1338,
      "end_line": 1342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1341,col 17)-(line 1341,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-857952b0-8ca4-412b-9156-e95a2927a3e1.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1345,
      "end_line": 1349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1348,col 17)-(line 1348,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ec74ef79-0a5a-4073-baaa-b13851aaa359.mapAdd(double)",
      "begin_line": 1352,
      "end_line": 1355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1354,col 17)-(line 1354,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5a64f9b9-4f0f-4226-8d7f-6ea8260e1915.mapAddToSelf(double)",
      "begin_line": 1363,
      "end_line": 1367,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1366,col 17)-(line 1366,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b4176225-97b1-46d5-ad28-6e0103c11055.mapSubtract(double)",
      "begin_line": 1370,
      "end_line": 1373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1372,col 17)-(line 1372,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-83f1dc89-26d7-49ac-a48d-2bd65648f99f.mapSubtractToSelf(double)",
      "begin_line": 1381,
      "end_line": 1385,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1384,col 17)-(line 1384,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-95298a6e-3aea-471b-886b-efd8bc0696b7.mapMultiply(double)",
      "begin_line": 1388,
      "end_line": 1391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1390,col 17)-(line 1390,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5641f55a-5081-4423-93e4-956a6e79c519.mapMultiplyToSelf(double)",
      "begin_line": 1399,
      "end_line": 1403,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1402,col 17)-(line 1402,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1ab8fef1-3029-4222-9242-3d37aacd2496.mapDivide(double)",
      "begin_line": 1406,
      "end_line": 1409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1408,col 17)-(line 1408,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b5829cc1-9f06-45e8-b552-d8cc892b858e.mapDivideToSelf(double)",
      "begin_line": 1417,
      "end_line": 1421,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1420,col 17)-(line 1420,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a484d500-cd29-4c12-843a-2040e1d1e9af.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1424,
      "end_line": 1428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1427,col 17)-(line 1427,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-521f23a6-091f-4022-a33f-16dfab3973bd.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1431,
      "end_line": 1435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1434,col 17)-(line 1434,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4a49de80-48f2-4d32-aa12-9b1968e7d3e0.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1438,
      "end_line": 1442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1441,col 17)-(line 1441,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-66444add-068d-43b3-a1b3-fa939c01ef30.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1445,
      "end_line": 1449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1448,col 17)-(line 1448,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8be030de-d119-4291-8be1-d12eb17b721d.getNorm()",
      "begin_line": 1452,
      "end_line": 1455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1454,col 17)-(line 1454,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d1c6d73d-0fa2-4df8-9b03-1560454a727b.getL1Norm()",
      "begin_line": 1458,
      "end_line": 1461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1460,col 17)-(line 1460,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0749f7be-f8d3-4b2f-8352-b02a4a32ff55.getLInfNorm()",
      "begin_line": 1464,
      "end_line": 1467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1466,col 17)-(line 1466,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-726f18d1-d0dc-48ab-93e2-97ea17267432.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1470,
      "end_line": 1474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1473,col 17)-(line 1473,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9727c04c-c001-406d-9ea3-81b9d543497c.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1477,
      "end_line": 1481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1480,col 17)-(line 1480,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7444570a-b1f2-4ce8-8989-7a0a9b9e0319.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1484,
      "end_line": 1488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1487,col 17)-(line 1487,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a8f775bb-60d1-42e6-b8d5-19ada0f22dd5.unitVector()",
      "begin_line": 1491,
      "end_line": 1494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1493,col 17)-(line 1493,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b2bb4a57-2238-4524-8bf6-affdda7970ee.unitize()",
      "begin_line": 1502,
      "end_line": 1505,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1504,col 17)-(line 1504,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e42f76d2-5cad-4880-b903-8eb68efc0f5c.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1508,
      "end_line": 1511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1510,col 17)-(line 1510,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-df6cf21c-b80f-48fc-a196-26ee86a7ecd8.getEntry(int)",
      "begin_line": 1514,
      "end_line": 1517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1516,col 17)-(line 1516,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-eae2bc38-79a7-485f-9d78-1fceb7b2cb03.setEntry(int, double)",
      "begin_line": 1525,
      "end_line": 1529,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1528,col 17)-(line 1528,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-278bda37-6198-4f48-b60a-02d6fedf4254.addToEntry(int, double)",
      "begin_line": 1537,
      "end_line": 1541,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1540,col 17)-(line 1540,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fd1511d0-194a-4d1f-9b8b-0af3dd216c01.getDimension()",
      "begin_line": 1544,
      "end_line": 1547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1546,col 17)-(line 1546,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-181561dd-af21-4a9d-b0bb-a05194c9d366.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1550,
      "end_line": 1553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1552,col 17)-(line 1552,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4f17a2f1-de81-4e39-93b0-41cdec9fe9c9.append(double)",
      "begin_line": 1556,
      "end_line": 1559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1558,col 17)-(line 1558,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-90317951-91d9-4150-ab99-033a0809c736.getSubVector(int, int)",
      "begin_line": 1562,
      "end_line": 1566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1565,col 17)-(line 1565,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-526bee25-6a7a-44d2-932c-12fa89d25714.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1574,
      "end_line": 1578,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1577,col 17)-(line 1577,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-558ae0be-6454-441b-9b53-f9e1018f39d5.set(double)",
      "begin_line": 1586,
      "end_line": 1590,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1589,col 17)-(line 1589,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c728251c-4dac-45e3-87b9-4978422b4415.toArray()",
      "begin_line": 1593,
      "end_line": 1596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1595,col 17)-(line 1595,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-650b55f9-6d76-4c2b-a31b-a8e121b73b9a.isNaN()",
      "begin_line": 1599,
      "end_line": 1602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1601,col 17)-(line 1601,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-371c34d3-33e9-417b-982d-d3dcbe19f1df.isInfinite()",
      "begin_line": 1605,
      "end_line": 1608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1607,col 17)-(line 1607,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ffc9ff5a-0eac-42f9-a676-6230f665f010.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1611,
      "end_line": 1615,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1614,col 17)-(line 1614,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b1d4e18c-6a87-428a-a1b5-d41f3baf128e.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1623,
      "end_line": 1627,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1626,col 17)-(line 1626,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1630,
      "end_line": 1648,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1632,
      "end_line": 1635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1634,col 21)-(line 1634,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1643,
      "end_line": 1647,
      "comment": "\n                 * {@inheritDoc}\n                 *\n                 * @throws MathUnsupportedOperationException in all\n                 * circumstances.\n                 ",
      "child_ranges": [
        "(line 1646,col 21)-(line 1646,col 66)"
      ]
    }
  ]
}
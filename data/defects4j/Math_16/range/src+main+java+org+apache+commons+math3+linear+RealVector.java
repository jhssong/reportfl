{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 1643,
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
      "begin_line": 205,
      "end_line": 221,
      "comment": "\n     * Checks that the indices of a subvector are valid.\n     *\n     * @param start the index of the first entry of the subvector\n     * @param end the index of the last entry of the subvector (inclusive)\n     * @throws OutOfRangeException if {@code start} of {@code end} are not valid\n     * @throws NumberIsTooSmallException if {@code end \u003c start}\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 39)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 232,
      "end_line": 242,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 37)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 253,
      "end_line": 263,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 255,col 47)",
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAdd(double)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 283,
      "end_line": 288,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.copy()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 305,
      "end_line": 313,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 33)",
        "(line 307,col 9)-(line 307,col 21)",
        "(line 308,col 9)-(line 308,col 37)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 326,
      "end_line": 336,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     * @throws MathArithmeticException if {@code this} or {@code v} is the null\n     * vector\n     * @throws DimensionMismatchException if the dimensions of {@code this} and\n     * {@code v} do not match\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 329,col 41)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @deprecated As of version 3.1, this method is deprecated, and will be\n     * removed in version 4.0. This decision follows the discussion reported in\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-803?focusedCommentId\u003d13399150#comment-13399150\"\u003eMATH-803\u003c/a\u003e.\n     * Uses of this method involving sparse implementations of\n     * {@link RealVector} might lead to wrong results. Since there is no\n     * satisfactory correction to this bug, this method is deprecated. Users who\n     * want to preserve this feature are advised to implement\n     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for\n     * the sake of efficiency).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @deprecated As of version 3.1, this method is deprecated, and will be\n     * removed in version 4.0. This decision follows the discussion reported in\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-803?focusedCommentId\u003d13399150#comment-13399150\"\u003eMATH-803\u003c/a\u003e.\n     * Uses of this method involving sparse implementations of\n     * {@link RealVector} might lead to wrong results. Since there is no\n     * satisfactory correction to this bug, this method is deprecated. Users who\n     * want to preserve this feature are advised to implement\n     * {@link RealVectorPreservingVisitor} (possibly ignoring corner cases for\n     * the sake of efficiency).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 394,
      "end_line": 404,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidean distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 33)",
        "(line 396,col 9)-(line 396,col 21)",
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getNorm()",
      "begin_line": 416,
      "end_line": 425,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 23)",
        "(line 418,col 9)-(line 418,col 40)",
        "(line 419,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Norm()",
      "begin_line": 437,
      "end_line": 445,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 24)",
        "(line 439,col 9)-(line 439,col 40)",
        "(line 440,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfNorm()",
      "begin_line": 457,
      "end_line": 465,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 24)",
        "(line 459,col 9)-(line 459,col 40)",
        "(line 460,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 478,
      "end_line": 488,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 33)",
        "(line 481,col 9)-(line 481,col 21)",
        "(line 482,col 9)-(line 482,col 40)",
        "(line 483,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 504,
      "end_line": 514,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 33)",
        "(line 507,col 9)-(line 507,col 21)",
        "(line 508,col 9)-(line 508,col 40)",
        "(line 509,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinIndex()",
      "begin_line": 522,
      "end_line": 534,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 29)",
        "(line 524,col 9)-(line 524,col 51)",
        "(line 525,col 9)-(line 525,col 46)",
        "(line 526,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinValue()",
      "begin_line": 542,
      "end_line": 545,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 43)",
        "(line 544,col 9)-(line 544,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxIndex()",
      "begin_line": 553,
      "end_line": 565,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 29)",
        "(line 555,col 9)-(line 555,col 51)",
        "(line 556,col 9)-(line 556,col 46)",
        "(line 557,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxValue()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 43)",
        "(line 575,col 9)-(line 575,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiply(double)",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtract(double)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivide(double)",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 651,
      "end_line": 666,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 42)",
        "(line 653,col 9)-(line 653,col 39)",
        "(line 654,col 9)-(line 654,col 33)",
        "(line 655,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 678,
      "end_line": 685,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @throws MathArithmeticException if {@code this} or {@code v} is the null\n     * vector\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 45)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.set(double)",
      "begin_line": 692,
      "end_line": 698,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 40)",
        "(line 694,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.toArray()",
      "begin_line": 707,
      "end_line": 714,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 33)",
        "(line 709,col 9)-(line 709,col 42)",
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitVector()",
      "begin_line": 723,
      "end_line": 729,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws MathArithmeticException if the norm is zero.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 38)",
        "(line 725,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitize()",
      "begin_line": 737,
      "end_line": 743,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws MathArithmeticException if the norm is zero.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 38)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.sparseIterator()",
      "begin_line": 764,
      "end_line": 767,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     * @deprecated As of 3.1, this method is deprecated, because its interface\n     * is too confusing (see\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-875\"\u003eJIRA MATH-875\u003c/a\u003e).\n     * This method will be completely removed in 4.0.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 779,
      "end_line": 813,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 39)",
        "(line 781,col 9)-(line 812,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 784,
      "end_line": 784,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e3b8adae-f03e-4b54-8512-845b3fd35b68.hasNext()",
      "begin_line": 790,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 791,col 17)-(line 791,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-23a341a3-6b9f-40ae-b6f9-7b4f7da2957f.next()",
      "begin_line": 795,
      "end_line": 802,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 796,col 17)-(line 801,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a4b2891a-c668-4a3a-954f-20c914da7bcc.remove()",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all circumstances.\n             ",
      "child_ranges": [
        "(line 810,col 17)-(line 810,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 842,
      "end_line": 849,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 40)",
        "(line 844,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 864,
      "end_line": 867,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws DimensionMismatchException if {@code y} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 881,
      "end_line": 890,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws DimensionMismatchException if {@code y} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 33)",
        "(line 884,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 902,
      "end_line": 909,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 39)",
        "(line 904,col 9)-(line 904,col 39)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 923,
      "end_line": 932,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 33)",
        "(line 927,col 9)-(line 927,col 50)",
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 931,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 963,
      "end_line": 967,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 978,
      "end_line": 985,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process and modify the entries\n     * of this vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 39)",
        "(line 980,col 9)-(line 980,col 39)",
        "(line 981,col 9)-(line 983,col 9)",
        "(line 984,col 9)-(line 984,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 999,
      "end_line": 1008,
      "comment": "\n     * Visits (and possibly alters) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 33)",
        "(line 1003,col 9)-(line 1003,col 50)",
        "(line 1004,col 9)-(line 1006,col 9)",
        "(line 1007,col 9)-(line 1007,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 1039,
      "end_line": 1043,
      "comment": "\n     * Visits (and possibly change) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1046,
      "end_line": 1090,
      "comment": " An entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 1048,
      "end_line": 1048,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 1051,
      "end_line": 1053,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1052,col 13)-(line 1052,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 1061,col 13)-(line 1061,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 1069,
      "end_line": 1071,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 1070,col 13)-(line 1070,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 1078,
      "end_line": 1080,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 1079,col 13)-(line 1079,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 1088,col 13)-(line 1088,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.equals(java.lang.Object)",
      "begin_line": 1114,
      "end_line": 1118,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two real vectors. If all coordinates of two real\n     * vectors are exactly the same, and none are {@code NaN}, the two real\n     * vectors are considered to be equal. {@code NaN} coordinates are\n     * considered to affect globally the vector and be equals to each other -\n     * i.e, if either (or all) coordinates of the real vector are equal to\n     * {@code NaN}, the real vector is equal to a vector with all {@code NaN}\n     * coordinates.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete subclasses of\n     * {@link RealVector} (the current implementation throws an exception).\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     * @throws MathUnsupportedOperationException if this method is not\n     * overridden.\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1117,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.hashCode()",
      "begin_line": 1128,
      "end_line": 1131,
      "comment": "\n     * {@inheritDoc}. This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete\n     * subclasses of {@link RealVector} (current implementation throws an\n     * exception).\n     *\n     * @throws MathUnsupportedOperationException if this method is not\n     * overridden.\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 1151,
      "end_line": 1211,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     *\n     * @deprecated As of 3.1, this class is deprecated, see\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-875\"\u003eJIRA MATH-875\u003c/a\u003e.\n     * This class will be completely removed in 4.0.\n\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 1154,
      "end_line": 1154,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1156,
      "end_line": 1156,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1158,
      "end_line": 1158,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 1161,
      "end_line": 1168,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1162,col 13)-(line 1162,col 33)",
        "(line 1163,col 13)-(line 1163,col 34)",
        "(line 1164,col 13)-(line 1164,col 31)",
        "(line 1165,col 13)-(line 1167,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 1175,
      "end_line": 1185,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 1176,col 13)-(line 1178,col 13)",
        "(line 1179,col 13)-(line 1181,col 62)",
        "(line 1182,col 13)-(line 1184,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 1188,
      "end_line": 1190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1189,col 13)-(line 1189,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 1193,
      "end_line": 1201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1194,col 13)-(line 1194,col 40)",
        "(line 1195,col 13)-(line 1197,col 13)",
        "(line 1198,col 13)-(line 1198,col 36)",
        "(line 1199,col 13)-(line 1199,col 26)",
        "(line 1200,col 13)-(line 1200,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 1208,
      "end_line": 1210,
      "comment": "\n         * {@inheritDoc}\n         *\n         * @throws MathUnsupportedOperationException in all circumstances.\n         ",
      "child_ranges": [
        "(line 1209,col 13)-(line 1209,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1231,
      "end_line": 1642,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1641,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f7ef76e0-97de-4c11-ac66-3186af861a86.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1247,
      "end_line": 1251,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all circumstances.\n             ",
      "child_ranges": [
        "(line 1250,col 17)-(line 1250,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-28a8ebf9-0690-4d78-b1b6-15c14ca47030.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1254,
      "end_line": 1257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1256,col 17)-(line 1256,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-09326629-080e-45bb-8b16-4ec37a09248f.iterator()",
      "begin_line": 1260,
      "end_line": 1288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1262,col 17)-(line 1262,col 55)",
        "(line 1263,col 17)-(line 1287,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1265,
      "end_line": 1265,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d8560153-d11a-420a-8766-37944b40ea82.hasNext()",
      "begin_line": 1268,
      "end_line": 1270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1269,col 25)-(line 1269,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9276fb5f-d66f-42c6-bde6-143856192ca4.next()",
      "begin_line": 1273,
      "end_line": 1276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1274,col 25)-(line 1274,col 56)",
        "(line 1275,col 25)-(line 1275,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f54011dd-5eb0-4f79-900d-1bc168149b27.remove()",
      "begin_line": 1284,
      "end_line": 1286,
      "comment": "\n                     * {@inheritDoc}\n                     *\n                     * @throws MathUnsupportedOperationException in all\n                     * circumstances.\n                     ",
      "child_ranges": [
        "(line 1285,col 25)-(line 1285,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-34f6ee64-a430-4561-92c7-96870fcb13a2.sparseIterator()",
      "begin_line": 1291,
      "end_line": 1321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1293,col 17)-(line 1293,col 61)",
        "(line 1295,col 17)-(line 1320,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1297,
      "end_line": 1297,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5c74051c-8e61-47c9-aa39-b3c5c94bf8e7.hasNext()",
      "begin_line": 1300,
      "end_line": 1302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1301,col 25)-(line 1301,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1459d0c2-c444-4186-84c3-22dae1e8f2da.next()",
      "begin_line": 1305,
      "end_line": 1308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1306,col 25)-(line 1306,col 56)",
        "(line 1307,col 25)-(line 1307,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0fd7eff5-10d0-41a3-88ae-417bfc7c9960.remove()",
      "begin_line": 1316,
      "end_line": 1319,
      "comment": "\n                     * {@inheritDoc}\n                     *\n                     * @throws MathUnsupportedOperationException in all\n                     * circumstances.\n                     ",
      "child_ranges": [
        "(line 1318,col 25)-(line 1318,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-daa62967-94e0-4e53-b685-6492602a1810.copy()",
      "begin_line": 1324,
      "end_line": 1327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1326,col 17)-(line 1326,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fa5c6af8-d86c-4210-b0fa-d184ffa53b2c.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1330,
      "end_line": 1334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1333,col 17)-(line 1333,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a872716c-120b-44f4-974f-4dbfb9364dce.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1337,
      "end_line": 1341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1340,col 17)-(line 1340,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-13e5fd3a-3bbd-43bb-8aa8-0d79f894b53a.mapAdd(double)",
      "begin_line": 1344,
      "end_line": 1347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1346,col 17)-(line 1346,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8370a11a-dd00-45dd-9ac7-6dfb7fabf1da.mapAddToSelf(double)",
      "begin_line": 1355,
      "end_line": 1359,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1358,col 17)-(line 1358,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-dc3a87d2-5e62-46c1-b449-57cfa28476e7.mapSubtract(double)",
      "begin_line": 1362,
      "end_line": 1365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1364,col 17)-(line 1364,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8c69feb2-033a-4a15-8c6a-74310bb0780d.mapSubtractToSelf(double)",
      "begin_line": 1373,
      "end_line": 1377,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1376,col 17)-(line 1376,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e5c99927-5be6-4446-934c-3fd5ded3e8f8.mapMultiply(double)",
      "begin_line": 1380,
      "end_line": 1383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1382,col 17)-(line 1382,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4d72f759-92c6-4263-ad9e-91257f56e01a.mapMultiplyToSelf(double)",
      "begin_line": 1391,
      "end_line": 1395,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1394,col 17)-(line 1394,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f2bedfae-d35c-4c33-a1ec-51b545cd9308.mapDivide(double)",
      "begin_line": 1398,
      "end_line": 1401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1400,col 17)-(line 1400,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1cf76bd4-48f0-44f0-bf27-76c7894926ef.mapDivideToSelf(double)",
      "begin_line": 1409,
      "end_line": 1413,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1412,col 17)-(line 1412,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c9fad545-eefb-40b7-8155-ee0244e213c5.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1416,
      "end_line": 1420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1419,col 17)-(line 1419,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-63d83cc9-5cba-4fba-8177-fda13f976099.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1423,
      "end_line": 1427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1426,col 17)-(line 1426,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5442df25-6a97-43a7-8a15-dce39cf537f0.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1430,
      "end_line": 1434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1433,col 17)-(line 1433,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d409e410-6ecd-497b-a8a5-dde329735ea4.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1437,
      "end_line": 1441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1440,col 17)-(line 1440,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-dffe08b6-75e4-41db-8539-690cfc11e2d9.getNorm()",
      "begin_line": 1444,
      "end_line": 1447,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1446,col 17)-(line 1446,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d47c3a06-3da1-44ad-baa0-3868d7ee8c14.getL1Norm()",
      "begin_line": 1450,
      "end_line": 1453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1452,col 17)-(line 1452,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d4a268da-07ec-4984-98e4-931f1e3aa40c.getLInfNorm()",
      "begin_line": 1456,
      "end_line": 1459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1458,col 17)-(line 1458,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5d888d06-ae76-4f51-bb39-c77f74438c6f.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1462,
      "end_line": 1466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1465,col 17)-(line 1465,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7639009d-b9ea-4573-9501-e6e4c3b86c68.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1469,
      "end_line": 1473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1472,col 17)-(line 1472,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-325d96e0-0abe-49f4-9695-bb6199299cd2.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1476,
      "end_line": 1480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1479,col 17)-(line 1479,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4c84ed5a-5275-487e-a334-19a59b6104b2.unitVector()",
      "begin_line": 1483,
      "end_line": 1486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1485,col 17)-(line 1485,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fd12e3ff-d5f0-4239-b36d-1ade7d1ac4bb.unitize()",
      "begin_line": 1494,
      "end_line": 1497,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1496,col 17)-(line 1496,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f28a4dea-135a-4319-b0e5-c97e8e69a960.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1500,
      "end_line": 1503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1502,col 17)-(line 1502,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-39eeb160-f389-4d03-92e4-e579d77db77e.getEntry(int)",
      "begin_line": 1506,
      "end_line": 1509,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1508,col 17)-(line 1508,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c3ebb35c-6510-466c-87b2-d76e1a42e9a8.setEntry(int, double)",
      "begin_line": 1517,
      "end_line": 1521,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1520,col 17)-(line 1520,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-70f4115a-72ac-46ae-bc82-e2ba455679d4.addToEntry(int, double)",
      "begin_line": 1529,
      "end_line": 1533,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1532,col 17)-(line 1532,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8ef79abb-d17b-410b-a272-c38b04853214.getDimension()",
      "begin_line": 1536,
      "end_line": 1539,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1538,col 17)-(line 1538,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fbd10c41-c467-4524-8d38-5aa63b4ce69d.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1542,
      "end_line": 1545,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1544,col 17)-(line 1544,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b2ee36ef-eb76-406c-bedc-000e724fd840.append(double)",
      "begin_line": 1548,
      "end_line": 1551,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1550,col 17)-(line 1550,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-41bd3072-f851-4bed-9f04-9b483ba24ac5.getSubVector(int, int)",
      "begin_line": 1554,
      "end_line": 1558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1557,col 17)-(line 1557,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7425885a-3c52-45fb-a6a0-42691d519f26.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1566,
      "end_line": 1570,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1569,col 17)-(line 1569,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e9a6d6d3-17dc-4e9c-96dd-05bf4d14e07d.set(double)",
      "begin_line": 1578,
      "end_line": 1582,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1581,col 17)-(line 1581,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4977af7b-454f-47fd-a7a8-d6b2a154e641.toArray()",
      "begin_line": 1585,
      "end_line": 1588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1587,col 17)-(line 1587,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-49a3ff52-6578-4420-8941-52629673222a.isNaN()",
      "begin_line": 1591,
      "end_line": 1594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1593,col 17)-(line 1593,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2001dc38-827f-4c2e-af6a-102775c3baba.isInfinite()",
      "begin_line": 1597,
      "end_line": 1600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1599,col 17)-(line 1599,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-dfa78807-de75-4def-9190-ebab4b912fe0.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1603,
      "end_line": 1607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1606,col 17)-(line 1606,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e683273a-43e0-4081-b84e-75c81f11eec9.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1615,
      "end_line": 1619,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1618,col 17)-(line 1618,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1622,
      "end_line": 1640,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1624,
      "end_line": 1627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1626,col 21)-(line 1626,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1635,
      "end_line": 1639,
      "comment": "\n                 * {@inheritDoc}\n                 *\n                 * @throws MathUnsupportedOperationException in all\n                 * circumstances.\n                 ",
      "child_ranges": [
        "(line 1638,col 21)-(line 1638,col 66)"
      ]
    }
  ]
}
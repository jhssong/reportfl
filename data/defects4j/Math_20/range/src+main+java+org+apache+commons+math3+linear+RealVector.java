{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 1632,
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
        "(line 235,col 9)-(line 235,col 46)",
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
        "(line 256,col 9)-(line 256,col 46)",
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
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
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
        "(line 418,col 9)-(line 418,col 46)",
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
        "(line 439,col 9)-(line 439,col 46)",
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
        "(line 459,col 9)-(line 459,col 46)",
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
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 774,
      "end_line": 808,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 39)",
        "(line 776,col 9)-(line 807,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-bc87d06a-82b7-4586-ad28-e700de32a42b.hasNext()",
      "begin_line": 785,
      "end_line": 787,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 786,col 17)-(line 786,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-02557096-0321-426b-bc8a-e76f6117f15f.next()",
      "begin_line": 790,
      "end_line": 797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 791,col 17)-(line 796,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ce08e9b9-18a3-42a6-9276-ca9d13ada01b.remove()",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all circumstances.\n             ",
      "child_ranges": [
        "(line 805,col 17)-(line 805,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 820,
      "end_line": 822,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 837,
      "end_line": 844,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 86)",
        "(line 839,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 859,
      "end_line": 862,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws DimensionMismatchException if {@code y} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 876,
      "end_line": 885,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws DimensionMismatchException if {@code y} is not the same size as\n     * {@code this} vector.\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 33)",
        "(line 879,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 897,
      "end_line": 904,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 39)",
        "(line 899,col 9)-(line 899,col 39)",
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 918,
      "end_line": 927,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 33)",
        "(line 922,col 9)-(line 922,col 50)",
        "(line 923,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 958,
      "end_line": 962,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 973,
      "end_line": 980,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process and modify the entries\n     * of this vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 39)",
        "(line 975,col 9)-(line 975,col 39)",
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 994,
      "end_line": 1003,
      "comment": "\n     * Visits (and possibly alters) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 33)",
        "(line 998,col 9)-(line 998,col 50)",
        "(line 999,col 9)-(line 1001,col 9)",
        "(line 1002,col 9)-(line 1002,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 1034,
      "end_line": 1038,
      "comment": "\n     * Visits (and possibly change) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws NumberIsTooSmallException if {@code end \u003c start}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1041,
      "end_line": 1085,
      "comment": " An entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 1043,
      "end_line": 1043,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 1046,
      "end_line": 1048,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1047,col 13)-(line 1047,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 1055,
      "end_line": 1057,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 1056,col 13)-(line 1056,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 1065,col 13)-(line 1065,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 1073,
      "end_line": 1075,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 1074,col 13)-(line 1074,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 1082,
      "end_line": 1084,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 1083,col 13)-(line 1083,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.equals(java.lang.Object)",
      "begin_line": 1109,
      "end_line": 1113,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two real vectors. If all coordinates of two real\n     * vectors are exactly the same, and none are {@code NaN}, the two real\n     * vectors are considered to be equal. {@code NaN} coordinates are\n     * considered to affect globally the vector and be equals to each other -\n     * i.e, if either (or all) coordinates of the real vector are equal to\n     * {@code NaN}, the real vector is equal to a vector with all {@code NaN}\n     * coordinates.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete subclasses of\n     * {@link RealVector} (the current implementation throws an exception).\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     * @throws MathUnsupportedOperationException if this method is not\n     * overridden.\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.hashCode()",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": "\n     * {@inheritDoc}. This method \u003cem\u003emust\u003c/em\u003e be overriden by concrete\n     * subclasses of {@link RealVector} (current implementation throws an\n     * exception).\n     *\n     * @throws MathUnsupportedOperationException if this method is not\n     * overridden.\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 1141,
      "end_line": 1200,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 1143,
      "end_line": 1143,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1145,
      "end_line": 1145,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1147,
      "end_line": 1147,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 1150,
      "end_line": 1157,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1151,col 13)-(line 1151,col 33)",
        "(line 1152,col 13)-(line 1152,col 34)",
        "(line 1153,col 13)-(line 1153,col 31)",
        "(line 1154,col 13)-(line 1156,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 1164,
      "end_line": 1174,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 1165,col 13)-(line 1167,col 13)",
        "(line 1168,col 13)-(line 1170,col 62)",
        "(line 1171,col 13)-(line 1173,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 1177,
      "end_line": 1179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1178,col 13)-(line 1178,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 1182,
      "end_line": 1190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1183,col 13)-(line 1183,col 40)",
        "(line 1184,col 13)-(line 1186,col 13)",
        "(line 1187,col 13)-(line 1187,col 36)",
        "(line 1188,col 13)-(line 1188,col 26)",
        "(line 1189,col 13)-(line 1189,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 1197,
      "end_line": 1199,
      "comment": "\n         * {@inheritDoc}\n         *\n         * @throws MathUnsupportedOperationException in all circumstances.\n         ",
      "child_ranges": [
        "(line 1198,col 13)-(line 1198,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1220,
      "end_line": 1631,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1630,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-69105b94-34a0-42dd-ae9c-32be000a0905.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1236,
      "end_line": 1240,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all circumstances.\n             ",
      "child_ranges": [
        "(line 1239,col 17)-(line 1239,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d3652df8-6dfc-46f8-9fcd-e026330bfac3.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1243,
      "end_line": 1246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1245,col 17)-(line 1245,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0925c87f-aa3e-4757-8e7b-34c05fd36d4f.iterator()",
      "begin_line": 1249,
      "end_line": 1277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1251,col 17)-(line 1251,col 55)",
        "(line 1252,col 17)-(line 1276,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1254,
      "end_line": 1254,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c83653ad-239e-4960-87ce-e9b5d71bc8e4.hasNext()",
      "begin_line": 1257,
      "end_line": 1259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1258,col 25)-(line 1258,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-67971e27-9d5b-4079-9733-1caaf49a2285.next()",
      "begin_line": 1262,
      "end_line": 1265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1263,col 25)-(line 1263,col 56)",
        "(line 1264,col 25)-(line 1264,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7d41d39b-1847-4705-81bb-80a6291ca7b9.remove()",
      "begin_line": 1273,
      "end_line": 1275,
      "comment": "\n                     * {@inheritDoc}\n                     *\n                     * @throws MathUnsupportedOperationException in all\n                     * circumstances.\n                     ",
      "child_ranges": [
        "(line 1274,col 25)-(line 1274,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a9163aaa-5a26-470f-a192-f6c3c9ea76f8.sparseIterator()",
      "begin_line": 1280,
      "end_line": 1310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1282,col 17)-(line 1282,col 61)",
        "(line 1284,col 17)-(line 1309,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0022e43e-b362-4240-94a9-b4f2f372b3a0.hasNext()",
      "begin_line": 1289,
      "end_line": 1291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1290,col 25)-(line 1290,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-97e25dce-7f1a-4849-bf79-b381674a3269.next()",
      "begin_line": 1294,
      "end_line": 1297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1295,col 25)-(line 1295,col 56)",
        "(line 1296,col 25)-(line 1296,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-39302c24-52e2-412c-9994-c535d831e3b9.remove()",
      "begin_line": 1305,
      "end_line": 1308,
      "comment": "\n                     * {@inheritDoc}\n                     *\n                     * @throws MathUnsupportedOperationException in all\n                     * circumstances.\n                     ",
      "child_ranges": [
        "(line 1307,col 25)-(line 1307,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b2402c32-9a92-42c7-a99d-e545fb749460.copy()",
      "begin_line": 1313,
      "end_line": 1316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1315,col 17)-(line 1315,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cc82eb4e-62e7-4b41-a21f-c3b7c458fce6.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1319,
      "end_line": 1323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1322,col 17)-(line 1322,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-87a44d73-5afa-47fa-91dd-918e1b5389e4.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1326,
      "end_line": 1330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1329,col 17)-(line 1329,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ca3646cc-7ca5-4275-b280-9e2887f86036.mapAdd(double)",
      "begin_line": 1333,
      "end_line": 1336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1335,col 17)-(line 1335,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-71704bf3-1217-4ca4-874b-f413b412b36f.mapAddToSelf(double)",
      "begin_line": 1344,
      "end_line": 1348,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1347,col 17)-(line 1347,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-17826096-03b5-47ca-8efb-d39b16be8bde.mapSubtract(double)",
      "begin_line": 1351,
      "end_line": 1354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1353,col 17)-(line 1353,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-59adc381-3abf-4594-815a-8da4a0a01fe8.mapSubtractToSelf(double)",
      "begin_line": 1362,
      "end_line": 1366,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1365,col 17)-(line 1365,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d67b3342-f024-43ba-9424-e77809fb8e5a.mapMultiply(double)",
      "begin_line": 1369,
      "end_line": 1372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1371,col 17)-(line 1371,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2948fac6-dc5f-48b1-a72f-ca24f89885b1.mapMultiplyToSelf(double)",
      "begin_line": 1380,
      "end_line": 1384,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1383,col 17)-(line 1383,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f3d11f60-4d48-49a4-8a17-11481cb4d3b0.mapDivide(double)",
      "begin_line": 1387,
      "end_line": 1390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1389,col 17)-(line 1389,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-00b99394-36f2-4ea2-be9a-901cae56d28c.mapDivideToSelf(double)",
      "begin_line": 1398,
      "end_line": 1402,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1401,col 17)-(line 1401,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-bd5d7ea2-e5c0-4b95-b73b-2359a94c69a7.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1405,
      "end_line": 1409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1408,col 17)-(line 1408,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e9c62283-291e-4c9e-aae3-d9666fe20588.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1412,
      "end_line": 1416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1415,col 17)-(line 1415,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f664b646-4cf9-4e3f-b678-54121c67dc10.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1419,
      "end_line": 1423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1422,col 17)-(line 1422,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6c0b86f7-f0bb-447e-87b4-3bb1d2e222ab.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1426,
      "end_line": 1430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1429,col 17)-(line 1429,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b8540e6a-2fe4-4415-8214-5e68745cd1b0.getNorm()",
      "begin_line": 1433,
      "end_line": 1436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1435,col 17)-(line 1435,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8aaead26-a450-4979-8900-baa9b53f39e7.getL1Norm()",
      "begin_line": 1439,
      "end_line": 1442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1441,col 17)-(line 1441,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f6b57be6-ef5a-48eb-a9f2-6131e598fd17.getLInfNorm()",
      "begin_line": 1445,
      "end_line": 1448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1447,col 17)-(line 1447,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9940afb9-e0bf-4fd3-838d-ffb2d6dcd53b.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1451,
      "end_line": 1455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1454,col 17)-(line 1454,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ebe86497-6b7c-41db-b7bf-13280ee1759b.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1458,
      "end_line": 1462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1461,col 17)-(line 1461,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-34967432-c35a-4c04-b7f1-5e3c7500be33.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1465,
      "end_line": 1469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1468,col 17)-(line 1468,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b9028953-9904-4675-812a-60c6a00a07b6.unitVector()",
      "begin_line": 1472,
      "end_line": 1475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1474,col 17)-(line 1474,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-176144ea-13c5-4757-9b84-a758f19709df.unitize()",
      "begin_line": 1483,
      "end_line": 1486,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1485,col 17)-(line 1485,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cdcfe703-eec9-4aa3-bd7e-95f42ecfd342.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1489,
      "end_line": 1492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1491,col 17)-(line 1491,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9f3c37c4-3374-4ead-b6aa-9ab3974c2739.getEntry(int)",
      "begin_line": 1495,
      "end_line": 1498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1497,col 17)-(line 1497,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-279ed090-8b26-4c79-8741-734c7df5db49.setEntry(int, double)",
      "begin_line": 1506,
      "end_line": 1510,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1509,col 17)-(line 1509,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e31ae844-774e-4f4c-a82b-c21c573a5670.addToEntry(int, double)",
      "begin_line": 1518,
      "end_line": 1522,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1521,col 17)-(line 1521,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1d1d4351-14d2-4474-8f03-09c455d5841e.getDimension()",
      "begin_line": 1525,
      "end_line": 1528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1527,col 17)-(line 1527,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-29ce18d1-7501-46ad-9132-80647d2ee867.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1531,
      "end_line": 1534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1533,col 17)-(line 1533,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8146326a-950b-48b9-a24e-3fcad89baf30.append(double)",
      "begin_line": 1537,
      "end_line": 1540,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1539,col 17)-(line 1539,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-87889939-76e2-4c5c-971b-181789de67bb.getSubVector(int, int)",
      "begin_line": 1543,
      "end_line": 1547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1546,col 17)-(line 1546,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-94bc3422-61ec-43b7-a91d-0c4527840658.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1555,
      "end_line": 1559,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1558,col 17)-(line 1558,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-22d530ca-4886-4675-a2a4-e54df5950c10.set(double)",
      "begin_line": 1567,
      "end_line": 1571,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1570,col 17)-(line 1570,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b95c5ee8-1870-4abd-8234-79e6cb7c0cc8.toArray()",
      "begin_line": 1574,
      "end_line": 1577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1576,col 17)-(line 1576,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-96e1c7f1-7ab7-439d-9568-e69bede5f724.isNaN()",
      "begin_line": 1580,
      "end_line": 1583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1582,col 17)-(line 1582,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-45cec00e-9348-4ac1-b396-9e485a2f2414.isInfinite()",
      "begin_line": 1586,
      "end_line": 1589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1588,col 17)-(line 1588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5714ea8d-ff64-4828-9511-cf316828ea80.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1592,
      "end_line": 1596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1595,col 17)-(line 1595,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b4fc3ad8-f834-44e3-900c-05eec1b18628.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1604,
      "end_line": 1608,
      "comment": "\n             * {@inheritDoc}\n             *\n             * @throws MathUnsupportedOperationException in all\n             * circumstances.\n             ",
      "child_ranges": [
        "(line 1607,col 17)-(line 1607,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1611,
      "end_line": 1629,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1613,
      "end_line": 1616,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1615,col 21)-(line 1615,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1624,
      "end_line": 1628,
      "comment": "\n                 * {@inheritDoc}\n                 *\n                 * @throws MathUnsupportedOperationException in all\n                 * circumstances.\n                 ",
      "child_ranges": [
        "(line 1627,col 21)-(line 1627,col 66)"
      ]
    }
  ]
}
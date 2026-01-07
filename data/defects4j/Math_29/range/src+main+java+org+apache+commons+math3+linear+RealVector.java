{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 1450,
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
      "end_line": 312,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 33)",
        "(line 305,col 9)-(line 305,col 21)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 307,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 38)",
        "(line 323,col 9)-(line 323,col 41)",
        "(line 325,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 340,
      "end_line": 340,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 350,
      "end_line": 350,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 366,
      "end_line": 376,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 33)",
        "(line 368,col 9)-(line 368,col 21)",
        "(line 369,col 9)-(line 369,col 40)",
        "(line 370,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getNorm()",
      "begin_line": 388,
      "end_line": 397,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 23)",
        "(line 390,col 9)-(line 390,col 46)",
        "(line 391,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Norm()",
      "begin_line": 409,
      "end_line": 417,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 24)",
        "(line 411,col 9)-(line 411,col 46)",
        "(line 412,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfNorm()",
      "begin_line": 429,
      "end_line": 437,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 24)",
        "(line 431,col 9)-(line 431,col 46)",
        "(line 432,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 450,
      "end_line": 459,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 33)",
        "(line 452,col 9)-(line 452,col 21)",
        "(line 453,col 9)-(line 453,col 40)",
        "(line 454,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 475,
      "end_line": 484,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 33)",
        "(line 477,col 9)-(line 477,col 21)",
        "(line 478,col 9)-(line 478,col 40)",
        "(line 479,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinIndex()",
      "begin_line": 492,
      "end_line": 504,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 29)",
        "(line 494,col 9)-(line 494,col 51)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinValue()",
      "begin_line": 512,
      "end_line": 515,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 43)",
        "(line 514,col 9)-(line 514,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxIndex()",
      "begin_line": 523,
      "end_line": 535,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
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
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxValue()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 43)",
        "(line 545,col 9)-(line 545,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiply(double)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtract(double)",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivide(double)",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 621,
      "end_line": 643,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 27)",
        "(line 623,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 50)",
        "(line 631,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 641,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 653,
      "end_line": 653,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.set(double)",
      "begin_line": 660,
      "end_line": 666,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 40)",
        "(line 662,col 9)-(line 665,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.toArray()",
      "begin_line": 675,
      "end_line": 682,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 33)",
        "(line 677,col 9)-(line 677,col 42)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitVector()",
      "begin_line": 691,
      "end_line": 695,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws ArithmeticException if the norm is {@code null}.\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 33)",
        "(line 693,col 9)-(line 693,col 23)",
        "(line 694,col 9)-(line 694,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitize()",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math3.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.sparseIterator()",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 737,
      "end_line": 763,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 39)",
        "(line 739,col 9)-(line 762,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 742,
      "end_line": 742,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 745,
      "end_line": 745,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d4efac8c-dfbe-4136-9124-9a0571ad38ea.hasNext()",
      "begin_line": 748,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 749,col 17)-(line 749,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8b76a9a3-0348-48e7-adc6-7dcd1be4bcab.next()",
      "begin_line": 753,
      "end_line": 756,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 17)-(line 754,col 32)",
        "(line 755,col 17)-(line 755,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-40fe82e8-8796-4597-a4df-6583fd8d9dff.remove()",
      "begin_line": 759,
      "end_line": 761,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 760,col 17)-(line 760,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 792,
      "end_line": 799,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 86)",
        "(line 794,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 798,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 814,
      "end_line": 816,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 830,
      "end_line": 838,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 33)",
        "(line 832,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 850,
      "end_line": 857,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 39)",
        "(line 852,col 9)-(line 852,col 39)",
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 871,
      "end_line": 879,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 33)",
        "(line 874,col 9)-(line 874,col 50)",
        "(line 875,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 878,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 910,
      "end_line": 913,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 924,
      "end_line": 931,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process and modify the entries\n     * of this vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 39)",
        "(line 926,col 9)-(line 926,col 39)",
        "(line 927,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 930,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 945,
      "end_line": 953,
      "comment": "\n     * Visits (and possibly alters) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 33)",
        "(line 948,col 9)-(line 948,col 50)",
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 966,
      "end_line": 968,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 984,
      "end_line": 987,
      "comment": "\n     * Visits (and possibly change) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 990,
      "end_line": 1034,
      "comment": " An entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 992,
      "end_line": 992,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 995,
      "end_line": 997,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 996,col 13)-(line 996,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 1004,
      "end_line": 1006,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 1005,col 13)-(line 1005,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 1013,
      "end_line": 1015,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 1014,col 13)-(line 1014,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 1022,
      "end_line": 1024,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 1023,col 13)-(line 1023,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 1031,
      "end_line": 1033,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 1032,col 13)-(line 1032,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 1049,
      "end_line": 1104,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 1051,
      "end_line": 1051,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1053,
      "end_line": 1053,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1055,
      "end_line": 1055,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 1058,
      "end_line": 1065,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1059,col 13)-(line 1059,col 33)",
        "(line 1060,col 13)-(line 1060,col 34)",
        "(line 1061,col 13)-(line 1061,col 31)",
        "(line 1062,col 13)-(line 1064,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 1072,
      "end_line": 1082,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 1073,col 13)-(line 1075,col 13)",
        "(line 1076,col 13)-(line 1078,col 62)",
        "(line 1079,col 13)-(line 1081,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 1085,
      "end_line": 1087,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1086,col 13)-(line 1086,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 1090,
      "end_line": 1098,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1091,col 13)-(line 1091,col 40)",
        "(line 1092,col 13)-(line 1094,col 13)",
        "(line 1095,col 13)-(line 1095,col 36)",
        "(line 1096,col 13)-(line 1096,col 26)",
        "(line 1097,col 13)-(line 1097,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 1101,
      "end_line": 1103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1102,col 13)-(line 1102,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1124,
      "end_line": 1449,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1448,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9a018bf2-7e40-4ef2-8acd-9f646088d905.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1136,
      "end_line": 1139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 17)-(line 1138,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d1854212-6ee9-497c-9cfa-9ec8c7d74599.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1142,
      "end_line": 1145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1144,col 17)-(line 1144,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-daaa3c4d-7859-489e-9f27-f2d246126bbc.iterator()",
      "begin_line": 1148,
      "end_line": 1171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1150,col 17)-(line 1150,col 55)",
        "(line 1151,col 17)-(line 1170,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1153,
      "end_line": 1153,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0be0d6f1-178d-47da-99be-88cbb34ccd6a.hasNext()",
      "begin_line": 1156,
      "end_line": 1158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1157,col 25)-(line 1157,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9d441772-2295-44f7-a672-c3a94a20baa8.next()",
      "begin_line": 1161,
      "end_line": 1164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 25)-(line 1162,col 56)",
        "(line 1163,col 25)-(line 1163,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-de7898fd-d692-44dc-855b-73ffa087e0c3.remove()",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1168,col 25)-(line 1168,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-56ca905d-f6cd-406b-b4db-c9214a868407.sparseIterator()",
      "begin_line": 1174,
      "end_line": 1198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1176,col 17)-(line 1176,col 61)",
        "(line 1178,col 17)-(line 1197,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1180,
      "end_line": 1180,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-bca30b6d-ee9f-4664-a6ac-3b8f84c3ba49.hasNext()",
      "begin_line": 1183,
      "end_line": 1185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1184,col 25)-(line 1184,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fa8ca1c0-0e4c-41e5-9668-f18395fd2a06.next()",
      "begin_line": 1188,
      "end_line": 1191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1189,col 25)-(line 1189,col 56)",
        "(line 1190,col 25)-(line 1190,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8bab7269-a03d-4dbd-b47a-ae7a8611b25c.remove()",
      "begin_line": 1194,
      "end_line": 1196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1195,col 25)-(line 1195,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4f6b4351-521b-4949-95a2-eaadefcd23b9.copy()",
      "begin_line": 1201,
      "end_line": 1204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1203,col 17)-(line 1203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-09d03f6e-fbdc-4c3c-bd79-e1e559b9cc7f.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1207,
      "end_line": 1210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1209,col 17)-(line 1209,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8bc7feef-e04b-4bde-ac60-4fd583a8d600.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1213,
      "end_line": 1216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1215,col 17)-(line 1215,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-67e37655-6bb7-4f60-8289-49a41d18a179.mapAdd(double)",
      "begin_line": 1219,
      "end_line": 1222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1221,col 17)-(line 1221,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-180fce19-ed2e-4d93-ab77-921dca61881b.mapAddToSelf(double)",
      "begin_line": 1225,
      "end_line": 1228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1227,col 17)-(line 1227,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-30e7aa1b-aa28-4d75-90f4-680cd7104012.mapSubtract(double)",
      "begin_line": 1231,
      "end_line": 1234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1233,col 17)-(line 1233,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a483ca1c-7611-48d2-9849-bb41a9cb0129.mapSubtractToSelf(double)",
      "begin_line": 1237,
      "end_line": 1240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1239,col 17)-(line 1239,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a88b4ec8-2073-428c-bf6d-b09fd72d294b.mapMultiply(double)",
      "begin_line": 1243,
      "end_line": 1246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1245,col 17)-(line 1245,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c937ee2e-fa44-4909-a798-5d6f84d752d7.mapMultiplyToSelf(double)",
      "begin_line": 1249,
      "end_line": 1252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1251,col 17)-(line 1251,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-931eb601-de8e-4ef5-9cc5-3046c5f15a76.mapDivide(double)",
      "begin_line": 1255,
      "end_line": 1258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1257,col 17)-(line 1257,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f46936c2-2370-464a-a62e-3e96ca7a496c.mapDivideToSelf(double)",
      "begin_line": 1261,
      "end_line": 1264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1263,col 17)-(line 1263,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f5153440-7466-4bc0-a496-e3c5a4dbb43e.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1267,
      "end_line": 1270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1269,col 17)-(line 1269,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8e39247d-a723-43a1-8a86-bf410b91fed7.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1273,
      "end_line": 1276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1275,col 17)-(line 1275,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d5a5f2d5-abc4-4747-8b77-d26bbb04cf15.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1279,
      "end_line": 1282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1281,col 17)-(line 1281,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-6a367fba-dc9c-4729-b681-179c660c6d9e.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1285,
      "end_line": 1288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1287,col 17)-(line 1287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c6b0e294-9a4b-450e-b57c-277e3bb619d2.getNorm()",
      "begin_line": 1291,
      "end_line": 1294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1293,col 17)-(line 1293,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7865dd68-3bdf-4361-9505-951c41485ee9.getL1Norm()",
      "begin_line": 1297,
      "end_line": 1300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1299,col 17)-(line 1299,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-55168f89-1f8d-4a0d-a1ea-b3fdfe63f6af.getLInfNorm()",
      "begin_line": 1303,
      "end_line": 1306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1305,col 17)-(line 1305,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-70314c52-4fa5-41cb-8eed-72baf85c6c11.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1309,
      "end_line": 1312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1311,col 17)-(line 1311,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a83811a9-9af5-4ab8-a8ba-41297827e3e4.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1315,
      "end_line": 1318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1317,col 17)-(line 1317,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4a4b8db3-3572-4f9d-8ce6-3722733e6935.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1321,
      "end_line": 1324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1323,col 17)-(line 1323,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d3a4925e-f9de-4eed-9916-dfe76d2e0767.unitVector()",
      "begin_line": 1327,
      "end_line": 1330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1329,col 17)-(line 1329,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1f90757d-19ec-4c94-9ae0-78e4be5f77ad.unitize()",
      "begin_line": 1333,
      "end_line": 1336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1335,col 17)-(line 1335,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-fe77e54a-f71c-476f-bc94-b1f659d419ff.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1339,
      "end_line": 1342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1341,col 17)-(line 1341,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-3fbfec04-e1a4-4b86-8220-7e0477e3abb8.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1345,
      "end_line": 1348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1347,col 17)-(line 1347,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2230560c-1844-407a-9c7e-0f7273c33a20.getEntry(int)",
      "begin_line": 1351,
      "end_line": 1354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1353,col 17)-(line 1353,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-7650ebae-9152-42f4-9733-367fb7ce8512.setEntry(int, double)",
      "begin_line": 1357,
      "end_line": 1360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1359,col 17)-(line 1359,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-bc377f52-748c-4810-82a9-c6b83d7a1ff4.addToEntry(int, double)",
      "begin_line": 1363,
      "end_line": 1366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1365,col 17)-(line 1365,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2d02fca0-3ce7-41a2-8c80-cff42529cc34.getDimension()",
      "begin_line": 1369,
      "end_line": 1372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1371,col 17)-(line 1371,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a53eae0b-45e0-4451-8cab-3c9ae8ce9835.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1375,
      "end_line": 1378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1377,col 17)-(line 1377,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a20efed5-1e3b-48c1-9183-623b1b92b2f9.append(double)",
      "begin_line": 1381,
      "end_line": 1384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1383,col 17)-(line 1383,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e0e2a810-3fa0-4338-902a-9611f17d1cc8.getSubVector(int, int)",
      "begin_line": 1387,
      "end_line": 1390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1389,col 17)-(line 1389,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-82a79b13-ef46-4349-8529-7b6a6e4a827b.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1393,
      "end_line": 1396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1395,col 17)-(line 1395,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-3647aabc-7c83-447d-be8a-a089abe5c08a.set(double)",
      "begin_line": 1399,
      "end_line": 1402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1401,col 17)-(line 1401,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-631db6c0-92b8-403b-a0cc-8870cc4c40b5.toArray()",
      "begin_line": 1405,
      "end_line": 1408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1407,col 17)-(line 1407,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-305d5596-dbcc-4a87-839a-228c17169766.isNaN()",
      "begin_line": 1411,
      "end_line": 1414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1413,col 17)-(line 1413,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9014ddc9-bec4-4811-acac-ab0c50e0082d.isInfinite()",
      "begin_line": 1417,
      "end_line": 1420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1419,col 17)-(line 1419,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-95cafd33-cf3b-46fe-aa60-fd8e3acca395.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1423,
      "end_line": 1426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1425,col 17)-(line 1425,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-292833df-7e2a-4f6a-8059-86b8ca5cd834.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1429,
      "end_line": 1432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1431,col 17)-(line 1431,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1435,
      "end_line": 1447,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1437,
      "end_line": 1440,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1439,col 21)-(line 1439,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1443,
      "end_line": 1446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1445,col 21)-(line 1445,col 66)"
      ]
    }
  ]
}
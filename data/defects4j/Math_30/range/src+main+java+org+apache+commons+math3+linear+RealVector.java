{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 1448,
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
      "end_line": 239,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 250,
      "end_line": 259,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 37)",
        "(line 252,col 9)-(line 252,col 46)",
        "(line 253,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAdd(double)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 279,
      "end_line": 284,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.copy()",
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 301,
      "end_line": 310,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 33)",
        "(line 303,col 9)-(line 303,col 21)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 319,
      "end_line": 328,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 38)",
        "(line 321,col 9)-(line 321,col 41)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 338,
      "end_line": 338,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 348,
      "end_line": 348,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 364,
      "end_line": 374,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 33)",
        "(line 366,col 9)-(line 366,col 21)",
        "(line 367,col 9)-(line 367,col 40)",
        "(line 368,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getNorm()",
      "begin_line": 386,
      "end_line": 395,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 23)",
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Norm()",
      "begin_line": 407,
      "end_line": 415,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 24)",
        "(line 409,col 9)-(line 409,col 46)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfNorm()",
      "begin_line": 427,
      "end_line": 435,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 24)",
        "(line 429,col 9)-(line 429,col 46)",
        "(line 430,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 448,
      "end_line": 457,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 33)",
        "(line 450,col 9)-(line 450,col 21)",
        "(line 451,col 9)-(line 451,col 40)",
        "(line 452,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 473,
      "end_line": 482,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
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
      "signature": "org.apache.commons.math3.linear.RealVector.getMinIndex()",
      "begin_line": 490,
      "end_line": 502,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 29)",
        "(line 492,col 9)-(line 492,col 51)",
        "(line 493,col 9)-(line 493,col 46)",
        "(line 494,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinValue()",
      "begin_line": 510,
      "end_line": 513,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 43)",
        "(line 512,col 9)-(line 512,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxIndex()",
      "begin_line": 521,
      "end_line": 533,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 29)",
        "(line 523,col 9)-(line 523,col 51)",
        "(line 524,col 9)-(line 524,col 46)",
        "(line 525,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxValue()",
      "begin_line": 541,
      "end_line": 544,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 43)",
        "(line 543,col 9)-(line 543,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiply(double)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtract(double)",
      "begin_line": 576,
      "end_line": 578,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivide(double)",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 619,
      "end_line": 641,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 27)",
        "(line 621,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 50)",
        "(line 629,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 651,
      "end_line": 651,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.set(double)",
      "begin_line": 658,
      "end_line": 664,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 40)",
        "(line 660,col 9)-(line 663,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.toArray()",
      "begin_line": 673,
      "end_line": 680,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 33)",
        "(line 675,col 9)-(line 675,col 42)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitVector()",
      "begin_line": 689,
      "end_line": 693,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws ArithmeticException if the norm is {@code null}.\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 33)",
        "(line 691,col 9)-(line 691,col 23)",
        "(line 692,col 9)-(line 692,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitize()",
      "begin_line": 702,
      "end_line": 704,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math3.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.sparseIterator()",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 735,
      "end_line": 761,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 39)",
        "(line 737,col 9)-(line 760,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 740,
      "end_line": 740,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 743,
      "end_line": 743,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c6a0ce0e-d3b4-41ad-b4a1-603c328c75d6.hasNext()",
      "begin_line": 746,
      "end_line": 748,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 747,col 17)-(line 747,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1a96cc77-80ec-4884-9d0a-f09692b783ec.next()",
      "begin_line": 751,
      "end_line": 754,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 752,col 17)-(line 752,col 32)",
        "(line 753,col 17)-(line 753,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b8a1f32b-5ba2-4ed5-9bfe-c730bcb51fd1.remove()",
      "begin_line": 757,
      "end_line": 759,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 758,col 17)-(line 758,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 773,
      "end_line": 775,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 790,
      "end_line": 797,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 86)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 828,
      "end_line": 836,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 33)",
        "(line 830,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 848,
      "end_line": 855,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 39)",
        "(line 850,col 9)-(line 850,col 39)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 869,
      "end_line": 877,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 33)",
        "(line 872,col 9)-(line 872,col 50)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 890,
      "end_line": 892,
      "comment": "\n     * Visits (but does not alter) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 908,
      "end_line": 911,
      "comment": "\n     * Visits (but does not alter) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorPreservingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 922,
      "end_line": 929,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor the visitor to be used to process and modify the entries\n     * of this vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 39)",
        "(line 924,col 9)-(line 924,col 39)",
        "(line 925,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 943,
      "end_line": 951,
      "comment": "\n     * Visits (and possibly alters) some entries of this vector in default order\n     * (increasing index).\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 33)",
        "(line 946,col 9)-(line 946,col 50)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 964,
      "end_line": 966,
      "comment": "\n     * Visits (and possibly alters) all entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor the visitor to be used to process the entries of this\n     * vector\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 982,
      "end_line": 985,
      "comment": "\n     * Visits (and possibly change) some entries of this vector in optimized\n     * order. The order in which the entries are visited is selected so as to\n     * lead to the most efficient implementation; it might depend on the\n     * concrete implementation of this abstract class.\n     *\n     * @param visitor visitor to be used to process the entries of this vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     * @return the value returned by {@link RealVectorChangingVisitor#end()}\n     * at the end of the walk\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 988,
      "end_line": 1032,
      "comment": " An entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 993,
      "end_line": 995,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 994,col 13)-(line 994,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 1003,col 13)-(line 1003,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 1011,
      "end_line": 1013,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 1012,col 13)-(line 1012,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 1020,
      "end_line": 1022,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 1021,col 13)-(line 1021,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 1029,
      "end_line": 1031,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 1030,col 13)-(line 1030,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 1047,
      "end_line": 1102,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 1049,
      "end_line": 1049,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1051,
      "end_line": 1051,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1053,
      "end_line": 1053,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 1056,
      "end_line": 1063,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 1057,col 13)-(line 1057,col 33)",
        "(line 1058,col 13)-(line 1058,col 34)",
        "(line 1059,col 13)-(line 1059,col 31)",
        "(line 1060,col 13)-(line 1062,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 1070,
      "end_line": 1080,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 1071,col 13)-(line 1073,col 13)",
        "(line 1074,col 13)-(line 1076,col 62)",
        "(line 1077,col 13)-(line 1079,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 1083,
      "end_line": 1085,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1084,col 13)-(line 1084,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 1088,
      "end_line": 1096,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1089,col 13)-(line 1089,col 40)",
        "(line 1090,col 13)-(line 1092,col 13)",
        "(line 1093,col 13)-(line 1093,col 36)",
        "(line 1094,col 13)-(line 1094,col 26)",
        "(line 1095,col 13)-(line 1095,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 1099,
      "end_line": 1101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1100,col 13)-(line 1100,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1122,
      "end_line": 1447,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1446,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d4ff3183-9f3f-45cf-aba1-eb93a64089de.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1134,
      "end_line": 1137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1136,col 17)-(line 1136,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5b247043-b5a7-48a7-a936-34a3b7a0265b.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 1140,
      "end_line": 1143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1142,col 17)-(line 1142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-650233e0-7c98-42ef-b971-e38e6b5d9f04.iterator()",
      "begin_line": 1146,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1148,col 17)-(line 1148,col 55)",
        "(line 1149,col 17)-(line 1168,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1151,
      "end_line": 1151,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ad29900a-0dd9-4801-929a-82089f42f87b.hasNext()",
      "begin_line": 1154,
      "end_line": 1156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1155,col 25)-(line 1155,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1316671d-3469-49c8-9eb6-0310be277fba.next()",
      "begin_line": 1159,
      "end_line": 1162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1160,col 25)-(line 1160,col 56)",
        "(line 1161,col 25)-(line 1161,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c9ba91c7-d1fb-4a78-beb3-7d39a7e259d0.remove()",
      "begin_line": 1165,
      "end_line": 1167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1166,col 25)-(line 1166,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c8703b23-d91b-4b98-8b06-31658a791e98.sparseIterator()",
      "begin_line": 1172,
      "end_line": 1196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1174,col 17)-(line 1174,col 61)",
        "(line 1176,col 17)-(line 1195,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1178,
      "end_line": 1178,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5ccc7b96-fc03-4cd2-a046-ca16db9c9f12.hasNext()",
      "begin_line": 1181,
      "end_line": 1183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1182,col 25)-(line 1182,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c5bce849-10ee-497f-9e4a-212d2c19f35e.next()",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1187,col 25)-(line 1187,col 56)",
        "(line 1188,col 25)-(line 1188,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-408abf8f-af57-41a9-a6cf-7e75449c0949.remove()",
      "begin_line": 1192,
      "end_line": 1194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1193,col 25)-(line 1193,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-131f4636-0040-4306-b29d-bd59d00887f0.copy()",
      "begin_line": 1199,
      "end_line": 1202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1201,col 17)-(line 1201,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8864abce-d378-4e73-abc3-998b79dd2660.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1205,
      "end_line": 1208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1207,col 17)-(line 1207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-174355c6-17c7-491e-8218-bf28c20874ed.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1211,
      "end_line": 1214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1213,col 17)-(line 1213,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b0aa4a18-39ee-46ee-8cd0-bcddb7acb269.mapAdd(double)",
      "begin_line": 1217,
      "end_line": 1220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1219,col 17)-(line 1219,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d1f9556d-6c8e-41db-96b8-f71ccca34871.mapAddToSelf(double)",
      "begin_line": 1223,
      "end_line": 1226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1225,col 17)-(line 1225,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-68a4c883-006e-45b3-a323-c860de3cf156.mapSubtract(double)",
      "begin_line": 1229,
      "end_line": 1232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1231,col 17)-(line 1231,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-360b0298-d726-4743-8166-b4055eadf1dc.mapSubtractToSelf(double)",
      "begin_line": 1235,
      "end_line": 1238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1237,col 17)-(line 1237,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-99e50c90-e572-40fd-99aa-3089a2332511.mapMultiply(double)",
      "begin_line": 1241,
      "end_line": 1244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1243,col 17)-(line 1243,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e95cda22-ef75-44c5-bece-0469650b981c.mapMultiplyToSelf(double)",
      "begin_line": 1247,
      "end_line": 1250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1249,col 17)-(line 1249,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f88c03d2-c957-4c66-a24f-4585b608029c.mapDivide(double)",
      "begin_line": 1253,
      "end_line": 1256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1255,col 17)-(line 1255,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-05f5782e-9a39-4dba-a754-c5e2ec3866d5.mapDivideToSelf(double)",
      "begin_line": 1259,
      "end_line": 1262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1261,col 17)-(line 1261,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-591cf7dc-1b44-4e13-baa0-60a189181e35.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1265,
      "end_line": 1268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1267,col 17)-(line 1267,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5fe6d23c-bbbf-4ca8-869b-dc804f95dbb9.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1271,
      "end_line": 1274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1273,col 17)-(line 1273,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-3716cf80-c347-4d0b-b743-f9923777affd.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1277,
      "end_line": 1280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1279,col 17)-(line 1279,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b8f8755c-9b9e-4853-b093-7433f8049c81.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1283,
      "end_line": 1286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1285,col 17)-(line 1285,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-879b9e23-6517-481d-91b0-efd91fa14df2.getNorm()",
      "begin_line": 1289,
      "end_line": 1292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1291,col 17)-(line 1291,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c45fff19-9095-4238-9cbd-bd522649bfbd.getL1Norm()",
      "begin_line": 1295,
      "end_line": 1298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1297,col 17)-(line 1297,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e376bf2e-52fb-40c1-bcda-4954a108aafb.getLInfNorm()",
      "begin_line": 1301,
      "end_line": 1304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1303,col 17)-(line 1303,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-0476474f-cc99-4e6b-8d1b-beb81081c848.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1307,
      "end_line": 1310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1309,col 17)-(line 1309,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c44fe759-f00b-4238-8c7b-04ef82927feb.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1313,
      "end_line": 1316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1315,col 17)-(line 1315,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ba4c3d5d-3fdd-4cf0-b6fc-19d6f34db6c2.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1319,
      "end_line": 1322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1321,col 17)-(line 1321,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-dcdb2b5c-7d2a-4ec5-afe7-d852fec9dcba.unitVector()",
      "begin_line": 1325,
      "end_line": 1328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1327,col 17)-(line 1327,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ecb7c623-4a7e-4530-846a-b78123046563.unitize()",
      "begin_line": 1331,
      "end_line": 1334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1333,col 17)-(line 1333,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d260c765-6935-47d6-ac0a-a76236638ee5.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1337,
      "end_line": 1340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1339,col 17)-(line 1339,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ea0c8de0-f202-41c3-9186-b5f6779f5e26.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1343,
      "end_line": 1346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1345,col 17)-(line 1345,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a16945f6-2ec7-4ecc-8cf5-4d8395b7c7f3.getEntry(int)",
      "begin_line": 1349,
      "end_line": 1352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1351,col 17)-(line 1351,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-54c31fa0-d7e4-4d01-a4a2-40302e27a7a8.setEntry(int, double)",
      "begin_line": 1355,
      "end_line": 1358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1357,col 17)-(line 1357,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a76c5d54-068e-498b-bf62-e55c5dbe0467.addToEntry(int, double)",
      "begin_line": 1361,
      "end_line": 1364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1363,col 17)-(line 1363,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e61000e0-2e4c-4c05-94b5-17516515e5d1.getDimension()",
      "begin_line": 1367,
      "end_line": 1370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1369,col 17)-(line 1369,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c762fffa-0b95-425f-b2e3-c934b1faed39.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1373,
      "end_line": 1376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1375,col 17)-(line 1375,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a4519e92-7046-4a05-9721-7f536395215a.append(double)",
      "begin_line": 1379,
      "end_line": 1382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1381,col 17)-(line 1381,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8352c53c-bba0-4d55-b27f-be5008279c43.getSubVector(int, int)",
      "begin_line": 1385,
      "end_line": 1388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1387,col 17)-(line 1387,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-cbfadf79-9d0c-45c2-b51c-902b7b43b384.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1391,
      "end_line": 1394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1393,col 17)-(line 1393,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-05e145c1-526f-48cb-88df-b7d29d5d1771.set(double)",
      "begin_line": 1397,
      "end_line": 1400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1399,col 17)-(line 1399,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b0eb723e-6f3a-4d1a-8719-acf15f631f0c.toArray()",
      "begin_line": 1403,
      "end_line": 1406,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1405,col 17)-(line 1405,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b15b6c7f-73e5-4c40-92b6-c5ac7a7f1a40.isNaN()",
      "begin_line": 1409,
      "end_line": 1412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1411,col 17)-(line 1411,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-4eef19f9-0eeb-4e14-af3e-3e64f3eb9f1b.isInfinite()",
      "begin_line": 1415,
      "end_line": 1418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1417,col 17)-(line 1417,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a98872a5-f4f3-4790-a800-be30e144210d.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1421,
      "end_line": 1424,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1423,col 17)-(line 1423,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-44f950e0-ba6e-4317-b523-af25096cbc65.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1427,
      "end_line": 1430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1429,col 17)-(line 1429,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1433,
      "end_line": 1445,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1435,
      "end_line": 1438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1437,col 21)-(line 1437,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1441,
      "end_line": 1444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1443,col 21)-(line 1443,col 66)"
      ]
    }
  ]
}
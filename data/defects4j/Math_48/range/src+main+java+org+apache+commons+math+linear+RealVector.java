{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 1267,
      "comment": "\n * Class defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., {@code getEntry(0)}\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@code code map} and {@code mapToSelf} methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The {@code map}\n * versions create a new vector to hold the result and do not change the instance.\n * The {@code mapToSelf} version uses the instance itself to store the\n * results, so the instance is changed by this method. In all cases, the result\n * vector is returned by the methods, allowing the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.4).mapToSelf(new Tan()).mapToSelf(new Power(2.3));\n * \u003c/pre\u003e\n *\n * @version $Id$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDimension()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Returns the size of the vector.\n     *\n     * @return the size of this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getEntry(int)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Return the entry at the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setEntry(int, double)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Set a single element.\n     *\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Construct a new vector by appending a vector to this vector.\n     *\n     * @param v vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Construct a new vector by appending a double to this vector.\n     *\n     * @param d double to append.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getSubVector(int, int)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Get a subvector from consecutive elements.\n     *\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Set a sequence of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isNaN()",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Check whether any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isInfinite()",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.checkVectorDimensions(int)",
      "begin_line": 159,
      "end_line": 164,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 31)",
        "(line 161,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.checkIndex(int)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 46)",
        "(line 192,col 9)-(line 192,col 16)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 209,
      "end_line": 218,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 37)",
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 16)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAdd(double)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.copy()",
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 260,
      "end_line": 269,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 33)",
        "(line 262,col 9)-(line 262,col 21)",
        "(line 263,col 9)-(line 263,col 46)",
        "(line 264,col 9)-(line 264,col 16)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 278,
      "end_line": 287,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 280,col 41)",
        "(line 282,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 307,
      "end_line": 307,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 323,
      "end_line": 333,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 33)",
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 40)",
        "(line 327,col 9)-(line 327,col 16)",
        "(line 328,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getNorm()",
      "begin_line": 345,
      "end_line": 354,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 23)",
        "(line 347,col 9)-(line 347,col 46)",
        "(line 348,col 9)-(line 348,col 16)",
        "(line 349,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Norm()",
      "begin_line": 366,
      "end_line": 374,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 24)",
        "(line 368,col 9)-(line 368,col 46)",
        "(line 369,col 9)-(line 369,col 16)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfNorm()",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 24)",
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 389,col 16)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 407,
      "end_line": 416,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 33)",
        "(line 409,col 9)-(line 409,col 21)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 411,col 16)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 432,
      "end_line": 441,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 33)",
        "(line 434,col 9)-(line 434,col 21)",
        "(line 435,col 9)-(line 435,col 40)",
        "(line 436,col 9)-(line 436,col 16)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getMinIndex()",
      "begin_line": 449,
      "end_line": 461,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 29)",
        "(line 451,col 9)-(line 451,col 51)",
        "(line 452,col 9)-(line 452,col 46)",
        "(line 453,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getMinValue()",
      "begin_line": 469,
      "end_line": 472,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 43)",
        "(line 471,col 9)-(line 471,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getMaxIndex()",
      "begin_line": 480,
      "end_line": 492,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 29)",
        "(line 482,col 9)-(line 482,col 51)",
        "(line 483,col 9)-(line 483,col 46)",
        "(line 484,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getMaxValue()",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 43)",
        "(line 502,col 9)-(line 502,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiply(double)",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtract(double)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivide(double)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 578,
      "end_line": 600,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 27)",
        "(line 580,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 50)",
        "(line 588,col 9)-(line 588,col 27)",
        "(line 589,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 610,
      "end_line": 610,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.set(double)",
      "begin_line": 617,
      "end_line": 623,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 40)",
        "(line 619,col 9)-(line 619,col 23)",
        "(line 620,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.toArray()",
      "begin_line": 632,
      "end_line": 639,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 33)",
        "(line 634,col 9)-(line 634,col 42)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getData()",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitVector()",
      "begin_line": 659,
      "end_line": 663,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws ArithmeticException if the norm is {@code null}.\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 33)",
        "(line 661,col 9)-(line 661,col 23)",
        "(line 662,col 9)-(line 662,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitize()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.sparseIterator()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.iterator()",
      "begin_line": 697,
      "end_line": 723,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 39)",
        "(line 699,col 9)-(line 722,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 702,
      "end_line": 702,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 705,
      "end_line": 705,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-17e35f6f-53e1-4684-96bd-530b3fd8be1a.hasNext()",
      "begin_line": 708,
      "end_line": 710,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 17)-(line 709,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-894b97a9-8a44-4502-b3f8-307e45a1df49.next()",
      "begin_line": 713,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 714,col 17)-(line 714,col 32)",
        "(line 715,col 17)-(line 715,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9bf95915-f78f-41b6-925b-bf887d7448c5.remove()",
      "begin_line": 719,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 17)-(line 720,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     * @throws org.apache.commons.math.exception.MathUserException\n     * if the function throws it.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 756,
      "end_line": 763,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     * @throws org.apache.commons.math.exception.MathUserException\n     * if the function throws it.\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 86)",
        "(line 758,col 9)-(line 758,col 16)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 794,
      "end_line": 802,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 33)",
        "(line 796,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 807,
      "end_line": 851,
      "comment": "\n     *  An entry in the vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 809,
      "end_line": 809,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.Entry()",
      "begin_line": 812,
      "end_line": 814,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getValue()",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 822,col 13)-(line 822,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setValue(double)",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 831,col 13)-(line 831,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getIndex()",
      "begin_line": 839,
      "end_line": 841,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 840,col 13)-(line 840,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 866,
      "end_line": 921,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 868,
      "end_line": 868,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 870,
      "end_line": 870,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 872,
      "end_line": 872,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 875,
      "end_line": 882,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 876,col 13)-(line 876,col 33)",
        "(line 877,col 13)-(line 877,col 34)",
        "(line 878,col 13)-(line 878,col 31)",
        "(line 879,col 13)-(line 881,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.RealVector.Entry)",
      "begin_line": 889,
      "end_line": 899,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 890,col 13)-(line 892,col 13)",
        "(line 893,col 13)-(line 895,col 62)",
        "(line 896,col 13)-(line 898,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 902,
      "end_line": 904,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 13)-(line 903,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 907,
      "end_line": 915,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 908,col 13)-(line 908,col 40)",
        "(line 909,col 13)-(line 911,col 13)",
        "(line 912,col 13)-(line 912,col 36)",
        "(line 913,col 13)-(line 913,col 26)",
        "(line 914,col 13)-(line 914,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 918,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 919,col 13)-(line 919,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unmodifiableRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 941,
      "end_line": 1266,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 1265,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-696c6afa-6a9e-4531-b67b-c05a3ff73577.getData()",
      "begin_line": 953,
      "end_line": 956,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 955,col 17)-(line 955,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-af47fdd1-a290-4cf0-8ad5-daef2f2bf78d.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 959,
      "end_line": 962,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 961,col 17)-(line 961,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-eb042a16-01c1-4a64-9dc8-71f7e5ac2f45.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 965,
      "end_line": 968,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 967,col 17)-(line 967,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-b781454c-588e-4b09-a4b2-923b595f5b07.iterator()",
      "begin_line": 971,
      "end_line": 994,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 973,col 17)-(line 973,col 55)",
        "(line 974,col 17)-(line 993,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-89f84f98-70a0-4556-a871-57e947b23434.hasNext()",
      "begin_line": 979,
      "end_line": 981,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 980,col 25)-(line 980,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-7ea4be84-3bd5-4017-9011-7f1d63c7df67.next()",
      "begin_line": 984,
      "end_line": 987,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 985,col 25)-(line 985,col 56)",
        "(line 986,col 25)-(line 986,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-5c6184c4-d831-4d10-875f-83ed8525d359.remove()",
      "begin_line": 990,
      "end_line": 992,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 991,col 25)-(line 991,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ed2a6798-fccd-4f45-b7b5-e44415bda357.sparseIterator()",
      "begin_line": 997,
      "end_line": 1021,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 999,col 17)-(line 999,col 61)",
        "(line 1001,col 17)-(line 1020,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 1003,
      "end_line": 1003,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d02233de-dbcf-402e-8b46-c6d508832d35.hasNext()",
      "begin_line": 1006,
      "end_line": 1008,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1007,col 25)-(line 1007,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a4d87b4f-bb75-4c40-98d4-061459e4b05d.next()",
      "begin_line": 1011,
      "end_line": 1014,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1012,col 25)-(line 1012,col 56)",
        "(line 1013,col 25)-(line 1013,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-3663bc09-0d51-4520-9cdc-02c7c9c64066.remove()",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1018,col 25)-(line 1018,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-fb627c16-16de-4c34-afd5-2a7da1183ec3.copy()",
      "begin_line": 1024,
      "end_line": 1027,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1026,col 17)-(line 1026,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-235f2ff6-7790-41bf-9385-8f480c0660d1.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1030,
      "end_line": 1033,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1032,col 17)-(line 1032,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a667ef67-abc4-49f8-974a-5f7a0fd8c5d9.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1036,
      "end_line": 1039,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1038,col 17)-(line 1038,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-38a7b5ef-08f1-4eb0-baeb-e0689f6916f3.mapAdd(double)",
      "begin_line": 1042,
      "end_line": 1045,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1044,col 17)-(line 1044,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c50cbf4c-f030-4514-9fc8-86c51d1791bc.mapAddToSelf(double)",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1050,col 17)-(line 1050,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-df05a109-0508-4932-a089-b3732b98aef3.mapSubtract(double)",
      "begin_line": 1054,
      "end_line": 1057,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1056,col 17)-(line 1056,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-fab46b7f-9b0c-4e36-8432-189eb5fc89f6.mapSubtractToSelf(double)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1062,col 17)-(line 1062,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9c3e2a7e-973d-445f-bc17-3e945f699477.mapMultiply(double)",
      "begin_line": 1066,
      "end_line": 1069,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1068,col 17)-(line 1068,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-23d50615-71da-4461-946f-09f4a4a9f3dd.mapMultiplyToSelf(double)",
      "begin_line": 1072,
      "end_line": 1075,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1074,col 17)-(line 1074,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1cdfd7f9-bdb8-4269-b1b0-60bb151a4d6d.mapDivide(double)",
      "begin_line": 1078,
      "end_line": 1081,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1080,col 17)-(line 1080,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-488fb0ca-cfb2-4712-b242-8fe32b3961b8.mapDivideToSelf(double)",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1086,col 17)-(line 1086,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ebac50b8-7d30-40f2-985c-7b96516910b5.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1092,col 17)-(line 1092,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a2923419-191b-4854-9208-1cc9fcf98cb6.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1096,
      "end_line": 1099,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1098,col 17)-(line 1098,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1ceef108-e904-4095-a0e9-65257d200d9c.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1102,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1104,col 17)-(line 1104,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e6c07867-59b2-4cf8-a362-1518fc65658e.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1108,
      "end_line": 1111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1110,col 17)-(line 1110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-fa848b9f-b8b2-4b52-81f0-1fb3582b4d0f.getNorm()",
      "begin_line": 1114,
      "end_line": 1117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1116,col 17)-(line 1116,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-29aa599a-bb77-4a86-9de5-9dcf1424e340.getL1Norm()",
      "begin_line": 1120,
      "end_line": 1123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1122,col 17)-(line 1122,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e12c18d3-a904-4c95-96e7-e4be73030dcc.getLInfNorm()",
      "begin_line": 1126,
      "end_line": 1129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1128,col 17)-(line 1128,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-927ed624-5fef-4cda-b815-e3dfa6c63b74.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1132,
      "end_line": 1135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1134,col 17)-(line 1134,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-96181ec0-a665-4fff-8f2e-ee30a1f96a20.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1138,
      "end_line": 1141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1140,col 17)-(line 1140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d222510a-7e89-435e-88f9-d0ec0367ef28.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1144,
      "end_line": 1147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1146,col 17)-(line 1146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-530e7bca-1a5a-40c4-8f19-c8c43abb4a3b.unitVector()",
      "begin_line": 1150,
      "end_line": 1153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1152,col 17)-(line 1152,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-51cbd401-d69f-4cc6-8373-dfa68cce7a89.unitize()",
      "begin_line": 1156,
      "end_line": 1159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1158,col 17)-(line 1158,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-0fa68224-891e-4ec6-ad80-a92ba3e8f7df.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1162,
      "end_line": 1165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1164,col 17)-(line 1164,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-37e63eb9-6beb-4069-9b9a-b5e2b1af83e5.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1168,
      "end_line": 1171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1170,col 17)-(line 1170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-bd5e7e57-4cea-4b50-9c8a-b9b4b9486337.getEntry(int)",
      "begin_line": 1174,
      "end_line": 1177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1176,col 17)-(line 1176,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-7468db64-abad-45fb-86b2-09a720e72ba8.setEntry(int, double)",
      "begin_line": 1180,
      "end_line": 1183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1182,col 17)-(line 1182,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-706ed511-2ee4-4f72-a752-1aa153a7bc9c.getDimension()",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1188,col 17)-(line 1188,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-2bc73bee-6c39-4af9-a590-3430ebda3b37.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1192,
      "end_line": 1195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1194,col 17)-(line 1194,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ff220e79-bb89-4c2d-8b83-ea3548c237e8.append(double)",
      "begin_line": 1198,
      "end_line": 1201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1200,col 17)-(line 1200,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c6a7ede1-680d-4267-be7d-831cd57ee199.getSubVector(int, int)",
      "begin_line": 1204,
      "end_line": 1207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1206,col 17)-(line 1206,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-3d875fb5-7b90-4788-b2cb-95afe7dff15b.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1210,
      "end_line": 1213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1212,col 17)-(line 1212,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-024f6b9e-9d3e-4779-b5c2-bc751cb4aa5c.set(double)",
      "begin_line": 1216,
      "end_line": 1219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1218,col 17)-(line 1218,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1251f3fd-ee16-42f6-a0e5-ec3a25663154.toArray()",
      "begin_line": 1222,
      "end_line": 1225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1224,col 17)-(line 1224,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-258bda86-bcad-42af-bbda-e8ba029ecfbb.isNaN()",
      "begin_line": 1228,
      "end_line": 1231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1230,col 17)-(line 1230,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a92b9026-ad5f-4ad8-a3c5-54a735281c43.isInfinite()",
      "begin_line": 1234,
      "end_line": 1237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1236,col 17)-(line 1236,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-0a0d4bc6-3ff6-49d3-8cd1-67cf6daa8522.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1240,
      "end_line": 1243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1242,col 17)-(line 1242,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-bef33c45-c9f4-4ae3-9e42-4c56e31f0669.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1246,
      "end_line": 1249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1248,col 17)-(line 1248,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 1252,
      "end_line": 1264,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1254,
      "end_line": 1257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1256,col 21)-(line 1256,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1260,
      "end_line": 1263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1262,col 21)-(line 1262,col 66)"
      ]
    }
  ]
}
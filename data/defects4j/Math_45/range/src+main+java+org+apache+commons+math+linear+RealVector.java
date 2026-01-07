{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 1246,
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
      "signature": "org.apache.commons.math.linear.RealVector.unitVector()",
      "begin_line": 648,
      "end_line": 652,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws ArithmeticException if the norm is {@code null}.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 33)",
        "(line 650,col 9)-(line 650,col 23)",
        "(line 651,col 9)-(line 651,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitize()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.sparseIterator()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.iterator()",
      "begin_line": 686,
      "end_line": 712,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 39)",
        "(line 688,col 9)-(line 711,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 691,
      "end_line": 691,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 694,
      "end_line": 694,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-09cf709a-98d8-434a-9a6a-68d92fc18dc2.hasNext()",
      "begin_line": 697,
      "end_line": 699,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 698,col 17)-(line 698,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-edb4fb67-9bad-44bf-afca-25cebaa3c8ec.next()",
      "begin_line": 702,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 703,col 17)-(line 703,col 32)",
        "(line 704,col 17)-(line 704,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d4539482-e027-423d-8836-158d776792f7.remove()",
      "begin_line": 708,
      "end_line": 710,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 17)-(line 709,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 741,
      "end_line": 748,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 86)",
        "(line 743,col 9)-(line 743,col 16)",
        "(line 744,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 779,
      "end_line": 787,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 33)",
        "(line 781,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 792,
      "end_line": 836,
      "comment": "\n     *  An entry in the vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.Entry()",
      "begin_line": 797,
      "end_line": 799,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 798,col 13)-(line 798,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getValue()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 807,col 13)-(line 807,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setValue(double)",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 816,col 13)-(line 816,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getIndex()",
      "begin_line": 824,
      "end_line": 826,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 825,col 13)-(line 825,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 834,col 13)-(line 834,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 851,
      "end_line": 906,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 853,
      "end_line": 853,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 855,
      "end_line": 855,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 857,
      "end_line": 857,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 860,
      "end_line": 867,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 861,col 13)-(line 861,col 33)",
        "(line 862,col 13)-(line 862,col 34)",
        "(line 863,col 13)-(line 863,col 31)",
        "(line 864,col 13)-(line 866,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.RealVector.Entry)",
      "begin_line": 874,
      "end_line": 884,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 875,col 13)-(line 877,col 13)",
        "(line 878,col 13)-(line 880,col 62)",
        "(line 881,col 13)-(line 883,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 887,
      "end_line": 889,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 888,col 13)-(line 888,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 892,
      "end_line": 900,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 893,col 13)-(line 893,col 40)",
        "(line 894,col 13)-(line 896,col 13)",
        "(line 897,col 13)-(line 897,col 36)",
        "(line 898,col 13)-(line 898,col 26)",
        "(line 899,col 13)-(line 899,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 903,
      "end_line": 905,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 904,col 13)-(line 904,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unmodifiableRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 926,
      "end_line": 1245,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 1244,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-2e8c0684-2c69-42e4-bce8-ed0a9aaaf4bd.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 938,
      "end_line": 941,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 940,col 17)-(line 940,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-4f6c00a5-af02-4d59-91ee-c7799f44ca46.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 944,
      "end_line": 947,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 946,col 17)-(line 946,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e0827d0a-2947-45ab-af0b-274ccec8fc30.iterator()",
      "begin_line": 950,
      "end_line": 973,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 952,col 17)-(line 952,col 55)",
        "(line 953,col 17)-(line 972,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 955,
      "end_line": 955,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-60fc3e66-58a0-470e-ae67-409645be1ee9.hasNext()",
      "begin_line": 958,
      "end_line": 960,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 959,col 25)-(line 959,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c1046f73-040f-4ab6-a3c2-3c3f5e3e9c48.next()",
      "begin_line": 963,
      "end_line": 966,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 964,col 25)-(line 964,col 56)",
        "(line 965,col 25)-(line 965,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-2928f1e6-a403-4aeb-a2b7-fdab20a62039.remove()",
      "begin_line": 969,
      "end_line": 971,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 970,col 25)-(line 970,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ea564900-0c8c-4409-adf8-18501c72c91e.sparseIterator()",
      "begin_line": 976,
      "end_line": 1000,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 978,col 17)-(line 978,col 61)",
        "(line 980,col 17)-(line 999,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1f36fda7-f6c5-48f7-ae3a-64b40d2949c7.hasNext()",
      "begin_line": 985,
      "end_line": 987,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 986,col 25)-(line 986,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-16a3143b-7093-4a16-8486-aa47700edd12.next()",
      "begin_line": 990,
      "end_line": 993,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 991,col 25)-(line 991,col 56)",
        "(line 992,col 25)-(line 992,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9dc9590d-0d32-4799-9ac0-f1c65756b2d2.remove()",
      "begin_line": 996,
      "end_line": 998,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 997,col 25)-(line 997,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-722bf610-147e-49df-9db2-d4eb34310944.copy()",
      "begin_line": 1003,
      "end_line": 1006,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1005,col 17)-(line 1005,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-2252d701-c267-4186-9cc8-4875d015c77f.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1009,
      "end_line": 1012,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1011,col 17)-(line 1011,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-383902a9-3043-43d6-afaa-d15dc955b816.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1015,
      "end_line": 1018,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1017,col 17)-(line 1017,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-f6e89346-150a-4ca0-83a9-c324c494b085.mapAdd(double)",
      "begin_line": 1021,
      "end_line": 1024,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1023,col 17)-(line 1023,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-811a1911-58c8-400e-91d9-847750f48080.mapAddToSelf(double)",
      "begin_line": 1027,
      "end_line": 1030,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1029,col 17)-(line 1029,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-36352966-3b00-46a0-a6ee-87900057c7ce.mapSubtract(double)",
      "begin_line": 1033,
      "end_line": 1036,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1035,col 17)-(line 1035,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-372b8c71-3da1-4d0a-b87d-d9f5b7ffac31.mapSubtractToSelf(double)",
      "begin_line": 1039,
      "end_line": 1042,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1041,col 17)-(line 1041,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-5c381b6d-26dc-4c64-8bf7-ceb65b2ab447.mapMultiply(double)",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1047,col 17)-(line 1047,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-7d7ece4a-9231-4b4d-9486-a4e6f15c99cd.mapMultiplyToSelf(double)",
      "begin_line": 1051,
      "end_line": 1054,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1053,col 17)-(line 1053,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-93d7150a-1598-4598-97cc-3d930a8d134a.mapDivide(double)",
      "begin_line": 1057,
      "end_line": 1060,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1059,col 17)-(line 1059,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d343818a-d47d-4c4a-9ccd-c266b98db70f.mapDivideToSelf(double)",
      "begin_line": 1063,
      "end_line": 1066,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1065,col 17)-(line 1065,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a9ea9d97-ed20-4102-a4e2-202241b4c00c.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1069,
      "end_line": 1072,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1071,col 17)-(line 1071,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-6f9dd8cd-74ae-49f5-97fc-4e3ef5a1b72f.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1075,
      "end_line": 1078,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1077,col 17)-(line 1077,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-6cc37d47-5216-4b00-8b30-f2153831a4e2.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1081,
      "end_line": 1084,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1083,col 17)-(line 1083,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-5006d05d-e5de-40a0-9820-e9c79302ebf6.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1087,
      "end_line": 1090,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1089,col 17)-(line 1089,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c284381a-3243-47ee-b904-800ea7050919.getNorm()",
      "begin_line": 1093,
      "end_line": 1096,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1095,col 17)-(line 1095,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e219f835-c455-422a-aef9-ade26f989c8f.getL1Norm()",
      "begin_line": 1099,
      "end_line": 1102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1101,col 17)-(line 1101,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-b466de20-fef1-45b1-89b8-79f1672c2f4d.getLInfNorm()",
      "begin_line": 1105,
      "end_line": 1108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1107,col 17)-(line 1107,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-2e88e410-1b0a-4d91-993e-27dd916e708a.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1111,
      "end_line": 1114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1113,col 17)-(line 1113,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-aabea730-93e5-4310-9c5a-6c5b44ef81e2.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1117,
      "end_line": 1120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1119,col 17)-(line 1119,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c6099194-af6d-4880-966d-76457d21497e.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1125,col 17)-(line 1125,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-7628d7f3-25fc-41ee-9b90-169516ea1be4.unitVector()",
      "begin_line": 1129,
      "end_line": 1132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1131,col 17)-(line 1131,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-781091f7-0c81-4550-8c11-35adc673395f.unitize()",
      "begin_line": 1135,
      "end_line": 1138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1137,col 17)-(line 1137,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-23b75924-b14a-41bf-9934-5566a743e106.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1141,
      "end_line": 1144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1143,col 17)-(line 1143,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-84f46c7b-b16a-4526-9aa6-a2664b0fac18.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1147,
      "end_line": 1150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1149,col 17)-(line 1149,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-95fd2c87-8592-46e7-a5db-d6579bb5204e.getEntry(int)",
      "begin_line": 1153,
      "end_line": 1156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1155,col 17)-(line 1155,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-78337b99-a594-472d-8a00-4b9c016f9089.setEntry(int, double)",
      "begin_line": 1159,
      "end_line": 1162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1161,col 17)-(line 1161,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-565ec9bf-aec2-4156-b1b4-cda3ede77d80.getDimension()",
      "begin_line": 1165,
      "end_line": 1168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1167,col 17)-(line 1167,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-4dc5c1dd-ece4-47e7-be9c-a0cc1bbb1db4.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1171,
      "end_line": 1174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1173,col 17)-(line 1173,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a4604fce-d754-4860-a724-45e0e7c1f7f5.append(double)",
      "begin_line": 1177,
      "end_line": 1180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1179,col 17)-(line 1179,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-7071ef41-c9c2-4b5e-aab3-259d2d16484e.getSubVector(int, int)",
      "begin_line": 1183,
      "end_line": 1186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1185,col 17)-(line 1185,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c7e8a6c4-b29e-427b-b9d5-2029d64f78de.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1189,
      "end_line": 1192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1191,col 17)-(line 1191,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d73cd1d0-9ed0-416b-a834-e6a7b240b16e.set(double)",
      "begin_line": 1195,
      "end_line": 1198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1197,col 17)-(line 1197,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-8a9ab061-5851-46c9-be2e-0cb05eb597b3.toArray()",
      "begin_line": 1201,
      "end_line": 1204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1203,col 17)-(line 1203,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1b800fad-a239-4e3d-bc85-bcc6031b1fc6.isNaN()",
      "begin_line": 1207,
      "end_line": 1210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1209,col 17)-(line 1209,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ec1bd44b-0ea6-4e1e-a256-72423b055601.isInfinite()",
      "begin_line": 1213,
      "end_line": 1216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1215,col 17)-(line 1215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-bf84e441-6136-45e6-aee6-06021d06d91e.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1219,
      "end_line": 1222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1221,col 17)-(line 1221,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a5a71500-8ebd-496f-a010-b1aca7e7ee40.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1225,
      "end_line": 1228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1227,col 17)-(line 1227,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 1231,
      "end_line": 1243,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1233,
      "end_line": 1236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1235,col 21)-(line 1235,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1239,
      "end_line": 1242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1241,col 21)-(line 1241,col 66)"
      ]
    }
  ]
}
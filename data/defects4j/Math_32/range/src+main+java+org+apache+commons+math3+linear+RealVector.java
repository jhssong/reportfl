{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 1273,
      "comment": "\n * Class defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., {@code getEntry(0)}\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@code code map} and {@code mapToSelf} methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The {@code map}\n * versions create a new vector to hold the result and do not change the instance.\n * The {@code mapToSelf} version uses the instance itself to store the\n * results, so the instance is changed by this method. In all cases, the result\n * vector is returned by the methods, allowing the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.4).mapToSelf(new Tan()).mapToSelf(new Power(2.3));\n * \u003c/pre\u003e\n *\n * @version $Id$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDimension()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Returns the size of the vector.\n     *\n     * @return the size of this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getEntry(int)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Return the entry at the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.setEntry(int, double)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Set a single element.\n     *\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.addToEntry(int, double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Change an entry at the specified index.\n     *\n     * @param index Index location of entry to be set.\n     * @param increment Value to add to the vector entry.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the index is not valid.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Construct a new vector by appending a vector to this vector.\n     *\n     * @param v vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.append(double)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Construct a new vector by appending a double to this vector.\n     *\n     * @param d double to append.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getSubVector(int, int)",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Get a subvector from consecutive elements.\n     *\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Set a sequence of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.isNaN()",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Check whether any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.isInfinite()",
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkVectorDimensions(int)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 31)",
        "(line 174,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.checkIndex(int)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 202,
      "end_line": 211,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 204,col 46)",
        "(line 205,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 222,
      "end_line": 231,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 46)",
        "(line 225,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAdd(double)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 251,
      "end_line": 256,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.copy()",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 273,
      "end_line": 282,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 21)",
        "(line 276,col 9)-(line 276,col 46)",
        "(line 277,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 291,
      "end_line": 300,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 38)",
        "(line 293,col 9)-(line 293,col 41)",
        "(line 295,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 320,
      "end_line": 320,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 336,
      "end_line": 346,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 33)",
        "(line 338,col 9)-(line 338,col 21)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getNorm()",
      "begin_line": 358,
      "end_line": 367,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 23)",
        "(line 360,col 9)-(line 360,col 46)",
        "(line 361,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Norm()",
      "begin_line": 379,
      "end_line": 387,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 24)",
        "(line 381,col 9)-(line 381,col 46)",
        "(line 382,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfNorm()",
      "begin_line": 399,
      "end_line": 407,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 24)",
        "(line 401,col 9)-(line 401,col 46)",
        "(line 402,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 420,
      "end_line": 429,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 21)",
        "(line 423,col 9)-(line 423,col 40)",
        "(line 424,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 445,
      "end_line": 454,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 33)",
        "(line 447,col 9)-(line 447,col 21)",
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinIndex()",
      "begin_line": 462,
      "end_line": 474,
      "comment": "\n     * Get the index of the minimum entry.\n     *\n     * @return the index of the minimum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 29)",
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 46)",
        "(line 466,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMinValue()",
      "begin_line": 482,
      "end_line": 485,
      "comment": "\n     * Get the value of the minimum entry.\n     *\n     * @return the value of the minimum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 43)",
        "(line 484,col 9)-(line 484,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxIndex()",
      "begin_line": 493,
      "end_line": 505,
      "comment": "\n     * Get the index of the maximum entry.\n     *\n     * @return the index of the maximum entry or -1 if vector length is 0\n     * or all entries are {@code NaN}\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 29)",
        "(line 495,col 9)-(line 495,col 51)",
        "(line 496,col 9)-(line 496,col 46)",
        "(line 497,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.getMaxValue()",
      "begin_line": 513,
      "end_line": 516,
      "comment": "\n     * Get the value of the maximum entry.\n     *\n     * @return the value of the maximum entry or {@code NaN} if all\n     * entries are {@code NaN}.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 43)",
        "(line 515,col 9)-(line 515,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiply(double)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtract(double)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivide(double)",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 591,
      "end_line": 613,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 27)",
        "(line 593,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 50)",
        "(line 601,col 9)-(line 609,col 9)",
        "(line 611,col 9)-(line 611,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 623,
      "end_line": 623,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.set(double)",
      "begin_line": 630,
      "end_line": 636,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 40)",
        "(line 632,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.toArray()",
      "begin_line": 645,
      "end_line": 652,
      "comment": "\n     * Convert the vector to an array of {@code double}s.\n     * The array is independent from this vector data: the elements\n     * are copied.\n     *\n     * @return an array containing a copy of the vector elements.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 33)",
        "(line 647,col 9)-(line 647,col 42)",
        "(line 648,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitVector()",
      "begin_line": 661,
      "end_line": 665,
      "comment": "\n     * Creates a unit vector pointing in the direction of this vector.\n     * The instance is not changed by this method.\n     *\n     * @return a unit vector pointing in direction of this vector.\n     * @throws ArithmeticException if the norm is {@code null}.\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 33)",
        "(line 663,col 9)-(line 663,col 23)",
        "(line 664,col 9)-(line 664,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unitize()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math3.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.sparseIterator()",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.iterator()",
      "begin_line": 707,
      "end_line": 733,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * \u003cp\u003eNote: derived classes are required to return an {@link Iterator} that\n     * returns non-null {@link Entry} objects as long as {@link Iterator#hasNext()}\n     * returns {@code true}.\u003c/p\u003e\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 39)",
        "(line 709,col 9)-(line 732,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 712,
      "end_line": 712,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9d2c8b0a-de71-41c6-9ac7-145f2d3db454.hasNext()",
      "begin_line": 718,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 719,col 17)-(line 719,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-13c0bf2a-8c3f-494e-9bb9-e7f694832374.next()",
      "begin_line": 723,
      "end_line": 726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 724,col 17)-(line 724,col 32)",
        "(line 725,col 17)-(line 725,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-11c194f4-a127-418d-8a59-cd5f93cf610c.remove()",
      "begin_line": 729,
      "end_line": 731,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 730,col 17)-(line 730,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 762,
      "end_line": 769,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 86)",
        "(line 764,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 784,
      "end_line": 786,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 800,
      "end_line": 808,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 33)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 813,
      "end_line": 857,
      "comment": "\n     *  An entry in the vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 815,
      "end_line": 815,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.Entry()",
      "begin_line": 818,
      "end_line": 820,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 819,col 13)-(line 819,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getValue()",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 828,col 13)-(line 828,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setValue(double)",
      "begin_line": 836,
      "end_line": 838,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 837,col 13)-(line 837,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.getIndex()",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 846,col 13)-(line 846,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 854,
      "end_line": 856,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 855,col 13)-(line 855,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 872,
      "end_line": 927,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 876,
      "end_line": 876,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 878,
      "end_line": 878,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 881,
      "end_line": 888,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 882,col 13)-(line 882,col 33)",
        "(line 883,col 13)-(line 883,col 34)",
        "(line 884,col 13)-(line 884,col 31)",
        "(line 885,col 13)-(line 887,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math3.linear.RealVector.Entry)",
      "begin_line": 895,
      "end_line": 905,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 896,col 13)-(line 898,col 13)",
        "(line 899,col 13)-(line 901,col 62)",
        "(line 902,col 13)-(line 904,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 908,
      "end_line": 910,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 909,col 13)-(line 909,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 913,
      "end_line": 921,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 914,col 13)-(line 914,col 40)",
        "(line 915,col 13)-(line 917,col 13)",
        "(line 918,col 13)-(line 918,col 36)",
        "(line 919,col 13)-(line 919,col 26)",
        "(line 920,col 13)-(line 920,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 924,
      "end_line": 926,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 925,col 13)-(line 925,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 947,
      "end_line": 1272,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 1271,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-130245d2-3d77-498a-b5df-b06e3d022eee.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 959,
      "end_line": 962,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 961,col 17)-(line 961,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-def8a656-005b-4234-92c9-2eb1a7a20fc1.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 965,
      "end_line": 968,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 967,col 17)-(line 967,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5608b2d3-a155-4c49-9e57-663c7f99baf2.iterator()",
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
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5abd3bfd-597d-4339-800d-f18ea205d73c.hasNext()",
      "begin_line": 979,
      "end_line": 981,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 980,col 25)-(line 980,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-df58c237-a236-4a45-808a-22d82de3cccb.next()",
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
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-c69c9651-6446-4f56-8421-67125af7828e.remove()",
      "begin_line": 990,
      "end_line": 992,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 991,col 25)-(line 991,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-627e3b03-6c3f-4e49-94fc-94edc5a863a8.sparseIterator()",
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
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8ff68cd1-9641-444d-a5b2-b08236037c30.hasNext()",
      "begin_line": 1006,
      "end_line": 1008,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1007,col 25)-(line 1007,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-84645a03-ea1d-4f78-b6bb-b967b38fb81e.next()",
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
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d258ad81-cc12-4445-8a0e-5deaec15b469.remove()",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1018,col 25)-(line 1018,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-258f72bc-12ff-41b9-a6ee-5b77ce04dc5d.copy()",
      "begin_line": 1024,
      "end_line": 1027,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1026,col 17)-(line 1026,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ba475ca9-dd35-47b5-9ac4-33ec2d98b9da.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1030,
      "end_line": 1033,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1032,col 17)-(line 1032,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-23a91298-3128-4bf7-954b-e25f66010ec1.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1036,
      "end_line": 1039,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1038,col 17)-(line 1038,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-1b59305e-df88-43cb-ae17-f0aff6304518.mapAdd(double)",
      "begin_line": 1042,
      "end_line": 1045,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1044,col 17)-(line 1044,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e3b092c1-d983-40b7-a96f-0d05bd09112c.mapAddToSelf(double)",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1050,col 17)-(line 1050,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-623672ce-1e52-4479-955a-d559a030c8e5.mapSubtract(double)",
      "begin_line": 1054,
      "end_line": 1057,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1056,col 17)-(line 1056,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-d7aba722-975b-4c33-9032-c122aa66a66b.mapSubtractToSelf(double)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1062,col 17)-(line 1062,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-68dd6161-2c63-4339-b243-a5b0dc61495b.mapMultiply(double)",
      "begin_line": 1066,
      "end_line": 1069,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1068,col 17)-(line 1068,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-2b25d918-712a-424b-87f8-fb5f53057808.mapMultiplyToSelf(double)",
      "begin_line": 1072,
      "end_line": 1075,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1074,col 17)-(line 1074,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-8c1aff83-b493-4cb7-8a52-45817ef3ed1e.mapDivide(double)",
      "begin_line": 1078,
      "end_line": 1081,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1080,col 17)-(line 1080,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-55853aba-c542-4a81-bf3f-0da8b511b9e6.mapDivideToSelf(double)",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1086,col 17)-(line 1086,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f61e2707-b9e9-4c37-8abd-969040cb4c9f.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1092,col 17)-(line 1092,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-50197dfb-caac-44a8-aacc-db6ee1b95f2f.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1096,
      "end_line": 1099,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1098,col 17)-(line 1098,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5ecc6072-4772-4d5f-83a1-7562fa197af4.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1102,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1104,col 17)-(line 1104,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-41f04811-f117-4656-89b2-5bd90bd7e49d.cosine(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1108,
      "end_line": 1111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1110,col 17)-(line 1110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b3055c67-3a1b-4541-95df-f1c1eb2f72b2.getNorm()",
      "begin_line": 1114,
      "end_line": 1117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1116,col 17)-(line 1116,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-52a6c7d1-ce10-472b-9341-5f47fa78541c.getL1Norm()",
      "begin_line": 1120,
      "end_line": 1123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1122,col 17)-(line 1122,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-933164dc-e8f1-42c5-bcc1-ab47212af4ac.getLInfNorm()",
      "begin_line": 1126,
      "end_line": 1129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1128,col 17)-(line 1128,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-187942d0-6286-4b6e-9c70-d44e30bb0cc5.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1132,
      "end_line": 1135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1134,col 17)-(line 1134,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-ae5de026-5f35-49a6-8e28-ea3c2a64081d.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1138,
      "end_line": 1141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1140,col 17)-(line 1140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-eca88cba-e974-45d8-a40b-227d2f89f6b2.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1144,
      "end_line": 1147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1146,col 17)-(line 1146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-02adcac6-1c57-4e29-bab2-6cb9a750d8d6.unitVector()",
      "begin_line": 1150,
      "end_line": 1153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1152,col 17)-(line 1152,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e98090cc-6186-4c24-82e3-ca2b9edf1a79.unitize()",
      "begin_line": 1156,
      "end_line": 1159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1158,col 17)-(line 1158,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b4f33339-f835-48c8-a56f-ff767d251106.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1162,
      "end_line": 1165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1164,col 17)-(line 1164,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f82481ca-ed92-4172-b2a9-bb3811cd59d1.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1168,
      "end_line": 1171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1170,col 17)-(line 1170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-571f3f73-9f5b-4a6a-85b3-787c8cec518a.getEntry(int)",
      "begin_line": 1174,
      "end_line": 1177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1176,col 17)-(line 1176,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-94aa12b0-e864-44f4-9cdd-6955de6aa9ee.setEntry(int, double)",
      "begin_line": 1180,
      "end_line": 1183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1182,col 17)-(line 1182,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-70eafb4d-f718-4a76-ba32-aa20858c341a.addToEntry(int, double)",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1188,col 17)-(line 1188,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-3c41cb15-6a2c-4872-8044-257b3216d7d1.getDimension()",
      "begin_line": 1192,
      "end_line": 1195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1194,col 17)-(line 1194,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a896b3cc-fc7a-4f33-b5f0-d7e642f64ae4.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1198,
      "end_line": 1201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1200,col 17)-(line 1200,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-808b088f-ceec-4269-9e8e-35bb186a8160.append(double)",
      "begin_line": 1204,
      "end_line": 1207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1206,col 17)-(line 1206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-e7cbaa12-5a55-4e88-bb34-8a0fca4c60b7.getSubVector(int, int)",
      "begin_line": 1210,
      "end_line": 1213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1212,col 17)-(line 1212,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-5c6310d6-03db-43a4-b047-d0d0b7679f55.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1216,
      "end_line": 1219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1218,col 17)-(line 1218,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-f50c91f3-1795-4aa3-8504-8c3767eadd13.set(double)",
      "begin_line": 1222,
      "end_line": 1225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1224,col 17)-(line 1224,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-177664a9-9a38-4c82-9a81-aae3f6f25d31.toArray()",
      "begin_line": 1228,
      "end_line": 1231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1230,col 17)-(line 1230,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-001f2abd-3d33-40b7-8315-8d7b9de5922e.isNaN()",
      "begin_line": 1234,
      "end_line": 1237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1236,col 17)-(line 1236,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-a9652056-82d5-445f-905f-eefa1b81e2cc.isInfinite()",
      "begin_line": 1240,
      "end_line": 1243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1242,col 17)-(line 1242,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-b3f94a7b-a255-4f10-acbf-11f9f5392670.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1246,
      "end_line": 1249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1248,col 17)-(line 1248,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.Anonymous-9ef4d834-1b06-4b9c-a76c-f94bdfcd1896.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1252,
      "end_line": 1255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1254,col 17)-(line 1254,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 1258,
      "end_line": 1270,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1260,
      "end_line": 1263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1262,col 21)-(line 1262,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1266,
      "end_line": 1269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1268,col 21)-(line 1268,col 66)"
      ]
    }
  ]
}
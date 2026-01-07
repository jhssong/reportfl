{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 1265,
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
      "signature": "org.apache.commons.math.linear.RealVector.addToEntry(int, double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Change an entry at the specified index.\n     *\n     * @param index Index location of entry to be set.\n     * @param increment Value to add to the vector entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the index is not valid.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Construct a new vector by appending a vector to this vector.\n     *\n     * @param v vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Construct a new vector by appending a double to this vector.\n     *\n     * @param d double to append.\n     * @return a new vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getSubVector(int, int)",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Get a subvector from consecutive elements.\n     *\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Set a sequence of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isNaN()",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Check whether any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isInfinite()",
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.checkVectorDimensions(int)",
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
      "signature": "org.apache.commons.math.linear.RealVector.checkIndex(int)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 202,
      "end_line": 211,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 204,col 46)",
        "(line 205,col 9)-(line 205,col 16)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 222,
      "end_line": 231,
      "comment": "\n     * Subtract {@code v} from this vector.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 46)",
        "(line 225,col 9)-(line 225,col 16)",
        "(line 226,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAdd(double)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Add a value to each entry.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAddToSelf(double)",
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
      "signature": "org.apache.commons.math.linear.RealVector.copy()",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 273,
      "end_line": 282,
      "comment": "\n     * Compute the dot product of this vector with {@code v}.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between this instance and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 21)",
        "(line 276,col 9)-(line 276,col 46)",
        "(line 277,col 9)-(line 277,col 16)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.cosine(org.apache.commons.math.linear.RealVector)",
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
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing this[i] / v[i] for all i.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 320,
      "end_line": 320,
      "comment": "\n     * Element-by-element multiplication.\n     *\n     * @param v Vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 336,
      "end_line": 346,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * element differences, or Euclidian distance.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 33)",
        "(line 338,col 9)-(line 338,col 21)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 340,col 16)",
        "(line 341,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getNorm()",
      "begin_line": 358,
      "end_line": 367,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 23)",
        "(line 360,col 9)-(line 360,col 46)",
        "(line 361,col 9)-(line 361,col 16)",
        "(line 362,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Norm()",
      "begin_line": 379,
      "end_line": 387,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 24)",
        "(line 381,col 9)-(line 381,col 46)",
        "(line 382,col 9)-(line 382,col 16)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfNorm()",
      "begin_line": 399,
      "end_line": 407,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of the elements.\u003c/p\u003e\n     *\n     * @return the norm.\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 24)",
        "(line 401,col 9)-(line 401,col 46)",
        "(line 402,col 9)-(line 402,col 16)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 420,
      "end_line": 429,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * the elements differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 21)",
        "(line 423,col 9)-(line 423,col 40)",
        "(line 424,col 9)-(line 424,col 16)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 445,
      "end_line": 454,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * element differences.\u003c/p\u003e\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 33)",
        "(line 447,col 9)-(line 447,col 21)",
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 449,col 16)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getMinIndex()",
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
      "signature": "org.apache.commons.math.linear.RealVector.getMinValue()",
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
      "signature": "org.apache.commons.math.linear.RealVector.getMaxIndex()",
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
      "signature": "org.apache.commons.math.linear.RealVector.getMaxValue()",
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
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiply(double)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Multiply each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtract(double)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * Subtract a value from each entry. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivide(double)",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n     * Divide each entry by the argument. Returns a new vector.\n     * Does not change instance data.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Divide each entry by the argument.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 591,
      "end_line": 613,
      "comment": "\n     * Compute the outer product.\n     *\n     * @param v Vector with which outer product should be computed.\n     * @return the matrix outer product between this instance and {@code v}.\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 27)",
        "(line 593,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 50)",
        "(line 601,col 9)-(line 601,col 27)",
        "(line 602,col 9)-(line 609,col 9)",
        "(line 611,col 9)-(line 611,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 623,
      "end_line": 623,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v vector onto which instance must be projected.\n     * @return projection of the instance onto {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.set(double)",
      "begin_line": 630,
      "end_line": 636,
      "comment": "\n     * Set all elements to a single value.\n     *\n     * @param value Single value to set for all elements.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 40)",
        "(line 632,col 9)-(line 632,col 23)",
        "(line 633,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.toArray()",
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
      "signature": "org.apache.commons.math.linear.RealVector.unitVector()",
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
      "signature": "org.apache.commons.math.linear.RealVector.unitize()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * Converts this vector into a unit vector.\n     * The instance itself is changed by this method.\n     *\n     * @throws org.apache.commons.math.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.sparseIterator()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * Create a sparse iterator over the vector, which may omit some entries.\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration. No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * @return a sparse iterator.\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.iterator()",
      "begin_line": 699,
      "end_line": 725,
      "comment": "\n     * Generic dense iterator. Iteration is in increasing order\n     * of the vector index.\n     *\n     * @return a dense iterator.\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 39)",
        "(line 701,col 9)-(line 724,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 704,
      "end_line": 704,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 707,
      "end_line": 707,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ab38feef-c760-43fe-a0f9-f56dca8466ef.hasNext()",
      "begin_line": 710,
      "end_line": 712,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 711,col 17)-(line 711,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-4815e6a4-55de-44b7-9472-29e1cdfa92ee.next()",
      "begin_line": 715,
      "end_line": 718,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 716,col 17)-(line 716,col 32)",
        "(line 717,col 17)-(line 717,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d0c98ecc-2a26-4047-b41e-c3286d98b861.remove()",
      "begin_line": 721,
      "end_line": 723,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 722,col 17)-(line 722,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.map(org.apache.commons.math.analysis.UnivariateFunction)",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().mapToSelf(function);\n     * \u003c/pre\u003e\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateFunction)",
      "begin_line": 754,
      "end_line": 761,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     * Entries of this vector are modified in-place by this method.\n     *\n     * @param function Function to apply to each entry.\n     * @return a reference to this vector.\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 86)",
        "(line 756,col 9)-(line 756,col 16)",
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * Returns a new vector representing {@code a * this + b * y}, the linear\n     * combination of {@code this} and {@code y}.\n     * Returns a new vector. Does not change instance data.\n     *\n     * @param a Coefficient of {@code this}.\n     * @param b Coefficient of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 792,
      "end_line": 800,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 33)",
        "(line 794,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 805,
      "end_line": 849,
      "comment": "\n     *  An entry in the vector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 807,
      "end_line": 807,
      "comment": " Index of this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.Entry()",
      "begin_line": 810,
      "end_line": 812,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 811,col 13)-(line 811,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getValue()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": [
        "(line 820,col 13)-(line 820,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setValue(double)",
      "begin_line": 828,
      "end_line": 830,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": [
        "(line 829,col 13)-(line 829,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getIndex()",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 838,col 13)-(line 838,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 847,col 13)-(line 847,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 864,
      "end_line": 919,
      "comment": "\n     * This class should rarely be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, rather than using this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 866,
      "end_line": 866,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 868,
      "end_line": 868,
      "comment": " Last entry returned by {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 870,
      "end_line": 870,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 873,
      "end_line": 880,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 874,col 13)-(line 874,col 33)",
        "(line 875,col 13)-(line 875,col 34)",
        "(line 876,col 13)-(line 876,col 31)",
        "(line 877,col 13)-(line 879,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.RealVector.Entry)",
      "begin_line": 887,
      "end_line": 897,
      "comment": "\n         * Advance an entry up to the next nonzero one.\n         *\n         * @param e entry to advance.\n         ",
      "child_ranges": [
        "(line 888,col 13)-(line 890,col 13)",
        "(line 891,col 13)-(line 893,col 62)",
        "(line 894,col 13)-(line 896,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.hasNext()",
      "begin_line": 900,
      "end_line": 902,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.next()",
      "begin_line": 905,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 906,col 13)-(line 906,col 40)",
        "(line 907,col 13)-(line 909,col 13)",
        "(line 910,col 13)-(line 910,col 36)",
        "(line 911,col 13)-(line 911,col 26)",
        "(line 912,col 13)-(line 912,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.SparseEntryIterator.remove()",
      "begin_line": 916,
      "end_line": 918,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 917,col 13)-(line 917,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unmodifiableRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 939,
      "end_line": 1264,
      "comment": "\n     * Returns an unmodifiable view of the specified vector.\n     * The returned vector has read-only access. An attempt to modify it will\n     * result in a {@link MathUnsupportedOperationException}. However, the\n     * returned vector is \u003cem\u003enot\u003c/em\u003e immutable, since any modification of\n     * {@code v} will also change the returned view.\n     * For example, in the following piece of code\n     * \u003cpre\u003e\n     *     RealVector v \u003d new ArrayRealVector(2);\n     *     RealVector w \u003d RealVector.unmodifiableRealVector(v);\n     *     v.setEntry(0, 1.2);\n     *     v.setEntry(1, -3.4);\n     * \u003c/pre\u003e\n     * the changes will be seen in the {@code w} view of {@code v}.\n     *\n     * @param v Vector for which an unmodifiable view is to be returned.\n     * @return an unmodifiable view of {@code v}.\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 1263,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-85de290e-ad17-4d88-9e29-8851479650e6.mapToSelf(org.apache.commons.math.analysis.UnivariateFunction)",
      "begin_line": 951,
      "end_line": 954,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 953,col 17)-(line 953,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-cf7de06f-70fa-4741-be06-639ccbf10020.map(org.apache.commons.math.analysis.UnivariateFunction)",
      "begin_line": 957,
      "end_line": 960,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 959,col 17)-(line 959,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-bc3d51b4-3a8e-492f-9d58-0ed883d266e4.iterator()",
      "begin_line": 963,
      "end_line": 986,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 965,col 17)-(line 965,col 55)",
        "(line 966,col 17)-(line 985,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 968,
      "end_line": 968,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-331c74b1-71b4-463a-9eca-4dae0cd3118e.hasNext()",
      "begin_line": 971,
      "end_line": 973,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 972,col 25)-(line 972,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-30cf8ceb-f35f-470c-9e1c-60fe1ffb334c.next()",
      "begin_line": 976,
      "end_line": 979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 977,col 25)-(line 977,col 56)",
        "(line 978,col 25)-(line 978,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-0791325c-7839-4cba-a4de-f32cde809ef7.remove()",
      "begin_line": 982,
      "end_line": 984,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 983,col 25)-(line 983,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-b6ce501f-17f3-45a6-a9dd-20b125a631b9.sparseIterator()",
      "begin_line": 989,
      "end_line": 1013,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 991,col 17)-(line 991,col 61)",
        "(line 993,col 17)-(line 1012,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 995,
      "end_line": 995,
      "comment": " The current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-0bdecd77-e4df-43ba-9e3b-183df7ce7348.hasNext()",
      "begin_line": 998,
      "end_line": 1000,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 999,col 25)-(line 999,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1ca85ccf-b322-46d1-a7f4-8ac95b34c47d.next()",
      "begin_line": 1003,
      "end_line": 1006,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1004,col 25)-(line 1004,col 56)",
        "(line 1005,col 25)-(line 1005,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-add2ac72-9580-4cef-84cb-7768e96ffae4.remove()",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1010,col 25)-(line 1010,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-482822f3-befe-4e29-8be4-64c5f5cf953b.copy()",
      "begin_line": 1016,
      "end_line": 1019,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1018,col 17)-(line 1018,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9f22159d-1c26-4d95-84cd-bd6d8d3a04e6.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1022,
      "end_line": 1025,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1024,col 17)-(line 1024,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a7856da0-787b-47d3-b3c2-833cc97ae362.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1028,
      "end_line": 1031,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1030,col 17)-(line 1030,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1d935aa7-274d-4516-bfc7-0494f641238c.mapAdd(double)",
      "begin_line": 1034,
      "end_line": 1037,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1036,col 17)-(line 1036,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-d7628292-c203-4290-9450-ee3b7513db49.mapAddToSelf(double)",
      "begin_line": 1040,
      "end_line": 1043,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1042,col 17)-(line 1042,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-86925102-d93e-4c0a-b8c9-6fef798345de.mapSubtract(double)",
      "begin_line": 1046,
      "end_line": 1049,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1048,col 17)-(line 1048,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-fe5aae4d-d516-4063-b017-260912ebc360.mapSubtractToSelf(double)",
      "begin_line": 1052,
      "end_line": 1055,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1054,col 17)-(line 1054,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-4d04fc5a-0bc4-465e-b17d-1914214d3250.mapMultiply(double)",
      "begin_line": 1058,
      "end_line": 1061,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1060,col 17)-(line 1060,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-0adc5b8d-d344-458b-a1ef-551555b850be.mapMultiplyToSelf(double)",
      "begin_line": 1064,
      "end_line": 1067,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1066,col 17)-(line 1066,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-fa71fcbf-1164-4b73-8e40-a827f9b81f1e.mapDivide(double)",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1072,col 17)-(line 1072,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-049e59b8-421d-4089-bc61-51bd80f8674c.mapDivideToSelf(double)",
      "begin_line": 1076,
      "end_line": 1079,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1078,col 17)-(line 1078,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-1f4b83a9-071f-4a8e-8d44-fc25cbeb323d.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1082,
      "end_line": 1085,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1084,col 17)-(line 1084,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-b991714b-d0d5-40ca-8e85-8cc39b5f7e14.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1088,
      "end_line": 1091,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1090,col 17)-(line 1090,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-cc2e1c4f-9249-46cb-9841-ec3a9b42aac9.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1094,
      "end_line": 1097,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1096,col 17)-(line 1096,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e3677336-3b21-4a80-bb0c-aae9bf267610.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1100,
      "end_line": 1103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1102,col 17)-(line 1102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-8a674b1b-987e-4a44-8adf-e84ce7f25510.getNorm()",
      "begin_line": 1106,
      "end_line": 1109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1108,col 17)-(line 1108,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9ffde3e5-4ff4-4684-80af-a4f0810a6e34.getL1Norm()",
      "begin_line": 1112,
      "end_line": 1115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1114,col 17)-(line 1114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-96ad8b84-fa54-4302-8a35-f0d45d1d0910.getLInfNorm()",
      "begin_line": 1118,
      "end_line": 1121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1120,col 17)-(line 1120,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-03462cb6-22f2-4d7e-a1e4-e82af2f12e9f.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1124,
      "end_line": 1127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1126,col 17)-(line 1126,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-18a86243-b6ff-4f70-b5dc-8dd0b61ee94c.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1130,
      "end_line": 1133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1132,col 17)-(line 1132,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9cc97067-dc2d-42b5-9a24-943d0b0bdb9d.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1136,
      "end_line": 1139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 17)-(line 1138,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-208a3324-62fc-459f-8f9d-7dfe760dec0b.unitVector()",
      "begin_line": 1142,
      "end_line": 1145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1144,col 17)-(line 1144,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-8fe0c6fa-1e9f-48e4-a1bb-e4868b4a04f3.unitize()",
      "begin_line": 1148,
      "end_line": 1151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1150,col 17)-(line 1150,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-622c4126-6206-4116-b524-02495f32d4ad.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1154,
      "end_line": 1157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1156,col 17)-(line 1156,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c6080944-f830-40dc-864a-009b22f353f9.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1160,
      "end_line": 1163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 17)-(line 1162,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e3ff47a3-f1eb-453b-8a71-2d79597aa873.getEntry(int)",
      "begin_line": 1166,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1168,col 17)-(line 1168,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-2e41180e-9ccb-47b5-abc6-3d884b30ed42.setEntry(int, double)",
      "begin_line": 1172,
      "end_line": 1175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1174,col 17)-(line 1174,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-df964c6e-36a6-4f02-b3cd-816f17215372.addToEntry(int, double)",
      "begin_line": 1178,
      "end_line": 1181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1180,col 17)-(line 1180,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-6d0d5e07-2c17-4671-9e07-b28737d52017.getDimension()",
      "begin_line": 1184,
      "end_line": 1187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1186,col 17)-(line 1186,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-159773c6-ba27-4cae-80f9-49729f19599e.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1190,
      "end_line": 1193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1192,col 17)-(line 1192,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-ca46cc65-bb16-405d-a419-a308e639f60e.append(double)",
      "begin_line": 1196,
      "end_line": 1199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1198,col 17)-(line 1198,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-385954c4-767a-41fa-81b0-b09f1afcf7e1.getSubVector(int, int)",
      "begin_line": 1202,
      "end_line": 1205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1204,col 17)-(line 1204,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-a307b627-03bd-4798-a657-20d6a989130d.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1208,
      "end_line": 1211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1210,col 17)-(line 1210,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-81f9d3ef-1b67-4109-8791-d3017d484e58.set(double)",
      "begin_line": 1214,
      "end_line": 1217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1216,col 17)-(line 1216,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-24d73213-219b-4158-a7c6-73f95312f487.toArray()",
      "begin_line": 1220,
      "end_line": 1223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1222,col 17)-(line 1222,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-380d1274-9d27-47e2-a362-57761aa5a847.isNaN()",
      "begin_line": 1226,
      "end_line": 1229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1228,col 17)-(line 1228,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-c71c16c9-9432-4392-b325-b785e4a3947b.isInfinite()",
      "begin_line": 1232,
      "end_line": 1235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1234,col 17)-(line 1234,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-e318c48a-6b2e-4e4f-99e3-5283082904f2.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1238,
      "end_line": 1241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1240,col 17)-(line 1240,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Anonymous-9fcf33bb-43ee-4d10-b118-9abe2064fa35.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1244,
      "end_line": 1247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1246,col 17)-(line 1246,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 1250,
      "end_line": 1262,
      "comment": " An entry in the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.UnmodifiableEntry.getValue()",
      "begin_line": 1252,
      "end_line": 1255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1254,col 21)-(line 1254,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.UnmodifiableEntry.setValue(double)",
      "begin_line": 1258,
      "end_line": 1261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1260,col 21)-(line 1260,col 66)"
      ]
    }
  ]
}
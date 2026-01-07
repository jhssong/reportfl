{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 1104,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the {@code append} method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(ArrayRealVector)}) to gather data\n     * into this vector.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Construct a vector with preset values.\n     *\n     * @param size Size of the vector\n     * @param preset All entries will be set with this value.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 75,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 32)",
        "(line 127,col 9)-(line 127,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Construct a vector from an array.\n     * @param d array of Doubles.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 151,
      "end_line": 162,
      "comment": "\n     * Construct a vector from part of an array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 32)",
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 170,
      "end_line": 178,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 44)",
        "(line 175,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, boolean)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform a\n     * shallow copy.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 59)",
        "(line 208,col 9)-(line 208,col 62)",
        "(line 209,col 9)-(line 209,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 217,
      "end_line": 225,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 38)",
        "(line 219,col 9)-(line 219,col 41)",
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 50)",
        "(line 222,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 232,
      "end_line": 240,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 41)",
        "(line 234,col 9)-(line 234,col 38)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, double[])",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 41)",
        "(line 249,col 9)-(line 249,col 33)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 251,col 50)",
        "(line 252,col 9)-(line 252,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 260,
      "end_line": 266,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 33)",
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 263,col 35)",
        "(line 264,col 9)-(line 264,col 45)",
        "(line 265,col 9)-(line 265,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 273,
      "end_line": 279,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 276,col 35)",
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.copy()",
      "begin_line": 282,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 288,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(double[])",
      "begin_line": 305,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 33)",
        "(line 308,col 9)-(line 308,col 35)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Add {@code v} to this vector.\n     *\n     * @param v Vector to be added\n     * @return {@code this} + v.\n     * @throws DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 330,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(double[])",
      "begin_line": 347,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 33)",
        "(line 350,col 9)-(line 350,col 35)",
        "(line 351,col 9)-(line 351,col 58)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * Subtract {@code v} from this vector.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - v.\n     * @throws DimensionMismatchException if {@code v} is not the\n     * same size as this vector.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 372,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 378,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 387,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 396,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 405,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 414,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 423,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(double[])",
      "begin_line": 437,
      "end_line": 447,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 33)",
        "(line 440,col 9)-(line 440,col 35)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 442,col 9)-(line 442,col 42)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v Vector by which instance elements must be multiplied.\n     * @return a Vector containing {@code this[i] * v[i]} for all {@code i}.\n     * @exception DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 461,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(double[])",
      "begin_line": 475,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 33)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 479,col 58)",
        "(line 480,col 9)-(line 480,col 42)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}.\n     * @exception DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getData()",
      "begin_line": 500,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDataRef()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 516,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(double[])",
      "begin_line": 533,
      "end_line": 541,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 40)",
        "(line 536,col 9)-(line 536,col 23)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Compute the dot product.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between instance and {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getNorm()",
      "begin_line": 556,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 23)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 566,
      "end_line": 573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 23)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 576,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 23)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 586,
      "end_line": 599,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(double[])",
      "begin_line": 602,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 40)",
        "(line 605,col 9)-(line 605,col 23)",
        "(line 606,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 633,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(double[])",
      "begin_line": 649,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 40)",
        "(line 652,col 9)-(line 652,col 23)",
        "(line 653,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size\n     * as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 680,
      "end_line": 693,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 682,col 9)-(line 692,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(double[])",
      "begin_line": 696,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 40)",
        "(line 699,col 9)-(line 699,col 23)",
        "(line 700,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @exception IllegalArgumentException if {@code v} is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitVector()",
      "begin_line": 726,
      "end_line": 733,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 38)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitize()",
      "begin_line": 736,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 38)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 746,
      "end_line": 748,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(double[])",
      "begin_line": 751,
      "end_line": 754,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v Vector onto which instance must be projected.\n     * @return Projection of this instance onto {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * this vector.\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 769,
      "end_line": 784,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 771,col 9)-(line 783,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\n     * Compute the outer product.\n     * @param v Vector with which outer product should be computed.\n     * @return the square matrix outer product between this instance and {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(double[])",
      "begin_line": 798,
      "end_line": 809,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 34)",
        "(line 801,col 9)-(line 801,col 31)",
        "(line 802,col 9)-(line 802,col 66)",
        "(line 803,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 812,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDimension()",
      "begin_line": 817,
      "end_line": 819,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 822,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 823,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 836,
      "end_line": 838,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double)",
      "begin_line": 841,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 57)",
        "(line 843,col 9)-(line 843,col 55)",
        "(line 844,col 9)-(line 844,col 30)",
        "(line 845,col 9)-(line 845,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double[])",
      "begin_line": 849,
      "end_line": 851,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 854,
      "end_line": 863,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 53)",
        "(line 856,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 862,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 866,
      "end_line": 872,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 867,col 9)-(line 871,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 875,
      "end_line": 889,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 877,col 9)-(line 888,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 892,
      "end_line": 900,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 894,col 9)-(line 899,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(int, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 910,
      "end_line": 912,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(double)",
      "begin_line": 915,
      "end_line": 918,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toArray()",
      "begin_line": 921,
      "end_line": 924,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toString()",
      "begin_line": 927,
      "end_line": 930,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 939,
      "end_line": 942,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 951,
      "end_line": 956,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 955,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isNaN()",
      "begin_line": 964,
      "end_line": 971,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isInfinite()",
      "begin_line": 980,
      "end_line": 992,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 983,col 9)",
        "(line 985,col 9)-(line 989,col 9)",
        "(line 991,col 9)-(line 991,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 1008,
      "end_line": 1033,
      "comment": "\n     * Test for the equality of two real vectors.\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * {@code NaN}, the two real vectors are considered to be equal.\n     * {@code NaN} coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to {@code NaN}, the real vector is equal to\n     * a vector with all {@code NaN} coordinates.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1014,col 9)-(line 1016,col 9)",
        "(line 1018,col 9)-(line 1018,col 44)",
        "(line 1019,col 9)-(line 1021,col 9)",
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1027,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.hashCode()",
      "begin_line": 1041,
      "end_line": 1047,
      "comment": "\n     * Get a hashCode for the real vector.\n     * All {@code NaN} values have the same hash code.\n     *\n     * @return a hash code.\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1046,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.combine(double, double, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "\n     * Returns the linear combination of {@code this} and {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.combineToSelf(double, double, double[])",
      "begin_line": 1065,
      "end_line": 1072,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 40)",
        "(line 1068,col 9)-(line 1070,col 9)",
        "(line 1071,col 9)-(line 1071,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1086,
      "end_line": 1089,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 36)",
        "(line 1088,col 9)-(line 1088,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1092,
      "end_line": 1103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1102,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/linear/ArrayRealVector.java",
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
      "end_line": 1040,
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
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 40)",
        "(line 308,col 9)-(line 308,col 36)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Add {@code v} to this vector.\n     *\n     * @param v Vector to be added\n     * @return {@code this} + v.\n     * @throws DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 328,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(double[])",
      "begin_line": 345,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 40)",
        "(line 348,col 9)-(line 348,col 36)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Subtract {@code v} from this vector.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - v.\n     * @throws DimensionMismatchException if {@code v} is not the\n     * same size as this vector.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 368,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 374,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 383,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 392,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 401,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 410,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 419,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(double[])",
      "begin_line": 433,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 40)",
        "(line 436,col 9)-(line 436,col 36)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v Vector by which instance elements must be multiplied.\n     * @return a Vector containing {@code this[i] * v[i]} for all {@code i}.\n     * @exception DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 455,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(double[])",
      "begin_line": 469,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 40)",
        "(line 472,col 9)-(line 472,col 36)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Element-by-element division.\n     *\n     * @param v Vector by which instance elements must be divided.\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}.\n     * @exception DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getData()",
      "begin_line": 492,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDataRef()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 508,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(double[])",
      "begin_line": 525,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 40)",
        "(line 528,col 9)-(line 528,col 23)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Compute the dot product.\n     *\n     * @param v Vector with which dot product should be computed\n     * @return the scalar dot product between instance and {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getNorm()",
      "begin_line": 548,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 23)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 558,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 23)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 568,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 23)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 578,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 590,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(double[])",
      "begin_line": 594,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 40)",
        "(line 597,col 9)-(line 597,col 23)",
        "(line 598,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 625,
      "end_line": 638,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 637,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(double[])",
      "begin_line": 641,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 40)",
        "(line 644,col 9)-(line 644,col 23)",
        "(line 645,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @throws DimensionMismatchException if {@code v} is not the same size\n     * as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 672,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 684,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(double[])",
      "begin_line": 688,
      "end_line": 697,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 40)",
        "(line 691,col 9)-(line 691,col 23)",
        "(line 692,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 713,
      "end_line": 715,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return the distance between two vectors.\n     * @exception IllegalArgumentException if {@code v} is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitVector()",
      "begin_line": 718,
      "end_line": 725,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 38)",
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitize()",
      "begin_line": 728,
      "end_line": 735,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 38)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 738,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(double[])",
      "begin_line": 743,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     *\n     * @param v Vector onto which instance must be projected.\n     * @return Projection of this instance onto {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * this vector.\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 761,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 763,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 785,
      "end_line": 787,
      "comment": "\n     * Compute the outer product.\n     * @param v Vector with which outer product should be computed.\n     * @return the square matrix outer product between this instance and {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same\n     * size as this vector.\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(double[])",
      "begin_line": 790,
      "end_line": 801,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 34)",
        "(line 793,col 9)-(line 793,col 31)",
        "(line 794,col 9)-(line 794,col 66)",
        "(line 795,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 804,
      "end_line": 806,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDimension()",
      "begin_line": 809,
      "end_line": 811,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 814,
      "end_line": 820,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 815,col 9)-(line 819,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 828,
      "end_line": 830,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double)",
      "begin_line": 833,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 57)",
        "(line 835,col 9)-(line 835,col 55)",
        "(line 836,col 9)-(line 836,col 30)",
        "(line 837,col 9)-(line 837,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double[])",
      "begin_line": 841,
      "end_line": 843,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 846,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 53)",
        "(line 848,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 858,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 863,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 867,
      "end_line": 881,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 880,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 884,
      "end_line": 892,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 886,col 9)-(line 891,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(int, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 902,
      "end_line": 904,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(double)",
      "begin_line": 907,
      "end_line": 910,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toArray()",
      "begin_line": 913,
      "end_line": 916,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toString()",
      "begin_line": 919,
      "end_line": 922,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 931,
      "end_line": 934,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 943,
      "end_line": 948,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 947,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isNaN()",
      "begin_line": 956,
      "end_line": 963,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isInfinite()",
      "begin_line": 972,
      "end_line": 984,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 981,col 9)",
        "(line 983,col 9)-(line 983,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 1000,
      "end_line": 1025,
      "comment": "\n     * Test for the equality of two real vectors.\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * {@code NaN}, the two real vectors are considered to be equal.\n     * {@code NaN} coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to {@code NaN}, the real vector is equal to\n     * a vector with all {@code NaN} coordinates.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1010,col 9)-(line 1010,col 44)",
        "(line 1011,col 9)-(line 1013,col 9)",
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1019,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1024,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.hashCode()",
      "begin_line": 1033,
      "end_line": 1039,
      "comment": "\n     * Get a hashCode for the real vector.\n     * All {@code NaN} values have the same hash code.\n     *\n     * @return a hash code.\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1038,col 36)"
      ]
    }
  ]
}
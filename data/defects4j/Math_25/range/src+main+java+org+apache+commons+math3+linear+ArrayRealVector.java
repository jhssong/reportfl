{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 934,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the {@code append} method ({@link #append(double)},\n     * {@link #append(ArrayRealVector)}) to gather data into this vector.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Construct a vector with preset values.\n     *\n     * @param size Size of the vector\n     * @param preset All entries will be set with this value.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)",
        "(line 76,col 9)-(line 76,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 120,
      "end_line": 129,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 128,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\n     * Construct a vector from an array.\n     *\n     * @param d Array of {@code Double}s.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 153,
      "end_line": 164,
      "comment": "\n     * Construct a vector from part of an array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 32)",
        "(line 161,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 172,
      "end_line": 180,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 44)",
        "(line 177,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, boolean)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform a\n     * shallow copy.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 62)",
        "(line 211,col 9)-(line 211,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 219,
      "end_line": 227,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 41)",
        "(line 222,col 9)-(line 222,col 35)",
        "(line 223,col 9)-(line 223,col 50)",
        "(line 224,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 234,
      "end_line": 242,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 35)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, double[])",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 41)",
        "(line 251,col 9)-(line 251,col 33)",
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 50)",
        "(line 254,col 9)-(line 254,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 262,
      "end_line": 268,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 33)",
        "(line 264,col 9)-(line 264,col 41)",
        "(line 265,col 9)-(line 265,col 35)",
        "(line 266,col 9)-(line 266,col 45)",
        "(line 267,col 9)-(line 267,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 33)",
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 279,col 45)",
        "(line 280,col 9)-(line 280,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.copy()",
      "begin_line": 284,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 290,
      "end_line": 312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 315,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 340,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 346,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 355,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 364,
      "end_line": 370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 373,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 382,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 391,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 414,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDataRef()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 447,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getNorm()",
      "begin_line": 462,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 23)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 472,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 23)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 482,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 23)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 492,
      "end_line": 512,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 515,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 517,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 538,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 561,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 563,col 9)-(line 584,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 588,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDimension()",
      "begin_line": 599,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 605,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(double)",
      "begin_line": 625,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 57)",
        "(line 628,col 9)-(line 628,col 55)",
        "(line 629,col 9)-(line 629,col 30)",
        "(line 630,col 9)-(line 630,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 634,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 53)",
        "(line 640,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 650,
      "end_line": 657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 656,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.addToEntry(int, double)",
      "begin_line": 660,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 671,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 9)-(line 684,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 695,
      "end_line": 702,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 701,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.set(double)",
      "begin_line": 705,
      "end_line": 708,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toArray()",
      "begin_line": 711,
      "end_line": 714,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toString()",
      "begin_line": 717,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 729,
      "end_line": 732,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 741,
      "end_line": 746,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 745,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isNaN()",
      "begin_line": 754,
      "end_line": 762,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isInfinite()",
      "begin_line": 771,
      "end_line": 784,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 781,col 9)",
        "(line 783,col 9)-(line 783,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 787,
      "end_line": 812,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 797,col 44)",
        "(line 798,col 9)-(line 800,col 9)",
        "(line 802,col 9)-(line 804,col 9)",
        "(line 806,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.hashCode()",
      "begin_line": 817,
      "end_line": 823,
      "comment": "\n     * {@inheritDoc} All {@code NaN} values have the same hash code.\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 826,
      "end_line": 829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 832,
      "end_line": 847,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 834,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 850,
      "end_line": 857,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 55)",
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 860,
      "end_line": 869,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 33)",
        "(line 864,col 9)-(line 864,col 47)",
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 876,
      "end_line": 879,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 886,
      "end_line": 890,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 893,
      "end_line": 900,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 55)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 903,
      "end_line": 912,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 33)",
        "(line 907,col 9)-(line 907,col 47)",
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 911,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 919,
      "end_line": 922,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 929,
      "end_line": 933,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 55)"
      ]
    }
  ]
}
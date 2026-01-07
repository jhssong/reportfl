{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 955,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the {@code append} method ({@link #append(double)},\n     * {@link #append(ArrayRealVector)}) to gather data into this vector.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Construct a vector with preset values.\n     *\n     * @param size Size of the vector\n     * @param preset All entries will be set with this value.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param d Array.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 103,
      "end_line": 109,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 121,
      "end_line": 131,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * Construct a vector from an array.\n     *\n     * @param d Array of {@code Double}s.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 155,
      "end_line": 167,
      "comment": "\n     * Construct a vector from part of an array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 164,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 44)",
        "(line 180,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, boolean)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform a\n     * shallow copy.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 211,
      "end_line": 215,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 213,col 62)",
        "(line 214,col 9)-(line 214,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 222,
      "end_line": 230,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)",
        "(line 224,col 9)-(line 224,col 41)",
        "(line 225,col 9)-(line 225,col 35)",
        "(line 226,col 9)-(line 226,col 50)",
        "(line 227,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 41)",
        "(line 239,col 9)-(line 239,col 38)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, double[])",
      "begin_line": 252,
      "end_line": 258,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 41)",
        "(line 254,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 50)",
        "(line 257,col 9)-(line 257,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 265,
      "end_line": 271,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 33)",
        "(line 267,col 9)-(line 267,col 41)",
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 45)",
        "(line 270,col 9)-(line 270,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 278,
      "end_line": 284,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 33)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 35)",
        "(line 282,col 9)-(line 282,col 45)",
        "(line 283,col 9)-(line 283,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.copy()",
      "begin_line": 287,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 293,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 319,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 322,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 345,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 351,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 360,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 369,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapMultiplyToSelf(double)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapDivideToSelf(double)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 396,
      "end_line": 417,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 420,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDataRef()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 454,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getNorm()",
      "begin_line": 469,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 23)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 479,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 23)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 489,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 23)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 499,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 522,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 525,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 546,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 549,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 570,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 597,
      "end_line": 605,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 599,col 9)-(line 604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDimension()",
      "begin_line": 608,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 614,
      "end_line": 621,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 620,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 629,
      "end_line": 631,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(double)",
      "begin_line": 634,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 57)",
        "(line 637,col 9)-(line 637,col 55)",
        "(line 638,col 9)-(line 638,col 30)",
        "(line 639,col 9)-(line 639,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 643,
      "end_line": 657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 53)",
        "(line 650,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 660,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.addToEntry(int, double)",
      "begin_line": 670,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 9)-(line 678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 682,
      "end_line": 697,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 685,col 9)-(line 696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 707,
      "end_line": 715,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws OutOfRangeException if the index is inconsistent with the vector\n     * size.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 714,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.set(double)",
      "begin_line": 718,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toArray()",
      "begin_line": 724,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toString()",
      "begin_line": 730,
      "end_line": 733,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 742,
      "end_line": 746,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 755,
      "end_line": 761,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 760,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isNaN()",
      "begin_line": 769,
      "end_line": 777,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isInfinite()",
      "begin_line": 786,
      "end_line": 799,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 790,col 9)",
        "(line 792,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 802,
      "end_line": 827,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 804,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 812,col 44)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 821,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.hashCode()",
      "begin_line": 832,
      "end_line": 838,
      "comment": "\n     * {@inheritDoc} All {@code NaN} values have the same hash code.\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 841,
      "end_line": 845,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 848,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 867,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 55)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 877,
      "end_line": 887,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 33)",
        "(line 882,col 9)-(line 882,col 47)",
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 894,
      "end_line": 897,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 904,
      "end_line": 909,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 912,
      "end_line": 919,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 55)",
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 922,
      "end_line": 932,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 33)",
        "(line 927,col 9)-(line 927,col 47)",
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 931,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 939,
      "end_line": 942,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 949,
      "end_line": 954,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 55)"
      ]
    }
  ]
}
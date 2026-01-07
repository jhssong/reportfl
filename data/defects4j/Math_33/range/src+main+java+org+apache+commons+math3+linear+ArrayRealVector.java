{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 884,
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the {@code append} method ({@link #append(double)},\n     * {@link #append(ArrayRealVector)}) to gather data into this vector.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(int, double)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n     * Construct a vector from an array.\n     *\n     * @param d Array of {@code Double}s.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 152,
      "end_line": 163,
      "comment": "\n     * Construct a vector from part of an array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 32)",
        "(line 160,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 44)",
        "(line 176,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, boolean)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform a\n     * shallow copy.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 62)",
        "(line 210,col 9)-(line 210,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 218,
      "end_line": 226,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 38)",
        "(line 220,col 9)-(line 220,col 41)",
        "(line 221,col 9)-(line 221,col 35)",
        "(line 222,col 9)-(line 222,col 50)",
        "(line 223,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 233,
      "end_line": 241,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 41)",
        "(line 235,col 9)-(line 235,col 38)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, double[])",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 41)",
        "(line 250,col 9)-(line 250,col 33)",
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 253,col 9)-(line 253,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 261,
      "end_line": 267,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 33)",
        "(line 263,col 9)-(line 263,col 41)",
        "(line 264,col 9)-(line 264,col 35)",
        "(line 265,col 9)-(line 265,col 45)",
        "(line 266,col 9)-(line 266,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 274,
      "end_line": 280,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 276,col 33)",
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 45)",
        "(line 279,col 9)-(line 279,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.copy()",
      "begin_line": 283,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 289,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 314,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 339,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 345,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 354,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 363,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 372,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 381,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 390,
      "end_line": 410,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 413,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDataRef()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 446,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 465,col 9)"
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
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 545,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.unitVector()",
      "begin_line": 568,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 38)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.unitize()",
      "begin_line": 578,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 38)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 588,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 594,
      "end_line": 618,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 621,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDimension()",
      "begin_line": 627,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 633,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(double)",
      "begin_line": 653,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 57)",
        "(line 656,col 9)-(line 656,col 55)",
        "(line 657,col 9)-(line 657,col 30)",
        "(line 658,col 9)-(line 658,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 662,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 53)",
        "(line 665,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 675,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 677,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.addToEntry(int, double)",
      "begin_line": 685,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 691,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 693,col 9)-(line 704,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 715,
      "end_line": 722,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 721,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.set(double)",
      "begin_line": 725,
      "end_line": 728,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toArray()",
      "begin_line": 731,
      "end_line": 734,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toString()",
      "begin_line": 737,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 749,
      "end_line": 752,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 761,
      "end_line": 766,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isNaN()",
      "begin_line": 774,
      "end_line": 782,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isInfinite()",
      "begin_line": 791,
      "end_line": 804,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 803,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 820,
      "end_line": 845,
      "comment": "\n     * Test for the equality of two real vectors.\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * {@code NaN}, the two real vectors are considered to be equal.\n     * {@code NaN} coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to {@code NaN}, the real vector is equal to\n     * a vector with all {@code NaN} coordinates.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 828,col 9)",
        "(line 830,col 9)-(line 830,col 44)",
        "(line 831,col 9)-(line 833,col 9)",
        "(line 835,col 9)-(line 837,col 9)",
        "(line 839,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.hashCode()",
      "begin_line": 853,
      "end_line": 859,
      "comment": "\n     * Get a hashCode for the real vector.\n     * All {@code NaN} values have the same hash code.\n     *\n     * @return a hash code.\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 862,
      "end_line": 865,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 868,
      "end_line": 883,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 870,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 20)"
      ]
    }
  ]
}
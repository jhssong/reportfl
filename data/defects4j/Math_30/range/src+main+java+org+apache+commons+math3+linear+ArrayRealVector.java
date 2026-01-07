{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/linear/ArrayRealVector.java",
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
      "end_line": 985,
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
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 104,
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
      "end_line": 130,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 32)",
        "(line 129,col 9)-(line 129,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Construct a vector from an array.\n     *\n     * @param d Array of {@code Double}s.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "\n     * Construct a vector from part of an array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 32)",
        "(line 162,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 44)",
        "(line 178,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, boolean)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform a\n     * shallow copy.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 209,
      "end_line": 213,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 62)",
        "(line 212,col 9)-(line 212,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 41)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 224,col 9)-(line 224,col 50)",
        "(line 225,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 235,
      "end_line": 243,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 41)",
        "(line 237,col 9)-(line 237,col 38)",
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, double[])",
      "begin_line": 250,
      "end_line": 256,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 41)",
        "(line 252,col 9)-(line 252,col 33)",
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 9)-(line 254,col 50)",
        "(line 255,col 9)-(line 255,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 33)",
        "(line 265,col 9)-(line 265,col 41)",
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 267,col 45)",
        "(line 268,col 9)-(line 268,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 276,
      "end_line": 282,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 33)",
        "(line 279,col 9)-(line 279,col 35)",
        "(line 280,col 9)-(line 280,col 45)",
        "(line 281,col 9)-(line 281,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.copy()",
      "begin_line": 285,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 291,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 316,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 341,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 347,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 356,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 365,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapMultiplyToSelf(double)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapDivideToSelf(double)",
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
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 392,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 415,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDataRef()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 448,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getNorm()",
      "begin_line": 471,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 23)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 481,
      "end_line": 488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 23)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 491,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 23)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 501,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 524,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 547,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 549,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.unitVector()",
      "begin_line": 570,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 38)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.unitize()",
      "begin_line": 580,
      "end_line": 587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 38)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 590,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 596,
      "end_line": 620,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 619,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 623,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 625,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDimension()",
      "begin_line": 634,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 640,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 642,col 9)-(line 646,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(double)",
      "begin_line": 660,
      "end_line": 666,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 57)",
        "(line 663,col 9)-(line 663,col 55)",
        "(line 664,col 9)-(line 664,col 30)",
        "(line 665,col 9)-(line 665,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 669,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 53)",
        "(line 675,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 685,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.addToEntry(int, double)",
      "begin_line": 695,
      "end_line": 703,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 697,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 706,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 708,col 9)-(line 719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 730,
      "end_line": 737,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the index is inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 736,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.set(double)",
      "begin_line": 740,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toArray()",
      "begin_line": 746,
      "end_line": 749,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toString()",
      "begin_line": 752,
      "end_line": 755,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 764,
      "end_line": 767,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 776,
      "end_line": 781,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 780,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isNaN()",
      "begin_line": 789,
      "end_line": 797,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isInfinite()",
      "begin_line": 806,
      "end_line": 819,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 816,col 9)",
        "(line 818,col 9)-(line 818,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 835,
      "end_line": 860,
      "comment": "\n     * Test for the equality of two real vectors.\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * {@code NaN}, the two real vectors are considered to be equal.\n     * {@code NaN} coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to {@code NaN}, the real vector is equal to\n     * a vector with all {@code NaN} coordinates.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false} if\n     * {@code other} is null, not an instance of {@code RealVector}, or\n     * not equal to this {@code RealVector} instance.\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 839,col 9)",
        "(line 841,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 44)",
        "(line 846,col 9)-(line 848,col 9)",
        "(line 850,col 9)-(line 852,col 9)",
        "(line 854,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.hashCode()",
      "begin_line": 868,
      "end_line": 874,
      "comment": "\n     * Get a hashCode for the real vector.\n     * All {@code NaN} values have the same hash code.\n     *\n     * @return a hash code.\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 877,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 883,
      "end_line": 898,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 885,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 901,
      "end_line": 908,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 55)",
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 911,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 33)",
        "(line 915,col 9)-(line 915,col 47)",
        "(line 916,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 927,
      "end_line": 930,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 937,
      "end_line": 941,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 944,
      "end_line": 951,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 55)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 954,
      "end_line": 963,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 33)",
        "(line 958,col 9)-(line 958,col 47)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 970,
      "end_line": 973,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 980,
      "end_line": 984,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 55)"
      ]
    }
  ]
}
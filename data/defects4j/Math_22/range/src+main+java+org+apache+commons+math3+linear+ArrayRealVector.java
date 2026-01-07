{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/linear/ArrayRealVector.java",
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
      "end_line": 956,
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
      "end_line": 110,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Construct a vector from an array.\n     *\n     * @param d Array of {@code Double}s.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 156,
      "end_line": 168,
      "comment": "\n     * Construct a vector from part of an array.\n     *\n     * @param d Array.\n     * @param pos Position of first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 32)",
        "(line 165,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 176,
      "end_line": 184,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 44)",
        "(line 181,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, boolean)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform a\n     * shallow copy.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 59)",
        "(line 214,col 9)-(line 214,col 62)",
        "(line 215,col 9)-(line 215,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 223,
      "end_line": 231,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 41)",
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 227,col 50)",
        "(line 228,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 238,
      "end_line": 246,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 41)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector, double[])",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 41)",
        "(line 255,col 9)-(line 255,col 33)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 257,col 9)-(line 257,col 50)",
        "(line 258,col 9)-(line 258,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 33)",
        "(line 268,col 9)-(line 268,col 41)",
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 271,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 279,
      "end_line": 285,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 45)",
        "(line 284,col 9)-(line 284,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.copy()",
      "begin_line": 288,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 294,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 320,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.map(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 346,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction)",
      "begin_line": 352,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 361,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 370,
      "end_line": 376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 379,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 388,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 397,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 421,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDataRef()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This method does not make a fresh copy of the underlying data.\n     *\n     * @return the array of entries.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 455,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getNorm()",
      "begin_line": 470,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 23)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 480,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 23)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 490,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 23)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 500,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 523,
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
      "end_line": 568,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.outerProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 571,
      "end_line": 595,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 598,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 600,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getDimension()",
      "begin_line": 609,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 615,
      "end_line": 622,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 617,col 9)-(line 621,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.append(double)",
      "begin_line": 635,
      "end_line": 641,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 57)",
        "(line 638,col 9)-(line 638,col 55)",
        "(line 639,col 9)-(line 639,col 30)",
        "(line 640,col 9)-(line 640,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 644,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 53)",
        "(line 651,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 661,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.addToEntry(int, double)",
      "begin_line": 671,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 679,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 683,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 686,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 708,
      "end_line": 716,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index Index of first element to be set.\n     * @param v Vector containing the values to set.\n     * @throws OutOfRangeException if the index is inconsistent with the vector\n     * size.\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 715,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.set(double)",
      "begin_line": 719,
      "end_line": 722,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toArray()",
      "begin_line": 725,
      "end_line": 728,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.toString()",
      "begin_line": 731,
      "end_line": 734,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 743,
      "end_line": 747,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 756,
      "end_line": 762,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 761,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isNaN()",
      "begin_line": 770,
      "end_line": 778,
      "comment": "\n     * Check if any coordinate of this vector is {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.isInfinite()",
      "begin_line": 787,
      "end_line": 800,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none\n     * are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 797,col 9)",
        "(line 799,col 9)-(line 799,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 803,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 805,col 9)-(line 807,col 9)",
        "(line 809,col 9)-(line 811,col 9)",
        "(line 813,col 9)-(line 813,col 44)",
        "(line 814,col 9)-(line 816,col 9)",
        "(line 818,col 9)-(line 820,col 9)",
        "(line 822,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.hashCode()",
      "begin_line": 833,
      "end_line": 839,
      "comment": "\n     * {@inheritDoc} All {@code NaN} values have the same hash code.\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combine(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 842,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.combineToSelf(double, double, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 849,
      "end_line": 865,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 852,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 868,
      "end_line": 875,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 55)",
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 878,
      "end_line": 888,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 33)",
        "(line 883,col 9)-(line 883,col 47)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor)",
      "begin_line": 895,
      "end_line": 898,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorPreservingVisitor, int, int)",
      "begin_line": 905,
      "end_line": 910,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 913,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 55)",
        "(line 916,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInDefaultOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 923,
      "end_line": 933,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 33)",
        "(line 928,col 9)-(line 928,col 47)",
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor)",
      "begin_line": 940,
      "end_line": 943,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayRealVector.walkInOptimizedOrder(org.apache.commons.math3.linear.RealVectorChangingVisitor, int, int)",
      "begin_line": 950,
      "end_line": 955,
      "comment": "\n     * {@inheritDoc}\n     *\n     * In this implementation, the optimized order is the default order.\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 55)"
      ]
    }
  ]
}
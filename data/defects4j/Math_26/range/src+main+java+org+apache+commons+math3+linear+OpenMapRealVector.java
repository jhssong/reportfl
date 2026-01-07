{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/linear/OpenMapRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.SparseRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 805,
      "comment": "\n * This class implements the {@link RealVector} interface with a\n * {@link OpenIntToDoubleHashMap} backing store.\n * @version $Id$\n * @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZERO_TOLERANCE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default Tolerance for having a value considered zero. "
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
        "entries"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #OpenMapRealVector(OpenMapRealVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(double)},\n     * {@link #append(RealVector)}) to gather data into this vector.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int, double)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Construct a vector of zeroes, specifying zero tolerance.\n     *\n     * @param dimension Size of the vector.\n     * @param epsilon Tolerance below which a value considered zero.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)",
        "(line 76,col 9)-(line 76,col 50)",
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector, int)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector.\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 88,col 56)",
        "(line 89,col 9)-(line 89,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int, int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param dimension Size of the vector.\n     * @param expectedSize The expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int, int, double)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Build a vector with known the sparseness and zero tolerance\n     * setting (for advanced use only).\n     *\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 32)",
        "(line 112,col 9)-(line 112,col 64)",
        "(line 113,col 9)-(line 113,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(double[])",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(double[], double)",
      "begin_line": 133,
      "end_line": 143,
      "comment": "\n     * Create from an array, specifying zero tolerance.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 135,col 50)",
        "(line 136,col 9)-(line 136,col 31)",
        "(line 137,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[], double)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 36)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy from.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 39)",
        "(line 181,col 9)-(line 181,col 61)",
        "(line 182,col 9)-(line 182,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Generic copy constructor.\n     *\n     * @param v Instance to copy from.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 39)",
        "(line 192,col 9)-(line 192,col 50)",
        "(line 193,col 9)-(line 193,col 41)",
        "(line 194,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getEntries()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isDefaultValue(double)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Determine if this value is within epsilon of zero.\n     *\n     * @param value Value to test\n     * @return {@code true} if this value is within epsilon to zero,\n     * {@code false} otherwise.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 224,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 48)",
        "(line 227,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.add(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 243,
      "end_line": 259,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.\n     * It copies the larger vector, then iterates over the smaller.\n     *\n     * @param v Vector to add.\n     * @return the sum of {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 61)",
        "(line 246,col 9)-(line 246,col 66)",
        "(line 247,col 9)-(line 247,col 77)",
        "(line 248,col 9)-(line 248,col 77)",
        "(line 249,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.append(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 266,
      "end_line": 274,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending {@code v} to self\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 78)",
        "(line 268,col 9)-(line 268,col 45)",
        "(line 269,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 277,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.append(double)",
      "begin_line": 291,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 63)",
        "(line 294,col 9)-(line 294,col 37)",
        "(line 295,col 9)-(line 295,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.copy()",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 308,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 48)",
        "(line 311,col 9)-(line 311,col 60)",
        "(line 317,col 9)-(line 317,col 37)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 325,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 48)",
        "(line 328,col 9)-(line 328,col 60)",
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 333,col 9)",
        "(line 341,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 357,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 26)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 34)",
        "(line 364,col 9)-(line 364,col 57)",
        "(line 365,col 9)-(line 365,col 28)",
        "(line 366,col 9)-(line 366,col 43)",
        "(line 367,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDimension()",
      "begin_line": 378,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 391,
      "end_line": 411,
      "comment": "\n     * Optimized method to compute distance.\n     *\n     * @param v Vector to compute distance to.\n     * @return the distance from {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 43)",
        "(line 393,col 9)-(line 393,col 23)",
        "(line 394,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 41)",
        "(line 402,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 414,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 48)",
        "(line 417,col 9)-(line 421,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 425,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 26)",
        "(line 428,col 9)-(line 428,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 440,
      "end_line": 458,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return distance between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 23)",
        "(line 442,col 9)-(line 442,col 43)",
        "(line 443,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 41)",
        "(line 449,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 461,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 48)",
        "(line 464,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 477,
      "end_line": 498,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     *\n     * @param v Vector to compute distance from.\n     * @return the LInfDistance.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 23)",
        "(line 479,col 9)-(line 479,col 43)",
        "(line 480,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 41)",
        "(line 488,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 501,
      "end_line": 509,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 48)",
        "(line 504,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 512,
      "end_line": 527,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 38)",
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isNaN()",
      "begin_line": 530,
      "end_line": 540,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 43)",
        "(line 533,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 543,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 549,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 558,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 26)",
        "(line 561,col 9)-(line 565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 569,
      "end_line": 576,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 26)",
        "(line 572,col 9)-(line 572,col 49)",
        "(line 573,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.set(double)",
      "begin_line": 579,
      "end_line": 584,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 594,
      "end_line": 608,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     *\n     * @param v Vector to subtract from {@code this}.\n     * @return the difference of {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 48)",
        "(line 596,col 9)-(line 596,col 39)",
        "(line 597,col 9)-(line 597,col 50)",
        "(line 598,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 611,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 48)",
        "(line 614,col 9)-(line 618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitVector()",
      "begin_line": 622,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 39)",
        "(line 625,col 9)-(line 625,col 22)",
        "(line 626,col 9)-(line 626,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitize()",
      "begin_line": 630,
      "end_line": 641,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 32)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 43)",
        "(line 637,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.toArray()",
      "begin_line": 644,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 47)",
        "(line 647,col 9)-(line 647,col 43)",
        "(line 648,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.hashCode()",
      "begin_line": 661,
      "end_line": 676,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 29)",
        "(line 664,col 9)-(line 664,col 23)",
        "(line 665,col 9)-(line 665,col 18)",
        "(line 666,col 9)-(line 666,col 48)",
        "(line 667,col 9)-(line 667,col 63)",
        "(line 668,col 9)-(line 668,col 46)",
        "(line 669,col 9)-(line 669,col 43)",
        "(line 670,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 684,
      "end_line": 717,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 58)",
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 43)",
        "(line 701,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 45)",
        "(line 709,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 716,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 729,
      "end_line": 732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 739,
      "end_line": 770,
      "comment": "\n     * Implementation of {@code Entry} optimized for OpenMap.\n     * This implementation does not allow arbitrary calls to {@code setIndex}\n     * since the order in which entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 741,
      "end_line": 741,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\n         * Build an entry from an iterator point to an element.\n         *\n         * @param iter Iterator pointing to the entry.\n         ",
      "child_ranges": [
        "(line 749,col 13)-(line 749,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 753,
      "end_line": 756,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 759,
      "end_line": 762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 761,col 13)-(line 761,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 765,
      "end_line": 768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 767,col 13)-(line 767,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 777,
      "end_line": 804,
      "comment": "\n     * Iterator class to do iteration over just the non-zero elements.\n     * This implementation is fail-fast, so cannot be used to modify\n     * any zero element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 781,
      "end_line": 781,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 784,
      "end_line": 787,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 785,col 13)-(line 785,col 38)",
        "(line 786,col 13)-(line 786,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 790,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 791,col 13)-(line 791,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 795,
      "end_line": 798,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 796,col 13)-(line 796,col 27)",
        "(line 797,col 13)-(line 797,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 801,
      "end_line": 803,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 802,col 13)-(line 802,col 69)"
      ]
    }
  ]
}
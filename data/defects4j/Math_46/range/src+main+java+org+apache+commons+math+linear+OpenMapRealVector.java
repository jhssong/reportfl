{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SparseRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 812,
      "comment": "\n * This class implements the {@link RealVector} interface with a\n * {@link OpenIntToDoubleHashMap} backing store.\n * @version $Id$\n * @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZERO_TOLERANCE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default Tolerance for having a value considered zero. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #OpenMapRealVector(OpenMapRealVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(double)},\n     * {@link #append(RealVector)}) to gather data into this vector.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Construct a vector of zeroes, specifying zero tolerance.\n     *\n     * @param dimension Size of the vector.\n     * @param epsilon Tolerance below which a value considered zero.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 75,col 50)",
        "(line 76,col 9)-(line 76,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.OpenMapRealVector, int)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector.\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 56)",
        "(line 88,col 9)-(line 88,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, int)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param dimension Size of the vector.\n     * @param expectedSize The expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, int, double)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Build a vector with known the sparseness and zero tolerance\n     * setting (for advanced use only).\n     *\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 32)",
        "(line 111,col 9)-(line 111,col 64)",
        "(line 112,col 9)-(line 112,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(double[])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(double[], double)",
      "begin_line": 132,
      "end_line": 142,
      "comment": "\n     * Create from an array, specifying zero tolerance.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 50)",
        "(line 135,col 9)-(line 135,col 31)",
        "(line 136,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[])",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[], double)",
      "begin_line": 161,
      "end_line": 171,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 36)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 31)",
        "(line 165,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy from.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 39)",
        "(line 180,col 9)-(line 180,col 61)",
        "(line 181,col 9)-(line 181,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 189,
      "end_line": 199,
      "comment": "\n     * Generic copy constructor.\n     *\n     * @param v Instance to copy from.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 192,col 9)-(line 192,col 41)",
        "(line 193,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntries()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isDefaultValue(double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Determine if this value is within epsilon of zero.\n     *\n     * @param value Value to test\n     * @return {@code true} if this value is within epsilon to zero,\n     * {@code false} otherwise.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 223,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 242,
      "end_line": 258,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.\n     * It copies the larger vector, then iterates over the smaller.\n     *\n     * @param v Vector to add.\n     * @return the sum of {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 61)",
        "(line 245,col 9)-(line 245,col 66)",
        "(line 246,col 9)-(line 246,col 77)",
        "(line 247,col 9)-(line 247,col 77)",
        "(line 248,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 265,
      "end_line": 273,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending {@code v} to self\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 78)",
        "(line 267,col 9)-(line 267,col 45)",
        "(line 268,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 276,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double)",
      "begin_line": 289,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 63)",
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 292,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 313,
      "end_line": 324,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * It iterates over the smallest of the two.\n     *\n     * @param v Cector to compute the dot product with.\n     * @return the dot product of {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 48)",
        "(line 315,col 9)-(line 315,col 67)",
        "(line 316,col 9)-(line 316,col 83)",
        "(line 317,col 9)-(line 317,col 77)",
        "(line 318,col 9)-(line 318,col 21)",
        "(line 319,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 327,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 337,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 48)",
        "(line 339,col 9)-(line 339,col 60)",
        "(line 340,col 9)-(line 340,col 43)",
        "(line 341,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 349,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 48)",
        "(line 351,col 9)-(line 351,col 60)",
        "(line 352,col 9)-(line 352,col 43)",
        "(line 353,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 361,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 26)",
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
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getData()",
      "begin_line": 378,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 47)",
        "(line 381,col 9)-(line 381,col 43)",
        "(line 382,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 390,
      "end_line": 392,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 402,
      "end_line": 422,
      "comment": "\n     * Optimized method to compute distance.\n     *\n     * @param v Vector to compute distance to.\n     * @return the distance from {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 404,col 23)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 41)",
        "(line 413,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 425,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 48)",
        "(line 428,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 436,
      "end_line": 439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 26)",
        "(line 438,col 9)-(line 438,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 450,
      "end_line": 468,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return distance between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 23)",
        "(line 452,col 9)-(line 452,col 43)",
        "(line 453,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 41)",
        "(line 459,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 471,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 48)",
        "(line 474,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 487,
      "end_line": 508,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     *\n     * @param v Vector to compute distance from.\n     * @return the LInfDistance.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 23)",
        "(line 489,col 9)-(line 489,col 43)",
        "(line 490,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 41)",
        "(line 498,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 511,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 48)",
        "(line 514,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 522,
      "end_line": 536,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 38)",
        "(line 524,col 9)-(line 524,col 43)",
        "(line 525,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 539,
      "end_line": 548,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 43)",
        "(line 541,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 551,
      "end_line": 554,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 557,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 566,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 48)",
        "(line 568,col 9)-(line 568,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 572,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 26)",
        "(line 574,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 582,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 26)",
        "(line 585,col 9)-(line 585,col 49)",
        "(line 586,col 9)-(line 588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 592,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 594,col 9)-(line 596,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 607,
      "end_line": 621,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     *\n     * @param v Vector to subtract from {@code this}.\n     * @return the difference of {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 48)",
        "(line 609,col 9)-(line 609,col 39)",
        "(line 610,col 9)-(line 610,col 50)",
        "(line 611,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 624,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 48)",
        "(line 627,col 9)-(line 631,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 635,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 39)",
        "(line 638,col 9)-(line 638,col 22)",
        "(line 639,col 9)-(line 639,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 643,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 32)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 43)",
        "(line 650,col 9)-(line 653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 657,
      "end_line": 660,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 668,
      "end_line": 683,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 29)",
        "(line 671,col 9)-(line 671,col 23)",
        "(line 672,col 9)-(line 672,col 18)",
        "(line 673,col 9)-(line 673,col 48)",
        "(line 674,col 9)-(line 674,col 63)",
        "(line 675,col 9)-(line 675,col 46)",
        "(line 676,col 9)-(line 676,col 43)",
        "(line 677,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 691,
      "end_line": 724,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 58)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 43)",
        "(line 708,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 45)",
        "(line 716,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 736,
      "end_line": 739,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 746,
      "end_line": 777,
      "comment": "\n     * Implementation of {@code Entry} optimized for OpenMap.\n     * This implementation does not allow arbitrary calls to {@code setIndex}\n     * since the order in which entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 748,
      "end_line": 748,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\n         * Build an entry from an iterator point to an element.\n         *\n         * @param iter Iterator pointing to the entry.\n         ",
      "child_ranges": [
        "(line 756,col 13)-(line 756,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 760,
      "end_line": 763,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 762,col 13)-(line 762,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 766,
      "end_line": 769,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 768,col 13)-(line 768,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 772,
      "end_line": 775,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 774,col 13)-(line 774,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 784,
      "end_line": 811,
      "comment": "\n     * Iterator class to do iteration over just the non-zero elements.\n     * This implementation is fail-fast, so cannot be used to modify\n     * any zero element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 786,
      "end_line": 786,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 791,
      "end_line": 794,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 792,col 13)-(line 792,col 38)",
        "(line 793,col 13)-(line 793,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 797,
      "end_line": 799,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 798,col 13)-(line 798,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 802,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 803,col 13)-(line 803,col 27)",
        "(line 804,col 13)-(line 804,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 808,
      "end_line": 810,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 13)-(line 809,col 69)"
      ]
    }
  ]
}
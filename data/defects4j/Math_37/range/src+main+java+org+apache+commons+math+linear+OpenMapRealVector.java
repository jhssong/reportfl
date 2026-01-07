{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
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
      "end_line": 817,
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
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double)",
      "begin_line": 290,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 63)",
        "(line 293,col 9)-(line 293,col 37)",
        "(line 294,col 9)-(line 294,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 315,
      "end_line": 326,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * It iterates over the smallest of the two.\n     *\n     * @param v Cector to compute the dot product with.\n     * @return the dot product of {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 48)",
        "(line 317,col 9)-(line 317,col 67)",
        "(line 318,col 9)-(line 318,col 83)",
        "(line 319,col 9)-(line 319,col 77)",
        "(line 320,col 9)-(line 320,col 21)",
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 329,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 339,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 48)",
        "(line 342,col 9)-(line 342,col 60)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 352,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 48)",
        "(line 355,col 9)-(line 355,col 60)",
        "(line 356,col 9)-(line 356,col 43)",
        "(line 357,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 365,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 26)",
        "(line 368,col 9)-(line 368,col 34)",
        "(line 369,col 9)-(line 369,col 57)",
        "(line 370,col 9)-(line 370,col 28)",
        "(line 371,col 9)-(line 371,col 43)",
        "(line 372,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 383,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 396,
      "end_line": 416,
      "comment": "\n     * Optimized method to compute distance.\n     *\n     * @param v Vector to compute distance to.\n     * @return the distance from {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 43)",
        "(line 398,col 9)-(line 398,col 23)",
        "(line 399,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 41)",
        "(line 407,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 419,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 48)",
        "(line 422,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 430,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 26)",
        "(line 433,col 9)-(line 433,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 445,
      "end_line": 463,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return distance between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 23)",
        "(line 447,col 9)-(line 447,col 43)",
        "(line 448,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 41)",
        "(line 454,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 466,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 48)",
        "(line 469,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 482,
      "end_line": 503,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     *\n     * @param v Vector to compute distance from.\n     * @return the LInfDistance.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 23)",
        "(line 484,col 9)-(line 484,col 43)",
        "(line 485,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 41)",
        "(line 493,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 506,
      "end_line": 514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 48)",
        "(line 509,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 517,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 38)",
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 535,
      "end_line": 545,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 43)",
        "(line 538,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 548,
      "end_line": 551,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 554,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 563,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 48)",
        "(line 566,col 9)-(line 566,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 570,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 26)",
        "(line 573,col 9)-(line 577,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 581,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 26)",
        "(line 584,col 9)-(line 584,col 49)",
        "(line 585,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 591,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 606,
      "end_line": 620,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     *\n     * @param v Vector to subtract from {@code this}.\n     * @return the difference of {@code this} and {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 48)",
        "(line 608,col 9)-(line 608,col 39)",
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 623,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 48)",
        "(line 626,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 634,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 39)",
        "(line 637,col 9)-(line 637,col 22)",
        "(line 638,col 9)-(line 638,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 642,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 32)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 43)",
        "(line 649,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 656,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 47)",
        "(line 659,col 9)-(line 659,col 43)",
        "(line 660,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 673,
      "end_line": 688,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 29)",
        "(line 676,col 9)-(line 676,col 23)",
        "(line 677,col 9)-(line 677,col 18)",
        "(line 678,col 9)-(line 678,col 48)",
        "(line 679,col 9)-(line 679,col 63)",
        "(line 680,col 9)-(line 680,col 46)",
        "(line 681,col 9)-(line 681,col 43)",
        "(line 682,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 696,
      "end_line": 729,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 58)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 43)",
        "(line 713,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 45)",
        "(line 721,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 741,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 751,
      "end_line": 782,
      "comment": "\n     * Implementation of {@code Entry} optimized for OpenMap.\n     * This implementation does not allow arbitrary calls to {@code setIndex}\n     * since the order in which entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 753,
      "end_line": 753,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n         * Build an entry from an iterator point to an element.\n         *\n         * @param iter Iterator pointing to the entry.\n         ",
      "child_ranges": [
        "(line 761,col 13)-(line 761,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 765,
      "end_line": 768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 767,col 13)-(line 767,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 771,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 773,col 13)-(line 773,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 777,
      "end_line": 780,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 779,col 13)-(line 779,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 789,
      "end_line": 816,
      "comment": "\n     * Iterator class to do iteration over just the non-zero elements.\n     * This implementation is fail-fast, so cannot be used to modify\n     * any zero element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 793,
      "end_line": 793,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 796,
      "end_line": 799,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 797,col 13)-(line 797,col 38)",
        "(line 798,col 13)-(line 798,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 802,
      "end_line": 804,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 803,col 13)-(line 803,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 807,
      "end_line": 810,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 808,col 13)-(line 808,col 27)",
        "(line 809,col 13)-(line 809,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 813,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 69)"
      ]
    }
  ]
}
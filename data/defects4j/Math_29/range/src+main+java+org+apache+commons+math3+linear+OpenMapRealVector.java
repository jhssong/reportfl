{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/linear/OpenMapRealVector.java",
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
      "end_line": 833,
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
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 316,
      "end_line": 327,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * It iterates over the smallest of the two.\n     *\n     * @param v Cector to compute the dot product with.\n     * @return the dot product of {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 48)",
        "(line 318,col 9)-(line 318,col 67)",
        "(line 319,col 9)-(line 319,col 83)",
        "(line 320,col 9)-(line 320,col 77)",
        "(line 321,col 9)-(line 321,col 21)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 330,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 340,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 48)",
        "(line 343,col 9)-(line 343,col 60)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 358,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 48)",
        "(line 361,col 9)-(line 361,col 60)",
        "(line 362,col 9)-(line 362,col 43)",
        "(line 363,col 9)-(line 366,col 9)",
        "(line 374,col 9)-(line 374,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 378,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 26)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 34)",
        "(line 385,col 9)-(line 385,col 57)",
        "(line 386,col 9)-(line 386,col 28)",
        "(line 387,col 9)-(line 387,col 43)",
        "(line 388,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDimension()",
      "begin_line": 399,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 412,
      "end_line": 432,
      "comment": "\n     * Optimized method to compute distance.\n     *\n     * @param v Vector to compute distance to.\n     * @return the distance from {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 43)",
        "(line 414,col 9)-(line 414,col 23)",
        "(line 415,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 435,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 48)",
        "(line 438,col 9)-(line 442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 446,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 26)",
        "(line 449,col 9)-(line 449,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 461,
      "end_line": 479,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return distance between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 23)",
        "(line 463,col 9)-(line 463,col 43)",
        "(line 464,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 41)",
        "(line 470,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 482,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 48)",
        "(line 485,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 498,
      "end_line": 519,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     *\n     * @param v Vector to compute distance from.\n     * @return the LInfDistance.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 23)",
        "(line 500,col 9)-(line 500,col 43)",
        "(line 501,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 41)",
        "(line 509,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 522,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 48)",
        "(line 525,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 533,
      "end_line": 548,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 38)",
        "(line 536,col 9)-(line 536,col 43)",
        "(line 537,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isNaN()",
      "begin_line": 551,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 43)",
        "(line 554,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 564,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 570,
      "end_line": 576,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 579,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 48)",
        "(line 582,col 9)-(line 582,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 586,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 26)",
        "(line 589,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 597,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 26)",
        "(line 600,col 9)-(line 600,col 49)",
        "(line 601,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.set(double)",
      "begin_line": 607,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 609,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 622,
      "end_line": 636,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     *\n     * @param v Vector to subtract from {@code this}.\n     * @return the difference of {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 48)",
        "(line 624,col 9)-(line 624,col 39)",
        "(line 625,col 9)-(line 625,col 50)",
        "(line 626,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 639,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 48)",
        "(line 642,col 9)-(line 646,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitVector()",
      "begin_line": 650,
      "end_line": 655,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 39)",
        "(line 653,col 9)-(line 653,col 22)",
        "(line 654,col 9)-(line 654,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitize()",
      "begin_line": 658,
      "end_line": 669,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 32)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 43)",
        "(line 665,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.toArray()",
      "begin_line": 672,
      "end_line": 681,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 47)",
        "(line 675,col 9)-(line 675,col 43)",
        "(line 676,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.hashCode()",
      "begin_line": 689,
      "end_line": 704,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 29)",
        "(line 692,col 9)-(line 692,col 23)",
        "(line 693,col 9)-(line 693,col 18)",
        "(line 694,col 9)-(line 694,col 48)",
        "(line 695,col 9)-(line 695,col 63)",
        "(line 696,col 9)-(line 696,col 46)",
        "(line 697,col 9)-(line 697,col 43)",
        "(line 698,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 712,
      "end_line": 745,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 58)",
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 43)",
        "(line 729,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 45)",
        "(line 737,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 752,
      "end_line": 754,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 757,
      "end_line": 760,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 767,
      "end_line": 798,
      "comment": "\n     * Implementation of {@code Entry} optimized for OpenMap.\n     * This implementation does not allow arbitrary calls to {@code setIndex}\n     * since the order in which entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 769,
      "end_line": 769,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n         * Build an entry from an iterator point to an element.\n         *\n         * @param iter Iterator pointing to the entry.\n         ",
      "child_ranges": [
        "(line 777,col 13)-(line 777,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 781,
      "end_line": 784,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 783,col 13)-(line 783,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 787,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 789,col 13)-(line 789,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 793,
      "end_line": 796,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 13)-(line 795,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 805,
      "end_line": 832,
      "comment": "\n     * Iterator class to do iteration over just the non-zero elements.\n     * This implementation is fail-fast, so cannot be used to modify\n     * any zero element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 807,
      "end_line": 807,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 809,
      "end_line": 809,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 812,
      "end_line": 815,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 38)",
        "(line 814,col 13)-(line 814,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 818,
      "end_line": 820,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 819,col 13)-(line 819,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 823,
      "end_line": 826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 824,col 13)-(line 824,col 27)",
        "(line 825,col 13)-(line 825,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 829,
      "end_line": 831,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 830,col 13)-(line 830,col 69)"
      ]
    }
  ]
}
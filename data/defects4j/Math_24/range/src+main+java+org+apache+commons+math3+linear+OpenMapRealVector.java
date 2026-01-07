{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/linear/OpenMapRealVector.java",
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
      "end_line": 825,
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
      "begin_line": 322,
      "end_line": 325,
      "comment": "\n     * Computes the dot product.\n     * Note that the computation is now performed in the parent class: no\n     * performance improvement is to be expected from this overloaded\n     * method.\n     * The previous implementation was buggy and cannot be easily fixed\n     * (see MATH-795).\n     *\n     * @param v Vector.\n     * @return the dot product of this vector with {@code v}.\n     *\n     * @deprecated as of 3.1 (to be removed in 4.0). The computation is\n     * performed by the parent class. The method must be kept to maintain\n     * backwards compatibility.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 328,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 48)",
        "(line 331,col 9)-(line 331,col 60)",
        "(line 337,col 9)-(line 337,col 37)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 345,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 48)",
        "(line 348,col 9)-(line 348,col 60)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 353,col 9)",
        "(line 361,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 377,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 34)",
        "(line 384,col 9)-(line 384,col 57)",
        "(line 385,col 9)-(line 385,col 28)",
        "(line 386,col 9)-(line 386,col 43)",
        "(line 387,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDimension()",
      "begin_line": 398,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 411,
      "end_line": 431,
      "comment": "\n     * Optimized method to compute distance.\n     *\n     * @param v Vector to compute distance to.\n     * @return the distance from {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 43)",
        "(line 413,col 9)-(line 413,col 23)",
        "(line 414,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 41)",
        "(line 422,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 434,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 48)",
        "(line 437,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 445,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 26)",
        "(line 448,col 9)-(line 448,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 460,
      "end_line": 478,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return distance between this vector and {@code v}.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 23)",
        "(line 462,col 9)-(line 462,col 43)",
        "(line 463,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 41)",
        "(line 469,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 481,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 48)",
        "(line 484,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 497,
      "end_line": 518,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     *\n     * @param v Vector to compute distance from.\n     * @return the LInfDistance.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 23)",
        "(line 499,col 9)-(line 499,col 43)",
        "(line 500,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 41)",
        "(line 508,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 521,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 48)",
        "(line 524,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 532,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 38)",
        "(line 535,col 9)-(line 535,col 43)",
        "(line 536,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isNaN()",
      "begin_line": 550,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 43)",
        "(line 553,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 563,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 569,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 578,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 26)",
        "(line 581,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 589,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 26)",
        "(line 592,col 9)-(line 592,col 49)",
        "(line 593,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.set(double)",
      "begin_line": 599,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 614,
      "end_line": 628,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     *\n     * @param v Vector to subtract from {@code this}.\n     * @return the difference of {@code this} and {@code v}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 48)",
        "(line 616,col 9)-(line 616,col 39)",
        "(line 617,col 9)-(line 617,col 50)",
        "(line 618,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 631,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 48)",
        "(line 634,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitVector()",
      "begin_line": 642,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 39)",
        "(line 645,col 9)-(line 645,col 22)",
        "(line 646,col 9)-(line 646,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitize()",
      "begin_line": 650,
      "end_line": 661,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 32)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 43)",
        "(line 657,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.toArray()",
      "begin_line": 664,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 47)",
        "(line 667,col 9)-(line 667,col 43)",
        "(line 668,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.hashCode()",
      "begin_line": 681,
      "end_line": 696,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 29)",
        "(line 684,col 9)-(line 684,col 23)",
        "(line 685,col 9)-(line 685,col 18)",
        "(line 686,col 9)-(line 686,col 48)",
        "(line 687,col 9)-(line 687,col 63)",
        "(line 688,col 9)-(line 688,col 46)",
        "(line 689,col 9)-(line 689,col 43)",
        "(line 690,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 704,
      "end_line": 737,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 58)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 43)",
        "(line 721,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 45)",
        "(line 729,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 749,
      "end_line": 752,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 759,
      "end_line": 790,
      "comment": "\n     * Implementation of {@code Entry} optimized for OpenMap.\n     * This implementation does not allow arbitrary calls to {@code setIndex}\n     * since the order in which entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\n         * Build an entry from an iterator point to an element.\n         *\n         * @param iter Iterator pointing to the entry.\n         ",
      "child_ranges": [
        "(line 769,col 13)-(line 769,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 773,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 13)-(line 775,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 779,
      "end_line": 782,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 13)-(line 781,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 785,
      "end_line": 788,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 787,col 13)-(line 787,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 797,
      "end_line": 824,
      "comment": "\n     * Iterator class to do iteration over just the non-zero elements.\n     * This implementation is fail-fast, so cannot be used to modify\n     * any zero element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 799,
      "end_line": 799,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 801,
      "end_line": 801,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 804,
      "end_line": 807,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 805,col 13)-(line 805,col 38)",
        "(line 806,col 13)-(line 806,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 810,
      "end_line": 812,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 811,col 13)-(line 811,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 815,
      "end_line": 818,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 816,col 13)-(line 816,col 27)",
        "(line 817,col 13)-(line 817,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 821,
      "end_line": 823,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 822,col 13)-(line 822,col 69)"
      ]
    }
  ]
}
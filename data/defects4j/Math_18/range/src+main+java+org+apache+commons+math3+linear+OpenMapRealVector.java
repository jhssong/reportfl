{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/linear/OpenMapRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.SparseRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 851,
      "comment": "\n * This class implements the {@link RealVector} interface with a\n * {@link OpenIntToDoubleHashMap} backing store.\n * @version $Id$\n * @since 2.0\n * @deprecated As of version 3.1, this class is deprecated, for reasons exposed\n * in this JIRA\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-870\"\u003eticket\u003c/a\u003e. This\n * class will be removed in version 4.0.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZERO_TOLERANCE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default Tolerance for having a value considered zero. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #OpenMapRealVector(OpenMapRealVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(double)},\n     * {@link #append(RealVector)}) to gather data into this vector.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int, double)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * Construct a vector of zeroes, specifying zero tolerance.\n     *\n     * @param dimension Size of the vector.\n     * @param epsilon Tolerance below which a value considered zero.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 84,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector, int)",
      "begin_line": 93,
      "end_line": 97,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector.\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 48)",
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 96,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int, int)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param dimension Size of the vector.\n     * @param expectedSize The expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(int, int, double)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Build a vector with known the sparseness and zero tolerance\n     * setting (for advanced use only).\n     *\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 64)",
        "(line 120,col 9)-(line 120,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(double[])",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(double[], double)",
      "begin_line": 140,
      "end_line": 150,
      "comment": "\n     * Create from an array, specifying zero tolerance.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 50)",
        "(line 143,col 9)-(line 143,col 31)",
        "(line 144,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[])",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[], double)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "\n     * Create from an array.\n     * Only non-zero entries will be stored.\n     *\n     * @param values Set of values to create from.\n     * @param epsilon Tolerance below which a value is considered zero.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 36)",
        "(line 171,col 9)-(line 171,col 50)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 173,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy from.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 39)",
        "(line 188,col 9)-(line 188,col 61)",
        "(line 189,col 9)-(line 189,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 197,
      "end_line": 207,
      "comment": "\n     * Generic copy constructor.\n     *\n     * @param v Instance to copy from.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 39)",
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 200,col 41)",
        "(line 201,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getEntries()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isDefaultValue(double)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Determine if this value is within epsilon of zero.\n     *\n     * @param value Value to test\n     * @return {@code true} if this value is within epsilon to zero,\n     * {@code false} otherwise.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.add(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 231,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 48)",
        "(line 235,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.add(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 250,
      "end_line": 267,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.\n     * It copies the larger vector, then iterates over the smaller.\n     *\n     * @param v Vector to add.\n     * @return the sum of {@code this} and {@code v}.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 48)",
        "(line 253,col 9)-(line 253,col 61)",
        "(line 254,col 9)-(line 254,col 66)",
        "(line 255,col 9)-(line 255,col 77)",
        "(line 256,col 9)-(line 256,col 77)",
        "(line 257,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.append(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 274,
      "end_line": 282,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending {@code v} to self\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 78)",
        "(line 276,col 9)-(line 276,col 45)",
        "(line 277,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 285,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.append(double)",
      "begin_line": 299,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 63)",
        "(line 302,col 9)-(line 302,col 37)",
        "(line 303,col 9)-(line 303,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.copy()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 332,
      "end_line": 336,
      "comment": "\n     * Computes the dot product.\n     * Note that the computation is now performed in the parent class: no\n     * performance improvement is to be expected from this overloaded\n     * method.\n     * The previous implementation was buggy and cannot be easily fixed\n     * (see MATH-795).\n     *\n     * @param v Vector.\n     * @return the dot product of this vector with {@code v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this} vector.\n     *\n     * @deprecated as of 3.1 (to be removed in 4.0). The computation is\n     * performed by the parent class. The method must be kept to maintain\n     * backwards compatibility.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 339,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 48)",
        "(line 343,col 9)-(line 343,col 60)",
        "(line 349,col 9)-(line 349,col 37)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 357,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 48)",
        "(line 361,col 9)-(line 361,col 60)",
        "(line 362,col 9)-(line 362,col 43)",
        "(line 363,col 9)-(line 366,col 9)",
        "(line 374,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 390,
      "end_line": 409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 26)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 34)",
        "(line 398,col 9)-(line 398,col 57)",
        "(line 399,col 9)-(line 399,col 28)",
        "(line 400,col 9)-(line 400,col 43)",
        "(line 401,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDimension()",
      "begin_line": 412,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 424,
      "end_line": 446,
      "comment": "\n     * Optimized method to compute distance.\n     *\n     * @param v Vector to compute distance to.\n     * @return the distance from {@code this} and {@code v}.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 48)",
        "(line 427,col 9)-(line 427,col 43)",
        "(line 428,col 9)-(line 428,col 23)",
        "(line 429,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 41)",
        "(line 437,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 449,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 48)",
        "(line 452,col 9)-(line 456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 460,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 26)",
        "(line 463,col 9)-(line 463,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 476,
      "end_line": 496,
      "comment": "\n     * Distance between two vectors.\n     * This method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\n     *\n     * @param v Vector to which distance is requested.\n     * @return distance between this vector and {@code v}.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 48)",
        "(line 479,col 9)-(line 479,col 23)",
        "(line 480,col 9)-(line 480,col 43)",
        "(line 481,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 41)",
        "(line 487,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 499,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 517,
      "end_line": 540,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     *\n     * @param v Vector to compute distance from.\n     * @return the LInfDistance.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 48)",
        "(line 520,col 9)-(line 520,col 23)",
        "(line 521,col 9)-(line 521,col 43)",
        "(line 522,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 41)",
        "(line 530,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 543,
      "end_line": 552,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 48)",
        "(line 547,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 555,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 38)",
        "(line 558,col 9)-(line 558,col 43)",
        "(line 559,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.isNaN()",
      "begin_line": 573,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 43)",
        "(line 576,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 586,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 592,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 601,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 26)",
        "(line 605,col 9)-(line 609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 613,
      "end_line": 621,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 26)",
        "(line 617,col 9)-(line 617,col 49)",
        "(line 618,col 9)-(line 620,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.set(double)",
      "begin_line": 624,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 626,col 9)-(line 628,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.OpenMapRealVector)",
      "begin_line": 638,
      "end_line": 653,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     *\n     * @param v Vector to subtract from {@code this}.\n     * @return the difference of {@code this} and {@code v}.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 48)",
        "(line 641,col 9)-(line 641,col 39)",
        "(line 642,col 9)-(line 642,col 50)",
        "(line 643,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.subtract(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 656,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 48)",
        "(line 660,col 9)-(line 664,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitVector()",
      "begin_line": 668,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 39)",
        "(line 671,col 9)-(line 671,col 22)",
        "(line 672,col 9)-(line 672,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.unitize()",
      "begin_line": 676,
      "end_line": 687,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 32)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 43)",
        "(line 683,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.toArray()",
      "begin_line": 690,
      "end_line": 699,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 47)",
        "(line 693,col 9)-(line 693,col 43)",
        "(line 694,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.hashCode()",
      "begin_line": 707,
      "end_line": 722,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 29)",
        "(line 710,col 9)-(line 710,col 23)",
        "(line 711,col 9)-(line 711,col 18)",
        "(line 712,col 9)-(line 712,col 48)",
        "(line 713,col 9)-(line 713,col 63)",
        "(line 714,col 9)-(line 714,col 46)",
        "(line 715,col 9)-(line 715,col 43)",
        "(line 716,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 730,
      "end_line": 763,
      "comment": "\n     * {@inheritDoc}\n     * Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 58)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 746,col 43)",
        "(line 747,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 45)",
        "(line 755,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 770,
      "end_line": 772,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 775,
      "end_line": 778,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector.Entry"
      ],
      "begin_line": 785,
      "end_line": 816,
      "comment": "\n     * Implementation of {@code Entry} optimized for OpenMap.\n     * This implementation does not allow arbitrary calls to {@code setIndex}\n     * since the order in which entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n         * Build an entry from an iterator point to an element.\n         *\n         * @param iter Iterator pointing to the entry.\n         ",
      "child_ranges": [
        "(line 795,col 13)-(line 795,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 799,
      "end_line": 802,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 801,col 13)-(line 801,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 805,
      "end_line": 808,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 807,col 13)-(line 807,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 811,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math3.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 823,
      "end_line": 850,
      "comment": "\n     * Iterator class to do iteration over just the non-zero elements.\n     * This implementation is fail-fast, so cannot be used to modify\n     * any zero element.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 825,
      "end_line": 825,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 827,
      "end_line": 827,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 830,
      "end_line": 833,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 831,col 13)-(line 831,col 38)",
        "(line 832,col 13)-(line 832,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 836,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 13)-(line 837,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 841,
      "end_line": 844,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 842,col 13)-(line 842,col 27)",
        "(line 843,col 13)-(line 843,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 847,
      "end_line": 849,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 848,col 13)-(line 848,col 69)"
      ]
    }
  ]
}
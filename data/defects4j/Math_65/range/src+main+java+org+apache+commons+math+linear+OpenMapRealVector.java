{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealVector",
        "org.apache.commons.math.linear.SparseRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 913,
      "comment": "\n * This class implements the {@link RealVector} interface with a {@link OpenIntToDoubleHashMap} backing store.\n * @version $Revision$ $Date$\n * @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZERO_TOLERANCE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default Tolerance for having a value considered zero. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
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
      "begin_line": 43,
      "end_line": 43,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #OpenMapRealVector(OpenMapRealVector, int)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(RealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Construct a (dimension)-length vector of zeros.\n     * @param dimension size of the vector\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, double)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Construct a (dimension)-length vector of zeros, specifying zero tolerance.\n     * @param dimension Size of the vector\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)",
        "(line 76,col 9)-(line 76,col 50)",
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.OpenMapRealVector, int)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Build a resized vector, for use with append.\n     * @param v The original vector\n     * @param resize The amount to resize it\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 56)",
        "(line 88,col 9)-(line 88,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, int, double)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Build a vector with known the sparseness and zero tolerance setting (for advanced use only).\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)",
        "(line 108,col 9)-(line 108,col 64)",
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(double[])",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Create from a double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(double[], double)",
      "begin_line": 127,
      "end_line": 137,
      "comment": "\n     * Create from a double array, specifying zero tolerance.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 131,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[])",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[], double)",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 36)",
        "(line 156,col 9)-(line 156,col 50)",
        "(line 157,col 9)-(line 157,col 31)",
        "(line 158,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\n     * Copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 39)",
        "(line 172,col 9)-(line 172,col 61)",
        "(line 173,col 9)-(line 173,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 180,
      "end_line": 190,
      "comment": "\n     * Generic copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 39)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 41)",
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntries()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Get the entries of this instance.\n     * @return entries of this instance\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isDefaultValue(double)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Determine if this value is within epsilon of zero.\n     * @param value The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this value is within epsilon to zero, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 211,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 48)",
        "(line 214,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 227,
      "end_line": 243,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.  Copies the larger vector, iterates over the smaller.\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 48)",
        "(line 229,col 9)-(line 229,col 61)",
        "(line 230,col 9)-(line 230,col 66)",
        "(line 231,col 9)-(line 231,col 77)",
        "(line 232,col 9)-(line 232,col 77)",
        "(line 233,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 250,
      "end_line": 258,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 78)",
        "(line 252,col 9)-(line 252,col 45)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 261,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double)",
      "begin_line": 269,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 63)",
        "(line 271,col 9)-(line 271,col 37)",
        "(line 272,col 9)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double[])",
      "begin_line": 276,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 70)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 300,
      "end_line": 311,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * Iterates over the smaller of the two.\n     * @param v The vector to compute the dot product with\n     * @return The dot product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 67)",
        "(line 303,col 9)-(line 303,col 83)",
        "(line 304,col 9)-(line 304,col 77)",
        "(line 305,col 9)-(line 305,col 21)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 314,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 324,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 48)",
        "(line 326,col 9)-(line 326,col 60)",
        "(line 327,col 9)-(line 327,col 47)",
        "(line 328,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(double[])",
      "begin_line": 336,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 40)",
        "(line 339,col 9)-(line 339,col 60)",
        "(line 340,col 9)-(line 340,col 47)",
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
        "(line 352,col 9)-(line 352,col 47)",
        "(line 353,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(double[])",
      "begin_line": 361,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 40)",
        "(line 364,col 9)-(line 364,col 60)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 374,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 26)",
        "(line 376,col 9)-(line 376,col 34)",
        "(line 377,col 9)-(line 377,col 57)",
        "(line 378,col 9)-(line 378,col 28)",
        "(line 379,col 9)-(line 379,col 43)",
        "(line 380,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getData()",
      "begin_line": 391,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 47)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 403,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 413,
      "end_line": 433,
      "comment": "\n     * Optimized method to compute distance.\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 43)",
        "(line 415,col 9)-(line 415,col 23)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 41)",
        "(line 424,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 436,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 48)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(double[])",
      "begin_line": 446,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 40)",
        "(line 449,col 9)-(line 449,col 23)",
        "(line 450,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 458,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 26)",
        "(line 460,col 9)-(line 460,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 471,
      "end_line": 489,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 23)",
        "(line 473,col 9)-(line 473,col 43)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 41)",
        "(line 480,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 492,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 48)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(double[])",
      "begin_line": 502,
      "end_line": 511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 40)",
        "(line 505,col 9)-(line 505,col 23)",
        "(line 506,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 518,
      "end_line": 539,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 23)",
        "(line 520,col 9)-(line 520,col 43)",
        "(line 521,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 41)",
        "(line 529,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 542,
      "end_line": 549,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 48)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(double[])",
      "begin_line": 552,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 40)",
        "(line 555,col 9)-(line 555,col 23)",
        "(line 556,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 566,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 38)",
        "(line 568,col 9)-(line 568,col 43)",
        "(line 569,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 583,
      "end_line": 592,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 43)",
        "(line 585,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 595,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 601,
      "end_line": 607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerProduct(double[])",
      "begin_line": 610,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 40)",
        "(line 613,col 9)-(line 613,col 73)",
        "(line 614,col 9)-(line 614,col 43)",
        "(line 615,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 627,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 48)",
        "(line 629,col 9)-(line 629,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(double[])",
      "begin_line": 633,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 40)",
        "(line 636,col 9)-(line 636,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 640,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 26)",
        "(line 642,col 9)-(line 646,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 650,
      "end_line": 655,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 26)",
        "(line 653,col 9)-(line 653,col 49)",
        "(line 654,col 9)-(line 654,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, double[])",
      "begin_line": 658,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 26)",
        "(line 661,col 9)-(line 661,col 41)",
        "(line 662,col 9)-(line 664,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 668,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 681,
      "end_line": 695,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 48)",
        "(line 683,col 9)-(line 683,col 39)",
        "(line 684,col 9)-(line 684,col 50)",
        "(line 685,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 698,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 48)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(double[])",
      "begin_line": 708,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 40)",
        "(line 711,col 9)-(line 711,col 60)",
        "(line 712,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 724,
      "end_line": 729,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 39)",
        "(line 727,col 9)-(line 727,col 22)",
        "(line 728,col 9)-(line 728,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 732,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 32)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 43)",
        "(line 739,col 9)-(line 742,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 748,
      "end_line": 751,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 758,
      "end_line": 773,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 29)",
        "(line 761,col 9)-(line 761,col 23)",
        "(line 762,col 9)-(line 762,col 18)",
        "(line 763,col 9)-(line 763,col 48)",
        "(line 764,col 9)-(line 764,col 63)",
        "(line 765,col 9)-(line 765,col 46)",
        "(line 766,col 9)-(line 766,col 43)",
        "(line 767,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 772,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 781,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003e Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\u003c/p\u003e\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 58)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 43)",
        "(line 798,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 45)",
        "(line 806,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparcity()",
      "begin_line": 821,
      "end_line": 824,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     * @deprecated Use the correctly spelled {@link #getSparsity()}\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparsity()",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\n    *\n    * @return the percentage of none zero elements as a decimal percent.\n    ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 835,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 845,
      "end_line": 875,
      "comment": "\n     *  Implementation of \u003ccode\u003eEntry\u003c/code\u003e optimized for OpenMap.\n     * \u003cp\u003eThis implementation does not allow arbitrary calls to \u003ccode\u003esetIndex\u003c/code\u003e\n     * since the order that entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 848,
      "end_line": 848,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 853,
      "end_line": 855,
      "comment": " Build an entry from an iterator point to an element.\n         * @param iter iterator pointing to the entry\n         ",
      "child_ranges": [
        "(line 854,col 13)-(line 854,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 858,
      "end_line": 861,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 860,col 13)-(line 860,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 864,
      "end_line": 867,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 866,col 13)-(line 866,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 870,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 872,col 13)-(line 872,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 882,
      "end_line": 912,
      "comment": "\n     *  Iterator class to do iteration over just the non-zero elements.\n     *  \u003cp\u003eThis implementation is fail-fast, so cannot be used to modify any zero element.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 885,
      "end_line": 885,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 888,
      "end_line": 888,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 891,
      "end_line": 894,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 38)",
        "(line 893,col 13)-(line 893,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 897,
      "end_line": 899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 898,col 13)-(line 898,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 902,
      "end_line": 905,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 13)-(line 903,col 27)",
        "(line 904,col 13)-(line 904,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 908,
      "end_line": 910,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 909,col 13)-(line 909,col 69)"
      ]
    }
  ]
}
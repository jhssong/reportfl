{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
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
      "begin_line": 30,
      "end_line": 902,
      "comment": "\n * This class implements the {@link RealVector} interface with a {@link OpenIntToDoubleHashMap} backing store.\n * @version $Revision$ $Date$\n * @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZERO_TOLERANCE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default Tolerance for having a value considered zero. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 39,
      "end_line": 39,
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
      "begin_line": 45,
      "end_line": 45,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #OpenMapRealVector(OpenMapRealVector, int)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(RealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Construct a (dimension)-length vector of zeros.\n     * @param dimension size of the vector\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Construct a (dimension)-length vector of zeros, specifying zero tolerance.\n     * @param dimension Size of the vector\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 75,col 50)",
        "(line 76,col 9)-(line 76,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.OpenMapRealVector, int)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Build a resized vector, for use with append.\n     * @param v The original vector\n     * @param resize The amount to resize it\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 48)",
        "(line 86,col 9)-(line 86,col 56)",
        "(line 87,col 9)-(line 87,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, int)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(int, int, double)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * Build a vector with known the sparseness and zero tolerance setting (for advanced use only).\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 32)",
        "(line 107,col 9)-(line 107,col 64)",
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(double[])",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Create from a double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(double[], double)",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Create from a double array, specifying zero tolerance.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 50)",
        "(line 129,col 9)-(line 129,col 31)",
        "(line 130,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[])",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(java.lang.Double[], double)",
      "begin_line": 153,
      "end_line": 163,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 31)",
        "(line 157,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 169,
      "end_line": 173,
      "comment": "\n     * Copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 61)",
        "(line 172,col 9)-(line 172,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 179,
      "end_line": 189,
      "comment": "\n     * Generic copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 39)",
        "(line 181,col 9)-(line 181,col 50)",
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntries()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Get the entries of this instance.\n     * @return entries of this instance\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isDefaultValue(double)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Determine if this value is within epsilon of zero.\n     * @param value The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this value is within epsilon to zero, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 210,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 48)",
        "(line 213,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 226,
      "end_line": 242,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.  Copies the larger vector, iterates over the smaller.\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 48)",
        "(line 228,col 9)-(line 228,col 61)",
        "(line 229,col 9)-(line 229,col 66)",
        "(line 230,col 9)-(line 230,col 77)",
        "(line 231,col 9)-(line 231,col 77)",
        "(line 232,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 249,
      "end_line": 257,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 78)",
        "(line 251,col 9)-(line 251,col 45)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 260,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double)",
      "begin_line": 268,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 63)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double[])",
      "begin_line": 275,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\n     * {@inheritDoc}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 299,
      "end_line": 310,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * Iterates over the smaller of the two.\n     * @param v The vector to compute the dot product with\n     * @return The dot product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 48)",
        "(line 301,col 9)-(line 301,col 67)",
        "(line 302,col 9)-(line 302,col 83)",
        "(line 303,col 9)-(line 303,col 77)",
        "(line 304,col 9)-(line 304,col 21)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 313,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 315,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 323,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 48)",
        "(line 325,col 9)-(line 325,col 60)",
        "(line 326,col 9)-(line 326,col 47)",
        "(line 327,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(double[])",
      "begin_line": 335,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 40)",
        "(line 338,col 9)-(line 338,col 60)",
        "(line 339,col 9)-(line 339,col 47)",
        "(line 340,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 348,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 48)",
        "(line 350,col 9)-(line 350,col 60)",
        "(line 351,col 9)-(line 351,col 47)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(double[])",
      "begin_line": 360,
      "end_line": 370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 40)",
        "(line 363,col 9)-(line 363,col 60)",
        "(line 364,col 9)-(line 364,col 47)",
        "(line 365,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 373,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 26)",
        "(line 375,col 9)-(line 375,col 34)",
        "(line 376,col 9)-(line 376,col 57)",
        "(line 377,col 9)-(line 377,col 28)",
        "(line 378,col 9)-(line 378,col 43)",
        "(line 379,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getData()",
      "begin_line": 390,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 47)",
        "(line 393,col 9)-(line 393,col 43)",
        "(line 394,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 402,
      "end_line": 404,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 412,
      "end_line": 432,
      "comment": "\n     * Optimized method to compute distance.\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 43)",
        "(line 414,col 9)-(line 414,col 23)",
        "(line 415,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 435,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 48)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(double[])",
      "begin_line": 445,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 40)",
        "(line 448,col 9)-(line 448,col 23)",
        "(line 449,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 457,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 26)",
        "(line 459,col 9)-(line 459,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 470,
      "end_line": 488,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 23)",
        "(line 472,col 9)-(line 472,col 43)",
        "(line 473,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 41)",
        "(line 479,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 491,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 48)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(double[])",
      "begin_line": 501,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 40)",
        "(line 504,col 9)-(line 504,col 23)",
        "(line 505,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 517,
      "end_line": 538,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 23)",
        "(line 519,col 9)-(line 519,col 43)",
        "(line 520,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 41)",
        "(line 528,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 541,
      "end_line": 548,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 48)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(double[])",
      "begin_line": 551,
      "end_line": 562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 40)",
        "(line 554,col 9)-(line 554,col 23)",
        "(line 555,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 565,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 38)",
        "(line 567,col 9)-(line 567,col 43)",
        "(line 568,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 582,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 43)",
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 594,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 600,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerProduct(double[])",
      "begin_line": 609,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 40)",
        "(line 612,col 9)-(line 612,col 73)",
        "(line 613,col 9)-(line 613,col 43)",
        "(line 614,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 626,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 48)",
        "(line 628,col 9)-(line 628,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(double[])",
      "begin_line": 632,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 40)",
        "(line 635,col 9)-(line 635,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 639,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 26)",
        "(line 641,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 649,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 26)",
        "(line 652,col 9)-(line 652,col 49)",
        "(line 653,col 9)-(line 653,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, double[])",
      "begin_line": 657,
      "end_line": 664,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 26)",
        "(line 660,col 9)-(line 660,col 41)",
        "(line 661,col 9)-(line 663,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 667,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 680,
      "end_line": 694,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 48)",
        "(line 682,col 9)-(line 682,col 39)",
        "(line 683,col 9)-(line 683,col 50)",
        "(line 684,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 697,
      "end_line": 704,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 48)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(double[])",
      "begin_line": 707,
      "end_line": 719,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 40)",
        "(line 710,col 9)-(line 710,col 60)",
        "(line 711,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 723,
      "end_line": 728,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 39)",
        "(line 726,col 9)-(line 726,col 22)",
        "(line 727,col 9)-(line 727,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 731,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 32)",
        "(line 734,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 738,col 9)-(line 741,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 747,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 757,
      "end_line": 772,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 29)",
        "(line 760,col 9)-(line 760,col 23)",
        "(line 761,col 9)-(line 761,col 18)",
        "(line 762,col 9)-(line 762,col 48)",
        "(line 763,col 9)-(line 763,col 63)",
        "(line 764,col 9)-(line 764,col 46)",
        "(line 765,col 9)-(line 765,col 43)",
        "(line 766,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 780,
      "end_line": 813,
      "comment": "\n     * \u003cp\u003e Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\u003c/p\u003e\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 58)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 43)",
        "(line 797,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 45)",
        "(line 805,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparcity()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 824,
      "end_line": 827,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 834,
      "end_line": 864,
      "comment": "\n     *  Implementation of \u003ccode\u003eEntry\u003c/code\u003e optimized for OpenMap.\n     * \u003cp\u003eThis implementation does not allow arbitrary calls to \u003ccode\u003esetIndex\u003c/code\u003e\n     * since the order that entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 837,
      "end_line": 837,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 842,
      "end_line": 844,
      "comment": " Build an entry from an iterator point to an element.\n         * @param iter iterator pointing to the entry\n         ",
      "child_ranges": [
        "(line 843,col 13)-(line 843,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 847,
      "end_line": 850,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 853,
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 13)-(line 855,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 859,
      "end_line": 862,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 861,col 13)-(line 861,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 871,
      "end_line": 901,
      "comment": "\n     *  Iterator class to do iteration over just the non-zero elements.\n     *  \u003cp\u003eThis implementation is fail-fast, so cannot be used to modify any zero element.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 877,
      "end_line": 877,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 880,
      "end_line": 883,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 881,col 13)-(line 881,col 38)",
        "(line 882,col 13)-(line 882,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 886,
      "end_line": 888,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 887,col 13)-(line 887,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 891,
      "end_line": 894,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 27)",
        "(line 893,col 13)-(line 893,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 897,
      "end_line": 899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 898,col 13)-(line 898,col 69)"
      ]
    }
  ]
}
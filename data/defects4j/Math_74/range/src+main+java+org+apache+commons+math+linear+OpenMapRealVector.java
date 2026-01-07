{
  "filepath": "/tmp/Math-74b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
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
      "end_line": 901,
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
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Determine if this value is within epsilon of zero.\n     * @param value The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this value is within epsilon to zero, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 209,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 225,
      "end_line": 241,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.  Copies the larger vector, iterates over the smaller.\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 48)",
        "(line 227,col 9)-(line 227,col 61)",
        "(line 228,col 9)-(line 228,col 66)",
        "(line 229,col 9)-(line 229,col 77)",
        "(line 230,col 9)-(line 230,col 77)",
        "(line 231,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 248,
      "end_line": 256,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 78)",
        "(line 250,col 9)-(line 250,col 45)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 259,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double)",
      "begin_line": 267,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 63)",
        "(line 269,col 9)-(line 269,col 37)",
        "(line 270,col 9)-(line 270,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double[])",
      "begin_line": 274,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 70)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 283,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 295,
      "end_line": 306,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * Iterates over the smaller of the two.\n     * @param v The vector to compute the dot product with\n     * @return The dot product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 48)",
        "(line 297,col 9)-(line 297,col 67)",
        "(line 298,col 9)-(line 298,col 83)",
        "(line 299,col 9)-(line 299,col 77)",
        "(line 300,col 9)-(line 300,col 21)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 309,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 319,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 48)",
        "(line 321,col 9)-(line 321,col 60)",
        "(line 322,col 9)-(line 322,col 47)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(double[])",
      "begin_line": 331,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 40)",
        "(line 334,col 9)-(line 334,col 60)",
        "(line 335,col 9)-(line 335,col 47)",
        "(line 336,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 344,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 48)",
        "(line 346,col 9)-(line 346,col 60)",
        "(line 347,col 9)-(line 347,col 47)",
        "(line 348,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(double[])",
      "begin_line": 356,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 40)",
        "(line 359,col 9)-(line 359,col 60)",
        "(line 360,col 9)-(line 360,col 47)",
        "(line 361,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 369,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 26)",
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 57)",
        "(line 373,col 9)-(line 373,col 28)",
        "(line 374,col 9)-(line 374,col 43)",
        "(line 375,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getData()",
      "begin_line": 386,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 47)",
        "(line 389,col 9)-(line 389,col 43)",
        "(line 390,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 398,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 408,
      "end_line": 428,
      "comment": "\n     * Optimized method to compute distance.\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 43)",
        "(line 410,col 9)-(line 410,col 23)",
        "(line 411,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 41)",
        "(line 419,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 431,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 48)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(double[])",
      "begin_line": 441,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 40)",
        "(line 444,col 9)-(line 444,col 23)",
        "(line 445,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 453,
      "end_line": 456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 26)",
        "(line 455,col 9)-(line 455,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 466,
      "end_line": 484,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 23)",
        "(line 468,col 9)-(line 468,col 43)",
        "(line 469,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 41)",
        "(line 475,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 487,
      "end_line": 494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 48)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(double[])",
      "begin_line": 497,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 40)",
        "(line 500,col 9)-(line 500,col 23)",
        "(line 501,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 513,
      "end_line": 534,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 23)",
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 41)",
        "(line 524,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 537,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 48)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(double[])",
      "begin_line": 547,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 40)",
        "(line 550,col 9)-(line 550,col 23)",
        "(line 551,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 561,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 38)",
        "(line 563,col 9)-(line 563,col 43)",
        "(line 564,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 578,
      "end_line": 587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 43)",
        "(line 580,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 590,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 596,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerProduct(double[])",
      "begin_line": 605,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 40)",
        "(line 608,col 9)-(line 608,col 73)",
        "(line 609,col 9)-(line 609,col 43)",
        "(line 610,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 622,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 48)",
        "(line 624,col 9)-(line 624,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(double[])",
      "begin_line": 628,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 40)",
        "(line 631,col 9)-(line 631,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 635,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 26)",
        "(line 637,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 645,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 26)",
        "(line 648,col 9)-(line 648,col 49)",
        "(line 649,col 9)-(line 649,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, double[])",
      "begin_line": 653,
      "end_line": 660,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 26)",
        "(line 656,col 9)-(line 656,col 41)",
        "(line 657,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 663,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 665,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 676,
      "end_line": 690,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 48)",
        "(line 678,col 9)-(line 678,col 39)",
        "(line 679,col 9)-(line 679,col 50)",
        "(line 680,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 693,
      "end_line": 700,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 48)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(double[])",
      "begin_line": 703,
      "end_line": 715,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 40)",
        "(line 706,col 9)-(line 706,col 60)",
        "(line 707,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 719,
      "end_line": 724,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 39)",
        "(line 722,col 9)-(line 722,col 22)",
        "(line 723,col 9)-(line 723,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 727,
      "end_line": 739,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 32)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 43)",
        "(line 734,col 9)-(line 737,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 743,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 753,
      "end_line": 768,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 29)",
        "(line 756,col 9)-(line 756,col 23)",
        "(line 757,col 9)-(line 757,col 18)",
        "(line 758,col 9)-(line 758,col 48)",
        "(line 759,col 9)-(line 759,col 63)",
        "(line 760,col 9)-(line 760,col 46)",
        "(line 761,col 9)-(line 761,col 43)",
        "(line 762,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 776,
      "end_line": 812,
      "comment": "\n     * \u003cp\u003e Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\u003c/p\u003e\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 787,col 58)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 43)",
        "(line 796,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 45)",
        "(line 804,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparcity()",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 823,
      "end_line": 826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 833,
      "end_line": 863,
      "comment": "\n     *  Implementation of \u003ccode\u003eEntry\u003c/code\u003e optimized for OpenMap.\n     * \u003cp\u003eThis implementation does not allow arbitrary calls to \u003ccode\u003esetIndex\u003c/code\u003e\n     * since the order that entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 836,
      "end_line": 836,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 841,
      "end_line": 843,
      "comment": " Build an entry from an iterator point to an element.\n         * @param iter iterator pointing to the entry\n         ",
      "child_ranges": [
        "(line 842,col 13)-(line 842,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 846,
      "end_line": 849,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 848,col 13)-(line 848,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 852,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 854,col 13)-(line 854,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 858,
      "end_line": 861,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 860,col 13)-(line 860,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 870,
      "end_line": 900,
      "comment": "\n     *  Iterator class to do iteration over just the non-zero elements.\n     *  \u003cp\u003eThis implementation is fail-fast, so cannot be used to modify any zero element.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 876,
      "end_line": 876,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 879,
      "end_line": 882,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 880,col 13)-(line 880,col 38)",
        "(line 881,col 13)-(line 881,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 885,
      "end_line": 887,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 886,col 13)-(line 886,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 890,
      "end_line": 893,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 891,col 13)-(line 891,col 27)",
        "(line 892,col 13)-(line 892,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 896,
      "end_line": 898,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 897,col 13)-(line 897,col 69)"
      ]
    }
  ]
}
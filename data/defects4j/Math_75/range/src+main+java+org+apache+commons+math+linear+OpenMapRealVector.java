{
  "filepath": "/tmp/Math-75b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
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
      "end_line": 876,
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
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 224,
      "end_line": 240,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.  Copies the larger vector, iterates over the smaller.\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 226,col 61)",
        "(line 227,col 9)-(line 227,col 66)",
        "(line 228,col 9)-(line 228,col 77)",
        "(line 229,col 9)-(line 229,col 77)",
        "(line 230,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 247,
      "end_line": 255,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 78)",
        "(line 249,col 9)-(line 249,col 45)",
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 258,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double)",
      "begin_line": 266,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 63)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 269,col 9)-(line 269,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double[])",
      "begin_line": 273,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 70)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 282,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 293,
      "end_line": 304,
      "comment": "\n     * Optimized method to compute the dot product with an OpenMapRealVector.\n     * Iterates over the smaller of the two.\n     * @param v The vector to compute the dot product with\n     * @return The dot product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 48)",
        "(line 295,col 9)-(line 295,col 67)",
        "(line 296,col 9)-(line 296,col 83)",
        "(line 297,col 9)-(line 297,col 77)",
        "(line 298,col 9)-(line 298,col 21)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 307,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 316,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 48)",
        "(line 318,col 9)-(line 318,col 60)",
        "(line 319,col 9)-(line 319,col 47)",
        "(line 320,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(double[])",
      "begin_line": 328,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 40)",
        "(line 330,col 9)-(line 330,col 60)",
        "(line 331,col 9)-(line 331,col 47)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 340,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 48)",
        "(line 342,col 9)-(line 342,col 60)",
        "(line 343,col 9)-(line 343,col 47)",
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(double[])",
      "begin_line": 352,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 40)",
        "(line 354,col 9)-(line 354,col 60)",
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 364,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 26)",
        "(line 366,col 9)-(line 366,col 34)",
        "(line 367,col 9)-(line 367,col 57)",
        "(line 368,col 9)-(line 368,col 28)",
        "(line 369,col 9)-(line 369,col 43)",
        "(line 370,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getData()",
      "begin_line": 381,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 47)",
        "(line 383,col 9)-(line 383,col 43)",
        "(line 384,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 392,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 402,
      "end_line": 422,
      "comment": "\n     * Optimized method to compute distance.\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 404,col 23)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 41)",
        "(line 413,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 425,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 48)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(double[])",
      "begin_line": 434,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 40)",
        "(line 436,col 9)-(line 436,col 23)",
        "(line 437,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 445,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 26)",
        "(line 447,col 9)-(line 447,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 458,
      "end_line": 476,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 23)",
        "(line 460,col 9)-(line 460,col 43)",
        "(line 461,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 41)",
        "(line 467,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 479,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 48)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(double[])",
      "begin_line": 488,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 40)",
        "(line 490,col 9)-(line 490,col 23)",
        "(line 491,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 503,
      "end_line": 524,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 23)",
        "(line 505,col 9)-(line 505,col 43)",
        "(line 506,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 41)",
        "(line 514,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 527,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 48)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(double[])",
      "begin_line": 536,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 40)",
        "(line 538,col 9)-(line 538,col 23)",
        "(line 539,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 549,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 38)",
        "(line 551,col 9)-(line 551,col 43)",
        "(line 552,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 566,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 43)",
        "(line 568,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 578,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 583,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerProduct(double[])",
      "begin_line": 591,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 40)",
        "(line 593,col 9)-(line 593,col 73)",
        "(line 594,col 9)-(line 594,col 43)",
        "(line 595,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 607,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 48)",
        "(line 609,col 9)-(line 609,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(double[])",
      "begin_line": 613,
      "end_line": 616,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 40)",
        "(line 615,col 9)-(line 615,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 619,
      "end_line": 626,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 26)",
        "(line 621,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 629,
      "end_line": 633,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 26)",
        "(line 631,col 9)-(line 631,col 49)",
        "(line 632,col 9)-(line 632,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, double[])",
      "begin_line": 636,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 26)",
        "(line 638,col 9)-(line 638,col 41)",
        "(line 639,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 645,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 657,
      "end_line": 671,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 48)",
        "(line 659,col 9)-(line 659,col 39)",
        "(line 660,col 9)-(line 660,col 50)",
        "(line 661,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 674,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 48)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(double[])",
      "begin_line": 683,
      "end_line": 694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 40)",
        "(line 685,col 9)-(line 685,col 60)",
        "(line 686,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 698,
      "end_line": 702,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 39)",
        "(line 700,col 9)-(line 700,col 22)",
        "(line 701,col 9)-(line 701,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 705,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 32)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 43)",
        "(line 711,col 9)-(line 714,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 720,
      "end_line": 722,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 729,
      "end_line": 744,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 29)",
        "(line 732,col 9)-(line 732,col 23)",
        "(line 733,col 9)-(line 733,col 18)",
        "(line 734,col 9)-(line 734,col 48)",
        "(line 735,col 9)-(line 735,col 63)",
        "(line 736,col 9)-(line 736,col 46)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 738,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 752,
      "end_line": 788,
      "comment": "\n     * \u003cp\u003e Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\u003c/p\u003e\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 58)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 43)",
        "(line 772,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 45)",
        "(line 780,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 787,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparcity()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.sparseIterator()",
      "begin_line": 799,
      "end_line": 801,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 808,
      "end_line": 838,
      "comment": "\n     *  Implementation of \u003ccode\u003eEntry\u003c/code\u003e optimized for OpenMap.\n     * \u003cp\u003eThis implementation does not allow arbitrary calls to \u003ccode\u003esetIndex\u003c/code\u003e\n     * since the order that entries are returned is undefined.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 811,
      "end_line": 811,
      "comment": " Iterator pointing to the entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.OpenMapEntry(org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator)",
      "begin_line": 816,
      "end_line": 818,
      "comment": " Build an entry from an iterator point to an element.\n         * @param iter iterator pointing to the entry\n         ",
      "child_ranges": [
        "(line 817,col 13)-(line 817,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getValue()",
      "begin_line": 821,
      "end_line": 824,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 823,col 13)-(line 823,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.setValue(double)",
      "begin_line": 827,
      "end_line": 830,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 829,col 13)-(line 829,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry.getIndex()",
      "begin_line": 833,
      "end_line": 836,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 835,col 13)-(line 835,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OpenMapSparseIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 845,
      "end_line": 875,
      "comment": "\n     *  Iterator class to do iteration over just the non-zero elements.\n     *  \u003cp\u003eThis implementation is fail-fast, so cannot be used to modify any zero element.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iter"
      ],
      "begin_line": 848,
      "end_line": 848,
      "comment": " Underlying iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 851,
      "end_line": 851,
      "comment": " Current entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.OpenMapSparseIterator()",
      "begin_line": 854,
      "end_line": 857,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 855,col 13)-(line 855,col 38)",
        "(line 856,col 13)-(line 856,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.hasNext()",
      "begin_line": 860,
      "end_line": 862,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 861,col 13)-(line 861,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.next()",
      "begin_line": 865,
      "end_line": 868,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 866,col 13)-(line 866,col 27)",
        "(line 867,col 13)-(line 867,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator.remove()",
      "begin_line": 871,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 872,col 13)-(line 872,col 69)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/OpenMapRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SparseRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 1310,
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
        "(line 87,col 9)-(line 87,col 33)"
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
        "(line 172,col 9)-(line 172,col 33)"
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
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isZero(double)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Determine if this value is zero.\n     * @param value The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this value is zero, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEpsilon()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Get the tolerance for having a value considered zero.\n     * @return The test range for testing if a value is zero\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEpsilon(double)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Set the tolerance for having a value considered zero.\n     * @param epsilon The test range for testing if a value is zero\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 225,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 48)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 239,
      "end_line": 253,
      "comment": "\n     * Optimized method to add two OpenMapRealVectors.\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 48)",
        "(line 241,col 9)-(line 241,col 39)",
        "(line 242,col 9)-(line 242,col 50)",
        "(line 243,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.add(double[])",
      "begin_line": 256,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 40)",
        "(line 258,col 9)-(line 258,col 70)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 270,
      "end_line": 278,
      "comment": "\n     * Optimized method to append a OpenMapRealVector.\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 78)",
        "(line 272,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 281,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 35)"
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
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.append(double[])",
      "begin_line": 296,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 70)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.copy()",
      "begin_line": 305,
      "end_line": 307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 310,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 48)",
        "(line 312,col 9)-(line 312,col 23)",
        "(line 313,col 9)-(line 313,col 43)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.dotProduct(double[])",
      "begin_line": 322,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 40)",
        "(line 324,col 9)-(line 324,col 23)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 338,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 48)",
        "(line 340,col 9)-(line 340,col 60)",
        "(line 341,col 9)-(line 341,col 47)",
        "(line 342,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(double[])",
      "begin_line": 350,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 40)",
        "(line 352,col 9)-(line 352,col 60)",
        "(line 353,col 9)-(line 353,col 47)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 362,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 48)",
        "(line 364,col 9)-(line 364,col 60)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(double[])",
      "begin_line": 374,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 40)",
        "(line 376,col 9)-(line 376,col 60)",
        "(line 377,col 9)-(line 377,col 47)",
        "(line 378,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSubVector(int, int)",
      "begin_line": 386,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 26)",
        "(line 388,col 9)-(line 388,col 34)",
        "(line 389,col 9)-(line 389,col 57)",
        "(line 390,col 9)-(line 390,col 28)",
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getData()",
      "begin_line": 403,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 47)",
        "(line 405,col 9)-(line 405,col 43)",
        "(line 406,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDimension()",
      "begin_line": 414,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 424,
      "end_line": 444,
      "comment": "\n     * Optimized method to compute distance.\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 43)",
        "(line 426,col 9)-(line 426,col 23)",
        "(line 427,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 41)",
        "(line 435,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 447,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 48)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getDistance(double[])",
      "begin_line": 456,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 40)",
        "(line 458,col 9)-(line 458,col 23)",
        "(line 459,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getEntry(int)",
      "begin_line": 467,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 26)",
        "(line 469,col 9)-(line 469,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 480,
      "end_line": 498,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 23)",
        "(line 482,col 9)-(line 482,col 43)",
        "(line 483,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 41)",
        "(line 489,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 501,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(double[])",
      "begin_line": 510,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 40)",
        "(line 512,col 9)-(line 512,col 23)",
        "(line 513,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getL1Norm()",
      "begin_line": 521,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 23)",
        "(line 523,col 9)-(line 523,col 43)",
        "(line 524,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 536,
      "end_line": 557,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 23)",
        "(line 538,col 9)-(line 538,col 43)",
        "(line 539,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 41)",
        "(line 547,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 560,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 48)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(double[])",
      "begin_line": 569,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 40)",
        "(line 571,col 9)-(line 571,col 23)",
        "(line 572,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm()",
      "begin_line": 582,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 23)",
        "(line 584,col 9)-(line 584,col 43)",
        "(line 585,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getNorm()",
      "begin_line": 593,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 23)",
        "(line 595,col 9)-(line 595,col 43)",
        "(line 596,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isInfinite()",
      "begin_line": 604,
      "end_line": 618,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 38)",
        "(line 606,col 9)-(line 606,col 43)",
        "(line 607,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.isNaN()",
      "begin_line": 621,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 43)",
        "(line 623,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAbs()",
      "begin_line": 633,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAbsToSelf()",
      "begin_line": 638,
      "end_line": 645,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 43)",
        "(line 640,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAcos()",
      "begin_line": 648,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAcosToSelf()",
      "begin_line": 653,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAdd(double)",
      "begin_line": 661,
      "end_line": 663,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(double)",
      "begin_line": 666,
      "end_line": 671,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAsin()",
      "begin_line": 674,
      "end_line": 676,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAsinToSelf()",
      "begin_line": 679,
      "end_line": 686,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 43)",
        "(line 681,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAtan()",
      "begin_line": 689,
      "end_line": 691,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapAtanToSelf()",
      "begin_line": 694,
      "end_line": 701,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 43)",
        "(line 696,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCbrt()",
      "begin_line": 704,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCbrtToSelf()",
      "begin_line": 709,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 43)",
        "(line 711,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCeil()",
      "begin_line": 719,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCeilToSelf()",
      "begin_line": 724,
      "end_line": 731,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 43)",
        "(line 726,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCos()",
      "begin_line": 734,
      "end_line": 736,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCosToSelf()",
      "begin_line": 739,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCosh()",
      "begin_line": 747,
      "end_line": 749,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapCoshToSelf()",
      "begin_line": 752,
      "end_line": 757,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 753,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapDivide(double)",
      "begin_line": 760,
      "end_line": 762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapDivideToSelf(double)",
      "begin_line": 765,
      "end_line": 772,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 43)",
        "(line 767,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapExp()",
      "begin_line": 775,
      "end_line": 777,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapExpToSelf()",
      "begin_line": 780,
      "end_line": 785,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapExpm1()",
      "begin_line": 788,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapExpm1ToSelf()",
      "begin_line": 793,
      "end_line": 800,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 43)",
        "(line 795,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapFloor()",
      "begin_line": 803,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapFloorToSelf()",
      "begin_line": 808,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 43)",
        "(line 810,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapInv()",
      "begin_line": 818,
      "end_line": 820,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapInvToSelf()",
      "begin_line": 823,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapLog()",
      "begin_line": 831,
      "end_line": 833,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapLog10()",
      "begin_line": 836,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapLog10ToSelf()",
      "begin_line": 841,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 842,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapLog1p()",
      "begin_line": 849,
      "end_line": 851,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapLog1pToSelf()",
      "begin_line": 854,
      "end_line": 861,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 43)",
        "(line 856,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 860,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapLogToSelf()",
      "begin_line": 864,
      "end_line": 869,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 8)-(line 868,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(double)",
      "begin_line": 872,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapMultiplyToSelf(double)",
      "begin_line": 877,
      "end_line": 884,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 43)",
        "(line 879,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 883,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapPow(double)",
      "begin_line": 886,
      "end_line": 888,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapPowToSelf(double)",
      "begin_line": 891,
      "end_line": 898,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 43)",
        "(line 893,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapRint()",
      "begin_line": 901,
      "end_line": 903,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapRintToSelf()",
      "begin_line": 906,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 43)",
        "(line 908,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSignum()",
      "begin_line": 916,
      "end_line": 918,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSignumToSelf()",
      "begin_line": 921,
      "end_line": 928,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 43)",
        "(line 923,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSin()",
      "begin_line": 931,
      "end_line": 933,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSinToSelf()",
      "begin_line": 936,
      "end_line": 943,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 43)",
        "(line 938,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSinh()",
      "begin_line": 946,
      "end_line": 948,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSinhToSelf()",
      "begin_line": 951,
      "end_line": 959,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 43)",
        "(line 954,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSqrt()",
      "begin_line": 962,
      "end_line": 964,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSqrtToSelf()",
      "begin_line": 967,
      "end_line": 974,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 43)",
        "(line 969,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSubtract(double)",
      "begin_line": 977,
      "end_line": 979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapSubtractToSelf(double)",
      "begin_line": 982,
      "end_line": 984,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapTan()",
      "begin_line": 987,
      "end_line": 989,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapTanToSelf()",
      "begin_line": 992,
      "end_line": 999,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 43)",
        "(line 994,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapTanh()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapTanhToSelf()",
      "begin_line": 1007,
      "end_line": 1014,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 43)",
        "(line 1009,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapUlp()",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.mapUlpToSelf()",
      "begin_line": 1022,
      "end_line": 1029,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 43)",
        "(line 1024,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1028,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerproduct(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 1037,
      "end_line": 1050,
      "comment": "\n     * Optimized method to compute the outer product.\n     * @param v The vector to comput the outer product on\n     * @return The outer product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 48)",
        "(line 1039,col 9)-(line 1039,col 80)",
        "(line 1040,col 9)-(line 1040,col 43)",
        "(line 1041,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1053,
      "end_line": 1069,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 48)",
        "(line 1056,col 9)-(line 1058,col 9)",
        "(line 1059,col 9)-(line 1059,col 73)",
        "(line 1060,col 9)-(line 1060,col 43)",
        "(line 1061,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1068,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.outerProduct(double[])",
      "begin_line": 1072,
      "end_line": 1085,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1073,col 9)-(line 1073,col 40)",
        "(line 1074,col 9)-(line 1074,col 73)",
        "(line 1075,col 9)-(line 1075,col 43)",
        "(line 1076,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1088,
      "end_line": 1091,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 48)",
        "(line 1090,col 9)-(line 1090,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.projection(double[])",
      "begin_line": 1094,
      "end_line": 1097,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 40)",
        "(line 1096,col 9)-(line 1096,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setEntry(int, double)",
      "begin_line": 1100,
      "end_line": 1107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 26)",
        "(line 1102,col 9)-(line 1106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1110,
      "end_line": 1114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 26)",
        "(line 1112,col 9)-(line 1112,col 49)",
        "(line 1113,col 9)-(line 1113,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.setSubVector(int, double[])",
      "begin_line": 1117,
      "end_line": 1123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 26)",
        "(line 1119,col 9)-(line 1119,col 41)",
        "(line 1120,col 9)-(line 1122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.set(double)",
      "begin_line": 1126,
      "end_line": 1130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.OpenMapRealVector)",
      "begin_line": 1138,
      "end_line": 1152,
      "comment": "\n     * Optimized method to subtract OpenMapRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 48)",
        "(line 1140,col 9)-(line 1140,col 39)",
        "(line 1141,col 9)-(line 1141,col 50)",
        "(line 1142,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1155,
      "end_line": 1161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 48)",
        "(line 1157,col 9)-(line 1159,col 9)",
        "(line 1160,col 9)-(line 1160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.subtract(double[])",
      "begin_line": 1164,
      "end_line": 1175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 40)",
        "(line 1166,col 9)-(line 1166,col 60)",
        "(line 1167,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitVector()",
      "begin_line": 1179,
      "end_line": 1183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 39)",
        "(line 1181,col 9)-(line 1181,col 22)",
        "(line 1182,col 9)-(line 1182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.unitize()",
      "begin_line": 1186,
      "end_line": 1197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1187,col 32)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 43)",
        "(line 1192,col 9)-(line 1195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.checkIndex(int)",
      "begin_line": 1207,
      "end_line": 1213,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index\n     *            index to check\n     * @exception MatrixIndexException\n     *                if index is not valid\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.checkVectorDimensions(int)",
      "begin_line": 1223,
      "end_line": 1229,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n\n     *            expected dimension.\n     * @exception IllegalArgumentException\n     *                if the dimension is inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.toArray()",
      "begin_line": 1232,
      "end_line": 1234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1233,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.hashCode()",
      "begin_line": 1241,
      "end_line": 1256,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e Implementation Note: This works on exact values, and as a result\n     * it is possible for {@code a.subtract(b)} to be the zero vector, while\n     * {@code a.hashCode() !\u003d b.hashCode()}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 29)",
        "(line 1244,col 9)-(line 1244,col 23)",
        "(line 1245,col 9)-(line 1245,col 18)",
        "(line 1246,col 9)-(line 1246,col 48)",
        "(line 1247,col 9)-(line 1247,col 63)",
        "(line 1248,col 9)-(line 1248,col 46)",
        "(line 1249,col 9)-(line 1249,col 43)",
        "(line 1250,col 9)-(line 1254,col 9)",
        "(line 1255,col 9)-(line 1255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.equals(java.lang.Object)",
      "begin_line": 1264,
      "end_line": 1300,
      "comment": "\n     * \u003cp\u003e Implementation Note: This performs an exact comparison, and as a result\n     * it is possible for {@code a.subtract(b}} to be the zero vector, while\n     * {@code  a.equals(b) \u003d\u003d false}.\u003c/p\u003e\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1274,col 9)",
        "(line 1275,col 9)-(line 1275,col 58)",
        "(line 1276,col 9)-(line 1278,col 9)",
        "(line 1279,col 9)-(line 1282,col 9)",
        "(line 1283,col 9)-(line 1283,col 43)",
        "(line 1284,col 9)-(line 1290,col 9)",
        "(line 1291,col 9)-(line 1291,col 45)",
        "(line 1292,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealVector.getSparcity()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "\n     *\n     * @return the percentage of none zero elements as a decimal percent.\n     ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 61)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/linear/SparseRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector"
      ],
      "begin_line": 28,
      "end_line": 1264,
      "comment": "\n * This class implements the {@link RealVector} interface with a {@link OpenIntToDoubleHashMap} backing store.\n * @version $Revision: 728186 $ $Date$\n * @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseRealVector(SparseRealVector, int)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(RealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 24)",
        "(line 50,col 9)-(line 50,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Construct a (dimension)-length vector of zeros.\n     * @param dimension size of the vector\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)",
        "(line 59,col 9)-(line 59,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int, double)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Construct a (dimension)-length vector of zeros, specifying zero tolerance\n     * @param dimension Size of the vector\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)",
        "(line 69,col 9)-(line 69,col 50)",
        "(line 70,col 9)-(line 70,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(org.apache.commons.math.linear.SparseRealVector, int)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Resize the vector, for use with append\n     * @param v The original vector\n     * @param resize The amount to resize it\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 80,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int, int)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * For advanced use, when you know the sparseness \n     * @param dimension The size of the vector\n     * @param expectedSize The excpected number of non-zero entries\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 64)",
        "(line 90,col 9)-(line 90,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int, int, double)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * For advanced use, when you know the sparseness and want to specify zero tolerance\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 64)",
        "(line 102,col 9)-(line 102,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(double[])",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Create from a double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)",
        "(line 112,col 9)-(line 112,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(double[], double)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Create from a double array, specifying zero tolerance.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero \n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 31)",
        "(line 124,col 9)-(line 124,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(java.lang.Double[])",
      "begin_line": 132,
      "end_line": 139,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 50)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(java.lang.Double[], double)",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 50)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * Copy constructer\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 164,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Generic copy constructer\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.fromDoubleArray(double[])",
      "begin_line": 181,
      "end_line": 189,
      "comment": "\n     * Fill in the values from a double array\n     * @param values The set of values to use\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getEntries()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * \n     * @return The entries of this instance\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.isZero(double)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Determine if this value is zero\n     * @param value The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this value is zero, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getEpsilon()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * \n     * @return The test range for testing if a value is zero\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setEpsilon(double)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * \n     * @param epsilon The test range for testing if a value is zero\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 226,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 48)",
        "(line 228,col 9)-(line 229,col 45)",
        "(line 230,col 9)-(line 230,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.add(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 240,
      "end_line": 254,
      "comment": "\n     * Optimized method to add two SparseRealVectors\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 48)",
        "(line 242,col 9)-(line 242,col 56)",
        "(line 243,col 9)-(line 243,col 50)",
        "(line 244,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.add(double[])",
      "begin_line": 257,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 40)",
        "(line 259,col 9)-(line 259,col 68)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 271,
      "end_line": 279,
      "comment": "\n     * Optimized method to append a SparseRealVector\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 76)",
        "(line 273,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 282,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(double)",
      "begin_line": 290,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 55)",
        "(line 292,col 9)-(line 292,col 37)",
        "(line 293,col 9)-(line 293,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(double[])",
      "begin_line": 297,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 62)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.copy()",
      "begin_line": 306,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 311,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 48)",
        "(line 313,col 9)-(line 313,col 23)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 315,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.dotProduct(double[])",
      "begin_line": 323,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 40)",
        "(line 325,col 9)-(line 325,col 23)",
        "(line 326,col 9)-(line 326,col 43)",
        "(line 327,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 338,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 48)",
        "(line 340,col 9)-(line 340,col 58)",
        "(line 341,col 9)-(line 341,col 47)",
        "(line 342,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeDivide(double[])",
      "begin_line": 350,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 40)",
        "(line 352,col 9)-(line 352,col 58)",
        "(line 353,col 9)-(line 353,col 47)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 362,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 48)",
        "(line 364,col 9)-(line 364,col 58)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeMultiply(double[])",
      "begin_line": 374,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 40)",
        "(line 376,col 9)-(line 376,col 58)",
        "(line 377,col 9)-(line 377,col 47)",
        "(line 378,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getSubVector(int, int)",
      "begin_line": 386,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 26)",
        "(line 388,col 9)-(line 388,col 30)",
        "(line 389,col 9)-(line 389,col 55)",
        "(line 390,col 9)-(line 390,col 28)",
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getData()",
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDimension()",
      "begin_line": 414,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDistance(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 424,
      "end_line": 443,
      "comment": "\n     * Optimized method to compute distance\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 43)",
        "(line 426,col 9)-(line 426,col 23)",
        "(line 427,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 41)",
        "(line 435,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 446,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 48)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDistance(double[])",
      "begin_line": 455,
      "end_line": 463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 40)",
        "(line 457,col 9)-(line 457,col 23)",
        "(line 458,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getEntry(int)",
      "begin_line": 466,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 26)",
        "(line 468,col 9)-(line 468,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Distance(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 472,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 23)",
        "(line 474,col 9)-(line 474,col 43)",
        "(line 475,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 41)",
        "(line 481,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 493,
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Distance(double[])",
      "begin_line": 502,
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Norm()",
      "begin_line": 513,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 23)",
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfDistance(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 528,
      "end_line": 547,
      "comment": "\n     * Optimized method to compute LInfDistance  \n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 23)",
        "(line 530,col 9)-(line 530,col 43)",
        "(line 531,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 41)",
        "(line 538,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 550,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 48)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfDistance(double[])",
      "begin_line": 559,
      "end_line": 568,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 40)",
        "(line 561,col 9)-(line 561,col 23)",
        "(line 562,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfNorm()",
      "begin_line": 571,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 23)",
        "(line 573,col 9)-(line 573,col 43)",
        "(line 574,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getNorm()",
      "begin_line": 582,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 23)",
        "(line 584,col 9)-(line 584,col 43)",
        "(line 585,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.isInfinite()",
      "begin_line": 593,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 43)",
        "(line 595,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.isNaN()",
      "begin_line": 604,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 43)",
        "(line 606,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAbs()",
      "begin_line": 615,
      "end_line": 617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAbsToSelf()",
      "begin_line": 620,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 43)",
        "(line 622,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAcos()",
      "begin_line": 630,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAcosToSelf()",
      "begin_line": 635,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAdd(double)",
      "begin_line": 643,
      "end_line": 645,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAddToSelf(double)",
      "begin_line": 648,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAsin()",
      "begin_line": 656,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAsinToSelf()",
      "begin_line": 661,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 43)",
        "(line 663,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAtan()",
      "begin_line": 671,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAtanToSelf()",
      "begin_line": 676,
      "end_line": 683,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 43)",
        "(line 678,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCbrt()",
      "begin_line": 686,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCbrtToSelf()",
      "begin_line": 691,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 43)",
        "(line 693,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCeil()",
      "begin_line": 701,
      "end_line": 703,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCeilToSelf()",
      "begin_line": 706,
      "end_line": 713,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 43)",
        "(line 708,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCos()",
      "begin_line": 716,
      "end_line": 718,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCosToSelf()",
      "begin_line": 721,
      "end_line": 726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCosh()",
      "begin_line": 729,
      "end_line": 731,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCoshToSelf()",
      "begin_line": 734,
      "end_line": 739,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapDivide(double)",
      "begin_line": 742,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapDivideToSelf(double)",
      "begin_line": 747,
      "end_line": 754,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 43)",
        "(line 749,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExp()",
      "begin_line": 757,
      "end_line": 759,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExpToSelf()",
      "begin_line": 762,
      "end_line": 767,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExpm1()",
      "begin_line": 770,
      "end_line": 772,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExpm1ToSelf()",
      "begin_line": 775,
      "end_line": 782,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 43)",
        "(line 777,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapFloor()",
      "begin_line": 785,
      "end_line": 787,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapFloorToSelf()",
      "begin_line": 790,
      "end_line": 797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 43)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapInv()",
      "begin_line": 800,
      "end_line": 802,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapInvToSelf()",
      "begin_line": 805,
      "end_line": 810,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog()",
      "begin_line": 813,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog10()",
      "begin_line": 818,
      "end_line": 820,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog10ToSelf()",
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog1p()",
      "begin_line": 831,
      "end_line": 833,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog1pToSelf()",
      "begin_line": 836,
      "end_line": 843,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 43)",
        "(line 838,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLogToSelf()",
      "begin_line": 846,
      "end_line": 851,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 8)-(line 850,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapMultiply(double)",
      "begin_line": 854,
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapMultiplyToSelf(double)",
      "begin_line": 859,
      "end_line": 866,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 43)",
        "(line 861,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapPow(double)",
      "begin_line": 868,
      "end_line": 870,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapPowToSelf(double)",
      "begin_line": 873,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 43)",
        "(line 875,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapRint()",
      "begin_line": 883,
      "end_line": 885,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapRintToSelf()",
      "begin_line": 888,
      "end_line": 895,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 43)",
        "(line 890,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSignum()",
      "begin_line": 898,
      "end_line": 900,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSignumToSelf()",
      "begin_line": 903,
      "end_line": 910,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 43)",
        "(line 905,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSin()",
      "begin_line": 913,
      "end_line": 915,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSinToSelf()",
      "begin_line": 918,
      "end_line": 925,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 43)",
        "(line 920,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSinh()",
      "begin_line": 928,
      "end_line": 930,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSinhToSelf()",
      "begin_line": 933,
      "end_line": 941,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 43)",
        "(line 936,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSqrt()",
      "begin_line": 944,
      "end_line": 946,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSqrtToSelf()",
      "begin_line": 949,
      "end_line": 956,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 43)",
        "(line 951,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSubtract(double)",
      "begin_line": 959,
      "end_line": 961,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSubtractToSelf(double)",
      "begin_line": 964,
      "end_line": 966,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTan()",
      "begin_line": 969,
      "end_line": 971,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTanToSelf()",
      "begin_line": 974,
      "end_line": 981,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 43)",
        "(line 976,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTanh()",
      "begin_line": 984,
      "end_line": 986,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTanhToSelf()",
      "begin_line": 989,
      "end_line": 996,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 43)",
        "(line 991,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapUlp()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapUlpToSelf()",
      "begin_line": 1004,
      "end_line": 1011,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 43)",
        "(line 1006,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1010,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.outerproduct(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 1019,
      "end_line": 1032,
      "comment": "\n     * Optimized method to compute the outer product\n     * @param v The vector to comput the outer product on\n     * @return The outer product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 48)",
        "(line 1021,col 9)-(line 1021,col 78)",
        "(line 1022,col 9)-(line 1022,col 43)",
        "(line 1023,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1031,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1035,
      "end_line": 1051,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 48)",
        "(line 1038,col 9)-(line 1040,col 9)",
        "(line 1041,col 9)-(line 1041,col 72)",
        "(line 1042,col 9)-(line 1042,col 43)",
        "(line 1043,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.outerProduct(double[])",
      "begin_line": 1054,
      "end_line": 1067,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 40)",
        "(line 1056,col 9)-(line 1056,col 72)",
        "(line 1057,col 9)-(line 1057,col 43)",
        "(line 1058,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 48)",
        "(line 1072,col 9)-(line 1072,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.projection(double[])",
      "begin_line": 1076,
      "end_line": 1079,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 40)",
        "(line 1078,col 9)-(line 1078,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setEntry(int, double)",
      "begin_line": 1082,
      "end_line": 1089,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 26)",
        "(line 1084,col 9)-(line 1088,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1092,
      "end_line": 1096,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 26)",
        "(line 1094,col 9)-(line 1094,col 49)",
        "(line 1095,col 9)-(line 1095,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setSubVector(int, double[])",
      "begin_line": 1099,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 26)",
        "(line 1101,col 9)-(line 1101,col 41)",
        "(line 1102,col 9)-(line 1104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.set(double)",
      "begin_line": 1108,
      "end_line": 1112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.subtract(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 1120,
      "end_line": 1134,
      "comment": "\n     * Optimized method to subtract SparseRealVectors\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 48)",
        "(line 1122,col 9)-(line 1122,col 56)",
        "(line 1123,col 9)-(line 1123,col 50)",
        "(line 1124,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1133,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1137,
      "end_line": 1143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 48)",
        "(line 1139,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.subtract(double[])",
      "begin_line": 1146,
      "end_line": 1157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 40)",
        "(line 1148,col 9)-(line 1148,col 58)",
        "(line 1149,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.unitVector()",
      "begin_line": 1161,
      "end_line": 1165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 32)",
        "(line 1163,col 9)-(line 1163,col 22)",
        "(line 1164,col 9)-(line 1164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.unitize()",
      "begin_line": 1168,
      "end_line": 1181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 32)",
        "(line 1170,col 9)-(line 1174,col 9)",
        "(line 1175,col 9)-(line 1175,col 43)",
        "(line 1176,col 9)-(line 1179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.checkIndex(int)",
      "begin_line": 1191,
      "end_line": 1197,
      "comment": "\n     * Check if an index is valid.\n     * \n     * @param index\n     *            index to check\n     * @exception MatrixIndexException\n     *                if index is not valid\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.checkVectorDimensions(int)",
      "begin_line": 1207,
      "end_line": 1213,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     * \n     * @param n\n     *            expected dimension.\n     * @exception IllegalArgumentException\n     *                if the dimension is inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.toArray()",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.hashCode()",
      "begin_line": 1221,
      "end_line": 1230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 29)",
        "(line 1224,col 9)-(line 1224,col 23)",
        "(line 1225,col 9)-(line 1225,col 18)",
        "(line 1226,col 9)-(line 1226,col 48)",
        "(line 1227,col 9)-(line 1227,col 63)",
        "(line 1228,col 9)-(line 1228,col 46)",
        "(line 1229,col 9)-(line 1229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.equals(java.lang.Object)",
      "begin_line": 1233,
      "end_line": 1262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1235,col 9)-(line 1236,col 24)",
        "(line 1237,col 9)-(line 1238,col 25)",
        "(line 1239,col 9)-(line 1240,col 25)",
        "(line 1241,col 9)-(line 1241,col 56)",
        "(line 1242,col 9)-(line 1243,col 25)",
        "(line 1244,col 9)-(line 1246,col 25)",
        "(line 1247,col 9)-(line 1247,col 43)",
        "(line 1248,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1254,col 45)",
        "(line 1255,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1261,col 20)"
      ]
    }
  ]
}
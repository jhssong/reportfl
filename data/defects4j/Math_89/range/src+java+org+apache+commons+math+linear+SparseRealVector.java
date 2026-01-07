{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/linear/SparseRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector"
      ],
      "begin_line": 28,
      "end_line": 1273,
      "comment": "\n * This class implements the {@link RealVector} interface with a {@link OpenIntToDoubleHashMap} backing store.\n * @version $Revision: 728186 $ $Date$\n * @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
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
        "entries"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Tolerance for having a value considered zero. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseRealVector(SparseRealVector, int)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(RealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Construct a (dimension)-length vector of zeros.\n     * @param dimension size of the vector\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int, double)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Construct a (dimension)-length vector of zeros, specifying zero tolerance.\n     * @param dimension Size of the vector\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 32)",
        "(line 73,col 9)-(line 73,col 50)",
        "(line 74,col 9)-(line 74,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(org.apache.commons.math.linear.SparseRealVector, int)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Build a resized vector, for use with append.\n     * @param v The original vector\n     * @param resize The amount to resize it\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 56)",
        "(line 85,col 9)-(line 85,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int, int)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(int, int, double)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "\n     * Build a vector with known the sparseness and zero tolerance setting (for advanced use only).\n     * @param dimension The size of the vector\n     * @param expectedSize The expected number of non-zero entries\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 105,col 64)",
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(double[])",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Create from a double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(double[], double)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Create from a double array, specifying zero tolerance.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 126,col 50)",
        "(line 127,col 9)-(line 127,col 31)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(java.lang.Double[])",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(java.lang.Double[], double)",
      "begin_line": 151,
      "end_line": 161,
      "comment": "\n     * Create from a Double array.\n     * Only non-zero entries will be stored\n     * @param values The set of values to create from\n     * @param epsilon The tolerance for having a value considered zero\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 36)",
        "(line 153,col 9)-(line 153,col 50)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * Copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 39)",
        "(line 169,col 9)-(line 169,col 61)",
        "(line 170,col 9)-(line 170,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVector.SparseRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 177,
      "end_line": 187,
      "comment": "\n     * Generic copy constructor.\n     * @param v The instance to copy from\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 179,col 50)",
        "(line 180,col 9)-(line 180,col 41)",
        "(line 181,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getEntries()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Get the entries of this instance.\n     * @return entries of this instance\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.isZero(double)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Determine if this value is zero.\n     * @param value The value to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this value is zero, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getEpsilon()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Get the tolerance for having a value considered zero.\n     * @return The test range for testing if a value is zero\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setEpsilon(double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Set the tolerance for having a value considered zero.\n     * @param epsilon The test range for testing if a value is zero\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 223,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 48)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.add(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 237,
      "end_line": 251,
      "comment": "\n     * Optimized method to add two SparseRealVectors.\n     * @param v Vector to add with\n     * @return The sum of \u003ccode\u003ethis\u003c/code\u003e with \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 48)",
        "(line 239,col 9)-(line 239,col 56)",
        "(line 240,col 9)-(line 240,col 50)",
        "(line 241,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.add(double[])",
      "begin_line": 254,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 40)",
        "(line 256,col 9)-(line 256,col 68)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 268,
      "end_line": 276,
      "comment": "\n     * Optimized method to append a SparseRealVector.\n     * @param v vector to append\n     * @return The result of appending \u003ccode\u003ev\u003c/code\u003e to self\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 76)",
        "(line 270,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 279,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(double)",
      "begin_line": 287,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 55)",
        "(line 289,col 9)-(line 289,col 37)",
        "(line 290,col 9)-(line 290,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.append(double[])",
      "begin_line": 294,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 62)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.copy()",
      "begin_line": 303,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 308,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 48)",
        "(line 310,col 9)-(line 310,col 23)",
        "(line 311,col 9)-(line 311,col 43)",
        "(line 312,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.dotProduct(double[])",
      "begin_line": 320,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 40)",
        "(line 322,col 9)-(line 322,col 23)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 336,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 338,col 58)",
        "(line 339,col 9)-(line 339,col 47)",
        "(line 340,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeDivide(double[])",
      "begin_line": 348,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 40)",
        "(line 350,col 9)-(line 350,col 58)",
        "(line 351,col 9)-(line 351,col 47)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 360,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 48)",
        "(line 362,col 9)-(line 362,col 58)",
        "(line 363,col 9)-(line 363,col 47)",
        "(line 364,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.ebeMultiply(double[])",
      "begin_line": 372,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 40)",
        "(line 374,col 9)-(line 374,col 58)",
        "(line 375,col 9)-(line 375,col 47)",
        "(line 376,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getSubVector(int, int)",
      "begin_line": 384,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 387,col 9)-(line 387,col 55)",
        "(line 388,col 9)-(line 388,col 28)",
        "(line 389,col 9)-(line 389,col 43)",
        "(line 390,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getData()",
      "begin_line": 401,
      "end_line": 409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 47)",
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDimension()",
      "begin_line": 412,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDistance(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 422,
      "end_line": 442,
      "comment": "\n     * Optimized method to compute distance.\n     * @param v The vector to compute distance to\n     * @return The distance from \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 43)",
        "(line 424,col 9)-(line 424,col 23)",
        "(line 425,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 41)",
        "(line 433,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 445,
      "end_line": 451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 48)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getDistance(double[])",
      "begin_line": 454,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 40)",
        "(line 456,col 9)-(line 456,col 23)",
        "(line 457,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getEntry(int)",
      "begin_line": 465,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 26)",
        "(line 467,col 9)-(line 467,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Distance(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 471,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 492,
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Distance(double[])",
      "begin_line": 501,
      "end_line": 509,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 40)",
        "(line 503,col 9)-(line 503,col 23)",
        "(line 504,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getL1Norm()",
      "begin_line": 512,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 23)",
        "(line 514,col 9)-(line 514,col 43)",
        "(line 515,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfDistance(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 527,
      "end_line": 548,
      "comment": "\n     * Optimized method to compute LInfDistance.\n     * @param v The vector to compute from\n     * @return the LInfDistance\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 23)",
        "(line 529,col 9)-(line 529,col 43)",
        "(line 530,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 41)",
        "(line 538,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 551,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 48)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfDistance(double[])",
      "begin_line": 560,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 40)",
        "(line 562,col 9)-(line 562,col 23)",
        "(line 563,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getLInfNorm()",
      "begin_line": 573,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 23)",
        "(line 575,col 9)-(line 575,col 43)",
        "(line 576,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.getNorm()",
      "begin_line": 584,
      "end_line": 592,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 23)",
        "(line 586,col 9)-(line 586,col 43)",
        "(line 587,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.isInfinite()",
      "begin_line": 595,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 43)",
        "(line 597,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.isNaN()",
      "begin_line": 607,
      "end_line": 616,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 43)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAbs()",
      "begin_line": 619,
      "end_line": 621,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAbsToSelf()",
      "begin_line": 624,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 43)",
        "(line 626,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAcos()",
      "begin_line": 634,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAcosToSelf()",
      "begin_line": 639,
      "end_line": 644,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAdd(double)",
      "begin_line": 647,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAddToSelf(double)",
      "begin_line": 652,
      "end_line": 657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAsin()",
      "begin_line": 660,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAsinToSelf()",
      "begin_line": 665,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 43)",
        "(line 667,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAtan()",
      "begin_line": 675,
      "end_line": 677,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapAtanToSelf()",
      "begin_line": 680,
      "end_line": 687,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 43)",
        "(line 682,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCbrt()",
      "begin_line": 690,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCbrtToSelf()",
      "begin_line": 695,
      "end_line": 702,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 43)",
        "(line 697,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCeil()",
      "begin_line": 705,
      "end_line": 707,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCeilToSelf()",
      "begin_line": 710,
      "end_line": 717,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 43)",
        "(line 712,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 716,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCos()",
      "begin_line": 720,
      "end_line": 722,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCosToSelf()",
      "begin_line": 725,
      "end_line": 730,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 726,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCosh()",
      "begin_line": 733,
      "end_line": 735,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapCoshToSelf()",
      "begin_line": 738,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapDivide(double)",
      "begin_line": 746,
      "end_line": 748,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapDivideToSelf(double)",
      "begin_line": 751,
      "end_line": 758,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 43)",
        "(line 753,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExp()",
      "begin_line": 761,
      "end_line": 763,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExpToSelf()",
      "begin_line": 766,
      "end_line": 771,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExpm1()",
      "begin_line": 774,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapExpm1ToSelf()",
      "begin_line": 779,
      "end_line": 786,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 43)",
        "(line 781,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapFloor()",
      "begin_line": 789,
      "end_line": 791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapFloorToSelf()",
      "begin_line": 794,
      "end_line": 801,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 43)",
        "(line 796,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapInv()",
      "begin_line": 804,
      "end_line": 806,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapInvToSelf()",
      "begin_line": 809,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog()",
      "begin_line": 817,
      "end_line": 819,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog10()",
      "begin_line": 822,
      "end_line": 824,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog10ToSelf()",
      "begin_line": 827,
      "end_line": 832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog1p()",
      "begin_line": 835,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLog1pToSelf()",
      "begin_line": 840,
      "end_line": 847,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 43)",
        "(line 842,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapLogToSelf()",
      "begin_line": 850,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 8)-(line 854,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapMultiply(double)",
      "begin_line": 858,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapMultiplyToSelf(double)",
      "begin_line": 863,
      "end_line": 870,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 43)",
        "(line 865,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapPow(double)",
      "begin_line": 872,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapPowToSelf(double)",
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
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapRint()",
      "begin_line": 887,
      "end_line": 889,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapRintToSelf()",
      "begin_line": 892,
      "end_line": 899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 43)",
        "(line 894,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSignum()",
      "begin_line": 902,
      "end_line": 904,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSignumToSelf()",
      "begin_line": 907,
      "end_line": 914,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 43)",
        "(line 909,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 913,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSin()",
      "begin_line": 917,
      "end_line": 919,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSinToSelf()",
      "begin_line": 922,
      "end_line": 929,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 43)",
        "(line 924,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSinh()",
      "begin_line": 932,
      "end_line": 934,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSinhToSelf()",
      "begin_line": 937,
      "end_line": 945,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 43)",
        "(line 940,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSqrt()",
      "begin_line": 948,
      "end_line": 950,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSqrtToSelf()",
      "begin_line": 953,
      "end_line": 960,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 43)",
        "(line 955,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSubtract(double)",
      "begin_line": 963,
      "end_line": 965,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapSubtractToSelf(double)",
      "begin_line": 968,
      "end_line": 970,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTan()",
      "begin_line": 973,
      "end_line": 975,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTanToSelf()",
      "begin_line": 978,
      "end_line": 985,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 43)",
        "(line 980,col 9)-(line 983,col 9)",
        "(line 984,col 9)-(line 984,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTanh()",
      "begin_line": 988,
      "end_line": 990,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapTanhToSelf()",
      "begin_line": 993,
      "end_line": 1000,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 43)",
        "(line 995,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 999,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapUlp()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.mapUlpToSelf()",
      "begin_line": 1008,
      "end_line": 1015,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 43)",
        "(line 1010,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1014,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.outerproduct(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 1023,
      "end_line": 1036,
      "comment": "\n     * Optimized method to compute the outer product.\n     * @param v The vector to comput the outer product on\n     * @return The outer product of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 48)",
        "(line 1025,col 9)-(line 1025,col 78)",
        "(line 1026,col 9)-(line 1026,col 43)",
        "(line 1027,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1035,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1039,
      "end_line": 1055,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 48)",
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1045,col 72)",
        "(line 1046,col 9)-(line 1046,col 43)",
        "(line 1047,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.outerProduct(double[])",
      "begin_line": 1058,
      "end_line": 1071,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 40)",
        "(line 1060,col 9)-(line 1060,col 72)",
        "(line 1061,col 9)-(line 1061,col 43)",
        "(line 1062,col 9)-(line 1069,col 9)",
        "(line 1070,col 9)-(line 1070,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1074,
      "end_line": 1077,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1075,col 48)",
        "(line 1076,col 9)-(line 1076,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.projection(double[])",
      "begin_line": 1080,
      "end_line": 1083,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 40)",
        "(line 1082,col 9)-(line 1082,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setEntry(int, double)",
      "begin_line": 1086,
      "end_line": 1093,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 26)",
        "(line 1088,col 9)-(line 1092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1096,
      "end_line": 1100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 26)",
        "(line 1098,col 9)-(line 1098,col 49)",
        "(line 1099,col 9)-(line 1099,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.setSubVector(int, double[])",
      "begin_line": 1103,
      "end_line": 1109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 26)",
        "(line 1105,col 9)-(line 1105,col 41)",
        "(line 1106,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.set(double)",
      "begin_line": 1112,
      "end_line": 1116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.subtract(org.apache.commons.math.linear.SparseRealVector)",
      "begin_line": 1124,
      "end_line": 1138,
      "comment": "\n     * Optimized method to subtract SparseRealVectors.\n     * @param v The vector to subtract from \u003ccode\u003ethis\u003c/code\u003e\n     * @return The difference of \u003ccode\u003ethis\u003c/code\u003e and \u003ccode\u003ev\u003c/code\u003e\n     * @throws IllegalArgumentException If the dimensions don\u0027t match\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 48)",
        "(line 1126,col 9)-(line 1126,col 56)",
        "(line 1127,col 9)-(line 1127,col 50)",
        "(line 1128,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1141,
      "end_line": 1147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 48)",
        "(line 1143,col 9)-(line 1145,col 9)",
        "(line 1146,col 9)-(line 1146,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.subtract(double[])",
      "begin_line": 1150,
      "end_line": 1161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 40)",
        "(line 1152,col 9)-(line 1152,col 58)",
        "(line 1153,col 9)-(line 1159,col 9)",
        "(line 1160,col 9)-(line 1160,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.unitVector()",
      "begin_line": 1165,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 32)",
        "(line 1167,col 9)-(line 1167,col 22)",
        "(line 1168,col 9)-(line 1168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.unitize()",
      "begin_line": 1172,
      "end_line": 1183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1173,col 9)-(line 1173,col 32)",
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1177,col 43)",
        "(line 1178,col 9)-(line 1181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.checkIndex(int)",
      "begin_line": 1193,
      "end_line": 1199,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index\n     *            index to check\n     * @exception MatrixIndexException\n     *                if index is not valid\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.checkVectorDimensions(int)",
      "begin_line": 1209,
      "end_line": 1215,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n\n     *            expected dimension.\n     * @exception IllegalArgumentException\n     *                if the dimension is inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.toArray()",
      "begin_line": 1218,
      "end_line": 1220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1219,col 9)-(line 1219,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.hashCode()",
      "begin_line": 1223,
      "end_line": 1232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1225,col 9)-(line 1225,col 29)",
        "(line 1226,col 9)-(line 1226,col 23)",
        "(line 1227,col 9)-(line 1227,col 18)",
        "(line 1228,col 9)-(line 1228,col 48)",
        "(line 1229,col 9)-(line 1229,col 63)",
        "(line 1230,col 9)-(line 1230,col 46)",
        "(line 1231,col 9)-(line 1231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVector.equals(java.lang.Object)",
      "begin_line": 1235,
      "end_line": 1271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1246,col 56)",
        "(line 1247,col 9)-(line 1249,col 9)",
        "(line 1250,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1254,col 43)",
        "(line 1255,col 9)-(line 1261,col 9)",
        "(line 1262,col 9)-(line 1262,col 45)",
        "(line 1263,col 9)-(line 1269,col 9)",
        "(line 1270,col 9)-(line 1270,col 20)"
      ]
    }
  ]
}
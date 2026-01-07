{
  "filepath": "/tmp/Math-72b/src/main/java/org/apache/commons/math/linear/AbstractRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector"
      ],
      "begin_line": 34,
      "end_line": 946,
      "comment": "\n * This class provides default basic implementations for many methods in the\n * {@link RealVector} interface with.\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(int)",
      "begin_line": 53,
      "end_line": 61,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 34)",
        "(line 56,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkIndex(int)",
      "begin_line": 68,
      "end_line": 75,
      "comment": "\n     * Check if an index is valid.\n     * @param index index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 78,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 26)",
        "(line 80,col 9)-(line 80,col 49)",
        "(line 81,col 9)-(line 81,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, double[])",
      "begin_line": 85,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 26)",
        "(line 87,col 9)-(line 87,col 41)",
        "(line 88,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(double[])",
      "begin_line": 94,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)",
        "(line 96,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 97,col 16)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 105,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 46)",
        "(line 112,col 9)-(line 112,col 16)",
        "(line 113,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(double[])",
      "begin_line": 121,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 46)",
        "(line 124,col 9)-(line 124,col 16)",
        "(line 125,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 133,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 37)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 140,col 16)",
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAdd(double)",
      "begin_line": 149,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAddToSelf(double)",
      "begin_line": 154,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.copy()",
      "begin_line": 166,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.dotProduct(double[])",
      "begin_line": 169,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 174,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 33)",
        "(line 176,col 9)-(line 176,col 21)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 16)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.ebeDivide(double[])",
      "begin_line": 186,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.ebeMultiply(double[])",
      "begin_line": 191,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 196,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 33)",
        "(line 198,col 9)-(line 198,col 21)",
        "(line 199,col 9)-(line 199,col 40)",
        "(line 200,col 9)-(line 200,col 16)",
        "(line 201,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getNorm()",
      "begin_line": 209,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 23)",
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 16)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Norm()",
      "begin_line": 221,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 24)",
        "(line 223,col 9)-(line 223,col 46)",
        "(line 224,col 9)-(line 224,col 16)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfNorm()",
      "begin_line": 232,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 24)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 235,col 16)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getDistance(double[])",
      "begin_line": 243,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 248,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 33)",
        "(line 250,col 9)-(line 250,col 21)",
        "(line 251,col 9)-(line 251,col 40)",
        "(line 252,col 9)-(line 252,col 16)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Distance(double[])",
      "begin_line": 260,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 40)",
        "(line 262,col 9)-(line 262,col 21)",
        "(line 263,col 9)-(line 263,col 40)",
        "(line 264,col 9)-(line 264,col 16)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 272,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 33)",
        "(line 274,col 9)-(line 274,col 21)",
        "(line 275,col 9)-(line 275,col 40)",
        "(line 276,col 9)-(line 276,col 16)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfDistance(double[])",
      "begin_line": 284,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 40)",
        "(line 286,col 9)-(line 286,col 21)",
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 288,col 16)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMinIndex()",
      "begin_line": 299,
      "end_line": 311,
      "comment": " Get the index of the minimum entry.\n     * @return index of the minimum entry or -1 if vector length is 0\n     * or all entries are NaN\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 29)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 302,col 46)",
        "(line 303,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMinValue()",
      "begin_line": 316,
      "end_line": 319,
      "comment": " Get the value of the minimum entry.\n     * @return value of the minimum entry or NaN if all entries are NaN\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 43)",
        "(line 318,col 9)-(line 318,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMaxIndex()",
      "begin_line": 325,
      "end_line": 337,
      "comment": " Get the index of the maximum entry.\n     * @return index of the maximum entry or -1 if vector length is 0\n     * or all entries are NaN\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 29)",
        "(line 327,col 9)-(line 327,col 51)",
        "(line 328,col 9)-(line 328,col 46)",
        "(line 329,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMaxValue()",
      "begin_line": 342,
      "end_line": 345,
      "comment": " Get the value of the maximum entry.\n     * @return value of the maximum entry or NaN if all entries are NaN\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAbs()",
      "begin_line": 348,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAbsToSelf()",
      "begin_line": 353,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAcos()",
      "begin_line": 362,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAcosToSelf()",
      "begin_line": 367,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAsin()",
      "begin_line": 376,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAsinToSelf()",
      "begin_line": 381,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAtan()",
      "begin_line": 390,
      "end_line": 392,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAtanToSelf()",
      "begin_line": 395,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 396,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCbrt()",
      "begin_line": 404,
      "end_line": 406,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCbrtToSelf()",
      "begin_line": 409,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 410,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCeil()",
      "begin_line": 418,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCeilToSelf()",
      "begin_line": 423,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCos()",
      "begin_line": 432,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCosToSelf()",
      "begin_line": 437,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 438,col 9)-(line 442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCosh()",
      "begin_line": 446,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCoshToSelf()",
      "begin_line": 451,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 9)-(line 456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivide(double)",
      "begin_line": 460,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivideToSelf(double)",
      "begin_line": 465,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExp()",
      "begin_line": 474,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExpToSelf()",
      "begin_line": 479,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExpm1()",
      "begin_line": 488,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExpm1ToSelf()",
      "begin_line": 493,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapFloor()",
      "begin_line": 502,
      "end_line": 504,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapFloorToSelf()",
      "begin_line": 507,
      "end_line": 513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapInv()",
      "begin_line": 516,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapInvToSelf()",
      "begin_line": 521,
      "end_line": 527,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog()",
      "begin_line": 530,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLogToSelf()",
      "begin_line": 535,
      "end_line": 541,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 9)-(line 540,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog10()",
      "begin_line": 544,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog10ToSelf()",
      "begin_line": 549,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog1p()",
      "begin_line": 558,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog1pToSelf()",
      "begin_line": 563,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiply(double)",
      "begin_line": 572,
      "end_line": 574,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiplyToSelf(double)",
      "begin_line": 577,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 578,col 9)-(line 582,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapPow(double)",
      "begin_line": 586,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapPowToSelf(double)",
      "begin_line": 591,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 596,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapRint()",
      "begin_line": 600,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapRintToSelf()",
      "begin_line": 605,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 606,col 9)-(line 610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSignum()",
      "begin_line": 614,
      "end_line": 616,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSignumToSelf()",
      "begin_line": 619,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 620,col 9)-(line 624,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSin()",
      "begin_line": 628,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSinToSelf()",
      "begin_line": 633,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSinh()",
      "begin_line": 642,
      "end_line": 644,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSinhToSelf()",
      "begin_line": 647,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSqrt()",
      "begin_line": 656,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSqrtToSelf()",
      "begin_line": 661,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtract(double)",
      "begin_line": 670,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtractToSelf(double)",
      "begin_line": 675,
      "end_line": 677,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTan()",
      "begin_line": 680,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTanToSelf()",
      "begin_line": 685,
      "end_line": 691,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 686,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTanh()",
      "begin_line": 694,
      "end_line": 696,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTanhToSelf()",
      "begin_line": 699,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 700,col 9)-(line 704,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapUlp()",
      "begin_line": 708,
      "end_line": 710,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapUlpToSelf()",
      "begin_line": 713,
      "end_line": 719,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 714,col 9)-(line 718,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 722,
      "end_line": 742,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 27)",
        "(line 724,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 50)",
        "(line 730,col 9)-(line 730,col 27)",
        "(line 731,col 9)-(line 738,col 9)",
        "(line 740,col 9)-(line 740,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(double[])",
      "begin_line": 745,
      "end_line": 747,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.projection(double[])",
      "begin_line": 750,
      "end_line": 752,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.set(double)",
      "begin_line": 755,
      "end_line": 761,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 40)",
        "(line 757,col 9)-(line 757,col 23)",
        "(line 758,col 9)-(line 760,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.toArray()",
      "begin_line": 764,
      "end_line": 771,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 33)",
        "(line 766,col 9)-(line 766,col 42)",
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getData()",
      "begin_line": 774,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitVector()",
      "begin_line": 779,
      "end_line": 783,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 33)",
        "(line 781,col 9)-(line 781,col 23)",
        "(line 782,col 9)-(line 782,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitize()",
      "begin_line": 786,
      "end_line": 788,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.sparseIterator()",
      "begin_line": 791,
      "end_line": 793,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.iterator()",
      "begin_line": 796,
      "end_line": 822,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 39)",
        "(line 798,col 9)-(line 821,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 801,
      "end_line": 801,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 804,
      "end_line": 804,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-48faf6b4-6047-4b2b-83a9-bfd78f7facef.hasNext()",
      "begin_line": 807,
      "end_line": 809,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 808,col 17)-(line 808,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-56aa04c3-7f10-4567-bdd6-cb79b3dbb20d.next()",
      "begin_line": 812,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 17)-(line 813,col 32)",
        "(line 814,col 17)-(line 814,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-a0b8cb48-8820-46ea-b73b-7bb676200322.remove()",
      "begin_line": 818,
      "end_line": 820,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 819,col 17)-(line 819,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 825,
      "end_line": 827,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 830,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 86)",
        "(line 832,col 9)-(line 832,col 16)",
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 840,
      "end_line": 858,
      "comment": " An entry in the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.EntryImpl()",
      "begin_line": 843,
      "end_line": 845,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 844,col 13)-(line 844,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.getValue()",
      "begin_line": 848,
      "end_line": 851,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 850,col 13)-(line 850,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.setValue(double)",
      "begin_line": 854,
      "end_line": 857,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 856,col 13)-(line 856,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 873,
      "end_line": 944,
      "comment": "\n     * This class should rare be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, not use this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 876,
      "end_line": 876,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "tmp"
      ],
      "begin_line": 879,
      "end_line": 879,
      "comment": " Temporary entry (reused on each call to {@link #next()}. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 882,
      "end_line": 882,
      "comment": " Current entry. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 885,
      "end_line": 885,
      "comment": " Next entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 888,
      "end_line": 903,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 889,col 13)-(line 889,col 33)",
        "(line 890,col 13)-(line 890,col 38)",
        "(line 891,col 13)-(line 893,col 13)",
        "(line 894,col 13)-(line 902,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.AbstractRealVector.EntryImpl)",
      "begin_line": 908,
      "end_line": 918,
      "comment": " Advance an entry up to the next non null one.\n         * @param e entry to advance\n         ",
      "child_ranges": [
        "(line 909,col 13)-(line 911,col 13)",
        "(line 912,col 13)-(line 914,col 62)",
        "(line 915,col 13)-(line 917,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.hasNext()",
      "begin_line": 921,
      "end_line": 923,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.next()",
      "begin_line": 926,
      "end_line": 938,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 927,col 13)-(line 927,col 45)",
        "(line 928,col 13)-(line 936,col 13)",
        "(line 937,col 13)-(line 937,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.remove()",
      "begin_line": 941,
      "end_line": 943,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 942,col 13)-(line 942,col 69)"
      ]
    }
  ]
}
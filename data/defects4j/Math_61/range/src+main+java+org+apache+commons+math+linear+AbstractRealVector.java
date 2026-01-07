{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/AbstractRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector"
      ],
      "begin_line": 38,
      "end_line": 932,
      "comment": "\n * This class provides default basic implementations for many methods in the\n * {@link RealVector} interface.\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(int)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)",
        "(line 60,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkIndex(int)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     * Check if an index is valid.\n     * @param index index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 79,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 26)",
        "(line 81,col 9)-(line 81,col 49)",
        "(line 82,col 9)-(line 82,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, double[])",
      "begin_line": 86,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 26)",
        "(line 88,col 9)-(line 88,col 41)",
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(double[])",
      "begin_line": 95,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)",
        "(line 97,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 98,col 16)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 106,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 46)",
        "(line 113,col 9)-(line 113,col 16)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(double[])",
      "begin_line": 122,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 46)",
        "(line 125,col 9)-(line 125,col 16)",
        "(line 126,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 134,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 37)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 16)",
        "(line 142,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAdd(double)",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAddToSelf(double)",
      "begin_line": 155,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.copy()",
      "begin_line": 167,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.dotProduct(double[])",
      "begin_line": 170,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 175,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 177,col 21)",
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 179,col 16)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.ebeDivide(double[])",
      "begin_line": 187,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.ebeMultiply(double[])",
      "begin_line": 192,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 197,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 21)",
        "(line 200,col 9)-(line 200,col 40)",
        "(line 201,col 9)-(line 201,col 16)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getNorm()",
      "begin_line": 210,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 23)",
        "(line 212,col 9)-(line 212,col 46)",
        "(line 213,col 9)-(line 213,col 16)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Norm()",
      "begin_line": 222,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 24)",
        "(line 224,col 9)-(line 224,col 46)",
        "(line 225,col 9)-(line 225,col 16)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfNorm()",
      "begin_line": 233,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 24)",
        "(line 235,col 9)-(line 235,col 46)",
        "(line 236,col 9)-(line 236,col 16)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getDistance(double[])",
      "begin_line": 244,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 249,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 33)",
        "(line 251,col 9)-(line 251,col 21)",
        "(line 252,col 9)-(line 252,col 40)",
        "(line 253,col 9)-(line 253,col 16)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Distance(double[])",
      "begin_line": 261,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 263,col 21)",
        "(line 264,col 9)-(line 264,col 40)",
        "(line 265,col 9)-(line 265,col 16)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 273,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 21)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 16)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfDistance(double[])",
      "begin_line": 285,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 21)",
        "(line 288,col 9)-(line 288,col 40)",
        "(line 289,col 9)-(line 289,col 16)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMinIndex()",
      "begin_line": 300,
      "end_line": 312,
      "comment": " Get the index of the minimum entry.\n     * @return index of the minimum entry or -1 if vector length is 0\n     * or all entries are NaN\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 29)",
        "(line 302,col 9)-(line 302,col 51)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMinValue()",
      "begin_line": 317,
      "end_line": 320,
      "comment": " Get the value of the minimum entry.\n     * @return value of the minimum entry or NaN if all entries are NaN\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMaxIndex()",
      "begin_line": 326,
      "end_line": 338,
      "comment": " Get the index of the maximum entry.\n     * @return index of the maximum entry or -1 if vector length is 0\n     * or all entries are NaN\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 29)",
        "(line 328,col 9)-(line 328,col 51)",
        "(line 329,col 9)-(line 329,col 46)",
        "(line 330,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMaxValue()",
      "begin_line": 343,
      "end_line": 346,
      "comment": " Get the value of the maximum entry.\n     * @return value of the maximum entry or NaN if all entries are NaN\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 43)",
        "(line 345,col 9)-(line 345,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAbs()",
      "begin_line": 349,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAbsToSelf()",
      "begin_line": 354,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAcos()",
      "begin_line": 363,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAcosToSelf()",
      "begin_line": 368,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAsin()",
      "begin_line": 377,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAsinToSelf()",
      "begin_line": 382,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAtan()",
      "begin_line": 391,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAtanToSelf()",
      "begin_line": 396,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCbrt()",
      "begin_line": 405,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCbrtToSelf()",
      "begin_line": 410,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCeil()",
      "begin_line": 419,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCeilToSelf()",
      "begin_line": 424,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCos()",
      "begin_line": 433,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCosToSelf()",
      "begin_line": 438,
      "end_line": 444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 439,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCosh()",
      "begin_line": 447,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapCoshToSelf()",
      "begin_line": 452,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 9)-(line 457,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivide(double)",
      "begin_line": 461,
      "end_line": 463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivideToSelf(double)",
      "begin_line": 466,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 467,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExp()",
      "begin_line": 475,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExpToSelf()",
      "begin_line": 480,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 481,col 9)-(line 485,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExpm1()",
      "begin_line": 489,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapExpm1ToSelf()",
      "begin_line": 494,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapFloor()",
      "begin_line": 503,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapFloorToSelf()",
      "begin_line": 508,
      "end_line": 514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapInv()",
      "begin_line": 517,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapInvToSelf()",
      "begin_line": 522,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog()",
      "begin_line": 531,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLogToSelf()",
      "begin_line": 536,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog10()",
      "begin_line": 545,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog10ToSelf()",
      "begin_line": 550,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog1p()",
      "begin_line": 559,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapLog1pToSelf()",
      "begin_line": 564,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiply(double)",
      "begin_line": 573,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiplyToSelf(double)",
      "begin_line": 578,
      "end_line": 584,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapPow(double)",
      "begin_line": 587,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapPowToSelf(double)",
      "begin_line": 592,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 597,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapRint()",
      "begin_line": 601,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapRintToSelf()",
      "begin_line": 606,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSignum()",
      "begin_line": 615,
      "end_line": 617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSignumToSelf()",
      "begin_line": 620,
      "end_line": 626,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 621,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSin()",
      "begin_line": 629,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSinToSelf()",
      "begin_line": 634,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSinh()",
      "begin_line": 643,
      "end_line": 645,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSinhToSelf()",
      "begin_line": 648,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSqrt()",
      "begin_line": 657,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSqrtToSelf()",
      "begin_line": 662,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtract(double)",
      "begin_line": 671,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtractToSelf(double)",
      "begin_line": 676,
      "end_line": 678,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTan()",
      "begin_line": 681,
      "end_line": 683,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTanToSelf()",
      "begin_line": 686,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTanh()",
      "begin_line": 695,
      "end_line": 697,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapTanhToSelf()",
      "begin_line": 700,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 701,col 9)-(line 705,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapUlp()",
      "begin_line": 709,
      "end_line": 711,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapUlpToSelf()",
      "begin_line": 714,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 715,col 9)-(line 719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 723,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 27)",
        "(line 725,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 50)",
        "(line 731,col 9)-(line 731,col 27)",
        "(line 732,col 9)-(line 739,col 9)",
        "(line 741,col 9)-(line 741,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(double[])",
      "begin_line": 746,
      "end_line": 748,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.projection(double[])",
      "begin_line": 751,
      "end_line": 753,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.set(double)",
      "begin_line": 756,
      "end_line": 762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 40)",
        "(line 758,col 9)-(line 758,col 23)",
        "(line 759,col 9)-(line 761,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.toArray()",
      "begin_line": 765,
      "end_line": 772,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 33)",
        "(line 767,col 9)-(line 767,col 42)",
        "(line 768,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getData()",
      "begin_line": 775,
      "end_line": 777,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitVector()",
      "begin_line": 780,
      "end_line": 784,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 33)",
        "(line 782,col 9)-(line 782,col 23)",
        "(line 783,col 9)-(line 783,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitize()",
      "begin_line": 787,
      "end_line": 789,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.sparseIterator()",
      "begin_line": 792,
      "end_line": 794,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.iterator()",
      "begin_line": 797,
      "end_line": 823,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 39)",
        "(line 799,col 9)-(line 822,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 802,
      "end_line": 802,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 805,
      "end_line": 805,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-b41b6c37-3d87-4c68-a1e4-a9c9eed00cf4.hasNext()",
      "begin_line": 808,
      "end_line": 810,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 17)-(line 809,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-41addf85-a5e1-434b-8d21-8552eeaa273a.next()",
      "begin_line": 813,
      "end_line": 816,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 814,col 17)-(line 814,col 32)",
        "(line 815,col 17)-(line 815,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-ccaec1a1-35ab-4402-9932-50271a4713b4.remove()",
      "begin_line": 819,
      "end_line": 821,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 820,col 17)-(line 820,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 826,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 831,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 86)",
        "(line 833,col 9)-(line 833,col 16)",
        "(line 834,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 841,
      "end_line": 859,
      "comment": " An entry in the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.EntryImpl()",
      "begin_line": 844,
      "end_line": 846,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 845,col 13)-(line 845,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.getValue()",
      "begin_line": 849,
      "end_line": 852,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 13)-(line 851,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.setValue(double)",
      "begin_line": 855,
      "end_line": 858,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 857,col 13)-(line 857,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 874,
      "end_line": 930,
      "comment": "\n     * This class should rare be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, not use this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 877,
      "end_line": 877,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": " last entry returned by {@link #next()} "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 883,
      "end_line": 883,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 886,
      "end_line": 893,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 887,col 13)-(line 887,col 33)",
        "(line 888,col 13)-(line 888,col 38)",
        "(line 889,col 13)-(line 889,col 35)",
        "(line 890,col 13)-(line 892,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.AbstractRealVector.EntryImpl)",
      "begin_line": 898,
      "end_line": 908,
      "comment": " Advance an entry up to the next nonzero one.\n         * @param e entry to advance\n         ",
      "child_ranges": [
        "(line 899,col 13)-(line 901,col 13)",
        "(line 902,col 13)-(line 904,col 62)",
        "(line 905,col 13)-(line 907,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.hasNext()",
      "begin_line": 911,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 912,col 13)-(line 912,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.next()",
      "begin_line": 916,
      "end_line": 924,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 917,col 13)-(line 917,col 40)",
        "(line 918,col 13)-(line 920,col 13)",
        "(line 921,col 13)-(line 921,col 36)",
        "(line 922,col 13)-(line 922,col 26)",
        "(line 923,col 13)-(line 923,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.remove()",
      "begin_line": 927,
      "end_line": 929,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 928,col 13)-(line 928,col 58)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/linear/AbstractRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector"
      ],
      "begin_line": 42,
      "end_line": 608,
      "comment": "\n * This class provides default basic implementations for many methods in the\n * {@link RealVector} interface.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(int)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 31)",
        "(line 64,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkIndex(int)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 84,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)",
        "(line 86,col 9)-(line 86,col 49)",
        "(line 87,col 9)-(line 87,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, double[])",
      "begin_line": 91,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 26)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(double[])",
      "begin_line": 100,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 16)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 111,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 117,col 9)-(line 117,col 46)",
        "(line 118,col 9)-(line 118,col 16)",
        "(line 119,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(double[])",
      "begin_line": 127,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 46)",
        "(line 130,col 9)-(line 130,col 16)",
        "(line 131,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 139,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 37)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 146,col 9)-(line 146,col 16)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAdd(double)",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAddToSelf(double)",
      "begin_line": 160,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.copy()",
      "begin_line": 168,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.dotProduct(double[])",
      "begin_line": 171,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 176,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 178,col 21)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 16)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 188,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 38)",
        "(line 190,col 9)-(line 190,col 41)",
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.cosine(double[])",
      "begin_line": 200,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.ebeDivide(double[])",
      "begin_line": 205,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.ebeMultiply(double[])",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 215,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 217,col 21)",
        "(line 218,col 9)-(line 218,col 40)",
        "(line 219,col 9)-(line 219,col 16)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getNorm()",
      "begin_line": 228,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 23)",
        "(line 230,col 9)-(line 230,col 46)",
        "(line 231,col 9)-(line 231,col 16)",
        "(line 232,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Norm()",
      "begin_line": 240,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 24)",
        "(line 242,col 9)-(line 242,col 46)",
        "(line 243,col 9)-(line 243,col 16)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfNorm()",
      "begin_line": 251,
      "end_line": 259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 24)",
        "(line 253,col 9)-(line 253,col 46)",
        "(line 254,col 9)-(line 254,col 16)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getDistance(double[])",
      "begin_line": 262,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 267,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 33)",
        "(line 269,col 9)-(line 269,col 21)",
        "(line 270,col 9)-(line 270,col 40)",
        "(line 271,col 9)-(line 271,col 16)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getL1Distance(double[])",
      "begin_line": 279,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 281,col 21)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 16)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 291,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 33)",
        "(line 293,col 9)-(line 293,col 21)",
        "(line 294,col 9)-(line 294,col 40)",
        "(line 295,col 9)-(line 295,col 16)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getLInfDistance(double[])",
      "begin_line": 303,
      "end_line": 312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 40)",
        "(line 305,col 9)-(line 305,col 21)",
        "(line 306,col 9)-(line 306,col 40)",
        "(line 307,col 9)-(line 307,col 16)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMinIndex()",
      "begin_line": 318,
      "end_line": 330,
      "comment": " Get the index of the minimum entry.\n     * @return index of the minimum entry or -1 if vector length is 0\n     * or all entries are NaN\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 29)",
        "(line 320,col 9)-(line 320,col 51)",
        "(line 321,col 9)-(line 321,col 46)",
        "(line 322,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMinValue()",
      "begin_line": 335,
      "end_line": 338,
      "comment": " Get the value of the minimum entry.\n     * @return value of the minimum entry or NaN if all entries are NaN\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 43)",
        "(line 337,col 9)-(line 337,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMaxIndex()",
      "begin_line": 344,
      "end_line": 356,
      "comment": " Get the index of the maximum entry.\n     * @return index of the maximum entry or -1 if vector length is 0\n     * or all entries are NaN\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 346,col 51)",
        "(line 347,col 9)-(line 347,col 46)",
        "(line 348,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getMaxValue()",
      "begin_line": 361,
      "end_line": 364,
      "comment": " Get the value of the maximum entry.\n     * @return value of the maximum entry or NaN if all entries are NaN\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 43)",
        "(line 363,col 9)-(line 363,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiply(double)",
      "begin_line": 368,
      "end_line": 370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiplyToSelf(double)",
      "begin_line": 373,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtract(double)",
      "begin_line": 378,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtractToSelf(double)",
      "begin_line": 383,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivide(double)",
      "begin_line": 388,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivideToSelf(double)",
      "begin_line": 393,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 398,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 27)",
        "(line 400,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 50)",
        "(line 408,col 9)-(line 408,col 27)",
        "(line 409,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(double[])",
      "begin_line": 423,
      "end_line": 425,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.projection(double[])",
      "begin_line": 428,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.set(double)",
      "begin_line": 433,
      "end_line": 439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 40)",
        "(line 435,col 9)-(line 435,col 23)",
        "(line 436,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.toArray()",
      "begin_line": 442,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 33)",
        "(line 444,col 9)-(line 444,col 42)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getData()",
      "begin_line": 452,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitVector()",
      "begin_line": 457,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 33)",
        "(line 459,col 9)-(line 459,col 23)",
        "(line 460,col 9)-(line 460,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitize()",
      "begin_line": 464,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.sparseIterator()",
      "begin_line": 469,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.iterator()",
      "begin_line": 474,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 39)",
        "(line 476,col 9)-(line 499,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 482,
      "end_line": 482,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-1c6a5aab-c998-4b02-b9c6-91d8e1c018c0.hasNext()",
      "begin_line": 485,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 17)-(line 486,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-dd83e0a0-7b36-4f49-bec0-26d1b1a3b1b7.next()",
      "begin_line": 490,
      "end_line": 493,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 17)-(line 491,col 32)",
        "(line 492,col 17)-(line 492,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-85d07016-8c65-4807-b1e8-223c5f17ec92.remove()",
      "begin_line": 496,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 17)-(line 497,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 503,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 508,
      "end_line": 515,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 86)",
        "(line 510,col 9)-(line 510,col 16)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 518,
      "end_line": 536,
      "comment": " An entry in the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.EntryImpl()",
      "begin_line": 521,
      "end_line": 523,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 522,col 13)-(line 522,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.getValue()",
      "begin_line": 526,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.setValue(double)",
      "begin_line": 532,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 13)-(line 534,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 551,
      "end_line": 607,
      "comment": "\n     * This class should rare be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, not use this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 557,
      "end_line": 557,
      "comment": " last entry returned by {@link #next()} "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 560,
      "end_line": 560,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 563,
      "end_line": 570,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 33)",
        "(line 565,col 13)-(line 565,col 38)",
        "(line 566,col 13)-(line 566,col 35)",
        "(line 567,col 13)-(line 569,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.AbstractRealVector.EntryImpl)",
      "begin_line": 575,
      "end_line": 585,
      "comment": " Advance an entry up to the next nonzero one.\n         * @param e entry to advance\n         ",
      "child_ranges": [
        "(line 576,col 13)-(line 578,col 13)",
        "(line 579,col 13)-(line 581,col 62)",
        "(line 582,col 13)-(line 584,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.hasNext()",
      "begin_line": 588,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 589,col 13)-(line 589,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.next()",
      "begin_line": 593,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 594,col 13)-(line 594,col 40)",
        "(line 595,col 13)-(line 597,col 13)",
        "(line 598,col 13)-(line 598,col 36)",
        "(line 599,col 13)-(line 599,col 26)",
        "(line 600,col 13)-(line 600,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.remove()",
      "begin_line": 604,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 13)-(line 605,col 58)"
      ]
    }
  ]
}
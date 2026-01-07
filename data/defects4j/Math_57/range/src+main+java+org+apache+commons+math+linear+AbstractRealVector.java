{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/linear/AbstractRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector"
      ],
      "begin_line": 41,
      "end_line": 590,
      "comment": "\n * This class provides default basic implementations for many methods in the\n * {@link RealVector} interface.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     *\n     * @param v Vector to compare instance with.\n     * @throws DimensionMismatchException if the vectors do not\n     * have the same dimension.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(int)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is\n     * inconsistent with the vector size.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)",
        "(line 63,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.checkIndex(int)",
      "begin_line": 74,
      "end_line": 80,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 83,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 26)",
        "(line 85,col 9)-(line 85,col 49)",
        "(line 86,col 9)-(line 86,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.setSubVector(int, double[])",
      "begin_line": 90,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 26)",
        "(line 92,col 9)-(line 92,col 41)",
        "(line 93,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(double[])",
      "begin_line": 99,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 36)",
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 102,col 16)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 110,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 37)",
        "(line 116,col 9)-(line 116,col 46)",
        "(line 117,col 9)-(line 117,col 16)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(double[])",
      "begin_line": 126,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 138,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 37)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 16)",
        "(line 146,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAdd(double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapAddToSelf(double)",
      "begin_line": 159,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
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
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiply(double)",
      "begin_line": 350,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapMultiplyToSelf(double)",
      "begin_line": 355,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtract(double)",
      "begin_line": 360,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapSubtractToSelf(double)",
      "begin_line": 365,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivide(double)",
      "begin_line": 370,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapDivideToSelf(double)",
      "begin_line": 375,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 380,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 27)",
        "(line 382,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 50)",
        "(line 390,col 9)-(line 390,col 27)",
        "(line 391,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.outerProduct(double[])",
      "begin_line": 405,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.projection(double[])",
      "begin_line": 410,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.set(double)",
      "begin_line": 415,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 40)",
        "(line 417,col 9)-(line 417,col 23)",
        "(line 418,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.toArray()",
      "begin_line": 424,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 33)",
        "(line 426,col 9)-(line 426,col 42)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.getData()",
      "begin_line": 434,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitVector()",
      "begin_line": 439,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 33)",
        "(line 441,col 9)-(line 441,col 23)",
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.unitize()",
      "begin_line": 446,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.sparseIterator()",
      "begin_line": 451,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.iterator()",
      "begin_line": 456,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 39)",
        "(line 458,col 9)-(line 481,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": " Current index. "
    },
    {
      "type": "field",
      "varNames": [
        "e"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": " Current entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-6e35e1ab-f71b-4adf-bed3-b21992461dfa.hasNext()",
      "begin_line": 467,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 17)-(line 468,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-91001cca-2cf9-4735-b1d4-a22a545e74ae.next()",
      "begin_line": 472,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 17)-(line 473,col 32)",
        "(line 474,col 17)-(line 474,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.Anonymous-3da85f5b-03fd-459b-b9c4-98e2935f96fa.remove()",
      "begin_line": 478,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 17)-(line 479,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 485,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 490,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 86)",
        "(line 492,col 9)-(line 492,col 16)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector.Entry"
      ],
      "begin_line": 500,
      "end_line": 518,
      "comment": " An entry in the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.EntryImpl()",
      "begin_line": 503,
      "end_line": 505,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 504,col 13)-(line 504,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.getValue()",
      "begin_line": 508,
      "end_line": 511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 13)-(line 510,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.EntryImpl.setValue(double)",
      "begin_line": 514,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SparseEntryIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003corg.apache.commons.math.linear.RealVector.Entry\u003e"
      ],
      "begin_line": 533,
      "end_line": 589,
      "comment": "\n     * This class should rare be used, but is here to provide\n     * a default implementation of sparseIterator(), which is implemented\n     * by walking over the entries, skipping those whose values are the default one.\n     *\n     * Concrete subclasses which are SparseVector implementations should\n     * make their own sparse iterator, not use this one.\n     *\n     * This implementation might be useful for ArrayRealVector, when expensive\n     * operations which preserve the default value are to be done on the entries,\n     * and the fraction of non-default values is small (i.e. someone took a\n     * SparseVector, and passed it into the copy-constructor of ArrayRealVector)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dim"
      ],
      "begin_line": 536,
      "end_line": 536,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": " last entry returned by {@link #next()} "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": " Next entry for {@link #next()} to return. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.SparseEntryIterator()",
      "begin_line": 545,
      "end_line": 552,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 546,col 13)-(line 546,col 33)",
        "(line 547,col 13)-(line 547,col 38)",
        "(line 548,col 13)-(line 548,col 35)",
        "(line 549,col 13)-(line 551,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.advance(org.apache.commons.math.linear.AbstractRealVector.EntryImpl)",
      "begin_line": 557,
      "end_line": 567,
      "comment": " Advance an entry up to the next nonzero one.\n         * @param e entry to advance\n         ",
      "child_ranges": [
        "(line 558,col 13)-(line 560,col 13)",
        "(line 561,col 13)-(line 563,col 62)",
        "(line 564,col 13)-(line 566,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.hasNext()",
      "begin_line": 570,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.next()",
      "begin_line": 575,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 40)",
        "(line 577,col 13)-(line 579,col 13)",
        "(line 580,col 13)-(line 580,col 36)",
        "(line 581,col 13)-(line 581,col 26)",
        "(line 582,col 13)-(line 582,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator.remove()",
      "begin_line": 586,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 13)-(line 587,col 58)"
      ]
    }
  ]
}
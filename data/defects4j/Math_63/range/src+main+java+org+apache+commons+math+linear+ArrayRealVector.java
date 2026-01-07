{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 1237,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "DEFAULT_FORMAT"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(ArrayRealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 32)",
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of doubles.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 98,
      "end_line": 107,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 115,
      "end_line": 122,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 121,col 9)-(line 121,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\n     * Construct a vector from an array.\n     * @param d array of Doubles.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\n     * Construct a vector from part of a Double array\n     * @param d array of Doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 32)",
        "(line 147,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 44)",
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, boolean)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Construct a vector from another vector.\n     * @param v vector to copy\n     * @param deep if true perform a deep copy otherwise perform a shallow copy\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 59)",
        "(line 187,col 9)-(line 187,col 62)",
        "(line 188,col 9)-(line 188,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 196,
      "end_line": 204,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 38)",
        "(line 198,col 9)-(line 198,col 41)",
        "(line 199,col 9)-(line 199,col 35)",
        "(line 200,col 9)-(line 200,col 50)",
        "(line 201,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 211,
      "end_line": 219,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 41)",
        "(line 213,col 9)-(line 213,col 38)",
        "(line 214,col 9)-(line 214,col 35)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, double[])",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 41)",
        "(line 228,col 9)-(line 228,col 33)",
        "(line 229,col 9)-(line 229,col 35)",
        "(line 230,col 9)-(line 230,col 50)",
        "(line 231,col 9)-(line 231,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 239,
      "end_line": 245,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 33)",
        "(line 241,col 9)-(line 241,col 41)",
        "(line 242,col 9)-(line 242,col 35)",
        "(line 243,col 9)-(line 243,col 45)",
        "(line 244,col 9)-(line 244,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 252,
      "end_line": 258,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 45)",
        "(line 257,col 9)-(line 257,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.copy()",
      "begin_line": 261,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 267,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(double[])",
      "begin_line": 285,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 40)",
        "(line 289,col 9)-(line 289,col 36)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 308,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(double[])",
      "begin_line": 326,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 40)",
        "(line 330,col 9)-(line 330,col 36)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 343,
      "end_line": 346,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 349,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 358,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 367,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 376,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf(double)",
      "begin_line": 385,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf()",
      "begin_line": 394,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf()",
      "begin_line": 403,
      "end_line": 409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf()",
      "begin_line": 412,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf()",
      "begin_line": 421,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf()",
      "begin_line": 430,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf()",
      "begin_line": 439,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf()",
      "begin_line": 448,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf()",
      "begin_line": 457,
      "end_line": 463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf()",
      "begin_line": 466,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf()",
      "begin_line": 475,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf()",
      "begin_line": 484,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf()",
      "begin_line": 493,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf()",
      "begin_line": 502,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf()",
      "begin_line": 511,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf()",
      "begin_line": 520,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf()",
      "begin_line": 529,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf()",
      "begin_line": 538,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf()",
      "begin_line": 547,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf()",
      "begin_line": 556,
      "end_line": 562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf()",
      "begin_line": 565,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf()",
      "begin_line": 574,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf()",
      "begin_line": 583,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf()",
      "begin_line": 592,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 601,
      "end_line": 613,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 603,col 9)-(line 612,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(double[])",
      "begin_line": 616,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 40)",
        "(line 620,col 9)-(line 620,col 36)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 633,
      "end_line": 636,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 639,
      "end_line": 651,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(double[])",
      "begin_line": 654,
      "end_line": 663,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 40)",
        "(line 658,col 9)-(line 658,col 36)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getData()",
      "begin_line": 677,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDataRef()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 692,
      "end_line": 707,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(double[])",
      "begin_line": 710,
      "end_line": 719,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 40)",
        "(line 714,col 9)-(line 714,col 23)",
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 727,
      "end_line": 730,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getNorm()",
      "begin_line": 733,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 23)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 743,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 23)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 753,
      "end_line": 760,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 23)",
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 763,
      "end_line": 777,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 766,col 9)-(line 776,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(double[])",
      "begin_line": 780,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 40)",
        "(line 784,col 9)-(line 784,col 23)",
        "(line 785,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 805,
      "end_line": 808,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 811,
      "end_line": 825,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 814,col 9)-(line 824,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(double[])",
      "begin_line": 828,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 40)",
        "(line 832,col 9)-(line 832,col 23)",
        "(line 833,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 853,
      "end_line": 856,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 859,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 862,col 9)-(line 872,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(double[])",
      "begin_line": 876,
      "end_line": 886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 40)",
        "(line 880,col 9)-(line 880,col 23)",
        "(line 881,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 901,
      "end_line": 904,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitVector()",
      "begin_line": 907,
      "end_line": 914,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 38)",
        "(line 910,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 913,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitize()",
      "begin_line": 917,
      "end_line": 924,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 38)",
        "(line 920,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 927,
      "end_line": 929,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(double[])",
      "begin_line": 932,
      "end_line": 935,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 942,
      "end_line": 944,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 947,
      "end_line": 963,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 950,col 9)-(line 962,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 971,
      "end_line": 974,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(double[])",
      "begin_line": 977,
      "end_line": 989,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 40)",
        "(line 981,col 9)-(line 981,col 34)",
        "(line 982,col 9)-(line 982,col 66)",
        "(line 983,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 992,
      "end_line": 994,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDimension()",
      "begin_line": 997,
      "end_line": 999,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1002,
      "end_line": 1008,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1007,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1015,
      "end_line": 1017,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double)",
      "begin_line": 1020,
      "end_line": 1025,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 57)",
        "(line 1022,col 9)-(line 1022,col 55)",
        "(line 1023,col 9)-(line 1023,col 30)",
        "(line 1024,col 9)-(line 1024,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double[])",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 1033,
      "end_line": 1042,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 53)",
        "(line 1035,col 9)-(line 1040,col 9)",
        "(line 1041,col 9)-(line 1041,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 1045,
      "end_line": 1051,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1050,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1054,
      "end_line": 1068,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1067,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 1071,
      "end_line": 1079,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1073,col 9)-(line 1078,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(int, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1089,
      "end_line": 1092,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(double)",
      "begin_line": 1095,
      "end_line": 1098,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toArray()",
      "begin_line": 1101,
      "end_line": 1104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1103,col 9)-(line 1103,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toString()",
      "begin_line": 1107,
      "end_line": 1110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1118,
      "end_line": 1122,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 1131,
      "end_line": 1139,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isNaN()",
      "begin_line": 1145,
      "end_line": 1152,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isInfinite()",
      "begin_line": 1160,
      "end_line": 1174,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1166,col 9)-(line 1170,col 9)",
        "(line 1172,col 9)-(line 1172,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 1195,
      "end_line": 1222,
      "comment": "\n     * Test for the equality of two real vectors.\n     * \u003cp\u003e\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two real vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the real vector is equal to\n     * a vector with all \u003ccode\u003eDouble.NaN\u003c/code\u003e coordinates.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two vector objects are equal, false if\n     *         object is null, not an instance of RealVector, or\n     *         not equal to this RealVector instance\n     *\n     ",
      "child_ranges": [
        "(line 1198,col 7)-(line 1200,col 7)",
        "(line 1202,col 7)-(line 1204,col 7)",
        "(line 1207,col 7)-(line 1207,col 42)",
        "(line 1208,col 7)-(line 1210,col 7)",
        "(line 1212,col 7)-(line 1214,col 7)",
        "(line 1216,col 7)-(line 1220,col 7)",
        "(line 1221,col 7)-(line 1221,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.hashCode()",
      "begin_line": 1229,
      "end_line": 1235,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1233,col 9)",
        "(line 1234,col 9)-(line 1234,col 36)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 1236,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(ArrayRealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 32)",
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of doubles.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 97,
      "end_line": 106,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Construct a vector from an array.\n     * @param d array of Doubles.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n     * Construct a vector from part of a Double array\n     * @param d array of Doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 32)",
        "(line 146,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, boolean)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Construct a vector from another vector.\n     * @param v vector to copy\n     * @param deep if true perform a deep copy otherwise perform a shallow copy\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 184,
      "end_line": 188,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 59)",
        "(line 186,col 9)-(line 186,col 62)",
        "(line 187,col 9)-(line 187,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 195,
      "end_line": 203,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 38)",
        "(line 197,col 9)-(line 197,col 41)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 210,
      "end_line": 218,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 41)",
        "(line 212,col 9)-(line 212,col 38)",
        "(line 213,col 9)-(line 213,col 35)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, double[])",
      "begin_line": 225,
      "end_line": 231,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 41)",
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 35)",
        "(line 229,col 9)-(line 229,col 50)",
        "(line 230,col 9)-(line 230,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 238,
      "end_line": 244,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 33)",
        "(line 240,col 9)-(line 240,col 41)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 242,col 45)",
        "(line 243,col 9)-(line 243,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 251,
      "end_line": 257,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 33)",
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 45)",
        "(line 256,col 9)-(line 256,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.copy()",
      "begin_line": 260,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 266,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(double[])",
      "begin_line": 284,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 288,col 36)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 307,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(double[])",
      "begin_line": 325,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 40)",
        "(line 329,col 9)-(line 329,col 36)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 348,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 357,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 366,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 375,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf(double)",
      "begin_line": 384,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf()",
      "begin_line": 393,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf()",
      "begin_line": 402,
      "end_line": 408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf()",
      "begin_line": 411,
      "end_line": 417,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf()",
      "begin_line": 420,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf()",
      "begin_line": 429,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf()",
      "begin_line": 438,
      "end_line": 444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf()",
      "begin_line": 447,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf()",
      "begin_line": 456,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf()",
      "begin_line": 465,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf()",
      "begin_line": 474,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf()",
      "begin_line": 483,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf()",
      "begin_line": 492,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf()",
      "begin_line": 501,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf()",
      "begin_line": 510,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf()",
      "begin_line": 519,
      "end_line": 525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf()",
      "begin_line": 528,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf()",
      "begin_line": 537,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf()",
      "begin_line": 546,
      "end_line": 552,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf()",
      "begin_line": 555,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf()",
      "begin_line": 564,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf()",
      "begin_line": 573,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf()",
      "begin_line": 582,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf()",
      "begin_line": 591,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 600,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 602,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(double[])",
      "begin_line": 615,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 40)",
        "(line 619,col 9)-(line 619,col 36)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 632,
      "end_line": 635,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 638,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(double[])",
      "begin_line": 653,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 40)",
        "(line 657,col 9)-(line 657,col 36)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 670,
      "end_line": 673,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getData()",
      "begin_line": 676,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDataRef()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 691,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 694,col 9)-(line 705,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(double[])",
      "begin_line": 709,
      "end_line": 718,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 40)",
        "(line 713,col 9)-(line 713,col 23)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 717,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 726,
      "end_line": 729,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getNorm()",
      "begin_line": 732,
      "end_line": 739,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 23)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 742,
      "end_line": 749,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 23)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 752,
      "end_line": 759,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 23)",
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 762,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 765,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(double[])",
      "begin_line": 779,
      "end_line": 789,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 40)",
        "(line 783,col 9)-(line 783,col 23)",
        "(line 784,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 804,
      "end_line": 807,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 810,
      "end_line": 824,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 9)-(line 823,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(double[])",
      "begin_line": 827,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 40)",
        "(line 831,col 9)-(line 831,col 23)",
        "(line 832,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 852,
      "end_line": 855,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 858,
      "end_line": 872,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 861,col 9)-(line 871,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(double[])",
      "begin_line": 875,
      "end_line": 885,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 40)",
        "(line 879,col 9)-(line 879,col 23)",
        "(line 880,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 900,
      "end_line": 903,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitVector()",
      "begin_line": 906,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 38)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitize()",
      "begin_line": 916,
      "end_line": 923,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 38)",
        "(line 919,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 926,
      "end_line": 928,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(double[])",
      "begin_line": 931,
      "end_line": 934,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 941,
      "end_line": 943,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 946,
      "end_line": 962,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 949,col 9)-(line 961,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 970,
      "end_line": 973,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(double[])",
      "begin_line": 976,
      "end_line": 988,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 40)",
        "(line 980,col 9)-(line 980,col 34)",
        "(line 981,col 9)-(line 981,col 66)",
        "(line 982,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 991,
      "end_line": 993,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDimension()",
      "begin_line": 996,
      "end_line": 998,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1001,
      "end_line": 1007,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1006,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1014,
      "end_line": 1016,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double)",
      "begin_line": 1019,
      "end_line": 1024,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 57)",
        "(line 1021,col 9)-(line 1021,col 55)",
        "(line 1022,col 9)-(line 1022,col 30)",
        "(line 1023,col 9)-(line 1023,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double[])",
      "begin_line": 1027,
      "end_line": 1029,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 1032,
      "end_line": 1041,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 53)",
        "(line 1034,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1040,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 1044,
      "end_line": 1050,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1049,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1053,
      "end_line": 1067,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 1070,
      "end_line": 1078,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1077,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(int, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1088,
      "end_line": 1091,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1090,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(double)",
      "begin_line": 1094,
      "end_line": 1097,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toArray()",
      "begin_line": 1100,
      "end_line": 1103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1102,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toString()",
      "begin_line": 1106,
      "end_line": 1109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1117,
      "end_line": 1121,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 1130,
      "end_line": 1138,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isNaN()",
      "begin_line": 1144,
      "end_line": 1151,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": [
        "(line 1145,col 9)-(line 1149,col 9)",
        "(line 1150,col 9)-(line 1150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isInfinite()",
      "begin_line": 1159,
      "end_line": 1173,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1163,col 9)",
        "(line 1165,col 9)-(line 1169,col 9)",
        "(line 1171,col 9)-(line 1171,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 1194,
      "end_line": 1221,
      "comment": "\n     * Test for the equality of two real vectors.\n     * \u003cp\u003e\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two real vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the real vector is equal to\n     * a vector with all \u003ccode\u003eDouble.NaN\u003c/code\u003e coordinates.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two vector objects are equal, false if\n     *         object is null, not an instance of RealVector, or\n     *         not equal to this RealVector instance\n     *\n     ",
      "child_ranges": [
        "(line 1197,col 7)-(line 1199,col 7)",
        "(line 1201,col 7)-(line 1203,col 7)",
        "(line 1206,col 7)-(line 1206,col 42)",
        "(line 1207,col 7)-(line 1209,col 7)",
        "(line 1211,col 7)-(line 1213,col 7)",
        "(line 1215,col 7)-(line 1219,col 7)",
        "(line 1220,col 7)-(line 1220,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.hashCode()",
      "begin_line": 1228,
      "end_line": 1234,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 36)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealVector",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 1239,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_FITTING_POSITION_AND_SIZE_MESSAGE"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": " Message for non fitting position and size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(ArrayRealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)",
        "(line 75,col 9)-(line 75,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of doubles.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 32)",
        "(line 123,col 9)-(line 123,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Construct a vector from an array.\n     * @param d array of Doubles.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "\n     * Construct a vector from part of a Double array\n     * @param d array of Doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 32)",
        "(line 149,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 44)",
        "(line 160,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, boolean)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Construct a vector from another vector.\n     * @param v vector to copy\n     * @param deep if true perform a deep copy otherwise perform a shallow copy\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 59)",
        "(line 189,col 9)-(line 189,col 62)",
        "(line 190,col 9)-(line 190,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 198,
      "end_line": 206,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 41)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 50)",
        "(line 203,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 213,
      "end_line": 221,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 41)",
        "(line 215,col 9)-(line 215,col 38)",
        "(line 216,col 9)-(line 216,col 35)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, double[])",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 41)",
        "(line 230,col 9)-(line 230,col 33)",
        "(line 231,col 9)-(line 231,col 35)",
        "(line 232,col 9)-(line 232,col 50)",
        "(line 233,col 9)-(line 233,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 33)",
        "(line 243,col 9)-(line 243,col 41)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 246,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 254,
      "end_line": 260,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 33)",
        "(line 256,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 45)",
        "(line 259,col 9)-(line 259,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.copy()",
      "begin_line": 263,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 269,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(double[])",
      "begin_line": 287,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 40)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 310,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(double[])",
      "begin_line": 328,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 40)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 351,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 360,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 369,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 378,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf(double)",
      "begin_line": 387,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf()",
      "begin_line": 396,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf()",
      "begin_line": 405,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf()",
      "begin_line": 414,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf()",
      "begin_line": 423,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf()",
      "begin_line": 432,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf()",
      "begin_line": 441,
      "end_line": 447,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf()",
      "begin_line": 450,
      "end_line": 456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf()",
      "begin_line": 459,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf()",
      "begin_line": 468,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf()",
      "begin_line": 477,
      "end_line": 483,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf()",
      "begin_line": 486,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf()",
      "begin_line": 495,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf()",
      "begin_line": 504,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf()",
      "begin_line": 513,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf()",
      "begin_line": 522,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf()",
      "begin_line": 531,
      "end_line": 537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf()",
      "begin_line": 540,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf()",
      "begin_line": 549,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf()",
      "begin_line": 558,
      "end_line": 564,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf()",
      "begin_line": 567,
      "end_line": 573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf()",
      "begin_line": 576,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf()",
      "begin_line": 585,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf()",
      "begin_line": 594,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 603,
      "end_line": 615,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(double[])",
      "begin_line": 618,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 40)",
        "(line 622,col 9)-(line 622,col 36)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 635,
      "end_line": 638,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 641,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 643,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(double[])",
      "begin_line": 656,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 40)",
        "(line 660,col 9)-(line 660,col 36)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 673,
      "end_line": 676,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getData()",
      "begin_line": 679,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDataRef()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 694,
      "end_line": 709,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 697,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(double[])",
      "begin_line": 712,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 40)",
        "(line 716,col 9)-(line 716,col 23)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 729,
      "end_line": 732,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getNorm()",
      "begin_line": 735,
      "end_line": 742,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 23)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 745,
      "end_line": 752,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 23)",
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 755,
      "end_line": 762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 23)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 765,
      "end_line": 779,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 768,col 9)-(line 778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(double[])",
      "begin_line": 782,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 40)",
        "(line 786,col 9)-(line 786,col 23)",
        "(line 787,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 807,
      "end_line": 810,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 813,
      "end_line": 827,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 816,col 9)-(line 826,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(double[])",
      "begin_line": 830,
      "end_line": 840,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 40)",
        "(line 834,col 9)-(line 834,col 23)",
        "(line 835,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 855,
      "end_line": 858,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 861,
      "end_line": 875,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(double[])",
      "begin_line": 878,
      "end_line": 888,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 40)",
        "(line 882,col 9)-(line 882,col 23)",
        "(line 883,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 903,
      "end_line": 906,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitVector()",
      "begin_line": 909,
      "end_line": 916,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 38)",
        "(line 912,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 915,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitize()",
      "begin_line": 919,
      "end_line": 926,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 38)",
        "(line 922,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 925,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 929,
      "end_line": 931,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(double[])",
      "begin_line": 934,
      "end_line": 937,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 944,
      "end_line": 946,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 949,
      "end_line": 965,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 952,col 9)-(line 964,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 973,
      "end_line": 976,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(double[])",
      "begin_line": 979,
      "end_line": 991,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 40)",
        "(line 983,col 9)-(line 983,col 34)",
        "(line 984,col 9)-(line 984,col 66)",
        "(line 985,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 994,
      "end_line": 996,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDimension()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1004,
      "end_line": 1010,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1009,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double)",
      "begin_line": 1022,
      "end_line": 1027,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 57)",
        "(line 1024,col 9)-(line 1024,col 55)",
        "(line 1025,col 9)-(line 1025,col 30)",
        "(line 1026,col 9)-(line 1026,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double[])",
      "begin_line": 1030,
      "end_line": 1032,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 1035,
      "end_line": 1044,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 53)",
        "(line 1037,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1043,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 1047,
      "end_line": 1053,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1052,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1056,
      "end_line": 1070,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1058,col 9)-(line 1069,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 1073,
      "end_line": 1081,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1080,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(int, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1091,
      "end_line": 1094,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(double)",
      "begin_line": 1097,
      "end_line": 1100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toArray()",
      "begin_line": 1103,
      "end_line": 1106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toString()",
      "begin_line": 1109,
      "end_line": 1112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1120,
      "end_line": 1124,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1123,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 1133,
      "end_line": 1141,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isNaN()",
      "begin_line": 1147,
      "end_line": 1154,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1152,col 9)",
        "(line 1153,col 9)-(line 1153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isInfinite()",
      "begin_line": 1162,
      "end_line": 1176,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1168,col 9)-(line 1172,col 9)",
        "(line 1174,col 9)-(line 1174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 1197,
      "end_line": 1224,
      "comment": "\n     * Test for the equality of two real vectors.\n     * \u003cp\u003e\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two real vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the real vector is equal to\n     * a vector with all \u003ccode\u003eDouble.NaN\u003c/code\u003e coordinates.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two vector objects are equal, false if\n     *         object is null, not an instance of RealVector, or\n     *         not equal to this RealVector instance\n     *\n     ",
      "child_ranges": [
        "(line 1200,col 7)-(line 1202,col 7)",
        "(line 1204,col 7)-(line 1206,col 7)",
        "(line 1209,col 7)-(line 1209,col 42)",
        "(line 1210,col 7)-(line 1212,col 7)",
        "(line 1214,col 7)-(line 1216,col 7)",
        "(line 1218,col 7)-(line 1222,col 7)",
        "(line 1223,col 7)-(line 1223,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.hashCode()",
      "begin_line": 1231,
      "end_line": 1237,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 36)"
      ]
    }
  ]
}
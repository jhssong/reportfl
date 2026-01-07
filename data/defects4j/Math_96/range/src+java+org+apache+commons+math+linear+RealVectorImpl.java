{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/RealVectorImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 1295,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #RealVectorImpl(RealVectorImpl, RealVectorImpl)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(RealVectorImpl)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(int, double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)",
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(double[])",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of doubles.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(double[], boolean)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\n     * Create a new RealVectorImpl using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealVectorImpl and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealVectorImpl(double[])\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(double[], int, int)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 32)",
        "(line 118,col 9)-(line 118,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(java.lang.Double[])",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * Construct a vector from an array.\n     * @param d array of Doubles.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(java.lang.Double[], int, int)",
      "begin_line": 138,
      "end_line": 148,
      "comment": "\n     * Construct a vector from part of a Double array\n     * @param d array of Doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 32)",
        "(line 145,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(org.apache.commons.math.linear.RealVector)",
      "begin_line": 154,
      "end_line": 159,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(org.apache.commons.math.linear.RealVectorImpl, boolean)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Construct a vector from another vector.\n     * @param v vector to copy\n     * @param deep if true perform a deep copy otherwise perform a shallow copy\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.RealVectorImpl(org.apache.commons.math.linear.RealVectorImpl, org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 183,
      "end_line": 187,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 185,col 62)",
        "(line 186,col 9)-(line 186,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.copy()",
      "begin_line": 190,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 195,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.add(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 215,
      "end_line": 223,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 33)",
        "(line 218,col 9)-(line 218,col 47)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 226,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.subtract(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 246,
      "end_line": 254,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 33)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAdd(double)",
      "begin_line": 257,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAddToSelf(double)",
      "begin_line": 266,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSubtract(double)",
      "begin_line": 274,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 47)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSubtractToSelf(double)",
      "begin_line": 283,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapMultiply(double)",
      "begin_line": 291,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 47)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapMultiplyToSelf(double)",
      "begin_line": 300,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapDivide(double)",
      "begin_line": 308,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 47)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapDivideToSelf(double)",
      "begin_line": 317,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapPow(double)",
      "begin_line": 325,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 47)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapPowToSelf(double)",
      "begin_line": 334,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapExp()",
      "begin_line": 342,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 47)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapExpToSelf()",
      "begin_line": 351,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapExpm1()",
      "begin_line": 359,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 47)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapExpm1ToSelf()",
      "begin_line": 368,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapLog()",
      "begin_line": 376,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 47)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapLogToSelf()",
      "begin_line": 385,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapLog10()",
      "begin_line": 393,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 47)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapLog10ToSelf()",
      "begin_line": 402,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapLog1p()",
      "begin_line": 410,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 47)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapLog1pToSelf()",
      "begin_line": 419,
      "end_line": 424,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCosh()",
      "begin_line": 427,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 47)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCoshToSelf()",
      "begin_line": 436,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSinh()",
      "begin_line": 444,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 47)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSinhToSelf()",
      "begin_line": 453,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapTanh()",
      "begin_line": 461,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 47)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapTanhToSelf()",
      "begin_line": 470,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCos()",
      "begin_line": 478,
      "end_line": 484,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 47)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCosToSelf()",
      "begin_line": 487,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSin()",
      "begin_line": 495,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 47)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSinToSelf()",
      "begin_line": 504,
      "end_line": 509,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapTan()",
      "begin_line": 512,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 47)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapTanToSelf()",
      "begin_line": 521,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAcos()",
      "begin_line": 529,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 47)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAcosToSelf()",
      "begin_line": 538,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAsin()",
      "begin_line": 546,
      "end_line": 552,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 47)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAsinToSelf()",
      "begin_line": 555,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAtan()",
      "begin_line": 563,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 47)",
        "(line 565,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAtanToSelf()",
      "begin_line": 572,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapInv()",
      "begin_line": 580,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 47)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapInvToSelf()",
      "begin_line": 589,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAbs()",
      "begin_line": 597,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 47)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapAbsToSelf()",
      "begin_line": 606,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSqrt()",
      "begin_line": 614,
      "end_line": 620,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 47)",
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSqrtToSelf()",
      "begin_line": 623,
      "end_line": 628,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCbrt()",
      "begin_line": 631,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 47)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCbrtToSelf()",
      "begin_line": 640,
      "end_line": 645,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCeil()",
      "begin_line": 648,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 47)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapCeilToSelf()",
      "begin_line": 657,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapFloor()",
      "begin_line": 665,
      "end_line": 671,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 47)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapFloorToSelf()",
      "begin_line": 674,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapRint()",
      "begin_line": 682,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 47)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapRintToSelf()",
      "begin_line": 691,
      "end_line": 696,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSignum()",
      "begin_line": 699,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 47)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapSignumToSelf()",
      "begin_line": 708,
      "end_line": 713,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapUlp()",
      "begin_line": 716,
      "end_line": 722,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 47)",
        "(line 718,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.mapUlpToSelf()",
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
      "signature": "org.apache.commons.math.linear.RealVectorImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 733,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.ebeMultiply(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 753,
      "end_line": 761,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 33)",
        "(line 756,col 9)-(line 756,col 47)",
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 764,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 766,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.ebeDivide(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 784,
      "end_line": 792,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 33)",
        "(line 787,col 9)-(line 787,col 47)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getData()",
      "begin_line": 795,
      "end_line": 797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getDataRef()",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 809,
      "end_line": 821,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 811,col 9)-(line 820,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.dotProduct(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 829,
      "end_line": 837,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 33)",
        "(line 832,col 9)-(line 832,col 23)",
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getNorm()",
      "begin_line": 840,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 23)",
        "(line 842,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getL1Norm()",
      "begin_line": 849,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 23)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getLInfNorm()",
      "begin_line": 858,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 23)",
        "(line 860,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 867,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 879,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getDistance(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 895,
      "end_line": 904,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVectorImpl)\n     * @see #getLInfDistance(RealVectorImpl)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 33)",
        "(line 898,col 9)-(line 898,col 23)",
        "(line 899,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 907,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 909,col 9)-(line 919,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getL1Distance(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 935,
      "end_line": 944,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVectorImpl)\n     * @see #getLInfDistance(RealVectorImpl)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 33)",
        "(line 938,col 9)-(line 938,col 23)",
        "(line 939,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 947,
      "end_line": 960,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 949,col 9)-(line 959,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getLInfDistance(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 975,
      "end_line": 984,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infty;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVectorImpl)\n     * @see #getLInfDistance(RealVectorImpl)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 33)",
        "(line 978,col 9)-(line 978,col 23)",
        "(line 979,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 983,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.unitVector()",
      "begin_line": 987,
      "end_line": 993,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 38)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.unitize()",
      "begin_line": 996,
      "end_line": 1004,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 38)",
        "(line 998,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1003,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.projection(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1021,
      "end_line": 1035,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1034,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.outerProduct(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 1043,
      "end_line": 1053,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 33)",
        "(line 1046,col 9)-(line 1046,col 62)",
        "(line 1047,col 9)-(line 1051,col 9)",
        "(line 1052,col 9)-(line 1052,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getEntry(int)",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.getDimension()",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1066,
      "end_line": 1072,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.append(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.append(double)",
      "begin_line": 1084,
      "end_line": 1089,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 57)",
        "(line 1086,col 9)-(line 1086,col 55)",
        "(line 1087,col 9)-(line 1087,col 30)",
        "(line 1088,col 9)-(line 1088,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.append(double[])",
      "begin_line": 1092,
      "end_line": 1097,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 65)",
        "(line 1094,col 9)-(line 1094,col 55)",
        "(line 1095,col 9)-(line 1095,col 61)",
        "(line 1096,col 9)-(line 1096,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.get(int, int)",
      "begin_line": 1100,
      "end_line": 1109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.set(int, double)",
      "begin_line": 1112,
      "end_line": 1118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.set(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1121,
      "end_line": 1133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.set(int, org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 1143,
      "end_line": 1150,
      "comment": "\n     * Set a set of consecutive elements.\n     * \n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1145,col 9)-(line 1149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.set(double)",
      "begin_line": 1153,
      "end_line": 1155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.toArray()",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.toString()",
      "begin_line": 1163,
      "end_line": 1165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1173,
      "end_line": 1176,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.checkVectorDimensions(int)",
      "begin_line": 1185,
      "end_line": 1191,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     * \n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.isNaN()",
      "begin_line": 1197,
      "end_line": 1204,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.isInfinite()",
      "begin_line": 1212,
      "end_line": 1226,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1216,col 9)",
        "(line 1218,col 9)-(line 1222,col 9)",
        "(line 1224,col 9)-(line 1224,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.equals(java.lang.Object)",
      "begin_line": 1247,
      "end_line": 1281,
      "comment": "\n     * Test for the equality of two real vectors.\n     * \u003cp\u003e\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two real vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the real vector is equal to\n     * a vector with all \u003ccode\u003eDouble.NaN\u003c/code\u003e coordinates.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 3D vector objects are equal, false if\n     *         object is null, not an instance of Vector3D, or\n     *         not equal to this Vector3D instance\n     * \n     ",
      "child_ranges": [
        "(line 1249,col 7)-(line 1251,col 7)",
        "(line 1253,col 7)-(line 1255,col 7)",
        "(line 1257,col 7)-(line 1279,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVectorImpl.hashCode()",
      "begin_line": 1288,
      "end_line": 1293,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1292,col 36)"
      ]
    }
  ]
}
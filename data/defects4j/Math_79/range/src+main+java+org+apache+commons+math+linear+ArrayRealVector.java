{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/ArrayRealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 1411,
      "comment": "\n * This class implements the {@link RealVector} interface with a double array.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayRealVector(ArrayRealVector, ArrayRealVector)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e method ({@link #append(double)}, {@link\n     * #append(double[])}, {@link #append(ArrayRealVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(int, double)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 32)",
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[])",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of doubles.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], boolean)",
      "begin_line": 95,
      "end_line": 104,
      "comment": "\n     * Create a new ArrayRealVector using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * ArrayRealVector and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #ArrayRealVector(double[])\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], int, int)",
      "begin_line": 112,
      "end_line": 120,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[])",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * Construct a vector from an array.\n     * @param d array of Doubles.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(java.lang.Double[], int, int)",
      "begin_line": 139,
      "end_line": 149,
      "comment": "\n     * Construct a vector from part of a Double array\n     * @param d array of Doubles.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 144,col 9)",
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
        "(line 167,col 9)-(line 167,col 30)"
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
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector, double[])",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 54)",
        "(line 197,col 9)-(line 197,col 62)",
        "(line 198,col 9)-(line 198,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 54)",
        "(line 208,col 9)-(line 208,col 52)",
        "(line 209,col 9)-(line 209,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ArrayRealVector(double[], double[])",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 49)",
        "(line 219,col 9)-(line 219,col 52)",
        "(line 220,col 9)-(line 220,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.copy()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 229,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(double[])",
      "begin_line": 244,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 40)",
        "(line 247,col 9)-(line 247,col 47)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.add(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 266,
      "end_line": 278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(double[])",
      "begin_line": 281,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 40)",
        "(line 284,col 9)-(line 284,col 47)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.subtract(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAdd(double)",
      "begin_line": 303,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 47)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAddToSelf(double)",
      "begin_line": 312,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtract(double)",
      "begin_line": 320,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 47)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSubtractToSelf(double)",
      "begin_line": 329,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiply(double)",
      "begin_line": 337,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 47)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapMultiplyToSelf(double)",
      "begin_line": 346,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivide(double)",
      "begin_line": 354,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapDivideToSelf(double)",
      "begin_line": 363,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapPow(double)",
      "begin_line": 371,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 47)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapPowToSelf(double)",
      "begin_line": 380,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExp()",
      "begin_line": 388,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 47)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpToSelf()",
      "begin_line": 397,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpm1()",
      "begin_line": 405,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 47)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapExpm1ToSelf()",
      "begin_line": 414,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog()",
      "begin_line": 422,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 47)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLogToSelf()",
      "begin_line": 431,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog10()",
      "begin_line": 439,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 47)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog10ToSelf()",
      "begin_line": 448,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog1p()",
      "begin_line": 456,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 47)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapLog1pToSelf()",
      "begin_line": 465,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCosh()",
      "begin_line": 473,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 47)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCoshToSelf()",
      "begin_line": 482,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinh()",
      "begin_line": 490,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 47)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinhToSelf()",
      "begin_line": 499,
      "end_line": 504,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanh()",
      "begin_line": 507,
      "end_line": 513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 47)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanhToSelf()",
      "begin_line": 516,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCos()",
      "begin_line": 524,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 47)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCosToSelf()",
      "begin_line": 533,
      "end_line": 538,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSin()",
      "begin_line": 541,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 47)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSinToSelf()",
      "begin_line": 550,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTan()",
      "begin_line": 558,
      "end_line": 564,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 47)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapTanToSelf()",
      "begin_line": 567,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAcos()",
      "begin_line": 575,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 47)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAcosToSelf()",
      "begin_line": 584,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAsin()",
      "begin_line": 592,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAsinToSelf()",
      "begin_line": 601,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAtan()",
      "begin_line": 609,
      "end_line": 615,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 47)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAtanToSelf()",
      "begin_line": 618,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapInv()",
      "begin_line": 626,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 47)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapInvToSelf()",
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
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAbs()",
      "begin_line": 643,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 47)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapAbsToSelf()",
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
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSqrt()",
      "begin_line": 660,
      "end_line": 666,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 47)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSqrtToSelf()",
      "begin_line": 669,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCbrt()",
      "begin_line": 677,
      "end_line": 683,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 47)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCbrtToSelf()",
      "begin_line": 686,
      "end_line": 691,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCeil()",
      "begin_line": 694,
      "end_line": 700,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 47)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapCeilToSelf()",
      "begin_line": 703,
      "end_line": 708,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 704,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapFloor()",
      "begin_line": 711,
      "end_line": 717,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 47)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 716,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapFloorToSelf()",
      "begin_line": 720,
      "end_line": 725,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapRint()",
      "begin_line": 728,
      "end_line": 734,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 47)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapRintToSelf()",
      "begin_line": 737,
      "end_line": 742,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSignum()",
      "begin_line": 745,
      "end_line": 751,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 47)",
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapSignumToSelf()",
      "begin_line": 754,
      "end_line": 759,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapUlp()",
      "begin_line": 762,
      "end_line": 768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 47)",
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.mapUlpToSelf()",
      "begin_line": 771,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 779,
      "end_line": 791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(double[])",
      "begin_line": 794,
      "end_line": 802,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 40)",
        "(line 797,col 9)-(line 797,col 47)",
        "(line 798,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeMultiply(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 810,
      "end_line": 813,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 816,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 818,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(double[])",
      "begin_line": 831,
      "end_line": 839,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 40)",
        "(line 834,col 9)-(line 834,col 47)",
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.ebeDivide(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 847,
      "end_line": 850,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getData()",
      "begin_line": 853,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDataRef()",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 867,
      "end_line": 879,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(double[])",
      "begin_line": 882,
      "end_line": 890,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 40)",
        "(line 885,col 9)-(line 885,col 23)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.dotProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 898,
      "end_line": 901,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getNorm()",
      "begin_line": 904,
      "end_line": 910,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 23)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Norm()",
      "begin_line": 913,
      "end_line": 919,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 23)",
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfNorm()",
      "begin_line": 922,
      "end_line": 928,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 23)",
        "(line 924,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 931,
      "end_line": 944,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 933,col 9)-(line 943,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(double[])",
      "begin_line": 947,
      "end_line": 956,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 40)",
        "(line 950,col 9)-(line 950,col 23)",
        "(line 951,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 971,
      "end_line": 974,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 977,
      "end_line": 990,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 979,col 9)-(line 989,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(double[])",
      "begin_line": 993,
      "end_line": 1002,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 40)",
        "(line 996,col 9)-(line 996,col 23)",
        "(line 997,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1001,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getL1Distance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1017,
      "end_line": 1020,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1023,
      "end_line": 1036,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1035,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(double[])",
      "begin_line": 1039,
      "end_line": 1048,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 40)",
        "(line 1042,col 9)-(line 1042,col 23)",
        "(line 1043,col 9)-(line 1046,col 9)",
        "(line 1047,col 9)-(line 1047,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getLInfDistance(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1063,
      "end_line": 1066,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(ArrayRealVector)\n     * @see #getLInfDistance(ArrayRealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitVector()",
      "begin_line": 1069,
      "end_line": 1075,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1070,col 9)-(line 1070,col 38)",
        "(line 1071,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.unitize()",
      "begin_line": 1078,
      "end_line": 1086,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 38)",
        "(line 1080,col 9)-(line 1082,col 9)",
        "(line 1083,col 9)-(line 1085,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1089,
      "end_line": 1091,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1090,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(double[])",
      "begin_line": 1094,
      "end_line": 1096,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.projection(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1103,
      "end_line": 1105,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1108,
      "end_line": 1123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1131,
      "end_line": 1134,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.outerProduct(double[])",
      "begin_line": 1137,
      "end_line": 1148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 40)",
        "(line 1140,col 9)-(line 1140,col 34)",
        "(line 1141,col 9)-(line 1141,col 66)",
        "(line 1142,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getEntry(int)",
      "begin_line": 1151,
      "end_line": 1153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getDimension()",
      "begin_line": 1156,
      "end_line": 1158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1157,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1161,
      "end_line": 1167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double)",
      "begin_line": 1179,
      "end_line": 1184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 57)",
        "(line 1181,col 9)-(line 1181,col 55)",
        "(line 1182,col 9)-(line 1182,col 30)",
        "(line 1183,col 9)-(line 1183,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.append(double[])",
      "begin_line": 1187,
      "end_line": 1189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.getSubVector(int, int)",
      "begin_line": 1192,
      "end_line": 1201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1193,col 9)-(line 1193,col 53)",
        "(line 1194,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1200,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setEntry(int, double)",
      "begin_line": 1204,
      "end_line": 1210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1213,
      "end_line": 1226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.setSubVector(int, double[])",
      "begin_line": 1229,
      "end_line": 1236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(int, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1246,
      "end_line": 1249,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1248,col 9)-(line 1248,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.set(double)",
      "begin_line": 1252,
      "end_line": 1254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toArray()",
      "begin_line": 1257,
      "end_line": 1259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.toString()",
      "begin_line": 1262,
      "end_line": 1265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(org.apache.commons.math.linear.RealVector)",
      "begin_line": 1273,
      "end_line": 1276,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkVectorDimensions(int)",
      "begin_line": 1285,
      "end_line": 1292,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isNaN()",
      "begin_line": 1298,
      "end_line": 1305,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": [
        "(line 1299,col 9)-(line 1303,col 9)",
        "(line 1304,col 9)-(line 1304,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.isInfinite()",
      "begin_line": 1313,
      "end_line": 1327,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1319,col 9)-(line 1323,col 9)",
        "(line 1325,col 9)-(line 1325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.equals(java.lang.Object)",
      "begin_line": 1348,
      "end_line": 1382,
      "comment": "\n     * Test for the equality of two real vectors.\n     * \u003cp\u003e\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two real vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the real vector is equal to\n     * a vector with all \u003ccode\u003eDouble.NaN\u003c/code\u003e coordinates.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two vector objects are equal, false if\n     *         object is null, not an instance of RealVector, or\n     *         not equal to this RealVector instance\n     *\n     ",
      "child_ranges": [
        "(line 1351,col 7)-(line 1353,col 7)",
        "(line 1355,col 7)-(line 1357,col 7)",
        "(line 1359,col 7)-(line 1380,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.hashCode()",
      "begin_line": 1389,
      "end_line": 1395,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1393,col 9)",
        "(line 1394,col 9)-(line 1394,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVector.checkIndex(int)",
      "begin_line": 1402,
      "end_line": 1409,
      "comment": "\n     * Check if an index is valid.\n     * @param index index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1404,col 9)-(line 1408,col 9)"
      ]
    }
  ]
}
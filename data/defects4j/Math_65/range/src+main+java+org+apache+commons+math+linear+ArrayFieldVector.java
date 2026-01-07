{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/linear/ArrayFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 802,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
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
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e methods ({@link #append(FieldElement[])},\n     * {@link #add(FieldVector)}, {@link #append(ArrayFieldVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param field field to which the elements belong\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 27)",
        "(line 66,col 9)-(line 66,col 32)",
        "(line 67,col 9)-(line 67,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(int, T)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 77,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[])",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of Ts.\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], boolean)",
      "begin_line": 110,
      "end_line": 119,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #ArrayFieldVector(FieldElement[])\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], int, int)",
      "begin_line": 127,
      "end_line": 136,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of Ts.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 135,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 29)",
        "(line 156,col 9)-(line 156,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Construct a vector from another vector.\n     * @param v vector to copy\n     * @param deep if true perform a deep copy otherwise perform a shallow copy\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 29)",
        "(line 166,col 9)-(line 166,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)",
        "(line 176,col 9)-(line 176,col 59)",
        "(line 177,col 9)-(line 177,col 62)",
        "(line 178,col 9)-(line 178,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 186,
      "end_line": 191,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 30)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 189,col 62)",
        "(line 190,col 9)-(line 190,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 30)",
        "(line 200,col 9)-(line 200,col 54)",
        "(line 201,col 9)-(line 201,col 52)",
        "(line 202,col 9)-(line 202,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 211,
      "end_line": 221,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     * @exception IllegalArgumentException if both vectors are empty\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.buildArray(int)",
      "begin_line": 227,
      "end_line": 230,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getField()",
      "begin_line": 233,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.copy()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 243,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(T[])",
      "begin_line": 257,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 40)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 278,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(T[])",
      "begin_line": 292,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 40)",
        "(line 294,col 9)-(line 294,col 42)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 313,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 42)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 322,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 330,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 42)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 339,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 347,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 356,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 364,
      "end_line": 370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 42)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 373,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInv()",
      "begin_line": 381,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 42)",
        "(line 383,col 9)-(line 383,col 37)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 391,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 37)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 400,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(T[])",
      "begin_line": 415,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 40)",
        "(line 418,col 9)-(line 418,col 42)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 437,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 439,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(T[])",
      "begin_line": 452,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 40)",
        "(line 455,col 9)-(line 455,col 42)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 468,
      "end_line": 471,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getData()",
      "begin_line": 474,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 488,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(T[])",
      "begin_line": 503,
      "end_line": 511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 40)",
        "(line 506,col 9)-(line 506,col 32)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 519,
      "end_line": 522,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 525,
      "end_line": 527,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(T[])",
      "begin_line": 530,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 539,
      "end_line": 541,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 544,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(T[])",
      "begin_line": 573,
      "end_line": 584,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 40)",
        "(line 576,col 9)-(line 576,col 34)",
        "(line 577,col 9)-(line 577,col 77)",
        "(line 578,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 587,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDimension()",
      "begin_line": 592,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 597,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T)",
      "begin_line": 615,
      "end_line": 620,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 52)",
        "(line 617,col 9)-(line 617,col 55)",
        "(line 618,col 9)-(line 618,col 30)",
        "(line 619,col 9)-(line 619,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T[])",
      "begin_line": 623,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 628,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 68)",
        "(line 630,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 640,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 649,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 650,col 9)-(line 661,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, T[])",
      "begin_line": 665,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 666,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(int, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 682,
      "end_line": 685,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(T)",
      "begin_line": 688,
      "end_line": 690,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.toArray()",
      "begin_line": 693,
      "end_line": 695,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 703,
      "end_line": 706,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 715,
      "end_line": 722,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 721,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 743,
      "end_line": 773,
      "comment": "\n     * Test for the equality of two real vectors.\n     * \u003cp\u003e\n     * If all coordinates of two real vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two real vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * real vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the real vector is equal to\n     * a vector with all \u003ccode\u003eDouble.NaN\u003c/code\u003e coordinates.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 3D vector objects are equal, false if\n     *         object is null, not an instance of Vector3D, or\n     *         not equal to this Vector3D instance\n     *\n     ",
      "child_ranges": [
        "(line 746,col 7)-(line 748,col 7)",
        "(line 750,col 7)-(line 752,col 7)",
        "(line 754,col 7)-(line 771,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.hashCode()",
      "begin_line": 780,
      "end_line": 787,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 21)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 794,
      "end_line": 800,
      "comment": "\n     * Check if an index is valid.\n     * @param index index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 799,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/ArrayFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 803,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "data"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * \u003cp\u003eZero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor\n     * or one of the \u003ccode\u003eappend\u003c/code\u003e methods ({@link #append(FieldElement[])},\n     * {@link #add(FieldVector)}, {@link #append(ArrayFieldVector)}) to gather data\n     * into this vector.\u003c/p\u003e\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Construct a (size)-length vector of zeros.\n     * @param field field to which the elements belong\n     * @param size size of the vector\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 27)",
        "(line 65,col 9)-(line 65,col 32)",
        "(line 66,col 9)-(line 66,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(int, T)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Construct an (size)-length vector with preset values.\n     * @param size size of the vector\n     * @param preset fill the vector with this scalar value\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[])",
      "begin_line": 84,
      "end_line": 93,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * @param d array of Ts.\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], boolean)",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new vector\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #ArrayFieldVector(FieldElement[])\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], int, int)",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\n     * Construct a vector from part of a array.\n     * @param d array of Ts.\n     * @param pos position of first entry\n     * @param size number of entries to copy\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 29)",
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     * @param v vector to copy\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 29)",
        "(line 155,col 9)-(line 155,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Construct a vector from another vector.\n     * @param v vector to copy\n     * @param deep if true perform a deep copy otherwise perform a shallow copy\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 165,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 30)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 176,col 62)",
        "(line 177,col 9)-(line 177,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 30)",
        "(line 187,col 9)-(line 187,col 54)",
        "(line 188,col 9)-(line 188,col 62)",
        "(line 189,col 9)-(line 189,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 30)",
        "(line 199,col 9)-(line 199,col 54)",
        "(line 200,col 9)-(line 200,col 52)",
        "(line 201,col 9)-(line 201,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 210,
      "end_line": 220,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * @param v1 first vector (will be put in front of the new vector)\n     * @param v2 second vector (will be put at back of the new vector)\n     * @exception IllegalArgumentException if both vectors are empty\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.buildArray(int)",
      "begin_line": 226,
      "end_line": 229,
      "comment": " Build an array of elements.\n     * @param length size of the array to build\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getField()",
      "begin_line": 232,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.copy()",
      "begin_line": 237,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 242,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(T[])",
      "begin_line": 256,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 40)",
        "(line 258,col 9)-(line 258,col 42)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 277,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(T[])",
      "begin_line": 291,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 40)",
        "(line 293,col 9)-(line 293,col 42)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 312,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 321,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 329,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 42)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 338,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 346,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 42)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 355,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 363,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 42)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 372,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInv()",
      "begin_line": 380,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 42)",
        "(line 382,col 9)-(line 382,col 37)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 390,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 37)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 399,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(T[])",
      "begin_line": 414,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 40)",
        "(line 417,col 9)-(line 417,col 42)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 436,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 438,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(T[])",
      "begin_line": 451,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 40)",
        "(line 454,col 9)-(line 454,col 42)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 467,
      "end_line": 470,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getData()",
      "begin_line": 473,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 487,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(T[])",
      "begin_line": 502,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 40)",
        "(line 505,col 9)-(line 505,col 32)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 518,
      "end_line": 521,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 524,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(T[])",
      "begin_line": 529,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 538,
      "end_line": 540,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 543,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 545,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 566,
      "end_line": 569,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(T[])",
      "begin_line": 572,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 40)",
        "(line 575,col 9)-(line 575,col 34)",
        "(line 576,col 9)-(line 576,col 77)",
        "(line 577,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 586,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDimension()",
      "begin_line": 591,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 596,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 597,col 9)-(line 601,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T)",
      "begin_line": 614,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 52)",
        "(line 616,col 9)-(line 616,col 55)",
        "(line 617,col 9)-(line 617,col 30)",
        "(line 618,col 9)-(line 618,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T[])",
      "begin_line": 622,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 627,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 68)",
        "(line 629,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 639,
      "end_line": 645,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 644,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 648,
      "end_line": 661,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, T[])",
      "begin_line": 664,
      "end_line": 671,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 665,col 9)-(line 670,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(int, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 681,
      "end_line": 684,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(T)",
      "begin_line": 687,
      "end_line": 689,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.toArray()",
      "begin_line": 692,
      "end_line": 694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 702,
      "end_line": 705,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 714,
      "end_line": 721,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n expected dimension.\n     * @exception IllegalArgumentException if the dimension is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 742,
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
      "end_line": 801,
      "comment": "\n     * Check if an index is valid.\n     * @param index index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 800,col 9)"
      ]
    }
  ]
}
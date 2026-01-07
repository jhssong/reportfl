{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/linear/ArrayFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 879,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
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
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor\n     * or one of the {@code append} methods ({@link #add(FieldVector)} or\n     * {@link #append(ArrayFieldVector)}) to gather data into this vector.\n     *\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 32)",
        "(line 71,col 9)-(line 71,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(int, T)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Construct a vector with preset values.\n     *\n     * @param size Size of the vector.\n     * @param preset All entries will be set with this value.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[])",
      "begin_line": 97,
      "end_line": 107,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[])} constructor.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(Field, FieldElement[])\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[])\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], boolean)",
      "begin_line": 146,
      "end_line": 155,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], boolean)}\n     * constructor.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(FieldElement[])\n     * @see #ArrayFieldVector(Field, FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 32)",
        "(line 154,col 9)-(line 154,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], boolean)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 27)",
        "(line 177,col 9)-(line 177,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], int, int)",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 198,col 32)",
        "(line 199,col 9)-(line 199,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], int, int)",
      "begin_line": 213,
      "end_line": 223,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 27)",
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 222,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 231,
      "end_line": 240,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 29)",
        "(line 236,col 9)-(line 236,col 44)",
        "(line 237,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 29)",
        "(line 253,col 9)-(line 253,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 264,
      "end_line": 270,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform\n     * a shallow copy\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 29)",
        "(line 269,col 9)-(line 269,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 280,
      "end_line": 289,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 30)",
        "(line 286,col 9)-(line 286,col 59)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 288,col 9)-(line 288,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 299,
      "end_line": 308,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 30)",
        "(line 305,col 9)-(line 305,col 54)",
        "(line 306,col 9)-(line 306,col 62)",
        "(line 307,col 9)-(line 307,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 318,
      "end_line": 327,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 30)",
        "(line 324,col 9)-(line 324,col 54)",
        "(line 325,col 9)-(line 325,col 52)",
        "(line 326,col 9)-(line 326,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 344,
      "end_line": 356,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * This constructor needs at least one non-empty array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}\n     * constructor.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 353,col 52)",
        "(line 354,col 9)-(line 354,col 60)",
        "(line 355,col 9)-(line 355,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], T[])",
      "begin_line": 369,
      "end_line": 377,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param field Field to which the elements belong.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 49)",
        "(line 374,col 9)-(line 374,col 52)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 376,col 9)-(line 376,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.buildArray(int)",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getField()",
      "begin_line": 391,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.copy()",
      "begin_line": 396,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 401,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 420,
      "end_line": 427,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 45)",
        "(line 422,col 9)-(line 422,col 42)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 430,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 431,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 449,
      "end_line": 456,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 45)",
        "(line 451,col 9)-(line 451,col 42)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 459,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 42)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 468,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 476,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 42)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 485,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 493,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 42)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 502,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 510,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 42)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 519,
      "end_line": 524,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInv()",
      "begin_line": 527,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 42)",
        "(line 529,col 9)-(line 529,col 37)",
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 537,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 37)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 546,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 565,
      "end_line": 572,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 45)",
        "(line 567,col 9)-(line 567,col 42)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 575,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 594,
      "end_line": 601,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 45)",
        "(line 596,col 9)-(line 596,col 42)",
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getData()",
      "begin_line": 604,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 618,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 619,col 9)-(line 628,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 637,
      "end_line": 644,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 45)",
        "(line 639,col 9)-(line 639,col 32)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 647,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 656,
      "end_line": 658,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 661,
      "end_line": 675,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 674,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 683,
      "end_line": 693,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 34)",
        "(line 685,col 9)-(line 685,col 36)",
        "(line 686,col 9)-(line 686,col 77)",
        "(line 687,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 696,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDimension()",
      "begin_line": 701,
      "end_line": 703,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 706,
      "end_line": 712,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 707,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(T)",
      "begin_line": 724,
      "end_line": 729,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 52)",
        "(line 726,col 9)-(line 726,col 55)",
        "(line 727,col 9)-(line 727,col 30)",
        "(line 728,col 9)-(line 728,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 732,
      "end_line": 741,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 68)",
        "(line 734,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 744,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 745,col 9)-(line 749,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 753,
      "end_line": 766,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(int, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 776,
      "end_line": 783,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 782,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(T)",
      "begin_line": 786,
      "end_line": 788,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.toArray()",
      "begin_line": 791,
      "end_line": 793,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 812,
      "end_line": 816,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws OutOfRangeException if the dimension is\n     * inconsistent with this vector size.\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 825,
      "end_line": 851,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 832,col 9)",
        "(line 834,col 9)-(line 850,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.hashCode()",
      "begin_line": 858,
      "end_line": 865,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 21)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 873,
      "end_line": 878,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 877,col 9)"
      ]
    }
  ]
}
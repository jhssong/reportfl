{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/linear/ArrayFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 942,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
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
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor\n     * or one of the {@code append} methods ({@link #add(FieldVector)} or\n     * {@link #append(ArrayFieldVector)}) to gather data into this vector.\n     *\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 27)",
        "(line 72,col 9)-(line 72,col 32)",
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(int, T)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Construct a vector with preset values.\n     *\n     * @param size Size of the vector.\n     * @param preset All entries will be set with this value.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 38)",
        "(line 84,col 9)-(line 84,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[])",
      "begin_line": 99,
      "end_line": 110,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[])} constructor.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(Field, FieldElement[])\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[])\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 126,col 9)-(line 126,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], boolean)",
      "begin_line": 150,
      "end_line": 160,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], boolean)}\n     * constructor.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(FieldElement[])\n     * @see #ArrayFieldVector(Field, FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 32)",
        "(line 159,col 9)-(line 159,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], boolean)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 27)",
        "(line 183,col 9)-(line 183,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], int, int)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 32)",
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 206,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], int, int)",
      "begin_line": 220,
      "end_line": 231,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 229,col 32)",
        "(line 230,col 9)-(line 230,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 239,
      "end_line": 249,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 29)",
        "(line 245,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 257,
      "end_line": 264,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 29)",
        "(line 263,col 9)-(line 263,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 274,
      "end_line": 281,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform\n     * a shallow copy\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 29)",
        "(line 280,col 9)-(line 280,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 291,
      "end_line": 300,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 30)",
        "(line 297,col 9)-(line 297,col 59)",
        "(line 298,col 9)-(line 298,col 62)",
        "(line 299,col 9)-(line 299,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 310,
      "end_line": 319,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 30)",
        "(line 316,col 9)-(line 316,col 54)",
        "(line 317,col 9)-(line 317,col 62)",
        "(line 318,col 9)-(line 318,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 329,
      "end_line": 338,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 30)",
        "(line 335,col 9)-(line 335,col 54)",
        "(line 336,col 9)-(line 336,col 52)",
        "(line 337,col 9)-(line 337,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 355,
      "end_line": 367,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * This constructor needs at least one non-empty array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}\n     * constructor.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 49)",
        "(line 364,col 9)-(line 364,col 52)",
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 366,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], T[])",
      "begin_line": 380,
      "end_line": 392,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param field Field to which the elements belong.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 49)",
        "(line 389,col 9)-(line 389,col 52)",
        "(line 390,col 9)-(line 390,col 60)",
        "(line 391,col 9)-(line 391,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.buildArray(int)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getField()",
      "begin_line": 406,
      "end_line": 408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.copy()",
      "begin_line": 411,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 416,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 437,
      "end_line": 445,
      "comment": "\n     * Compute the sum of {@code this} and {@code v}.\n     * @param v vector to be added\n     * @return {@code this + v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 45)",
        "(line 440,col 9)-(line 440,col 42)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 448,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 469,
      "end_line": 477,
      "comment": "\n     * Compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 45)",
        "(line 472,col 9)-(line 472,col 42)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 480,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 42)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 489,
      "end_line": 494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 497,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 42)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 506,
      "end_line": 511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 514,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 42)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 523,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 531,
      "end_line": 541,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 42)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 544,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInv()",
      "begin_line": 556,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 42)",
        "(line 558,col 9)-(line 558,col 37)",
        "(line 559,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 570,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 37)",
        "(line 572,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 583,
      "end_line": 595,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 604,
      "end_line": 612,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing {@code this[i] * v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 45)",
        "(line 607,col 9)-(line 607,col 42)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 615,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 617,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 641,
      "end_line": 653,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if one entry of {@code v} is zero.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 45)",
        "(line 644,col 9)-(line 644,col 42)",
        "(line 645,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getData()",
      "begin_line": 656,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 665,
      "end_line": 667,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 670,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 672,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 691,
      "end_line": 699,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product of {@code this} and {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 45)",
        "(line 694,col 9)-(line 694,col 32)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 702,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 714,
      "end_line": 717,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which {@code this} must be projected\n     * @return projection of {@code this} onto {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if {@code v} is the null vector.\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 720,
      "end_line": 734,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 733,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 741,
      "end_line": 751,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 34)",
        "(line 743,col 9)-(line 743,col 36)",
        "(line 744,col 9)-(line 744,col 77)",
        "(line 745,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 754,
      "end_line": 756,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDimension()",
      "begin_line": 759,
      "end_line": 761,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 764,
      "end_line": 770,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 765,col 9)-(line 769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 777,
      "end_line": 779,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(T)",
      "begin_line": 782,
      "end_line": 787,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 52)",
        "(line 784,col 9)-(line 784,col 55)",
        "(line 785,col 9)-(line 785,col 30)",
        "(line 786,col 9)-(line 786,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 790,
      "end_line": 803,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 68)",
        "(line 796,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 806,
      "end_line": 812,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 807,col 9)-(line 811,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 815,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 816,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(int, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 837,
      "end_line": 844,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is invalid.\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 843,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(T)",
      "begin_line": 847,
      "end_line": 849,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.toArray()",
      "begin_line": 852,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 862,
      "end_line": 865,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception DimensionMismatchException if the vectors do not\n     * have the same dimensions\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 874,
      "end_line": 879,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is not equal to the\n     * size of {@code this} vector.\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 888,
      "end_line": 914,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 895,col 9)",
        "(line 897,col 9)-(line 913,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.hashCode()",
      "begin_line": 921,
      "end_line": 928,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 21)",
        "(line 924,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 936,
      "end_line": 941,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 940,col 9)"
      ]
    }
  ]
}
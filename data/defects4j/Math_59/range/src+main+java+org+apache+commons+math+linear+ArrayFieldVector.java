{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/linear/ArrayFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 900,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "begin_line": 42,
      "end_line": 42,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialized construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor\n     * or one of the {@code append} methods ({@link #append(FieldElement[])},\n     * {@link #add(FieldVector)}, {@link #append(ArrayFieldVector)}) to gather data\n     * into this vector.\n     *\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 32)",
        "(line 70,col 9)-(line 70,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(int, T)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Construct a vector with preset values.\n     *\n     * @param size Size of the vector.\n     * @param preset All entries will be set with this value.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 38)",
        "(line 81,col 9)-(line 81,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[])",
      "begin_line": 96,
      "end_line": 106,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[])} constructor.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(Field, FieldElement[])\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[])",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[])\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 121,col 9)-(line 121,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], boolean)",
      "begin_line": 145,
      "end_line": 154,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], boolean)}\n     * constructor.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(FieldElement[])\n     * @see #ArrayFieldVector(Field, FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 32)",
        "(line 153,col 9)-(line 153,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[], boolean)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 176,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], int, int)",
      "begin_line": 189,
      "end_line": 199,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 32)",
        "(line 197,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 198,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 207,
      "end_line": 216,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 29)",
        "(line 212,col 9)-(line 212,col 44)",
        "(line 213,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 29)",
        "(line 229,col 9)-(line 229,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform\n     * a shallow copy\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 29)",
        "(line 245,col 9)-(line 245,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 256,
      "end_line": 265,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 59)",
        "(line 263,col 9)-(line 263,col 62)",
        "(line 264,col 9)-(line 264,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 275,
      "end_line": 284,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 281,col 54)",
        "(line 282,col 9)-(line 282,col 62)",
        "(line 283,col 9)-(line 283,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 294,
      "end_line": 303,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 30)",
        "(line 300,col 9)-(line 300,col 54)",
        "(line 301,col 9)-(line 301,col 52)",
        "(line 302,col 9)-(line 302,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 320,
      "end_line": 332,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * This constructor needs at least one non-empty array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}\n     * constructor.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 49)",
        "(line 329,col 9)-(line 329,col 52)",
        "(line 330,col 9)-(line 330,col 60)",
        "(line 331,col 9)-(line 331,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[], T[])",
      "begin_line": 345,
      "end_line": 353,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param field Field to which the elements belong.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 52)",
        "(line 351,col 9)-(line 351,col 60)",
        "(line 352,col 9)-(line 352,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.buildArray(int)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getField()",
      "begin_line": 367,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.copy()",
      "begin_line": 372,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 377,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(T[])",
      "begin_line": 391,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 393,col 42)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 411,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 421,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(T[])",
      "begin_line": 425,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 40)",
        "(line 427,col 9)-(line 427,col 42)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 445,
      "end_line": 451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 454,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 462,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 42)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 471,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 479,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 42)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 488,
      "end_line": 493,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 496,
      "end_line": 502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 42)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 505,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInv()",
      "begin_line": 513,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 42)",
        "(line 515,col 9)-(line 515,col 37)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 523,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 37)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 532,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 533,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(T[])",
      "begin_line": 546,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 40)",
        "(line 548,col 9)-(line 548,col 42)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 566,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(T[])",
      "begin_line": 580,
      "end_line": 587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 40)",
        "(line 582,col 9)-(line 582,col 42)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getData()",
      "begin_line": 600,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 614,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 624,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(T[])",
      "begin_line": 628,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 40)",
        "(line 630,col 9)-(line 630,col 32)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 648,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(T[])",
      "begin_line": 653,
      "end_line": 655,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 662,
      "end_line": 664,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 667,
      "end_line": 681,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 668,col 9)-(line 680,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(T[])",
      "begin_line": 694,
      "end_line": 704,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 40)",
        "(line 696,col 9)-(line 696,col 34)",
        "(line 697,col 9)-(line 697,col 77)",
        "(line 698,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 707,
      "end_line": 709,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDimension()",
      "begin_line": 712,
      "end_line": 714,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 717,
      "end_line": 723,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 718,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T)",
      "begin_line": 735,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 52)",
        "(line 737,col 9)-(line 737,col 55)",
        "(line 738,col 9)-(line 738,col 30)",
        "(line 739,col 9)-(line 739,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T[])",
      "begin_line": 743,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 748,
      "end_line": 757,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 68)",
        "(line 750,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 760,
      "end_line": 766,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 761,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 769,
      "end_line": 782,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 770,col 9)-(line 781,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, T[])",
      "begin_line": 785,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 786,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(int, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(T)",
      "begin_line": 807,
      "end_line": 809,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.toArray()",
      "begin_line": 812,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 833,
      "end_line": 837,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws OutOfRangeException if the dimension is\n     * inconsistent with this vector size.\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 846,
      "end_line": 872,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 855,col 9)-(line 871,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.hashCode()",
      "begin_line": 879,
      "end_line": 886,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 21)",
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 894,
      "end_line": 899,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 898,col 9)"
      ]
    }
  ]
}
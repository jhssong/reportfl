{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/linear/ArrayFieldVector.java",
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
      "end_line": 923,
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
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[], int, int)",
      "begin_line": 212,
      "end_line": 222,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 27)",
        "(line 220,col 9)-(line 220,col 32)",
        "(line 221,col 9)-(line 221,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 230,
      "end_line": 239,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 235,col 9)-(line 235,col 44)",
        "(line 236,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform\n     * a shallow copy\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 29)",
        "(line 268,col 9)-(line 268,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 279,
      "end_line": 288,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 30)",
        "(line 285,col 9)-(line 285,col 59)",
        "(line 286,col 9)-(line 286,col 62)",
        "(line 287,col 9)-(line 287,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 298,
      "end_line": 307,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 30)",
        "(line 304,col 9)-(line 304,col 54)",
        "(line 305,col 9)-(line 305,col 62)",
        "(line 306,col 9)-(line 306,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 317,
      "end_line": 326,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 30)",
        "(line 323,col 9)-(line 323,col 54)",
        "(line 324,col 9)-(line 324,col 52)",
        "(line 325,col 9)-(line 325,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 343,
      "end_line": 355,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * This constructor needs at least one non-empty array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}\n     * constructor.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 49)",
        "(line 352,col 9)-(line 352,col 52)",
        "(line 353,col 9)-(line 353,col 60)",
        "(line 354,col 9)-(line 354,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[], T[])",
      "begin_line": 368,
      "end_line": 376,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param field Field to which the elements belong.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 49)",
        "(line 373,col 9)-(line 373,col 52)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 375,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.buildArray(int)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getField()",
      "begin_line": 390,
      "end_line": 392,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.copy()",
      "begin_line": 395,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 400,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(T[])",
      "begin_line": 414,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 40)",
        "(line 416,col 9)-(line 416,col 42)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.add(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 434,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(T[])",
      "begin_line": 448,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 40)",
        "(line 450,col 9)-(line 450,col 42)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.subtract(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 468,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 42)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 477,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 485,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 42)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 494,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 502,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 42)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 511,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 519,
      "end_line": 525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 42)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 528,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInv()",
      "begin_line": 536,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 42)",
        "(line 538,col 9)-(line 538,col 37)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 546,
      "end_line": 552,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 37)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 555,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 9)-(line 565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(T[])",
      "begin_line": 569,
      "end_line": 576,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 40)",
        "(line 571,col 9)-(line 571,col 42)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 589,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 9)-(line 599,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(T[])",
      "begin_line": 603,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 40)",
        "(line 605,col 9)-(line 605,col 42)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getData()",
      "begin_line": 623,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 637,
      "end_line": 648,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 638,col 9)-(line 647,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(T[])",
      "begin_line": 651,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 40)",
        "(line 653,col 9)-(line 653,col 32)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.dotProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 666,
      "end_line": 668,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 671,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(T[])",
      "begin_line": 676,
      "end_line": 678,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.projection(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 685,
      "end_line": 687,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 690,
      "end_line": 704,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 691,col 9)-(line 703,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 712,
      "end_line": 714,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.outerProduct(T[])",
      "begin_line": 717,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 34)",
        "(line 719,col 9)-(line 719,col 31)",
        "(line 720,col 9)-(line 720,col 77)",
        "(line 721,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 730,
      "end_line": 732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getDimension()",
      "begin_line": 735,
      "end_line": 737,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 740,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 741,col 9)-(line 745,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T)",
      "begin_line": 758,
      "end_line": 763,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 52)",
        "(line 760,col 9)-(line 760,col 55)",
        "(line 761,col 9)-(line 761,col 30)",
        "(line 762,col 9)-(line 762,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.append(T[])",
      "begin_line": 766,
      "end_line": 768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 771,
      "end_line": 780,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 68)",
        "(line 773,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 783,
      "end_line": 789,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 784,col 9)-(line 788,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 792,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 793,col 9)-(line 804,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.setSubVector(int, T[])",
      "begin_line": 808,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 9)-(line 814,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(int, org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.set(T)",
      "begin_line": 830,
      "end_line": 832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.toArray()",
      "begin_line": 835,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception IllegalArgumentException if the vectors do not\n     * have the same dimension\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 856,
      "end_line": 860,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws OutOfRangeException if the dimension is\n     * inconsistent with this vector size.\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 869,
      "end_line": 895,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 876,col 9)",
        "(line 878,col 9)-(line 894,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.hashCode()",
      "begin_line": 902,
      "end_line": 909,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 21)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 917,
      "end_line": 922,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 921,col 9)"
      ]
    }
  ]
}
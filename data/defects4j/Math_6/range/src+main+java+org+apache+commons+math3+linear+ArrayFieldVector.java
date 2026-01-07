{
  "filepath": "/tmp/Math-6b/src/main/java/org/apache/commons/math3/linear/ArrayFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 958,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link FieldElement} array.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #ArrayFieldVector(ArrayFieldVector, ArrayFieldVector)} constructor\n     * or one of the {@code append} methods ({@link #add(FieldVector)} or\n     * {@link #append(ArrayFieldVector)}) to gather data into this vector.\n     *\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param size Size of the vector.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 56)"
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
      "end_line": 108,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[])} constructor.\n     *\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(Field, FieldElement[])\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 34)",
        "(line 102,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Construct a vector from an array, copying the input array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[])\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], boolean)",
      "begin_line": 146,
      "end_line": 154,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     * This constructor needs a non-empty {@code d} array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], boolean)}\n     * constructor.\n     *\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws ZeroException if {@code d} is empty.\n     * @see #ArrayFieldVector(FieldElement[])\n     * @see #ArrayFieldVector(Field, FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 34)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 32)",
        "(line 153,col 9)-(line 153,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], boolean)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * Create a new ArrayFieldVector using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * ArrayFieldVector and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new vector.\n     * @param copyArray If {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #ArrayFieldVector(FieldElement[], boolean)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 175,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], int, int)",
      "begin_line": 188,
      "end_line": 197,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 34)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 32)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 196,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], int, int)",
      "begin_line": 210,
      "end_line": 219,
      "comment": "\n     * Construct a vector from part of a array.\n     *\n     * @param field Field to which the elements belong.\n     * @param d Array.\n     * @param pos Position of the first entry.\n     * @param size Number of entries to copy.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NumberIsTooLargeException if the size of {@code d} is less\n     * than {@code pos + size}.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 34)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 27)",
        "(line 217,col 9)-(line 217,col 50)",
        "(line 218,col 9)-(line 218,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 227,
      "end_line": 235,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 34)",
        "(line 230,col 9)-(line 230,col 29)",
        "(line 231,col 9)-(line 231,col 62)",
        "(line 232,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "\n     * Construct a vector from another vector, using a deep copy.\n     *\n     * @param v Vector to copy.\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 34)",
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 247,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, boolean)",
      "begin_line": 258,
      "end_line": 263,
      "comment": "\n     * Construct a vector from another vector.\n     *\n     * @param v Vector to copy.\n     * @param deep If {@code true} perform a deep copy, otherwise perform\n     * a shallow copy\n     * @throws NullArgumentException if {@code v} is {@code null}.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 34)",
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldVector, FieldVector)}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.FieldVector\u003cT\u003e, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 289,
      "end_line": 301,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 35)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 30)",
        "(line 294,col 9)-(line 295,col 98)",
        "(line 296,col 9)-(line 297,col 98)",
        "(line 298,col 9)-(line 298,col 75)",
        "(line 299,col 9)-(line 299,col 60)",
        "(line 300,col 9)-(line 300,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e, T[])",
      "begin_line": 312,
      "end_line": 316,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldVector, FieldElement[])}\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.linear.FieldVector\u003cT\u003e, T[])",
      "begin_line": 326,
      "end_line": 336,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 35)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 30)",
        "(line 331,col 9)-(line 332,col 98)",
        "(line 333,col 9)-(line 333,col 71)",
        "(line 334,col 9)-(line 334,col 60)",
        "(line 335,col 9)-(line 335,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 347,
      "end_line": 351,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldElement[], FieldVector)}\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 361,
      "end_line": 371,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 35)",
        "(line 364,col 9)-(line 364,col 35)",
        "(line 365,col 9)-(line 365,col 30)",
        "(line 366,col 9)-(line 367,col 98)",
        "(line 368,col 9)-(line 368,col 71)",
        "(line 369,col 9)-(line 369,col 52)",
        "(line 370,col 9)-(line 370,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 388,
      "end_line": 399,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * This constructor needs at least one non-empty array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}\n     * constructor.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 35)",
        "(line 391,col 9)-(line 391,col 35)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 78)",
        "(line 396,col 9)-(line 396,col 52)",
        "(line 397,col 9)-(line 397,col 60)",
        "(line 398,col 9)-(line 398,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], T[])",
      "begin_line": 412,
      "end_line": 423,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param field Field to which the elements belong.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 35)",
        "(line 415,col 9)-(line 415,col 35)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 67)",
        "(line 420,col 9)-(line 420,col 52)",
        "(line 421,col 9)-(line 421,col 60)",
        "(line 422,col 9)-(line 422,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getField()",
      "begin_line": 426,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.copy()",
      "begin_line": 431,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 436,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 438,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 457,
      "end_line": 465,
      "comment": "\n     * Compute the sum of {@code this} and {@code v}.\n     * @param v vector to be added\n     * @return {@code this + v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 45)",
        "(line 460,col 9)-(line 460,col 60)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 468,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 470,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 489,
      "end_line": 497,
      "comment": "\n     * Compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 45)",
        "(line 492,col 9)-(line 492,col 60)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 500,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 60)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 509,
      "end_line": 514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 517,
      "end_line": 523,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 60)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 526,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 534,
      "end_line": 540,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 60)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 543,
      "end_line": 548,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 551,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 60)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 562,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 34)",
        "(line 565,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInv()",
      "begin_line": 572,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 60)",
        "(line 574,col 9)-(line 574,col 37)",
        "(line 575,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 586,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 37)",
        "(line 588,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 599,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 620,
      "end_line": 628,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing {@code this[i] * v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 45)",
        "(line 623,col 9)-(line 623,col 60)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 631,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 633,col 9)-(line 646,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 657,
      "end_line": 669,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if one entry of {@code v} is zero.\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 45)",
        "(line 660,col 9)-(line 660,col 60)",
        "(line 661,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getData()",
      "begin_line": 672,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 686,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 688,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 707,
      "end_line": 715,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product of {@code this} and {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 45)",
        "(line 710,col 9)-(line 710,col 32)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 718,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 730,
      "end_line": 733,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which {@code this} must be projected\n     * @return projection of {@code this} onto {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if {@code v} is the null vector.\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 736,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 737,col 9)-(line 749,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 757,
      "end_line": 767,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 34)",
        "(line 759,col 9)-(line 759,col 36)",
        "(line 760,col 9)-(line 760,col 77)",
        "(line 761,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 770,
      "end_line": 772,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDimension()",
      "begin_line": 775,
      "end_line": 777,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 780,
      "end_line": 786,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 785,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(T)",
      "begin_line": 798,
      "end_line": 803,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 70)",
        "(line 800,col 9)-(line 800,col 55)",
        "(line 801,col 9)-(line 801,col 30)",
        "(line 802,col 9)-(line 802,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 806,
      "end_line": 819,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 68)",
        "(line 812,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 822,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 823,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 831,
      "end_line": 844,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 843,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(int, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 853,
      "end_line": 860,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is invalid.\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(T)",
      "begin_line": 863,
      "end_line": 865,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.toArray()",
      "begin_line": 868,
      "end_line": 870,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception DimensionMismatchException if the vectors do not\n     * have the same dimensions\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 890,
      "end_line": 895,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is not equal to the\n     * size of {@code this} vector.\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 894,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 904,
      "end_line": 930,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.hashCode()",
      "begin_line": 937,
      "end_line": 944,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 21)",
        "(line 940,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 952,
      "end_line": 957,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 956,col 9)"
      ]
    }
  ]
}
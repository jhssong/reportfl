{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/ArrayFieldVector.java",
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
      "end_line": 960,
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
      "begin_line": 327,
      "end_line": 337,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 35)",
        "(line 331,col 9)-(line 331,col 30)",
        "(line 332,col 9)-(line 333,col 98)",
        "(line 334,col 9)-(line 334,col 71)",
        "(line 335,col 9)-(line 335,col 60)",
        "(line 336,col 9)-(line 336,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 348,
      "end_line": 352,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @deprecated as of 3.2, replaced by {@link #ArrayFieldVector(FieldElement[], FieldVector)}\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 363,
      "end_line": 373,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 366,col 35)",
        "(line 367,col 9)-(line 367,col 30)",
        "(line 368,col 9)-(line 369,col 98)",
        "(line 370,col 9)-(line 370,col 71)",
        "(line 371,col 9)-(line 371,col 52)",
        "(line 372,col 9)-(line 372,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(T[], T[])",
      "begin_line": 390,
      "end_line": 401,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     * This constructor needs at least one non-empty array to retrieve\n     * the field from its first element. This implies it cannot build\n     * 0 length vectors. To build vectors from any size, one should\n     * use the {@link #ArrayFieldVector(Field, FieldElement[], FieldElement[])}\n     * constructor.\n     *\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(Field, FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 35)",
        "(line 393,col 9)-(line 393,col 35)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 78)",
        "(line 398,col 9)-(line 398,col 52)",
        "(line 399,col 9)-(line 399,col 60)",
        "(line 400,col 9)-(line 400,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ArrayFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[], T[])",
      "begin_line": 414,
      "end_line": 425,
      "comment": "\n     * Construct a vector by appending one vector to another vector.\n     *\n     * @param field Field to which the elements belong.\n     * @param v1 First vector (will be put in front of the new vector).\n     * @param v2 Second vector (will be put at back of the new vector).\n     * @throws NullArgumentException if {@code v1} or {@code v2} is\n     * {@code null}.\n     * @throws ZeroException if both arrays are empty.\n     * @see #ArrayFieldVector(FieldElement[], FieldElement[])\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 35)",
        "(line 417,col 9)-(line 417,col 35)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 67)",
        "(line 422,col 9)-(line 422,col 52)",
        "(line 423,col 9)-(line 423,col 60)",
        "(line 424,col 9)-(line 424,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getField()",
      "begin_line": 428,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.copy()",
      "begin_line": 433,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 438,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 459,
      "end_line": 467,
      "comment": "\n     * Compute the sum of {@code this} and {@code v}.\n     * @param v vector to be added\n     * @return {@code this + v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 45)",
        "(line 462,col 9)-(line 462,col 60)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 470,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 491,
      "end_line": 499,
      "comment": "\n     * Compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 45)",
        "(line 494,col 9)-(line 494,col 60)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 502,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 60)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAddToSelf(T)",
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
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 519,
      "end_line": 525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 60)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtractToSelf(T)",
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
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 536,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 60)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 545,
      "end_line": 550,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 553,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 34)",
        "(line 556,col 9)-(line 556,col 60)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 564,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 34)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInv()",
      "begin_line": 574,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 60)",
        "(line 576,col 9)-(line 576,col 37)",
        "(line 577,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 588,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 37)",
        "(line 590,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 601,
      "end_line": 613,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 603,col 9)-(line 612,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 622,
      "end_line": 630,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing {@code this[i] * v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 45)",
        "(line 625,col 9)-(line 625,col 60)",
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 633,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 659,
      "end_line": 671,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if one entry of {@code v} is zero.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 45)",
        "(line 662,col 9)-(line 662,col 60)",
        "(line 663,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getData()",
      "begin_line": 674,
      "end_line": 676,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 688,
      "end_line": 700,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 709,
      "end_line": 717,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product of {@code this} and {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 45)",
        "(line 712,col 9)-(line 712,col 32)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 716,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 720,
      "end_line": 723,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 732,
      "end_line": 735,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which {@code this} must be projected\n     * @return projection of {@code this} onto {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if {@code v} is the null vector.\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 738,
      "end_line": 752,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 739,col 9)-(line 751,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 759,
      "end_line": 769,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 34)",
        "(line 761,col 9)-(line 761,col 36)",
        "(line 762,col 9)-(line 762,col 77)",
        "(line 763,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 772,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDimension()",
      "begin_line": 777,
      "end_line": 779,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 782,
      "end_line": 788,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 783,col 9)-(line 787,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(T)",
      "begin_line": 800,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 70)",
        "(line 802,col 9)-(line 802,col 55)",
        "(line 803,col 9)-(line 803,col 30)",
        "(line 804,col 9)-(line 804,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 808,
      "end_line": 821,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 68)",
        "(line 814,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 824,
      "end_line": 830,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 825,col 9)-(line 829,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 833,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 834,col 9)-(line 845,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(int, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 855,
      "end_line": 862,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is invalid.\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 861,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(T)",
      "begin_line": 865,
      "end_line": 867,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.toArray()",
      "begin_line": 870,
      "end_line": 872,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 880,
      "end_line": 883,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception DimensionMismatchException if the vectors do not\n     * have the same dimensions\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 892,
      "end_line": 897,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is not equal to the\n     * size of {@code this} vector.\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 896,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 906,
      "end_line": 932,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.hashCode()",
      "begin_line": 939,
      "end_line": 946,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 21)",
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 954,
      "end_line": 959,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 958,col 9)"
      ]
    }
  ]
}
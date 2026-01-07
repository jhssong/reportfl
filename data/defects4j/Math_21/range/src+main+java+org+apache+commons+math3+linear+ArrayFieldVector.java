{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/linear/ArrayFieldVector.java",
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
      "end_line": 1024,
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
      "begin_line": 421,
      "end_line": 433,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.add(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 442,
      "end_line": 450,
      "comment": "\n     * Compute the sum of {@code this} and {@code v}.\n     * @param v vector to be added\n     * @return {@code this + v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 45)",
        "(line 445,col 9)-(line 445,col 42)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 458,
      "end_line": 470,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.subtract(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 479,
      "end_line": 487,
      "comment": "\n     * Compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 45)",
        "(line 482,col 9)-(line 482,col 42)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAdd(T)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 42)",
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapAddToSelf(T)",
      "begin_line": 507,
      "end_line": 512,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtract(T)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 42)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapSubtractToSelf(T)",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiply(T)",
      "begin_line": 544,
      "end_line": 550,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 42)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 557,
      "end_line": 562,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivide(T)",
      "begin_line": 570,
      "end_line": 580,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws MathArithmeticException if {@code d} is zero.\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 42)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapDivideToSelf(T)",
      "begin_line": 588,
      "end_line": 597,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws MathArithmeticException if {@code d} is zero.\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInv()",
      "begin_line": 604,
      "end_line": 615,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathArithmeticException if {@code d} is zero.\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 42)",
        "(line 606,col 9)-(line 606,col 37)",
        "(line 607,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.mapInvToSelf()",
      "begin_line": 622,
      "end_line": 632,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathArithmeticException if {@code d} is zero.\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 37)",
        "(line 624,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 640,
      "end_line": 652,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 651,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeMultiply(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 661,
      "end_line": 669,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing {@code this[i] * v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 45)",
        "(line 664,col 9)-(line 664,col 42)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 678,
      "end_line": 694,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     * @throws MathArithmeticException if one entry of {@code v} is zero.\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.ebeDivide(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 704,
      "end_line": 716,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if one entry of {@code v} is zero.\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 45)",
        "(line 707,col 9)-(line 707,col 42)",
        "(line 708,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getData()",
      "begin_line": 719,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDataRef()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003eDoes not make a fresh copy of the underlying data.\u003c/p\u003e\n     * @return array of entries\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 738,
      "end_line": 749,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 748,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.dotProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 758,
      "end_line": 766,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product of {@code this} and {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 45)",
        "(line 761,col 9)-(line 761,col 32)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 765,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 775,
      "end_line": 778,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     * @throws MathArithmeticException if {@code v} is the null vector.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.projection(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 787,
      "end_line": 790,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which {@code this} must be projected\n     * @return projection of {@code this} onto {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}\n     * @throws MathArithmeticException if {@code v} is the null vector.\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 793,
      "end_line": 807,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 794,col 9)-(line 806,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.outerProduct(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 814,
      "end_line": 824,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 34)",
        "(line 816,col 9)-(line 816,col 36)",
        "(line 817,col 9)-(line 817,col 77)",
        "(line 818,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getEntry(int)",
      "begin_line": 827,
      "end_line": 829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getDimension()",
      "begin_line": 832,
      "end_line": 834,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 837,
      "end_line": 843,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 838,col 9)-(line 842,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.append(T)",
      "begin_line": 855,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 52)",
        "(line 857,col 9)-(line 857,col 55)",
        "(line 858,col 9)-(line 858,col 30)",
        "(line 859,col 9)-(line 859,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.getSubVector(int, int)",
      "begin_line": 868,
      "end_line": 881,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws OutOfRangeException if the index is not valid.\n     * @throws NotPositiveException if the number of elements is not positive.\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 68)",
        "(line 874,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setEntry(int, T)",
      "begin_line": 884,
      "end_line": 890,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 885,col 9)-(line 889,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 897,
      "end_line": 910,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 909,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(int, org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 919,
      "end_line": 926,
      "comment": "\n     * Set a set of consecutive elements.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is invalid.\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 925,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.set(T)",
      "begin_line": 929,
      "end_line": 931,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.toArray()",
      "begin_line": 934,
      "end_line": 936,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 944,
      "end_line": 947,
      "comment": "\n     * Check if instance and specified vectors have the same dimension.\n     * @param v vector to compare instance with\n     * @exception DimensionMismatchException if the vectors do not\n     * have the same dimensions\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkVectorDimensions(int)",
      "begin_line": 956,
      "end_line": 961,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimension is not equal to the\n     * size of {@code this} vector.\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 960,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.equals(java.lang.Object)",
      "begin_line": 970,
      "end_line": 996,
      "comment": "\n     * Test for the equality of two vectors.\n     *\n     * @param other Object to test for equality.\n     * @return {@code true} if two vector objects are equal, {@code false}\n     * otherwise.\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 977,col 9)",
        "(line 979,col 9)-(line 995,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.hashCode()",
      "begin_line": 1003,
      "end_line": 1010,
      "comment": "\n     * Get a hashCode for the real vector.\n     * \u003cp\u003eAll NaN values have the same hash code.\u003c/p\u003e\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 21)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1009,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ArrayFieldVector.checkIndex(int)",
      "begin_line": 1018,
      "end_line": 1023,
      "comment": "\n     * Check if an index is valid.\n     *\n     * @param index Index to check.\n     * @exception OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1022,col 9)"
      ]
    }
  ]
}
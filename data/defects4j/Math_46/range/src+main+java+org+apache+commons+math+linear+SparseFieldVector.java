{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 651,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "  Serialization identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(FieldElement)},\n     * {@link #append(FieldElement[])}, {@link #append(FieldVector)},\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 27)",
        "(line 68,col 9)-(line 68,col 32)",
        "(line 69,col 9)-(line 69,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 24)",
        "(line 80,col 9)-(line 80,col 48)",
        "(line 81,col 9)-(line 81,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 27)",
        "(line 94,col 9)-(line 94,col 32)",
        "(line 95,col 9)-(line 95,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.Field\u003cT\u003e, T[])",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored.\n     *\n     * @param field Field to which the elements belong.\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 54)",
        "(line 109,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)",
        "(line 122,col 9)-(line 122,col 39)",
        "(line 123,col 9)-(line 123,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getEntries()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 143,
      "end_line": 159,
      "comment": "\n     * Optimized method to add sparse vectors.\n     *\n     * @param v Vector to add.\n     * @return the sum of {@code this} and {@code v}.\n     * @throws DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 48)",
        "(line 145,col 9)-(line 145,col 64)",
        "(line 146,col 9)-(line 146,col 75)",
        "(line 147,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(T[])",
      "begin_line": 163,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 40)",
        "(line 165,col 9)-(line 165,col 82)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 178,
      "end_line": 186,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 84)",
        "(line 180,col 9)-(line 180,col 70)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 189,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(T)",
      "begin_line": 198,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 63)",
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.append(T[])",
      "begin_line": 205,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 70)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.copy()",
      "begin_line": 214,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 219,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 48)",
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 222,col 68)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.dotProduct(T[])",
      "begin_line": 231,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 40)",
        "(line 233,col 9)-(line 233,col 32)",
        "(line 234,col 9)-(line 234,col 68)",
        "(line 235,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 247,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 48)",
        "(line 249,col 9)-(line 249,col 66)",
        "(line 250,col 9)-(line 250,col 72)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeDivide(T[])",
      "begin_line": 259,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 40)",
        "(line 261,col 9)-(line 261,col 66)",
        "(line 262,col 9)-(line 262,col 72)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 271,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 48)",
        "(line 273,col 9)-(line 273,col 66)",
        "(line 274,col 9)-(line 274,col 72)",
        "(line 275,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.ebeMultiply(T[])",
      "begin_line": 283,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 40)",
        "(line 285,col 9)-(line 285,col 66)",
        "(line 286,col 9)-(line 286,col 72)",
        "(line 287,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getData()",
      "begin_line": 295,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 68)",
        "(line 298,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getDimension()",
      "begin_line": 306,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 311,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 26)",
        "(line 313,col 9)-(line 313,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getField()",
      "begin_line": 317,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 322,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 26)",
        "(line 324,col 9)-(line 324,col 34)",
        "(line 325,col 9)-(line 325,col 69)",
        "(line 326,col 9)-(line 326,col 28)",
        "(line 327,col 9)-(line 327,col 68)",
        "(line 328,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 339,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 344,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 352,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 357,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 68)",
        "(line 359,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapInv()",
      "begin_line": 367,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapInvToSelf()",
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
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 380,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 385,
      "end_line": 392,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 68)",
        "(line 387,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 395,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 400,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 411,
      "end_line": 424,
      "comment": "\n     * Optimized method to compute outer product when both vectors are sparse.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @throws DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 83)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 415,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(T[])",
      "begin_line": 427,
      "end_line": 440,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 31)",
        "(line 429,col 9)-(line 429,col 77)",
        "(line 430,col 9)-(line 430,col 68)",
        "(line 431,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 443,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 444,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 452,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 48)",
        "(line 454,col 9)-(line 454,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.projection(T[])",
      "begin_line": 458,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 40)",
        "(line 460,col 9)-(line 460,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.set(T)",
      "begin_line": 464,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 471,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 26)",
        "(line 473,col 9)-(line 473,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 477,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 26)",
        "(line 479,col 9)-(line 479,col 49)",
        "(line 480,col 9)-(line 480,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.setSubVector(int, T[])",
      "begin_line": 484,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 26)",
        "(line 486,col 9)-(line 486,col 41)",
        "(line 487,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(org.apache.commons.math.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 501,
      "end_line": 515,
      "comment": "\n     * Optimized method to subtract SparseRealVectors.\n     *\n     * @param v Vector to subtract.\n     * @return the difference between {@code this} and {@code v}.\n     * @throws DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 503,col 64)",
        "(line 504,col 9)-(line 504,col 75)",
        "(line 505,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 518,
      "end_line": 524,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 519,col 9)-(line 523,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.subtract(T[])",
      "begin_line": 527,
      "end_line": 538,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 40)",
        "(line 529,col 9)-(line 529,col 66)",
        "(line 530,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.toArray()",
      "begin_line": 541,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 551,
      "end_line": 555,
      "comment": "\n     * Check whether an index is valid.\n     *\n     * @param index Index to check.\n     * @throws OutOfRangeException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.checkVectorDimensions(int)",
      "begin_line": 563,
      "end_line": 567,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 570,
      "end_line": 576,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.buildArray(int)",
      "begin_line": 584,
      "end_line": 587,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.hashCode()",
      "begin_line": 591,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 29)",
        "(line 594,col 9)-(line 594,col 23)",
        "(line 595,col 9)-(line 595,col 75)",
        "(line 596,col 9)-(line 596,col 46)",
        "(line 597,col 9)-(line 597,col 68)",
        "(line 598,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldVector.equals(java.lang.Object)",
      "begin_line": 608,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 621,col 64)",
        "(line 622,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 68)",
        "(line 634,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 45)",
        "(line 642,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 20)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 600,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "  Serialization identifier. "
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
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(FieldVector)} or\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)",
        "(line 71,col 9)-(line 71,col 32)",
        "(line 72,col 9)-(line 72,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)",
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 98,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 108,
      "end_line": 116,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored.\n     *\n     * @param field Field to which the elements belong.\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 110,col 36)",
        "(line 111,col 9)-(line 111,col 54)",
        "(line 112,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)",
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 126,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntries()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 146,
      "end_line": 163,
      "comment": "\n     * Optimized method to add sparse vectors.\n     *\n     * @param v Vector to add.\n     * @return {@code this + v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 48)",
        "(line 149,col 9)-(line 149,col 64)",
        "(line 150,col 9)-(line 150,col 75)",
        "(line 151,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 84)",
        "(line 173,col 9)-(line 173,col 70)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 182,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(T)",
      "begin_line": 196,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 63)",
        "(line 198,col 9)-(line 198,col 37)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.copy()",
      "begin_line": 203,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 208,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 48)",
        "(line 210,col 9)-(line 210,col 32)",
        "(line 211,col 9)-(line 211,col 68)",
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 220,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 48)",
        "(line 223,col 9)-(line 223,col 66)",
        "(line 224,col 9)-(line 224,col 72)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 233,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 48)",
        "(line 236,col 9)-(line 236,col 66)",
        "(line 237,col 9)-(line 237,col 72)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getData()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated as of 3.1, to be removed in 4.0. Please use the {@link #toArray()} method instead.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getDimension()",
      "begin_line": 256,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 261,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 26)",
        "(line 263,col 9)-(line 263,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getField()",
      "begin_line": 267,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 272,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 26)",
        "(line 278,col 9)-(line 278,col 34)",
        "(line 279,col 9)-(line 279,col 69)",
        "(line 280,col 9)-(line 280,col 28)",
        "(line 281,col 9)-(line 281,col 68)",
        "(line 282,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 293,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 298,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 306,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 312,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 68)",
        "(line 315,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInv()",
      "begin_line": 323,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInvToSelf()",
      "begin_line": 328,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 336,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 341,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 68)",
        "(line 343,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 351,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 356,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 365,
      "end_line": 378,
      "comment": "\n     * Optimized method to compute outer product when both vectors are sparse.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 39)",
        "(line 367,col 9)-(line 367,col 83)",
        "(line 368,col 9)-(line 368,col 68)",
        "(line 369,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 381,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 401,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 48)",
        "(line 404,col 9)-(line 404,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.set(T)",
      "begin_line": 408,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 415,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 26)",
        "(line 417,col 9)-(line 417,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 421,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 26)",
        "(line 424,col 9)-(line 424,col 49)",
        "(line 425,col 9)-(line 425,col 39)",
        "(line 426,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 438,
      "end_line": 453,
      "comment": "\n     * Optimized method to compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 48)",
        "(line 441,col 9)-(line 441,col 64)",
        "(line 442,col 9)-(line 442,col 75)",
        "(line 443,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 456,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.toArray()",
      "begin_line": 476,
      "end_line": 484,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 42)",
        "(line 478,col 9)-(line 478,col 68)",
        "(line 479,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 492,
      "end_line": 496,
      "comment": "\n     * Check whether an index is valid.\n     *\n     * @param index Index to check.\n     * @throws OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkVectorDimensions(int)",
      "begin_line": 504,
      "end_line": 509,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 512,
      "end_line": 525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.buildArray(int)",
      "begin_line": 533,
      "end_line": 536,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.hashCode()",
      "begin_line": 540,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 29)",
        "(line 543,col 9)-(line 543,col 23)",
        "(line 544,col 9)-(line 544,col 75)",
        "(line 545,col 9)-(line 545,col 46)",
        "(line 546,col 9)-(line 546,col 68)",
        "(line 547,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.equals(java.lang.Object)",
      "begin_line": 557,
      "end_line": 599,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 568,col 9)-(line 570,col 64)",
        "(line 571,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 582,col 68)",
        "(line 583,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 45)",
        "(line 591,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 20)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 605,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n * @deprecated As of version 3.1, this class is deprecated, for reasons exposed\n * in this JIRA\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-870\"\u003eticket\u003c/a\u003e. This\n * class will be removed in version 4.0.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "  Serialization identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(FieldVector)} or\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 27)",
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)",
        "(line 88,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 89,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 27)",
        "(line 102,col 9)-(line 102,col 32)",
        "(line 103,col 9)-(line 103,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 113,
      "end_line": 121,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored.\n     *\n     * @param field Field to which the elements belong.\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 27)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 116,col 54)",
        "(line 117,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 131,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntries()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 151,
      "end_line": 168,
      "comment": "\n     * Optimized method to add sparse vectors.\n     *\n     * @param v Vector to add.\n     * @return {@code this + v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 48)",
        "(line 154,col 9)-(line 154,col 64)",
        "(line 155,col 9)-(line 155,col 75)",
        "(line 156,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 176,
      "end_line": 184,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 84)",
        "(line 178,col 9)-(line 178,col 70)",
        "(line 179,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 187,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(T)",
      "begin_line": 201,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 63)",
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.copy()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 213,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 48)",
        "(line 215,col 9)-(line 215,col 32)",
        "(line 216,col 9)-(line 216,col 68)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 225,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 48)",
        "(line 228,col 9)-(line 228,col 66)",
        "(line 229,col 9)-(line 229,col 72)",
        "(line 230,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 238,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 48)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 242,col 9)-(line 242,col 72)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getData()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated as of 3.1, to be removed in 4.0. Please use the {@link #toArray()} method instead.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getDimension()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 266,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 26)",
        "(line 268,col 9)-(line 268,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getField()",
      "begin_line": 272,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 277,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 26)",
        "(line 283,col 9)-(line 283,col 34)",
        "(line 284,col 9)-(line 284,col 69)",
        "(line 285,col 9)-(line 285,col 28)",
        "(line 286,col 9)-(line 286,col 68)",
        "(line 287,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 298,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 303,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 311,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 317,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 68)",
        "(line 320,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInv()",
      "begin_line": 328,
      "end_line": 330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInvToSelf()",
      "begin_line": 333,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 341,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 346,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 68)",
        "(line 348,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 356,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 361,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 370,
      "end_line": 383,
      "comment": "\n     * Optimized method to compute outer product when both vectors are sparse.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 39)",
        "(line 372,col 9)-(line 372,col 83)",
        "(line 373,col 9)-(line 373,col 68)",
        "(line 374,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 386,
      "end_line": 403,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 406,
      "end_line": 410,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 48)",
        "(line 409,col 9)-(line 409,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.set(T)",
      "begin_line": 413,
      "end_line": 417,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 420,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 26)",
        "(line 422,col 9)-(line 422,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 426,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 26)",
        "(line 429,col 9)-(line 429,col 49)",
        "(line 430,col 9)-(line 430,col 39)",
        "(line 431,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 443,
      "end_line": 458,
      "comment": "\n     * Optimized method to compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 48)",
        "(line 446,col 9)-(line 446,col 64)",
        "(line 447,col 9)-(line 447,col 75)",
        "(line 448,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 461,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.toArray()",
      "begin_line": 481,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 42)",
        "(line 483,col 9)-(line 483,col 68)",
        "(line 484,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 497,
      "end_line": 501,
      "comment": "\n     * Check whether an index is valid.\n     *\n     * @param index Index to check.\n     * @throws OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkVectorDimensions(int)",
      "begin_line": 509,
      "end_line": 514,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 517,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.buildArray(int)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.hashCode()",
      "begin_line": 545,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 29)",
        "(line 548,col 9)-(line 548,col 23)",
        "(line 549,col 9)-(line 549,col 75)",
        "(line 550,col 9)-(line 550,col 46)",
        "(line 551,col 9)-(line 551,col 68)",
        "(line 552,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.equals(java.lang.Object)",
      "begin_line": 562,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 575,col 64)",
        "(line 576,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 68)",
        "(line 588,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 45)",
        "(line 596,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 20)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 605,
      "comment": "\n * This class implements the {@link FieldVector} interface with a {@link OpenIntToFieldHashMap} backing store.\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n * @deprecated As of version 3.1, this class is deprecated, for reasons exposed\n * in this JIRA\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-870\"\u003eticket\u003c/a\u003e. This\n * class will be removed in version 4.0.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "  Serialization identifier. "
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
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Entries of the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "virtualSize"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Dimension of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(FieldVector)} or\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 32)",
        "(line 78,col 9)-(line 78,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 24)",
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 104,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 115,
      "end_line": 124,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored.\n     *\n     * @param field Field to which the elements belong.\n     * @param values Set of values to create from.\n     * @exception NullArgumentException if values is null\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 119,col 9)-(line 119,col 54)",
        "(line 120,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 134,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntries()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 154,
      "end_line": 171,
      "comment": "\n     * Optimized method to add sparse vectors.\n     *\n     * @param v Vector to add.\n     * @return {@code this + v}.\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 48)",
        "(line 157,col 9)-(line 157,col 64)",
        "(line 158,col 9)-(line 158,col 75)",
        "(line 159,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 84)",
        "(line 181,col 9)-(line 181,col 70)",
        "(line 182,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 190,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(T)",
      "begin_line": 206,
      "end_line": 211,
      "comment": " {@inheritDoc}\n     * @exception NullArgumentException if d is null\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 34)",
        "(line 208,col 9)-(line 208,col 63)",
        "(line 209,col 9)-(line 209,col 37)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.copy()",
      "begin_line": 214,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
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
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 231,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 48)",
        "(line 234,col 9)-(line 234,col 66)",
        "(line 235,col 9)-(line 235,col 72)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 244,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 247,col 66)",
        "(line 248,col 9)-(line 248,col 72)",
        "(line 249,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getData()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated as of 3.1, to be removed in 4.0. Please use the {@link #toArray()} method instead.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getDimension()",
      "begin_line": 267,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 272,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 26)",
        "(line 274,col 9)-(line 274,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getField()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 283,
      "end_line": 301,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 26)",
        "(line 289,col 9)-(line 289,col 34)",
        "(line 290,col 9)-(line 290,col 69)",
        "(line 291,col 9)-(line 291,col 28)",
        "(line 292,col 9)-(line 292,col 68)",
        "(line 293,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 304,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 309,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 317,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 323,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 68)",
        "(line 326,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInv()",
      "begin_line": 334,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInvToSelf()",
      "begin_line": 339,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 347,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 352,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 68)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 362,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 367,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 376,
      "end_line": 389,
      "comment": "\n     * Optimized method to compute outer product when both vectors are sparse.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 39)",
        "(line 378,col 9)-(line 378,col 83)",
        "(line 379,col 9)-(line 379,col 68)",
        "(line 380,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 392,
      "end_line": 409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 412,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 48)",
        "(line 415,col 9)-(line 415,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.set(T)",
      "begin_line": 421,
      "end_line": 426,
      "comment": " {@inheritDoc}\n     * @exception NullArgumentException if value is null\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 38)",
        "(line 423,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 431,
      "end_line": 435,
      "comment": " {@inheritDoc}\n     * @exception NullArgumentException if value is null\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 38)",
        "(line 433,col 9)-(line 433,col 26)",
        "(line 434,col 9)-(line 434,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 438,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 26)",
        "(line 441,col 9)-(line 441,col 49)",
        "(line 442,col 9)-(line 442,col 39)",
        "(line 443,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 455,
      "end_line": 470,
      "comment": "\n     * Optimized method to compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as\n     * {@code this}.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 48)",
        "(line 458,col 9)-(line 458,col 64)",
        "(line 459,col 9)-(line 459,col 75)",
        "(line 460,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 473,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.toArray()",
      "begin_line": 493,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 60)",
        "(line 495,col 9)-(line 495,col 68)",
        "(line 496,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 509,
      "end_line": 513,
      "comment": "\n     * Check whether an index is valid.\n     *\n     * @param index Index to check.\n     * @throws OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkVectorDimensions(int)",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 529,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 530,col 9)-(line 541,col 9)"
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
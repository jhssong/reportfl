{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/linear/SparseFieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldVector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 580,
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
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build a 0-length vector.\n     * Zero-length vectors may be used to initialize construction of vectors\n     * by data gathering. We start with zero-length and use either the {@link\n     * #SparseFieldVector(SparseFieldVector, int)} constructor\n     * or one of the {@code append} method ({@link #append(FieldVector)} or\n     * {@link #append(SparseFieldVector)}) to gather data into this vector.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Construct a vector of zeroes.\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 27)",
        "(line 67,col 9)-(line 67,col 32)",
        "(line 68,col 9)-(line 68,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e, int)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Build a resized vector, for use with append.\n     *\n     * @param v Original vector\n     * @param resize Amount to add.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)",
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 80,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * Build a vector with known the sparseness (for advanced use only).\n     *\n     * @param field Field to which the elements belong.\n     * @param dimension Size of the vector.\n     * @param expectedSize Expected number of non-zero entries.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 94,col 9)-(line 94,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 104,
      "end_line": 112,
      "comment": "\n     * Create from a Field array.\n     * Only non-zero entries will be stored.\n     *\n     * @param field Field to which the elements belong.\n     * @param values Set of values to create from.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 27)",
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 54)",
        "(line 108,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Copy constructor.\n     *\n     * @param v Instance to copy.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 24)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntries()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Get the entries of this instance.\n     *\n     * @return the entries of this instance\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 142,
      "end_line": 158,
      "comment": "\n     * Optimized method to add sparse vectors.\n     *\n     * @param v Vector to add.\n     * @return the sum of {@code this} and {@code v}.\n     * @throws DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 48)",
        "(line 144,col 9)-(line 144,col 64)",
        "(line 145,col 9)-(line 145,col 75)",
        "(line 146,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     *\n     * @param v Vector to append to this one.\n     * @return a new vector.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 84)",
        "(line 168,col 9)-(line 168,col 70)",
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 177,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.append(T)",
      "begin_line": 191,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 63)",
        "(line 193,col 9)-(line 193,col 37)",
        "(line 194,col 9)-(line 194,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.copy()",
      "begin_line": 198,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 203,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 48)",
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 206,col 68)",
        "(line 207,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 215,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 48)",
        "(line 217,col 9)-(line 217,col 66)",
        "(line 218,col 9)-(line 218,col 72)",
        "(line 219,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 227,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 48)",
        "(line 229,col 9)-(line 229,col 66)",
        "(line 230,col 9)-(line 230,col 72)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getData()",
      "begin_line": 239,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 42)",
        "(line 241,col 9)-(line 241,col 68)",
        "(line 242,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getDimension()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getEntry(int)",
      "begin_line": 255,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 26)",
        "(line 257,col 9)-(line 257,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getField()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.getSubVector(int, int)",
      "begin_line": 266,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 26)",
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 269,col 69)",
        "(line 270,col 9)-(line 270,col 28)",
        "(line 271,col 9)-(line 271,col 68)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAdd(T)",
      "begin_line": 283,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapAddToSelf(T)",
      "begin_line": 288,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivide(T)",
      "begin_line": 296,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapDivideToSelf(T)",
      "begin_line": 301,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 68)",
        "(line 303,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInv()",
      "begin_line": 311,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapInvToSelf()",
      "begin_line": 316,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiply(T)",
      "begin_line": 324,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapMultiplyToSelf(T)",
      "begin_line": 329,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 68)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtract(T)",
      "begin_line": 339,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.mapSubtractToSelf(T)",
      "begin_line": 344,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 355,
      "end_line": 368,
      "comment": "\n     * Optimized method to compute outer product when both vectors are sparse.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @throws DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 39)",
        "(line 357,col 9)-(line 357,col 83)",
        "(line 358,col 9)-(line 358,col 68)",
        "(line 359,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 371,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 391,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 48)",
        "(line 393,col 9)-(line 393,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.set(T)",
      "begin_line": 397,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setEntry(int, T)",
      "begin_line": 404,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 410,
      "end_line": 417,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 26)",
        "(line 412,col 9)-(line 412,col 49)",
        "(line 413,col 9)-(line 413,col 39)",
        "(line 414,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.SparseFieldVector\u003cT\u003e)",
      "begin_line": 427,
      "end_line": 441,
      "comment": "\n     * Optimized method to subtract SparseRealVectors.\n     *\n     * @param v Vector to subtract.\n     * @return the difference between {@code this} and {@code v}.\n     * @throws DimensionMismatchException\n     * if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 48)",
        "(line 429,col 9)-(line 429,col 64)",
        "(line 430,col 9)-(line 430,col 75)",
        "(line 431,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 444,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.toArray()",
      "begin_line": 463,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkIndex(int)",
      "begin_line": 473,
      "end_line": 477,
      "comment": "\n     * Check whether an index is valid.\n     *\n     * @param index Index to check.\n     * @throws OutOfRangeException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 476,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.checkVectorDimensions(int)",
      "begin_line": 485,
      "end_line": 489,
      "comment": "\n     * Check if instance dimension is equal to some expected value.\n     *\n     * @param n Expected dimension.\n     * @throws DimensionMismatchException if the dimensions do not match.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 492,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.buildArray(int)",
      "begin_line": 513,
      "end_line": 516,
      "comment": "\n     * Build an array of elements.\n     *\n     * @param length Size of the array to build.\n     * @return a new array.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.hashCode()",
      "begin_line": 520,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 29)",
        "(line 523,col 9)-(line 523,col 23)",
        "(line 524,col 9)-(line 524,col 75)",
        "(line 525,col 9)-(line 525,col 46)",
        "(line 526,col 9)-(line 526,col 68)",
        "(line 527,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldVector.equals(java.lang.Object)",
      "begin_line": 537,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 550,col 64)",
        "(line 551,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 68)",
        "(line 563,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 45)",
        "(line 571,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 20)"
      ]
    }
  ]
}
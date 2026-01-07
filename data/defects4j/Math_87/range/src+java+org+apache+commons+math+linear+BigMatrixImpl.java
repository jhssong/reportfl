{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/linear/BigMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.BigMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 1505,
      "comment": "\n * Implementation of {@link BigMatrix} using a BigDecimal[][] array to store entries\n * and \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decompostion\u003c/a\u003e to support linear system \n * solution and inverse.\n * \u003cp\u003e\n * The LU decompostion is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n* \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is stored and reused on subsequent calls.  If matrix\n * data are modified using any of the public setXxx methods, the saved\n * decomposition is discarded.  If data are modified via references to the\n * underlying array obtained using \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored\n * LU decomposition will not be discarded.  In this case, you need to\n * explicitly invoke \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link BigMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n * \n * @deprecated as of 2.0, replaced by {@link FieldMatrixImpl} with a {@link\n * org.apache.commons.math.util.BigReal} parameter\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Entries of the matrix "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Entries of cached LU decomposition.\n     *  All updates to data (other than luDecompose()) *must* set this to null\n     "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "parity"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "roundingMode"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Rounding mode for divisions *"
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "* BigDecimal scale **"
    },
    {
      "type": "field",
      "varNames": [
        "TOO_SMALL"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " BigDecimal 0 "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " BigDecimal 1 "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl()",
      "begin_line": 91,
      "end_line": 92,
      "comment": " \n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(int, int)",
      "begin_line": 102,
      "end_line": 115,
      "comment": "\n     * Create a new BigMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension      the number of rows in the new matrix\n     * @param columnDimension   the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 61)",
        "(line 114,col 9)-(line 114,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][])",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #BigMatrixImpl(BigDecimal[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 23)",
        "(line 131,col 9)-(line 131,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][], boolean)",
      "begin_line": 149,
      "end_line": 175,
      "comment": "\n     * Create a new BigMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #BigMatrixImpl(BigDecimal[][])\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(double[][])",
      "begin_line": 188,
      "end_line": 207,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003eSince the underlying array will hold \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * instances, it will be created.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 35)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 38)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 23)",
        "(line 206,col 9)-(line 206,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.lang.String[][])",
      "begin_line": 218,
      "end_line": 237,
      "comment": "\n     * Create a new BigMatrix using the values represented by the strings in \n     * \u003ccode\u003ed\u003c/code\u003e as the underlying data array.\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 35)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 236,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[])",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Create a new (column) BigMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix \n     * created.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 35)",
        "(line 250,col 9)-(line 250,col 40)",
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copy()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Create a new BigMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 272,
      "end_line": 292,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 301,
      "end_line": 318,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 53)",
        "(line 306,col 9)-(line 306,col 50)",
        "(line 307,col 9)-(line 307,col 53)",
        "(line 308,col 9)-(line 308,col 77)",
        "(line 309,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 327,
      "end_line": 347,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 356,
      "end_line": 373,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 56)",
        "(line 361,col 9)-(line 361,col 50)",
        "(line 362,col 9)-(line 362,col 53)",
        "(line 363,col 9)-(line 363,col 77)",
        "(line 364,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(java.math.BigDecimal)",
      "begin_line": 381,
      "end_line": 393,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 50)",
        "(line 383,col 9)-(line 383,col 53)",
        "(line 384,col 9)-(line 384,col 77)",
        "(line 385,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(java.math.BigDecimal)",
      "begin_line": 400,
      "end_line": 412,
      "comment": "\n     * Returns the result of multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 50)",
        "(line 402,col 9)-(line 402,col 53)",
        "(line 403,col 9)-(line 403,col 77)",
        "(line 404,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 421,
      "end_line": 446,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 455,
      "end_line": 476,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 59)",
        "(line 460,col 9)-(line 460,col 49)",
        "(line 461,col 9)-(line 461,col 49)",
        "(line 462,col 9)-(line 462,col 51)",
        "(line 463,col 9)-(line 463,col 68)",
        "(line 464,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getData()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray()",
      "begin_line": 508,
      "end_line": 518,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data converted to\n     * \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 44)",
        "(line 510,col 9)-(line 510,col 47)",
        "(line 511,col 9)-(line 511,col 54)",
        "(line 512,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataRef()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRoundingMode()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@link java.math.BigDecimal#ROUND_HALF_UP}\n     * @see BigDecimal\n     * @return the rounding mode.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setRoundingMode(int)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @see BigDecimal\n     * @param roundingMode rounding mode for decimal divisions\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getScale()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @see BigDecimal\n     * @return the scale\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setScale(int)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "*\n     * Sets the scale for division operations.\n     * @see BigDecimal\n     * @param scale scale for division operations\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getNorm()",
      "begin_line": 575,
      "end_line": 585,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 36)",
        "(line 577,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 599,
      "end_line": 627,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 50)",
        "(line 604,col 9)-(line 604,col 48)",
        "(line 605,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 56)",
        "(line 611,col 9)-(line 611,col 54)",
        "(line 612,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 618,col 79)",
        "(line 619,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 640,
      "end_line": 671,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 651,col 72)",
        "(line 652,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(java.math.BigDecimal[][], int, int)",
      "begin_line": 700,
      "end_line": 746,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 43)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 708,col 9)-(line 708,col 46)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 713,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(int)",
      "begin_line": 756,
      "end_line": 762,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 45)",
        "(line 758,col 9)-(line 758,col 52)",
        "(line 759,col 9)-(line 759,col 60)",
        "(line 760,col 9)-(line 760,col 57)",
        "(line 761,col 9)-(line 761,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix(int)",
      "begin_line": 772,
      "end_line": 780,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 51)",
        "(line 774,col 9)-(line 774,col 49)",
        "(line 775,col 9)-(line 775,col 60)",
        "(line 776,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRow(int)",
      "begin_line": 792,
      "end_line": 798,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 45)",
        "(line 794,col 9)-(line 794,col 52)",
        "(line 795,col 9)-(line 795,col 55)",
        "(line 796,col 9)-(line 796,col 54)",
        "(line 797,col 9)-(line 797,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(int)",
      "begin_line": 811,
      "end_line": 819,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 45)",
        "(line 813,col 9)-(line 813,col 52)",
        "(line 814,col 9)-(line 814,col 47)",
        "(line 815,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumn(int)",
      "begin_line": 831,
      "end_line": 839,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 48)",
        "(line 833,col 9)-(line 833,col 49)",
        "(line 834,col 9)-(line 834,col 55)",
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(int)",
      "begin_line": 852,
      "end_line": 860,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 48)",
        "(line 854,col 9)-(line 854,col 49)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 856,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntry(int, int)",
      "begin_line": 877,
      "end_line": 886,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched  \n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 885,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble(int, int)",
      "begin_line": 904,
      "end_line": 906,
      "comment": "\n     * Returns the entry in the specified row and column as a double.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row\n     * or column index is not valid\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.transpose()",
      "begin_line": 913,
      "end_line": 924,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 49)",
        "(line 915,col 9)-(line 915,col 52)",
        "(line 916,col 9)-(line 916,col 68)",
        "(line 917,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.inverse()",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     * \n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDeterminant()",
      "begin_line": 942,
      "end_line": 955,
      "comment": "\n     * Returns the determinant of this matrix.\n     *\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 954,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSquare()",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\n     * Is this a square matrix?\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSingular()",
      "begin_line": 969,
      "end_line": 980,
      "comment": "\n     * Is this a singular matrix?\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 979,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowDimension()",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\n     * Returns the number of rows in the matrix.\n     *\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension()",
      "begin_line": 996,
      "end_line": 998,
      "comment": "\n     * Returns the number of columns in the matrix.\n     *\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getTrace()",
      "begin_line": 1008,
      "end_line": 1017,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * \n     * @throws IllegalArgumentException if this matrix is not square.\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 38)",
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(java.math.BigDecimal[])",
      "begin_line": 1026,
      "end_line": 1043,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 49)",
        "(line 1033,col 9)-(line 1033,col 52)",
        "(line 1034,col 9)-(line 1034,col 55)",
        "(line 1035,col 9)-(line 1041,col 9)",
        "(line 1042,col 9)-(line 1042,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(double[])",
      "begin_line": 1052,
      "end_line": 1058,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 57)",
        "(line 1054,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1057,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(java.math.BigDecimal[])",
      "begin_line": 1067,
      "end_line": 1084,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 49)",
        "(line 1069,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 52)",
        "(line 1075,col 9)-(line 1075,col 55)",
        "(line 1076,col 9)-(line 1082,col 9)",
        "(line 1083,col 9)-(line 1083,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(java.math.BigDecimal[])",
      "begin_line": 1097,
      "end_line": 1111,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 49)",
        "(line 1099,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1104,col 55)",
        "(line 1105,col 9)-(line 1105,col 88)",
        "(line 1106,col 9)-(line 1106,col 55)",
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(double[])",
      "begin_line": 1124,
      "end_line": 1130,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 57)",
        "(line 1126,col 9)-(line 1128,col 9)",
        "(line 1129,col 9)-(line 1129,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 1143,
      "end_line": 1198,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1151,col 9)",
        "(line 1152,col 9)-(line 1154,col 9)",
        "(line 1156,col 9)-(line 1156,col 51)",
        "(line 1157,col 9)-(line 1157,col 49)",
        "(line 1158,col 9)-(line 1158,col 46)",
        "(line 1161,col 9)-(line 1161,col 63)",
        "(line 1162,col 9)-(line 1167,col 9)",
        "(line 1170,col 9)-(line 1178,col 9)",
        "(line 1181,col 9)-(line 1194,col 9)",
        "(line 1196,col 9)-(line 1196,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.luDecompose()",
      "begin_line": 1218,
      "end_line": 1296,
      "comment": "\n     * Computes a new \n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decompostion\u003c/a\u003e for this matrix, storing the result for use by other methods. \n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algortithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 49)",
        "(line 1221,col 9)-(line 1221,col 52)",
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1225,col 28)",
        "(line 1228,col 9)-(line 1228,col 37)",
        "(line 1229,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1232,col 19)",
        "(line 1235,col 9)-(line 1294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.toString()",
      "begin_line": 1302,
      "end_line": 1323,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1304,col 9)-(line 1304,col 46)",
        "(line 1305,col 9)-(line 1305,col 37)",
        "(line 1306,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1321,col 24)",
        "(line 1322,col 9)-(line 1322,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.equals(java.lang.Object)",
      "begin_line": 1334,
      "end_line": 1357,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eBigMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  BigDecimal.equals\n     * is used to compare corresponding entries.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1342,col 47)",
        "(line 1343,col 9)-(line 1343,col 44)",
        "(line 1344,col 9)-(line 1344,col 47)",
        "(line 1345,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.hashCode()",
      "begin_line": 1364,
      "end_line": 1379,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1366,col 9)-(line 1366,col 20)",
        "(line 1367,col 9)-(line 1367,col 44)",
        "(line 1368,col 9)-(line 1368,col 47)",
        "(line 1369,col 9)-(line 1369,col 31)",
        "(line 1370,col 9)-(line 1370,col 31)",
        "(line 1371,col 9)-(line 1377,col 9)",
        "(line 1378,col 9)-(line 1378,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix()",
      "begin_line": 1410,
      "end_line": 1415,
      "comment": "\n     *  Returns the LU decomposition as a BigMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed; \n     *  otherwise the composition is computed and cached for use by other methods.   \n     *  Since a copy is returned in either case, changes to the returned matrix do not \n     *  affect the LU decomposition property. \n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition. \n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;   \n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\u003c/p\u003e\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     * \n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1          \n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8          \n     * \u003c/pre\u003e\n     * \n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\u003c/p\u003e\n     * \n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1413,col 9)",
        "(line 1414,col 9)-(line 1414,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getPermutation()",
      "begin_line": 1429,
      "end_line": 1433,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\u003c/p\u003e\n     * \n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 1430,col 9)-(line 1430,col 54)",
        "(line 1431,col 9)-(line 1431,col 69)",
        "(line 1432,col 9)-(line 1432,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyOut()",
      "begin_line": 1442,
      "end_line": 1450,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 1443,col 9)-(line 1443,col 49)",
        "(line 1444,col 9)-(line 1444,col 84)",
        "(line 1446,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1449,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.math.BigDecimal[][])",
      "begin_line": 1462,
      "end_line": 1464,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is emtpy or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(double[][])",
      "begin_line": 1471,
      "end_line": 1483,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1472,col 36)",
        "(line 1473,col 9)-(line 1473,col 39)",
        "(line 1474,col 9)-(line 1474,col 44)",
        "(line 1475,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1482,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.lang.String[][])",
      "begin_line": 1491,
      "end_line": 1503,
      "comment": "\n     * Replaces data with BigDecimals represented by the strings in the input\n     * array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1492,col 36)",
        "(line 1493,col 9)-(line 1493,col 39)",
        "(line 1494,col 9)-(line 1494,col 44)",
        "(line 1495,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1502,col 18)"
      ]
    }
  ]
}
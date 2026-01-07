{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/linear/BigMatrixImpl.java",
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
      "end_line": 1514,
      "comment": "\n * Implementation of {@link BigMatrix} using a BigDecimal[][] array to store entries\n * and \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decompostion\u003c/a\u003e to support linear system \n * solution and inverse.\n * \u003cp\u003e\n * The LU decompostion is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n* \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is stored and reused on subsequent calls.  If matrix\n * data are modified using any of the public setXxx methods, the saved\n * decomposition is discarded.  If data are modified via references to the\n * underlying array obtained using \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored\n * LU decomposition will not be discarded.  In this case, you need to\n * explicitly invoke \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link BigMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Entries of the matrix "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Entries of cached LU decomposition.\n     *  All updates to data (other than luDecompose()) *must* set this to null\n     "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "parity"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "roundingMode"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Rounding mode for divisions *"
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "* BigDecimal scale **"
    },
    {
      "type": "field",
      "varNames": [
        "TOO_SMALL"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " BigDecimal 0 "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " BigDecimal 1 "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl()",
      "begin_line": 90,
      "end_line": 91,
      "comment": " \n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(int, int)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "\n     * Create a new BigMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension      the number of rows in the new matrix\n     * @param columnDimension   the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 61)",
        "(line 107,col 9)-(line 107,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][])",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #BigMatrixImpl(BigDecimal[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 124,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][], boolean)",
      "begin_line": 142,
      "end_line": 165,
      "comment": "\n     * Create a new BigMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #BigMatrixImpl(BigDecimal[][])\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(double[][])",
      "begin_line": 178,
      "end_line": 197,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003eSince the underlying array will hold \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * instances, it will be created.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 23)",
        "(line 196,col 9)-(line 196,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.lang.String[][])",
      "begin_line": 208,
      "end_line": 227,
      "comment": "\n     * Create a new BigMatrix using the values represented by the strings in \n     * \u003ccode\u003ed\u003c/code\u003e as the underlying data array.\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 38)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 23)",
        "(line 226,col 9)-(line 226,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[])",
      "begin_line": 238,
      "end_line": 244,
      "comment": "\n     * Create a new (column) BigMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix \n     * created.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copy()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Create a new BigMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 262,
      "end_line": 281,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 290,
      "end_line": 306,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 50)",
        "(line 292,col 9)-(line 292,col 53)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 77)",
        "(line 297,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 315,
      "end_line": 334,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 343,
      "end_line": 359,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 50)",
        "(line 345,col 9)-(line 345,col 53)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 77)",
        "(line 350,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(java.math.BigDecimal)",
      "begin_line": 367,
      "end_line": 379,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 50)",
        "(line 369,col 9)-(line 369,col 53)",
        "(line 370,col 9)-(line 370,col 77)",
        "(line 371,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(java.math.BigDecimal)",
      "begin_line": 386,
      "end_line": 398,
      "comment": "\n     * Returns the result of multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 50)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 389,col 77)",
        "(line 390,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 407,
      "end_line": 431,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 440,
      "end_line": 460,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 49)",
        "(line 445,col 9)-(line 445,col 49)",
        "(line 446,col 9)-(line 446,col 51)",
        "(line 447,col 9)-(line 447,col 68)",
        "(line 448,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getData()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray()",
      "begin_line": 492,
      "end_line": 502,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data converted to\n     * \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 44)",
        "(line 494,col 9)-(line 494,col 47)",
        "(line 495,col 9)-(line 495,col 54)",
        "(line 496,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataRef()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRoundingMode()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@link java.math.BigDecimal#ROUND_HALF_UP}\n     * @see BigDecimal\n     * @return the rounding mode.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setRoundingMode(int)",
      "begin_line": 530,
      "end_line": 532,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @see BigDecimal\n     * @param roundingMode rounding mode for decimal divisions\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getScale()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @see BigDecimal\n     * @return the scale\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setScale(int)",
      "begin_line": 549,
      "end_line": 551,
      "comment": "*\n     * Sets the scale for division operations.\n     * @see BigDecimal\n     * @param scale scale for division operations\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getNorm()",
      "begin_line": 559,
      "end_line": 569,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 36)",
        "(line 561,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 583,
      "end_line": 611,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 32)",
        "(line 588,col 9)-(line 588,col 30)",
        "(line 589,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 594,col 38)",
        "(line 595,col 9)-(line 595,col 36)",
        "(line 596,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 602,col 79)",
        "(line 603,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 624,
      "end_line": 655,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 635,col 72)",
        "(line 636,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(java.math.BigDecimal[][], int, int)",
      "begin_line": 684,
      "end_line": 728,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 43)",
        "(line 688,col 9)-(line 688,col 46)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 701,col 9)",
        "(line 703,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 726,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(int)",
      "begin_line": 738,
      "end_line": 744,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 27)",
        "(line 740,col 9)-(line 740,col 52)",
        "(line 741,col 9)-(line 741,col 60)",
        "(line 742,col 9)-(line 742,col 57)",
        "(line 743,col 9)-(line 743,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix(int)",
      "begin_line": 754,
      "end_line": 762,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 33)",
        "(line 756,col 9)-(line 756,col 49)",
        "(line 757,col 9)-(line 757,col 60)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRow(int)",
      "begin_line": 774,
      "end_line": 780,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 27)",
        "(line 776,col 9)-(line 776,col 52)",
        "(line 777,col 9)-(line 777,col 55)",
        "(line 778,col 9)-(line 778,col 54)",
        "(line 779,col 9)-(line 779,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(int)",
      "begin_line": 793,
      "end_line": 801,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 27)",
        "(line 795,col 9)-(line 795,col 52)",
        "(line 796,col 9)-(line 796,col 47)",
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumn(int)",
      "begin_line": 813,
      "end_line": 821,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 30)",
        "(line 815,col 9)-(line 815,col 49)",
        "(line 816,col 9)-(line 816,col 55)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(int)",
      "begin_line": 834,
      "end_line": 842,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 30)",
        "(line 836,col 9)-(line 836,col 49)",
        "(line 837,col 9)-(line 837,col 47)",
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntry(int, int)",
      "begin_line": 859,
      "end_line": 868,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched  \n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 867,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble(int, int)",
      "begin_line": 886,
      "end_line": 888,
      "comment": "\n     * Returns the entry in the specified row and column as a double.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row\n     * or column index is not valid\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.transpose()",
      "begin_line": 895,
      "end_line": 906,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 49)",
        "(line 897,col 9)-(line 897,col 52)",
        "(line 898,col 9)-(line 898,col 68)",
        "(line 899,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.inverse()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     * \n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDeterminant()",
      "begin_line": 924,
      "end_line": 937,
      "comment": "\n     * Returns the determinant of this matrix.\n     *\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 936,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSquare()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * Is this a square matrix?\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSingular()",
      "begin_line": 951,
      "end_line": 962,
      "comment": "\n     * Is this a singular matrix?\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 961,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowDimension()",
      "begin_line": 969,
      "end_line": 971,
      "comment": "\n     * Returns the number of rows in the matrix.\n     *\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension()",
      "begin_line": 978,
      "end_line": 980,
      "comment": "\n     * Returns the number of columns in the matrix.\n     *\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getTrace()",
      "begin_line": 990,
      "end_line": 999,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * \n     * @throws IllegalArgumentException if this matrix is not square.\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 994,col 38)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(java.math.BigDecimal[])",
      "begin_line": 1008,
      "end_line": 1025,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1014,col 49)",
        "(line 1015,col 9)-(line 1015,col 52)",
        "(line 1016,col 9)-(line 1016,col 55)",
        "(line 1017,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1024,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(double[])",
      "begin_line": 1034,
      "end_line": 1040,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 57)",
        "(line 1036,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1039,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(java.math.BigDecimal[])",
      "begin_line": 1049,
      "end_line": 1066,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 49)",
        "(line 1051,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1056,col 52)",
        "(line 1057,col 9)-(line 1057,col 55)",
        "(line 1058,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1065,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(java.math.BigDecimal[])",
      "begin_line": 1079,
      "end_line": 1093,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 49)",
        "(line 1081,col 9)-(line 1085,col 9)",
        "(line 1086,col 9)-(line 1086,col 55)",
        "(line 1087,col 9)-(line 1087,col 88)",
        "(line 1088,col 9)-(line 1088,col 55)",
        "(line 1089,col 9)-(line 1091,col 9)",
        "(line 1092,col 9)-(line 1092,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(double[])",
      "begin_line": 1106,
      "end_line": 1112,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 57)",
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 1125,
      "end_line": 1180,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1133,col 9)",
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1138,col 9)-(line 1138,col 51)",
        "(line 1139,col 9)-(line 1139,col 49)",
        "(line 1140,col 9)-(line 1140,col 46)",
        "(line 1143,col 9)-(line 1143,col 63)",
        "(line 1144,col 9)-(line 1149,col 9)",
        "(line 1152,col 9)-(line 1160,col 9)",
        "(line 1163,col 9)-(line 1176,col 9)",
        "(line 1178,col 9)-(line 1178,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.luDecompose()",
      "begin_line": 1200,
      "end_line": 1278,
      "comment": "\n     * Computes a new \n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decompostion\u003c/a\u003e for this matrix, storing the result for use by other methods. \n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algortithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1202,col 49)",
        "(line 1203,col 9)-(line 1203,col 52)",
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1207,col 28)",
        "(line 1210,col 9)-(line 1210,col 37)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 19)",
        "(line 1217,col 9)-(line 1276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.toString()",
      "begin_line": 1284,
      "end_line": 1305,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1286,col 46)",
        "(line 1287,col 9)-(line 1287,col 37)",
        "(line 1288,col 9)-(line 1302,col 9)",
        "(line 1303,col 9)-(line 1303,col 24)",
        "(line 1304,col 9)-(line 1304,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.equals(java.lang.Object)",
      "begin_line": 1316,
      "end_line": 1339,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eBigMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  BigDecimal.equals\n     * is used to compare corresponding entries.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1324,col 47)",
        "(line 1325,col 9)-(line 1325,col 44)",
        "(line 1326,col 9)-(line 1326,col 47)",
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1337,col 9)",
        "(line 1338,col 9)-(line 1338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.hashCode()",
      "begin_line": 1346,
      "end_line": 1361,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1348,col 20)",
        "(line 1349,col 9)-(line 1349,col 44)",
        "(line 1350,col 9)-(line 1350,col 47)",
        "(line 1351,col 9)-(line 1351,col 31)",
        "(line 1352,col 9)-(line 1352,col 31)",
        "(line 1353,col 9)-(line 1359,col 9)",
        "(line 1360,col 9)-(line 1360,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix()",
      "begin_line": 1392,
      "end_line": 1397,
      "comment": "\n     *  Returns the LU decomposition as a BigMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed; \n     *  otherwise the composition is computed and cached for use by other methods.   \n     *  Since a copy is returned in either case, changes to the returned matrix do not \n     *  affect the LU decomposition property. \n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition. \n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;   \n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\u003c/p\u003e\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     * \n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1          \n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8          \n     * \u003c/pre\u003e\n     * \n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\u003c/p\u003e\n     * \n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1393,col 9)-(line 1395,col 9)",
        "(line 1396,col 9)-(line 1396,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getPermutation()",
      "begin_line": 1411,
      "end_line": 1415,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\u003c/p\u003e\n     * \n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 54)",
        "(line 1413,col 9)-(line 1413,col 69)",
        "(line 1414,col 9)-(line 1414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyOut()",
      "begin_line": 1424,
      "end_line": 1432,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 49)",
        "(line 1426,col 9)-(line 1426,col 84)",
        "(line 1428,col 9)-(line 1430,col 9)",
        "(line 1431,col 9)-(line 1431,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.math.BigDecimal[][])",
      "begin_line": 1444,
      "end_line": 1446,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is emtpy or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1445,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(double[][])",
      "begin_line": 1453,
      "end_line": 1465,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1454,col 9)-(line 1454,col 36)",
        "(line 1455,col 9)-(line 1455,col 39)",
        "(line 1456,col 9)-(line 1456,col 44)",
        "(line 1457,col 9)-(line 1463,col 9)",
        "(line 1464,col 9)-(line 1464,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.lang.String[][])",
      "begin_line": 1473,
      "end_line": 1485,
      "comment": "\n     * Replaces data with BigDecimals represented by the strings in the input\n     * array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1474,col 36)",
        "(line 1475,col 9)-(line 1475,col 39)",
        "(line 1476,col 9)-(line 1476,col 44)",
        "(line 1477,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.checkRowIndex(int)",
      "begin_line": 1492,
      "end_line": 1498,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1493,col 9)-(line 1497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.checkColumnIndex(int)",
      "begin_line": 1505,
      "end_line": 1512,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1511,col 9)"
      ]
    }
  ]
}
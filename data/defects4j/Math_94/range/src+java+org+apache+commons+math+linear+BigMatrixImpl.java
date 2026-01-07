{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/linear/BigMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.BigMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 1499,
      "comment": "\n * Implementation of {@link BigMatrix} using a BigDecimal[][] array to store entries\n * and \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decompostion\u003c/a\u003e to support linear system \n * solution and inverse.\n * \u003cp\u003e\n * The LU decompostion is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n* \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is stored and reused on subsequent calls.  If matrix\n * data are modified using any of the public setXxx methods, the saved\n * decomposition is discarded.  If data are modified via references to the\n * underlying array obtained using \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored\n * LU decomposition will not be discarded.  In this case, you need to\n * explicitly invoke \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link BigMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Entries of the matrix "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Entries of cached LU decomposition.\n     *  All updates to data (other than luDecompose()) *must* set this to null\n     "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "parity"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "roundingMode"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Rounding mode for divisions *"
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "* BigDecimal scale **"
    },
    {
      "type": "field",
      "varNames": [
        "TOO_SMALL"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " BigDecimal 0 "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " BigDecimal 1 "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl()",
      "begin_line": 88,
      "end_line": 89,
      "comment": " \n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(int, int)",
      "begin_line": 99,
      "end_line": 106,
      "comment": "\n     * Create a new BigMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension      the number of rows in the new matrix\n     * @param columnDimension   the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 61)",
        "(line 105,col 9)-(line 105,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][])",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #BigMatrixImpl(BigDecimal[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 23)",
        "(line 122,col 9)-(line 122,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][], boolean)",
      "begin_line": 140,
      "end_line": 163,
      "comment": "\n     * Create a new BigMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #BigMatrixImpl(BigDecimal[][])\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(double[][])",
      "begin_line": 176,
      "end_line": 195,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003eSince the underlying array will hold \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * instances, it will be created.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 38)",
        "(line 183,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 23)",
        "(line 194,col 9)-(line 194,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.lang.String[][])",
      "begin_line": 206,
      "end_line": 225,
      "comment": "\n     * Create a new BigMatrix using the values represented by the strings in \n     * \u003ccode\u003ed\u003c/code\u003e as the underlying data array.\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 35)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 38)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 23)",
        "(line 224,col 9)-(line 224,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[])",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\n     * Create a new (column) BigMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix \n     * created.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)",
        "(line 238,col 9)-(line 238,col 40)",
        "(line 239,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copy()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Create a new BigMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 260,
      "end_line": 279,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 288,
      "end_line": 304,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 50)",
        "(line 290,col 9)-(line 290,col 53)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 77)",
        "(line 295,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 313,
      "end_line": 332,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 341,
      "end_line": 357,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 50)",
        "(line 343,col 9)-(line 343,col 53)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 77)",
        "(line 348,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(java.math.BigDecimal)",
      "begin_line": 365,
      "end_line": 377,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 50)",
        "(line 367,col 9)-(line 367,col 53)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(java.math.BigDecimal)",
      "begin_line": 384,
      "end_line": 396,
      "comment": "\n     * Returns the result of multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 50)",
        "(line 386,col 9)-(line 386,col 53)",
        "(line 387,col 9)-(line 387,col 77)",
        "(line 388,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 405,
      "end_line": 429,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrixImpl)",
      "begin_line": 438,
      "end_line": 458,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 443,col 49)",
        "(line 444,col 9)-(line 444,col 51)",
        "(line 445,col 9)-(line 445,col 68)",
        "(line 446,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getData()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray()",
      "begin_line": 490,
      "end_line": 500,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data converted to\n     * \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 44)",
        "(line 492,col 9)-(line 492,col 47)",
        "(line 493,col 9)-(line 493,col 54)",
        "(line 494,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataRef()",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRoundingMode()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@link java.math.BigDecimal#ROUND_HALF_UP}\n     * @see BigDecimal\n     * @return the rounding mode.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setRoundingMode(int)",
      "begin_line": 528,
      "end_line": 530,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @see BigDecimal\n     * @param roundingMode rounding mode for decimal divisions\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getScale()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @see BigDecimal\n     * @return the scale\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setScale(int)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "*\n     * Sets the scale for division operations.\n     * @see BigDecimal\n     * @param scale scale for division operations\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getNorm()",
      "begin_line": 557,
      "end_line": 567,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 36)",
        "(line 559,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 581,
      "end_line": 609,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 32)",
        "(line 586,col 9)-(line 586,col 30)",
        "(line 587,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 38)",
        "(line 593,col 9)-(line 593,col 36)",
        "(line 594,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 600,col 79)",
        "(line 601,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 622,
      "end_line": 653,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 633,col 72)",
        "(line 634,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(java.math.BigDecimal[][], int, int)",
      "begin_line": 682,
      "end_line": 724,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 43)",
        "(line 686,col 9)-(line 686,col 46)",
        "(line 688,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 722,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(int)",
      "begin_line": 734,
      "end_line": 740,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 27)",
        "(line 736,col 9)-(line 736,col 52)",
        "(line 737,col 9)-(line 737,col 60)",
        "(line 738,col 9)-(line 738,col 57)",
        "(line 739,col 9)-(line 739,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix(int)",
      "begin_line": 750,
      "end_line": 758,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 33)",
        "(line 752,col 9)-(line 752,col 49)",
        "(line 753,col 9)-(line 753,col 60)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRow(int)",
      "begin_line": 770,
      "end_line": 776,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 27)",
        "(line 772,col 9)-(line 772,col 52)",
        "(line 773,col 9)-(line 773,col 55)",
        "(line 774,col 9)-(line 774,col 54)",
        "(line 775,col 9)-(line 775,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(int)",
      "begin_line": 789,
      "end_line": 797,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 27)",
        "(line 791,col 9)-(line 791,col 52)",
        "(line 792,col 9)-(line 792,col 47)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumn(int)",
      "begin_line": 809,
      "end_line": 817,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 30)",
        "(line 811,col 9)-(line 811,col 49)",
        "(line 812,col 9)-(line 812,col 55)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(int)",
      "begin_line": 830,
      "end_line": 838,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 30)",
        "(line 832,col 9)-(line 832,col 49)",
        "(line 833,col 9)-(line 833,col 47)",
        "(line 834,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntry(int, int)",
      "begin_line": 855,
      "end_line": 866,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched  \n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 865,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble(int, int)",
      "begin_line": 884,
      "end_line": 886,
      "comment": "\n     * Returns the entry in the specified row and column as a double.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row\n     * or column index is not valid\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.transpose()",
      "begin_line": 893,
      "end_line": 904,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 49)",
        "(line 895,col 9)-(line 895,col 52)",
        "(line 896,col 9)-(line 896,col 68)",
        "(line 897,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.inverse()",
      "begin_line": 912,
      "end_line": 914,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     * \n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDeterminant()",
      "begin_line": 922,
      "end_line": 935,
      "comment": "\n     * Returns the determinant of this matrix.\n     *\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSquare()",
      "begin_line": 941,
      "end_line": 943,
      "comment": "\n     * Is this a square matrix?\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSingular()",
      "begin_line": 949,
      "end_line": 960,
      "comment": "\n     * Is this a singular matrix?\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 959,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowDimension()",
      "begin_line": 967,
      "end_line": 969,
      "comment": "\n     * Returns the number of rows in the matrix.\n     *\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension()",
      "begin_line": 976,
      "end_line": 978,
      "comment": "\n     * Returns the number of columns in the matrix.\n     *\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getTrace()",
      "begin_line": 988,
      "end_line": 997,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * \n     * @throws IllegalArgumentException if this matrix is not square.\n     ",
      "child_ranges": [
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 38)",
        "(line 993,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 996,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(java.math.BigDecimal[])",
      "begin_line": 1006,
      "end_line": 1021,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1010,col 49)",
        "(line 1011,col 9)-(line 1011,col 52)",
        "(line 1012,col 9)-(line 1012,col 55)",
        "(line 1013,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1020,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(double[])",
      "begin_line": 1030,
      "end_line": 1036,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 57)",
        "(line 1032,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1035,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(java.math.BigDecimal[])",
      "begin_line": 1045,
      "end_line": 1060,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 49)",
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 52)",
        "(line 1051,col 9)-(line 1051,col 55)",
        "(line 1052,col 9)-(line 1058,col 9)",
        "(line 1059,col 9)-(line 1059,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(java.math.BigDecimal[])",
      "begin_line": 1073,
      "end_line": 1085,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 49)",
        "(line 1075,col 9)-(line 1077,col 9)",
        "(line 1078,col 9)-(line 1078,col 55)",
        "(line 1079,col 9)-(line 1079,col 88)",
        "(line 1080,col 9)-(line 1080,col 55)",
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(double[])",
      "begin_line": 1098,
      "end_line": 1104,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 57)",
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1103,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 1117,
      "end_line": 1170,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1120,col 9)",
        "(line 1121,col 9)-(line 1123,col 9)",
        "(line 1124,col 9)-(line 1126,col 9)",
        "(line 1128,col 9)-(line 1128,col 51)",
        "(line 1129,col 9)-(line 1129,col 49)",
        "(line 1130,col 9)-(line 1130,col 46)",
        "(line 1133,col 9)-(line 1133,col 63)",
        "(line 1134,col 9)-(line 1139,col 9)",
        "(line 1142,col 9)-(line 1150,col 9)",
        "(line 1153,col 9)-(line 1166,col 9)",
        "(line 1168,col 9)-(line 1168,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.luDecompose()",
      "begin_line": 1190,
      "end_line": 1268,
      "comment": "\n     * Computes a new \n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decompostion\u003c/a\u003e for this matrix, storing the result for use by other methods. \n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algortithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 49)",
        "(line 1193,col 9)-(line 1193,col 52)",
        "(line 1194,col 9)-(line 1196,col 9)",
        "(line 1197,col 9)-(line 1197,col 28)",
        "(line 1200,col 9)-(line 1200,col 37)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 19)",
        "(line 1207,col 9)-(line 1266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.toString()",
      "begin_line": 1274,
      "end_line": 1294,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 46)",
        "(line 1276,col 9)-(line 1276,col 37)",
        "(line 1277,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1292,col 24)",
        "(line 1293,col 9)-(line 1293,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.equals(java.lang.Object)",
      "begin_line": 1305,
      "end_line": 1327,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eBigMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  BigDecimal.equals\n     * is used to compare corresponding entries.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1308,col 9)",
        "(line 1309,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1312,col 47)",
        "(line 1313,col 9)-(line 1313,col 44)",
        "(line 1314,col 9)-(line 1314,col 47)",
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1325,col 9)",
        "(line 1326,col 9)-(line 1326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.hashCode()",
      "begin_line": 1334,
      "end_line": 1348,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1335,col 20)",
        "(line 1336,col 9)-(line 1336,col 44)",
        "(line 1337,col 9)-(line 1337,col 47)",
        "(line 1338,col 9)-(line 1338,col 31)",
        "(line 1339,col 9)-(line 1339,col 31)",
        "(line 1340,col 9)-(line 1346,col 9)",
        "(line 1347,col 9)-(line 1347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix()",
      "begin_line": 1379,
      "end_line": 1384,
      "comment": "\n     *  Returns the LU decomposition as a BigMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed; \n     *  otherwise the composition is computed and cached for use by other methods.   \n     *  Since a copy is returned in either case, changes to the returned matrix do not \n     *  affect the LU decomposition property. \n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition. \n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;   \n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\u003c/p\u003e\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     * \n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1          \n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8          \n     * \u003c/pre\u003e\n     * \n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\u003c/p\u003e\n     * \n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1382,col 9)",
        "(line 1383,col 9)-(line 1383,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getPermutation()",
      "begin_line": 1398,
      "end_line": 1402,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\u003c/p\u003e\n     * \n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 54)",
        "(line 1400,col 9)-(line 1400,col 69)",
        "(line 1401,col 9)-(line 1401,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyOut()",
      "begin_line": 1411,
      "end_line": 1419,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 49)",
        "(line 1413,col 9)-(line 1413,col 84)",
        "(line 1415,col 9)-(line 1417,col 9)",
        "(line 1418,col 9)-(line 1418,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.math.BigDecimal[][])",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is emtpy or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(double[][])",
      "begin_line": 1440,
      "end_line": 1452,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 36)",
        "(line 1442,col 9)-(line 1442,col 39)",
        "(line 1443,col 9)-(line 1443,col 44)",
        "(line 1444,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.lang.String[][])",
      "begin_line": 1460,
      "end_line": 1472,
      "comment": "\n     * Replaces data with BigDecimals represented by the strings in the input\n     * array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 36)",
        "(line 1462,col 9)-(line 1462,col 39)",
        "(line 1463,col 9)-(line 1463,col 44)",
        "(line 1464,col 9)-(line 1470,col 9)",
        "(line 1471,col 9)-(line 1471,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.checkRowIndex(int)",
      "begin_line": 1479,
      "end_line": 1484,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1480,col 9)-(line 1483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.checkColumnIndex(int)",
      "begin_line": 1491,
      "end_line": 1497,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1493,col 9)-(line 1496,col 9)"
      ]
    }
  ]
}
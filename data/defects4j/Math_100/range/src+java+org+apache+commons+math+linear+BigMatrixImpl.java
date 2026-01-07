{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/linear/BigMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.BigMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 1320,
      "comment": "\n * Implementation of {@link BigMatrix} using a BigDecimal[][] array to store entries\n * and \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decompostion\u003c/a\u003e to support linear system \n * solution and inverse.\n * \u003cp\u003e\n * The LU decompostion is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n* \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is stored and reused on subsequent calls.  If matrix\n * data are modified using any of the public setXxx methods, the saved\n * decomposition is discarded.  If data are modified via references to the\n * underlying array obtained using \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored\n * LU decomposition will not be discarded.  In this case, you need to\n * explicitly invoke \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link BigMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serialization id "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Entries of the matrix "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Entries of cached LU decomposition.\n     *  All updates to data (other than luDecompose()) *must* set this to null\n     "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "parity"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "roundingMode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Rounding mode for divisions *"
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "* BigDecimal scale **"
    },
    {
      "type": "field",
      "varNames": [
        "TOO_SMALL"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " BigDecimal 0 "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " BigDecimal 1 "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl()",
      "begin_line": 86,
      "end_line": 87,
      "comment": " \n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(int, int)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Create a new BigMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension      the number of rows in the new matrix\n     * @param columnDimension   the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 61)",
        "(line 103,col 9)-(line 103,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[][])",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 23)",
        "(line 119,col 9)-(line 119,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(double[][])",
      "begin_line": 133,
      "end_line": 152,
      "comment": "\n     * Create a new BigMatrix using \u003ccode\u003ed\u003c/code\u003e as the underlying\n     * data array.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 32)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 23)",
        "(line 151,col 9)-(line 151,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.lang.String[][])",
      "begin_line": 163,
      "end_line": 182,
      "comment": "\n     * Create a new BigMatrix using the values represented by the strings in \n     * \u003ccode\u003ed\u003c/code\u003e as the underlying data array.\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 23)",
        "(line 181,col 9)-(line 181,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.BigMatrixImpl(java.math.BigDecimal[])",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Create a new (column) BigMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix \n     * created.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 29)",
        "(line 195,col 9)-(line 195,col 40)",
        "(line 196,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copy()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Create a new BigMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.add(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 217,
      "end_line": 231,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @exception  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 46)",
        "(line 223,col 9)-(line 223,col 52)",
        "(line 224,col 9)-(line 224,col 71)",
        "(line 225,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.subtract(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 240,
      "end_line": 254,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @exception  IllegalArgumentException if m is not the same size as *this\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 46)",
        "(line 246,col 9)-(line 246,col 52)",
        "(line 247,col 9)-(line 247,col 71)",
        "(line 248,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(java.math.BigDecimal)",
      "begin_line": 262,
      "end_line": 272,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 46)",
        "(line 264,col 9)-(line 264,col 52)",
        "(line 265,col 9)-(line 265,col 71)",
        "(line 266,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(java.math.BigDecimal)",
      "begin_line": 279,
      "end_line": 289,
      "comment": "\n     * Returns the result multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 46)",
        "(line 281,col 9)-(line 281,col 52)",
        "(line 282,col 9)-(line 282,col 71)",
        "(line 283,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.multiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 298,
      "end_line": 317,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 43)",
        "(line 304,col 9)-(line 304,col 45)",
        "(line 305,col 9)-(line 305,col 62)",
        "(line 306,col 9)-(line 306,col 30)",
        "(line 307,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getData()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray()",
      "begin_line": 349,
      "end_line": 359,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data converted to\n     * \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 38)",
        "(line 351,col 9)-(line 351,col 41)",
        "(line 352,col 9)-(line 352,col 48)",
        "(line 353,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDataRef()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRoundingMode()",
      "begin_line": 378,
      "end_line": 380,
      "comment": "*\n     * Gets the rounding mode for division operations\n     * The default is {@link java.math.BigDecimal#ROUND_HALF_UP}\n     * @see BigDecimal\n     * @return the rounding mode.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setRoundingMode(int)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "*\n     * Sets the rounding mode for decimal divisions.\n     * @see BigDecimal\n     * @param roundingMode rounding mode for decimal divisions\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getScale()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "*\n     * Sets the scale for division operations.\n     * The default is 64\n     * @see BigDecimal\n     * @return the scale\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setScale(int)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "*\n     * Sets the scale for division operations.\n     * @see BigDecimal\n     * @param scale scale for division operations\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getNorm()",
      "begin_line": 416,
      "end_line": 426,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 36)",
        "(line 418,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 440,
      "end_line": 457,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 449,col 43)",
        "(line 450,col 9)-(line 450,col 62)",
        "(line 451,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 470,
      "end_line": 490,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 477,col 40)",
        "(line 478,col 9)-(line 478,col 62)",
        "(line 479,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(java.math.BigDecimal[][], int, int)",
      "begin_line": 519,
      "end_line": 555,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 37)",
        "(line 526,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 40)",
        "(line 531,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 550,col 53)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(int)",
      "begin_line": 565,
      "end_line": 573,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 46)",
        "(line 570,col 9)-(line 570,col 54)",
        "(line 571,col 9)-(line 571,col 57)",
        "(line 572,col 9)-(line 572,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix(int)",
      "begin_line": 583,
      "end_line": 593,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 43)",
        "(line 588,col 9)-(line 588,col 54)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRow(int)",
      "begin_line": 605,
      "end_line": 613,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 46)",
        "(line 610,col 9)-(line 610,col 49)",
        "(line 611,col 9)-(line 611,col 54)",
        "(line 612,col 9)-(line 612,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(int)",
      "begin_line": 626,
      "end_line": 636,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 46)",
        "(line 631,col 9)-(line 631,col 41)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumn(int)",
      "begin_line": 648,
      "end_line": 658,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 43)",
        "(line 653,col 9)-(line 653,col 49)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(int)",
      "begin_line": 671,
      "end_line": 681,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 43)",
        "(line 676,col 9)-(line 676,col 41)",
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntry(int, int)",
      "begin_line": 698,
      "end_line": 704,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched  \n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble(int, int)",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\n     * Returns the entry in the specified row and column as a double.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row\n     * or column index is not valid\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.transpose()",
      "begin_line": 731,
      "end_line": 742,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 43)",
        "(line 733,col 9)-(line 733,col 46)",
        "(line 734,col 9)-(line 734,col 60)",
        "(line 735,col 9)-(line 735,col 50)",
        "(line 736,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.inverse()",
      "begin_line": 750,
      "end_line": 753,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     * \n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 752,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getDeterminant()",
      "begin_line": 761,
      "end_line": 774,
      "comment": "\n     * Returns the determinant of this matrix.\n     *\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSquare()",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * Is this a square matrix?\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isSingular()",
      "begin_line": 788,
      "end_line": 799,
      "comment": "\n     * Is this a singular matrix?\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 798,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getRowDimension()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * Returns the number of rows in the matrix.\n     *\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension()",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n     * Returns the number of columns in the matrix.\n     *\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getTrace()",
      "begin_line": 827,
      "end_line": 836,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * \n     * @throws IllegalArgumentException if this matrix is not square.\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 38)",
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(java.math.BigDecimal[])",
      "begin_line": 845,
      "end_line": 860,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 43)",
        "(line 850,col 9)-(line 850,col 46)",
        "(line 851,col 9)-(line 851,col 52)",
        "(line 852,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.operate(double[])",
      "begin_line": 869,
      "end_line": 875,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 51)",
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.preMultiply(java.math.BigDecimal[])",
      "begin_line": 884,
      "end_line": 899,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 43)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 46)",
        "(line 890,col 9)-(line 890,col 49)",
        "(line 891,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(java.math.BigDecimal[])",
      "begin_line": 912,
      "end_line": 924,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 43)",
        "(line 914,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 49)",
        "(line 918,col 9)-(line 918,col 82)",
        "(line 919,col 9)-(line 919,col 49)",
        "(line 920,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(double[])",
      "begin_line": 937,
      "end_line": 943,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  array of constants forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 51)",
        "(line 939,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.solve(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 956,
      "end_line": 1002,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 967,col 45)",
        "(line 968,col 9)-(line 968,col 43)",
        "(line 969,col 9)-(line 969,col 40)",
        "(line 972,col 9)-(line 972,col 57)",
        "(line 973,col 9)-(line 977,col 9)",
        "(line 980,col 9)-(line 986,col 9)",
        "(line 989,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1000,col 53)",
        "(line 1001,col 9)-(line 1001,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.luDecompose()",
      "begin_line": 1022,
      "end_line": 1096,
      "comment": "\n     * Computes a new \n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decompostion\u003c/a\u003e for this matrix, storing the result for use by other methods. \n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algortithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 43)",
        "(line 1025,col 9)-(line 1025,col 46)",
        "(line 1026,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1029,col 28)",
        "(line 1032,col 9)-(line 1032,col 37)",
        "(line 1033,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1036,col 19)",
        "(line 1039,col 9)-(line 1094,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.toString()",
      "begin_line": 1102,
      "end_line": 1120,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1103,col 9)-(line 1103,col 46)",
        "(line 1104,col 9)-(line 1104,col 37)",
        "(line 1105,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1118,col 24)",
        "(line 1119,col 9)-(line 1119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.equals(java.lang.Object)",
      "begin_line": 1131,
      "end_line": 1152,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eBigMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  BigDecimal.equals\n     * is used to compare corresponding entries.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1137,col 9)",
        "(line 1138,col 9)-(line 1138,col 41)",
        "(line 1139,col 9)-(line 1139,col 38)",
        "(line 1140,col 9)-(line 1140,col 41)",
        "(line 1141,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.hashCode()",
      "begin_line": 1159,
      "end_line": 1172,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1160,col 20)",
        "(line 1161,col 9)-(line 1161,col 38)",
        "(line 1162,col 9)-(line 1162,col 41)",
        "(line 1163,col 9)-(line 1163,col 31)",
        "(line 1164,col 9)-(line 1164,col 31)",
        "(line 1165,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getIdentity(int)",
      "begin_line": 1184,
      "end_line": 1186,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @deprecated  use {@link MatrixUtils#createBigIdentityMatrix}\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix()",
      "begin_line": 1215,
      "end_line": 1220,
      "comment": "\n     *  Returns the LU decomposition as a BigMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed; \n     *  otherwise the composition is computed and cached for use by other methods.   \n     *  Since a copy is returned in either case, changes to the returned matrix do not \n     *  affect the LU decomposition property. \n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition. \n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;   \n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\u003c/p\u003e\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     * \n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1          \n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8          \n     * \u003c/pre\u003e\n     * \n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\u003c/p\u003e\n     * \n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1219,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.getPermutation()",
      "begin_line": 1234,
      "end_line": 1238,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\u003c/p\u003e\n     * \n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 48)",
        "(line 1236,col 9)-(line 1236,col 69)",
        "(line 1237,col 9)-(line 1237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyOut()",
      "begin_line": 1247,
      "end_line": 1255,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 1248,col 9)-(line 1248,col 43)",
        "(line 1249,col 9)-(line 1249,col 78)",
        "(line 1251,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.math.BigDecimal[][])",
      "begin_line": 1267,
      "end_line": 1269,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is emtpy or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1268,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(double[][])",
      "begin_line": 1276,
      "end_line": 1286,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 30)",
        "(line 1278,col 9)-(line 1278,col 33)",
        "(line 1279,col 9)-(line 1279,col 44)",
        "(line 1280,col 9)-(line 1284,col 9)",
        "(line 1285,col 9)-(line 1285,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.copyIn(java.lang.String[][])",
      "begin_line": 1294,
      "end_line": 1304,
      "comment": "\n     * Replaces data with BigDecimals represented by the strings in the input\n     * array.\n     *\n     * @param in data to copy in\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 30)",
        "(line 1296,col 9)-(line 1296,col 33)",
        "(line 1297,col 9)-(line 1297,col 44)",
        "(line 1298,col 9)-(line 1302,col 9)",
        "(line 1303,col 9)-(line 1303,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(int, int)",
      "begin_line": 1313,
      "end_line": 1318,
      "comment": "\n     * Tests a given coordinate as being valid or invalid\n     *\n     * @param row the row index.\n     * @param col the column index.\n     * @return true if the coordinate is with the current dimensions\n     ",
      "child_ranges": [
        "(line 1314,col 9)-(line 1314,col 43)",
        "(line 1315,col 9)-(line 1315,col 46)",
        "(line 1317,col 9)-(line 1317,col 69)"
      ]
    }
  ]
}
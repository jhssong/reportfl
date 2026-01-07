{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/linear/RealMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 1035,
      "comment": "\n * Implementation of RealMatrix using a double[][] array to store entries and\n * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decompostion\u003c/a\u003e to support linear system\n * solution and inverse.\n * \u003cp\u003e\n * The LU decompostion is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is cached and reused on subsequent calls.   \n * If data are modified via references to the underlying array obtained using\n * \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored LU decomposition will not be\n * discarded.  In this case, you need to explicitly invoke \n * \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link RealMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable version identifier "
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
      "comment": " Permutation associated with LU decompostion "
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
        "TOO_SMALL"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl()",
      "begin_line": 75,
      "end_line": 76,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(int, int)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 57)",
        "(line 92,col 9)-(line 92,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][])",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 23)",
        "(line 108,col 9)-(line 108,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[])",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 29)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copy()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Create a new RealMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 144,
      "end_line": 158,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 46)",
        "(line 150,col 9)-(line 150,col 52)",
        "(line 151,col 9)-(line 151,col 63)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 167,
      "end_line": 181,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as *this\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 52)",
        "(line 174,col 9)-(line 174,col 63)",
        "(line 175,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.scalarAdd(double)",
      "begin_line": 189,
      "end_line": 199,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 46)",
        "(line 191,col 9)-(line 191,col 52)",
        "(line 192,col 9)-(line 192,col 63)",
        "(line 193,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply(double)",
      "begin_line": 206,
      "end_line": 216,
      "comment": "\n     * Returns the result multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 46)",
        "(line 208,col 9)-(line 208,col 52)",
        "(line 209,col 9)-(line 209,col 63)",
        "(line 210,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 225,
      "end_line": 244,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 43)",
        "(line 230,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 231,col 45)",
        "(line 232,col 9)-(line 232,col 54)",
        "(line 233,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getData()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDataRef()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getNorm()",
      "begin_line": 283,
      "end_line": 293,
      "comment": "\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 29)",
        "(line 285,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 307,
      "end_line": 324,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 316,col 43)",
        "(line 317,col 9)-(line 317,col 58)",
        "(line 318,col 9)-(line 322,col 13)",
        "(line 323,col 9)-(line 323,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 337,
      "end_line": 357,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 344,col 40)",
        "(line 345,col 9)-(line 345,col 58)",
        "(line 346,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(double[][], int, int)",
      "begin_line": 386,
      "end_line": 422,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 37)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 417,col 61)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(int)",
      "begin_line": 432,
      "end_line": 440,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as a row matrix.\n     * Row indices start at 0.\n     * \n     * @param row  the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 46)",
        "(line 437,col 9)-(line 437,col 46)",
        "(line 438,col 9)-(line 438,col 57)",
        "(line 439,col 9)-(line 439,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix(int)",
      "begin_line": 450,
      "end_line": 460,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 43)",
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRow(int)",
      "begin_line": 472,
      "end_line": 480,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 46)",
        "(line 477,col 9)-(line 477,col 41)",
        "(line 478,col 9)-(line 478,col 54)",
        "(line 479,col 9)-(line 479,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumn(int)",
      "begin_line": 492,
      "end_line": 502,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 43)",
        "(line 497,col 9)-(line 497,col 41)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getEntry(int, int)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\n     * \n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.transpose()",
      "begin_line": 532,
      "end_line": 543,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 43)",
        "(line 534,col 9)-(line 534,col 46)",
        "(line 535,col 9)-(line 535,col 62)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.inverse()",
      "begin_line": 551,
      "end_line": 554,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     *\n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 553,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDeterminant()",
      "begin_line": 560,
      "end_line": 573,
      "comment": "\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isSquare()",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isSingular()",
      "begin_line": 585,
      "end_line": 596,
      "comment": "\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowDimension()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getTrace()",
      "begin_line": 616,
      "end_line": 625,
      "comment": "\n     * @return trace\n     * @throws IllegalArgumentException if the matrix is not square\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 34)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(double[])",
      "begin_line": 632,
      "end_line": 647,
      "comment": "\n     * @param v vector to operate on\n     * @throws IllegalArgumentException if columnDimension !\u003d v.length\n     * @return resulting vector\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 43)",
        "(line 637,col 9)-(line 637,col 46)",
        "(line 638,col 9)-(line 638,col 44)",
        "(line 639,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(double[])",
      "begin_line": 654,
      "end_line": 669,
      "comment": "\n     * @param v vector to premultiply by\n     * @throws IllegalArgumentException if rowDimension !\u003d v.length\n     * @return resulting matrix\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 43)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 46)",
        "(line 660,col 9)-(line 660,col 41)",
        "(line 661,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(double[])",
      "begin_line": 682,
      "end_line": 694,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  array of constant forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 43)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 51)",
        "(line 688,col 9)-(line 688,col 79)",
        "(line 689,col 9)-(line 689,col 41)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 707,
      "end_line": 753,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 718,col 45)",
        "(line 719,col 9)-(line 719,col 43)",
        "(line 720,col 9)-(line 720,col 40)",
        "(line 723,col 9)-(line 723,col 49)",
        "(line 724,col 9)-(line 728,col 9)",
        "(line 731,col 9)-(line 737,col 9)",
        "(line 740,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 55)",
        "(line 752,col 9)-(line 752,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.luDecompose()",
      "begin_line": 773,
      "end_line": 845,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decompostion\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algortithm\u003c/a\u003e, with partial pivoting.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 43)",
        "(line 776,col 9)-(line 776,col 46)",
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 28)",
        "(line 783,col 9)-(line 783,col 37)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 787,col 19)",
        "(line 790,col 9)-(line 844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.toString()",
      "begin_line": 851,
      "end_line": 869,
      "comment": "\n     *\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 46)",
        "(line 853,col 9)-(line 853,col 38)",
        "(line 854,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 24)",
        "(line 868,col 9)-(line 868,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.equals(java.lang.Object)",
      "begin_line": 880,
      "end_line": 902,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eRealMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  Corresponding entries\n     * are compared using {@link java.lang.Double#doubleToLongBits(double)}\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 43)",
        "(line 888,col 9)-(line 888,col 38)",
        "(line 889,col 9)-(line 889,col 41)",
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.hashCode()",
      "begin_line": 909,
      "end_line": 922,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 20)",
        "(line 911,col 9)-(line 911,col 38)",
        "(line 912,col 9)-(line 912,col 41)",
        "(line 913,col 9)-(line 913,col 31)",
        "(line 914,col 9)-(line 914,col 31)",
        "(line 915,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getIdentity(int)",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException  if dimension is not positive\n     * @deprecated use {@link MatrixUtils#createRealIdentityMatrix}\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix()",
      "begin_line": 965,
      "end_line": 970,
      "comment": "\n     *  Returns the LU decomposition as a RealMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed;\n     *  otherwise the composition is computed and cached for use by other methods.\n     *  Since a copy is returned in either case, changes to the returned matrix do not\n     *  affect the LU decomposition property.\n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition.\n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;\n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     *\n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1\n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8\n     * \u003c/pre\u003e\n     *\n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\n     *\n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getPermutation()",
      "begin_line": 984,
      "end_line": 988,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\n     *\n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 48)",
        "(line 986,col 9)-(line 986,col 69)",
        "(line 987,col 9)-(line 987,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyOut()",
      "begin_line": 997,
      "end_line": 1005,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 43)",
        "(line 999,col 9)-(line 999,col 70)",
        "(line 1001,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyIn(double[][])",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is emtpy or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(int, int)",
      "begin_line": 1028,
      "end_line": 1033,
      "comment": "\n     * Tests a given coordinate as being valid or invalid\n     *\n     * @param row the row index.\n     * @param col the column index.\n     * @return true if the coordinate is with the current dimensions\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 43)",
        "(line 1030,col 9)-(line 1030,col 46)",
        "(line 1032,col 9)-(line 1032,col 74)"
      ]
    }
  ]
}
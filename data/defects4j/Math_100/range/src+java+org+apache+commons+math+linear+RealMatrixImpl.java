{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/linear/RealMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 1037,
      "comment": "\n * Implementation of RealMatrix using a double[][] array to store entries and\n * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decomposition\u003c/a\u003e to support linear system\n * solution and inverse.\n * \u003cp\u003e\n * The LU decomposition is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is cached and reused on subsequent calls.   \n * If data are modified via references to the underlying array obtained using\n * \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored LU decomposition will not be\n * discarded.  In this case, you need to explicitly invoke \n * \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link RealMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Serializable version identifier "
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
        "TOO_SMALL"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl()",
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(int, int)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 94,col 9)-(line 94,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][])",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 23)",
        "(line 110,col 9)-(line 110,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[])",
      "begin_line": 122,
      "end_line": 128,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 29)",
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copy()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Create a new RealMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 146,
      "end_line": 160,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 46)",
        "(line 152,col 9)-(line 152,col 52)",
        "(line 153,col 9)-(line 153,col 63)",
        "(line 154,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 169,
      "end_line": 183,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 46)",
        "(line 175,col 9)-(line 175,col 52)",
        "(line 176,col 9)-(line 176,col 63)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.scalarAdd(double)",
      "begin_line": 191,
      "end_line": 201,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 46)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 63)",
        "(line 195,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply(double)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "\n     * Returns the result multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 46)",
        "(line 210,col 9)-(line 210,col 52)",
        "(line 211,col 9)-(line 211,col 63)",
        "(line 212,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 227,
      "end_line": 246,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 232,col 43)",
        "(line 233,col 9)-(line 233,col 45)",
        "(line 234,col 9)-(line 234,col 54)",
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getData()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDataRef()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getNorm()",
      "begin_line": 285,
      "end_line": 295,
      "comment": "\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 29)",
        "(line 287,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 309,
      "end_line": 326,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 58)",
        "(line 320,col 9)-(line 324,col 13)",
        "(line 325,col 9)-(line 325,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 339,
      "end_line": 359,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 346,col 40)",
        "(line 347,col 9)-(line 347,col 58)",
        "(line 348,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(double[][], int, int)",
      "begin_line": 388,
      "end_line": 424,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 37)",
        "(line 395,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 40)",
        "(line 400,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 419,col 61)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(int)",
      "begin_line": 434,
      "end_line": 442,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as a row matrix.\n     * Row indices start at 0.\n     * \n     * @param row  the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 46)",
        "(line 439,col 9)-(line 439,col 46)",
        "(line 440,col 9)-(line 440,col 57)",
        "(line 441,col 9)-(line 441,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix(int)",
      "begin_line": 452,
      "end_line": 462,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 43)",
        "(line 457,col 9)-(line 457,col 46)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRow(int)",
      "begin_line": 474,
      "end_line": 482,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 46)",
        "(line 479,col 9)-(line 479,col 41)",
        "(line 480,col 9)-(line 480,col 54)",
        "(line 481,col 9)-(line 481,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumn(int)",
      "begin_line": 494,
      "end_line": 504,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 43)",
        "(line 499,col 9)-(line 499,col 41)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getEntry(int, int)",
      "begin_line": 521,
      "end_line": 527,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.transpose()",
      "begin_line": 534,
      "end_line": 545,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 43)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 537,col 62)",
        "(line 538,col 9)-(line 538,col 46)",
        "(line 539,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.inverse()",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     *\n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 555,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDeterminant()",
      "begin_line": 562,
      "end_line": 575,
      "comment": "\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 574,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isSquare()",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isSingular()",
      "begin_line": 587,
      "end_line": 598,
      "comment": "\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 597,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowDimension()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getTrace()",
      "begin_line": 618,
      "end_line": 627,
      "comment": "\n     * @return trace\n     * @throws IllegalArgumentException if the matrix is not square\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 34)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(double[])",
      "begin_line": 634,
      "end_line": 649,
      "comment": "\n     * @param v vector to operate on\n     * @throws IllegalArgumentException if columnDimension !\u003d v.length\n     * @return resulting vector\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 43)",
        "(line 639,col 9)-(line 639,col 46)",
        "(line 640,col 9)-(line 640,col 44)",
        "(line 641,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(double[])",
      "begin_line": 656,
      "end_line": 671,
      "comment": "\n     * @param v vector to premultiply by\n     * @throws IllegalArgumentException if rowDimension !\u003d v.length\n     * @return resulting matrix\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 43)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 46)",
        "(line 662,col 9)-(line 662,col 41)",
        "(line 663,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(double[])",
      "begin_line": 684,
      "end_line": 696,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  array of constant forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 43)",
        "(line 686,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 51)",
        "(line 690,col 9)-(line 690,col 79)",
        "(line 691,col 9)-(line 691,col 41)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 709,
      "end_line": 755,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 45)",
        "(line 721,col 9)-(line 721,col 43)",
        "(line 722,col 9)-(line 722,col 40)",
        "(line 725,col 9)-(line 725,col 49)",
        "(line 726,col 9)-(line 730,col 9)",
        "(line 733,col 9)-(line 739,col 9)",
        "(line 742,col 9)-(line 751,col 9)",
        "(line 753,col 9)-(line 753,col 55)",
        "(line 754,col 9)-(line 754,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.luDecompose()",
      "begin_line": 775,
      "end_line": 847,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 43)",
        "(line 778,col 9)-(line 778,col 46)",
        "(line 779,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 28)",
        "(line 785,col 9)-(line 785,col 37)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 19)",
        "(line 792,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.toString()",
      "begin_line": 853,
      "end_line": 871,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 46)",
        "(line 855,col 9)-(line 855,col 38)",
        "(line 856,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 24)",
        "(line 870,col 9)-(line 870,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.equals(java.lang.Object)",
      "begin_line": 882,
      "end_line": 904,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eRealMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  Corresponding entries\n     * are compared using {@link java.lang.Double#doubleToLongBits(double)}\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 43)",
        "(line 890,col 9)-(line 890,col 38)",
        "(line 891,col 9)-(line 891,col 41)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.hashCode()",
      "begin_line": 911,
      "end_line": 924,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 20)",
        "(line 913,col 9)-(line 913,col 38)",
        "(line 914,col 9)-(line 914,col 41)",
        "(line 915,col 9)-(line 915,col 31)",
        "(line 916,col 9)-(line 916,col 31)",
        "(line 917,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getIdentity(int)",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException  if dimension is not positive\n     * @deprecated use {@link MatrixUtils#createRealIdentityMatrix}\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix()",
      "begin_line": 967,
      "end_line": 972,
      "comment": "\n     *  Returns the LU decomposition as a RealMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed;\n     *  otherwise the composition is computed and cached for use by other methods.\n     *  Since a copy is returned in either case, changes to the returned matrix do not\n     *  affect the LU decomposition property.\n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition.\n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;\n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\u003c/p\u003e\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     *\n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1\n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8\n     * \u003c/pre\u003e\n     *\n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\u003c/p\u003e\n     *\n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 971,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getPermutation()",
      "begin_line": 986,
      "end_line": 990,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\u003c/p\u003e\n     *\n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 48)",
        "(line 988,col 9)-(line 988,col 69)",
        "(line 989,col 9)-(line 989,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyOut()",
      "begin_line": 999,
      "end_line": 1007,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 43)",
        "(line 1001,col 9)-(line 1001,col 70)",
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1006,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyIn(double[][])",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(int, int)",
      "begin_line": 1030,
      "end_line": 1035,
      "comment": "\n     * Tests a given coordinate as being valid or invalid\n     *\n     * @param row the row index.\n     * @param col the column index.\n     * @return true if the coordinate is with the current dimensions\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 43)",
        "(line 1032,col 9)-(line 1032,col 46)",
        "(line 1034,col 9)-(line 1034,col 74)"
      ]
    }
  ]
}
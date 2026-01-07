{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/RealMatrixImpl.java",
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
      "end_line": 1345,
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
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #RealMatrixImpl(double[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 18)",
        "(line 112,col 9)-(line 112,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][], boolean)",
      "begin_line": 130,
      "end_line": 153,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][])\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[])",
      "begin_line": 163,
      "end_line": 169,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 35)",
        "(line 165,col 9)-(line 165,col 36)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copy()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Create a new RealMatrix which is a copy of this.\n     *\n     * @return  the cloned matrix\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 187,
      "end_line": 206,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 215,
      "end_line": 231,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 50)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 69)",
        "(line 222,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 240,
      "end_line": 259,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 268,
      "end_line": 284,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 50)",
        "(line 270,col 9)-(line 270,col 53)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 69)",
        "(line 275,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.scalarAdd(double)",
      "begin_line": 292,
      "end_line": 304,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 50)",
        "(line 294,col 9)-(line 294,col 53)",
        "(line 295,col 9)-(line 295,col 69)",
        "(line 296,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply(double)",
      "begin_line": 311,
      "end_line": 323,
      "comment": "\n     * Returns the result of multiplying each entry of this by \u003ccode\u003ed\u003c/code\u003e\n     * @param d  value to multiply all entries by\n     * @return d * this\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 50)",
        "(line 313,col 9)-(line 313,col 53)",
        "(line 314,col 9)-(line 314,col 69)",
        "(line 315,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 332,
      "end_line": 356,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 365,
      "end_line": 385,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 370,col 49)",
        "(line 371,col 9)-(line 371,col 51)",
        "(line 372,col 9)-(line 372,col 60)",
        "(line 373,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * Returns the result of premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getData()",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     * \u003cp\u003e\n     * Makes a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDataRef()",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does not make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getNorm()",
      "begin_line": 424,
      "end_line": 434,
      "comment": "\n     *\n     * @return norm\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 29)",
        "(line 426,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(int, int, int, int)",
      "begin_line": 448,
      "end_line": 465,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 458,col 75)",
        "(line 459,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(int[], int[])",
      "begin_line": 478,
      "end_line": 498,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices must be non-empty\n     * @param selectedColumns Array of column indices must be non-empty\n     * @return The subMatrix containing the data in the\n     *     specified rows and columns\n     * @exception MatrixIndexException  if supplied row or column index arrays\n     *     are not valid\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 485,col 68)",
        "(line 486,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(double[][], int, int)",
      "begin_line": 527,
      "end_line": 563,
      "comment": "\n     * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n     * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n     * \u003cp\u003e \n     * Example:\u003cbr\u003e\n     * Starting with \u003cpre\u003e\n     * 1  2  3  4\n     * 5  6  7  8\n     * 9  0  1  2\n     * \u003c/pre\u003e\n     * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n     * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n     * 1  2  3  4\n     * 5  3  4  8\n     * 9  5  6  2\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \n     * @param subMatrix  array containing the submatrix replacement data\n     * @param row  row coordinate of the top, left element to be replaced\n     * @param column  column coordinate of the top, left element to be replaced\n     * @throws MatrixIndexException  if subMatrix does not fit into this \n     *    matrix from element in (row, column) \n     * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 43)",
        "(line 534,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 46)",
        "(line 539,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 558,col 61)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(int)",
      "begin_line": 573,
      "end_line": 581,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as a row matrix.\n     * Row indices start at 0.\n     * \n     * @param row  the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 52)",
        "(line 578,col 9)-(line 578,col 52)",
        "(line 579,col 9)-(line 579,col 57)",
        "(line 580,col 9)-(line 580,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix(int)",
      "begin_line": 591,
      "end_line": 601,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 49)",
        "(line 596,col 9)-(line 596,col 52)",
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnVector(int)",
      "begin_line": 604,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowVector(int)",
      "begin_line": 609,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRow(int)",
      "begin_line": 623,
      "end_line": 631,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 52)",
        "(line 628,col 9)-(line 628,col 47)",
        "(line 629,col 9)-(line 629,col 54)",
        "(line 630,col 9)-(line 630,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumn(int)",
      "begin_line": 643,
      "end_line": 653,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 49)",
        "(line 648,col 9)-(line 648,col 47)",
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getEntry(int, int)",
      "begin_line": 670,
      "end_line": 677,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.transpose()",
      "begin_line": 684,
      "end_line": 695,
      "comment": "\n     * Returns the transpose matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 44)",
        "(line 686,col 9)-(line 686,col 47)",
        "(line 687,col 9)-(line 687,col 60)",
        "(line 688,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.inverse()",
      "begin_line": 703,
      "end_line": 705,
      "comment": "\n     * Returns the inverse matrix if this matrix is invertible.\n     *\n     * @return inverse matrix\n     * @throws InvalidMatrixException if this is not invertible\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDeterminant()",
      "begin_line": 711,
      "end_line": 724,
      "comment": "\n     * @return determinant\n     * @throws InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 723,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isSquare()",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isSingular()",
      "begin_line": 736,
      "end_line": 747,
      "comment": "\n     * @return true if the matrix is singular\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowDimension()",
      "begin_line": 752,
      "end_line": 754,
      "comment": "\n     * @return rowDimension\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension()",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\n     * @return columnDimension\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getTrace()",
      "begin_line": 767,
      "end_line": 776,
      "comment": "\n     * @return trace\n     * @throws IllegalArgumentException if the matrix is not square\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 34)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(double[])",
      "begin_line": 783,
      "end_line": 799,
      "comment": "\n     * @param v vector to operate on\n     * @throws IllegalArgumentException if columnDimension !\u003d v.length\n     * @return resulting vector\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 49)",
        "(line 785,col 9)-(line 785,col 52)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 47)",
        "(line 790,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 798,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 802,
      "end_line": 822,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 803,col 9)-(line 821,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 831,
      "end_line": 833,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(double[])",
      "begin_line": 840,
      "end_line": 855,
      "comment": "\n     * @param v vector to premultiply by\n     * @throws IllegalArgumentException if rowDimension !\u003d v.length\n     * @return resulting matrix\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 49)",
        "(line 842,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 52)",
        "(line 846,col 9)-(line 846,col 47)",
        "(line 847,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 858,
      "end_line": 877,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 876,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 886,
      "end_line": 888,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(double[])",
      "begin_line": 901,
      "end_line": 940,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  array of constant forming RHS of linear systems to\n     * to solve\n     * @return solution array\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 49)",
        "(line 904,col 9)-(line 904,col 52)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 914,col 9)",
        "(line 916,col 9)-(line 916,col 46)",
        "(line 919,col 9)-(line 921,col 9)",
        "(line 924,col 9)-(line 928,col 9)",
        "(line 931,col 9)-(line 936,col 9)",
        "(line 938,col 9)-(line 938,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 943,
      "end_line": 987,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 945,col 9)-(line 986,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 998,
      "end_line": 1001,
      "comment": "\n     * Returns the solution vector for a linear system with coefficient\n     * matrix \u003d this and constant vector \u003d \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  constant vector\n     * @return vector of solution values to AX \u003d b, where A is *this\n     * @throws IllegalArgumentException if this.rowDimension !\u003d b.length\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1014,
      "end_line": 1069,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1025,col 9)-(line 1025,col 52)",
        "(line 1026,col 9)-(line 1026,col 49)",
        "(line 1027,col 9)-(line 1027,col 46)",
        "(line 1030,col 9)-(line 1030,col 55)",
        "(line 1031,col 9)-(line 1037,col 9)",
        "(line 1040,col 9)-(line 1049,col 9)",
        "(line 1052,col 9)-(line 1065,col 9)",
        "(line 1067,col 9)-(line 1067,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.luDecompose()",
      "begin_line": 1089,
      "end_line": 1164,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 49)",
        "(line 1092,col 9)-(line 1092,col 52)",
        "(line 1093,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1096,col 23)",
        "(line 1099,col 9)-(line 1099,col 37)",
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1103,col 19)",
        "(line 1106,col 9)-(line 1163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.toString()",
      "begin_line": 1170,
      "end_line": 1190,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1171,col 9)-(line 1171,col 46)",
        "(line 1172,col 9)-(line 1172,col 38)",
        "(line 1173,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1188,col 24)",
        "(line 1189,col 9)-(line 1189,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.equals(java.lang.Object)",
      "begin_line": 1201,
      "end_line": 1224,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \n     * \u003ccode\u003eRealMatrixImpl\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.  Corresponding entries\n     * are compared using {@link java.lang.Double#doubleToLongBits(double)}\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1204,col 9)",
        "(line 1205,col 9)-(line 1207,col 9)",
        "(line 1208,col 9)-(line 1208,col 43)",
        "(line 1209,col 9)-(line 1209,col 44)",
        "(line 1210,col 9)-(line 1210,col 47)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1222,col 9)",
        "(line 1223,col 9)-(line 1223,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.hashCode()",
      "begin_line": 1231,
      "end_line": 1245,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1232,col 20)",
        "(line 1233,col 9)-(line 1233,col 44)",
        "(line 1234,col 9)-(line 1234,col 47)",
        "(line 1235,col 9)-(line 1235,col 31)",
        "(line 1236,col 9)-(line 1236,col 31)",
        "(line 1237,col 9)-(line 1243,col 9)",
        "(line 1244,col 9)-(line 1244,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix()",
      "begin_line": 1276,
      "end_line": 1281,
      "comment": "\n     *  Returns the LU decomposition as a RealMatrix.\n     *  Returns a fresh copy of the cached LU matrix if this has been computed;\n     *  otherwise the composition is computed and cached for use by other methods.\n     *  Since a copy is returned in either case, changes to the returned matrix do not\n     *  affect the LU decomposition property.\n     * \u003cp\u003e\n     * The matrix returned is a compact representation of the LU decomposition.\n     * Elements below the main diagonal correspond to entries of the \"L\" matrix;\n     * elements on and above the main diagonal correspond to entries of the \"U\"\n     * matrix.\u003c/p\u003e\n     * \u003cp\u003e\n     * Example: \u003cpre\u003e\n     *\n     *     Returned matrix                L                  U\n     *         2  3  1                   1  0  0            2  3  1\n     *         5  4  6                   5  1  0            0  4  6\n     *         1  7  8                   1  7  1            0  0  8\n     * \u003c/pre\u003e\n     *\n     * The L and U matrices satisfy the matrix equation LU \u003d permuteRows(this), \u003cbr\u003e\n     *  where permuteRows reorders the rows of the matrix to follow the order determined\n     *  by the \u003ca href\u003d#getPermutation()\u003epermutation\u003c/a\u003e property.\u003c/p\u003e\n     *\n     * @return LU decomposition matrix\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1279,col 9)",
        "(line 1280,col 9)-(line 1280,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getPermutation()",
      "begin_line": 1295,
      "end_line": 1299,
      "comment": "\n     * Returns the permutation associated with the lu decomposition.\n     * The entries of the array represent a permutation of the numbers 0, ... , nRows - 1.\n     * \u003cp\u003e\n     * Example:\n     * permutation \u003d [1, 2, 0] means current 2nd row is first, current third row is second\n     * and current first row is last.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns a fresh copy of the array.\u003c/p\u003e\n     *\n     * @return the permutation\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 54)",
        "(line 1297,col 9)-(line 1297,col 69)",
        "(line 1298,col 9)-(line 1298,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyOut()",
      "begin_line": 1308,
      "end_line": 1316,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 1309,col 9)-(line 1309,col 49)",
        "(line 1310,col 9)-(line 1310,col 76)",
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyIn(double[][])",
      "begin_line": 1328,
      "end_line": 1330,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(int, int)",
      "begin_line": 1339,
      "end_line": 1343,
      "comment": "\n     * Tests a given coordinate as being valid or invalid\n     *\n     * @param row the row index.\n     * @param col the column index.\n     * @return true if the coordinate is with the current dimensions\n     ",
      "child_ranges": [
        "(line 1340,col 9)-(line 1340,col 44)",
        "(line 1341,col 9)-(line 1341,col 47)",
        "(line 1342,col 9)-(line 1342,col 74)"
      ]
    }
  ]
}
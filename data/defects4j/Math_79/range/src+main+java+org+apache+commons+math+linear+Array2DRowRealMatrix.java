{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/Array2DRowRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 625,
      "comment": "\n * Implementation of RealMatrix using a double[][] array to store entries and\n * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decomposition\u003c/a\u003e to support linear system\n * solution and inverse.\n * \u003cp\u003e\n * The LU decomposition is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is cached and reused on subsequent calls.\n * If data are modified via references to the underlying array obtained using\n * \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored LU decomposition will not be\n * discarded.  In this case, you need to explicitly invoke\n * \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link RealMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix()",
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(int, int)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 45)",
        "(line 77,col 9)-(line 77,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][])",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 113,
      "end_line": 138,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[])",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.createMatrix(int, int)",
      "begin_line": 157,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 164,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 170,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.add(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 187,
      "end_line": 207,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 53)",
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 69)",
        "(line 196,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 210,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 227,
      "end_line": 247,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 56)",
        "(line 233,col 9)-(line 233,col 50)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 69)",
        "(line 236,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 250,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 267,
      "end_line": 291,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 59)",
        "(line 273,col 9)-(line 273,col 49)",
        "(line 274,col 9)-(line 274,col 49)",
        "(line 275,col 9)-(line 275,col 51)",
        "(line 276,col 9)-(line 276,col 60)",
        "(line 277,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 294,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 311,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(int, int)",
      "begin_line": 350,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
      "begin_line": 363,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 376,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 389,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 402,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 408,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 414,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 49)",
        "(line 418,col 9)-(line 418,col 52)",
        "(line 419,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 47)",
        "(line 425,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 437,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 44)",
        "(line 442,col 9)-(line 442,col 47)",
        "(line 443,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 47)",
        "(line 450,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 463,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 46)",
        "(line 467,col 9)-(line 467,col 49)",
        "(line 468,col 9)-(line 468,col 66)",
        "(line 469,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 479,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 46)",
        "(line 483,col 9)-(line 483,col 49)",
        "(line 484,col 9)-(line 484,col 66)",
        "(line 485,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 495,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 88)",
        "(line 501,col 9)-(line 502,col 64)",
        "(line 503,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 513,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 88)",
        "(line 519,col 9)-(line 520,col 64)",
        "(line 521,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 531,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 46)",
        "(line 535,col 9)-(line 535,col 49)",
        "(line 536,col 9)-(line 536,col 66)",
        "(line 537,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 547,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 46)",
        "(line 551,col 9)-(line 551,col 49)",
        "(line 552,col 9)-(line 552,col 66)",
        "(line 553,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 562,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 88)",
        "(line 568,col 9)-(line 569,col 64)",
        "(line 570,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 580,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 88)",
        "(line 586,col 9)-(line 587,col 64)",
        "(line 588,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 601,
      "end_line": 609,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 49)",
        "(line 603,col 9)-(line 603,col 76)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 31)"
      ]
    }
  ]
}
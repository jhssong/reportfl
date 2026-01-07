{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/linear/RealMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 628,
      "comment": "\n * Implementation of RealMatrix using a double[][] array to store entries and\n * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decomposition\u003c/a\u003e to support linear system\n * solution and inverse.\n * \u003cp\u003e\n * The LU decomposition is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is cached and reused on subsequent calls.\n * If data are modified via references to the underlying array obtained using\n * \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored LU decomposition will not be\n * discarded.  In this case, you need to explicitly invoke\n * \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link RealMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @deprecated as of 2.0 replaced by {@link Array2DRowRealMatrix}\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version identifier "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl()",
      "begin_line": 66,
      "end_line": 67,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(int, int)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 45)",
        "(line 80,col 9)-(line 80,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][])",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #RealMatrixImpl(double[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][], boolean)",
      "begin_line": 116,
      "end_line": 141,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][])\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[])",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 36)",
        "(line 154,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.createMatrix(int, int)",
      "begin_line": 160,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copy()",
      "begin_line": 167,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 173,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 190,
      "end_line": 210,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 53)",
        "(line 196,col 9)-(line 196,col 50)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 198,col 69)",
        "(line 199,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 213,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 230,
      "end_line": 250,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 56)",
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 237,col 53)",
        "(line 238,col 9)-(line 238,col 69)",
        "(line 239,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 253,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 270,
      "end_line": 294,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 59)",
        "(line 276,col 9)-(line 276,col 49)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 278,col 51)",
        "(line 279,col 9)-(line 279,col 60)",
        "(line 280,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getData()",
      "begin_line": 297,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDataRef()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(double[][], int, int)",
      "begin_line": 314,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getEntry(int, int)",
      "begin_line": 353,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setEntry(int, int, double)",
      "begin_line": 366,
      "end_line": 376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.addToEntry(int, int, double)",
      "begin_line": 379,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiplyEntry(int, int, double)",
      "begin_line": 392,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowDimension()",
      "begin_line": 405,
      "end_line": 408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension()",
      "begin_line": 411,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(double[])",
      "begin_line": 417,
      "end_line": 437,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 49)",
        "(line 421,col 9)-(line 421,col 52)",
        "(line 422,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 47)",
        "(line 428,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(double[])",
      "begin_line": 440,
      "end_line": 463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 44)",
        "(line 445,col 9)-(line 445,col 47)",
        "(line 446,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 47)",
        "(line 453,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 466,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 46)",
        "(line 470,col 9)-(line 470,col 49)",
        "(line 471,col 9)-(line 471,col 66)",
        "(line 472,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 482,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 46)",
        "(line 486,col 9)-(line 486,col 49)",
        "(line 487,col 9)-(line 487,col 66)",
        "(line 488,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 498,
      "end_line": 513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 88)",
        "(line 504,col 9)-(line 505,col 64)",
        "(line 506,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 516,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 88)",
        "(line 522,col 9)-(line 523,col 64)",
        "(line 524,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 534,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 46)",
        "(line 538,col 9)-(line 538,col 49)",
        "(line 539,col 9)-(line 539,col 66)",
        "(line 540,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 550,
      "end_line": 562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 46)",
        "(line 554,col 9)-(line 554,col 49)",
        "(line 555,col 9)-(line 555,col 66)",
        "(line 556,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 565,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 88)",
        "(line 571,col 9)-(line 572,col 64)",
        "(line 573,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 583,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 88)",
        "(line 589,col 9)-(line 590,col 64)",
        "(line 591,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyOut()",
      "begin_line": 604,
      "end_line": 612,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 49)",
        "(line 606,col 9)-(line 606,col 76)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyIn(double[][])",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 31)"
      ]
    }
  ]
}
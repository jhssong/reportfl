{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/RealMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 627,
      "comment": "\n * Implementation of RealMatrix using a double[][] array to store entries and\n * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decomposition\u003c/a\u003e to support linear system\n * solution and inverse.\n * \u003cp\u003e\n * The LU decomposition is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is cached and reused on subsequent calls.\n * If data are modified via references to the underlying array obtained using\n * \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored LU decomposition will not be\n * discarded.  In this case, you need to explicitly invoke\n * \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link RealMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @deprecated as of 2.0 replaced by {@link Array2DRowRealMatrix}\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable version identifier "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl()",
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(int, int)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 45)",
        "(line 79,col 9)-(line 79,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][])",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #RealMatrixImpl(double[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][], boolean)",
      "begin_line": 115,
      "end_line": 140,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][])\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[])",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 152,col 36)",
        "(line 153,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.createMatrix(int, int)",
      "begin_line": 159,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copy()",
      "begin_line": 166,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 172,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 189,
      "end_line": 209,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 53)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 197,col 9)-(line 197,col 69)",
        "(line 198,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 212,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 229,
      "end_line": 249,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 56)",
        "(line 235,col 9)-(line 235,col 50)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 237,col 9)-(line 237,col 69)",
        "(line 238,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 252,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 269,
      "end_line": 293,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 59)",
        "(line 275,col 9)-(line 275,col 49)",
        "(line 276,col 9)-(line 276,col 49)",
        "(line 277,col 9)-(line 277,col 51)",
        "(line 278,col 9)-(line 278,col 60)",
        "(line 279,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getData()",
      "begin_line": 296,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDataRef()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(double[][], int, int)",
      "begin_line": 313,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getEntry(int, int)",
      "begin_line": 352,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setEntry(int, int, double)",
      "begin_line": 365,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.addToEntry(int, int, double)",
      "begin_line": 378,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiplyEntry(int, int, double)",
      "begin_line": 391,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowDimension()",
      "begin_line": 404,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension()",
      "begin_line": 410,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(double[])",
      "begin_line": 416,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 49)",
        "(line 420,col 9)-(line 420,col 52)",
        "(line 421,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 47)",
        "(line 427,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(double[])",
      "begin_line": 439,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 44)",
        "(line 444,col 9)-(line 444,col 47)",
        "(line 445,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 47)",
        "(line 452,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 465,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 46)",
        "(line 469,col 9)-(line 469,col 49)",
        "(line 470,col 9)-(line 470,col 66)",
        "(line 471,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 481,
      "end_line": 494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 46)",
        "(line 485,col 9)-(line 485,col 49)",
        "(line 486,col 9)-(line 486,col 66)",
        "(line 487,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 497,
      "end_line": 512,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 88)",
        "(line 503,col 9)-(line 504,col 64)",
        "(line 505,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 515,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 88)",
        "(line 521,col 9)-(line 522,col 64)",
        "(line 523,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 533,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 537,col 49)",
        "(line 538,col 9)-(line 538,col 66)",
        "(line 539,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 549,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 46)",
        "(line 553,col 9)-(line 553,col 49)",
        "(line 554,col 9)-(line 554,col 66)",
        "(line 555,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 564,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 88)",
        "(line 570,col 9)-(line 571,col 64)",
        "(line 572,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 582,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 88)",
        "(line 588,col 9)-(line 589,col 64)",
        "(line 590,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyOut()",
      "begin_line": 603,
      "end_line": 611,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 49)",
        "(line 605,col 9)-(line 605,col 76)",
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyIn(double[][])",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 31)"
      ]
    }
  ]
}
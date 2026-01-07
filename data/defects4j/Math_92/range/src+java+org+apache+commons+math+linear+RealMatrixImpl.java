{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/linear/RealMatrixImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 617,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl()",
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(int, int)",
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
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][])",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #RealMatrixImpl(double[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.RealMatrixImpl(double[][], boolean)",
      "begin_line": 113,
      "end_line": 140,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #RealMatrixImpl(double[][])\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 139,col 9)"
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
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copy()",
      "begin_line": 165,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 170,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.add(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 186,
      "end_line": 206,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 35)",
        "(line 192,col 9)-(line 192,col 50)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 69)",
        "(line 195,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 209,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.subtract(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 225,
      "end_line": 245,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 38)",
        "(line 231,col 9)-(line 231,col 50)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 233,col 69)",
        "(line 234,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 248,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiply(org.apache.commons.math.linear.RealMatrixImpl)",
      "begin_line": 264,
      "end_line": 288,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 41)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 49)",
        "(line 272,col 9)-(line 272,col 51)",
        "(line 273,col 9)-(line 273,col 60)",
        "(line 274,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getData()",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getDataRef()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(double[][], int, int)",
      "begin_line": 307,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getEntry(int, int)",
      "begin_line": 346,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.setEntry(int, int, double)",
      "begin_line": 360,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.addToEntry(int, int, double)",
      "begin_line": 374,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.multiplyEntry(int, int, double)",
      "begin_line": 388,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 390,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getRowDimension()",
      "begin_line": 402,
      "end_line": 404,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension()",
      "begin_line": 407,
      "end_line": 409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.operate(double[])",
      "begin_line": 412,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 49)",
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 47)",
        "(line 424,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.preMultiply(double[])",
      "begin_line": 436,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 44)",
        "(line 440,col 9)-(line 440,col 47)",
        "(line 441,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 47)",
        "(line 450,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 463,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 46)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 467,col 66)",
        "(line 468,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 478,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 46)",
        "(line 481,col 9)-(line 481,col 49)",
        "(line 482,col 9)-(line 482,col 66)",
        "(line 483,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 493,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 70)",
        "(line 498,col 9)-(line 499,col 64)",
        "(line 500,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 510,
      "end_line": 524,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 70)",
        "(line 515,col 9)-(line 516,col 64)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 527,
      "end_line": 539,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 46)",
        "(line 530,col 9)-(line 530,col 49)",
        "(line 531,col 9)-(line 531,col 66)",
        "(line 532,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 542,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 46)",
        "(line 545,col 9)-(line 545,col 49)",
        "(line 546,col 9)-(line 546,col 66)",
        "(line 547,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 556,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 70)",
        "(line 561,col 9)-(line 562,col 64)",
        "(line 563,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 573,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 70)",
        "(line 578,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyOut()",
      "begin_line": 593,
      "end_line": 601,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 49)",
        "(line 595,col 9)-(line 595,col 76)",
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixImpl.copyIn(double[][])",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 31)"
      ]
    }
  ]
}
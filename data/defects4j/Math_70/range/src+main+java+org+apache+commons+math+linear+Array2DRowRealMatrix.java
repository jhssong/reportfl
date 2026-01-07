{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/Array2DRowRealMatrix.java",
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
      "end_line": 639,
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
        "AT_LEAST_ONE_ROW_MESSAGE"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " Message for at least one row. "
    },
    {
      "type": "field",
      "varNames": [
        "AT_LEAST_ONE_COLUMN_MESSAGE"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " Message for at least one column. "
    },
    {
      "type": "field",
      "varNames": [
        "DIFFERENT_ROWS_LENGTHS_MESSAGE"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " Message for different rows lengths. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_ENTRY_MESSAGE"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " Message for no entry at selected indices. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR_LENGTHS_MISMATCH"
      ],
      "begin_line": 74,
      "end_line": 75,
      "comment": " Message for vector lengths mismatch. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix()",
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(int, int)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][])",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 133,
      "end_line": 159,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[])",
      "begin_line": 169,
      "end_line": 175,
      "comment": "\n     * Create a new (column) RealMatrix using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 36)",
        "(line 172,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.createMatrix(int, int)",
      "begin_line": 178,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 185,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 191,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 194,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.add(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 208,
      "end_line": 228,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 53)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 215,col 53)",
        "(line 216,col 9)-(line 216,col 69)",
        "(line 217,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 231,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 248,
      "end_line": 268,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 56)",
        "(line 254,col 9)-(line 254,col 50)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 256,col 69)",
        "(line 257,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 271,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 288,
      "end_line": 312,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 59)",
        "(line 294,col 9)-(line 294,col 49)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 296,col 51)",
        "(line 297,col 9)-(line 297,col 60)",
        "(line 298,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 315,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 332,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(int, int)",
      "begin_line": 370,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
      "begin_line": 382,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 394,
      "end_line": 403,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 406,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 409,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 418,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 424,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 430,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 49)",
        "(line 434,col 9)-(line 434,col 52)",
        "(line 435,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 47)",
        "(line 440,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 452,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 44)",
        "(line 457,col 9)-(line 457,col 47)",
        "(line 458,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 464,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 477,
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
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 493,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 46)",
        "(line 497,col 9)-(line 497,col 49)",
        "(line 498,col 9)-(line 498,col 66)",
        "(line 499,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 509,
      "end_line": 524,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 88)",
        "(line 515,col 9)-(line 516,col 64)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 527,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 88)",
        "(line 533,col 9)-(line 534,col 64)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 545,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 46)",
        "(line 549,col 9)-(line 549,col 49)",
        "(line 550,col 9)-(line 550,col 66)",
        "(line 551,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 561,
      "end_line": 573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 46)",
        "(line 565,col 9)-(line 565,col 49)",
        "(line 566,col 9)-(line 566,col 66)",
        "(line 567,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 576,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 88)",
        "(line 582,col 9)-(line 583,col 64)",
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 594,
      "end_line": 608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 88)",
        "(line 600,col 9)-(line 601,col 64)",
        "(line 602,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 615,
      "end_line": 623,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 49)",
        "(line 617,col 9)-(line 617,col 76)",
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 31)"
      ]
    }
  ]
}
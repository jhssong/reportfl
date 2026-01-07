{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/linear/Array2DRowRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 535,
      "comment": "\n * Implementation of RealMatrix using a double[][] array to store entries and\n * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n * LU decomposition\u003c/a\u003e to support linear system\n * solution and inverse.\n * \u003cp\u003e\n * The LU decomposition is performed as needed, to support the following operations: \u003cul\u003e\n * \u003cli\u003esolve\u003c/li\u003e\n * \u003cli\u003eisSingular\u003c/li\u003e\n * \u003cli\u003egetDeterminant\u003c/li\u003e\n * \u003cli\u003einverse\u003c/li\u003e \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage notes\u003c/strong\u003e:\u003cbr\u003e\n * \u003cul\u003e\u003cli\u003e\n * The LU decomposition is cached and reused on subsequent calls.\n * If data are modified via references to the underlying array obtained using\n * \u003ccode\u003egetDataRef()\u003c/code\u003e, then the stored LU decomposition will not be\n * discarded.  In this case, you need to explicitly invoke\n * \u003ccode\u003eLUDecompose()\u003c/code\u003e to recompute the decomposition\n * before using any of the methods above.\u003c/li\u003e\n * \u003cli\u003e\n * As specified in the {@link RealMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Entries of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(int, int)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 45)",
        "(line 77,col 9)-(line 77,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][])",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create a new {@code RealMatrix} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or colum dimension is zero.\n     * @throws NullPointerException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 114,
      "end_line": 136,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws DimensionMismatchException if {@code d} is not rectangular\n     * (not all rows have the same length) or empty.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[])",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n     * Create a new (column) RealMatrix using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.createMatrix(int, int)",
      "begin_line": 154,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 161,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.add(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 174,
      "end_line": 191,
      "comment": "\n     * Compute the sum of this matrix with {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 53)",
        "(line 178,col 9)-(line 178,col 50)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 69)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 201,
      "end_line": 218,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 56)",
        "(line 205,col 9)-(line 205,col 50)",
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 207,col 69)",
        "(line 208,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 228,
      "end_line": 250,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 59)",
        "(line 232,col 9)-(line 232,col 49)",
        "(line 233,col 9)-(line 233,col 49)",
        "(line 234,col 9)-(line 234,col 51)",
        "(line 235,col 9)-(line 235,col 60)",
        "(line 236,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 253,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Get a reference to the underlying data array.\n     *\n     * @return 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 268,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(int, int)",
      "begin_line": 301,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 56)",
        "(line 304,col 9)-(line 304,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
      "begin_line": 308,
      "end_line": 312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 56)",
        "(line 311,col 9)-(line 311,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 315,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 56)",
        "(line 318,col 9)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 322,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 56)",
        "(line 325,col 9)-(line 325,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 329,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 335,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 341,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 49)",
        "(line 344,col 9)-(line 344,col 52)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 47)",
        "(line 349,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 361,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 44)",
        "(line 364,col 9)-(line 364,col 47)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 47)",
        "(line 370,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 383,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 46)",
        "(line 386,col 9)-(line 386,col 49)",
        "(line 387,col 9)-(line 387,col 66)",
        "(line 388,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 398,
      "end_line": 410,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 46)",
        "(line 401,col 9)-(line 401,col 49)",
        "(line 402,col 9)-(line 402,col 66)",
        "(line 403,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 413,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 88)",
        "(line 418,col 9)-(line 419,col 64)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 430,
      "end_line": 444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 88)",
        "(line 435,col 9)-(line 436,col 64)",
        "(line 437,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 447,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 46)",
        "(line 450,col 9)-(line 450,col 49)",
        "(line 451,col 9)-(line 451,col 66)",
        "(line 452,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 462,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 46)",
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 466,col 66)",
        "(line 467,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 476,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 88)",
        "(line 481,col 9)-(line 482,col 64)",
        "(line 483,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 493,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 88)",
        "(line 498,col 9)-(line 499,col 64)",
        "(line 500,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 513,
      "end_line": 521,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 49)",
        "(line 515,col 9)-(line 515,col 76)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws org.apache.commons.math.exception.NullArgumentException if\n     * the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 31)"
      ]
    }
  ]
}
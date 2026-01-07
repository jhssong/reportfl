{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/Array2DRowRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 549,
      "comment": "\n * Implementation of {@link RealMatrix} using a {@code double[][]} array to\n * store entries.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Entries of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(int, int)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if the row or column dimension is\n     * not positive.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 45)",
        "(line 62,col 9)-(line 62,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][])",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Create a new {@code RealMatrix} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or column dimension is zero.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 99,
      "end_line": 123,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or column dimension is zero.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[])",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Create a new (column) RealMatrix using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 35)",
        "(line 134,col 9)-(line 134,col 36)",
        "(line 135,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.createMatrix(int, int)",
      "begin_line": 141,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 149,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.add(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 162,
      "end_line": 180,
      "comment": "\n     * Compute the sum of {@code this} and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this + m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 53)",
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 168,col 53)",
        "(line 169,col 9)-(line 169,col 69)",
        "(line 170,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 190,
      "end_line": 207,
      "comment": "\n     * Returns {@code this} minus {@code m}.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 56)",
        "(line 194,col 9)-(line 194,col 50)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 69)",
        "(line 197,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 217,
      "end_line": 249,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 59)",
        "(line 221,col 9)-(line 221,col 49)",
        "(line 222,col 9)-(line 222,col 49)",
        "(line 223,col 9)-(line 223,col 51)",
        "(line 225,col 9)-(line 225,col 60)",
        "(line 227,col 9)-(line 227,col 47)",
        "(line 228,col 9)-(line 228,col 40)",
        "(line 231,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 252,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Get a reference to the underlying data array.\n     *\n     * @return 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 267,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(int, int)",
      "begin_line": 303,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 56)",
        "(line 307,col 9)-(line 307,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
      "begin_line": 311,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 56)",
        "(line 315,col 9)-(line 315,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 319,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 56)",
        "(line 324,col 9)-(line 324,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 328,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 56)",
        "(line 333,col 9)-(line 333,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 337,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 343,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 349,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 353,col 52)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 47)",
        "(line 358,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 370,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 44)",
        "(line 374,col 9)-(line 374,col 47)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 47)",
        "(line 380,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 393,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 396,col 49)",
        "(line 397,col 9)-(line 397,col 66)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 408,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 46)",
        "(line 411,col 9)-(line 411,col 49)",
        "(line 412,col 9)-(line 412,col 66)",
        "(line 413,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 423,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 88)",
        "(line 429,col 9)-(line 430,col 64)",
        "(line 431,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 441,
      "end_line": 456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 88)",
        "(line 447,col 9)-(line 448,col 64)",
        "(line 449,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 459,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 46)",
        "(line 462,col 9)-(line 462,col 49)",
        "(line 463,col 9)-(line 463,col 66)",
        "(line 464,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 474,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 46)",
        "(line 477,col 9)-(line 477,col 49)",
        "(line 478,col 9)-(line 478,col 66)",
        "(line 479,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 488,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 88)",
        "(line 494,col 9)-(line 495,col 64)",
        "(line 496,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 506,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 88)",
        "(line 512,col 9)-(line 513,col 64)",
        "(line 514,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 527,
      "end_line": 535,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 49)",
        "(line 529,col 9)-(line 529,col 76)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 545,
      "end_line": 548,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws NullArgumentException if the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 31)"
      ]
    }
  ]
}
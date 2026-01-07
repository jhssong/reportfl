{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/linear/Array2DRowRealMatrix.java",
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
      "end_line": 545,
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
      "comment": "\n     * Create a new {@code RealMatrix} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or colum dimension is zero.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 99,
      "end_line": 123,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or colum dimension is zero.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
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
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.add(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 160,
      "end_line": 178,
      "comment": "\n     * Compute the sum of {@code this} and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this + m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 53)",
        "(line 165,col 9)-(line 165,col 50)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 167,col 9)-(line 167,col 69)",
        "(line 168,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 188,
      "end_line": 205,
      "comment": "\n     * Returns {@code this} minus {@code m}.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 56)",
        "(line 192,col 9)-(line 192,col 50)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 69)",
        "(line 195,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 215,
      "end_line": 247,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 59)",
        "(line 219,col 9)-(line 219,col 49)",
        "(line 220,col 9)-(line 220,col 49)",
        "(line 221,col 9)-(line 221,col 51)",
        "(line 223,col 9)-(line 223,col 60)",
        "(line 225,col 9)-(line 225,col 47)",
        "(line 226,col 9)-(line 226,col 40)",
        "(line 229,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 250,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Get a reference to the underlying data array.\n     *\n     * @return 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 265,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(int, int)",
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
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
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
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 315,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 56)",
        "(line 320,col 9)-(line 320,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 324,
      "end_line": 330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 56)",
        "(line 329,col 9)-(line 329,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 333,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 339,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 345,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 49)",
        "(line 349,col 9)-(line 349,col 52)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 47)",
        "(line 354,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 366,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 44)",
        "(line 370,col 9)-(line 370,col 47)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 47)",
        "(line 376,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 389,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 46)",
        "(line 392,col 9)-(line 392,col 49)",
        "(line 393,col 9)-(line 393,col 66)",
        "(line 394,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 404,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 46)",
        "(line 407,col 9)-(line 407,col 49)",
        "(line 408,col 9)-(line 408,col 66)",
        "(line 409,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 419,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 88)",
        "(line 425,col 9)-(line 426,col 64)",
        "(line 427,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 437,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 88)",
        "(line 443,col 9)-(line 444,col 64)",
        "(line 445,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 455,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 46)",
        "(line 458,col 9)-(line 458,col 49)",
        "(line 459,col 9)-(line 459,col 66)",
        "(line 460,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 470,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 46)",
        "(line 473,col 9)-(line 473,col 49)",
        "(line 474,col 9)-(line 474,col 66)",
        "(line 475,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 484,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 88)",
        "(line 490,col 9)-(line 491,col 64)",
        "(line 492,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 502,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 88)",
        "(line 508,col 9)-(line 509,col 64)",
        "(line 510,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 523,
      "end_line": 531,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 49)",
        "(line 525,col 9)-(line 525,col 76)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 541,
      "end_line": 544,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws NullArgumentException if the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 31)"
      ]
    }
  ]
}
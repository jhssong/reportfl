{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/linear/Array2DRowRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 528,
      "comment": "\n * Implementation of {@link RealMatrix} using a {@code double[][]} array to\n * store entries.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Entries of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(int, int)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 45)",
        "(line 57,col 9)-(line 57,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][])",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Create a new {@code RealMatrix} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or colum dimension is zero.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 95,
      "end_line": 117,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws DimensionMismatchException if {@code d} is not rectangular\n     * (not all rows have the same length) or empty.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[])",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * Create a new (column) RealMatrix using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.createMatrix(int, int)",
      "begin_line": 135,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 142,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.add(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 155,
      "end_line": 172,
      "comment": "\n     * Compute the sum of this matrix with {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 53)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 69)",
        "(line 162,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 182,
      "end_line": 199,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 56)",
        "(line 186,col 9)-(line 186,col 50)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 209,
      "end_line": 241,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 59)",
        "(line 213,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 214,col 49)",
        "(line 215,col 9)-(line 215,col 51)",
        "(line 217,col 9)-(line 217,col 60)",
        "(line 219,col 9)-(line 219,col 47)",
        "(line 220,col 9)-(line 220,col 40)",
        "(line 223,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 244,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Get a reference to the underlying data array.\n     *\n     * @return 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 259,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(int, int)",
      "begin_line": 293,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 56)",
        "(line 296,col 9)-(line 296,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
      "begin_line": 300,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 56)",
        "(line 303,col 9)-(line 303,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 307,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 56)",
        "(line 310,col 9)-(line 310,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 314,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 56)",
        "(line 317,col 9)-(line 317,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 321,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 327,
      "end_line": 330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 333,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 49)",
        "(line 336,col 9)-(line 336,col 52)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 47)",
        "(line 341,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 353,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 47)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 47)",
        "(line 362,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 375,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 46)",
        "(line 378,col 9)-(line 378,col 49)",
        "(line 379,col 9)-(line 379,col 66)",
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 390,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 46)",
        "(line 393,col 9)-(line 393,col 49)",
        "(line 394,col 9)-(line 394,col 66)",
        "(line 395,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 405,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 88)",
        "(line 410,col 9)-(line 411,col 64)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 422,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 88)",
        "(line 427,col 9)-(line 428,col 64)",
        "(line 429,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 439,
      "end_line": 451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 46)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 443,col 66)",
        "(line 444,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 454,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 46)",
        "(line 457,col 9)-(line 457,col 49)",
        "(line 458,col 9)-(line 458,col 66)",
        "(line 459,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 468,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 88)",
        "(line 473,col 9)-(line 474,col 64)",
        "(line 475,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 485,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 88)",
        "(line 490,col 9)-(line 491,col 64)",
        "(line 492,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 505,
      "end_line": 513,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 49)",
        "(line 507,col 9)-(line 507,col 76)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 524,
      "end_line": 527,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws NullArgumentException if\n     * the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 31)"
      ]
    }
  ]
}
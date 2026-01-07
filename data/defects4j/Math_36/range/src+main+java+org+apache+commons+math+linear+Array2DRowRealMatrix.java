{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/linear/Array2DRowRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 527,
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
      "begin_line": 39,
      "end_line": 39,
      "comment": " Entries of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(int, int)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 45)",
        "(line 56,col 9)-(line 56,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][])",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Create a new {@code RealMatrix} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowRealMatrix(double[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if {@code d} row or colum dimension is zero.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowRealMatrix(double[][], boolean)\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[][], boolean)",
      "begin_line": 94,
      "end_line": 116,
      "comment": "\n     * Create a new RealMatrix using the input array as the underlying\n     * data array.\n     * If an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @throws DimensionMismatchException if {@code d} is not rectangular\n     * (not all rows have the same length) or empty.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.Array2DRowRealMatrix(double[])",
      "begin_line": 125,
      "end_line": 131,
      "comment": "\n     * Create a new (column) RealMatrix using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.createMatrix(int, int)",
      "begin_line": 134,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copy()",
      "begin_line": 141,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.add(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 154,
      "end_line": 171,
      "comment": "\n     * Compute the sum of this matrix with {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 53)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 53)",
        "(line 160,col 9)-(line 160,col 69)",
        "(line 161,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.subtract(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 181,
      "end_line": 198,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 56)",
        "(line 185,col 9)-(line 185,col 50)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 69)",
        "(line 188,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiply(org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 208,
      "end_line": 240,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 59)",
        "(line 212,col 9)-(line 212,col 49)",
        "(line 213,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 214,col 51)",
        "(line 216,col 9)-(line 216,col 60)",
        "(line 218,col 9)-(line 218,col 47)",
        "(line 219,col 9)-(line 219,col 40)",
        "(line 222,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getData()",
      "begin_line": 243,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getDataRef()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Get a reference to the underlying data array.\n     *\n     * @return 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 258,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(int, int)",
      "begin_line": 292,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 56)",
        "(line 295,col 9)-(line 295,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.setEntry(int, int, double)",
      "begin_line": 299,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 56)",
        "(line 302,col 9)-(line 302,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.addToEntry(int, int, double)",
      "begin_line": 306,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 56)",
        "(line 309,col 9)-(line 309,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 313,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 56)",
        "(line 316,col 9)-(line 316,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getRowDimension()",
      "begin_line": 320,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension()",
      "begin_line": 326,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.operate(double[])",
      "begin_line": 332,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 49)",
        "(line 335,col 9)-(line 335,col 52)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 47)",
        "(line 340,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.preMultiply(double[])",
      "begin_line": 352,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 360,col 47)",
        "(line 361,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 374,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 46)",
        "(line 377,col 9)-(line 377,col 49)",
        "(line 378,col 9)-(line 378,col 66)",
        "(line 379,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
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
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 404,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 88)",
        "(line 409,col 9)-(line 410,col 64)",
        "(line 411,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 421,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 88)",
        "(line 426,col 9)-(line 427,col 64)",
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 438,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 46)",
        "(line 441,col 9)-(line 441,col 49)",
        "(line 442,col 9)-(line 442,col 66)",
        "(line 443,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 453,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 456,col 49)",
        "(line 457,col 9)-(line 457,col 66)",
        "(line 458,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 467,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 88)",
        "(line 472,col 9)-(line 473,col 64)",
        "(line 474,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 484,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 88)",
        "(line 489,col 9)-(line 490,col 64)",
        "(line 491,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyOut()",
      "begin_line": 504,
      "end_line": 512,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 49)",
        "(line 506,col 9)-(line 506,col 76)",
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowRealMatrix.copyIn(double[][])",
      "begin_line": 523,
      "end_line": 526,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws NullArgumentException if\n     * the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 31)"
      ]
    }
  ]
}
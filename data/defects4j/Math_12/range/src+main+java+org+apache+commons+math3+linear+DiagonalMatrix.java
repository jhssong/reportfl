{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/linear/DiagonalMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiagonalMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 371,
      "comment": "\n * Implementation of a diagonal matrix.\n * \u003cbr/\u003e\n * Caveat: This implementation is minimal; it is currently solely aimed\n * at solving issue MATH-924. In particular many methods just throw\n * {@code MathUnsupportedOperationException}.\n *\n * @version $Id$\n "
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
      "comment": " Entries of the diagonal. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(int)",
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n     * Creates a matrix with the supplied dimension.\n     *\n     * @param dimension Number of rows and columns in the new matrix.\n     * @throws NotStrictlyPositiveException if the dimension is\n     * not positive.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 36)",
        "(line 51,col 9)-(line 51,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(double[])",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Creates a matrix using the input array as the underlying data. \n     * \u003cbr/\u003e\n     * The input array is copied, not referenced.\n     *\n     * @param d Data for the new matrix.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(double[], boolean)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Creates a matrix using the input array as the underlying data.\n     * \u003cbr/\u003e\n     * If an array is created specially in order to be embedded in a\n     * this instance and not used directly, the {@code copyArray} may be\n     * set to {@code false}.\n     * This will prevent the copying and improve performance as no new\n     * array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.createMatrix(int, int)",
      "begin_line": 87,
      "end_line": 97,
      "comment": " \n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if the requested dimensions are not equal.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.copy()",
      "begin_line": 100,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.add(org.apache.commons.math3.linear.DiagonalMatrix)",
      "begin_line": 113,
      "end_line": 125,
      "comment": "\n     * Compute the sum of {@code this} and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this + m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 53)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.subtract(org.apache.commons.math3.linear.DiagonalMatrix)",
      "begin_line": 135,
      "end_line": 146,
      "comment": "\n     * Returns {@code this} minus {@code m}.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 56)",
        "(line 139,col 9)-(line 139,col 42)",
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiply(org.apache.commons.math3.linear.DiagonalMatrix)",
      "begin_line": 156,
      "end_line": 167,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 59)",
        "(line 160,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 177,
      "end_line": 193,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getData()",
      "begin_line": 196,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 42)",
        "(line 199,col 9)-(line 199,col 52)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getDataRef()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Gets a reference to the underlying data array.\n     *\n     * @return 1-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\n     * @throws MathUnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getEntry(int, int)",
      "begin_line": 229,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 56)",
        "(line 233,col 9)-(line 233,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.setEntry(int, int, double)",
      "begin_line": 239,
      "end_line": 248,
      "comment": " {@inheritDoc}\n     * @throws MathUnsupportedOperationException if {@code row !\u003d column}.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 56)",
        "(line 247,col 9)-(line 247,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.addToEntry(int, int, double)",
      "begin_line": 253,
      "end_line": 264,
      "comment": " {@inheritDoc}\n     * @throws MathUnsupportedOperationException if {@code row !\u003d column}.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 56)",
        "(line 263,col 9)-(line 263,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiplyEntry(int, int, double)",
      "begin_line": 269,
      "end_line": 280,
      "comment": " {@inheritDoc}\n     * @throws MathUnsupportedOperationException if {@code row !\u003d column}.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 56)",
        "(line 279,col 9)-(line 279,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getRowDimension()",
      "begin_line": 283,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getColumnDimension()",
      "begin_line": 289,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.operate(double[])",
      "begin_line": 295,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.preMultiply(double[])",
      "begin_line": 302,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 309,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 316,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 323,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 332,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 341,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 348,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 355,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 364,
      "end_line": 370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 54)"
      ]
    }
  ]
}
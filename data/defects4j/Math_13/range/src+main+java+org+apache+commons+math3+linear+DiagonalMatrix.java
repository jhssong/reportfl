{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/linear/DiagonalMatrix.java",
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
      "end_line": 376,
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
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Creates a matrix with no data.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(int)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Creates a matrix with the supplied dimension.\n     *\n     * @param dimension Number of rows and columns in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if the dimension is\n     * not positive.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 36)",
        "(line 57,col 9)-(line 57,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(double[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Creates a matrix using the input array as the underlying data. \n     * \u003cbr/\u003e\n     * The input array is copied, not referenced.\n     *\n     * @param d Data for the new matrix.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(double[], boolean)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Creates a matrix using the input array as the underlying data.\n     * \u003cbr/\u003e\n     * If an array is built specially in order to be embedded in a\n     * RealMatrix and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.createMatrix(int, int)",
      "begin_line": 92,
      "end_line": 102,
      "comment": " \n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if the requested dimensions are not equal.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.copy()",
      "begin_line": 105,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.add(org.apache.commons.math3.linear.DiagonalMatrix)",
      "begin_line": 118,
      "end_line": 130,
      "comment": "\n     * Compute the sum of {@code this} and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this + m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 53)",
        "(line 123,col 9)-(line 123,col 42)",
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.subtract(org.apache.commons.math3.linear.DiagonalMatrix)",
      "begin_line": 140,
      "end_line": 151,
      "comment": "\n     * Returns {@code this} minus {@code m}.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 56)",
        "(line 144,col 9)-(line 144,col 42)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiply(org.apache.commons.math3.linear.DiagonalMatrix)",
      "begin_line": 161,
      "end_line": 172,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 59)",
        "(line 165,col 9)-(line 165,col 42)",
        "(line 166,col 9)-(line 166,col 49)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 182,
      "end_line": 198,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getData()",
      "begin_line": 201,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 42)",
        "(line 204,col 9)-(line 204,col 52)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getDataRef()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Gets a reference to the underlying data array.\n     *\n     * @return 1-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 225,
      "end_line": 231,
      "comment": "\n     * @throws MathUnsupportedOperationException\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getEntry(int, int)",
      "begin_line": 234,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 56)",
        "(line 238,col 9)-(line 238,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.setEntry(int, int, double)",
      "begin_line": 244,
      "end_line": 253,
      "comment": " {@inheritDoc}\n     * @throws MathUnsupportedOperationException if {@code row !\u003d column}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 56)",
        "(line 252,col 9)-(line 252,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.addToEntry(int, int, double)",
      "begin_line": 258,
      "end_line": 269,
      "comment": " {@inheritDoc}\n     * @throws MathUnsupportedOperationException if {@code row !\u003d column}.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 56)",
        "(line 268,col 9)-(line 268,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiplyEntry(int, int, double)",
      "begin_line": 274,
      "end_line": 285,
      "comment": " {@inheritDoc}\n     * @throws MathUnsupportedOperationException if {@code row !\u003d column}.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 56)",
        "(line 284,col 9)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getRowDimension()",
      "begin_line": 288,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getColumnDimension()",
      "begin_line": 294,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.operate(double[])",
      "begin_line": 300,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.preMultiply(double[])",
      "begin_line": 307,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 314,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 321,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 328,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 337,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 346,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 353,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 360,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 369,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 54)"
      ]
    }
  ]
}
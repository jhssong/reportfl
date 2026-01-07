{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/linear/DiagonalMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiagonalMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 322,
      "comment": "\n * Implementation of a diagonal matrix.\n *\n * @version $Id$\n * @since 3.1.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Entries of the diagonal. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(int)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Creates a matrix with the supplied dimension.\n     *\n     * @param dimension Number of rows and columns in the new matrix.\n     * @throws NotStrictlyPositiveException if the dimension is\n     * not positive.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 36)",
        "(line 53,col 9)-(line 53,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(double[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Creates a matrix using the input array as the underlying data.\n     * \u003cbr/\u003e\n     * The input array is copied, not referenced.\n     *\n     * @param d Data for the new matrix.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.DiagonalMatrix(double[], boolean)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * Creates a matrix using the input array as the underlying data.\n     * \u003cbr/\u003e\n     * If an array is created specially in order to be embedded in a\n     * this instance and not used directly, the {@code copyArray} may be\n     * set to {@code false}.\n     * This will prevent the copying and improve performance as no new\n     * array will be built and no data will be copied.\n     *\n     * @param d Data for new matrix.\n     * @param copyArray if {@code true}, the input array will be copied,\n     * otherwise it will be referenced.\n     * @exception NullArgumentException if d is null\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 34)",
        "(line 84,col 9)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.createMatrix(int, int)",
      "begin_line": 92,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws DimensionMismatchException if the requested dimensions are not equal.\n     ",
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
      "end_line": 199,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getData()",
      "begin_line": 202,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 42)",
        "(line 205,col 9)-(line 205,col 52)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getDataRef()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Gets a reference to the underlying data array.\n     *\n     * @return 1-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getEntry(int, int)",
      "begin_line": 224,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 56)",
        "(line 228,col 9)-(line 228,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.setEntry(int, int, double)",
      "begin_line": 234,
      "end_line": 243,
      "comment": " {@inheritDoc}\n     * @throws NumberIsTooLargeException if {@code row !\u003d column} and value is non-zero.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.addToEntry(int, int, double)",
      "begin_line": 248,
      "end_line": 259,
      "comment": " {@inheritDoc}\n     * @throws NumberIsTooLargeException if {@code row !\u003d column} and increment is non-zero.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.multiplyEntry(int, int, double)",
      "begin_line": 262,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getRowDimension()",
      "begin_line": 275,
      "end_line": 278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.getColumnDimension()",
      "begin_line": 281,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.operate(double[])",
      "begin_line": 287,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.preMultiply(double[])",
      "begin_line": 294,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.preMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 301,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 34)",
        "(line 304,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DiagonalMatrix.ensureZero(double)",
      "begin_line": 316,
      "end_line": 320,
      "comment": " Ensure a value is zero.\n     * @param value value to check\n     * @exception NumberIsTooLargeException if value is not zero\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)"
      ]
    }
  ]
}
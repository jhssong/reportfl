{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/linear/OpenMapRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "org.apache.commons.math3.linear.SparseRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 274,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.OpenMapRealMatrix(int, int)",
      "begin_line": 48,
      "end_line": 58,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows of the matrix.\n     * @param columnDimension Number of columns of the matrix.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)",
        "(line 50,col 9)-(line 50,col 33)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 57,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.OpenMapRealMatrix(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Build a matrix by copying another one.\n     *\n     * @param matrix matrix to copy.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)",
        "(line 67,col 9)-(line 67,col 38)",
        "(line 68,col 9)-(line 68,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.copy()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.createMatrix(int, int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.getColumnDimension()",
      "begin_line": 82,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.add(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 95,
      "end_line": 110,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 53)",
        "(line 100,col 9)-(line 100,col 66)",
        "(line 101,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 113,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.subtract(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 53)",
        "(line 134,col 9)-(line 134,col 66)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 146,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.multiply(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 181,
      "end_line": 209,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws MatrixDimensionMismatchException\n     * if the number of rows of {@code m} differ from the number of columns\n     * of this matrix.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 59)",
        "(line 185,col 9)-(line 185,col 51)",
        "(line 186,col 9)-(line 186,col 69)",
        "(line 187,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 45)",
        "(line 214,col 9)-(line 214,col 51)",
        "(line 215,col 9)-(line 215,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.getRowDimension()",
      "begin_line": 219,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.setEntry(int, int, double)",
      "begin_line": 225,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 45)",
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.addToEntry(int, int, double)",
      "begin_line": 236,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 45)",
        "(line 239,col 9)-(line 239,col 51)",
        "(line 240,col 9)-(line 240,col 48)",
        "(line 241,col 9)-(line 241,col 58)",
        "(line 242,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 250,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 45)",
        "(line 253,col 9)-(line 253,col 51)",
        "(line 254,col 9)-(line 254,col 48)",
        "(line 255,col 9)-(line 255,col 55)",
        "(line 256,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.computeKey(int, int)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 38)"
      ]
    }
  ]
}
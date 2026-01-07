{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/linear/OpenMapRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OpenMapRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "org.apache.commons.math.linear.SparseRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 273,
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
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(int, int)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows of the matrix.\n     * @param columnDimension Number of columns of the matrix.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)",
        "(line 50,col 9)-(line 50,col 33)",
        "(line 51,col 9)-(line 51,col 39)",
        "(line 52,col 9)-(line 52,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Build a matrix by copying another one.\n     *\n     * @param matrix matrix to copy.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 32)",
        "(line 62,col 9)-(line 62,col 38)",
        "(line 63,col 9)-(line 63,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.copy()",
      "begin_line": 67,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.createMatrix(int, int)",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getColumnDimension()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.add(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 92,
      "end_line": 107,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 53)",
        "(line 97,col 9)-(line 97,col 66)",
        "(line 98,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 110,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 127,
      "end_line": 140,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 53)",
        "(line 131,col 9)-(line 131,col 66)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 143,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 178,
      "end_line": 206,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws MatrixDimensionMismatchException\n     * if the number of rows of {@code m} differ from the number of columns\n     * of this matrix.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 59)",
        "(line 182,col 9)-(line 182,col 51)",
        "(line 183,col 9)-(line 183,col 69)",
        "(line 184,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(int, int)",
      "begin_line": 209,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 45)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getRowDimension()",
      "begin_line": 217,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(int, int, double)",
      "begin_line": 223,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 45)",
        "(line 226,col 9)-(line 226,col 51)",
        "(line 227,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(int, int, double)",
      "begin_line": 235,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 238,col 51)",
        "(line 239,col 9)-(line 239,col 48)",
        "(line 240,col 9)-(line 240,col 58)",
        "(line 241,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 249,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 45)",
        "(line 252,col 9)-(line 252,col 51)",
        "(line 253,col 9)-(line 253,col 48)",
        "(line 254,col 9)-(line 254,col 55)",
        "(line 255,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.computeKey(int, int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 38)"
      ]
    }
  ]
}
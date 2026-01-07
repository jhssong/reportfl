{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/linear/OpenMapRealMatrix.java",
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
      "begin_line": 30,
      "end_line": 272,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(int, int)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows of the matrix.\n     * @param columnDimension Number of columns of the matrix.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)",
        "(line 49,col 9)-(line 49,col 33)",
        "(line 50,col 9)-(line 50,col 39)",
        "(line 51,col 9)-(line 51,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Build a matrix by copying another one.\n     *\n     * @param matrix matrix to copy.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 32)",
        "(line 61,col 9)-(line 61,col 38)",
        "(line 62,col 9)-(line 62,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.copy()",
      "begin_line": 66,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.createMatrix(int, int)",
      "begin_line": 72,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getColumnDimension()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.add(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 91,
      "end_line": 106,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 53)",
        "(line 96,col 9)-(line 96,col 66)",
        "(line 97,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 109,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 126,
      "end_line": 139,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 53)",
        "(line 130,col 9)-(line 130,col 66)",
        "(line 131,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 142,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 177,
      "end_line": 205,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws MatrixDimensionMismatchException\n     * if the number of rows of {@code m} differ from the number of columns\n     * of this matrix.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 59)",
        "(line 181,col 9)-(line 181,col 51)",
        "(line 182,col 9)-(line 182,col 69)",
        "(line 183,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(int, int)",
      "begin_line": 208,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 212,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getRowDimension()",
      "begin_line": 216,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(int, int, double)",
      "begin_line": 222,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 45)",
        "(line 225,col 9)-(line 225,col 51)",
        "(line 226,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(int, int, double)",
      "begin_line": 234,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 45)",
        "(line 237,col 9)-(line 237,col 51)",
        "(line 238,col 9)-(line 238,col 48)",
        "(line 239,col 9)-(line 239,col 58)",
        "(line 240,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 248,
      "end_line": 259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 45)",
        "(line 251,col 9)-(line 251,col 51)",
        "(line 252,col 9)-(line 252,col 48)",
        "(line 253,col 9)-(line 253,col 55)",
        "(line 254,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.computeKey(int, int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 38)"
      ]
    }
  ]
}
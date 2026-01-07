{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/linear/OpenMapRealMatrix.java",
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
      "end_line": 278,
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
      "end_line": 58,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows of the matrix.\n     * @param columnDimension Number of columns of the matrix.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)",
        "(line 50,col 9)-(line 50,col 40)",
        "(line 51,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 57,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix)",
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
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.copy()",
      "begin_line": 72,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.createMatrix(int, int)",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getColumnDimension()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.add(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 97,
      "end_line": 112,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 53)",
        "(line 102,col 9)-(line 102,col 66)",
        "(line 103,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 115,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 132,
      "end_line": 145,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 53)",
        "(line 136,col 9)-(line 136,col 66)",
        "(line 137,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 148,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 183,
      "end_line": 211,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws MatrixDimensionMismatchException\n     * if the number of rows of {@code m} differ from the number of columns\n     * of this matrix.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 59)",
        "(line 187,col 9)-(line 187,col 51)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(int, int)",
      "begin_line": 214,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 45)",
        "(line 217,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 218,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getRowDimension()",
      "begin_line": 222,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(int, int, double)",
      "begin_line": 228,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 45)",
        "(line 231,col 9)-(line 231,col 51)",
        "(line 232,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(int, int, double)",
      "begin_line": 240,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 45)",
        "(line 243,col 9)-(line 243,col 51)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 58)",
        "(line 246,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 254,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 45)",
        "(line 257,col 9)-(line 257,col 51)",
        "(line 258,col 9)-(line 258,col 48)",
        "(line 259,col 9)-(line 259,col 55)",
        "(line 260,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.computeKey(int, int)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 38)"
      ]
    }
  ]
}
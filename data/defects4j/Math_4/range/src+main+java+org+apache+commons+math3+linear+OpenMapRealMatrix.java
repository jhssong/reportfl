{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/OpenMapRealMatrix.java",
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
      "begin_line": 39,
      "end_line": 310,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @version $Id$\n * @since 2.0\n * @deprecated As of version 3.1, this class is deprecated, for reasons exposed\n * in this JIRA\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-870\"\u003eticket\u003c/a\u003e. This\n * class will be removed in version 4.0.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.OpenMapRealMatrix(int, int)",
      "begin_line": 61,
      "end_line": 72,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension Number of rows of the matrix.\n     * @param columnDimension Number of columns of the matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @throws NumberIsTooLargeException if the total number of entries of the\n     * matrix is larger than {@code Integer.MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 45)",
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 65,col 36)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 70,col 39)",
        "(line 71,col 9)-(line 71,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.OpenMapRealMatrix(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Build a matrix by copying another one.\n     *\n     * @param matrix matrix to copy.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.copy()",
      "begin_line": 86,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.createMatrix(int, int)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NumberIsTooLargeException if the total number of entries of the\n     * matrix is larger than {@code Integer.MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.getColumnDimension()",
      "begin_line": 104,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.add(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 117,
      "end_line": 132,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 53)",
        "(line 122,col 9)-(line 122,col 66)",
        "(line 123,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 135,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.subtract(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 153,
      "end_line": 166,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 53)",
        "(line 157,col 9)-(line 157,col 66)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 175,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NumberIsTooLargeException if {@code m} is an\n     * {@code OpenMapRealMatrix}, and the total number of entries of the product\n     * is larger than {@code Integer.MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.multiply(org.apache.commons.math3.linear.OpenMapRealMatrix)",
      "begin_line": 211,
      "end_line": 240,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws DimensionMismatchException if the number of rows of {@code m}\n     * differ from the number of columns of {@code this} matrix.\n     * @throws NumberIsTooLargeException if the total number of entries of the\n     * product is larger than {@code Integer.MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 59)",
        "(line 216,col 9)-(line 216,col 51)",
        "(line 217,col 9)-(line 217,col 69)",
        "(line 218,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(int, int)",
      "begin_line": 243,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 246,col 51)",
        "(line 247,col 9)-(line 247,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.getRowDimension()",
      "begin_line": 251,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.setEntry(int, int, double)",
      "begin_line": 257,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 45)",
        "(line 261,col 9)-(line 261,col 51)",
        "(line 262,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.addToEntry(int, int, double)",
      "begin_line": 270,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 274,col 51)",
        "(line 275,col 9)-(line 275,col 48)",
        "(line 276,col 9)-(line 276,col 58)",
        "(line 277,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 285,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 45)",
        "(line 289,col 9)-(line 289,col 51)",
        "(line 290,col 9)-(line 290,col 48)",
        "(line 291,col 9)-(line 291,col 55)",
        "(line 292,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.OpenMapRealMatrix.computeKey(int, int)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 38)"
      ]
    }
  ]
}
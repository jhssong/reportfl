{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/OpenMapRealMatrix.java",
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
      "end_line": 292,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "begin_line": 36,
      "end_line": 36,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(int, int)",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     * @param rowDimension number of rows of the matrix\n     * @param columnDimension number of columns of the matrix\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 45)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 53,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.OpenMapRealMatrix(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Build a matrix by copying another one.\n     * @param matrix matrix to copy\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 35)",
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
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getColumnDimension()",
      "begin_line": 80,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 86,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.add(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 103,
      "end_line": 118,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 53)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 121,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.subtract(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 138,
      "end_line": 153,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 53)",
        "(line 143,col 9)-(line 143,col 66)",
        "(line 144,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 156,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiply(org.apache.commons.math.linear.OpenMapRealMatrix)",
      "begin_line": 192,
      "end_line": 222,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 59)",
        "(line 197,col 9)-(line 197,col 51)",
        "(line 198,col 9)-(line 198,col 69)",
        "(line 199,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(int, int)",
      "begin_line": 225,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 45)",
        "(line 228,col 9)-(line 228,col 51)",
        "(line 229,col 9)-(line 229,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.getRowDimension()",
      "begin_line": 233,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(int, int, double)",
      "begin_line": 239,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 45)",
        "(line 243,col 9)-(line 243,col 51)",
        "(line 244,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(int, int, double)",
      "begin_line": 252,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 45)",
        "(line 256,col 9)-(line 256,col 51)",
        "(line 257,col 9)-(line 257,col 48)",
        "(line 258,col 9)-(line 258,col 58)",
        "(line 259,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 267,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 45)",
        "(line 271,col 9)-(line 271,col 51)",
        "(line 272,col 9)-(line 272,col 48)",
        "(line 273,col 9)-(line 273,col 55)",
        "(line 274,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.OpenMapRealMatrix.computeKey(int, int)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 38)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/linear/SparseRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix"
      ],
      "begin_line": 28,
      "end_line": 289,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n * \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "rowDimension"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columnDimension"
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
      "begin_line": 40,
      "end_line": 40,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.SparseRealMatrix(int, int)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n     * Build a sparse matrix with the supplied row and column dimensions.\n     * @param rowDimension number of rows of the matrix\n     * @param columnDimension number of columns of the matrix\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)",
        "(line 49,col 9)-(line 49,col 41)",
        "(line 50,col 9)-(line 50,col 47)",
        "(line 51,col 9)-(line 51,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.SparseRealMatrix(org.apache.commons.math.linear.SparseRealMatrix)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Build a matrix by copying another one.\n     * @param matrix matrix to copy\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 48)",
        "(line 60,col 9)-(line 60,col 54)",
        "(line 61,col 9)-(line 61,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.copy()",
      "begin_line": 65,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.createMatrix(int, int)",
      "begin_line": 71,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.getColumnDimension()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 84,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.add(org.apache.commons.math.linear.SparseRealMatrix)",
      "begin_line": 101,
      "end_line": 116,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 35)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 119,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.subtract(org.apache.commons.math.linear.SparseRealMatrix)",
      "begin_line": 136,
      "end_line": 151,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 35)",
        "(line 141,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 154,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.multiply(org.apache.commons.math.linear.SparseRealMatrix)",
      "begin_line": 190,
      "end_line": 220,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 41)",
        "(line 195,col 9)-(line 195,col 51)",
        "(line 196,col 9)-(line 196,col 75)",
        "(line 197,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.getEntry(int, int)",
      "begin_line": 223,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 27)",
        "(line 226,col 9)-(line 226,col 33)",
        "(line 227,col 9)-(line 227,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.getRowDimension()",
      "begin_line": 231,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.setEntry(int, int, double)",
      "begin_line": 237,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 27)",
        "(line 241,col 9)-(line 241,col 33)",
        "(line 242,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.addToEntry(int, int, double)",
      "begin_line": 250,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 27)",
        "(line 254,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 255,col 48)",
        "(line 256,col 9)-(line 256,col 58)",
        "(line 257,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 265,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 27)",
        "(line 269,col 9)-(line 269,col 33)",
        "(line 270,col 9)-(line 270,col 48)",
        "(line 271,col 9)-(line 271,col 55)",
        "(line 272,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.computeKey(int, int)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 46)"
      ]
    }
  ]
}
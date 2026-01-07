{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/linear/SparseRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix"
      ],
      "begin_line": 28,
      "end_line": 218,
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
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.add(org.apache.commons.math.linear.SparseRealMatrix)",
      "begin_line": 100,
      "end_line": 115,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 35)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 106,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 118,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.subtract(org.apache.commons.math.linear.SparseRealMatrix)",
      "begin_line": 134,
      "end_line": 149,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 35)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.getEntry(int, int)",
      "begin_line": 152,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.getRowDimension()",
      "begin_line": 160,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.setEntry(int, int, double)",
      "begin_line": 166,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 27)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.addToEntry(int, int, double)",
      "begin_line": 179,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 27)",
        "(line 183,col 9)-(line 183,col 33)",
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 185,col 58)",
        "(line 186,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 194,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 48)",
        "(line 200,col 9)-(line 200,col 55)",
        "(line 201,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealMatrix.computeKey(int, int)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 46)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/SparseFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e"
      ],
      "begin_line": 30,
      "end_line": 190,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     *  Serial id\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * row dimension\n     "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * column dimension\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Creates a matrix with no data.\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)",
        "(line 53,col 9)-(line 53,col 17)",
        "(line 54,col 9)-(line 54,col 19)",
        "(line 55,col 9)-(line 55,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "\n     * Create a new SparseFieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 52)",
        "(line 70,col 9)-(line 70,col 33)",
        "(line 71,col 9)-(line 71,col 39)",
        "(line 72,col 9)-(line 72,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.linear.SparseFieldMatrix\u003cT\u003e)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Copy constructor.\n     * @param other The instance to copy\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 85)",
        "(line 81,col 9)-(line 81,col 39)",
        "(line 82,col 9)-(line 82,col 45)",
        "(line 83,col 9)-(line 83,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 90,
      "end_line": 100,
      "comment": "\n     * Generic copy constructor.\n     * @param other The instance to copy\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 85)",
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 93,col 45)",
        "(line 94,col 9)-(line 94,col 59)",
        "(line 95,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 103,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 48)",
        "(line 109,col 9)-(line 109,col 56)",
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.copy()",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.createMatrix(int, int)",
      "begin_line": 125,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getColumnDimension()",
      "begin_line": 132,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getEntry(int, int)",
      "begin_line": 138,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 33)",
        "(line 142,col 9)-(line 142,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getRowDimension()",
      "begin_line": 146,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 152,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 27)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 48)",
        "(line 158,col 9)-(line 158,col 58)",
        "(line 159,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.setEntry(int, int, T)",
      "begin_line": 168,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 33)",
        "(line 173,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.computeKey(int, int)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Compute the key to access a matrix element\n     * @param row row index of the matrix element\n     * @param column column index of the matrix element\n     * @return key within the map to access the matrix element\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 38)"
      ]
    }
  ]
}
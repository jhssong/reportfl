{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/SparseFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e"
      ],
      "begin_line": 35,
      "end_line": 187,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n * @deprecated As of version 3.1, this class is deprecated, for reasons exposed\n * in this JIRA\n * \u003ca href\u003d\"https://issues.apache.org/jira/browse/MATH-870\"\u003eticket\u003c/a\u003e. This\n * class will be removed in version 4.0.\n *\n "
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
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Row dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Column dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 50,
      "end_line": 55,
      "comment": "\n     * Create a matrix with no data.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)",
        "(line 52,col 9)-(line 52,col 17)",
        "(line 53,col 9)-(line 53,col 19)",
        "(line 54,col 9)-(line 54,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "\n     * Create a new SparseFieldMatrix\u003cT\u003e with the supplied row and column\n     * dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 52)",
        "(line 70,col 9)-(line 70,col 33)",
        "(line 71,col 9)-(line 71,col 39)",
        "(line 72,col 9)-(line 72,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math3.linear.SparseFieldMatrix\u003cT\u003e)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 85)",
        "(line 82,col 9)-(line 82,col 39)",
        "(line 83,col 9)-(line 83,col 45)",
        "(line 84,col 9)-(line 84,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 92,
      "end_line": 102,
      "comment": "\n     * Generic copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 85)",
        "(line 94,col 9)-(line 94,col 39)",
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 59)",
        "(line 97,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 105,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 27)",
        "(line 108,col 9)-(line 108,col 33)",
        "(line 109,col 9)-(line 109,col 48)",
        "(line 110,col 9)-(line 110,col 56)",
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.copy()",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.createMatrix(int, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.getColumnDimension()",
      "begin_line": 131,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.getEntry(int, int)",
      "begin_line": 137,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 141,col 9)-(line 141,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.getRowDimension()",
      "begin_line": 145,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 151,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 27)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 48)",
        "(line 156,col 9)-(line 156,col 58)",
        "(line 157,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.setEntry(int, int, T)",
      "begin_line": 166,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 27)",
        "(line 169,col 9)-(line 169,col 33)",
        "(line 170,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SparseFieldMatrix.computeKey(int, int)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Compute the key to access a matrix element.\n     *\n     * @param row Row index of the matrix element.\n     * @param column Column index of the matrix element.\n     * @return the key within the map to access the matrix element.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 38)"
      ]
    }
  ]
}
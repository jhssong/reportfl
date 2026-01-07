{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/linear/SparseFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e"
      ],
      "begin_line": 30,
      "end_line": 181,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Row dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Column dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 44,
      "end_line": 49,
      "comment": "\n     * Create a matrix with no data.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)",
        "(line 46,col 9)-(line 46,col 17)",
        "(line 47,col 9)-(line 47,col 19)",
        "(line 48,col 9)-(line 48,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "\n     * Create a new SparseFieldMatrix\u003cT\u003e with the supplied row and column\n     * dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 52)",
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 65,col 39)",
        "(line 66,col 9)-(line 66,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.linear.SparseFieldMatrix\u003cT\u003e)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 85)",
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 45)",
        "(line 78,col 9)-(line 78,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 86,
      "end_line": 96,
      "comment": "\n     * Generic copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 85)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 45)",
        "(line 90,col 9)-(line 90,col 59)",
        "(line 91,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 99,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 27)",
        "(line 102,col 9)-(line 102,col 33)",
        "(line 103,col 9)-(line 103,col 48)",
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.copy()",
      "begin_line": 113,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.createMatrix(int, int)",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getColumnDimension()",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getEntry(int, int)",
      "begin_line": 131,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 134,col 33)",
        "(line 135,col 9)-(line 135,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getRowDimension()",
      "begin_line": 139,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 145,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 27)",
        "(line 148,col 9)-(line 148,col 33)",
        "(line 149,col 9)-(line 149,col 48)",
        "(line 150,col 9)-(line 150,col 58)",
        "(line 151,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.setEntry(int, int, T)",
      "begin_line": 160,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 27)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.computeKey(int, int)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Compute the key to access a matrix element.\n     *\n     * @param row Row index of the matrix element.\n     * @param column Column index of the matrix element.\n     * @return the key within the map to access the matrix element.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 38)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/linear/SparseFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e"
      ],
      "begin_line": 30,
      "end_line": 182,
      "comment": "\n * Sparse matrix implementation based on an open addressed map.\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Storage for (sparse) matrix elements. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Row dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Column dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "\n     * Create a matrix with no data.\n     *\n     * @param field Field to which the elements belong.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 21)",
        "(line 47,col 9)-(line 47,col 17)",
        "(line 48,col 9)-(line 48,col 19)",
        "(line 49,col 9)-(line 49,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Create a new SparseFieldMatrix\u003cT\u003e with the supplied row and column\n     * dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 52)",
        "(line 65,col 9)-(line 65,col 33)",
        "(line 66,col 9)-(line 66,col 39)",
        "(line 67,col 9)-(line 67,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.linear.SparseFieldMatrix\u003cT\u003e)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 85)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 45)",
        "(line 79,col 9)-(line 79,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.SparseFieldMatrix(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 87,
      "end_line": 97,
      "comment": "\n     * Generic copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 85)",
        "(line 89,col 9)-(line 89,col 39)",
        "(line 90,col 9)-(line 90,col 45)",
        "(line 91,col 9)-(line 91,col 59)",
        "(line 92,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 100,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 48)",
        "(line 105,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.copy()",
      "begin_line": 114,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.createMatrix(int, int)",
      "begin_line": 120,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getColumnDimension()",
      "begin_line": 126,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getEntry(int, int)",
      "begin_line": 132,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 33)",
        "(line 136,col 9)-(line 136,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.getRowDimension()",
      "begin_line": 140,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 146,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 48)",
        "(line 151,col 9)-(line 151,col 58)",
        "(line 152,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.setEntry(int, int, T)",
      "begin_line": 161,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 27)",
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseFieldMatrix.computeKey(int, int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Compute the key to access a matrix element.\n     *\n     * @param row Row index of the matrix element.\n     * @param column Column index of the matrix element.\n     * @return the key within the map to access the matrix element.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)"
      ]
    }
  ]
}
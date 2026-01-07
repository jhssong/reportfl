{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/NonSymmetricMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSymmetricMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 28,
      "end_line": 72,
      "comment": "\n * Exception to be thrown when a symmetric matrix is expected.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "row"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Row. "
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Column. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.NonSymmetricMatrixException.NonSymmetricMatrixException(int, int, double)",
      "begin_line": 45,
      "end_line": 52,
      "comment": "\n     * Construct an exception.\n     *\n     * @param row Row index.\n     * @param column Column index.\n     * @param threshold Relative symmetry threshold.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 77)",
        "(line 49,col 9)-(line 49,col 23)",
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.NonSymmetricMatrixException.getRow()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * @return the row index of the entry.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.NonSymmetricMatrixException.getColumn()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * @return the column index of the entry.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.NonSymmetricMatrixException.getThreshold()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * @return the relative symmetry threshold.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 25)"
      ]
    }
  ]
}
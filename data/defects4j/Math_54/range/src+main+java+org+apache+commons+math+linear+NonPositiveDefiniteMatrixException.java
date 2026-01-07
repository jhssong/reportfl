{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/linear/NonPositiveDefiniteMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 28,
      "end_line": 67,
      "comment": "\n * Exception to be thrown when a symmetric matrix is expected.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
        "index"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Index (diagonal element). "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteMatrixException.NonPositiveDefiniteMatrixException(int, double)",
      "begin_line": 42,
      "end_line": 47,
      "comment": "\n     * Construct an exception.\n     *\n     * @param index Row (and column) index.\n     * @param threshold Absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 79)",
        "(line 45,col 9)-(line 45,col 27)",
        "(line 46,col 9)-(line 46,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteMatrixException.getRow()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * @return the row index.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteMatrixException.getColumn()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @return the column index.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.NonPositiveDefiniteMatrixException.getThreshold()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * @return the absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 25)"
      ]
    }
  ]
}
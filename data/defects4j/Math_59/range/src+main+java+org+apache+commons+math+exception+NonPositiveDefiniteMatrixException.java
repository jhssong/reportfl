{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/exception/NonPositiveDefiniteMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 27,
      "end_line": 68,
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
      "begin_line": 33,
      "end_line": 33,
      "comment": " Index (diagonal element). "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.NonPositiveDefiniteMatrixException(int, double)",
      "begin_line": 43,
      "end_line": 48,
      "comment": "\n     * Construct an exception.\n     *\n     * @param index Row (and column) index.\n     * @param threshold Absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 79)",
        "(line 46,col 9)-(line 46,col 27)",
        "(line 47,col 9)-(line 47,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.getRow()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return the row index.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.getColumn()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * @return the column index.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.getThreshold()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @return the absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)"
      ]
    }
  ]
}
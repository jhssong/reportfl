{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/NonPositiveDefiniteMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.NumberIsTooSmallException"
      ],
      "begin_line": 29,
      "end_line": 74,
      "comment": "\n * Exception to be thrown when a positive definite matrix is expected.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
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
      "signature": "org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException.NonPositiveDefiniteMatrixException(double, int, double)",
      "begin_line": 44,
      "end_line": 54,
      "comment": "\n     * Construct an exception.\n     *\n     * @param wrong Value that fails the positivity check.\n     * @param index Row (and column) index.\n     * @param threshold Absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 39)",
        "(line 48,col 9)-(line 48,col 27)",
        "(line 49,col 9)-(line 49,col 35)",
        "(line 51,col 9)-(line 51,col 54)",
        "(line 52,col 9)-(line 52,col 74)",
        "(line 53,col 9)-(line 53,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException.getRow()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * @return the row index.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException.getColumn()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @return the column index.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException.getThreshold()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @return the absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 25)"
      ]
    }
  ]
}
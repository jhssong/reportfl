{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/NonPositiveDefiniteMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonPositiveDefiniteMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 27,
      "end_line": 64,
      "comment": "\n * Exception to be thrown when a symmetric matrix is expected.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Index (diagonal element). "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.NonPositiveDefiniteMatrixException(int, double)",
      "begin_line": 39,
      "end_line": 44,
      "comment": "\n     * Construct an exception.\n     *\n     * @param index Row (and column) index.\n     * @param threshold Absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 79)",
        "(line 42,col 9)-(line 42,col 27)",
        "(line 43,col 9)-(line 43,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.getRow()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * @return the row index.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.getColumn()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * @return the column index.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException.getThreshold()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * @return the absolute positivity threshold.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 25)"
      ]
    }
  ]
}
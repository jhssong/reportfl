{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/NonSymmetricMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSymmetricMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 27,
      "end_line": 69,
      "comment": "\n * Exception to be thrown when a symmetric matrix is expected.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "row"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Row. "
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Column. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.NonSymmetricMatrixException(int, int, double)",
      "begin_line": 42,
      "end_line": 49,
      "comment": "\n     * Construct an exception.\n     *\n     * @param row Row index.\n     * @param column Column index.\n     * @param threshold Relative symmetry threshold.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 77)",
        "(line 46,col 9)-(line 46,col 23)",
        "(line 47,col 9)-(line 47,col 29)",
        "(line 48,col 9)-(line 48,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.getRow()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @return the row index of the entry.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.getColumn()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * @return the column index of the entry.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.getThreshold()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * @return the relative symmetry threshold.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 25)"
      ]
    }
  ]
}
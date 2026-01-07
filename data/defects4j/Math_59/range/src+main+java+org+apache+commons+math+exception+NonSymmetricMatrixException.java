{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/exception/NonSymmetricMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSymmetricMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 27,
      "end_line": 73,
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
        "row"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Row. "
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Column. "
    },
    {
      "type": "field",
      "varNames": [
        "threshold"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Threshold. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.NonSymmetricMatrixException(int, int, double)",
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n     * Construct an exception.\n     *\n     * @param row Row index.\n     * @param column Column index.\n     * @param threshold Relative symmetry threshold.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 77)",
        "(line 50,col 9)-(line 50,col 23)",
        "(line 51,col 9)-(line 51,col 29)",
        "(line 52,col 9)-(line 52,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.getRow()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @return the row index of the entry.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.getColumn()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * @return the column index of the entry.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NonSymmetricMatrixException.getThreshold()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @return the relative symmetry threshold.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)"
      ]
    }
  ]
}
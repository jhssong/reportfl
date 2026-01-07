{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MaxCountExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxCountExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalStateException"
      ],
      "begin_line": 28,
      "end_line": 64,
      "comment": "\n * Exception to be thrown when some counter maximum value is exceeded.\n *\n * @since 3.0\n * @version $Id$\n "
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
        "max"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Maximum number of evaluations.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MaxCountExceededException.MaxCountExceededException(java.lang.Number)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Construct the exception.\n     *\n     * @param max Maximum.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MaxCountExceededException.MaxCountExceededException(org.apache.commons.math3.exception.util.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific context pattern.\n     * @param max Maximum.\n     * @param args Additional arguments.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 53)",
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MaxCountExceededException.getMax()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * @return the maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 19)"
      ]
    }
  ]
}
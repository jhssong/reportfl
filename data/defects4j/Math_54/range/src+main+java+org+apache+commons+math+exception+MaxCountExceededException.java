{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/exception/MaxCountExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxCountExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalStateException"
      ],
      "begin_line": 28,
      "end_line": 65,
      "comment": "\n * Exception to be thrown when some counter maximum value is exceeded.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.exception.MaxCountExceededException.MaxCountExceededException(java.lang.Number)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Construct the exception.\n     *\n     * @param max Maximum.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 56)",
        "(line 43,col 9)-(line 43,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MaxCountExceededException.MaxCountExceededException(org.apache.commons.math.exception.util.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 52,
      "end_line": 57,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern.\n     * @param max Maximum.\n     * @param args Additional arguments.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 18)",
        "(line 56,col 9)-(line 56,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MaxCountExceededException.getMax()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @return the maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 19)"
      ]
    }
  ]
}
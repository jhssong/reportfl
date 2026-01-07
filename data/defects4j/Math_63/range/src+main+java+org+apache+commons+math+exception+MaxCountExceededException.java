{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/exception/MaxCountExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxCountExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalStateException"
      ],
      "begin_line": 28,
      "end_line": 66,
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
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Maximum number of evaluations.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MaxCountExceededException.MaxCountExceededException(java.lang.Number)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Construct the exception.\n     *\n     * @param max Maximum.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MaxCountExceededException.MaxCountExceededException(org.apache.commons.math.exception.util.Localizable, java.lang.Number)",
      "begin_line": 51,
      "end_line": 58,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern.\n     * @param max Maximum.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 19)",
        "(line 57,col 9)-(line 57,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MaxCountExceededException.getMax()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * @return the maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 19)"
      ]
    }
  ]
}
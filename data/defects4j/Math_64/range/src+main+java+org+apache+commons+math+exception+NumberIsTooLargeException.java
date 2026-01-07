{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/exception/NumberIsTooLargeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooLargeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 89,
      "comment": "\n * Exception to be thrown when a number is too large.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
        "max"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Higher bound.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundIsAllowed"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Whether the maximum is included in the allowed range.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.NumberIsTooLargeException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is larger than the maximum.\n     * @param max maximum.\n     * @param boundIsAllowed if true the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.NumberIsTooLargeException(org.apache.commons.math.exception.util.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 62,
      "end_line": 74,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern .\n     * @param wrong Value that is larger than the maximum.\n     * @param max maximum.\n     * @param boundIsAllowed if true the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 70,col 26)",
        "(line 72,col 9)-(line 72,col 23)",
        "(line 73,col 9)-(line 73,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.getBoundIsAllowed()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * @return {@code true} if the maximum is included in the allowed range.\n     *",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.getMax()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * @return the maximum.\n     *",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 19)"
      ]
    }
  ]
}
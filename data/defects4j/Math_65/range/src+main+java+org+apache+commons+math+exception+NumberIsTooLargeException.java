{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/exception/NumberIsTooLargeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooLargeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 26,
      "end_line": 87,
      "comment": "\n * Exception to be thrown when a number is too large.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Higher bound.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundIsAllowed"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Whether the maximum is included in the allowed range.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.NumberIsTooLargeException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 47,
      "end_line": 51,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is larger than the maximum.\n     * @param max maximum.\n     * @param boundIsAllowed if true the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.NumberIsTooLargeException(org.apache.commons.math.exception.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 60,
      "end_line": 72,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern .\n     * @param wrong Value that is larger than the maximum.\n     * @param max maximum.\n     * @param boundIsAllowed if true the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 68,col 26)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.getBoundIsAllowed()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return {@code true} if the maximum is included in the allowed range.\n     *",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.getMax()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * @return the maximum.\n     *",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 19)"
      ]
    }
  ]
}
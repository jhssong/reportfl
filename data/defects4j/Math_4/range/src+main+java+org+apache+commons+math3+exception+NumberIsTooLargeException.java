{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NumberIsTooLargeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooLargeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 86,
      "comment": "\n * Exception to be thrown when a number is too large.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.exception.NumberIsTooLargeException.NumberIsTooLargeException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 47,
      "end_line": 54,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is larger than the maximum.\n     * @param max Maximum.\n     * @param boundIsAllowed if true the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 53,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NumberIsTooLargeException.NumberIsTooLargeException(org.apache.commons.math3.exception.util.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 63,
      "end_line": 71,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific context pattern.\n     * @param wrong Value that is larger than the maximum.\n     * @param max Maximum.\n     * @param boundIsAllowed if true the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)",
        "(line 69,col 9)-(line 69,col 23)",
        "(line 70,col 9)-(line 70,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NumberIsTooLargeException.getBoundIsAllowed()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @return {@code true} if the maximum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NumberIsTooLargeException.getMax()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @return the maximum.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)"
      ]
    }
  ]
}
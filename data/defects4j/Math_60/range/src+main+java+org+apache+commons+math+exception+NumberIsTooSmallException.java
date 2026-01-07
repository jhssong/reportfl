{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/NumberIsTooSmallException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooSmallException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 90,
      "comment": "\n * Exception to be thrown when a number is too small.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
        "min"
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
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.NumberIsTooSmallException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is smaller than the minimum.\n     * @param min Minimum.\n     * @param boundIsAllowed Whether {@code min} is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.NumberIsTooSmallException(org.apache.commons.math.exception.util.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 63,
      "end_line": 75,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern.\n     * @param wrong Value that is smaller than the minimum.\n     * @param min Minimum.\n     * @param boundIsAllowed Whether {@code min} is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 26)",
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 74,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.getBoundIsAllowed()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * @return {@code true} if the minimum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.getMin()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * @return the minimum.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)"
      ]
    }
  ]
}
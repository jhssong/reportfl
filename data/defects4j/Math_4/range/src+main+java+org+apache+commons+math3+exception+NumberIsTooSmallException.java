{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NumberIsTooSmallException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooSmallException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 87,
      "comment": "\n * Exception to be thrown when a number is too small.\n *\n * @since 2.2\n * @version $Id$\n "
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
        "min"
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
      "signature": "org.apache.commons.math3.exception.NumberIsTooSmallException.NumberIsTooSmallException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 47,
      "end_line": 54,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is smaller than the minimum.\n     * @param min Minimum.\n     * @param boundIsAllowed Whether {@code min} is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 53,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NumberIsTooSmallException.NumberIsTooSmallException(org.apache.commons.math3.exception.util.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 64,
      "end_line": 72,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific context pattern.\n     * @param wrong Value that is smaller than the minimum.\n     * @param min Minimum.\n     * @param boundIsAllowed Whether {@code min} is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 36)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NumberIsTooSmallException.getBoundIsAllowed()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return {@code true} if the minimum is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.NumberIsTooSmallException.getMin()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * @return the minimum.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 19)"
      ]
    }
  ]
}
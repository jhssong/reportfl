{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/exception/NumberIsTooSmallException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooSmallException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 86,
      "comment": "\n * Exception to be thrown when a number is too small.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Higher bound.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundIsAllowed"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Whether the maximum is included in the allowed range.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.NumberIsTooSmallException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is smaller than the minimum.\n     * @param min minimum.\n     * @param boundIsAllowed Whether {@code min} is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.NumberIsTooSmallException(org.apache.commons.math.util.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 59,
      "end_line": 71,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern .\n     * @param wrong Value that is smaller than the minimum.\n     * @param min minimum.\n     * @param boundIsAllowed Whether {@code min} is included in the allowed range.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 67,col 26)",
        "(line 69,col 9)-(line 69,col 23)",
        "(line 70,col 9)-(line 70,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.getBoundIsAllowed()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @return {@code true} if the minimum is included in the allowed range.\n     *",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooSmallException.getMin()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @return the minimum.\n     *",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)"
      ]
    }
  ]
}
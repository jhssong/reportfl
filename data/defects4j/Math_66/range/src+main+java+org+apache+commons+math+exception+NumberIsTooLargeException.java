{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/exception/NumberIsTooLargeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberIsTooLargeException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 83,
      "comment": "\n * Exception to be thrown when a number is too large.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "max"
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
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.NumberIsTooLargeException(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is larger than the maximum.\n     * @param max maximum.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.NumberIsTooLargeException(org.apache.commons.math.util.Localizable, java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 56,
      "end_line": 68,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern .\n     * @param wrong Value that is larger than the maximum.\n     * @param max maximum.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 64,col 26)",
        "(line 66,col 9)-(line 66,col 23)",
        "(line 67,col 9)-(line 67,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.getBoundIsAllowed()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * @return {@code true} if the maximum is included in the allowed range.\n     *",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.NumberIsTooLargeException.getMax()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * @return the maximum.\n     *",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 19)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NotStrictlyPositiveException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotStrictlyPositiveException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.NumberIsTooSmallException"
      ],
      "begin_line": 27,
      "end_line": 50,
      "comment": "\n * Exception to be thrown when the argument is negative.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NotStrictlyPositiveException.NotStrictlyPositiveException(java.lang.Number)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Construct the exception.\n     *\n     * @param value Argument.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NotStrictlyPositiveException.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.Localizable, java.lang.Number)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific context where the error occurred.\n     * @param value Argument.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 41)"
      ]
    }
  ]
}
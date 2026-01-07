{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NotPositiveException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotPositiveException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.NumberIsTooSmallException"
      ],
      "begin_line": 27,
      "end_line": 49,
      "comment": "\n * Exception to be thrown when the argument is negative.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NotPositiveException.NotPositiveException(java.lang.Number)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Construct the exception.\n     *\n     * @param value Argument.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NotPositiveException.NotPositiveException(org.apache.commons.math3.exception.util.Localizable, java.lang.Number)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific context where the error occurred.\n     * @param value Argument.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 40)"
      ]
    }
  ]
}
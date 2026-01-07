{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/exception/MathIllegalStateException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalStateException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 29,
      "end_line": 64,
      "comment": "\n * Base class for all exceptions that signal a mismatch between the\n * current state and the user\u0027s expectations.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Simple constructor.\n     *\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Simple constructor.\n     *\n     * @param cause Root cause.\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)",
        "(line 55,col 9)-(line 55,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 51)"
      ]
    }
  ]
}
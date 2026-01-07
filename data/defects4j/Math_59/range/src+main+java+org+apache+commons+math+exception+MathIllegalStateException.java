{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/exception/MathIllegalStateException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalStateException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 29,
      "end_line": 58,
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
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * @param specific Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Object...)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 25)"
      ]
    }
  ]
}
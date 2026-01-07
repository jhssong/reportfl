{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/exception/MathIllegalStateException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalStateException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 29,
      "end_line": 89,
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
      "begin_line": 40,
      "end_line": 44,
      "comment": "\n     * Simple constructor.\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "\n     * Simple constructor.\n     * @param cause root cause\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Simple constructor.\n     * @param specific Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Simple constructor.\n     * @param cause root cause\n     * @param specific Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Object...)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    }
  ]
}
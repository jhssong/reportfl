{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/exception/MathIllegalStateException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalStateException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalStateException",
        "org.apache.commons.math.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 31,
      "end_line": 91,
      "comment": "\n * Base class for all exceptions that signal a mismatch between the\n * current state and the user\u0027s expectations.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Context. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Simple constructor.\n     *\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "\n     * Simple constructor.\n     *\n     * @param cause Root cause.\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)",
        "(line 60,col 9)-(line 60,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getContext()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getException()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getMessage()",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getLocalizedMessage()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 45)"
      ]
    }
  ]
}
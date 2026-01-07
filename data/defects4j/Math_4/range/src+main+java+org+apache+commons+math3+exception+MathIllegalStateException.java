{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathIllegalStateException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalStateException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalStateException",
        "org.apache.commons.math3.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 31,
      "end_line": 88,
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
      "signature": "org.apache.commons.math3.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Simple constructor.\n     *\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 45)",
        "(line 47,col 9)-(line 47,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathIllegalStateException.MathIllegalStateException(java.lang.Throwable, org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * Simple constructor.\n     *\n     * @param cause Root cause.\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)",
        "(line 61,col 9)-(line 61,col 45)",
        "(line 62,col 9)-(line 62,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathIllegalStateException.MathIllegalStateException()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalStateException.getContext()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalStateException.getMessage()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalStateException.getLocalizedMessage()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    }
  ]
}
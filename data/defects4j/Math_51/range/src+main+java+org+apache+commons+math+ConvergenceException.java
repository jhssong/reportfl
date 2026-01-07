{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/ConvergenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 28,
      "end_line": 71,
      "comment": "\n * Error thrown when a numerical computation can not be performed because the\n * numerical result failed to converge to a finite value.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)"
      ]
    }
  ]
}
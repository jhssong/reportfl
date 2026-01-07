{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ConvergenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 25,
      "end_line": 68,
      "comment": "\n * Error thrown when a numerical computation can not be performed because the\n * numerical result failed to converge to a finite value.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String, java.lang.Object...)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 41)"
      ]
    }
  ]
}
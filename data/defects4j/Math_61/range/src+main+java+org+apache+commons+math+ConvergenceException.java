{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/ConvergenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 99,
      "comment": "\n * Error thrown when a numerical computation can not be performed because the\n * numerical result failed to converge to a finite value.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String, java.lang.Object...)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     * @deprecated as of 2.2 replaced by {@link #ConvergenceException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     * @deprecated as of 2.2 replaced by {@link #ConvergenceException(Throwable, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 41)"
      ]
    }
  ]
}
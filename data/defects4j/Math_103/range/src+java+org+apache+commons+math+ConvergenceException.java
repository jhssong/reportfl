{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ConvergenceException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 25,
      "end_line": 92,
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
        "(line 34,col 9)-(line 34,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String, java.lang.Object[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.Throwable)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String, java.lang.Throwable)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eConvergenceException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param msg  the error message.\n     * @param rootCause  the exception or error that caused this exception\n     * to be thrown.\n     * @deprecated as of 1.2, replaced by \n     * {@link #ConvergenceException(String, Object[], Throwable)}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergenceException.ConvergenceException(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Constructs a new \u003ccode\u003eConvergenceException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg  the error message.\n     * @deprecated as of 1.2, replaced by \n     * {@link #ConvergenceException(String, Object[])}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)"
      ]
    }
  ]
}
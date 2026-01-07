{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/FunctionEvaluationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionEvaluationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 153,
      "comment": "\n * Exception thrown when an error occurs evaluating a function.\n * \u003cp\u003e\n * Maintains an \u003ccode\u003eargument\u003c/code\u003e property holding the input value that\n * caused the function evaluation to fail.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Argument causing function evaluation failure "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     *\n     * @param argument  the failing function argument\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 64)",
        "(line 45,col 9)-(line 45,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[])",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     *\n     * @param argument  the failing function argument\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 85)",
        "(line 57,col 9)-(line 57,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Object...)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[], java.lang.String, java.lang.Object...)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 34)",
        "(line 85,col 9)-(line 85,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 21)",
        "(line 97,col 9)-(line 97,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[])",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double, java.lang.String, java.lang.Object...)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 41)",
        "(line 125,col 9)-(line 125,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[], java.lang.String, java.lang.Object...)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 41)",
        "(line 141,col 9)-(line 141,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FunctionEvaluationException.getArgument()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns the function argument that caused this exception.\n     *\n     * @return  argument that caused function evaluation to fail\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 32)"
      ]
    }
  ]
}
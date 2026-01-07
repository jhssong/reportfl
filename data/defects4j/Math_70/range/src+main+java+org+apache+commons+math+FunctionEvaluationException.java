{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/FunctionEvaluationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionEvaluationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 157,
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
        "FAILED_EVALUATION_MESSAGE"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": " Message for failed evaluation. "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Argument causing function evaluation failure "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     *\n     * @param argument  the failing function argument\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 51)",
        "(line 49,col 9)-(line 49,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[])",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     *\n     * @param argument  the failing function argument\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 72)",
        "(line 61,col 9)-(line 61,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Object...)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 34)",
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[], java.lang.String, java.lang.Object...)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 34)",
        "(line 89,col 9)-(line 89,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 101,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[])",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double, java.lang.String, java.lang.Object...)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[], java.lang.String, java.lang.Object...)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 41)",
        "(line 145,col 9)-(line 145,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FunctionEvaluationException.getArgument()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the function argument that caused this exception.\n     *\n     * @return  argument that caused function evaluation to fail\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 32)"
      ]
    }
  ]
}
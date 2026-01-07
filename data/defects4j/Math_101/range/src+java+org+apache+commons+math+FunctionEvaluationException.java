{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/FunctionEvaluationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionEvaluationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 27,
      "end_line": 125,
      "comment": "\n * Exception thrown when an error occurs evaluating a function.\n * \u003cp\u003e\n * Maintains an \u003ccode\u003eargument\u003c/code\u003e property holding the input value that\n * caused the function evaluation to fail.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Argument causing function evaluation failure "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     * \n     * @param argument  the failing function argument \n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 43,col 53)",
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Construct an exception using the given argument and message\n     * text.\n     * \n     * @param argument  the failing function argument \n     * @param message  the exception message text\n     * @deprecated as of 1.2, replaced by {@link #FunctionEvaluationException(double, String, Object[])}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 23)",
        "(line 57,col 9)-(line 57,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Object[])",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Throwable)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Construct an exception with the given argument, message and root cause.\n     * \n     * @param argument  the failing function argument \n     * @param message descriptive error message\n     * @param cause root cause.\n     * @deprecated as of 1.2, replaced by {@link #FunctionEvaluationException(double, String, Object[], Throwable)}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.Throwable)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param cause  the exception or error that caused this exception to be thrown\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 21)",
        "(line 97,col 9)-(line 97,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FunctionEvaluationException.getArgument()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns the function argument that caused this exception.\n     * \n     * @return  argument that caused function evaluation to fail\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    }
  ]
}
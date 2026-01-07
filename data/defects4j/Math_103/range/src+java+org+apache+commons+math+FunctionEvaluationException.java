{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/FunctionEvaluationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionEvaluationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 27,
      "end_line": 122,
      "comment": "\n * Exeption thrown when an error occurs evaluating a function.\n * \u003cp\u003e\n * Maintains an \u003ccode\u003eargument\u003c/code\u003e property holding the input value that\n * caused the function evaluation to fail.\n * \n * @version $Revision$ $Date$\n "
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
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Throwable)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n     * Construct an exception with the given argument, message and root cause.\n     * \n     * @param argument  the failing function argument \n     * @param message descriptive error message\n     * @param cause root cause.\n     * @deprecated as of 1.2, replaced by {@link #FunctionEvaluationException(double, String, Object[], Throwable)}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 84,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.Throwable)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 21)",
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument \n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FunctionEvaluationException.getArgument()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns the function argument that caused this exception.\n     * \n     * @return  argument that caused function evaluation to fail\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 29)"
      ]
    }
  ]
}
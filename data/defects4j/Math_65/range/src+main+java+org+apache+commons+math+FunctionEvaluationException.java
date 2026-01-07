{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/FunctionEvaluationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionEvaluationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 32,
      "end_line": 212,
      "comment": "\n * Exception thrown when an error occurs evaluating a function.\n * \u003cp\u003e\n * Maintains an \u003ccode\u003eargument\u003c/code\u003e property holding the input value that\n * caused the function evaluation to fail.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Argument causing function evaluation failure "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     *\n     * @param argument  the failing function argument\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 60)",
        "(line 48,col 9)-(line 48,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[])",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Construct an exception indicating the argument value\n     * that caused the function evaluation to fail.\n     *\n     * @param argument  the failing function argument\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 81)",
        "(line 60,col 9)-(line 60,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, java.lang.String, java.lang.Object...)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double, org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[], java.lang.String, java.lang.Object...)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(double[], org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 34)",
        "(line 114,col 9)-(line 114,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 21)",
        "(line 126,col 9)-(line 126,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[])",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Constructs an exception with specified root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 21)",
        "(line 138,col 9)-(line 138,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double, java.lang.String, java.lang.Object...)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double, org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 165,
      "end_line": 170,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 41)",
        "(line 169,col 9)-(line 169,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[], java.lang.String, java.lang.Object...)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.FunctionEvaluationException.FunctionEvaluationException(java.lang.Throwable, double[], org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param argument  the failing function argument\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 41)",
        "(line 200,col 9)-(line 200,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.FunctionEvaluationException.getArgument()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Returns the function argument that caused this exception.\n     *\n     * @return  argument that caused function evaluation to fail\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 32)"
      ]
    }
  ]
}
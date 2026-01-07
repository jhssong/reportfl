{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/exception/NestableError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableError",
      "is_interface": false,
      "parent_types": [
        "java.lang.Error",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 29,
      "end_line": 197,
      "comment": "\n * The base class of all errors which can contain other exceptions.\n *\n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @see org.apache.commons.lang.exception.NestableException\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The helper instance which contains much of the code which we\n     * delegate to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Holds the reference to the exception or error that caused\n     * this exception to be thrown.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e without specified\n     * detail message.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg The error message.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError(java.lang.Throwable)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param cause the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError(java.lang.String, java.lang.Throwable)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param msg    the error message\n     * @param cause  the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getCause()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getMessage()",
      "begin_line": 107,
      "end_line": 115,
      "comment": "\n     * Returns the detail message string of this throwable. If it was\n     * created with a null message, returns the following:\n     * (cause\u003d\u003dnull ? null : cause.toString()).\n     *\n     * @return String message string of the throwable\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getMessage(int)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getMessages()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getThrowable(int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getThrowableCount()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getThrowables()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.indexOfThrowable(java.lang.Class)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printStackTrace()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printStackTrace(java.io.PrintStream)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printStackTrace(java.io.PrintWriter)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 35)"
      ]
    }
  ]
}
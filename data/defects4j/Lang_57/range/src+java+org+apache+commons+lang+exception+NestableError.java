{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/exception/NestableError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableError",
      "is_interface": false,
      "parent_types": [
        "java.lang.Error",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 30,
      "end_line": 198,
      "comment": "\n * The base class of all errors which can contain other exceptions.\n *\n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @see org.apache.commons.lang.exception.NestableException\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The helper instance which contains much of the code which we\n     * delegate to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Holds the reference to the exception or error that caused\n     * this exception to be thrown.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e without specified\n     * detail message.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError(java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg The error message.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError(java.lang.Throwable)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param cause the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)",
        "(line 78,col 9)-(line 78,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableError.NestableError(java.lang.String, java.lang.Throwable)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableError\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param msg    the error message\n     * @param cause  the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)",
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getCause()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getMessage()",
      "begin_line": 108,
      "end_line": 116,
      "comment": "\n     * Returns the detail message string of this throwable. If it was\n     * created with a null message, returns the following:\n     * (cause\u003d\u003dnull ? null : cause.toString()).\n     *\n     * @return String message string of the throwable\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getMessage(int)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getMessages()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getThrowable(int)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getThrowableCount()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.getThrowables()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.indexOfThrowable(java.lang.Class)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printStackTrace()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printStackTrace(java.io.PrintStream)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printStackTrace(java.io.PrintWriter)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableError.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 35)"
      ]
    }
  ]
}
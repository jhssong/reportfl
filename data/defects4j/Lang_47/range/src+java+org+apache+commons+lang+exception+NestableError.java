{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/exception/NestableError.java",
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
      "end_line": 197,
      "comment": "\n * The base class of all errors which can contain other exceptions.\n *\n * @author Daniel L. Rall\n * @see org.apache.commons.lang.exception.NestableException\n * @since 1.0\n * @version $Id$\n "
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
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 42)"
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
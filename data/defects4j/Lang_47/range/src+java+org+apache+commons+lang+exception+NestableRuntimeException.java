{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/exception/NestableRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 34,
      "end_line": 202,
      "comment": "\n * The base class of all runtime exceptions which can contain other\n * exceptions.\n *\n * @see org.apache.commons.lang.exception.NestableException\n * @author \u003ca href\u003d\"mailto:Rafal.Krzewski@e-point.pl\"\u003eRafal Krzewski\u003c/a\u003e\n * @author Daniel L. Rall\n * @author \u003ca href\u003d\"mailto:knielsen@apache.org\"\u003eKasper Nielsen\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The helper instance which contains much of the code which we\n     * delegate to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Holds the reference to the exception or error that caused\n     * this exception to be thrown.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.NestableRuntimeException()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableRuntimeException\u003c/code\u003e without specified\n     * detail message.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.NestableRuntimeException(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableRuntimeException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg the error message\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.NestableRuntimeException(java.lang.Throwable)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableRuntimeException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param cause the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 16)",
        "(line 82,col 9)-(line 82,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.NestableRuntimeException(java.lang.String, java.lang.Throwable)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableRuntimeException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param msg    the error message\n     * @param cause  the exception or error that caused this exception to be\n     * thrown\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)",
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getCause()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getMessage()",
      "begin_line": 112,
      "end_line": 120,
      "comment": "\n     * Returns the detail message string of this throwable. If it was\n     * created with a null message, returns the following:\n     * (cause\u003d\u003dnull ? null : cause.toString()).\n     *\n     * @return String message string of the throwable\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getMessage(int)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getMessages()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getThrowable(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getThrowableCount()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.getThrowables()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.indexOfThrowable(java.lang.Class)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.printStackTrace()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.printStackTrace(java.io.PrintStream)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableRuntimeException.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 35)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 31,
      "end_line": 147,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.  \n* \u003cp\u003e\n* Adapted from {@link org.apache.commons.collections.FunctorException}.\n* \n* @version $Revision$ $Date$\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "JDK_SUPPORTS_NESTED"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Does JDK support nested exceptions?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rootCause"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Root cause of the exception\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg  the error message.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)",
        "(line 74,col 9)-(line 74,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 67)",
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Throwable)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param msg  the error message.\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 19)",
        "(line 99,col 9)-(line 99,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getCause()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Gets the cause of this throwable.\n     * \n     * @return  the cause of this throwable, or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 137,
      "end_line": 145,
      "comment": "\n     * Prints the stack trace of this exception to the specified writer.\n     *\n     * @param out  the \u003ccode\u003ePrintWriter\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 144,col 9)"
      ]
    }
  ]
}
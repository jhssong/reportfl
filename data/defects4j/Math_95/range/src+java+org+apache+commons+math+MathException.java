{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 36,
      "end_line": 249,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.\u003c/p\u003e\n* \u003cp\u003e\n* Adapted from {@link org.apache.commons.collections.FunctorException}.\u003c/p\u003e\n* \n* @version $Revision$ $Date$\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "JDK_SUPPORTS_NESTED"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Does JDK support nested exceptions?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cachedResources"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cache for resources bundle. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rootCause"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Root cause of the exception\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.translate(java.lang.String, java.util.Locale)",
      "begin_line": 82,
      "end_line": 103,
      "comment": "\n     * Translate a string to a given locale.\n     * @param s string to translate\n     * @param locale locale into which to translate the string\n     * @return translated string or original string\n     * for unsupported locales or unknown strings\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 97,col 9)",
        "(line 101,col 9)-(line 101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.buildMessage(java.lang.String, java.lang.Object[], java.util.Locale)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param locale Locale in which the message should be translated\n     * @return a message string\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 73)",
        "(line 115,col 9)-(line 115,col 29)",
        "(line 116,col 9)-(line 116,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 16)",
        "(line 125,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object[])",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 57)",
        "(line 139,col 7)-(line 139,col 31)",
        "(line 140,col 7)-(line 140,col 52)",
        "(line 141,col 7)-(line 141,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 67)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 154,col 9)-(line 154,col 39)",
        "(line 155,col 9)-(line 155,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 57)",
        "(line 170,col 7)-(line 170,col 31)",
        "(line 171,col 7)-(line 171,col 52)",
        "(line 172,col 7)-(line 172,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getPattern()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getArguments()",
      "begin_line": 189,
      "end_line": 191,
      "comment": " Gets the arguments used to build the message of this throwable.\n     *\n     * @return the arguments used to build the message of this throwable\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 200,
      "end_line": 202,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     * \n     * @return localized message\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getCause()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Gets the cause of this throwable.\n     * \n     * @return  the cause of this throwable, or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 225,
      "end_line": 232,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 239,
      "end_line": 247,
      "comment": "\n     * Prints the stack trace of this exception to the specified writer.\n     *\n     * @param out  the \u003ccode\u003ePrintWriter\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 246,col 9)"
      ]
    }
  ]
}
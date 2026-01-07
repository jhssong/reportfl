{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 36,
      "end_line": 274,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.  \n* \u003cp\u003e\n* Adapted from {@link org.apache.commons.collections.FunctorException}.\n* \n* @version $Revision$ $Date$\n"
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
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rootCause"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Root cause of the exception\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.translate(java.lang.String, java.util.Locale)",
      "begin_line": 81,
      "end_line": 102,
      "comment": "\n     * Translate a string to a given locale.\n     * @param s string to translate\n     * @param locale locale into which to translate the string\n     * @return translated string or original string\n     * for unsupported locales or unknown strings\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 96,col 9)",
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.buildMessage(java.lang.String, java.lang.Object[], java.util.Locale)",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param locale Locale in which the message should be translated\n     * @return a message string\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 73)",
        "(line 114,col 9)-(line 114,col 29)",
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 16)",
        "(line 124,col 9)-(line 124,col 30)",
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg  the error message.\n     * @deprecated as of 1.2, replaced by {@link #MathException(String, Object[])}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 19)",
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 140,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object[])",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 57)",
        "(line 152,col 7)-(line 152,col 31)",
        "(line 153,col 7)-(line 153,col 33)",
        "(line 154,col 7)-(line 154,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 67)",
        "(line 166,col 9)-(line 166,col 38)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 168,col 9)-(line 168,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Throwable)",
      "begin_line": 180,
      "end_line": 185,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param msg  the error message.\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     * @deprecated as of 1.2, replaced by {@link #MathException(String, Object[], Throwable)}\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 19)",
        "(line 182,col 9)-(line 182,col 29)",
        "(line 183,col 9)-(line 183,col 39)",
        "(line 184,col 9)-(line 184,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 57)",
        "(line 198,col 7)-(line 198,col 31)",
        "(line 199,col 7)-(line 199,col 33)",
        "(line 200,col 7)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getPattern()",
      "begin_line": 207,
      "end_line": 209,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getArguments()",
      "begin_line": 215,
      "end_line": 217,
      "comment": " Gets the arguments used to build the message of this throwable.\n     *\n     * @return the arguments used to build the message of this throwable\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 225,
      "end_line": 227,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     * \n     * @return localized message\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getCause()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Gets the cause of this throwable.\n     * \n     * @return  the cause of this throwable, or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\n     * Prints the stack trace of this exception to the specified writer.\n     *\n     * @param out  the \u003ccode\u003ePrintWriter\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 271,col 9)"
      ]
    }
  ]
}
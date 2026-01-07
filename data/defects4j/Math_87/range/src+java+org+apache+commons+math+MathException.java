{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 36,
      "end_line": 198,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.\u003c/p\u003e\n* \u003cp\u003e\n* Adapted from \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/FunctorException.html\"/\u003e.\u003c/p\u003e\n* \n* @version $Revision$ $Date$\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.translate(java.lang.String, java.util.Locale)",
      "begin_line": 58,
      "end_line": 75,
      "comment": "\n     * Translate a string to a given locale.\n     * @param s string to translate\n     * @param locale locale into which to translate the string\n     * @return translated string or original string\n     * for unsupported locales or unknown strings\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 69,col 9)",
        "(line 73,col 9)-(line 73,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.buildMessage(java.util.Locale, java.lang.String, java.lang.Object...)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param locale Locale in which the message should be translated\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return a message string\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 112)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 94,col 30)",
        "(line 95,col 9)-(line 95,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object...)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 57)",
        "(line 107,col 7)-(line 107,col 31)",
        "(line 108,col 7)-(line 108,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 25)",
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 68)",
        "(line 136,col 7)-(line 136,col 31)",
        "(line 137,col 7)-(line 137,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getPattern()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getArguments()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " Gets the arguments used to build the message of this throwable.\n     *\n     * @return the arguments used to build the message of this throwable\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 165,
      "end_line": 167,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     * \n     * @return localized message\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getLocalizedMessage()",
      "begin_line": 170,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 188,
      "end_line": 196,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 195,col 9)"
      ]
    }
  ]
}
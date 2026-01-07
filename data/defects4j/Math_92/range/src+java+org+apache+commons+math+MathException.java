{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 36,
      "end_line": 202,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.\u003c/p\u003e\n* \u003cp\u003e\n* Adapted from {@link org.apache.commons.collections.FunctorException}.\u003c/p\u003e\n* \n* @version $Revision$ $Date$\n"
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
        "cachedResources"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Cache for resources bundle. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.translate(java.lang.String, java.util.Locale)",
      "begin_line": 61,
      "end_line": 82,
      "comment": "\n     * Translate a string to a given locale.\n     * @param s string to translate\n     * @param locale locale into which to translate the string\n     * @return translated string or original string\n     * for unsupported locales or unknown strings\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 76,col 9)",
        "(line 80,col 9)-(line 80,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.buildMessage(java.lang.String, java.lang.Object[], java.util.Locale)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param locale Locale in which the message should be translated\n     * @return a message string\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 112)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 101,col 30)",
        "(line 102,col 9)-(line 102,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object[])",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 57)",
        "(line 114,col 7)-(line 114,col 31)",
        "(line 115,col 7)-(line 115,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 25)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 142,col 7)-(line 142,col 68)",
        "(line 143,col 7)-(line 143,col 31)",
        "(line 144,col 7)-(line 144,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getPattern()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getArguments()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " Gets the arguments used to build the message of this throwable.\n     *\n     * @return the arguments used to build the message of this throwable\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 172,
      "end_line": 174,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     * \n     * @return localized message\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getLocalizedMessage()",
      "begin_line": 177,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 193,
      "end_line": 200,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 199,col 9)"
      ]
    }
  ]
}
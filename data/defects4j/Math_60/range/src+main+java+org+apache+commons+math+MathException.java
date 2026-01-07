{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 39,
      "end_line": 209,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.\u003c/p\u003e\n* \u003cp\u003e\n* Adapted from \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/FunctorException.html\"/\u003e.\u003c/p\u003e\n*\n* @version $Revision$ $Date$\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object...)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MathException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 73,col 7)-(line 73,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 31)",
        "(line 86,col 7)-(line 86,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 25)",
        "(line 98,col 9)-(line 98,col 57)",
        "(line 99,col 9)-(line 99,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     * @deprecated as of 2.2 replaced by {@link #MathException(Throwable, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 129,col 7)-(line 129,col 23)",
        "(line 130,col 7)-(line 130,col 31)",
        "(line 131,col 7)-(line 131,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getPattern()",
      "begin_line": 140,
      "end_line": 143,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     * @since 1.2\n     * @deprecated as of 2.2 replaced by {@link #getSpecificPattern()} and {@link #getGeneralPattern()}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getSpecificPattern()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getGeneralPattern()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getArguments()",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 167,
      "end_line": 172,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage()",
      "begin_line": 175,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getLocalizedMessage()",
      "begin_line": 181,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 199,
      "end_line": 207,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 206,col 9)"
      ]
    }
  ]
}
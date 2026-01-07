{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 40,
      "end_line": 221,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.\u003c/p\u003e\n* \u003cp\u003e\n* Adapted from \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/FunctorException.html\"/\u003e.\u003c/p\u003e\n*\n* @version $Revision$ $Date$\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 57)",
        "(line 61,col 9)-(line 61,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.String, java.lang.Object...)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MathException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 74,col 7)-(line 74,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 86,col 7)-(line 86,col 31)",
        "(line 87,col 7)-(line 87,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 25)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 100,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     * @deprecated as of 2.2 replaced by {@link #MathException(Throwable, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 23)",
        "(line 131,col 7)-(line 131,col 31)",
        "(line 132,col 7)-(line 132,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.addMessage(org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 141,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getContext(java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getContextKeys()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getPattern()",
      "begin_line": 167,
      "end_line": 170,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     * @since 1.2\n     * @deprecated as of 2.2.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 179,
      "end_line": 184,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage()",
      "begin_line": 187,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getLocalizedMessage()",
      "begin_line": 193,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.printStackTrace(java.io.PrintStream)",
      "begin_line": 211,
      "end_line": 219,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 218,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/MathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 39,
      "end_line": 209,
      "comment": "\n* Base class for commons-math checked exceptions.\n* \u003cp\u003e\n* Supports nesting, emulating JDK 1.4 behavior if necessary.\u003c/p\u003e\n* \u003cp\u003e\n* Adapted from \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/FunctorException.html\"/\u003e.\u003c/p\u003e\n*\n* @version $Id$\n* @deprecated To be removed before 3.0.  Please do not use in any new code.\n"
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
        "DEPRECATION_MESSAGE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Deprecation message. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with no\n     * detail message.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 57)",
        "(line 64,col 9)-(line 64,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 76,col 7)-(line 76,col 31)",
        "(line 77,col 7)-(line 77,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)",
        "(line 89,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 90,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathException.MathException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 23)",
        "(line 105,col 7)-(line 105,col 31)",
        "(line 106,col 7)-(line 106,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Sets a message.\n     *\n     * @param pat Message pattern.\n     * @param args Values for replacing the placeholders in the message\n     * pattern.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Sets the context (key, value) pair.\n     * Keys are assumed to be unique within an instance. If the same key is\n     * assigned a new value, the previous one will be lost.\n     *\n     * @param key Context key (not null).\n     * @param value Context value.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getContext(java.lang.String)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Gets the value associated to the given context key.\n     *\n     * @param key Context key.\n     * @return the context value or {@code null} if the key does not exist.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getContextKeys()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Gets all the keys stored in the exception\n     *\n     * @return the set of keys.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage(java.util.Locale)",
      "begin_line": 159,
      "end_line": 164,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getMessage()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Gets the message in a conventional US locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathException.getLocalizedMessage()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Gets the message in the system default locale.\n     *\n     * @return localized message\n     ",
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
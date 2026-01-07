{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 40,
      "end_line": 485,
      "comment": "\n* Base class for commons-math unchecked exceptions.\n*\n* @version $Id$\n* @since 2.0\n"
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
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 68,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 57)",
        "(line 81,col 9)-(line 81,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 25)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 102,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 108,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getContext(java.lang.String)",
      "begin_line": 113,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getContextKeys()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param locale Locale in which the message should be translated\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return a message string\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 141,
      "end_line": 146,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage()",
      "begin_line": 149,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 155,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace(java.io.PrintStream)",
      "begin_line": 173,
      "end_line": 181,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 191,
      "end_line": 211,
      "comment": "\n     * Constructs a new \u003ccode\u003eArithmeticException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 210,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a91d1ed9-a617-4cda-b325-919676186f93.getMessage()",
      "begin_line": 199,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 17)-(line 201,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a3392f85-35ce-4bb3-bd08-c874ab920059.getLocalizedMessage()",
      "begin_line": 205,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 17)-(line 207,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 221,
      "end_line": 241,
      "comment": "\n     * Constructs a new \u003ccode\u003eArrayIndexOutOfBoundsException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 240,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-e494294a-b029-4e5c-af56-ea8884a492f5.getMessage()",
      "begin_line": 229,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-e89ef9c7-0e55-4b4f-9472-1aaa10fbecf5.getLocalizedMessage()",
      "begin_line": 235,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 17)-(line 237,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 251,
      "end_line": 271,
      "comment": "\n     * Constructs a new \u003ccode\u003eEOFException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 270,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-beb591f9-699b-4045-acad-054c59553770.getMessage()",
      "begin_line": 259,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 17)-(line 261,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-16f3ac69-b6f7-4f58-844c-53bd401d24df.getLocalizedMessage()",
      "begin_line": 265,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 17)-(line 267,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIOException(java.lang.Throwable)",
      "begin_line": 284,
      "end_line": 288,
      "comment": "\n     * Constructs a new \u003ccode\u003eIOException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * \u003cp\u003eThis factory method allows chaining of other exceptions within an\n     * \u003ccode\u003eIOException\u003c/code\u003e even for Java 5. The constructor for\n     * \u003ccode\u003eIOException\u003c/code\u003e with a cause parameter was introduced only\n     * with Java 6.\u003c/p\u003e\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 75)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 298,
      "end_line": 318,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 317,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-48c68d0f-bc47-4836-9362-996ebed206c8.getMessage()",
      "begin_line": 306,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 17)-(line 308,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-de40832f-b51d-4357-aeed-dd3e9e52e6e6.getLocalizedMessage()",
      "begin_line": 312,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 17)-(line 314,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.Throwable)",
      "begin_line": 327,
      "end_line": 331,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 101)",
        "(line 329,col 9)-(line 329,col 33)",
        "(line 330,col 9)-(line 330,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 341,
      "end_line": 361,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalStateException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 360,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-bb9a5a01-b847-4b0a-a582-dcdc57040fee.getMessage()",
      "begin_line": 349,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 17)-(line 351,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-ee37db68-abb4-4558-b1b2-f33a6b475cf0.getLocalizedMessage()",
      "begin_line": 355,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 17)-(line 357,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 371,
      "end_line": 391,
      "comment": "\n     * Constructs a new \u003ccode\u003eConcurrentModificationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 390,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-43a29377-ca9e-4c19-9eac-94ef2561951c.getMessage()",
      "begin_line": 379,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 17)-(line 381,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-9fb459e6-dbc7-4386-8297-5319d62b4a0e.getLocalizedMessage()",
      "begin_line": 385,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 17)-(line 387,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 401,
      "end_line": 421,
      "comment": "\n     * Constructs a new \u003ccode\u003eNoSuchElementException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 420,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-8c747c15-6647-4b7a-9656-d60f178ac3ea.getMessage()",
      "begin_line": 409,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 17)-(line 411,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-cda745f7-6f26-48f3-9351-674038bcae26.getLocalizedMessage()",
      "begin_line": 415,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 17)-(line 417,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 433,
      "end_line": 454,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 453,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 439,
      "end_line": 439,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-8505e0e1-e82f-4084-875a-2ca700310fd8.getMessage()",
      "begin_line": 442,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 444,col 17)-(line 444,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-bb25d551-2230-4835-bce3-eb41ee9096a8.getLocalizedMessage()",
      "begin_line": 448,
      "end_line": 451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 17)-(line 450,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createInternalError(java.lang.Throwable)",
      "begin_line": 460,
      "end_line": 483,
      "comment": " Create an {@link java.lang.RuntimeException} for an internal error.\n     * @param cause underlying cause\n     * @return an {@link java.lang.RuntimeException} for an internal error\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 77)",
        "(line 464,col 9)-(line 481,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-96c197a1-f6c9-444a-8b56-4abd04aa3795.getMessage()",
      "begin_line": 470,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 17)-(line 472,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-82c2661b-fe20-416d-9cae-8036d64543a5.getLocalizedMessage()",
      "begin_line": 476,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 17)-(line 478,col 100)"
      ]
    }
  ]
}
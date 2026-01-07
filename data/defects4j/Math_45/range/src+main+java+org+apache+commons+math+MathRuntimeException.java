{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 40,
      "end_line": 515,
      "comment": "\n* Base class for commons-math unchecked exceptions.\n*\n* @version $Id$\n* @since 2.0\n* @deprecated To be removed before 3.0.  Please do not use in any new code.\n"
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
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Sets a message.\n     *\n     * @param pat Message pattern.\n     * @param args Values for replacing the placeholders in the message\n     * pattern.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Sets the context (key, value) pair.\n     * Keys are assumed to be unique within an instance. If the same key is\n     * assigned a new value, the previous one will be lost.\n     *\n     * @param key Context key (not null).\n     * @param value Context value.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getContext(java.lang.String)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Gets the value associated to the given context key.\n     *\n     * @param key Context key.\n     * @return the context value or {@code null} if the key does not exist.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getContextKeys()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Gets all the keys stored in the exception\n     *\n     * @return the set of keys.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param locale Locale in which the message should be translated\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return a message string\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 163,
      "end_line": 168,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Gets the message in a conventional US locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Gets the message in the system default locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace(java.io.PrintStream)",
      "begin_line": 203,
      "end_line": 211,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 221,
      "end_line": 241,
      "comment": "\n     * Constructs a new \u003ccode\u003eArithmeticException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-b8d84539-7733-4880-9eb2-228366c7d119.getMessage()",
      "begin_line": 229,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-aaf47b4d-7e14-4db5-99a3-cca4ede33bc4.getLocalizedMessage()",
      "begin_line": 235,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 17)-(line 237,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 251,
      "end_line": 271,
      "comment": "\n     * Constructs a new \u003ccode\u003eArrayIndexOutOfBoundsException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-93513f92-5579-4c62-84b6-c99c3595a2e5.getMessage()",
      "begin_line": 259,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 17)-(line 261,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-19d01784-dd94-440a-aef7-b21266bf0bcb.getLocalizedMessage()",
      "begin_line": 265,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 17)-(line 267,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 281,
      "end_line": 301,
      "comment": "\n     * Constructs a new \u003ccode\u003eEOFException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 300,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-b2347399-d52f-44e2-a928-b972becb0082.getMessage()",
      "begin_line": 289,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 17)-(line 291,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-5d73b470-0988-40f1-9a0a-9f195ae277cf.getLocalizedMessage()",
      "begin_line": 295,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 17)-(line 297,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIOException(java.lang.Throwable)",
      "begin_line": 314,
      "end_line": 318,
      "comment": "\n     * Constructs a new \u003ccode\u003eIOException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * \u003cp\u003eThis factory method allows chaining of other exceptions within an\n     * \u003ccode\u003eIOException\u003c/code\u003e even for Java 5. The constructor for\n     * \u003ccode\u003eIOException\u003c/code\u003e with a cause parameter was introduced only\n     * with Java 6.\u003c/p\u003e\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 75)",
        "(line 316,col 9)-(line 316,col 33)",
        "(line 317,col 9)-(line 317,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 328,
      "end_line": 348,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 347,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-c1f16a0a-1871-4b33-b20e-16e0f75ab22f.getMessage()",
      "begin_line": 336,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 17)-(line 338,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-71edf76c-1ef8-4bfb-88d5-806d54f03506.getLocalizedMessage()",
      "begin_line": 342,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 17)-(line 344,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.Throwable)",
      "begin_line": 357,
      "end_line": 361,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 101)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 371,
      "end_line": 391,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalStateException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a0ea2557-2529-4293-8798-77dc2e036f16.getMessage()",
      "begin_line": 379,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 17)-(line 381,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a7ffbd52-f46f-4646-ae98-69051b520e18.getLocalizedMessage()",
      "begin_line": 385,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 17)-(line 387,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 401,
      "end_line": 421,
      "comment": "\n     * Constructs a new \u003ccode\u003eConcurrentModificationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-279c1bc8-4bad-4c4c-bd4b-13ed665c4a34.getMessage()",
      "begin_line": 409,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 17)-(line 411,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-be9e66c2-022b-4c06-b7a1-c5c135ed7739.getLocalizedMessage()",
      "begin_line": 415,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 17)-(line 417,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 431,
      "end_line": 451,
      "comment": "\n     * Constructs a new \u003ccode\u003eNoSuchElementException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 450,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 436,
      "end_line": 436,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-d0bfe07d-91a7-4f1e-8ae2-2b7450ba3586.getMessage()",
      "begin_line": 439,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 17)-(line 441,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-cfedb532-aede-456b-841f-da7733b9f981.getLocalizedMessage()",
      "begin_line": 445,
      "end_line": 448,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 17)-(line 447,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 463,
      "end_line": 484,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 483,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-3196cd29-e12d-4301-b5b1-b30f5e0b6769.getMessage()",
      "begin_line": 472,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 17)-(line 474,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-732dfb2f-624d-4d94-b0f9-6afc91d96dd3.getLocalizedMessage()",
      "begin_line": 478,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 17)-(line 480,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createInternalError(java.lang.Throwable)",
      "begin_line": 490,
      "end_line": 513,
      "comment": " Create an {@link java.lang.RuntimeException} for an internal error.\n     * @param cause underlying cause\n     * @return an {@link java.lang.RuntimeException} for an internal error\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 77)",
        "(line 494,col 9)-(line 511,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-9d93df58-2167-429b-90b4-46388ec08e9a.getMessage()",
      "begin_line": 500,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 17)-(line 502,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-12403d9f-5ef1-4229-8b26-a67820df1c4d.getLocalizedMessage()",
      "begin_line": 506,
      "end_line": 509,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 17)-(line 508,col 100)"
      ]
    }
  ]
}
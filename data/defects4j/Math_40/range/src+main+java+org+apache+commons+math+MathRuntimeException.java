{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 40,
      "end_line": 516,
      "comment": "\n* Base class for commons-math unchecked exceptions.\n*\n* @version $Id$\n* @since 2.0\n* @deprecated To be removed before 3.0.  Please do not use in any new code.\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATION_MESSAGE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Deprecation message. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 25)",
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 82,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 25)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 99,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Sets a message.\n     *\n     * @param pat Message pattern.\n     * @param args Values for replacing the placeholders in the message\n     * pattern.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Sets the context (key, value) pair.\n     * Keys are assumed to be unique within an instance. If the same key is\n     * assigned a new value, the previous one will be lost.\n     *\n     * @param key Context key (not null).\n     * @param value Context value.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getContext(java.lang.String)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Gets the value associated to the given context key.\n     *\n     * @param key Context key.\n     * @return the context value or {@code null} if the key does not exist.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getContextKeys()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Gets all the keys stored in the exception\n     *\n     * @return the set of keys.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param locale Locale in which the message should be translated\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return a message string\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 164,
      "end_line": 169,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Gets the message in a conventional US locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Gets the message in the system default locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace(java.io.PrintStream)",
      "begin_line": 204,
      "end_line": 212,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 222,
      "end_line": 242,
      "comment": "\n     * Constructs a new \u003ccode\u003eArithmeticException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 241,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-4007d81f-c255-4011-8d73-6e8295d7338d.getMessage()",
      "begin_line": 230,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 17)-(line 232,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-44c347de-baff-47b6-83c7-87ccc44f1d7f.getLocalizedMessage()",
      "begin_line": 236,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 17)-(line 238,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 252,
      "end_line": 272,
      "comment": "\n     * Constructs a new \u003ccode\u003eArrayIndexOutOfBoundsException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 271,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-05939ebf-b3b1-4fb4-96e6-2bfeb6bbeb6b.getMessage()",
      "begin_line": 260,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-14b1434e-707a-47b0-883c-94f784e4cd1c.getLocalizedMessage()",
      "begin_line": 266,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 17)-(line 268,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 282,
      "end_line": 302,
      "comment": "\n     * Constructs a new \u003ccode\u003eEOFException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 301,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-71e5e28d-8ef6-41fe-8e92-9c7c8ce40426.getMessage()",
      "begin_line": 290,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 292,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-011b65d9-8f72-4bf3-99c8-31d8f158d081.getLocalizedMessage()",
      "begin_line": 296,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 17)-(line 298,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIOException(java.lang.Throwable)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Constructs a new \u003ccode\u003eIOException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * \u003cp\u003eThis factory method allows chaining of other exceptions within an\n     * \u003ccode\u003eIOException\u003c/code\u003e even for Java 5. The constructor for\n     * \u003ccode\u003eIOException\u003c/code\u003e with a cause parameter was introduced only\n     * with Java 6.\u003c/p\u003e\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 75)",
        "(line 317,col 9)-(line 317,col 33)",
        "(line 318,col 9)-(line 318,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 329,
      "end_line": 349,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 348,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-1f0e77f0-9b76-4e26-977e-66f8043e1326.getMessage()",
      "begin_line": 337,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 17)-(line 339,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a8cf805d-1419-4143-956d-4c6255eb3ab5.getLocalizedMessage()",
      "begin_line": 343,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 17)-(line 345,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.Throwable)",
      "begin_line": 358,
      "end_line": 362,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 101)",
        "(line 360,col 9)-(line 360,col 33)",
        "(line 361,col 9)-(line 361,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 372,
      "end_line": 392,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalStateException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 391,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-0b0ef8fa-8a1b-4ad8-9b0c-dcfa24e5cdcf.getMessage()",
      "begin_line": 380,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 17)-(line 382,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-8272f458-4ad3-4b19-ae94-9b758f205115.getLocalizedMessage()",
      "begin_line": 386,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 17)-(line 388,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 402,
      "end_line": 422,
      "comment": "\n     * Constructs a new \u003ccode\u003eConcurrentModificationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 421,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-18125e3b-9a9b-4ca1-a3b4-7da05bf7c544.getMessage()",
      "begin_line": 410,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 17)-(line 412,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-ddd2bba1-b27b-421e-93af-ac3205d0ee50.getLocalizedMessage()",
      "begin_line": 416,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 17)-(line 418,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 432,
      "end_line": 452,
      "comment": "\n     * Constructs a new \u003ccode\u003eNoSuchElementException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 451,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-76a74c75-0627-40ac-8d63-90ab77c85531.getMessage()",
      "begin_line": 440,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 17)-(line 442,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-eecff569-da03-4f5b-845a-263b813eda14.getLocalizedMessage()",
      "begin_line": 446,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 17)-(line 448,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 464,
      "end_line": 485,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 484,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-e3f067a8-7458-49f0-80bf-6144423cd33a.getMessage()",
      "begin_line": 473,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 17)-(line 475,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-eb5f60fd-2ddf-4c42-9e64-866caa8d7336.getLocalizedMessage()",
      "begin_line": 479,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 481,col 17)-(line 481,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createInternalError(java.lang.Throwable)",
      "begin_line": 491,
      "end_line": 514,
      "comment": " Create an {@link java.lang.RuntimeException} for an internal error.\n     * @param cause underlying cause\n     * @return an {@link java.lang.RuntimeException} for an internal error\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 77)",
        "(line 495,col 9)-(line 512,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a6a6bdca-7c27-42d0-b0d4-03c4d758aea1.getMessage()",
      "begin_line": 501,
      "end_line": 504,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 17)-(line 503,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-299ce5b9-afc7-4582-a46e-794517283253.getLocalizedMessage()",
      "begin_line": 507,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 17)-(line 509,col 100)"
      ]
    }
  ]
}
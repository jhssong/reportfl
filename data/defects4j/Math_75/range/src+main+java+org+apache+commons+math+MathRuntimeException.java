{
  "filepath": "/tmp/Math-75b/src/main/java/org/apache/commons/math/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 37,
      "end_line": 516,
      "comment": "\n* Base class for commons-math unchecked exceptions.\n*\n* @version $Revision$ $Date$\n* @since 2.0\n"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Pattern used to build the message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.String, java.lang.Object...)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 33)",
        "(line 61,col 9)-(line 61,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)",
        "(line 89,col 9)-(line 89,col 33)",
        "(line 90,col 9)-(line 90,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.translate(java.lang.String, java.util.Locale)",
      "begin_line": 100,
      "end_line": 117,
      "comment": "\n     * Translate a string to a given locale.\n     * @param s string to translate\n     * @param locale locale into which to translate the string\n     * @return translated string or original string\n     * for unsupported locales or unknown strings\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 111,col 9)",
        "(line 115,col 9)-(line 115,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale, java.lang.String, java.lang.Object...)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param locale Locale in which the message should be translated\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return a message string\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getPattern()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " Gets the pattern used to build the message of this throwable.\n     *\n     * @return the pattern used to build the message of this throwable\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getArguments()",
      "begin_line": 143,
      "end_line": 145,
      "comment": " Gets the arguments used to build the message of this throwable.\n     *\n     * @return the arguments used to build the message of this throwable\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 153,
      "end_line": 155,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage()",
      "begin_line": 158,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 164,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Prints the stack trace of this exception to the standard error stream.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.printStackTrace(java.io.PrintStream)",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     *\n     * @param out  the \u003ccode\u003ePrintStream\u003c/code\u003e to use for output\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(java.lang.String, java.lang.Object...)",
      "begin_line": 199,
      "end_line": 219,
      "comment": "\n     * Constructs a new \u003ccode\u003eArithmeticException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 218,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-d4d964c1-81d4-43bc-921b-74e93db147e7.getMessage()",
      "begin_line": 207,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 17)-(line 209,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-691ee6cc-606e-4fa0-9485-2a4ce1cf2c87.getLocalizedMessage()",
      "begin_line": 213,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 17)-(line 215,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(java.lang.String, java.lang.Object...)",
      "begin_line": 228,
      "end_line": 248,
      "comment": "\n     * Constructs a new \u003ccode\u003eArrayIndexOutOfBoundsException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 247,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-41451556-2e87-4456-b0eb-5b56f6c539e0.getMessage()",
      "begin_line": 236,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 17)-(line 238,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-cbc6bf8e-fecb-4e6d-beca-34faa35552eb.getLocalizedMessage()",
      "begin_line": 242,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 17)-(line 244,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(java.lang.String, java.lang.Object...)",
      "begin_line": 257,
      "end_line": 277,
      "comment": "\n     * Constructs a new \u003ccode\u003eEOFException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 276,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-531db5d5-e262-41a0-9f24-6c77ad8f6bfe.getMessage()",
      "begin_line": 265,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 17)-(line 267,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-928dec87-5121-4539-8469-f79205d5db00.getLocalizedMessage()",
      "begin_line": 271,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 17)-(line 273,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIOException(java.lang.Throwable)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\n     * Constructs a new \u003ccode\u003eIOException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * \u003cp\u003eThis factory method allows chaining of other exceptions within an\n     * \u003ccode\u003eIOException\u003c/code\u003e even for Java 5. The constructor for\n     * \u003ccode\u003eIOException\u003c/code\u003e with a cause parameter was introduced only\n     * with Java 6.\u003c/p\u003e\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 75)",
        "(line 292,col 9)-(line 292,col 33)",
        "(line 293,col 9)-(line 293,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.String, java.lang.Object...)",
      "begin_line": 303,
      "end_line": 323,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 322,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-927e17a7-247b-4ed8-b3c8-cbc080388c90.getMessage()",
      "begin_line": 311,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 17)-(line 313,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-c3e9d1a1-59eb-48b0-931f-ef51921070a6.getLocalizedMessage()",
      "begin_line": 317,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 17)-(line 319,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.Throwable)",
      "begin_line": 332,
      "end_line": 336,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 101)",
        "(line 334,col 9)-(line 334,col 33)",
        "(line 335,col 9)-(line 335,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(java.lang.String, java.lang.Object...)",
      "begin_line": 345,
      "end_line": 365,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalStateException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 364,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a80931ed-8ebf-48f2-8cd5-df403cef7367.getMessage()",
      "begin_line": 353,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 17)-(line 355,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-26beb71e-932d-4580-b2e0-7fa461e0b204.getLocalizedMessage()",
      "begin_line": 359,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 17)-(line 361,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(java.lang.String, java.lang.Object...)",
      "begin_line": 374,
      "end_line": 394,
      "comment": "\n     * Constructs a new \u003ccode\u003eConcurrentModificationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 393,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-54f7e8fb-578b-426a-a34d-6b640aee21d8.getMessage()",
      "begin_line": 382,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 17)-(line 384,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-9f98f284-3d44-4e6e-834c-1dc33f02ae87.getLocalizedMessage()",
      "begin_line": 388,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 390,col 17)-(line 390,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(java.lang.String, java.lang.Object...)",
      "begin_line": 403,
      "end_line": 423,
      "comment": "\n     * Constructs a new \u003ccode\u003eNoSuchElementException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 422,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-aff5b236-8384-40be-b85c-9bccf6375dd6.getMessage()",
      "begin_line": 411,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 413,col 17)-(line 413,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-6e9c4b48-3d06-4b16-a99c-0da3b2f02809.getLocalizedMessage()",
      "begin_line": 417,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 17)-(line 419,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNullPointerException(java.lang.String, java.lang.Object...)",
      "begin_line": 432,
      "end_line": 452,
      "comment": "\n     * Constructs a new \u003ccode\u003eNullPointerException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-001f12ec-6b6e-4485-9f97-00ea3774a87c.getMessage()",
      "begin_line": 440,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 17)-(line 442,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-6f05dbf1-b40c-4d6f-97ea-dfd8b747d4a7.getLocalizedMessage()",
      "begin_line": 446,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 17)-(line 448,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 463,
      "end_line": 484,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-2244bda5-fe3e-4b4f-872c-88bd73828e5d.getMessage()",
      "begin_line": 472,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 17)-(line 474,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-2e851eef-7ede-4a54-a34e-648be49dbb7c.getLocalizedMessage()",
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
      "end_line": 514,
      "comment": " Create an {@link java.lang.RuntimeException} for an internal error.\n     * @param cause underlying cause\n     * @return an {@link java.lang.RuntimeException} for an internal error\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 82)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a6689ba7-8212-40be-a6b2-940cf7698d5d.getMessage()",
      "begin_line": 501,
      "end_line": 504,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 17)-(line 503,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-c74428fd-2463-4b03-a050-828d730fb689.getLocalizedMessage()",
      "begin_line": 507,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 17)-(line 509,col 76)"
      ]
    }
  ]
}
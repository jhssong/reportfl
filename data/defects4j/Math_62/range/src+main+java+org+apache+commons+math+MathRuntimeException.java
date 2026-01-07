{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 39,
      "end_line": 708,
      "comment": "\n* Base class for commons-math unchecked exceptions.\n*\n* @version $Revision$ $Date$\n* @since 2.0\n"
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
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.String, java.lang.Object...)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MathRuntimeException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 33)",
        "(line 77,col 9)-(line 77,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)",
        "(line 89,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 90,col 92)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MathRuntimeException(Throwable, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\n     * Constructs a new \u003ccode\u003eMathRuntimeException\u003c/code\u003e with specified\n     * formatted detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 25)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     * @param locale Locale in which the message should be translated\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return a message string\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getPattern()",
      "begin_line": 144,
      "end_line": 147,
      "comment": " Gets the pattern used to build the message of this throwable.\n    *\n    * @return the pattern used to build the message of this throwable\n    * @deprecated as of 2.2 replaced by {@link #getLocalizablePattern()}\n    ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getLocalizablePattern()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " Gets the localizable pattern used to build the message of this throwable.\n     *\n     * @return the localizable pattern used to build the message of this throwable\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getArguments()",
      "begin_line": 162,
      "end_line": 164,
      "comment": " Gets the arguments used to build the message of this throwable.\n     *\n     * @return the arguments used to build the message of this throwable\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 172,
      "end_line": 177,
      "comment": " Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     *\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getMessage()",
      "begin_line": 180,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 186,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(java.lang.String, java.lang.Object...)",
      "begin_line": 222,
      "end_line": 226,
      "comment": "\n     * Constructs a new \u003ccode\u003eArithmeticException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createArithmeticException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 236,
      "end_line": 256,
      "comment": "\n     * Constructs a new \u003ccode\u003eArithmeticException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 255,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-abe4b33c-4f3c-45eb-8a67-4d2c971fb683.getMessage()",
      "begin_line": 244,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 17)-(line 246,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-4c14d57b-5d5f-4c3b-8cba-2f05d5469247.getLocalizedMessage()",
      "begin_line": 250,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 17)-(line 252,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(java.lang.String, java.lang.Object...)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * Constructs a new \u003ccode\u003eArrayIndexOutOfBoundsException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createArrayIndexOutOfBoundsException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 280,
      "end_line": 300,
      "comment": "\n     * Constructs a new \u003ccode\u003eArrayIndexOutOfBoundsException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 299,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-41e332ee-e967-4b31-8919-a0aa1f5f5c83.getMessage()",
      "begin_line": 288,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 17)-(line 290,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-00dddd99-0699-4eb1-9f12-fe81ad16751e.getLocalizedMessage()",
      "begin_line": 294,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 17)-(line 296,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(java.lang.String, java.lang.Object...)",
      "begin_line": 310,
      "end_line": 314,
      "comment": "\n     * Constructs a new \u003ccode\u003eEOFException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createEOFException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 324,
      "end_line": 344,
      "comment": "\n     * Constructs a new \u003ccode\u003eEOFException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 343,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-03c15239-d9ba-4401-938a-753390b35c6c.getMessage()",
      "begin_line": 332,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 17)-(line 334,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-e4214ed6-ad46-4610-bf03-51c6a6090d75.getLocalizedMessage()",
      "begin_line": 338,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 17)-(line 340,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIOException(java.lang.Throwable)",
      "begin_line": 357,
      "end_line": 361,
      "comment": "\n     * Constructs a new \u003ccode\u003eIOException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * \u003cp\u003eThis factory method allows chaining of other exceptions within an\n     * \u003ccode\u003eIOException\u003c/code\u003e even for Java 5. The constructor for\n     * \u003ccode\u003eIOException\u003c/code\u003e with a cause parameter was introduced only\n     * with Java 6.\u003c/p\u003e\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 75)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.String, java.lang.Object...)",
      "begin_line": 371,
      "end_line": 375,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createIllegalArgumentException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 385,
      "end_line": 405,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 404,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-add6021b-5df9-4b34-8dbf-b166a335e40b.getMessage()",
      "begin_line": 393,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 17)-(line 395,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-2264d572-ef7c-4d75-96bd-de5608fffd72.getLocalizedMessage()",
      "begin_line": 399,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 17)-(line 401,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(java.lang.Throwable)",
      "begin_line": 414,
      "end_line": 418,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalArgumentException\u003c/code\u003e with specified nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     * @param rootCause the exception or error that caused this exception\n     * to be thrown.\n     * @return built exception\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 101)",
        "(line 416,col 9)-(line 416,col 33)",
        "(line 417,col 9)-(line 417,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(java.lang.String, java.lang.Object...)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalStateException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createIllegalStateException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 442,
      "end_line": 462,
      "comment": "\n     * Constructs a new \u003ccode\u003eIllegalStateException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 461,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-0cd894de-4897-4fbf-b6eb-faa7f2aaddde.getMessage()",
      "begin_line": 450,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 17)-(line 452,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-0ba5bc2c-1063-4e50-b254-d08e324cf1fb.getLocalizedMessage()",
      "begin_line": 456,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 17)-(line 458,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(java.lang.String, java.lang.Object...)",
      "begin_line": 472,
      "end_line": 476,
      "comment": "\n     * Constructs a new \u003ccode\u003eConcurrentModificationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createConcurrentModificationException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 486,
      "end_line": 506,
      "comment": "\n     * Constructs a new \u003ccode\u003eConcurrentModificationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 505,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 491,
      "end_line": 491,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-1693e958-3f8a-434f-8423-a1442011bd41.getMessage()",
      "begin_line": 494,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 17)-(line 496,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-35c0996d-1a94-445d-a98d-1dcf8f5438cf.getLocalizedMessage()",
      "begin_line": 500,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 17)-(line 502,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(java.lang.String, java.lang.Object...)",
      "begin_line": 516,
      "end_line": 520,
      "comment": "\n     * Constructs a new \u003ccode\u003eNoSuchElementException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createNoSuchElementException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 530,
      "end_line": 550,
      "comment": "\n     * Constructs a new \u003ccode\u003eNoSuchElementException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 549,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-8756ad6f-822e-49bc-a7c8-15e885e10fd7.getMessage()",
      "begin_line": 538,
      "end_line": 541,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 17)-(line 540,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a52e36f3-3e3b-4be8-a0a1-32f24f3ec4b6.getLocalizedMessage()",
      "begin_line": 544,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 17)-(line 546,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 562,
      "end_line": 582,
      "comment": "\n     * Constructs a new \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     * @deprecated in 2.2. Please use {@link org.apache.commons.math.exception.MathUnsupportedOperationException}\n     * instead.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 581,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-f19a3be8-0ab0-4187-878b-657b91420eec.getMessage()",
      "begin_line": 570,
      "end_line": 573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 17)-(line 572,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-2fea0f72-c358-4eeb-8fc5-205fcf46bbdd.getLocalizedMessage()",
      "begin_line": 576,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 578,col 17)-(line 578,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNullPointerException(java.lang.String, java.lang.Object...)",
      "begin_line": 592,
      "end_line": 596,
      "comment": "\n     * Constructs a new \u003ccode\u003eNullPointerException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createNullPointerException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNullPointerException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 607,
      "end_line": 627,
      "comment": "\n     * Constructs a new \u003ccode\u003eNullPointerException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     * @deprecated in 2.2. Checks for \"null\" must not be performed in Commons-Math.\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 626,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a936132b-ced5-4249-8e78-33b906a5ab42.getMessage()",
      "begin_line": 615,
      "end_line": 618,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 617,col 17)-(line 617,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-15052a45-318c-4388-b15f-5ac3b23bd29d.getLocalizedMessage()",
      "begin_line": 621,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 17)-(line 623,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 639,
      "end_line": 644,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createParseException(int, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 656,
      "end_line": 677,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 676,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-39c76f09-f921-4b4b-8b37-84eae4d88227.getMessage()",
      "begin_line": 665,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 667,col 17)-(line 667,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-563091a5-5a2c-4a61-970b-433fd6495d7f.getLocalizedMessage()",
      "begin_line": 671,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 17)-(line 673,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createInternalError(java.lang.Throwable)",
      "begin_line": 683,
      "end_line": 706,
      "comment": " Create an {@link java.lang.RuntimeException} for an internal error.\n     * @param cause underlying cause\n     * @return an {@link java.lang.RuntimeException} for an internal error\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 77)",
        "(line 687,col 9)-(line 704,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 690,
      "end_line": 690,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-39fc92c6-8bd3-4c13-a271-4d02159c7845.getMessage()",
      "begin_line": 693,
      "end_line": 696,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 17)-(line 695,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-c769b1d0-2a32-4e4a-bbd9-16a6224beb26.getLocalizedMessage()",
      "begin_line": 699,
      "end_line": 702,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 701,col 17)-(line 701,col 100)"
      ]
    }
  ]
}
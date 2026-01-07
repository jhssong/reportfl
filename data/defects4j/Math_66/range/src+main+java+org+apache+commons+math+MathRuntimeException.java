{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 39,
      "end_line": 675,
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
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.MathRuntimeException(java.lang.Throwable, org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.buildMessage(java.util.Locale, org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createArithmeticException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-4b5fb9f5-c254-4ca4-b3d6-d54fb5a441b1.getMessage()",
      "begin_line": 244,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 17)-(line 246,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-238e4e13-b5c8-45fa-b741-56575128d76c.getLocalizedMessage()",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-efb1f9db-5d16-4b70-af58-6c805442c90e.getMessage()",
      "begin_line": 288,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 17)-(line 290,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-e93b7156-60a9-4793-93be-ff4abb14e7ee.getLocalizedMessage()",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createEOFException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-2f458b39-dd68-4d68-b95a-a475692025e3.getMessage()",
      "begin_line": 332,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 17)-(line 334,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-61e4267f-b420-4bea-9c0a-f7a1ceeab06b.getLocalizedMessage()",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-63e85f7d-8fc6-4fa7-8488-975b1bf1c3a8.getMessage()",
      "begin_line": 393,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 17)-(line 395,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-f3d6da0d-87b8-457e-98f4-dc32374cb3e7.getLocalizedMessage()",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-5389ed81-5bd8-48d5-ba29-9f87793f9fd2.getMessage()",
      "begin_line": 450,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 17)-(line 452,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-25feb410-1a5b-497c-b49d-83800aefffac.getLocalizedMessage()",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-c19c8876-a185-4c32-b2c5-43a6bf988507.getMessage()",
      "begin_line": 494,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 17)-(line 496,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-08ed3139-2828-467a-aa4e-a7de8b9c076b.getLocalizedMessage()",
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
      "signature": "org.apache.commons.math.MathRuntimeException.createNoSuchElementException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-a64d8132-5b58-4f6c-87e2-3378b24ec4f0.getMessage()",
      "begin_line": 538,
      "end_line": 541,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 17)-(line 540,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-4be06e0c-33fc-474c-aa00-df797e66b62f.getLocalizedMessage()",
      "begin_line": 544,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 17)-(line 546,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNullPointerException(java.lang.String, java.lang.Object...)",
      "begin_line": 560,
      "end_line": 564,
      "comment": "\n     * Constructs a new \u003ccode\u003eNullPointerException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createNullPointerException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createNullPointerException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
      "begin_line": 574,
      "end_line": 594,
      "comment": "\n     * Constructs a new \u003ccode\u003eNullPointerException\u003c/code\u003e with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 593,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-0b54e53a-b3e8-4624-aac9-a88b59358e32.getMessage()",
      "begin_line": 582,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 17)-(line 584,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-b4e6d2e5-f749-4bbf-aa41-70c184fb0c95.getLocalizedMessage()",
      "begin_line": 588,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 17)-(line 590,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 606,
      "end_line": 611,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @deprecated as of 2.2 replaced by {@link #createParseException(int, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createParseException(int, org.apache.commons.math.util.Localizable, java.lang.Object...)",
      "begin_line": 623,
      "end_line": 644,
      "comment": "\n     * Constructs a new \u003ccode\u003eParseException\u003c/code\u003e with specified\n     * formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param offset offset at which error occurred\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @return built exception\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 643,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-adfcf2c5-03d8-4d52-807a-4237c4ac22d2.getMessage()",
      "begin_line": 632,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 17)-(line 634,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-18e14add-dbaa-4fed-8e2d-02225eb9f9a5.getLocalizedMessage()",
      "begin_line": 638,
      "end_line": 641,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 17)-(line 640,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.createInternalError(java.lang.Throwable)",
      "begin_line": 650,
      "end_line": 673,
      "comment": " Create an {@link java.lang.RuntimeException} for an internal error.\n     * @param cause underlying cause\n     * @return an {@link java.lang.RuntimeException} for an internal error\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 77)",
        "(line 654,col 9)-(line 671,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 657,
      "end_line": 657,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-7912f6b4-b95e-42f2-9f0f-206eae29d180.getMessage()",
      "begin_line": 660,
      "end_line": 663,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 17)-(line 662,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MathRuntimeException.Anonymous-8235bd61-dc87-4ea8-bfa2-9b887539ed87.getLocalizedMessage()",
      "begin_line": 666,
      "end_line": 669,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 668,col 17)-(line 668,col 100)"
      ]
    }
  ]
}
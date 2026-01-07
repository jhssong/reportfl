{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/exception/NestableDelegate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableDelegate",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 403,
      "comment": "\n * \u003cp\u003eA shared implementation of the nestable exception functionality.\u003c/p\u003e\n * \u003cp\u003e\n * The code is shared between \n * {@link org.apache.commons.lang.exception.NestableError NestableError},\n * {@link org.apache.commons.lang.exception.NestableException NestableException} and\n * {@link org.apache.commons.lang.exception.NestableRuntimeException NestableRuntimeException}.\n * \u003c/p\u003e\n * \n * @author \u003ca href\u003d\"mailto:Rafal.Krzewski@e-point.pl\"\u003eRafal Krzewski\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:dlr@collab.net\"\u003eDaniel Rall\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:knielsen@apache.org\"\u003eKasper Nielsen\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author Sean C. Sullivan\n * @author Stephen Colebourne\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MUST_BE_THROWABLE"
      ],
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructor error message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nestable"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Holds the reference to the exception or error that we\u0027re\n     * wrapping (which must be a {@link\n     * org.apache.commons.lang.exception.Nestable} implementation).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "topDown"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Whether to print the stack trace top-down.\n     * This public flag may be set by calling code, typically in initialisation.\n     * This exists for backwards compatability, setting it to false will return\n     * the library to v1.0 behaviour (but will affect all users of the library\n     * in the classloader).\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trimStackFrames"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Whether to trim the repeated stack trace.\n     * This public flag may be set by calling code, typically in initialisation.\n     * This exists for backwards compatability, setting it to false will return\n     * the library to v1.0 behaviour (but will affect all users of the library\n     * in the classloader).\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "matchSubclasses"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Whether to match subclasses via indexOf.\n     * This public flag may be set by calling code, typically in initialisation.\n     * This exists for backwards compatability, setting it to false will return\n     * the library to v2.0 behaviour (but will affect all users of the library\n     * in the classloader).\n     * @since 2.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.NestableDelegate(org.apache.commons.lang.exception.Nestable)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableDelegate\u003c/code\u003e instance to manage the\n     * specified \u003ccode\u003eNestable\u003c/code\u003e.\n     *\n     * @param nestable the Nestable implementation (\u003ci\u003emust\u003c/i\u003e extend\n     * {@link java.lang.Throwable})\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getMessage(int)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Returns the error message of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of \u003ccode\u003eThrowable\u003c/code\u003es at the\n     * specified index, numbered from 0.\n     * \n     * @param index\n     *            the index of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * @return the error message, or null if the \u003ccode\u003eThrowable\u003c/code\u003e at the specified index in the chain does not\n     *         contain a message\n     * @throws IndexOutOfBoundsException\n     *             if the \u003ccode\u003eindex\u003c/code\u003e argument is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es\n     *             in the chain\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 47)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getMessage(java.lang.String)",
      "begin_line": 146,
      "end_line": 156,
      "comment": "\n     * Returns the full message contained by the \u003ccode\u003eNestable\u003c/code\u003e and any nested \u003ccode\u003eThrowable\u003c/code\u003es.\n     * \n     * @param baseMsg\n     *            the base message to use when creating the full message. Should be generally be called via\n     *            \u003ccode\u003enestableHelper.getMessage(super.getMessage())\u003c/code\u003e, where \u003ccode\u003esuper\u003c/code\u003e is an\n     *            instance of {@link java.lang.Throwable}.\n     * @return The concatenated message for this and all nested \u003ccode\u003eThrowable\u003c/code\u003es\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 71)",
        "(line 148,col 9)-(line 148,col 80)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getMessages()",
      "begin_line": 167,
      "end_line": 177,
      "comment": "\n     * Returns the error message of this and any nested \u003ccode\u003eThrowable\u003c/code\u003es in an array of Strings, one element\n     * for each message. Any \u003ccode\u003eThrowable\u003c/code\u003e not containing a message is represented in the array by a null.\n     * This has the effect of cause the length of the returned array to be equal to the result of the\n     * {@link #getThrowableCount()} operation.\n     * \n     * @return the error messages\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 54)",
        "(line 169,col 9)-(line 169,col 54)",
        "(line 170,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getThrowable(int)",
      "begin_line": 191,
      "end_line": 197,
      "comment": "\n     * Returns the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of\n     * \u003ccode\u003eThrowable\u003c/code\u003es at the specified index, numbered from 0.\n     *\n     * @param index the index, numbered from 0, of the \u003ccode\u003eThrowable\u003c/code\u003e in\n     * the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     * negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 54)",
        "(line 196,col 9)-(line 196,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getThrowableCount()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns the number of \u003ccode\u003eThrowable\u003c/code\u003es contained in the\n     * \u003ccode\u003eNestable\u003c/code\u003e contained by this delegate.\n     *\n     * @return the throwable count\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getThrowables()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Returns this delegate\u0027s \u003ccode\u003eNestable\u003c/code\u003e and any nested\n     * \u003ccode\u003eThrowable\u003c/code\u003es in an array of \u003ccode\u003eThrowable\u003c/code\u003es, one\n     * element for each \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003es\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 246,
      "end_line": 272,
      "comment": "\n     * Returns the index, numbered from 0, of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type, or a subclass, in the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * with an index greater than or equal to the specified index.\n     * The method returns -1 if the specified type is not found in the chain.\n     * \u003cp\u003e\n     * NOTE: From v2.1, we have clarified the \u003ccode\u003eNestable\u003c/code\u003e interface\n     * such that this method matches subclasses.\n     * If you want to NOT match subclasses, please use\n     * {@link ExceptionUtils#indexOfThrowable(Throwable, Class, int)}\n     * (which is avaiable in all versions of lang).\n     * An alternative is to use the public static flag {@link #matchSubclasses}\n     * on \u003ccode\u003eNestableDelegate\u003c/code\u003e, however this is not recommended.\n     *\n     * @param type  the type to find, subclasses match, null returns -1\n     * @param fromIndex the index, numbered from 0, of the starting position in\n     * the chain to be searched\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     * the type is not found\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003efromIndex\u003c/code\u003e argument\n     * is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 77)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.printStackTrace()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Prints the stack trace of this exception the the standar error\n     * stream.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.printStackTrace(java.io.PrintStream)",
      "begin_line": 289,
      "end_line": 296,
      "comment": "\n     * Prints the stack trace of this exception to the specified\n     * stream.\n     *\n     * @param out \u003ccode\u003ePrintStream\u003c/code\u003e to use for output.\n     * @see #printStackTrace(PrintWriter)\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.printStackTrace(java.io.PrintWriter)",
      "begin_line": 309,
      "end_line": 352,
      "comment": "\n     * Prints the stack trace of this exception to the specified\n     * writer. If the Throwable class has a \u003ccode\u003egetCause\u003c/code\u003e\n     * method (i.e. running on jre1.4 or higher), this method just \n     * uses Throwable\u0027s printStackTrace() method. Otherwise, generates\n     * the stack-trace, by taking into account the \u0027topDown\u0027 and \n     * \u0027trimStackFrames\u0027 parameters. The topDown and trimStackFrames \n     * are set to \u0027true\u0027 by default (produces jre1.4-like stack trace).\n     *\n     * @param out \u003ccode\u003ePrintWriter\u003c/code\u003e to use for output.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 44)",
        "(line 312,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 322,col 38)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 330,col 9)-(line 330,col 45)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 341,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getStackFrames(java.lang.Throwable)",
      "begin_line": 363,
      "end_line": 374,
      "comment": "\n     * Captures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\n     *\n     * @param t The \u003ccode\u003eThrowable\u003c/code\u003e.\n     * @return  An array of strings describing each stack frame.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 51)",
        "(line 368,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.trimStackFrames(java.util.List)",
      "begin_line": 384,
      "end_line": 402,
      "comment": "\n     * Trims the stack frames. The first set is left untouched. The rest\n     * of the frames are truncated from the bottom by comparing with\n     * one just on top.\n     *\n     * @param stacks The list containing String[] elements\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 385,col 10)-(line 401,col 10)"
      ]
    }
  ]
}
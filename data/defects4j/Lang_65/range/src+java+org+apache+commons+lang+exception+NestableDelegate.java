{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/exception/NestableDelegate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NestableDelegate",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 396,
      "comment": "\n * \u003cp\u003eA shared implementation of the nestable exception functionality.\u003c/p\u003e\n * \u003cp\u003e\n * The code is shared between \n * {@link org.apache.commons.lang.exception.NestableError NestableError},\n * {@link org.apache.commons.lang.exception.NestableException NestableException} and\n * {@link org.apache.commons.lang.exception.NestableRuntimeException NestableRuntimeException}.\n * \u003c/p\u003e\n * \n * @author \u003ca href\u003d\"mailto:Rafal.Krzewski@e-point.pl\"\u003eRafal Krzewski\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:dlr@collab.net\"\u003eDaniel Rall\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:knielsen@apache.org\"\u003eKasper Nielsen\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author Sean C. Sullivan\n * @author Stephen Colebourne\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MUST_BE_THROWABLE"
      ],
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor error message.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nestable"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Holds the reference to the exception or error that we\u0027re\n     * wrapping (which must be a {@link\n     * org.apache.commons.lang.exception.Nestable} implementation).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "topDown"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Whether to print the stack trace top-down.\n     * This public flag may be set by calling code, typically in initialisation.\n     * This exists for backwards compatability, setting it to false will return\n     * the library to v1.0 behaviour (but will affect all users of the library\n     * in the classloader).\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trimStackFrames"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Whether to trim the repeated stack trace.\n     * This public flag may be set by calling code, typically in initialisation.\n     * This exists for backwards compatability, setting it to false will return\n     * the library to v1.0 behaviour (but will affect all users of the library\n     * in the classloader).\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "matchSubclasses"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Whether to match subclasses via indexOf.\n     * This public flag may be set by calling code, typically in initialisation.\n     * This exists for backwards compatability, setting it to false will return\n     * the library to v2.0 behaviour (but will affect all users of the library\n     * in the classloader).\n     * @since 2.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.NestableDelegate(org.apache.commons.lang.exception.Nestable)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * Constructs a new \u003ccode\u003eNestableDelegate\u003c/code\u003e instance to manage the\n     * specified \u003ccode\u003eNestable\u003c/code\u003e.\n     *\n     * @param nestable the Nestable implementation (\u003ci\u003emust\u003c/i\u003e extend\n     * {@link java.lang.Throwable})\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getMessage(int)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * Returns the error message of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of \u003ccode\u003eThrowable\u003c/code\u003es at the\n     * specified index, numbered from 0.\n     * \n     * @param index\n     *            the index of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * @return the error message, or null if the \u003ccode\u003eThrowable\u003c/code\u003e at the specified index in the chain does not\n     *         contain a message\n     * @throws IndexOutOfBoundsException\n     *             if the \u003ccode\u003eindex\u003c/code\u003e argument is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es\n     *             in the chain\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getMessage(java.lang.String)",
      "begin_line": 139,
      "end_line": 149,
      "comment": "\n     * Returns the full message contained by the \u003ccode\u003eNestable\u003c/code\u003e and any nested \u003ccode\u003eThrowable\u003c/code\u003es.\n     * \n     * @param baseMsg\n     *            the base message to use when creating the full message. Should be generally be called via\n     *            \u003ccode\u003enestableHelper.getMessage(super.getMessage())\u003c/code\u003e, where \u003ccode\u003esuper\u003c/code\u003e is an\n     *            instance of {@link java.lang.Throwable}.\n     * @return The concatenated message for this and all nested \u003ccode\u003eThrowable\u003c/code\u003es\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 71)",
        "(line 141,col 9)-(line 141,col 80)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getMessages()",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * Returns the error message of this and any nested \u003ccode\u003eThrowable\u003c/code\u003es in an array of Strings, one element\n     * for each message. Any \u003ccode\u003eThrowable\u003c/code\u003e not containing a message is represented in the array by a null.\n     * This has the effect of cause the length of the returned array to be equal to the result of the\n     * {@link #getThrowableCount()} operation.\n     * \n     * @return the error messages\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 54)",
        "(line 162,col 9)-(line 162,col 54)",
        "(line 163,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getThrowable(int)",
      "begin_line": 184,
      "end_line": 190,
      "comment": "\n     * Returns the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of\n     * \u003ccode\u003eThrowable\u003c/code\u003es at the specified index, numbered from 0.\n     *\n     * @param index the index, numbered from 0, of the \u003ccode\u003eThrowable\u003c/code\u003e in\n     * the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     * negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 189,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getThrowableCount()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns the number of \u003ccode\u003eThrowable\u003c/code\u003es contained in the\n     * \u003ccode\u003eNestable\u003c/code\u003e contained by this delegate.\n     *\n     * @return the throwable count\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getThrowables()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Returns this delegate\u0027s \u003ccode\u003eNestable\u003c/code\u003e and any nested\n     * \u003ccode\u003eThrowable\u003c/code\u003es in an array of \u003ccode\u003eThrowable\u003c/code\u003es, one\n     * element for each \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003es\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 239,
      "end_line": 265,
      "comment": "\n     * Returns the index, numbered from 0, of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type, or a subclass, in the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * with an index greater than or equal to the specified index.\n     * The method returns -1 if the specified type is not found in the chain.\n     * \u003cp\u003e\n     * NOTE: From v2.1, we have clarified the \u003ccode\u003eNestable\u003c/code\u003e interface\n     * such that this method matches subclasses.\n     * If you want to NOT match subclasses, please use\n     * {@link ExceptionUtils#indexOfThrowable(Throwable, Class, int)}\n     * (which is avaiable in all versions of lang).\n     * An alternative is to use the public static flag {@link #matchSubclasses}\n     * on \u003ccode\u003eNestableDelegate\u003c/code\u003e, however this is not recommended.\n     *\n     * @param type  the type to find, subclasses match, null returns -1\n     * @param fromIndex the index, numbered from 0, of the starting position in\n     * the chain to be searched\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     * the type is not found\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003efromIndex\u003c/code\u003e argument\n     * is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 77)",
        "(line 247,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.printStackTrace()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Prints the stack trace of this exception the the standar error\n     * stream.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.printStackTrace(java.io.PrintStream)",
      "begin_line": 282,
      "end_line": 289,
      "comment": "\n     * Prints the stack trace of this exception to the specified\n     * stream.\n     *\n     * @param out \u003ccode\u003ePrintStream\u003c/code\u003e to use for output.\n     * @see #printStackTrace(PrintWriter)\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.printStackTrace(java.io.PrintWriter)",
      "begin_line": 302,
      "end_line": 345,
      "comment": "\n     * Prints the stack trace of this exception to the specified\n     * writer. If the Throwable class has a \u003ccode\u003egetCause\u003c/code\u003e\n     * method (i.e. running on jre1.4 or higher), this method just \n     * uses Throwable\u0027s printStackTrace() method. Otherwise, generates\n     * the stack-trace, by taking into account the \u0027topDown\u0027 and \n     * \u0027trimStackFrames\u0027 parameters. The topDown and trimStackFrames \n     * are set to \u0027true\u0027 by default (produces jre1.4-like stack trace).\n     *\n     * @param out \u003ccode\u003ePrintWriter\u003c/code\u003e to use for output.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 44)",
        "(line 305,col 9)-(line 312,col 9)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 320,col 9)",
        "(line 323,col 9)-(line 323,col 45)",
        "(line 324,col 9)-(line 327,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.getStackFrames(java.lang.Throwable)",
      "begin_line": 356,
      "end_line": 367,
      "comment": "\n     * Captures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\n     *\n     * @param t The \u003ccode\u003eThrowable\u003c/code\u003e.\n     * @return  An array of strings describing each stack frame.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 45)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 361,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.NestableDelegate.trimStackFrames(java.util.List)",
      "begin_line": 377,
      "end_line": 395,
      "comment": "\n     * Trims the stack frames. The first set is left untouched. The rest\n     * of the frames are truncated from the bottom by comparing with\n     * one just on top.\n     *\n     * @param stacks The list containing String[] elements\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 378,col 10)-(line 394,col 10)"
      ]
    }
  ]
}
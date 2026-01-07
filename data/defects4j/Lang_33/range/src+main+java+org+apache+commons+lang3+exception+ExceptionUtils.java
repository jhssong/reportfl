{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 712,
      "comment": "\n * \u003cp\u003eProvides utilities for manipulating and examining \n * \u003ccode\u003eThrowable\u003c/code\u003e objects.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Daniel L. Rall\n * @author Dmitri Plotnikov\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WRAPPED_MARKER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * \u003cp\u003eUsed when printing stack frames to denote the start of a\n     * wrapped exception.\u003c/p\u003e\n     *\n     * \u003cp\u003ePackage private for accessibility by test suite.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CAUSE_METHOD_NAMES"
      ],
      "begin_line": 59,
      "end_line": 72,
      "comment": " TODO: Remove in Lang 4.0"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.ExceptionUtils()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003e\n     * Public constructor allows an instance of \u003ccode\u003eExceptionUtils\u003c/code\u003e to be created, although that is not\n     * normally necessary.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getDefaultCauseMethodNames()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eReturns the default names used when searching for the cause of an exception.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis may be modified and used in the overloaded getCause(Throwable, String[]) method.\u003c/p\u003e\n     *\n     * @return cloned array of the default method names\n     * @since 3.0\n     * @deprecated This feature will be removed in Lang 4.0\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCause(java.lang.Throwable)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method searches for methods with specific names that return a \n     * \u003ccode\u003eThrowable\u003c/code\u003e object. This will pick up most wrapping exceptions,\n     * including those from JDK 1.4.\n     *\n     * \u003cp\u003eThe default list searched for are:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNextException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetTargetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetSourceException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetRootCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCausedByException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNested()\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eIn the absence of any such method, the object is inspected for a\n     * \u003ccode\u003edetail\u003c/code\u003e field assignable to a \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf none of the above is found, returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     * @deprecated This feature will be removed in Lang 4.0\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCause(java.lang.Throwable, java.lang.String[])",
      "begin_line": 154,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eTry known exception types.\u003c/li\u003e\n     * \u003cli\u003eTry the supplied array of method names.\u003c/li\u003e\n     * \u003cli\u003eTry the field \u0027detail\u0027.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e set of method names means use the default set.\n     * A \u003ccode\u003enull\u003c/code\u003e in the set of method names will be ignored.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @param methodNames  the method names, null treated as default set\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     * @deprecated This feature will be removed in Lang 4.0\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getRootCause(java.lang.Throwable)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the root cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method walks through the exception chain to the last element,\n     * \"root\" of the tree, using {@link #getCause(Throwable)}, and\n     * returns that exception.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. If the throwable parameter\n     * has a cause of itself, then null will be returned. If the throwable\n     * parameter cause chain loops, the last element in the chain before the\n     * loop is returned.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to get the root cause for, may be null\n     * @return the root cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 59)",
        "(line 196,col 9)-(line 196,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingMethodName(java.lang.Throwable, java.lang.String)",
      "begin_line": 207,
      "end_line": 229,
      "comment": " TODO: Remove in Lang 4.0",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 29)",
        "(line 209,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getThrowableCount(java.lang.Throwable)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eCounts the number of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return \u003ccode\u003e1\u003c/code\u003e.\n     * A throwable with one cause will return \u003ccode\u003e2\u003c/code\u003e and so on.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the count of throwables, zero if null input\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(java.lang.Throwable)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return an array containing\n     * one element - the input throwable.\n     * A throwable with one cause will return an array containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return an array of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @see #getThrowableList(Throwable)\n     * @param throwable  the throwable to inspect, may be null\n     * @return the array of throwables, never null\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 59)",
        "(line 273,col 9)-(line 273,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)",
      "begin_line": 295,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return a list containing\n     * one element - the input throwable.\n     * A throwable with one cause will return a list containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return a list of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method handles recursive cause structures that might\n     * otherwise cause infinite loops. The cause chain is processed until\n     * the end is reached, or until the next item in the chain is already\n     * in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the list of throwables, never null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 58)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class\u003c?\u003e)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class (exactly) in the exception chain.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class\u003c?\u003e, int)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class, int)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class\u003c?\u003e)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class or subclass in the exception chain.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class\u003c?\u003e, int)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOf(java.lang.Throwable, java.lang.Class\u003c?\u003e, int, boolean)",
      "begin_line": 401,
      "end_line": 426,
      "comment": "\n     * \u003cp\u003eWorker method for the \u003ccode\u003eindexOfType\u003c/code\u003e methods.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @param subclass if \u003ccode\u003etrue\u003c/code\u003e, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares\n     * using references\n     * @return index of the \u003ccode\u003etype\u003c/code\u003e within throwables nested withing the specified \u003ccode\u003ethrowable\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 73)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable\n     * to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintStream)",
      "begin_line": 470,
      "end_line": 482,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param stream  the stream to output to, may not be null\n     * @throws IllegalArgumentException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 59)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintWriter)",
      "begin_line": 503,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param writer  the writer to output to, may not be null\n     * @throws IllegalArgumentException if the writer is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 59)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 531,
      "end_line": 555,
      "comment": "\n     * \u003cp\u003eCreates a compact stack trace for the root cause of the supplied\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * It consists of the root exception followed by each of its wrapping\n     * exceptions separated by \u0027[wrapped]\u0027. Note that this is the opposite\n     * order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to examine, may be null\n     * @return an array of stack trace frames, never null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 58)",
        "(line 536,col 9)-(line 536,col 38)",
        "(line 537,col 9)-(line 537,col 54)",
        "(line 538,col 9)-(line 538,col 74)",
        "(line 539,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 565,
      "end_line": 582,
      "comment": "\n     * \u003cp\u003eRemoves common frames from the cause trace given the two stack traces.\u003c/p\u003e\n     *\n     * @param causeFrames  stack trace of a cause throwable\n     * @param wrapperFrames  stack trace of a wrapper throwable\n     * @throws IllegalArgumentException if either argument is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 53)",
        "(line 570,col 9)-(line 570,col 57)",
        "(line 571,col 9)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(java.lang.Throwable)",
      "begin_line": 597,
      "end_line": 602,
      "comment": "\n     * \u003cp\u003eGets the stack trace from a Throwable as a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the stack trace as generated by the exception\u0027s\n     *  \u003ccode\u003eprintStackTrace(PrintWriter)\u003c/code\u003e method\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 45)",
        "(line 599,col 9)-(line 599,col 51)",
        "(line 600,col 9)-(line 600,col 38)",
        "(line 601,col 9)-(line 601,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(java.lang.Throwable)",
      "begin_line": 617,
      "end_line": 622,
      "comment": "\n     * \u003cp\u003eCaptures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return an array of strings describing each stack frame, never null\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(java.lang.String)",
      "begin_line": 633,
      "end_line": 641,
      "comment": "\n     * \u003cp\u003eReturns an array where each element is a line from the argument.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.\u003c/p\u003e\n     *\n     * @param stackTrace  a stack trace String\n     * @return an array where each element is a line from the argument\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 54)",
        "(line 635,col 9)-(line 635,col 76)",
        "(line 636,col 9)-(line 636,col 52)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackFrameList(java.lang.Throwable)",
      "begin_line": 655,
      "end_line": 673,
      "comment": "\n     * \u003cp\u003eProduces a \u003ccode\u003eList\u003c/code\u003e of stack frames - the message\n     * is not included. Only the trace of the specified exception is\n     * returned, any caused by trace is stripped.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis works in most cases - it will only fail if the exception\n     * message contains a line that starts with:\n     * \u003ccode\u003e\u0026quot;\u0026nbsp;\u0026nbsp;\u0026nbsp;at\u0026quot;.\u003c/code\u003e\u003c/p\u003e\n     * \n     * @param t is any throwable\n     * @return List of stack frames\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 45)",
        "(line 657,col 9)-(line 657,col 54)",
        "(line 658,col 9)-(line 658,col 76)",
        "(line 659,col 9)-(line 659,col 52)",
        "(line 660,col 9)-(line 660,col 37)",
        "(line 661,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getMessage(java.lang.Throwable)",
      "begin_line": 686,
      "end_line": 693,
      "comment": "\n     * Gets a short message summarising the exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 64)",
        "(line 691,col 9)-(line 691,col 37)",
        "(line 692,col 9)-(line 692,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)",
      "begin_line": 706,
      "end_line": 710,
      "comment": "\n     * Gets a short message summarising the root cause exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 57)",
        "(line 708,col 9)-(line 708,col 42)",
        "(line 709,col 9)-(line 709,col 32)"
      ]
    }
  ]
}
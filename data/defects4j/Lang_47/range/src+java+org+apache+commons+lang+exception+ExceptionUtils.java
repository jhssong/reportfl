{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 1009,
      "comment": "\n * \u003cp\u003eProvides utilities for manipulating and examining \n * \u003ccode\u003eThrowable\u003c/code\u003e objects.\u003c/p\u003e\n *\n * @author Daniel L. Rall\n * @author Dmitri Plotnikov\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WRAPPED_MARKER"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eUsed when printing stack frames to denote the start of a\n     * wrapped exception.\u003c/p\u003e\n     *\n     * \u003cp\u003ePackage private for accessibility by test suite.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CAUSE_METHOD_NAMES"
      ],
      "begin_line": 62,
      "end_line": 75,
      "comment": "\n     * \u003cp\u003eThe names of methods commonly used to access a wrapped exception.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROWABLE_CAUSE_METHOD"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * \u003cp\u003eThe Method object for Java 1.4 getCause.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROWABLE_INITCAUSE_METHOD"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * \u003cp\u003eThe Method object for Java 1.4 initCause.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.ExceptionUtils()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003e\n     * Public constructor allows an instance of \u003ccode\u003eExceptionUtils\u003c/code\u003e to be created, although that is not\n     * normally necessary.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.addCauseMethodName(java.lang.String)",
      "begin_line": 122,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eAdds to the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to add to the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.removeCauseMethodName(java.lang.String)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eRemoves from the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to remove from the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.setCause(java.lang.Throwable, java.lang.Throwable)",
      "begin_line": 180,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eSets the cause of a \u003ccode\u003eThrowable\u003c/code\u003e using introspection, allowing\n     * source code compatibility between pre-1.4 and post-1.4 Java releases.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe typical use of this method is inside a constructor as in\n     * the following example:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * import org.apache.commons.lang.exception.ExceptionUtils;\n     *  \n     * public class MyException extends Exception {\n     *  \n     *    public MyException(String msg) {\n     *       super(msg);\n     *    }\n     *\n     *    public MyException(String msg, Throwable cause) {\n     *       super(msg);\n     *       ExceptionUtils.setCause(this, cause);\n     *    }\n     * }\n     * \u003c/pre\u003e\n     *\n     * @param target  the target \u003ccode\u003eThrowable\u003c/code\u003e\n     * @param cause  the \u003ccode\u003eThrowable\u003c/code\u003e to set in the target\n     * @return a \u003ccode\u003etrue\u003c/code\u003e if the target has been modified\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 49)",
        "(line 185,col 9)-(line 185,col 39)",
        "(line 186,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.toArray(java.util.List)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Returns the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     * @param list a list to transform.\n     * @return the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseMethodNameList()",
      "begin_line": 224,
      "end_line": 228,
      "comment": "\n     * Returns {@link #CAUSE_METHOD_NAMES} as a List.\n     *\n     * @return {@link #CAUSE_METHOD_NAMES} as a List.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isCauseMethodName(java.lang.String)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eTests if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects include the given name.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to search in the list.\n     * @return if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     *  objects include the given name.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCause(java.lang.Throwable)",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method searches for methods with specific names that return a \n     * \u003ccode\u003eThrowable\u003c/code\u003e object. This will pick up most wrapping exceptions,\n     * including those from JDK 1.4, and\n     * {@link org.apache.commons.lang.exception.NestableException NestableException}.\n     * The method names can be added to using {@link #addCauseMethodName(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default list searched for are:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNextException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetTargetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetSourceException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetRootCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCausedByException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNested()\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eIn the absence of any such method, the object is inspected for a\n     * \u003ccode\u003edetail\u003c/code\u003e field assignable to a \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf none of the above is found, returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCause(java.lang.Throwable, java.lang.String[])",
      "begin_line": 301,
      "end_line": 327,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eTry known exception types.\u003c/li\u003e\n     * \u003cli\u003eTry the supplied array of method names.\u003c/li\u003e\n     * \u003cli\u003eTry the field \u0027detail\u0027.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e set of method names means use the default set.\n     * A \u003ccode\u003enull\u003c/code\u003e in the set of method names will be ignored.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @param methodNames  the method names, null treated as default set\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 65)",
        "(line 306,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCause(java.lang.Throwable)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the root cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method walks through the exception chain to the last element,\n     * \"root\" of the tree, using {@link #getCause(Throwable)}, and\n     * returns that exception.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. If the throwable parameter\n     * has a cause of itself, then null will be returned. If the throwable\n     * parameter cause chain loops, the last element in the chain before the\n     * loop is returned.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to get the root cause for, may be null\n     * @return the root cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 48)",
        "(line 348,col 9)-(line 348,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingWellKnownTypes(java.lang.Throwable)",
      "begin_line": 361,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e for known types.\u003c/p\u003e\n     * \n     * \u003cp\u003eUses \u003ccode\u003einstanceof\u003c/code\u003e checks to examine the exception,\n     * looking for well known types which could contain chained or\n     * wrapped exceptions.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingMethodName(java.lang.Throwable, java.lang.String)",
      "begin_line": 380,
      "end_line": 402,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by method name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param methodName  the name of the method to find and invoke\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 29)",
        "(line 382,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingFieldName(java.lang.Throwable, java.lang.String)",
      "begin_line": 411,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by field name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param fieldName  the name of the attribute to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 27)",
        "(line 413,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isThrowableNested()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * \u003cp\u003eChecks if the Throwable class has a \u003ccode\u003egetCause\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is true for JDK 1.4 and above.\u003c/p\u003e\n     *\n     * @return true if Throwable is nestable\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(java.lang.Throwable)",
      "begin_line": 455,
      "end_line": 498,
      "comment": "\n     * \u003cp\u003eChecks whether this \u003ccode\u003eThrowable\u003c/code\u003e class can store a cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does \u003cb\u003enot\u003c/b\u003e check whether it actually does store a cause.\u003cp\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if nested otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 41)",
        "(line 471,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 495,col 9)",
        "(line 497,col 9)-(line 497,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowableCount(java.lang.Throwable)",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003eCounts the number of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return \u003ccode\u003e1\u003c/code\u003e.\n     * A throwable with one cause will return \u003ccode\u003e2\u003c/code\u003e and so on.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the count of throwables, zero if null input\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowables(java.lang.Throwable)",
      "begin_line": 540,
      "end_line": 543,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return an array containing\n     * one element - the input throwable.\n     * A throwable with one cause will return an array containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return an array of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @see #getThrowableList(Throwable)\n     * @param throwable  the throwable to inspect, may be null\n     * @return the array of throwables, never null\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 48)",
        "(line 542,col 9)-(line 542,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)",
      "begin_line": 564,
      "end_line": 571,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return a list containing\n     * one element - the input throwable.\n     * A throwable with one cause will return a list containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return a list of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method handles recursive cause structures that might\n     * otherwise cause infinite loops. The cause chain is processed until\n     * the end is reached, or until the next item in the chain is already\n     * in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the list of throwables, never null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 36)",
        "(line 566,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class)",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class (exactly) in the exception chain.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class, int)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class, int)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class or subclass in the exception chain.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class, int)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOf(java.lang.Throwable, java.lang.Class, int, boolean)",
      "begin_line": 670,
      "end_line": 695,
      "comment": "\n     * \u003cp\u003eWorker method for the \u003ccode\u003eindexOfType\u003c/code\u003e methods.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @param subclass if \u003ccode\u003etrue\u003c/code\u003e, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares\n     * using references\n     * @return index of the \u003ccode\u003etype\u003c/code\u003e within throwables nested withing the specified \u003ccode\u003ethrowable\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 73)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable\n     * to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintStream)",
      "begin_line": 739,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param stream  the stream to output to, may not be null\n     * @throws IllegalArgumentException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 746,col 59)",
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintWriter)",
      "begin_line": 772,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param writer  the writer to output to, may not be null\n     * @throws IllegalArgumentException if the writer is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 59)",
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 800,
      "end_line": 824,
      "comment": "\n     * \u003cp\u003eCreates a compact stack trace for the root cause of the supplied\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * It consists of the root exception followed by each of its wrapping\n     * exceptions separated by \u0027[wrapped]\u0027. Note that this is the opposite\n     * order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to examine, may be null\n     * @return an array of stack trace frames, never null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 58)",
        "(line 805,col 9)-(line 805,col 38)",
        "(line 806,col 9)-(line 806,col 43)",
        "(line 807,col 9)-(line 807,col 66)",
        "(line 808,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.removeCommonFrames(java.util.List, java.util.List)",
      "begin_line": 834,
      "end_line": 851,
      "comment": "\n     * \u003cp\u003eRemoves common frames from the cause trace given the two stack traces.\u003c/p\u003e\n     *\n     * @param causeFrames  stack trace of a cause throwable\n     * @param wrapperFrames  stack trace of a wrapper throwable\n     * @throws IllegalArgumentException if either argument is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 53)",
        "(line 839,col 9)-(line 839,col 57)",
        "(line 840,col 9)-(line 850,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getFullStackTrace(java.lang.Throwable)",
      "begin_line": 864,
      "end_line": 875,
      "comment": "\n     * \u003cp\u003eA way to get the entire nested stack-trace of an throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method is highly dependent on the JDK version\n     * and whether the exceptions override printStackTrace or not.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the nested stack trace, with the root cause first\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 45)",
        "(line 866,col 9)-(line 866,col 51)",
        "(line 867,col 9)-(line 867,col 50)",
        "(line 868,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(java.lang.Throwable)",
      "begin_line": 890,
      "end_line": 895,
      "comment": "\n     * \u003cp\u003eGets the stack trace from a Throwable as a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the stack trace as generated by the exception\u0027s\n     *  \u003ccode\u003eprintStackTrace(PrintWriter)\u003c/code\u003e method\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 45)",
        "(line 892,col 9)-(line 892,col 51)",
        "(line 893,col 9)-(line 893,col 38)",
        "(line 894,col 9)-(line 894,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(java.lang.Throwable)",
      "begin_line": 910,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003eCaptures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return an array of strings describing each stack frame, never null\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(java.lang.String)",
      "begin_line": 930,
      "end_line": 938,
      "comment": "\n     * \u003cp\u003eReturns an array where each element is a line from the argument.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.\u003c/p\u003e\n     *\n     * \u003cp\u003eFunctionality shared between the\n     * \u003ccode\u003egetStackFrames(Throwable)\u003c/code\u003e methods of this and the\n     * {@link org.apache.commons.lang.exception.NestableDelegate} classes.\u003c/p\u003e\n     *\n     * @param stackTrace  a stack trace String\n     * @return an array where each element is a line from the argument\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 54)",
        "(line 932,col 9)-(line 932,col 76)",
        "(line 933,col 9)-(line 933,col 36)",
        "(line 934,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 937,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrameList(java.lang.Throwable)",
      "begin_line": 952,
      "end_line": 970,
      "comment": "\n     * \u003cp\u003eProduces a \u003ccode\u003eList\u003c/code\u003e of stack frames - the message\n     * is not included. Only the trace of the specified exception is\n     * returned, any caused by trace is stripped.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis works in most cases - it will only fail if the exception\n     * message contains a line that starts with:\n     * \u003ccode\u003e\u0026quot;\u0026nbsp;\u0026nbsp;\u0026nbsp;at\u0026quot;.\u003c/code\u003e\u003c/p\u003e\n     * \n     * @param t is any throwable\n     * @return List of stack frames\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 45)",
        "(line 954,col 9)-(line 954,col 54)",
        "(line 955,col 9)-(line 955,col 76)",
        "(line 956,col 9)-(line 956,col 36)",
        "(line 957,col 9)-(line 957,col 37)",
        "(line 958,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getMessage(java.lang.Throwable)",
      "begin_line": 983,
      "end_line": 990,
      "comment": "\n     * Gets a short message summarising the exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 64)",
        "(line 988,col 9)-(line 988,col 37)",
        "(line 989,col 9)-(line 989,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)",
      "begin_line": 1003,
      "end_line": 1007,
      "comment": "\n     * Gets a short message summarising the root cause exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 57)",
        "(line 1005,col 9)-(line 1005,col 42)",
        "(line 1006,col 9)-(line 1006,col 32)"
      ]
    }
  ]
}
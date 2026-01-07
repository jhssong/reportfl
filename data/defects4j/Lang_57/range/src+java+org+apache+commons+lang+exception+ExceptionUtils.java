{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 995,
      "comment": "\n * \u003cp\u003eProvides utilities for manipulating and examining \n * \u003ccode\u003eThrowable\u003c/code\u003e objects.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @author Dmitri Plotnikov\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
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
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eAdds to the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to add to the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.removeCauseMethodName(java.lang.String)",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * \u003cp\u003eRemoves from the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to remove from the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.setCause(java.lang.Throwable, java.lang.Throwable)",
      "begin_line": 176,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eSets the cause of a \u003ccode\u003eThrowable\u003c/code\u003e using introspection, allowing\n     * source code compatibility between pre-1.4 and post-1.4 Java releases.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe typical use of this method is inside a constructor as in\n     * the following example:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * import org.apache.commons.lang.exception.ExceptionUtils;\n     *  \n     * public class MyException extends Exception {\n     *  \n     *    public MyException(String msg) {\n     *       super(msg);\n     *    }\n     *\n     *    public MyException(String msg, Throwable cause) {\n     *       super(msg);\n     *       ExceptionUtils.setCause(this, cause);\n     *    }\n     * }\n     * \u003c/pre\u003e\n     *\n     * @param target  the target \u003ccode\u003eThrowable\u003c/code\u003e\n     * @param cause  the \u003ccode\u003eThrowable\u003c/code\u003e to set in the target\n     * @return a \u003ccode\u003etrue\u003c/code\u003e if the target has been modified\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 49)",
        "(line 181,col 9)-(line 181,col 39)",
        "(line 182,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.toArray(java.util.List)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Returns the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     * @param list a list to transform.\n     * @return the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseMethodNameList()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns {@link #CAUSE_METHOD_NAMES} as a List.\n     *\n     * @return {@link #CAUSE_METHOD_NAMES} as a List.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isCauseMethodName(java.lang.String)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003eTests if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects include the given name.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to search in the list.\n     * @return if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     *  objects include the given name.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCause(java.lang.Throwable)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method searches for methods with specific names that return a \n     * \u003ccode\u003eThrowable\u003c/code\u003e object. This will pick up most wrapping exceptions,\n     * including those from JDK 1.4, and\n     * {@link org.apache.commons.lang.exception.NestableException NestableException}.\n     * The method names can be added to using {@link #addCauseMethodName(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default list searched for are:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNextException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetTargetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetSourceException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetRootCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCausedByException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNested()\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eIn the absence of any such method, the object is inspected for a\n     * \u003ccode\u003edetail\u003c/code\u003e field assignable to a \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf none of the above is found, returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCause(java.lang.Throwable, java.lang.String[])",
      "begin_line": 291,
      "end_line": 315,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eTry known exception types.\u003c/li\u003e\n     * \u003cli\u003eTry the supplied array of method names.\u003c/li\u003e\n     * \u003cli\u003eTry the field \u0027detail\u0027.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e set of method names means use the default set.\n     * A \u003ccode\u003enull\u003c/code\u003e in the set of method names will be ignored.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @param methodNames  the method names, null treated as default set\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 65)",
        "(line 296,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCause(java.lang.Throwable)",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the root cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method walks through the exception chain to the last element,\n     * \"root\" of the tree, using {@link #getCause(Throwable)}, and\n     * returns that exception.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. If the throwable parameter\n     * has a cause of itself, then null will be returned. If the throwable\n     * parameter cause chain loops, the last element in the chain before the\n     * loop is returned.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to get the root cause for, may be null\n     * @return the root cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 48)",
        "(line 336,col 9)-(line 336,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingWellKnownTypes(java.lang.Throwable)",
      "begin_line": 349,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e for known types.\u003c/p\u003e\n     * \n     * \u003cp\u003eUses \u003ccode\u003einstanceof\u003c/code\u003e checks to examine the exception,\n     * looking for well known types which could contain chained or\n     * wrapped exceptions.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingMethodName(java.lang.Throwable, java.lang.String)",
      "begin_line": 368,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by method name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param methodName  the name of the method to find and invoke\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 29)",
        "(line 370,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingFieldName(java.lang.Throwable, java.lang.String)",
      "begin_line": 399,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by field name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param fieldName  the name of the attribute to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 27)",
        "(line 401,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isThrowableNested()",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eChecks if the Throwable class has a \u003ccode\u003egetCause\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is true for JDK 1.4 and above.\u003c/p\u003e\n     *\n     * @return true if Throwable is nestable\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(java.lang.Throwable)",
      "begin_line": 443,
      "end_line": 484,
      "comment": "\n     * \u003cp\u003eChecks whether this \u003ccode\u003eThrowable\u003c/code\u003e class can store a cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does \u003cb\u003enot\u003c/b\u003e check whether it actually does store a cause.\u003cp\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if nested otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 41)",
        "(line 459,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 483,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowableCount(java.lang.Throwable)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * \u003cp\u003eCounts the number of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return \u003ccode\u003e1\u003c/code\u003e.\n     * A throwable with one cause will return \u003ccode\u003e2\u003c/code\u003e and so on.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the count of throwables, zero if null input\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowables(java.lang.Throwable)",
      "begin_line": 526,
      "end_line": 529,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return an array containing\n     * one element - the input throwable.\n     * A throwable with one cause will return an array containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return an array of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @see #getThrowableList(Throwable)\n     * @param throwable  the throwable to inspect, may be null\n     * @return the array of throwables, never null\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 48)",
        "(line 528,col 9)-(line 528,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)",
      "begin_line": 550,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return a list containing\n     * one element - the input throwable.\n     * A throwable with one cause will return a list containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return a list of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method handles recursive cause structures that might\n     * otherwise cause infinite loops. The cause chain is processed until\n     * the end is reached, or until the next item in the chain is already\n     * in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the list of throwables, never null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 36)",
        "(line 552,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class (exactly) in the exception chain.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class, int)",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class, int)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class)",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class or subclass in the exception chain.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class, int)",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOf(java.lang.Throwable, java.lang.Class, int, boolean)",
      "begin_line": 656,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eWorker method for the \u003ccode\u003eindexOfType\u003c/code\u003e methods.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @param subclass if \u003ccode\u003etrue\u003c/code\u003e, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares\n     * using references\n     * @return index of the \u003ccode\u003etype\u003c/code\u003e within throwables nested withing the specified \u003ccode\u003ethrowable\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 663,col 73)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 702,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable\n     * to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintStream)",
      "begin_line": 725,
      "end_line": 737,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param stream  the stream to output to, may not be null\n     * @throws IllegalArgumentException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 59)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintWriter)",
      "begin_line": 758,
      "end_line": 770,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param writer  the writer to output to, may not be null\n     * @throws IllegalArgumentException if the writer is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 765,col 59)",
        "(line 766,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 786,
      "end_line": 810,
      "comment": "\n     * \u003cp\u003eCreates a compact stack trace for the root cause of the supplied\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * It consists of the root exception followed by each of its wrapping\n     * exceptions separated by \u0027[wrapped]\u0027. Note that this is the opposite\n     * order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to examine, may be null\n     * @return an array of stack trace frames, never null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 58)",
        "(line 791,col 9)-(line 791,col 38)",
        "(line 792,col 9)-(line 792,col 43)",
        "(line 793,col 9)-(line 793,col 66)",
        "(line 794,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.removeCommonFrames(java.util.List, java.util.List)",
      "begin_line": 820,
      "end_line": 837,
      "comment": "\n     * \u003cp\u003eRemoves common frames from the cause trace given the two stack traces.\u003c/p\u003e\n     *\n     * @param causeFrames  stack trace of a cause throwable\n     * @param wrapperFrames  stack trace of a wrapper throwable\n     * @throws IllegalArgumentException if either argument is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 53)",
        "(line 825,col 9)-(line 825,col 57)",
        "(line 826,col 9)-(line 836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getFullStackTrace(java.lang.Throwable)",
      "begin_line": 850,
      "end_line": 861,
      "comment": "\n     * \u003cp\u003eA way to get the entire nested stack-trace of an throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method is highly dependent on the JDK version\n     * and whether the exceptions override printStackTrace or not.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the nested stack trace, with the root cause first\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 45)",
        "(line 852,col 9)-(line 852,col 51)",
        "(line 853,col 9)-(line 853,col 50)",
        "(line 854,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 860,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(java.lang.Throwable)",
      "begin_line": 876,
      "end_line": 881,
      "comment": "\n     * \u003cp\u003eGets the stack trace from a Throwable as a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the stack trace as generated by the exception\u0027s\n     *  \u003ccode\u003eprintStackTrace(PrintWriter)\u003c/code\u003e method\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 45)",
        "(line 878,col 9)-(line 878,col 51)",
        "(line 879,col 9)-(line 879,col 38)",
        "(line 880,col 9)-(line 880,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(java.lang.Throwable)",
      "begin_line": 896,
      "end_line": 901,
      "comment": "\n     * \u003cp\u003eCaptures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return an array of strings describing each stack frame, never null\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 900,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(java.lang.String)",
      "begin_line": 916,
      "end_line": 924,
      "comment": "\n     * \u003cp\u003eReturns an array where each element is a line from the argument.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.\u003c/p\u003e\n     *\n     * \u003cp\u003eFunctionality shared between the\n     * \u003ccode\u003egetStackFrames(Throwable)\u003c/code\u003e methods of this and the\n     * {@link org.apache.commons.lang.exception.NestableDelegate} classes.\u003c/p\u003e\n     *\n     * @param stackTrace  a stack trace String\n     * @return an array where each element is a line from the argument\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 54)",
        "(line 918,col 9)-(line 918,col 76)",
        "(line 919,col 9)-(line 919,col 36)",
        "(line 920,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrameList(java.lang.Throwable)",
      "begin_line": 938,
      "end_line": 956,
      "comment": "\n     * \u003cp\u003eProduces a \u003ccode\u003eList\u003c/code\u003e of stack frames - the message\n     * is not included. Only the trace of the specified exception is\n     * returned, any caused by trace is stripped.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis works in most cases - it will only fail if the exception\n     * message contains a line that starts with:\n     * \u003ccode\u003e\u0026quot;\u0026nbsp;\u0026nbsp;\u0026nbsp;at\u0026quot;.\u003c/code\u003e\u003c/p\u003e\n     * \n     * @param t is any throwable\n     * @return List of stack frames\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 45)",
        "(line 940,col 9)-(line 940,col 54)",
        "(line 941,col 9)-(line 941,col 76)",
        "(line 942,col 9)-(line 942,col 36)",
        "(line 943,col 9)-(line 943,col 37)",
        "(line 944,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getMessage(java.lang.Throwable)",
      "begin_line": 969,
      "end_line": 976,
      "comment": "\n     * Gets a short message summarising the exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 64)",
        "(line 974,col 9)-(line 974,col 37)",
        "(line 975,col 9)-(line 975,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)",
      "begin_line": 989,
      "end_line": 993,
      "comment": "\n     * Gets a short message summarising the root cause exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 57)",
        "(line 991,col 9)-(line 991,col 42)",
        "(line 992,col 9)-(line 992,col 32)"
      ]
    }
  ]
}
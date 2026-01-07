{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/exception/ExceptionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 1002,
      "comment": "@ThreadSafe"
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
        "CAUSE_METHOD_NAMES_LOCK"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Lock object for CAUSE_METHOD_NAMES"
    },
    {
      "type": "field",
      "varNames": [
        "CAUSE_METHOD_NAMES"
      ],
      "begin_line": 66,
      "end_line": 79,
      "comment": "    @GuardedBy(\"CAUSE_METHOD_NAMES_LOCK\")"
    },
    {
      "type": "field",
      "varNames": [
        "THROWABLE_CAUSE_METHOD"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eThe Method object for Java 1.4 getCause.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROWABLE_INITCAUSE_METHOD"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003eThe Method object for Java 1.4 initCause.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.ExceptionUtils()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * \u003cp\u003e\n     * Public constructor allows an instance of \u003ccode\u003eExceptionUtils\u003c/code\u003e to be created, although that is not\n     * normally necessary.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.addCauseMethodName(java.lang.String)",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eAdds to the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to add to the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.removeCauseMethodName(java.lang.String)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eRemoves from the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to remove from the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.setCause(java.lang.Throwable, java.lang.Throwable)",
      "begin_line": 182,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eSets the cause of a \u003ccode\u003eThrowable\u003c/code\u003e using introspection, allowing\n     * source code compatibility between pre-1.4 and post-1.4 Java releases.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe typical use of this method is inside a constructor as in\n     * the following example:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * import org.apache.commons.lang3.exception.ExceptionUtils;\n     *  \n     * public class MyException extends Exception {\n     *  \n     *    public MyException(String msg) {\n     *       super(msg);\n     *    }\n     *\n     *    public MyException(String msg, Throwable cause) {\n     *       super(msg);\n     *       ExceptionUtils.setCause(this, cause);\n     *    }\n     * }\n     * \u003c/pre\u003e\n     *\n     * @param target  the target \u003ccode\u003eThrowable\u003c/code\u003e\n     * @param cause  the \u003ccode\u003eThrowable\u003c/code\u003e to set in the target\n     * @return a \u003ccode\u003etrue\u003c/code\u003e if the target has been modified\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 49)",
        "(line 187,col 9)-(line 187,col 39)",
        "(line 188,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.toArray(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Returns the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     * @param list a list to transform.\n     * @return the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCauseMethodNameList()",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Returns {@link #CAUSE_METHOD_NAMES} as a List.\n     *\n     * @return {@link #CAUSE_METHOD_NAMES} as a List.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.isCauseMethodName(java.lang.String)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003eTests if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects include the given name.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to search in the list.\n     * @return if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     *  objects include the given name.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCause(java.lang.Throwable)",
      "begin_line": 278,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method searches for methods with specific names that return a \n     * \u003ccode\u003eThrowable\u003c/code\u003e object. This will pick up most wrapping exceptions,\n     * including those from JDK 1.4.\n     * The method names can be added to using {@link #addCauseMethodName(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default list searched for are:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNextException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetTargetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetSourceException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetRootCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCausedByException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNested()\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eIn the absence of any such method, the object is inspected for a\n     * \u003ccode\u003edetail\u003c/code\u003e field assignable to a \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf none of the above is found, returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCause(java.lang.Throwable, java.lang.String[])",
      "begin_line": 302,
      "end_line": 328,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eTry known exception types.\u003c/li\u003e\n     * \u003cli\u003eTry the supplied array of method names.\u003c/li\u003e\n     * \u003cli\u003eTry the field \u0027detail\u0027.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e set of method names means use the default set.\n     * A \u003ccode\u003enull\u003c/code\u003e in the set of method names will be ignored.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @param methodNames  the method names, null treated as default set\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 65)",
        "(line 307,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getRootCause(java.lang.Throwable)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the root cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method walks through the exception chain to the last element,\n     * \"root\" of the tree, using {@link #getCause(Throwable)}, and\n     * returns that exception.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. If the throwable parameter\n     * has a cause of itself, then null will be returned. If the throwable\n     * parameter cause chain loops, the last element in the chain before the\n     * loop is returned.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to get the root cause for, may be null\n     * @return the root cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 59)",
        "(line 349,col 9)-(line 349,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingWellKnownTypes(java.lang.Throwable)",
      "begin_line": 362,
      "end_line": 370,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e for known types.\u003c/p\u003e\n     * \n     * \u003cp\u003eUses \u003ccode\u003einstanceof\u003c/code\u003e checks to examine the exception,\n     * looking for well known types which could contain chained or\n     * wrapped exceptions.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingMethodName(java.lang.Throwable, java.lang.String)",
      "begin_line": 379,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by method name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param methodName  the name of the method to find and invoke\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 29)",
        "(line 381,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingFieldName(java.lang.Throwable, java.lang.String)",
      "begin_line": 410,
      "end_line": 430,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by field name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param fieldName  the name of the attribute to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 27)",
        "(line 412,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.isThrowableNested()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003eChecks if the Throwable class has a \u003ccode\u003egetCause\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is true for JDK 1.4 and above.\u003c/p\u003e\n     *\n     * @return true if Throwable is nestable\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.isNestedThrowable(java.lang.Throwable)",
      "begin_line": 454,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eChecks whether this \u003ccode\u003eThrowable\u003c/code\u003e class can store a cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does \u003cb\u003enot\u003c/b\u003e check whether it actually does store a cause.\u003cp\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if nested otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 62)",
        "(line 468,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getThrowableCount(java.lang.Throwable)",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003eCounts the number of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return \u003ccode\u003e1\u003c/code\u003e.\n     * A throwable with one cause will return \u003ccode\u003e2\u003c/code\u003e and so on.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the count of throwables, zero if null input\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(java.lang.Throwable)",
      "begin_line": 537,
      "end_line": 540,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return an array containing\n     * one element - the input throwable.\n     * A throwable with one cause will return an array containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return an array of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @see #getThrowableList(Throwable)\n     * @param throwable  the throwable to inspect, may be null\n     * @return the array of throwables, never null\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 59)",
        "(line 539,col 9)-(line 539,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)",
      "begin_line": 561,
      "end_line": 568,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return a list containing\n     * one element - the input throwable.\n     * A throwable with one cause will return a list containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return a list of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method handles recursive cause structures that might\n     * otherwise cause infinite loops. The cause chain is processed until\n     * the end is reached, or until the next item in the chain is already\n     * in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the list of throwables, never null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 58)",
        "(line 563,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class\u003c?\u003e)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class (exactly) in the exception chain.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class\u003c?\u003e, int)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class, int)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class\u003c?\u003e)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class or subclass in the exception chain.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class\u003c?\u003e, int)",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.indexOf(java.lang.Throwable, java.lang.Class\u003c?\u003e, int, boolean)",
      "begin_line": 667,
      "end_line": 692,
      "comment": "\n     * \u003cp\u003eWorker method for the \u003ccode\u003eindexOfType\u003c/code\u003e methods.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @param subclass if \u003ccode\u003etrue\u003c/code\u003e, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares\n     * using references\n     * @return index of the \u003ccode\u003etype\u003c/code\u003e within throwables nested withing the specified \u003ccode\u003ethrowable\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 73)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 691,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 713,
      "end_line": 715,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable\n     * to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintStream)",
      "begin_line": 736,
      "end_line": 748,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param stream  the stream to output to, may not be null\n     * @throws IllegalArgumentException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 59)",
        "(line 744,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintWriter)",
      "begin_line": 769,
      "end_line": 781,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param writer  the writer to output to, may not be null\n     * @throws IllegalArgumentException if the writer is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 59)",
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 797,
      "end_line": 821,
      "comment": "\n     * \u003cp\u003eCreates a compact stack trace for the root cause of the supplied\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * It consists of the root exception followed by each of its wrapping\n     * exceptions separated by \u0027[wrapped]\u0027. Note that this is the opposite\n     * order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to examine, may be null\n     * @return an array of stack trace frames, never null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 58)",
        "(line 802,col 9)-(line 802,col 38)",
        "(line 803,col 9)-(line 803,col 54)",
        "(line 804,col 9)-(line 804,col 74)",
        "(line 805,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 831,
      "end_line": 848,
      "comment": "\n     * \u003cp\u003eRemoves common frames from the cause trace given the two stack traces.\u003c/p\u003e\n     *\n     * @param causeFrames  stack trace of a cause throwable\n     * @param wrapperFrames  stack trace of a wrapper throwable\n     * @throws IllegalArgumentException if either argument is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 53)",
        "(line 836,col 9)-(line 836,col 57)",
        "(line 837,col 9)-(line 847,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getFullStackTrace(java.lang.Throwable)",
      "begin_line": 861,
      "end_line": 872,
      "comment": "\n     * \u003cp\u003eA way to get the entire nested stack-trace of an throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method is highly dependent on the JDK version\n     * and whether the exceptions override printStackTrace or not.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the nested stack trace, with the root cause first\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 45)",
        "(line 863,col 9)-(line 863,col 51)",
        "(line 864,col 9)-(line 864,col 50)",
        "(line 865,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(java.lang.Throwable)",
      "begin_line": 887,
      "end_line": 892,
      "comment": "\n     * \u003cp\u003eGets the stack trace from a Throwable as a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the stack trace as generated by the exception\u0027s\n     *  \u003ccode\u003eprintStackTrace(PrintWriter)\u003c/code\u003e method\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 45)",
        "(line 889,col 9)-(line 889,col 51)",
        "(line 890,col 9)-(line 890,col 38)",
        "(line 891,col 9)-(line 891,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(java.lang.Throwable)",
      "begin_line": 907,
      "end_line": 912,
      "comment": "\n     * \u003cp\u003eCaptures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return an array of strings describing each stack frame, never null\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 911,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(java.lang.String)",
      "begin_line": 923,
      "end_line": 931,
      "comment": "\n     * \u003cp\u003eReturns an array where each element is a line from the argument.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.\u003c/p\u003e\n     *\n     * @param stackTrace  a stack trace String\n     * @return an array where each element is a line from the argument\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 54)",
        "(line 925,col 9)-(line 925,col 76)",
        "(line 926,col 9)-(line 926,col 52)",
        "(line 927,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 930,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getStackFrameList(java.lang.Throwable)",
      "begin_line": 945,
      "end_line": 963,
      "comment": "\n     * \u003cp\u003eProduces a \u003ccode\u003eList\u003c/code\u003e of stack frames - the message\n     * is not included. Only the trace of the specified exception is\n     * returned, any caused by trace is stripped.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis works in most cases - it will only fail if the exception\n     * message contains a line that starts with:\n     * \u003ccode\u003e\u0026quot;\u0026nbsp;\u0026nbsp;\u0026nbsp;at\u0026quot;.\u003c/code\u003e\u003c/p\u003e\n     * \n     * @param t is any throwable\n     * @return List of stack frames\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 45)",
        "(line 947,col 9)-(line 947,col 54)",
        "(line 948,col 9)-(line 948,col 76)",
        "(line 949,col 9)-(line 949,col 52)",
        "(line 950,col 9)-(line 950,col 37)",
        "(line 951,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getMessage(java.lang.Throwable)",
      "begin_line": 976,
      "end_line": 983,
      "comment": "\n     * Gets a short message summarising the exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 64)",
        "(line 981,col 9)-(line 981,col 37)",
        "(line 982,col 9)-(line 982,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)",
      "begin_line": 996,
      "end_line": 1000,
      "comment": "\n     * Gets a short message summarising the root cause exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 57)",
        "(line 998,col 9)-(line 998,col 42)",
        "(line 999,col 9)-(line 999,col 32)"
      ]
    }
  ]
}
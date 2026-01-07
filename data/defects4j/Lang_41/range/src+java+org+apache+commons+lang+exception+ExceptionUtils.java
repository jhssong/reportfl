{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/exception/ExceptionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 1035,
      "comment": "@ThreadSafe"
    },
    {
      "type": "field",
      "varNames": [
        "WRAPPED_MARKER"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eUsed when printing stack frames to denote the start of a\n     * wrapped exception.\u003c/p\u003e\n     *\n     * \u003cp\u003ePackage private for accessibility by test suite.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CAUSE_METHOD_NAMES_LOCK"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Lock object for CAUSE_METHOD_NAMES"
    },
    {
      "type": "field",
      "varNames": [
        "CAUSE_METHOD_NAMES"
      ],
      "begin_line": 72,
      "end_line": 85,
      "comment": "    @GuardedBy(\"CAUSE_METHOD_NAMES_LOCK\")"
    },
    {
      "type": "field",
      "varNames": [
        "THROWABLE_CAUSE_METHOD"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003eThe Method object for Java 1.4 getCause.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THROWABLE_INITCAUSE_METHOD"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eThe Method object for Java 1.4 initCause.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_CONTEXT"
      ],
      "begin_line": 101,
      "end_line": 121,
      "comment": "\n     * An empty {@link ExceptionContext}.\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.Anonymous-ec068864-3582-4a6a-a549-3778b9beb9bb.addLabeledValue(java.lang.String, java.io.Serializable)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 11)-(line 106,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.Anonymous-1184ba24-0bf0-4911-ab85-becf19186c64.getLabeledValue(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 11)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.Anonymous-a401d7ab-09d6-4939-913d-e98110e12ed0.getLabelSet()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 11)-(line 114,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.Anonymous-e0d88d0c-5fdf-408c-abab-40eadede557f.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 11)-(line 118,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.ExceptionUtils()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * \u003cp\u003e\n     * Public constructor allows an instance of \u003ccode\u003eExceptionUtils\u003c/code\u003e to be created, although that is not\n     * normally necessary.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.addCauseMethodName(java.lang.String)",
      "begin_line": 157,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003eAdds to the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to add to the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.removeCauseMethodName(java.lang.String)",
      "begin_line": 176,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eRemoves from the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to remove from the list, \u003ccode\u003enull\u003c/code\u003e\n     *  and empty strings are ignored\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.setCause(java.lang.Throwable, java.lang.Throwable)",
      "begin_line": 215,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eSets the cause of a \u003ccode\u003eThrowable\u003c/code\u003e using introspection, allowing\n     * source code compatibility between pre-1.4 and post-1.4 Java releases.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe typical use of this method is inside a constructor as in\n     * the following example:\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * import org.apache.commons.lang.exception.ExceptionUtils;\n     *  \n     * public class MyException extends Exception {\n     *  \n     *    public MyException(String msg) {\n     *       super(msg);\n     *    }\n     *\n     *    public MyException(String msg, Throwable cause) {\n     *       super(msg);\n     *       ExceptionUtils.setCause(this, cause);\n     *    }\n     * }\n     * \u003c/pre\u003e\n     *\n     * @param target  the target \u003ccode\u003eThrowable\u003c/code\u003e\n     * @param cause  the \u003ccode\u003eThrowable\u003c/code\u003e to set in the target\n     * @return a \u003ccode\u003etrue\u003c/code\u003e if the target has been modified\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 49)",
        "(line 220,col 9)-(line 220,col 39)",
        "(line 221,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.toArray(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     * @param list a list to transform.\n     * @return the given list as a \u003ccode\u003eString[]\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseMethodNameList()",
      "begin_line": 259,
      "end_line": 263,
      "comment": "\n     * Returns {@link #CAUSE_METHOD_NAMES} as a List.\n     *\n     * @return {@link #CAUSE_METHOD_NAMES} as a List.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isCauseMethodName(java.lang.String)",
      "begin_line": 274,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003eTests if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     * objects include the given name.\u003c/p\u003e\n     * \n     * @param methodName  the methodName to search in the list.\n     * @return if the list of method names used in the search for \u003ccode\u003eThrowable\u003c/code\u003e\n     *  objects include the given name.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCause(java.lang.Throwable)",
      "begin_line": 311,
      "end_line": 315,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method searches for methods with specific names that return a \n     * \u003ccode\u003eThrowable\u003c/code\u003e object. This will pick up most wrapping exceptions,\n     * including those from JDK 1.4.\n     * The method names can be added to using {@link #addCauseMethodName(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default list searched for are:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNextException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetTargetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetSourceException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetRootCause()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetCausedByException()\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003egetNested()\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003eIn the absence of any such method, the object is inspected for a\n     * \u003ccode\u003edetail\u003c/code\u003e field assignable to a \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf none of the above is found, returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCause(java.lang.Throwable, java.lang.String[])",
      "begin_line": 335,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the cause.\u003c/p\u003e\n     *\n     * \u003col\u003e\n     * \u003cli\u003eTry known exception types.\u003c/li\u003e\n     * \u003cli\u003eTry the supplied array of method names.\u003c/li\u003e\n     * \u003cli\u003eTry the field \u0027detail\u0027.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e set of method names means use the default set.\n     * A \u003ccode\u003enull\u003c/code\u003e in the set of method names will be ignored.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to introspect for a cause, may be null\n     * @param methodNames  the method names, null treated as default set\n     * @return the cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     * @since 1.0\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 65)",
        "(line 340,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCause(java.lang.Throwable)",
      "begin_line": 380,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eIntrospects the \u003ccode\u003eThrowable\u003c/code\u003e to obtain the root cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method walks through the exception chain to the last element,\n     * \"root\" of the tree, using {@link #getCause(Throwable)}, and\n     * returns that exception.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. If the throwable parameter\n     * has a cause of itself, then null will be returned. If the throwable\n     * parameter cause chain loops, the last element in the chain before the\n     * loop is returned.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to get the root cause for, may be null\n     * @return the root cause of the \u003ccode\u003eThrowable\u003c/code\u003e,\n     *  \u003ccode\u003enull\u003c/code\u003e if none found or null throwable input\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 59)",
        "(line 382,col 9)-(line 382,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingWellKnownTypes(java.lang.Throwable)",
      "begin_line": 395,
      "end_line": 403,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e for known types.\u003c/p\u003e\n     * \n     * \u003cp\u003eUses \u003ccode\u003einstanceof\u003c/code\u003e checks to examine the exception,\n     * looking for well known types which could contain chained or\n     * wrapped exceptions.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingMethodName(java.lang.Throwable, java.lang.String)",
      "begin_line": 412,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by method name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param methodName  the name of the method to find and invoke\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 29)",
        "(line 414,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getCauseUsingFieldName(java.lang.Throwable, java.lang.String)",
      "begin_line": 443,
      "end_line": 463,
      "comment": "\n     * \u003cp\u003eFinds a \u003ccode\u003eThrowable\u003c/code\u003e by field name.\u003c/p\u003e\n     *\n     * @param throwable  the exception to examine\n     * @param fieldName  the name of the attribute to examine\n     * @return the wrapped exception, or \u003ccode\u003enull\u003c/code\u003e if not found\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 27)",
        "(line 445,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isThrowableNested()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * \u003cp\u003eChecks if the Throwable class has a \u003ccode\u003egetCause\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is true for JDK 1.4 and above.\u003c/p\u003e\n     *\n     * @return true if Throwable is nestable\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.isNestedThrowable(java.lang.Throwable)",
      "begin_line": 487,
      "end_line": 528,
      "comment": "\n     * \u003cp\u003eChecks whether this \u003ccode\u003eThrowable\u003c/code\u003e class can store a cause.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does \u003cb\u003enot\u003c/b\u003e check whether it actually does store a cause.\u003cp\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if nested otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 500,col 62)",
        "(line 501,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 525,col 9)",
        "(line 527,col 9)-(line 527,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowableCount(java.lang.Throwable)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * \u003cp\u003eCounts the number of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return \u003ccode\u003e1\u003c/code\u003e.\n     * A throwable with one cause will return \u003ccode\u003e2\u003c/code\u003e and so on.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the count of throwables, zero if null input\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowables(java.lang.Throwable)",
      "begin_line": 570,
      "end_line": 573,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return an array containing\n     * one element - the input throwable.\n     * A throwable with one cause will return an array containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return an array of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eFrom version 2.2, this method handles recursive cause structures\n     * that might otherwise cause infinite loops. The cause chain is\n     * processed until the end is reached, or until the next item in the\n     * chain is already in the result set.\u003c/p\u003e\n     *\n     * @see #getThrowableList(Throwable)\n     * @param throwable  the throwable to inspect, may be null\n     * @return the array of throwables, never null\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 59)",
        "(line 572,col 9)-(line 572,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getThrowableList(java.lang.Throwable)",
      "begin_line": 594,
      "end_line": 601,
      "comment": "\n     * \u003cp\u003eReturns the list of \u003ccode\u003eThrowable\u003c/code\u003e objects in the\n     * exception chain.\u003c/p\u003e\n     *\n     * \u003cp\u003eA throwable without cause will return a list containing\n     * one element - the input throwable.\n     * A throwable with one cause will return a list containing\n     * two elements. - the input throwable and the cause throwable.\n     * A \u003ccode\u003enull\u003c/code\u003e throwable will return a list of size zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method handles recursive cause structures that might\n     * otherwise cause infinite loops. The cause chain is processed until\n     * the end is reached, or until the next item in the chain is already\n     * in the result set.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @return the list of throwables, never null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 58)",
        "(line 596,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class\u003c?\u003e)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class (exactly) in the exception chain.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfThrowable(java.lang.Throwable, java.lang.Class\u003c?\u003e, int)",
      "begin_line": 641,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do not match - see\n     * {@link #indexOfType(Throwable, Class, int)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param clazz  the class to search for, subclasses do not match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class\u003c?\u003e)",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified class or subclass in the exception chain.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOfType(java.lang.Throwable, java.lang.Class\u003c?\u003e, int)",
      "begin_line": 685,
      "end_line": 687,
      "comment": "\n     * \u003cp\u003eReturns the (zero based) index of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type in the exception chain from\n     * a specified index.\n     * Subclasses of the specified class do match - see\n     * {@link #indexOfThrowable(Throwable, Class)} for the opposite.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e throwable returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e type returns \u003ccode\u003e-1\u003c/code\u003e.\n     * No match in the chain returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start index is treated as zero.\n     * A start index greater than the number of throwables returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @return the index into the throwable chain, -1 if no match or null input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.indexOf(java.lang.Throwable, java.lang.Class\u003c?\u003e, int, boolean)",
      "begin_line": 700,
      "end_line": 725,
      "comment": "\n     * \u003cp\u003eWorker method for the \u003ccode\u003eindexOfType\u003c/code\u003e methods.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to inspect, may be null\n     * @param type  the type to search for, subclasses match, null returns -1\n     * @param fromIndex  the (zero based) index of the starting position,\n     *  negative treated as zero, larger than chain size returns -1\n     * @param subclass if \u003ccode\u003etrue\u003c/code\u003e, compares with {@link Class#isAssignableFrom(Class)}, otherwise compares\n     * using references\n     * @return index of the \u003ccode\u003etype\u003c/code\u003e within throwables nested withing the specified \u003ccode\u003ethrowable\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 73)",
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 746,
      "end_line": 748,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable\n     * to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintStream)",
      "begin_line": 769,
      "end_line": 781,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param stream  the stream to output to, may not be null\n     * @throws IllegalArgumentException if the stream is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
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
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.printRootCauseStackTrace(java.lang.Throwable, java.io.PrintWriter)",
      "begin_line": 802,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003ePrints a compact stack trace for the root cause of a throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe compact stack trace starts with the root cause and prints\n     * stack frames up to the place where it was caught and wrapped.\n     * Then it prints the wrapped exception and continues with stack frames\n     * until the wrapper exception is caught and wrapped again, etc.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * Note that this is the opposite order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method is equivalent to \u003ccode\u003eprintStackTrace\u003c/code\u003e for throwables\n     * that don\u0027t have nested causes.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to output, may be null\n     * @param writer  the writer to output to, may not be null\n     * @throws IllegalArgumentException if the writer is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 59)",
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCauseStackTrace(java.lang.Throwable)",
      "begin_line": 830,
      "end_line": 854,
      "comment": "\n     * \u003cp\u003eCreates a compact stack trace for the root cause of the supplied\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe output of this method is consistent across JDK versions.\n     * It consists of the root exception followed by each of its wrapping\n     * exceptions separated by \u0027[wrapped]\u0027. Note that this is the opposite\n     * order to the JDK1.4 display.\u003c/p\u003e\n     *\n     * @param throwable  the throwable to examine, may be null\n     * @return an array of stack trace frames, never null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 58)",
        "(line 835,col 9)-(line 835,col 38)",
        "(line 836,col 9)-(line 836,col 54)",
        "(line 837,col 9)-(line 837,col 74)",
        "(line 838,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.removeCommonFrames(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 864,
      "end_line": 881,
      "comment": "\n     * \u003cp\u003eRemoves common frames from the cause trace given the two stack traces.\u003c/p\u003e\n     *\n     * @param causeFrames  stack trace of a cause throwable\n     * @param wrapperFrames  stack trace of a wrapper throwable\n     * @throws IllegalArgumentException if either argument is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 53)",
        "(line 869,col 9)-(line 869,col 57)",
        "(line 870,col 9)-(line 880,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getFullStackTrace(java.lang.Throwable)",
      "begin_line": 894,
      "end_line": 905,
      "comment": "\n     * \u003cp\u003eA way to get the entire nested stack-trace of an throwable.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method is highly dependent on the JDK version\n     * and whether the exceptions override printStackTrace or not.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the nested stack trace, with the root cause first\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 45)",
        "(line 896,col 9)-(line 896,col 51)",
        "(line 897,col 9)-(line 897,col 50)",
        "(line 898,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 904,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(java.lang.Throwable)",
      "begin_line": 920,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003eGets the stack trace from a Throwable as a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to be examined\n     * @return the stack trace as generated by the exception\u0027s\n     *  \u003ccode\u003eprintStackTrace(PrintWriter)\u003c/code\u003e method\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 45)",
        "(line 922,col 9)-(line 922,col 51)",
        "(line 923,col 9)-(line 923,col 38)",
        "(line 924,col 9)-(line 924,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(java.lang.Throwable)",
      "begin_line": 940,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eCaptures the stack trace associated with the specified\n     * \u003ccode\u003eThrowable\u003c/code\u003e object, decomposing it into a list of\n     * stack frames.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe result of this method vary by JDK version as this method\n     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.\n     * On JDK1.3 and earlier, the cause exception will not be shown\n     * unless the specified throwable alters printStackTrace.\u003c/p\u003e\n     *\n     * @param throwable  the \u003ccode\u003eThrowable\u003c/code\u003e to examine, may be null\n     * @return an array of strings describing each stack frame, never null\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(java.lang.String)",
      "begin_line": 956,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003eReturns an array where each element is a line from the argument.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe end of line is determined by the value of {@link SystemUtils#LINE_SEPARATOR}.\u003c/p\u003e\n     *\n     * @param stackTrace  a stack trace String\n     * @return an array where each element is a line from the argument\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 54)",
        "(line 958,col 9)-(line 958,col 76)",
        "(line 959,col 9)-(line 959,col 52)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getStackFrameList(java.lang.Throwable)",
      "begin_line": 978,
      "end_line": 996,
      "comment": "\n     * \u003cp\u003eProduces a \u003ccode\u003eList\u003c/code\u003e of stack frames - the message\n     * is not included. Only the trace of the specified exception is\n     * returned, any caused by trace is stripped.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis works in most cases - it will only fail if the exception\n     * message contains a line that starts with:\n     * \u003ccode\u003e\u0026quot;\u0026nbsp;\u0026nbsp;\u0026nbsp;at\u0026quot;.\u003c/code\u003e\u003c/p\u003e\n     * \n     * @param t is any throwable\n     * @return List of stack frames\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 45)",
        "(line 980,col 9)-(line 980,col 54)",
        "(line 981,col 9)-(line 981,col 76)",
        "(line 982,col 9)-(line 982,col 52)",
        "(line 983,col 9)-(line 983,col 37)",
        "(line 984,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getMessage(java.lang.Throwable)",
      "begin_line": 1009,
      "end_line": 1016,
      "comment": "\n     * Gets a short message summarising the exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 64)",
        "(line 1014,col 9)-(line 1014,col 37)",
        "(line 1015,col 9)-(line 1015,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionUtils.getRootCauseMessage(java.lang.Throwable)",
      "begin_line": 1029,
      "end_line": 1033,
      "comment": "\n     * Gets a short message summarising the root cause exception.\n     * \u003cp\u003e\n     * The message returned is of the form\n     * {ClassNameWithoutPackage}: {ThrowableMessage}\n     *\n     * @param th  the throwable to get a message for, null returns empty string\n     * @return the message, non-null\n     * @since Commons Lang 2.2\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 57)",
        "(line 1031,col 9)-(line 1031,col 42)",
        "(line 1032,col 9)-(line 1032,col 32)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/exception/Nestable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Nestable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 178,
      "comment": "\n * An interface to be implemented by {@link java.lang.Throwable}\n * extensions which would like to be able to nest root exceptions\n * inside themselves.\n *\n * @author Daniel L. Rall\n * @author \u003ca href\u003d\"mailto:knielsen@apache.org\"\u003eKasper Nielsen\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getCause()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Returns the reference to the exception or error that caused the\n     * exception implementing the \u003ccode\u003eNestable\u003c/code\u003e to be thrown.\n     *\n     * @return throwable that caused the original exception\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getMessage()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns the error message of this and any nested\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the error message\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getMessage(int)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Returns the error message of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain\n     * of \u003ccode\u003eThrowable\u003c/code\u003es at the specified index, numbered from 0.\n     *\n     * @param index the index of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of\n     * \u003ccode\u003eThrowable\u003c/code\u003es\n     * @return the error message, or null if the \u003ccode\u003eThrowable\u003c/code\u003e at the\n     * specified index in the chain does not contain a message\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     * negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getMessages()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Returns the error message of this and any nested \u003ccode\u003eThrowable\u003c/code\u003es\n     * in an array of Strings, one element for each message. Any\n     * \u003ccode\u003eThrowable\u003c/code\u003e not containing a message is represented in the\n     * array by a null. This has the effect of cause the length of the returned\n     * array to be equal to the result of the {@link #getThrowableCount()}\n     * operation.\n     *\n     * @return the error messages\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getThrowable(int)",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Returns the \u003ccode\u003eThrowable\u003c/code\u003e in the chain of\n     * \u003ccode\u003eThrowable\u003c/code\u003es at the specified index, numbered from 0.\n     *\n     * @param index the index, numbered from 0, of the \u003ccode\u003eThrowable\u003c/code\u003e in\n     * the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     * negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getThrowableCount()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Returns the number of nested \u003ccode\u003eThrowable\u003c/code\u003es represented by\n     * this \u003ccode\u003eNestable\u003c/code\u003e, including this \u003ccode\u003eNestable\u003c/code\u003e.\n     *\n     * @return the throwable count\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.getThrowables()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Returns this \u003ccode\u003eNestable\u003c/code\u003e and any nested \u003ccode\u003eThrowable\u003c/code\u003es\n     * in an array of \u003ccode\u003eThrowable\u003c/code\u003es, one element for each\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003es\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.indexOfThrowable(java.lang.Class)",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Returns the index, numbered from 0, of the first occurrence of the\n     * specified type, or a subclass, in the chain of \u003ccode\u003eThrowable\u003c/code\u003es.\n     * The method returns -1 if the specified type is not found in the chain.\n     * \u003cp\u003e\n     * NOTE: From v2.1, we have clarified the \u003ccode\u003eNestable\u003c/code\u003e interface\n     * such that this method matches subclasses.\n     * If you want to NOT match subclasses, please use\n     * {@link ExceptionUtils#indexOfThrowable(Throwable, Class)}\n     * (which is avaiable in all versions of lang).\n     *\n     * @param type  the type to find, subclasses match, null returns -1\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     * the type is not found\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Returns the index, numbered from 0, of the first \u003ccode\u003eThrowable\u003c/code\u003e\n     * that matches the specified type, or a subclass, in the chain of \u003ccode\u003eThrowable\u003c/code\u003es\n     * with an index greater than or equal to the specified index.\n     * The method returns -1 if the specified type is not found in the chain.\n     * \u003cp\u003e\n     * NOTE: From v2.1, we have clarified the \u003ccode\u003eNestable\u003c/code\u003e interface\n     * such that this method matches subclasses.\n     * If you want to NOT match subclasses, please use\n     * {@link ExceptionUtils#indexOfThrowable(Throwable, Class, int)}\n     * (which is avaiable in all versions of lang).\n     *\n     * @param type  the type to find, subclasses match, null returns -1\n     * @param fromIndex the index, numbered from 0, of the starting position in\n     * the chain to be searched\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     * the type is not found\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003efromIndex\u003c/code\u003e argument\n     * is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the\n     * chain\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.printStackTrace(java.io.PrintWriter)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Prints the stack trace of this exception to the specified print\n     * writer.  Includes information from the exception, if any,\n     * which caused this exception.\n     *\n     * @param out \u003ccode\u003ePrintWriter\u003c/code\u003e to use for output.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.printStackTrace(java.io.PrintStream)",
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * Prints the stack trace of this exception to the specified print\n     * stream.  Includes information from the exception, if any,\n     * which caused this exception.\n     *\n     * @param out \u003ccode\u003ePrintStream\u003c/code\u003e to use for output.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.Nestable.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n     * Prints the stack trace for this exception only--root cause not\n     * included--using the provided writer.  Used by\n     * {@link org.apache.commons.lang.exception.NestableDelegate} to write\n     * individual stack traces to a buffer.  The implementation of\n     * this method should call\n     * \u003ccode\u003esuper.printStackTrace(out);\u003c/code\u003e in most cases.\n     *\n     * @param out The writer to use.\n     ",
      "child_ranges": []
    }
  ]
}
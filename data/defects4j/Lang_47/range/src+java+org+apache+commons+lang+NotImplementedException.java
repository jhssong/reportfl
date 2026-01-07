{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/NotImplementedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotImplementedException",
      "is_interface": false,
      "parent_types": [
        "java.lang.UnsupportedOperationException",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 52,
      "end_line": 295,
      "comment": "\n * \u003cp\u003eThrown to indicate that a block of code has not been implemented.\n * This exception supplements \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e\n * by providing a more semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eNotImplementedException\u003c/code\u003e represents the case where the\n * author has yet to implement the logic at this point in the program.\n * This can act as an exception based TODO tag.\n * Because this logic might be within a catch block, this exception\n * suports exception chaining.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo() {\n *   try {\n *     // do something that throws an Exception\n *   } catch (Exception ex) {\n *     // don\u0027t know what to do here yet\n *     throw new NotImplementedException(\"TODO\", ex);\n *   }\n * }\n * \u003c/pre\u003e\n * \n * @author Matthew Hawthorne\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MESSAGE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The exception helper to delegate nested exception handling to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Holds the reference to the exception or error that caused\n     * this exception to be thrown.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with default message.\n     * \n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg  the error message.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.Throwable)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e and default message.\n     *\n     * @param cause  the exception that caused this exception to be thrown\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)",
        "(line 104,col 9)-(line 104,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.String, java.lang.Throwable)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param msg  the error message\n     * @param cause  the exception that caused this exception to be thrown\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 51)",
        "(line 117,col 9)-(line 117,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.Class)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e referencing the specified class.\n     * \n     * @param clazz\n     *            the \u003ccode\u003eClass\u003c/code\u003e that has not implemented the method\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getCause()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Gets the root cause of this exception.\n     * @return the root cause of this exception.\n     * \n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getMessage()",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n     * Gets the combined the error message of this and any nested errors.\n     *\n     * @return the error message\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getMessage(int)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n     * Returns the error message of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain\n     * of \u003ccode\u003eThrowable\u003c/code\u003es at the specified index, numbered from 0.\n     *\n     * @param index  the index of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain\n     * @return the error message, or null if the \u003ccode\u003eThrowable\u003c/code\u003e at the\n     *  specified index in the chain does not contain a message\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     *  negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the chain\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getMessages()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Returns the error message of this and any nested \u003ccode\u003eThrowable\u003c/code\u003e objects.\n     * Each throwable returns a message, a null string is included in the array if\n     * there is no message for a particular \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the error messages\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getThrowable(int)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the \u003ccode\u003eThrowable\u003c/code\u003e in the chain by index.\n     *\n     * @param index  the index to retrieve\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     *  negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the chain\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getThrowableCount()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Returns the number of nested \u003ccode\u003eThrowable\u003c/code\u003es represented by\n     * this \u003ccode\u003eNestable\u003c/code\u003e, including this \u003ccode\u003eNestable\u003c/code\u003e.\n     *\n     * @return the throwable count\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getThrowables()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Returns this \u003ccode\u003eNestable\u003c/code\u003e and any nested \u003ccode\u003eThrowable\u003c/code\u003es\n     * in an array of \u003ccode\u003eThrowable\u003c/code\u003es, one element for each\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003es\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.indexOfThrowable(java.lang.Class)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the index of the first occurrence of the specified type.\n     * If there is no match, \u003ccode\u003e-1\u003c/code\u003e is returned.\n     *\n     * @param type  the type to search for\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     *  the type is not found\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns the index of the first occurrence of the specified type starting\n     * from the specified index. If there is no match, \u003ccode\u003e-1\u003c/code\u003e is returned.\n     *\n     * @param type  the type to search for\n     * @param fromIndex  the index of the starting position in the chain to be searched\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     *  the type is not found\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003efromIndex\u003c/code\u003e argument\n     *  is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the chain\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printStackTrace()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Prints the stack trace of this exception.\n     * Includes information from the exception, if any, which caused this exception.\n     * \n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printStackTrace(java.io.PrintStream)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     * Includes information from the exception, if any, which caused this exception.\n     *\n     * @param out  the stream to write to\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Prints the stack trace of this exception to the specified writer.\n     * Includes information from the exception, if any, which caused this exception.\n     *\n     * @param out  the writer to write to\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Prints the stack trace for this exception only (root cause not included)\n     * using the specified writer.\n     * \n     * @param out  the writer to write to\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 35)"
      ]
    }
  ]
}
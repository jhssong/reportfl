{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/NotImplementedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotImplementedException",
      "is_interface": false,
      "parent_types": [
        "java.lang.UnsupportedOperationException",
        "org.apache.commons.lang.exception.Nestable"
      ],
      "begin_line": 51,
      "end_line": 290,
      "comment": "\n * \u003cp\u003eThrown to indicate that a block of code has not been implemented.\n * This exception supplements \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e\n * by providing a more semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eNotImplementedException\u003c/code\u003e represents the case where the\n * author has yet to implement the logic at this point in the program.\n * This can act as an exception based TODO tag.\n * Because this logic might be within a catch block, this exception\n * suports exception chaining.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo() {\n *   try {\n *     // do something that throws an Exception\n *   } catch (Exception ex) {\n *     // don\u0027t know what to do here yet\n *     throw new NotImplementedException(\"TODO\", ex);\n *   }\n * }\n * \u003c/pre\u003e\n * \n * @author Matthew Hawthorne\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MESSAGE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The exception helper to delegate nested exception handling to.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Holds the reference to the exception or error that caused\n     * this exception to be thrown.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with default message.\n     * \n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg  the error message.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.Throwable)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e and default message.\n     *\n     * @param cause  the exception that caused this exception to be thrown\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.String, java.lang.Throwable)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @param msg  the error message\n     * @param cause  the exception that caused this exception to be thrown\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 51)",
        "(line 112,col 9)-(line 112,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NotImplementedException.NotImplementedException(java.lang.Class)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Constructs a new \u003ccode\u003eNotImplementedException\u003c/code\u003e referencing the specified class.\n     * \n     * @param clazz\n     *            the \u003ccode\u003eClass\u003c/code\u003e that has not implemented the method\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getCause()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Gets the root cause of this exception.\n     * @return the root cause of this exception.\n     * \n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getMessage()",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\n     * Gets the combined the error message of this and any nested errors.\n     *\n     * @return the error message\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getMessage(int)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * Returns the error message of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain\n     * of \u003ccode\u003eThrowable\u003c/code\u003es at the specified index, numbered from 0.\n     *\n     * @param index  the index of the \u003ccode\u003eThrowable\u003c/code\u003e in the chain\n     * @return the error message, or null if the \u003ccode\u003eThrowable\u003c/code\u003e at the\n     *  specified index in the chain does not contain a message\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     *  negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the chain\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getMessages()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns the error message of this and any nested \u003ccode\u003eThrowable\u003c/code\u003e objects.\n     * Each throwable returns a message, a null string is included in the array if\n     * there is no message for a particular \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the error messages\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getThrowable(int)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Returns the \u003ccode\u003eThrowable\u003c/code\u003e in the chain by index.\n     *\n     * @param index  the index to retrieve\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003eindex\u003c/code\u003e argument is\n     *  negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the chain\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getThrowableCount()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Returns the number of nested \u003ccode\u003eThrowable\u003c/code\u003es represented by\n     * this \u003ccode\u003eNestable\u003c/code\u003e, including this \u003ccode\u003eNestable\u003c/code\u003e.\n     *\n     * @return the throwable count\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.getThrowables()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Returns this \u003ccode\u003eNestable\u003c/code\u003e and any nested \u003ccode\u003eThrowable\u003c/code\u003es\n     * in an array of \u003ccode\u003eThrowable\u003c/code\u003es, one element for each\n     * \u003ccode\u003eThrowable\u003c/code\u003e.\n     *\n     * @return the \u003ccode\u003eThrowable\u003c/code\u003es\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.indexOfThrowable(java.lang.Class)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * Returns the index of the first occurrence of the specified type.\n     * If there is no match, \u003ccode\u003e-1\u003c/code\u003e is returned.\n     *\n     * @param type  the type to search for\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     *  the type is not found\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.indexOfThrowable(java.lang.Class, int)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Returns the index of the first occurrence of the specified type starting\n     * from the specified index. If there is no match, \u003ccode\u003e-1\u003c/code\u003e is returned.\n     *\n     * @param type  the type to search for\n     * @param fromIndex  the index of the starting position in the chain to be searched\n     * @return index of the first occurrence of the type in the chain, or -1 if\n     *  the type is not found\n     * @throws IndexOutOfBoundsException if the \u003ccode\u003efromIndex\u003c/code\u003e argument\n     *  is negative or not less than the count of \u003ccode\u003eThrowable\u003c/code\u003es in the chain\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printStackTrace()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Prints the stack trace of this exception.\n     * Includes information from the exception, if any, which caused this exception.\n     * \n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printStackTrace(java.io.PrintStream)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Prints the stack trace of this exception to the specified stream.\n     * Includes information from the exception, if any, which caused this exception.\n     *\n     * @param out  the stream to write to\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printStackTrace(java.io.PrintWriter)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Prints the stack trace of this exception to the specified writer.\n     * Includes information from the exception, if any, which caused this exception.\n     *\n     * @param out  the writer to write to\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NotImplementedException.printPartialStackTrace(java.io.PrintWriter)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Prints the stack trace for this exception only (root cause not included)\n     * using the specified writer.\n     * \n     * @param out  the writer to write to\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 35)"
      ]
    }
  ]
}
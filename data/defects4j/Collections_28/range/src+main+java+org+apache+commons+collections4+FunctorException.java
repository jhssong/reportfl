{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/FunctorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctorException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 26,
      "end_line": 72,
      "comment": "\n * Runtime exception thrown from functors.\n * If required, a root cause error can be wrapped within this one.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FunctorException.FunctorException()",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Constructs a new \u003ccode\u003eFunctorException\u003c/code\u003e without specified\n     * detail message.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FunctorException.FunctorException(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Constructs a new \u003ccode\u003eFunctorException\u003c/code\u003e with specified\n     * detail message.\n     *\n     * @param msg  the error message.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FunctorException.FunctorException(java.lang.Throwable)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Constructs a new \u003ccode\u003eFunctorException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FunctorException.FunctorException(java.lang.String, java.lang.Throwable)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructs a new \u003ccode\u003eFunctorException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e root cause.\n     *\n     * @param msg        the error message.\n     * @param rootCause  the exception or error that caused this exception\n     *                   to be thrown.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    }
  ]
}
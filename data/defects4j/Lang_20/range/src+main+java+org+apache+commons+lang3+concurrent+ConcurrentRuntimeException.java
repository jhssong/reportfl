{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/ConcurrentRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 36,
      "end_line": 72,
      "comment": "\n * \u003cp\u003e\n * An exception class used for reporting runtime error conditions related to\n * accessing data of background tasks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class is an analogon of the {@link ConcurrentException} exception class.\n * However, it is a runtime exception and thus does not need explicit catch\n * clauses. Some methods of {@link ConcurrentUtils} throw {@code\n * ConcurrentRuntimeException} exceptions rather than\n * {@link ConcurrentException} exceptions. They can be used by client code that\n * does not want to be bothered with checked exceptions.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * The serial version UID.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentRuntimeException.ConcurrentRuntimeException()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Creates a new, uninitialized instance of {@code\n     * ConcurrentRuntimeException}.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentRuntimeException.ConcurrentRuntimeException(java.lang.Throwable)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Creates a new instance of {@code ConcurrentRuntimeException} and\n     * initializes it with the given cause.\n     *\n     * @param cause the cause of this exception\n     * @throws IllegalArgumentException if the cause is not a checked exception\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentRuntimeException.ConcurrentRuntimeException(java.lang.String, java.lang.Throwable)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Creates a new instance of {@code ConcurrentRuntimeException} and\n     * initializes it with the given message and cause.\n     *\n     * @param msg the error message\n     * @param cause the cause of this exception\n     * @throws IllegalArgumentException if the cause is not a checked exception\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 60)"
      ]
    }
  ]
}
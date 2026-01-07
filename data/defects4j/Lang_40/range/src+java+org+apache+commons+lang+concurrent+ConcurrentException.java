{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/concurrent/ConcurrentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 34,
      "end_line": 69,
      "comment": "\n * \u003cp\u003e\n * An exception class used for reporting error conditions related to accessing\n * data of background tasks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The purpose of this exception class is analogous to the default JDK exception\n * class {@link java.util.concurrent.ExecutionException}, i.e. it wraps an\n * exception that occurred during the execution of a task. However, in contrast\n * to {@code ExecutionException}, it wraps only checked exceptions. Runtime\n * exceptions are thrown directly.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * The serial version UID.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentException.ConcurrentException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Creates a new, uninitialized instance of {@code ConcurrentException}.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentException.ConcurrentException(java.lang.Throwable)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Creates a new instance of {@code ConcurrentException} and initializes it\n     * with the given cause.\n     *\n     * @param cause the cause of this exception\n     * @throws IllegalArgumentException if the cause is not a checked exception\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentException.ConcurrentException(java.lang.String, java.lang.Throwable)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Creates a new instance of {@code ConcurrentException} and initializes it\n     * with the given message and cause.\n     *\n     * @param msg the error message\n     * @param cause the cause of this exception\n     * @throws IllegalArgumentException if the cause is not a checked exception\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)"
      ]
    }
  ]
}
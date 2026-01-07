{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/concurrent/ConcurrentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 35,
      "end_line": 70,
      "comment": "\n * \u003cp\u003e\n * An exception class used for reporting error conditions related to accessing\n * data of background tasks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The purpose of this exception class is analogous to the default JDK exception\n * class {@link java.util.concurrent.ExecutionException}, i.e. it wraps an\n * exception that occurred during the execution of a task. However, in contrast\n * to {@code ExecutionException}, it wraps only checked exceptions. Runtime\n * exceptions are thrown directly.\n * \u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * The serial version UID.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentException.ConcurrentException()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a new, uninitialized instance of {@code ConcurrentException}.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentException.ConcurrentException(java.lang.Throwable)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Creates a new instance of {@code ConcurrentException} and initializes it\n     * with the given cause.\n     *\n     * @param cause the cause of this exception\n     * @throws IllegalArgumentException if the cause is not a checked exception\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentException.ConcurrentException(java.lang.String, java.lang.Throwable)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Creates a new instance of {@code ConcurrentException} and initializes it\n     * with the given message and cause.\n     *\n     * @param msg the error message\n     * @param cause the cause of this exception\n     * @throws IllegalArgumentException if the cause is not a checked exception\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 60)"
      ]
    }
  ]
}
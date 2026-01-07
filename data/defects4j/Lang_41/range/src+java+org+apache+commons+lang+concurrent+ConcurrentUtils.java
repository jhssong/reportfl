{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/concurrent/ConcurrentUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 119,
      "comment": "\n * \u003cp\u003e\n * An utility class providing functionality related to the {@code\n * java.util.concurrent} package.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtils.ConcurrentUtils()",
      "begin_line": 34,
      "end_line": 35,
      "comment": "\n     * Private constructor so that no instances can be created. This class\n     * contains only static utility methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtils.extractCause(java.util.concurrent.ExecutionException)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n     * Inspects the cause of the specified {@code ExecutionException} and\n     * creates a {@code ConcurrentException} with the checked cause if\n     * necessary. This method performs the following checks on the cause of the\n     * passed in exception:\n     * \u003cul\u003e\n     * \u003cli\u003eIf the passed in exception is \u003cb\u003enull\u003c/b\u003e or the cause is\n     * \u003cb\u003enull\u003c/b\u003e, this method returns \u003cb\u003enull\u003c/b\u003e.\u003c/li\u003e\n     * \u003cli\u003eIf the cause is a runtime exception, it is directly thrown.\u003c/li\u003e\n     * \u003cli\u003eIf the cause is an error, it is directly thrown, too.\u003c/li\u003e\n     * \u003cli\u003eIn any other case the cause is a checked exception. The method then\n     * creates a {@link ConcurrentException}, initializes it with the cause, and\n     * returns it.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param ex the exception to be processed\n     * @return a {@code ConcurrentException} with the checked cause\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 60,col 9)-(line 60,col 23)",
        "(line 61,col 9)-(line 61,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtils.handleCause(java.util.concurrent.ExecutionException)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\n     * Handles the specified {@code ExecutionException}. This method calls\n     * {@link #extractCause(ExecutionException)} for obtaining the cause of the\n     * exception - which might already cause an unchecked exception or an error\n     * being thrown. If the cause is a checked exception however, it is wrapped\n     * in a {@code ConcurrentException}, which is thrown. If the passed in\n     * exception is \u003cb\u003enull\u003c/b\u003e or has no cause, the method simply returns\n     * without throwing an exception.\n     *\n     * @param ex the exception to be handled\n     * @throws ConcurrentException if the cause of the {@code\n     * ExecutionException} is a checked exception\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 51)",
        "(line 81,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtils.checkedException(java.lang.Throwable)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Tests whether the specified {@code Throwable} is a checked exception. If\n     * not, an exception is thrown.\n     *\n     * @param ex the {@code Throwable} to check\n     * @return a flag whether the passed in exception is a checked exception\n     * @throws IllegalArgumentException if the {@code Throwable} is not a\n     * checked exception\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtils.throwCause(java.util.concurrent.ExecutionException)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "\n     * Tests whether the cause of the specified {@code ExecutionException}\n     * should be thrown and does it if necessary.\n     *\n     * @param ex the exception in question\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 117,col 9)"
      ]
    }
  ]
}
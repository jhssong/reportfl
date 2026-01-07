{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 172,
      "comment": "\n * \u003cp\u003e\n * An utility class providing functionality related to the {@code\n * java.util.concurrent} package.\n * \u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConcurrentUtils()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n     * Private constructor so that no instances can be created. This class\n     * contains only static utility methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCause(java.util.concurrent.ExecutionException)",
      "begin_line": 59,
      "end_line": 66,
      "comment": "\n     * Inspects the cause of the specified {@code ExecutionException} and\n     * creates a {@code ConcurrentException} with the checked cause if\n     * necessary. This method performs the following checks on the cause of the\n     * passed in exception:\n     * \u003cul\u003e\n     * \u003cli\u003eIf the passed in exception is \u003cb\u003enull\u003c/b\u003e or the cause is\n     * \u003cb\u003enull\u003c/b\u003e, this method returns \u003cb\u003enull\u003c/b\u003e.\u003c/li\u003e\n     * \u003cli\u003eIf the cause is a runtime exception, it is directly thrown.\u003c/li\u003e\n     * \u003cli\u003eIf the cause is an error, it is directly thrown, too.\u003c/li\u003e\n     * \u003cli\u003eIn any other case the cause is a checked exception. The method then\n     * creates a {@link ConcurrentException}, initializes it with the cause, and\n     * returns it.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param ex the exception to be processed\n     * @return a {@code ConcurrentException} with the checked cause\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 23)",
        "(line 65,col 9)-(line 65,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(java.util.concurrent.ExecutionException)",
      "begin_line": 81,
      "end_line": 88,
      "comment": "\n     * Handles the specified {@code ExecutionException}. This method calls\n     * {@link #extractCause(ExecutionException)} for obtaining the cause of the\n     * exception - which might already cause an unchecked exception or an error\n     * being thrown. If the cause is a checked exception however, it is wrapped\n     * in a {@code ConcurrentException}, which is thrown. If the passed in\n     * exception is \u003cb\u003enull\u003c/b\u003e or has no cause, the method simply returns\n     * without throwing an exception.\n     *\n     * @param ex the exception to be handled\n     * @throws ConcurrentException if the cause of the {@code\n     * ExecutionException} is a checked exception\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 51)",
        "(line 85,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(java.lang.Throwable)",
      "begin_line": 99,
      "end_line": 106,
      "comment": "\n     * Tests whether the specified {@code Throwable} is a checked exception. If\n     * not, an exception is thrown.\n     *\n     * @param ex the {@code Throwable} to check\n     * @return a flag whether the passed in exception is a checked exception\n     * @throws IllegalArgumentException if the {@code Throwable} is not a\n     * checked exception\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(java.util.concurrent.ExecutionException)",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\n     * Tests whether the cause of the specified {@code ExecutionException}\n     * should be thrown and does it if necessary.\n     *\n     * @param ex the exception in question\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(T)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003e\n     * Gets an implementation of \u003ccode\u003eFuture\u003c/code\u003e that is immediately done\n     * and returns the specified constant value.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This can be useful to return a simple constant immediately from the\n     * concurrent processing, perhaps as part of avoiding nulls.\n     * A constant future can also be useful in testing.\n     * \u003c/p\u003e\n     * \n     * @param value  the constant value to return, may be null\n     * @return an instance of Future that will return the value, never null\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantFuture",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Future\u003cT\u003e"
      ],
      "begin_line": 143,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The constant value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.ConstantFuture(T)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.isDone()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.get()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.get(long, java.util.concurrent.TimeUnit)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.isCancelled()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.cancel(boolean)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 25)"
      ]
    }
  ]
}
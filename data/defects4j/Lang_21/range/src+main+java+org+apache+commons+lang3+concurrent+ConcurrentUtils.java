{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 255,
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
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.extractCauseUnchecked(java.util.concurrent.ExecutionException)",
      "begin_line": 80,
      "end_line": 88,
      "comment": "\n     * Inspects the cause of the specified {@code ExecutionException} and\n     * creates a {@code ConcurrentRuntimeException} with the checked cause if\n     * necessary. This method works exactly like\n     * {@link #extractCause(ExecutionException)}. The only difference is that\n     * the cause of the specified {@code ExecutionException} is extracted as a\n     * runtime exception. This is an alternative for client code that does not\n     * want to deal with checked exceptions.\n     *\n     * @param ex the exception to be processed\n     * @return a {@code ConcurrentRuntimeException} with the checked cause\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 23)",
        "(line 87,col 9)-(line 87,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCause(java.util.concurrent.ExecutionException)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Handles the specified {@code ExecutionException}. This method calls\n     * {@link #extractCause(ExecutionException)} for obtaining the cause of the\n     * exception - which might already cause an unchecked exception or an error\n     * being thrown. If the cause is a checked exception however, it is wrapped\n     * in a {@code ConcurrentException}, which is thrown. If the passed in\n     * exception is \u003cb\u003enull\u003c/b\u003e or has no cause, the method simply returns\n     * without throwing an exception.\n     *\n     * @param ex the exception to be handled\n     * @throws ConcurrentException if the cause of the {@code\n     * ExecutionException} is a checked exception\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 51)",
        "(line 107,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.handleCauseUnchecked(java.util.concurrent.ExecutionException)",
      "begin_line": 125,
      "end_line": 131,
      "comment": "\n     * Handles the specified {@code ExecutionException} and transforms it into a\n     * runtime exception. This method works exactly like\n     * {@link #handleCause(ExecutionException)}, but instead of a\n     * {@link ConcurrentException} it throws a\n     * {@link ConcurrentRuntimeException}. This is an alternative for client\n     * code that does not want to deal with checked exceptions.\n     *\n     * @param ex the exception to be handled\n     * @throws ConcurrentRuntimeException if the cause of the {@code\n     * ExecutionException} is a checked exception; this exception is then\n     * wrapped in the thrown runtime exception\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 68)",
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(java.lang.Throwable)",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\n     * Tests whether the specified {@code Throwable} is a checked exception. If\n     * not, an exception is thrown.\n     *\n     * @param ex the {@code Throwable} to check\n     * @return a flag whether the passed in exception is a checked exception\n     * @throws IllegalArgumentException if the {@code Throwable} is not a\n     * checked exception\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.throwCause(java.util.concurrent.ExecutionException)",
      "begin_line": 157,
      "end_line": 165,
      "comment": "\n     * Tests whether the cause of the specified {@code ExecutionException}\n     * should be thrown and does it if necessary.\n     *\n     * @param ex the exception in question\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.initialize(org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Invokes the specified {@code ConcurrentInitializer} and returns the\n     * object produced by the initializer. This method just invokes the {@code\n     * get()} method of the given {@code ConcurrentInitializer}. It is\n     * \u003cb\u003enull\u003c/b\u003e-safe: if the argument is \u003cb\u003enull\u003c/b\u003e, result is also\n     * \u003cb\u003enull\u003c/b\u003e.\n     *\n     * @param \u003cT\u003e the type of the object produced by the initializer\n     * @param initializer the {@code ConcurrentInitializer} to be invoked\n     * @return the object managed by the {@code ConcurrentInitializer}\n     * @throws ConcurrentException if the {@code ConcurrentInitializer} throws\n     * an exception\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.initializeUnchecked(org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e)",
      "begin_line": 199,
      "end_line": 205,
      "comment": "\n     * Invokes the specified {@code ConcurrentInitializer} and transforms\n     * occurring exceptions to runtime exceptions. This method works like\n     * {@link #initialize(ConcurrentInitializer)}, but if the {@code\n     * ConcurrentInitializer} throws a {@link ConcurrentException}, it is\n     * caught, and the cause is wrapped in a {@link ConcurrentRuntimeException}.\n     * So client code does not have to deal with checked exceptions.\n     *\n     * @param \u003cT\u003e the type of the object produced by the initializer\n     * @param initializer the {@code ConcurrentInitializer} to be invoked\n     * @return the object managed by the {@code ConcurrentInitializer}\n     * @throws ConcurrentRuntimeException if the initializer throws an exception\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.constantFuture(T)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003e\n     * Gets an implementation of \u003ccode\u003eFuture\u003c/code\u003e that is immediately done\n     * and returns the specified constant value.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This can be useful to return a simple constant immediately from the\n     * concurrent processing, perhaps as part of avoiding nulls.\n     * A constant future can also be useful in testing.\n     * \u003c/p\u003e\n     *\n     * @param value  the constant value to return, may be null\n     * @return an instance of Future that will return the value, never null\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantFuture",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Future\u003cT\u003e"
      ],
      "begin_line": 226,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " The constant value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.ConstantFuture(T)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.isDone()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.get()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.get(long, java.util.concurrent.TimeUnit)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.isCancelled()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtils.ConstantFuture.cancel(boolean)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 25)"
      ]
    }
  ]
}
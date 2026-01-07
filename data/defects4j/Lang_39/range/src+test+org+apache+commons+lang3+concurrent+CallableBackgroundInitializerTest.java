{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/concurrent/CallableBackgroundInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallableBackgroundInitializerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 99,
      "comment": "\n * Test class for {@code CallableBackgroundInitializer}\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RESULT"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Constant for the result of the call() invocation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitNullCallable()",
      "begin_line": 38,
      "end_line": 45,
      "comment": "\n     * Tries to create an instance without a Callable. This should cause an\n     * exception.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 44,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitExecutor()",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Tests whether the executor service is correctly passed to the super\n     * class.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 67)",
        "(line 53,col 9)-(line 54,col 42)",
        "(line 55,col 9)-(line 55,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitExecutorNullCallable()",
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n     * Tries to pass a null Callable to the constructor that takes an executor.\n     * This should cause an exception.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 67)",
        "(line 64,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitialize()",
      "begin_line": 75,
      "end_line": 81,
      "comment": "\n     * Tests the implementation of initialize().\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 78,col 22)",
        "(line 79,col 9)-(line 79,col 64)",
        "(line 80,col 9)-(line 80,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestCallable",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 87,
      "end_line": 98,
      "comment": "\n     * A test Callable implementation for checking the initializer\u0027s\n     * implementation of the initialize() method.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "callCount"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " A counter for the number of call() invocations. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.TestCallable.call()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n         * Records this invocation and returns the test result.\n         ",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 24)",
        "(line 96,col 13)-(line 96,col 26)"
      ]
    }
  ]
}
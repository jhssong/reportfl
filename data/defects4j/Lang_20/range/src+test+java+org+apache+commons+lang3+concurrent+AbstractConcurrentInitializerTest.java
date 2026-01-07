{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/AbstractConcurrentInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConcurrentInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 115,
      "comment": "\n * \u003cp\u003e\n * An abstract base class for tests of concrete {@code ConcurrentInitializer}\n * implementations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class provides some basic tests for initializer implementations. Derived\n * class have to create a {@link ConcurrentInitializer} object on which the\n * tests are executed.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGet()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Tests a simple invocation of the get() method.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGetMultipleTimes()",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * Tests whether sequential get() invocations always return the same\n     * instance.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 72)",
        "(line 55,col 9)-(line 55,col 39)",
        "(line 56,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGetConcurrent()",
      "begin_line": 65,
      "end_line": 106,
      "comment": "\n     * Tests whether get() can be invoked from multiple threads concurrently.\n     * Always the same object should be returned.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 78)",
        "(line 69,col 9)-(line 69,col 35)",
        "(line 70,col 9)-(line 70,col 64)",
        "(line 71,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 96,col 9)-(line 96,col 31)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 102,col 49)",
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetThread",
      "is_interface": false,
      "parent_types": [
        "java.lang.Thread"
      ],
      "begin_line": 71,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.GetThread.run()",
      "begin_line": 74,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 76,col 17)-(line 85,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.createInitializer()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Creates the {@link ConcurrentInitializer} object to be tested. This\n     * method is called whenever the test fixture needs to be obtained.\n     *\n     * @return the initializer object to be tested\n     ",
      "child_ranges": []
    }
  ]
}
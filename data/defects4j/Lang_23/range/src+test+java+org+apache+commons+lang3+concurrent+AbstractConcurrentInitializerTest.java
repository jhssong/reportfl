{
  "filepath": "/tmp/Lang-23b/src/test/java/org/apache/commons/lang3/concurrent/AbstractConcurrentInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractConcurrentInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 116,
      "comment": "\n * \u003cp\u003e\n * An abstract base class for tests of concrete {@code ConcurrentInitializer}\n * implementations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class provides some basic tests for initializer implementations. Derived\n * class have to create a {@link ConcurrentInitializer} object on which the\n * tests are executed.\n * \u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGet()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Tests a simple invocation of the get() method.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGetMultipleTimes()",
      "begin_line": 53,
      "end_line": 60,
      "comment": "\n     * Tests whether sequential get() invocations always return the same\n     * instance.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 72)",
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.testGetConcurrent()",
      "begin_line": 66,
      "end_line": 107,
      "comment": "\n     * Tests whether get() can be invoked from multiple threads concurrently.\n     * Always the same object should be returned.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 78)",
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 71,col 64)",
        "(line 72,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 97,col 31)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 103,col 9)-(line 103,col 49)",
        "(line 104,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetThread",
      "is_interface": false,
      "parent_types": [
        "java.lang.Thread"
      ],
      "begin_line": 72,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.GetThread.run()",
      "begin_line": 75,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 77,col 17)-(line 86,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AbstractConcurrentInitializerTest.createInitializer()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Creates the {@link ConcurrentInitializer} object to be tested. This\n     * method is called whenever the test fixture needs to be obtained.\n     *\n     * @return the initializer object to be tested\n     ",
      "child_ranges": []
    }
  ]
}
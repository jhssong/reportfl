{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/concurrent/LazyInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazyInitializerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 109,
      "comment": "\n * Test class for {@code LazyInitializer}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "initializer"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " The initializer to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.setUp()",
      "begin_line": 32,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 22)",
        "(line 35,col 9)-(line 35,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.testGet()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Tests obtaining the managed object.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.testGetMultipleTimes()",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Tests whether sequential get() invocations always return the same\n     * instance.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)",
        "(line 51,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.testGetConcurrent()",
      "begin_line": 59,
      "end_line": 95,
      "comment": "\n     * Tests invoking get() from multiple threads concurrently.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 35)",
        "(line 61,col 9)-(line 61,col 64)",
        "(line 62,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 57)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 85,col 9)-(line 85,col 31)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 91,col 9)-(line 91,col 49)",
        "(line 92,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetThread",
      "is_interface": false,
      "parent_types": [
        "java.lang.Thread"
      ],
      "begin_line": 62,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.GetThread.run()",
      "begin_line": 65,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 67,col 17)-(line 74,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyInitializerTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.LazyInitializer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 102,
      "end_line": 108,
      "comment": "\n     * A test implementation of LazyInitializer. This class creates a plain\n     * Object. As Object does not provide a specific equals() method, it is easy\n     * to check whether multiple instances were created.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializerTest.LazyInitializerTestImpl.initialize()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 32)"
      ]
    }
  ]
}
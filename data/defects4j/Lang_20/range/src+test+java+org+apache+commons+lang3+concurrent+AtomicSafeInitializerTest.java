{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/AtomicSafeInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AtomicSafeInitializerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractConcurrentInitializerTest"
      ],
      "begin_line": 31,
      "end_line": 78,
      "comment": "\n * Test class for {@code AtomicSafeInitializer}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "initializer"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The instance to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.setUp()",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.createInitializer()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Returns the initializer to be tested.\n     *\n     * @return the {@code AtomicSafeInitializer} under test\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.testNumberOfInitializeInvocations()",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     * Tests that initialize() is called only once.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 28)",
        "(line 58,col 9)-(line 59,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AtomicSafeInitializerTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.AtomicSafeInitializer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 67,
      "end_line": 77,
      "comment": "\n     * A concrete test implementation of {@code AtomicSafeInitializer}. This\n     * implementation also counts the number of invocations of the initialize()\n     * method.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initCounter"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " A counter for initialize() invocations. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.AtomicSafeInitializerTestImpl.initialize()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 42)",
        "(line 75,col 13)-(line 75,col 32)"
      ]
    }
  ]
}
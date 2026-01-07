{
  "filepath": "/tmp/Lang-21b/src/test/java/org/apache/commons/lang3/concurrent/AtomicSafeInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AtomicSafeInitializerTest",
      "is_interface": false,
      "parent_types": [
        "AbstractConcurrentInitializerTest"
      ],
      "begin_line": 32,
      "end_line": 79,
      "comment": "\n * Test class for {@code AtomicSafeInitializer}.\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "initializer"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The instance to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.setUp()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.createInitializer()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Returns the initializer to be tested.\n     *\n     * @return the {@code AtomicSafeInitializer} under test\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.testNumberOfInitializeInvocations()",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Tests that initialize() is called only once.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 28)",
        "(line 59,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AtomicSafeInitializerTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.AtomicSafeInitializer\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 68,
      "end_line": 78,
      "comment": "\n     * A concrete test implementation of {@code AtomicSafeInitializer}. This\n     * implementation also counts the number of invocations of the initialize()\n     * method.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initCounter"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " A counter for initialize() invocations. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializerTest.AtomicSafeInitializerTestImpl.initialize()",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 42)",
        "(line 76,col 13)-(line 76,col 32)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/functors/AbstractMockPredicateTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMockPredicateTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 103,
      "comment": "\n * Base class for tests of predicates which delegate to other predicates when evaluating an object.  This class\n * provides methods to create and verify mock predicates to which to delegate.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockPredicatesToVerify"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Mock predicates created by a single test case which need to be verified after the test completes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "testValue"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The value to pass to mocks.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AbstractMockPredicateTest.AbstractMockPredicateTest(T)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Creates a new \u003ccode\u003ePredicateTestBase\u003c/code\u003e.\n     *\n     * @param testValue the value to pass to mock predicates.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractMockPredicateTest.createVerifyList()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Creates the list of predicates to verify.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractMockPredicateTest.verifyPredicates()",
      "begin_line": 68,
      "end_line": 74,
      "comment": "\n     * Verifies all the mock predicates created for the test.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractMockPredicateTest.getTestValue()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Gets the value which will be passed to the mock predicates.\n     *\n     * @return the test value.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractMockPredicateTest.createMockPredicate(java.lang.Boolean)",
      "begin_line": 92,
      "end_line": 102,
      "comment": "\n     * Creates a single mock predicate.\n     *\n     * @param returnValue the return value for the mock predicate, or null if the mock is not expected to be called.\n     *\n     * @return a single mock predicate.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 80)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 30)",
        "(line 99,col 9)-(line 99,col 50)",
        "(line 101,col 9)-(line 101,col 29)"
      ]
    }
  ]
}
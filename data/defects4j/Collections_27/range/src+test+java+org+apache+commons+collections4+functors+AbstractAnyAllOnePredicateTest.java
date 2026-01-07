{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/functors/AbstractAnyAllOnePredicateTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractAnyAllOnePredicateTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCompositePredicateTest\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 81,
      "comment": "\n * Base class for tests of AnyPredicate, AllPredicate, and OnePredicate.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AbstractAnyAllOnePredicateTest.AbstractAnyAllOnePredicateTest(T)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Creates a new \u003ccode\u003eTestCompositePredicate\u003c/code\u003e.\n     *\n     * @param testValue the value which the mock predicates should expect to see (may be null).\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractAnyAllOnePredicateTest.singleElementArrayToGetInstance()",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * Tests whether \u003ccode\u003egetInstance\u003c/code\u003e with a one element array returns the first element in the array.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 65)",
        "(line 53,col 9)-(line 53,col 74)",
        "(line 54,col 9)-(line 54,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractAnyAllOnePredicateTest.singletonCollectionToGetInstance()",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * Tests that passing a singleton collection to \u003ccode\u003egetInstance\u003c/code\u003e returns the single element in the\n     * collection.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 65)",
        "(line 65,col 9)-(line 66,col 64)",
        "(line 67,col 9)-(line 68,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractAnyAllOnePredicateTest.singleValues()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Tests creating composite predicate instances with single predicates and verifies that the composite returns\n     * the same value as the single predicate does. \n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 62)",
        "(line 78,col 9)-(line 78,col 64)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/functors/AbstractCompositePredicateTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCompositePredicateTest",
      "is_interface": false,
      "parent_types": [
        "AbstractMockPredicateTest\u003cT\u003e"
      ],
      "begin_line": 34,
      "end_line": 145,
      "comment": "\n * Base class for tests of composite predicates.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.AbstractCompositePredicateTest(T)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Creates a new \u003ccode\u003eTestCompositePredicate\u003c/code\u003e.\n     *\n     * @param testValue the value which the mock predicates should expect to see (may be null).\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.getPredicateInstance(org.apache.commons.collections4.Predicate\u003c? super T\u003e...)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Creates an instance of the predicate to test.\n     *\n     * @param predicates the arguments to \u003ccode\u003egetInstance\u003c/code\u003e.\n     *\n     * @return a predicate to test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.getPredicateInstance(java.util.Collection\u003corg.apache.commons.collections4.Predicate\u003cT\u003e\u003e)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Creates an instance of the predicate to test.\n     *\n     * @param predicates the argument to \u003ccode\u003egetInstance\u003c/code\u003e.\n     *\n     * @return a predicate to test.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.getPredicateInstance(java.lang.Boolean...)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * Creates an instance of the predicate to test.\n     *\n     * @param mockReturnValues the return values for the mock predicates, or null if that mock is not expected\n     *                         to be called\n     *\n     * @return a predicate to test.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 76)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.singleElementArrayToGetInstance()",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * Tests whether \u003ccode\u003egetInstance\u003c/code\u003e with a one element array returns the first element in the array.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 65)",
        "(line 85,col 9)-(line 85,col 74)",
        "(line 86,col 9)-(line 86,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.singletonCollectionToGetInstance()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n     * Tests that passing a singleton collection to \u003ccode\u003egetInstance\u003c/code\u003e returns the single element in the\n     * collection.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 65)",
        "(line 95,col 9)-(line 96,col 64)",
        "(line 97,col 9)-(line 97,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.nullArrayToGetInstance()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Tests \u003ccode\u003egetInstance\u003c/code\u003e with a null predicate array.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.nullElementInArrayToGetInstance()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Tests \u003ccode\u003egetInstance\u003c/code\u003e with a single null element in the predicate array.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.nullElementsInArrayToGetInstance()",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Tests \u003ccode\u003egetInstance\u003c/code\u003e with two null elements in the predicate array.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.nullCollectionToGetInstance()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Tests \u003ccode\u003egetInstance\u003c/code\u003e with a null predicate collection\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AbstractCompositePredicateTest.nullElementsInCollectionToGetInstance()",
      "begin_line": 138,
      "end_line": 144,
      "comment": "\n     * Tests \u003ccode\u003egetInstance\u003c/code\u003e with a predicate collection that contains null elements\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 76)",
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 35)"
      ]
    }
  ]
}
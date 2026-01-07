{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/functors/AllPredicateTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AllPredicateTest",
      "is_interface": false,
      "parent_types": [
        "AbstractAnyAllOnePredicateTest\u003cInteger\u003e"
      ],
      "begin_line": 35,
      "end_line": 135,
      "comment": "\n * Tests the org.apache.commons.collections.functors.AllPredicate class.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.AllPredicateTest()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Creates a new \u003ccode\u003eTestAllPredicate\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.getPredicateInstance(org.apache.commons.collections4.Predicate\u003c? super java.lang.Integer\u003e...)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.getPredicateInstance(java.util.Collection\u003corg.apache.commons.collections4.Predicate\u003cjava.lang.Integer\u003e\u003e)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.emptyArrayToGetInstance()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Verifies that providing an empty predicate array evaluates to true.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.emptyCollectionToGetInstance()",
      "begin_line": 73,
      "end_line": 78,
      "comment": "\n     * Verifies that providing an empty predicate collection evaluates to true.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 61)",
        "(line 77,col 9)-(line 77,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.oneTruePredicate()",
      "begin_line": 83,
      "end_line": 92,
      "comment": "\n     * Tests whether a single true predicate evaluates to true.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 71)",
        "(line 90,col 9)-(line 91,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.oneFalsePredicate()",
      "begin_line": 97,
      "end_line": 105,
      "comment": "\n     * Tests whether a single false predicate evaluates to true.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 72)",
        "(line 103,col 9)-(line 104,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.allTrue()",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Tests whether multiple true predicates evaluates to true.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 113,col 75)",
        "(line 114,col 9)-(line 115,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.AllPredicateTest.trueAndFalseCombined()",
      "begin_line": 122,
      "end_line": 134,
      "comment": "\n     * Tests whether combining some true and one false evalutes to false.  Also verifies that only the first\n     * false predicate is actually evaluated\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 125,col 76)",
        "(line 126,col 9)-(line 127,col 82)",
        "(line 128,col 9)-(line 129,col 82)",
        "(line 130,col 9)-(line 131,col 82)",
        "(line 132,col 9)-(line 133,col 88)"
      ]
    }
  ]
}
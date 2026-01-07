{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/bag/CollectionSortedBagTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionSortedBagTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cT\u003e"
      ],
      "begin_line": 38,
      "end_line": 159,
      "comment": "\n * Test class for {@link CollectionSortedBag}.\n * \u003cp\u003e\n * Note: This test is mainly for serialization support, the CollectionSortedBag decorator\n * is extensively used and tested in AbstractSortedBagTest. \n *\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.CollectionSortedBagTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.isNullSupported()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Overridden because SortedBags don\u0027t allow null elements (normally).\n     * @return false\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.makeObject()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.makeConfirmedCollection()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Returns an empty List for use in modification testing.\n     *\n     * @return a confirmed empty collection\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.makeConfirmedFullCollection()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Returns a full Set for use in modification testing.\n     *\n     * @return a confirmed full collection\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 53)",
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.getFullNonNullElements()",
      "begin_line": 91,
      "end_line": 100,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 49)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.getOtherNonNullElements()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * Override to return comparable objects.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 49)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.getCompatibilityVersion()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.testEmptyBagCompatibility()",
      "begin_line": 135,
      "end_line": 143,
      "comment": "\n     * Compare the current serialized form of the Bag\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 40)",
        "(line 138,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionSortedBagTest.testFullBagCompatibility()",
      "begin_line": 149,
      "end_line": 157,
      "comment": "\n     * Compare the current serialized form of the Bag\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 69)",
        "(line 152,col 9)-(line 156,col 9)"
      ]
    }
  ]
}
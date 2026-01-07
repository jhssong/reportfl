{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/bag/CollectionBagTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionBagTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cT\u003e"
      ],
      "begin_line": 37,
      "end_line": 119,
      "comment": "\n * Test class for {@link CollectionBag}.\n * \u003cp\u003e\n * Note: This test is mainly for serialization support, the CollectionBag decorator\n * is extensively used and tested in AbstractBagTest. \n *\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.CollectionBagTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.makeObject()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.makeConfirmedCollection()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Returns an empty List for use in modification testing.\n     *\n     * @return a confirmed empty collection\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.makeConfirmedFullCollection()",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Returns a full Set for use in modification testing.\n     *\n     * @return a confirmed full collection\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 73,col 53)",
        "(line 74,col 9)-(line 74,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.getCompatibilityVersion()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.testEmptyBagCompatibility()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "\n     * Compare the current serialized form of the Bag\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.CollectionBagTest.testFullBagCompatibility()",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * Compare the current serialized form of the Bag\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 57)",
        "(line 112,col 9)-(line 116,col 9)"
      ]
    }
  ]
}
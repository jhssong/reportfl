{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/iterators/AbstractOrderedMapIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOrderedMapIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractMapIteratorTest\u003cK,V\u003e"
      ],
      "begin_line": 40,
      "end_line": 166,
      "comment": "\n * Abstract class for testing the OrderedMapIterator interface.\n * \u003cp\u003e\n * This class provides a framework for testing an implementation of MapIterator.\n * Concrete subclasses must provide the list iterator to be tested.\n * They must also specify certain details of how the list iterator operates by\n * overriding the supportsXxx() methods if necessary.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest.AbstractOrderedMapIteratorTest(java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest.makeEmptyIterator()",
      "begin_line": 52,
      "end_line": 53,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest.makeObject()",
      "begin_line": 55,
      "end_line": 56,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest.testEmptyMapIterator()",
      "begin_line": 62,
      "end_line": 76,
      "comment": "\n     * Test that the empty list iterator contract is correct.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 68,col 9)-(line 68,col 37)",
        "(line 70,col 9)-(line 70,col 64)",
        "(line 71,col 9)-(line 71,col 46)",
        "(line 72,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest.testFullMapIterator()",
      "begin_line": 82,
      "end_line": 132,
      "comment": "\n     * Test that the full list iterator contract is correct.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 36)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 91,col 39)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 44)",
        "(line 96,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorTest.testMapIteratorOrder()",
      "begin_line": 138,
      "end_line": 164,
      "comment": "\n     * Test that the iterator order matches the keySet order.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 57)",
        "(line 144,col 9)-(line 144,col 39)",
        "(line 146,col 9)-(line 146,col 112)",
        "(line 148,col 9)-(line 148,col 56)",
        "(line 149,col 9)-(line 149,col 41)",
        "(line 150,col 9)-(line 150,col 42)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 46)",
        "(line 158,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 37)"
      ]
    }
  ]
}
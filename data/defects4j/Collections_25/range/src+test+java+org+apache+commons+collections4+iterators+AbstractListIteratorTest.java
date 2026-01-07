{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/iterators/AbstractListIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIteratorTest\u003cE\u003e"
      ],
      "begin_line": 34,
      "end_line": 269,
      "comment": "\n * Abstract class for testing the ListIterator interface.\n * \u003cp\u003e\n * This class provides a framework for testing an implementation of ListIterator.\n * Concrete subclasses must provide the list iterator to be tested.\n * They must also specify certain details of how the list iterator operates by\n * overriding the supportsXxx() methods if necessary.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.AbstractListIteratorTest(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.makeEmptyIterator()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * Implements the abstract superclass method to return the list iterator.\n     *\n     * @return an empty iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.makeObject()",
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * Implements the abstract superclass method to return the list iterator.\n     *\n     * @return a full iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.supportsAdd()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Whether or not we are testing an iterator that supports add().\n     * Default is true.\n     *\n     * @return true if Iterator supports add\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.supportsSet()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Whether or not we are testing an iterator that supports set().\n     * Default is true.\n     *\n     * @return true if Iterator supports set\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.addSetValue()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * The value to be used in the add and set tests.\n     * Default is null.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testEmptyListIteratorIsIndeedEmpty()",
      "begin_line": 94,
      "end_line": 119,
      "comment": "\n     * Test that the empty list iterator contract is correct.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 55)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 102,col 40)",
        "(line 103,col 9)-(line 103,col 46)",
        "(line 104,col 9)-(line 104,col 45)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testWalkForwardAndBack()",
      "begin_line": 124,
      "end_line": 157,
      "comment": "\n     * Test navigation through the iterator.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 53)",
        "(line 126,col 9)-(line 126,col 48)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 141,col 9)-(line 147,col 9)",
        "(line 150,col 9)-(line 150,col 41)",
        "(line 151,col 9)-(line 151,col 46)",
        "(line 152,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testAdd()",
      "begin_line": 162,
      "end_line": 193,
      "comment": "\n     * Test add behaviour.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 42)",
        "(line 165,col 9)-(line 165,col 41)",
        "(line 166,col 9)-(line 172,col 9)",
        "(line 175,col 9)-(line 175,col 26)",
        "(line 176,col 9)-(line 176,col 25)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 180,col 9)-(line 180,col 26)",
        "(line 181,col 9)-(line 181,col 25)",
        "(line 182,col 9)-(line 182,col 42)",
        "(line 185,col 9)-(line 185,col 26)",
        "(line 186,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testSet()",
      "begin_line": 198,
      "end_line": 222,
      "comment": "\n     * Test set behaviour.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 48)",
        "(line 201,col 9)-(line 207,col 9)",
        "(line 210,col 9)-(line 213,col 51)",
        "(line 216,col 9)-(line 216,col 18)",
        "(line 217,col 9)-(line 217,col 30)",
        "(line 220,col 9)-(line 220,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testRemoveThenSet()",
      "begin_line": 224,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 48)",
        "(line 226,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testAddThenSet()",
      "begin_line": 237,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 48)",
        "(line 240,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorTest.testAddThenRemove()",
      "begin_line": 254,
      "end_line": 267,
      "comment": "\n     * Test remove after add behaviour.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 48)",
        "(line 258,col 9)-(line 266,col 9)"
      ]
    }
  ]
}
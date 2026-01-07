{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/iterators/AbstractIteratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIteratorTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 35,
      "end_line": 192,
      "comment": "\n * Abstract class for testing the Iterator interface.\n * \u003cp\u003e\n * This class provides a framework for testing an implementation of Iterator.\n * Concrete subclasses must provide the iterator to be tested.\n * They must also specify certain details of how the iterator operates by\n * overriding the supportsXxx() methods if necessary.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.AbstractIteratorTest(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.makeEmptyIterator()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Implement this method to return an iterator over an empty collection.\n     *\n     * @return an empty iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.makeObject()",
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * Implements the abstract superclass method to return the full iterator.\n     *\n     * @return a full iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.supportsEmptyIterator()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Whether or not we are testing an iterator that can be empty.\n     * Default is true.\n     *\n     * @return true if Iterator can be empty\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.supportsFullIterator()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Whether or not we are testing an iterator that can contain elements.\n     * Default is true.\n     *\n     * @return true if Iterator can be full\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.supportsRemove()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Whether or not we are testing an iterator that supports remove().\n     * Default is true.\n     *\n     * @return true if Iterator supports remove\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.verify()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Allows subclasses to add complex cross verification\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.testEmptyIterator()",
      "begin_line": 103,
      "end_line": 122,
      "comment": "\n     * Test the empty iterator.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 51)",
        "(line 111,col 9)-(line 111,col 95)",
        "(line 114,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 17)",
        "(line 121,col 9)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.testFullIterator()",
      "begin_line": 127,
      "end_line": 158,
      "comment": "\n     * Test normal iteration behaviour.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 135,col 9)-(line 135,col 98)",
        "(line 138,col 9)-(line 142,col 9)",
        "(line 145,col 9)-(line 148,col 9)",
        "(line 151,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorTest.testRemove()",
      "begin_line": 163,
      "end_line": 190,
      "comment": "\n     * Test remove behaviour.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 44)",
        "(line 166,col 9)-(line 172,col 9)",
        "(line 175,col 9)-(line 178,col 51)",
        "(line 179,col 9)-(line 179,col 17)",
        "(line 182,col 9)-(line 182,col 18)",
        "(line 183,col 9)-(line 183,col 20)",
        "(line 186,col 9)-(line 189,col 51)"
      ]
    }
  ]
}
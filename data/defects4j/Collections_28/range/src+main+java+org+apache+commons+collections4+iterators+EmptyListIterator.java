{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/EmptyListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmptyListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractEmptyIterator\u003cE\u003e",
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 77,
      "comment": "\n * Provides an implementation of an empty list iterator.\n * \u003cp\u003e\n * This class provides an implementation of an empty list iterator. This class\n * provides for binary compatibility between Commons Collections 2.1.1 and 3.1\n * due to issues with \u003ccode\u003eIteratorUtils\u003c/code\u003e.\n *\n * @since 2.1.1 and 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RESETTABLE_INSTANCE"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": "\n     * Singleton instance of the iterator.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Singleton instance of the iterator.\n     * @since 2.1.1 and 3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EmptyListIterator.resettableEmptyListIterator()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Get a typed instance of the iterator.\n     * @param \u003cE\u003e the element type\n     * @return {@link ResettableListIterator}\u003cE\u003e\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EmptyListIterator.emptyListIterator()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Get a typed instance of the iterator.\n     * @param \u003cE\u003e the element type\n     * @return {@link ListIterator}\u003cE\u003e\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.EmptyListIterator.EmptyListIterator()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)"
      ]
    }
  ]
}
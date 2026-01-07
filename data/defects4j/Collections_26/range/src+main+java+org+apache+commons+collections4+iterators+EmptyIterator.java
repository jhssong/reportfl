{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/EmptyIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmptyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractEmptyIterator\u003cE\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 76,
      "comment": "\n * Provides an implementation of an empty iterator.\n * \u003cp\u003e\n * This class provides an implementation of an empty iterator.\n * This class provides for binary compatibility between Commons Collections\n * 2.1.1 and 3.1 due to issues with \u003ccode\u003eIteratorUtils\u003c/code\u003e.\n *\n * @since 2.1.1 and 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RESETTABLE_INSTANCE"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * Singleton instance of the iterator.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Singleton instance of the iterator.\n     * @since 2.1.1 and 3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EmptyIterator.resettableEmptyIterator()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Get a typed resettable empty iterator instance.\n     * @param \u003cE\u003e the element type\n     * @return ResettableIterator\u003cE\u003e\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Get a typed empty iterator instance.\n     * @param \u003cE\u003e the element type\n     * @return Iterator\u003cE\u003e\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.EmptyIterator.EmptyIterator()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)"
      ]
    }
  ]
}
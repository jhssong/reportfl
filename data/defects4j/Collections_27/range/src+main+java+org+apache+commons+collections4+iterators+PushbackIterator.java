{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/PushbackIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PushbackIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 107,
      "comment": "\n * Decorates an iterator to support pushback of elements.\n * \u003cp\u003e\n * The decorator stores the pushed back elements in a LIFO manner: the last element\n * that has been pushed back, will be returned as the next element in a call to {@link #next()}.\n * \u003cp\u003e\n * The decorator does not support the removal operation. Any call to {@link #remove()} will\n * result in an {@link UnsupportedOperationException}.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The iterator being decorated. "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The LIFO queue containing the pushed back items. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PushbackIterator.pushbackIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 55,
      "end_line": 65,
      "comment": "\n     * Decorates the specified iterator to support one-element lookahead.\n     * \u003cp\u003e\n     * If the iterator is already a {@link PushbackIterator} it is returned directly.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @return a new peeking iterator\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.PushbackIterator.PushbackIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Constructor.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PushbackIterator.pushback(E)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Push back the given element to the iterator.\n     * \u003cp\u003e\n     * Calling {@link #next()} immediately afterwards will return exactly this element.\n     *\n     * @param item  the element to push back to the iterator\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PushbackIterator.hasNext()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PushbackIterator.next()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PushbackIterator.remove()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * This iterator will always throw an {@link UnsupportedOperationException}.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)"
      ]
    }
  ]
}
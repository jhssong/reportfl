{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/PeekingIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeekingIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 162,
      "comment": "\n * Decorates an iterator to support one-element lookahead while iterating.\n * \u003cp\u003e\n * The decorator supports the removal operation, but an {@link IllegalStateException}\n * will be thrown if {@link #remove()} is called directly after a call to\n * {@link #peek()} or {@link #element()}.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The iterator being decorated. "
    },
    {
      "type": "field",
      "varNames": [
        "exhausted"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Indicates that the decorated iterator is exhausted. "
    },
    {
      "type": "field",
      "varNames": [
        "slotFilled"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Indicates if the lookahead slot is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "slot"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The current slot for lookahead. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.peekingIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 58,
      "end_line": 68,
      "comment": "\n     * Decorates the specified iterator to support one-element lookahead.\n     * \u003cp\u003e\n     * If the iterator is already a {@link PeekingIterator} it is returned directly.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @return a new peeking iterator\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.PeekingIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructor.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.fill()",
      "begin_line": 81,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.hasNext()",
      "begin_line": 96,
      "end_line": 102,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.peek()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Returns the next element in iteration without advancing the underlying iterator.\n     * If the iterator is already exhausted, null will be returned.\n     * \u003cp\u003e\n     * Note: this method does not throw a {@link NoSuchElementException} if the iterator\n     * is already exhausted. If you want such a behavior, use {@link #element()} instead.\n     * \u003cp\u003e\n     * The rationale behind this is to follow the {@link java.util.Queue} interface\n     * which uses the same terminology.\n     *\n     * @return the next element from the iterator\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 15)",
        "(line 118,col 9)-(line 118,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.element()",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Returns the next element in iteration without advancing the underlying iterator.\n     * If the iterator is already exhausted, null will be returned.\n     *\n     * @return the next element from the iterator\n     * @throws NoSuchElementException if the iterator is already exhausted according to {@link #hasNext()}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 15)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.next()",
      "begin_line": 136,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 56)",
        "(line 143,col 9)-(line 143,col 20)",
        "(line 144,col 9)-(line 144,col 27)",
        "(line 145,col 9)-(line 145,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PeekingIterator.remove()",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws IllegalStateException if {@link #peek()} or {@link #element()} has been called\n     *   prior to the call to {@link #remove()}\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 26)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/BoundedIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundedIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 34,
      "end_line": 137,
      "comment": "\n * Decorates another iterator to return elements in a specific range.\n * \u003cp\u003e\n * The decorated iterator is bounded in the range [offset, offset+max).\n * The {@code offset} corresponds to the position of the first element to\n * be returned from the decorated iterator, and {@code max} is the maximum\n * number of elements to be returned at most.\n * \u003cp\u003e\n * In case an offset parameter other than 0 is provided, the decorated\n * iterator is immediately advanced to this position, skipping all elements\n * before that position.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The iterator being decorated. "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The offset to bound the first element return "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The max number of elements to return "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The position of the current element "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.BoundedIterator(java.util.Iterator\u003c? extends E\u003e, long, long)",
      "begin_line": 63,
      "end_line": 79,
      "comment": "\n     * Decorates the specified iterator to return at most the given number of elements,\n     * skipping all elements until the iterator reaches the position at {@code offset}.\n     * \u003cp\u003e\n     * The iterator is immediately advanced until it reaches the position at {@code offset},\n     * incurring O(n) time.\n     *\n     * @param iterator  the iterator to be decorated\n     * @param offset  the index of the first element of the decorated iterator to return\n     * @param max  the maximum number of elements of the decorated iterator to return\n     * @throws NullPointerException if iterator is null\n     * @throws IllegalArgumentException if either offset or max is negative\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 33)",
        "(line 75,col 9)-(line 75,col 29)",
        "(line 76,col 9)-(line 76,col 23)",
        "(line 77,col 9)-(line 77,col 16)",
        "(line 78,col 9)-(line 78,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.init()",
      "begin_line": 84,
      "end_line": 89,
      "comment": "\n     * Advances the underlying iterator to the beginning of the bounded range.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.hasNext()",
      "begin_line": 93,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.checkBounds()",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * Checks whether the iterator is still within its bounded range.\n     * @return {@code true} if the iterator is within its bounds, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.next()",
      "begin_line": 112,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 39)",
        "(line 118,col 9)-(line 118,col 14)",
        "(line 119,col 9)-(line 119,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.remove()",
      "begin_line": 130,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * In case an offset other than 0 was specified, the underlying iterator will be advanced\n     * to this position upon creation. A call to {@link #remove()} will still result in an\n     * {@link IllegalStateException} if no explicit call to {@link #next()} has been made prior\n     * to calling {@link #remove()}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 26)"
      ]
    }
  ]
}
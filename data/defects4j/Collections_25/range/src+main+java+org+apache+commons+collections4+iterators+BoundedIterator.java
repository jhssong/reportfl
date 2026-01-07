{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/BoundedIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundedIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 34,
      "end_line": 133,
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
      "begin_line": 62,
      "end_line": 78,
      "comment": "\n     * Decorates the specified iterator to return at most the given number of elements,\n     * skipping all elements until the iterator reaches the position at {@code offset}.\n     * \u003cp\u003e\n     * The iterator is immediately advanced until it reaches the position at {@code offset},\n     * incurring O(n) time.\n     *\n     * @param iterator  the iterator to be decorated\n     * @param offset  the index of the first element of the decorated iterator to return\n     * @param max  the maximum number of elements of the decorated iterator to return\n     * @throws IllegalArgumentException if iterator is null, or either offset or max is negative\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 33)",
        "(line 74,col 9)-(line 74,col 29)",
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.init()",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n     * Advances the underlying iterator to the beginning of the bounded range.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.hasNext()",
      "begin_line": 92,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.checkBounds()",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Checks whether the iterator is still within its bounded range.\n     * @return {@code true} if the iterator is within its bounds, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.next()",
      "begin_line": 110,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 115,col 14)",
        "(line 116,col 9)-(line 116,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.BoundedIterator.remove()",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * In case an offset other than 0 was specified, the underlying iterator will be advanced\n     * to this position upon creation. A call to {@link #remove()} will still result in an\n     * {@link IllegalStateException} if no explicit call to {@link #next()} has been made prior\n     * to calling {@link #remove()}.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 26)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/SkippingIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SkippingIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cE\u003e"
      ],
      "begin_line": 28,
      "end_line": 95,
      "comment": "\n * Decorates another iterator to skip the first N elements.\n * \u003cp\u003e\n * In case an offset parameter other than 0 is provided, the decorated\n * iterator is immediately advanced to this position, skipping all elements\n * before that position.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The offset to bound the first element return "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The position of the current element "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.SkippingIterator.SkippingIterator(java.util.Iterator\u003cE\u003e, long)",
      "begin_line": 49,
      "end_line": 59,
      "comment": "\n     * Decorates the specified iterator to skip all elements until the iterator\n     * reaches the position at {@code offset}.\n     * \u003cp\u003e\n     * The iterator is immediately advanced until it reaches the position at {@code offset},\n     * incurring O(n) time.\n     *\n     * @param iterator  the iterator to be decorated\n     * @param offset  the index of the first element of the decorated iterator to return\n     * @throws IllegalArgumentException if iterator is null, or offset is negative\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 24)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 57,col 21)",
        "(line 58,col 9)-(line 58,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIterator.init()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Skips the given number of elements.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIterator.next()",
      "begin_line": 72,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 36)",
        "(line 75,col 9)-(line 75,col 14)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SkippingIterator.remove()",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * In case an offset other than 0 was specified, the underlying iterator will be advanced\n     * to this position upon creation. A call to {@link #remove()} will still result in an\n     * {@link IllegalStateException} if no explicit call to {@link #next()} has been made prior\n     * to calling {@link #remove()}.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 23)"
      ]
    }
  ]
}
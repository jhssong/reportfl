{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/ZippingIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZippingIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 37,
      "end_line": 158,
      "comment": "\n * Provides an interleaved iteration over the elements contained in a\n * collection of Iterators.\n * \u003cp\u003e\n * Given two {@link Iterator} instances {@code A} and {@code B}, the\n * {@link #next} method on this iterator will switch between {@code A.next()}\n * and {@code B.next()} until both iterators are exhausted.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterators"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The {@link Iterator}s to evaluate. "
    },
    {
      "type": "field",
      "varNames": [
        "nextIterator"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The next iterator to use for next(). "
    },
    {
      "type": "field",
      "varNames": [
        "lastReturned"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The last iterator which was used for next(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ZippingIterator.ZippingIterator(java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new \u003ccode\u003eZippingIterator\u003c/code\u003e that will provide\n     * interleaved iteration over the two given iterators.\n     *\n     * @param a  the first child iterator\n     * @param b  the second child iterator\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ZippingIterator.ZippingIterator(java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 73,
      "end_line": 78,
      "comment": "\n     * Constructs a new \u003ccode\u003eZippingIterator\u003c/code\u003e that will provide\n     * interleaved iteration over the three given iterators.\n     *\n     * @param a  the first child iterator\n     * @param b  the second child iterator\n     * @param c  the third child iterator\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ZippingIterator.ZippingIterator(java.util.Iterator\u003c? extends E\u003e...)",
      "begin_line": 87,
      "end_line": 97,
      "comment": "\n     * Constructs a new \u003ccode\u003eZippingIterator\u003c/code\u003e that will provide\n     * interleaved iteration of the specified iterators.\n     *\n     * @param iterators  the array of iterators\n     * @throws NullPointerException if any iterator is null\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 88)",
        "(line 90,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ZippingIterator.hasNext()",
      "begin_line": 107,
      "end_line": 125,
      "comment": "\n     * Returns {@code true} if any child iterator has remaining elements.\n     *\n     * @return true if this iterator has remaining elements\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ZippingIterator.next()",
      "begin_line": 133,
      "end_line": 142,
      "comment": "\n     * Returns the next element from a child iterator.\n     *\n     * @return the next interleaved element\n     * @throws NoSuchElementException if no child iterator has any more elements\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ZippingIterator.remove()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Removes the last returned element from the child iterator that produced it.\n     *\n     * @throws IllegalStateException if there is no last returned element, or if\n     *   the last returned element has already been removed\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 30)",
        "(line 155,col 9)-(line 155,col 28)"
      ]
    }
  ]
}
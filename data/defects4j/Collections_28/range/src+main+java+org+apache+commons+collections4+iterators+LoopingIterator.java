{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/LoopingIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoopingIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 38,
      "end_line": 129,
      "comment": "\n * An Iterator that restarts when it reaches the end.\n * \u003cp\u003e\n * The iterator will loop continuously around the provided elements, unless\n * there are no elements in the collection to begin with, or all the elements\n * have been {@link #remove removed}.\n * \u003cp\u003e\n * Concurrent modifications are not directly supported, and for most collection\n * implementations will throw a ConcurrentModificationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The collection to base the iterator on "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The current iterator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.LoopingIterator.LoopingIterator(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     * Constructor that wraps a collection.\n     * \u003cp\u003e\n     * There is no way to reset an Iterator instance without recreating it from\n     * the original source, so the Collection must be passed in.\n     *\n     * @param coll  the collection to wrap\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingIterator.hasNext()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Has the iterator any more elements.\n     * \u003cp\u003e\n     * Returns false only if the collection originally had zero elements, or\n     * all the elements have been {@link #remove removed}.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if there are more elements\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingIterator.next()",
      "begin_line": 84,
      "end_line": 93,
      "comment": "\n     * Returns the next object in the collection.\n     * \u003cp\u003e\n     * If at the end of the collection, return the first element.\n     *\n     * @return the next object\n     * @throws NoSuchElementException if there are no elements\n     *         at all.  Use {@link #hasNext} to avoid this error.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingIterator.remove()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Removes the previously retrieved item from the underlying collection.\n     * \u003cp\u003e\n     * This feature is only supported if the underlying collection\u0027s\n     * {@link Collection#iterator iterator} method returns an implementation\n     * that supports it.\n     * \u003cp\u003e\n     * This method can only be called after at least one {@link #next} method call.\n     * After a removal, the remove method may not be called again until another\n     * next has been performed. If the {@link #reset} is called, then remove may\n     * not be called until {@link #next} is called again.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingIterator.reset()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Resets the iterator back to the start of the collection.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingIterator.size()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Gets the size of the collection underlying the iterator.\n     *\n     * @return the current collection size\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 33)"
      ]
    }
  ]
}
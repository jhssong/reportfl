{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/LazyIteratorChain.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazyIteratorChain",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 49,
      "end_line": 150,
      "comment": "\n * An LazyIteratorChain is an Iterator that wraps a number of Iterators in a lazy manner.\n * \u003cp\u003e\n * This class makes multiple iterators look like one to the caller. When any\n * method from the Iterator interface is called, the LazyIteratorChain will delegate\n * to a single underlying Iterator. The LazyIteratorChain will invoke the Iterators\n * in sequence until all Iterators are exhausted.\n * \u003cp\u003e\n * The Iterators are provided by {@link #nextIterator(int)} which has to be overridden by\n * sub-classes and allows to lazily create the Iterators as they are accessed:\n * \u003cpre\u003e\n * return new LazyIteratorChain\u0026lt;String\u0026gt;() {\n *     protected Iterator\u0026lt;String\u0026gt; nextIterator(int count) {\n *         return count \u003d\u003d 1 ? Arrays.asList(\"foo\", \"bar\").iterator() : null;\n *     }\n * };\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Once the inner Iterator\u0027s {@link Iterator#hasNext()} method returns false,\n * {@link #nextIterator(int)} will be called to obtain another iterator, and so on\n * until {@link #nextIterator(int)} returns null, indicating that the chain is exhausted.\n * \u003cp\u003e\n * NOTE: The LazyIteratorChain may contain no iterators. In this case the class will\n * function as an empty iterator.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "callCounter"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The number of times {@link #nextIterator()} was already called. "
    },
    {
      "type": "field",
      "varNames": [
        "chainExhausted"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Indicates that the Iterator chain has been exhausted. "
    },
    {
      "type": "field",
      "varNames": [
        "currentIterator"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The current iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "lastUsedIterator"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The \"last used\" Iterator is the Iterator upon which next() or hasNext()\n     * was most recently called used for the remove() operation only.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LazyIteratorChain.nextIterator(int)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Gets the next iterator after the previous one has been exhausted.\n     * \u003cp\u003e\n     * This method \u003cb\u003eMUST\u003c/b\u003e return null when there are no more iterators.\n     *\n     * @param count the number of time this method has been called (starts with 1)\n     * @return the next iterator, or null if there are no more.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LazyIteratorChain.updateCurrentIterator()",
      "begin_line": 82,
      "end_line": 102,
      "comment": "\n     * Updates the current iterator field to ensure that the current Iterator\n     * is not exhausted.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LazyIteratorChain.hasNext()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Return true if any Iterator in the chain has a remaining element.\n     *\n     * @return true if elements remain\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 32)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 115,col 9)-(line 115,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LazyIteratorChain.next()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Returns the next element of the current Iterator\n     *\n     * @return element from the current Iterator\n     * @throws java.util.NoSuchElementException if all the Iterators are exhausted\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 126,col 43)",
        "(line 128,col 9)-(line 128,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LazyIteratorChain.remove()",
      "begin_line": 143,
      "end_line": 148,
      "comment": "\n     * Removes from the underlying collection the last element returned by the Iterator.\n     * \u003cp\u003e\n     * As with next() and hasNext(), this method calls remove() on the underlying Iterator.\n     * Therefore, this method may throw an UnsupportedOperationException if the underlying\n     * Iterator does not support this method.\n     *\n     * @throws UnsupportedOperationException if the remove operator is not\n     *   supported by the underlying Iterator\n     * @throws IllegalStateException if the next method has not yet been called,\n     *   or the remove method has already been called after the last call to the next method.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 34)"
      ]
    }
  ]
}
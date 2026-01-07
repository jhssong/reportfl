{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/CollatingIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollatingIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 41,
      "end_line": 400,
      "comment": "\n * Provides an ordered iteration over the elements contained in a collection of\n * ordered Iterators.\n * \u003cp\u003e\n * Given two ordered {@link Iterator} instances \u003ccode\u003eA\u003c/code\u003e and\n * \u003ccode\u003eB\u003c/code\u003e, the {@link #next} method on this iterator will return the\n * lesser of \u003ccode\u003eA.next()\u003c/code\u003e and \u003ccode\u003eB.next()\u003c/code\u003e.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The {@link Comparator} used to evaluate order. "
    },
    {
      "type": "field",
      "varNames": [
        "iterators"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The list of {@link Iterator}s to evaluate. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " {@link Iterator#next Next} objects peeked from each iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "valueSet"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Whether or not each {@link #values} element has been set. "
    },
    {
      "type": "field",
      "varNames": [
        "lastReturned"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Index of the {@link #iterators iterator} from whom the last returned\n     * value was obtained.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e. A comparator must be\n     * set by calling {@link #setComparator(Comparator)} before invoking\n     * {@link #hasNext()}, or {@link #next()} for the first time. Child\n     * iterators will have to be manually added using the\n     * {@link #addIterator(Iterator)} method.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will used the\n     * specified comparator for ordering. Child iterators will have to be\n     * manually added using the {@link #addIterator(Iterator)} method.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)} later on.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, int)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will used the\n     * specified comparator for ordering and have the specified initial\n     * capacity. Child iterators will have to be manually added using the\n     * {@link #addIterator(Iterator)} method.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)} later on.\n     * @param initIterCapacity the initial capacity for the internal list of\n     *   child iterators\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 75)",
        "(line 99,col 9)-(line 99,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will use the\n     * specified comparator to provide ordered iteration over the two given\n     * iterators.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)} later on.\n     * @param a the first child ordered iterator\n     * @param b the second child ordered iterator\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 22)",
        "(line 116,col 9)-(line 116,col 23)",
        "(line 117,col 9)-(line 117,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, java.util.Iterator\u003c? extends E\u003e[])",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will use the\n     * specified comparator to provide ordered iteration over the array of\n     * iterators.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)} later on.\n     * @param iterators the array of iterators\n     * @throws NullPointerException if iterators array is or contains null\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 37)",
        "(line 132,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, java.util.Collection\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will use the\n     * specified comparator to provide ordered iteration over the collection of\n     * iterators.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)} later on.\n     * @param iterators the collection of iterators\n     * @throws NullPointerException if the iterators collection is or contains null\n     * @throws ClassCastException if the iterators collection contains an\n     *   element that\u0027s not an {@link Iterator}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 37)",
        "(line 151,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.addIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * Adds the given {@link Iterator} to the iterators being collated.\n     *\n     * @param iterator the iterator to add to the collation, must not be null\n     * @throws IllegalStateException if iteration has started\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 26)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.setIterator(int, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 182,
      "end_line": 188,
      "comment": "\n     * Sets the iterator at the given index.\n     *\n     * @param index index of the Iterator to replace\n     * @param iterator Iterator to place at the given index\n     * @throws IndexOutOfBoundsException if index \u0026lt; 0 or index \u0026gt; size()\n     * @throws IllegalStateException if iteration has started\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 26)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.getIterators()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Gets the list of Iterators (unmodifiable).\n     *\n     * @return the unmodifiable list of iterators added\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.getComparator()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Gets the {@link Comparator} by which collatation occurs.\n     *\n     * @return the {@link Comparator}\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.setComparator(java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Sets the {@link Comparator} by which collation occurs. If you\n     * would like to use the natural sort order (or, in other words,\n     * if the elements in the iterators are implementing the\n     * {@link java.lang.Comparable} interface), then use the\n     * {@link org.apache.commons.collections4.comparators.ComparableComparator}.\n     *\n     * @param comp the {@link Comparator} to set\n     * @throws IllegalStateException if iteration has started\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 26)",
        "(line 220,col 9)-(line 220,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.hasNext()",
      "begin_line": 230,
      "end_line": 234,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if any child iterator has remaining elements.\n     *\n     * @return true if this iterator has remaining elements\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 16)",
        "(line 233,col 9)-(line 233,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.next()",
      "begin_line": 242,
      "end_line": 255,
      "comment": "\n     * Returns the next ordered element from a child iterator.\n     *\n     * @return the next ordered element\n     * @throws NoSuchElementException if no child iterator has any more elements\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 39)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 45)",
        "(line 252,col 9)-(line 252,col 26)",
        "(line 253,col 9)-(line 253,col 34)",
        "(line 254,col 9)-(line 254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.remove()",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n     * Removes the last returned element from the child iterator that produced it.\n     *\n     * @throws IllegalStateException if there is no last returned element, or if\n     * the last returned element has already been removed\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.getIteratorIndex()",
      "begin_line": 277,
      "end_line": 283,
      "comment": "\n     * Returns the index of the iterator that returned the last element.\n     *\n     * @return the index of the iterator that returned the last element\n     * @throws IllegalStateException if there is no last returned element\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.start()",
      "begin_line": 290,
      "end_line": 299,
      "comment": "\n     * Initializes the collating state if it hasn\u0027t been already.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.set(int)",
      "begin_line": 309,
      "end_line": 319,
      "comment": "\n     * Sets the {@link #values} and {@link #valueSet} attributes at position\n     * \u003ci\u003ei\u003c/i\u003e to the next value of the {@link #iterators iterator} at position\n     * \u003ci\u003ei\u003c/i\u003e, or clear them if the \u003ci\u003ei\u003c/i\u003e\u003csup\u003eth\u003c/sup\u003e iterator has no next\n     * value.\n     *\n     * @return {@code false} iff there was no value to set\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 58)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 28)",
        "(line 317,col 9)-(line 317,col 26)",
        "(line 318,col 9)-(line 318,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.clear(int)",
      "begin_line": 325,
      "end_line": 328,
      "comment": "\n     * Clears the {@link #values} and {@link #valueSet} attributes at position\n     * \u003ci\u003ei\u003c/i\u003e.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 28)",
        "(line 327,col 9)-(line 327,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.checkNotStarted()",
      "begin_line": 336,
      "end_line": 340,
      "comment": "\n     * Throws {@link IllegalStateException} if iteration has started via\n     * {@link #start}.\n     *\n     * @throws IllegalStateException if iteration started\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.least()",
      "begin_line": 348,
      "end_line": 372,
      "comment": "\n     * Returns the index of the least element in {@link #values},\n     * {@link #set(int) setting} any uninitialized values.\n     *\n     * @throws NullPointerException if no comparator is set\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 28)",
        "(line 350,col 9)-(line 350,col 29)",
        "(line 351,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.anyValueSet(java.util.BitSet)",
      "begin_line": 378,
      "end_line": 385,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff any bit in the given set is\n     * \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.anyHasNext(java.util.List\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 391,
      "end_line": 398,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff any {@link Iterator} in the given list has\n     * a next value.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 21)"
      ]
    }
  ]
}
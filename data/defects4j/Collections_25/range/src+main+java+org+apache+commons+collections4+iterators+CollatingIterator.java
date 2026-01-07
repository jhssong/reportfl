{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/CollatingIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollatingIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 41,
      "end_line": 404,
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
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will used the\n     * specified comparator for ordering. Child iterators will have to be\n     * manually added using the {@link #addIterator(Iterator)} method.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)}\n     *   later on.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, int)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will used the\n     * specified comparator for ordering and have the specified initial\n     * capacity. Child iterators will have to be manually added using the\n     * {@link #addIterator(Iterator)} method.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)}\n     *   later on.\n     * @param initIterCapacity the initial capacity for the internal list of\n     * child iterators\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 75)",
        "(line 101,col 9)-(line 101,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will use the\n     * specified comparator to provide ordered iteration over the two given\n     * iterators.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)}\n     *   later on.\n     * @param a the first child ordered iterator\n     * @param b the second child ordered iterator\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 22)",
        "(line 119,col 9)-(line 119,col 23)",
        "(line 120,col 9)-(line 120,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, java.util.Iterator\u003c? extends E\u003e[])",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will use the\n     * specified comparator to provide ordered iteration over the array of\n     * iterators.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)}\n     *   later on.\n     * @param iterators the array of iterators\n     * @throws NullPointerException if iterators array is or contains null\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 37)",
        "(line 136,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.CollatingIterator(java.util.Comparator\u003c? super E\u003e, java.util.Collection\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * Constructs a new \u003ccode\u003eCollatingIterator\u003c/code\u003e that will use the\n     * specified comparator to provide ordered iteration over the collection of\n     * iterators.\n     *\n     * @param comp the comparator to use to sort; must not be null,\n     *   unless you\u0027ll be invoking {@link #setComparator(Comparator)}\n     *   later on.\n     * @param iterators the collection of iterators\n     * @throws NullPointerException if the iterators collection is or contains\n     * null\n     * @throws ClassCastException if the iterators collection contains an\n     * element that\u0027s not an {@link Iterator}\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)",
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.addIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Adds the given {@link Iterator} to the iterators being collated.\n     *\n     * @param iterator the iterator to add to the collation, must not be null\n     * @throws IllegalStateException if iteration has started\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 26)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.setIterator(int, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 188,
      "end_line": 194,
      "comment": "\n     * Sets the iterator at the given index.\n     *\n     * @param index index of the Iterator to replace\n     * @param iterator Iterator to place at the given index\n     * @throws IndexOutOfBoundsException if index \u0026lt; 0 or index \u0026gt; size()\n     * @throws IllegalStateException if iteration has started\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 26)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.getIterators()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Gets the list of Iterators (unmodifiable).\n     *\n     * @return the unmodifiable list of iterators added\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.getComparator()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Gets the {@link Comparator} by which collatation occurs.\n     *\n     * @return the {@link Comparator}\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.setComparator(java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * Sets the {@link Comparator} by which collation occurs. If you\n     * would like to use the natural sort order (or, in other words,\n     * if the elements in the iterators are implementing the\n     * {@link java.lang.Comparable} interface), then use the\n     * {@link org.apache.commons.collections4.comparators.ComparableComparator}.\n     *\n     * @param comp the {@link Comparator} to set\n     * @throws IllegalStateException if iteration has started\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 26)",
        "(line 226,col 9)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.hasNext()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if any child iterator has remaining elements.\n     *\n     * @return true if this iterator has remaining elements\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 16)",
        "(line 238,col 9)-(line 238,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.next()",
      "begin_line": 247,
      "end_line": 259,
      "comment": "\n     * Returns the next ordered element from a child iterator.\n     *\n     * @return the next ordered element\n     * @throws NoSuchElementException if no child iterator has any more elements\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 39)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 45)",
        "(line 256,col 9)-(line 256,col 26)",
        "(line 257,col 9)-(line 257,col 34)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.remove()",
      "begin_line": 268,
      "end_line": 273,
      "comment": "\n     * Removes the last returned element from the child iterator that produced\n     * it.\n     *\n     * @throws IllegalStateException if there is no last returned element, or if\n     * the last returned element has already been removed\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.getIteratorIndex()",
      "begin_line": 281,
      "end_line": 287,
      "comment": "\n     * Returns the index of the iterator that returned the last element.\n     *\n     * @return the index of the iterator that returned the last element\n     * @throws IllegalStateException if there is no last returned element\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.start()",
      "begin_line": 294,
      "end_line": 303,
      "comment": "\n     * Initializes the collating state if it hasn\u0027t been already.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.set(int)",
      "begin_line": 313,
      "end_line": 323,
      "comment": "\n     * Sets the {@link #values} and {@link #valueSet} attributes at position\n     * \u003ci\u003ei\u003c/i\u003e to the next value of the {@link #iterators iterator} at position\n     * \u003ci\u003ei\u003c/i\u003e, or clear them if the \u003ci\u003ei\u003c/i\u003e\u003csup\u003eth\u003c/sup\u003e iterator has no next\n     * value.\n     *\n     * @return {@code false} iff there was no value to set\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 58)",
        "(line 315,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 28)",
        "(line 321,col 9)-(line 321,col 26)",
        "(line 322,col 9)-(line 322,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.clear(int)",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\n     * Clears the {@link #values} and {@link #valueSet} attributes at position\n     * \u003ci\u003ei\u003c/i\u003e.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 28)",
        "(line 331,col 9)-(line 331,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.checkNotStarted()",
      "begin_line": 340,
      "end_line": 344,
      "comment": "\n     * Throws {@link IllegalStateException} if iteration has started via\n     * {@link #start}.\n     *\n     * @throws IllegalStateException if iteration started\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.least()",
      "begin_line": 352,
      "end_line": 376,
      "comment": "\n     * Returns the index of the least element in {@link #values},\n     * {@link #set(int) setting} any uninitialized values.\n     *\n     * @throws NullPointerException if no comparator is set\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 28)",
        "(line 354,col 9)-(line 354,col 29)",
        "(line 355,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.anyValueSet(java.util.BitSet)",
      "begin_line": 382,
      "end_line": 389,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff any bit in the given set is\n     * \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.CollatingIterator.anyHasNext(java.util.List\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 395,
      "end_line": 402,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff any {@link Iterator} in the given list has\n     * a next value.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 21)"
      ]
    }
  ]
}
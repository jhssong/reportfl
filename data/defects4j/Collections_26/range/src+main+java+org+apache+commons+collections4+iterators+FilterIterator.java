{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/FilterIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FilterIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 185,
      "comment": "\n * Decorates another {@link Iterator} using a predicate to filter elements.\n * \u003cp\u003e\n * This iterator decorates the underlying iterator, only allowing through\n * those elements that match the specified {@link Predicate Predicate}.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The iterator being used "
    },
    {
      "type": "field",
      "varNames": [
        "predicate"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The predicate being used "
    },
    {
      "type": "field",
      "varNames": [
        "nextObject"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The next object in the iteration "
    },
    {
      "type": "field",
      "varNames": [
        "nextObjectSet"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Whether the next object has been calculated yet "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.FilterIterator()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterIterator\u003c/code\u003e that will not function\n     * until {@link #setIterator(Iterator) setIterator} is invoked.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.FilterIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterIterator\u003c/code\u003e that will not function\n     * until {@link #setPredicate(Predicate) setPredicate} is invoked.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)",
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.FilterIterator(java.util.Iterator\u003c? extends E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Constructs a new \u003ccode\u003eFilterIterator\u003c/code\u003e that will use the\n     * given iterator and predicate.\n     *\n     * @param iterator  the iterator to use\n     * @param predicate  the predicate to use\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 16)",
        "(line 73,col 9)-(line 73,col 33)",
        "(line 74,col 9)-(line 74,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.hasNext()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns true if the underlying iterator contains an object that\n     * matches the predicate.\n     *\n     * @return true if there is another object that matches the predicate\n     * @throws NullPointerException if either the iterator or predicate are null\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.next()",
      "begin_line": 97,
      "end_line": 105,
      "comment": "\n     * Returns the next object that matches the predicate.\n     *\n     * @return the next object which matches the given predicate\n     * @throws NullPointerException if either the iterator or predicate are null\n     * @throws NoSuchElementException if there are no more elements that\n     *  match the predicate\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 30)",
        "(line 104,col 9)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.remove()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Removes from the underlying collection of the base iterator the last\n     * element returned by this iterator.\n     * This method can only be called\n     * if \u003ccode\u003enext()\u003c/code\u003e was called, but not after\n     * \u003ccode\u003ehasNext()\u003c/code\u003e, because the \u003ccode\u003ehasNext()\u003c/code\u003e call\n     * changes the base iterator.\n     *\n     * @throws IllegalStateException if \u003ccode\u003ehasNext()\u003c/code\u003e has already\n     *  been called.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.getIterator()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Gets the iterator this iterator is using.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.setIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\n     * Sets the iterator for this iterator to use.\n     * If iteration has started, this effectively resets the iterator.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 26)",
        "(line 144,col 9)-(line 144,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.getPredicate()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Gets the predicate this iterator is using.\n     *\n     * @return the predicate\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.setPredicate(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 162,
      "end_line": 166,
      "comment": "\n     * Sets the predicate this the iterator to use.\n     *\n     * @param predicate  the predicate to use\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 35)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.setNextObject()",
      "begin_line": 173,
      "end_line": 183,
      "comment": "\n     * Set nextObject to the next object. If there are no more\n     * objects then return false. Otherwise, return true.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 21)"
      ]
    }
  ]
}
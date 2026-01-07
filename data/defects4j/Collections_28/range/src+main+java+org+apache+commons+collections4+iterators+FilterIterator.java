{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/FilterIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FilterIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 33,
      "end_line": 188,
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
      "end_line": 88,
      "comment": "\n     * Returns true if the underlying iterator contains an object that\n     * matches the predicate.\n     *\n     * @return true if there is another object that matches the predicate\n     * @throws NullPointerException if either the iterator or predicate are null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.next()",
      "begin_line": 98,
      "end_line": 107,
      "comment": "\n     * Returns the next object that matches the predicate.\n     *\n     * @return the next object which matches the given predicate\n     * @throws NullPointerException if either the iterator or predicate are null\n     * @throws NoSuchElementException if there are no more elements that\n     *  match the predicate\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 30)",
        "(line 106,col 9)-(line 106,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.remove()",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Removes from the underlying collection of the base iterator the last\n     * element returned by this iterator.\n     * This method can only be called\n     * if \u003ccode\u003enext()\u003c/code\u003e was called, but not after\n     * \u003ccode\u003ehasNext()\u003c/code\u003e, because the \u003ccode\u003ehasNext()\u003c/code\u003e call\n     * changes the base iterator.\n     *\n     * @throws IllegalStateException if \u003ccode\u003ehasNext()\u003c/code\u003e has already\n     *  been called.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.getIterator()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Gets the iterator this iterator is using.\n     *\n     * @return the iterator\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.setIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * Sets the iterator for this iterator to use.\n     * If iteration has started, this effectively resets the iterator.\n     *\n     * @param iterator  the iterator to use\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 146,col 26)",
        "(line 147,col 9)-(line 147,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.getPredicate()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Gets the predicate this iterator is using.\n     *\n     * @return the predicate\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.setPredicate(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\n     * Sets the predicate this the iterator to use.\n     *\n     * @param predicate  the predicate to use\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 167,col 26)",
        "(line 168,col 9)-(line 168,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.FilterIterator.setNextObject()",
      "begin_line": 176,
      "end_line": 186,
      "comment": "\n     * Set nextObject to the next object. If there are no more\n     * objects then return false. Otherwise, return true.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    }
  ]
}
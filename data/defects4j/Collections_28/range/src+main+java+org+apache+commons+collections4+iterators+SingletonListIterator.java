{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/SingletonListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingletonListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 182,
      "comment": "\n * \u003ccode\u003eSingletonIterator\u003c/code\u003e is an {@link ListIterator} over a single\n * object instance.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "beforeFirst"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextCalled"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removed"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.SingletonListIterator(E)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Constructs a new \u003ccode\u003eSingletonListIterator\u003c/code\u003e.\n     *\n     * @param object  the single object to return from the iterator\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)",
        "(line 44,col 9)-(line 44,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.hasNext()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Is another object available from the iterator?\n     * \u003cp\u003e\n     * This returns true if the single object hasn\u0027t been returned yet.\n     *\n     * @return true if the single object hasn\u0027t been returned yet\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.hasPrevious()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Is a previous object available from the iterator?\n     * \u003cp\u003e\n     * This returns true if the single object has been returned.\n     *\n     * @return true if the single object has been returned\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.nextIndex()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Returns the index of the element that would be returned by a subsequent\n     * call to {@code next}.\n     *\n     * @return 0 or 1 depending on current state.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.previousIndex()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Returns the index of the element that would be returned by a subsequent\n     * call to {@code previous}. A return value of -1 indicates that the iterator is currently at\n     * the start.\n     *\n     * @return 0 or -1 depending on current state.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.next()",
      "begin_line": 103,
      "end_line": 111,
      "comment": "\n     * Get the next object from the iterator.\n     * \u003cp\u003e\n     * This returns the single object if it hasn\u0027t been returned yet.\n     *\n     * @return the single object\n     * @throws NoSuchElementException if the single object has already\n     *    been returned\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 28)",
        "(line 109,col 9)-(line 109,col 26)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.previous()",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n     * Get the previous object from the iterator.\n     * \u003cp\u003e\n     * This returns the single object if it has been returned.\n     *\n     * @return the single object\n     * @throws NoSuchElementException if the single object has not already\n     *    been returned\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 128,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.remove()",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Remove the object from this iterator.\n     * @throws IllegalStateException if the {@code next} or {@code previous}\n     *        method has not yet been called, or the {@code remove} method\n     *        has already been called after the last call to {@code next}\n     *        or {@code previous}.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 22)",
        "(line 144,col 9)-(line 144,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.add(E)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Add always throws {@link UnsupportedOperationException}.\n     *\n     * @param obj  the object to add\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.set(E)",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * Set sets the value of the singleton.\n     *\n     * @param obj  the object to set\n     * @throws IllegalStateException if {@code next} has not been called\n     *          or the object has been removed\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.reset()",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Reset the iterator back to the start.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 27)",
        "(line 179,col 9)-(line 179,col 27)"
      ]
    }
  ]
}
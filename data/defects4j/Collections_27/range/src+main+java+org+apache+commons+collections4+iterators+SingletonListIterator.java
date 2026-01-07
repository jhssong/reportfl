{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/SingletonListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingletonListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 172,
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
      "end_line": 56,
      "comment": "\n     * Is another object available from the iterator?\n     * \u003cp\u003e\n     * This returns true if the single object hasn\u0027t been returned yet.\n     *\n     * @return true if the single object hasn\u0027t been returned yet\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.hasPrevious()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Is a previous object available from the iterator?\n     * \u003cp\u003e\n     * This returns true if the single object has been returned.\n     *\n     * @return true if the single object has been returned\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.nextIndex()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns the index of the element that would be returned by a subsequent\n     * call to {@code next}.\n     *\n     * @return 0 or 1 depending on current state.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.previousIndex()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns the index of the element that would be returned by a subsequent\n     * call to {@code previous}. A return value of -1 indicates that the iterator is currently at\n     * the start.\n     *\n     * @return 0 or -1 depending on current state.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.next()",
      "begin_line": 99,
      "end_line": 106,
      "comment": "\n     * Get the next object from the iterator.\n     * \u003cp\u003e\n     * This returns the single object if it hasn\u0027t been returned yet.\n     *\n     * @return the single object\n     * @throws NoSuchElementException if the single object has already\n     *    been returned\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 28)",
        "(line 104,col 9)-(line 104,col 26)",
        "(line 105,col 9)-(line 105,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.previous()",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Get the previous object from the iterator.\n     * \u003cp\u003e\n     * This returns the single object if it has been returned.\n     *\n     * @return the single object\n     * @throws NoSuchElementException if the single object has not already\n     *    been returned\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.remove()",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Remove the object from this iterator.\n     * @throws IllegalStateException if the {@code next} or {@code previous}\n     *        method has not yet been called, or the {@code remove} method\n     *        has already been called after the last call to {@code next}\n     *        or {@code previous}.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 22)",
        "(line 137,col 9)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.add(E)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Add always throws {@link UnsupportedOperationException}.\n     *\n     * @param obj  the object to add\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.set(E)",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * Set sets the value of the singleton.\n     *\n     * @param obj  the object to set\n     * @throws IllegalStateException if {@code next} has not been called\n     *          or the object has been removed\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonListIterator.reset()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Reset the iterator back to the start.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 27)",
        "(line 169,col 9)-(line 169,col 27)"
      ]
    }
  ]
}
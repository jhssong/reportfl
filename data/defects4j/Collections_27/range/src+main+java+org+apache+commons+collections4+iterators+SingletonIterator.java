{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/SingletonIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingletonIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 123,
      "comment": "\n * \u003ccode\u003eSingletonIterator\u003c/code\u003e is an {@link Iterator} over a single\n * object instance.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "removeAllowed"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Whether remove is allowed "
    },
    {
      "type": "field",
      "varNames": [
        "beforeFirst"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Is the cursor before the first element "
    },
    {
      "type": "field",
      "varNames": [
        "removed"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Has the element been removed "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.SingletonIterator.SingletonIterator(E)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructs a new \u003ccode\u003eSingletonIterator\u003c/code\u003e where \u003ccode\u003eremove\u003c/code\u003e\n     * is a permitted operation.\n     *\n     * @param object  the single object to return from the iterator\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.SingletonIterator.SingletonIterator(E, boolean)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Constructs a new \u003ccode\u003eSingletonIterator\u003c/code\u003e optionally choosing if\n     * \u003ccode\u003eremove\u003c/code\u003e is a permitted operation.\n     *\n     * @param object  the single object to return from the iterator\n     * @param removeAllowed  true if remove is allowed\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)",
        "(line 62,col 9)-(line 62,col 29)",
        "(line 63,col 9)-(line 63,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonIterator.hasNext()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Is another object available from the iterator?\n     * \u003cp\u003e\n     * This returns true if the single object hasn\u0027t been returned yet.\n     *\n     * @return true if the single object hasn\u0027t been returned yet\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonIterator.next()",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Get the next object from the iterator.\n     * \u003cp\u003e\n     * This returns the single object if it hasn\u0027t been returned yet.\n     *\n     * @return the single object\n     * @throws NoSuchElementException if the single object has already\n     *    been returned\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 28)",
        "(line 92,col 9)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonIterator.remove()",
      "begin_line": 104,
      "end_line": 114,
      "comment": "\n     * Remove the object from this iterator.\n     *\n     * @throws IllegalStateException if the {@code next} method has not\n     *        yet been called, or the {@code remove} method has already\n     *        been called after the last call to the {@code next}\n     *        method.\n     * @throws UnsupportedOperationException if remove is not supported\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.SingletonIterator.reset()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Reset the iterator to the start.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 27)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/ListIteratorWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListIteratorWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 48,
      "end_line": 262,
      "comment": "\n * Converts an {@link Iterator} into a {@link ResettableListIterator}.\n * For plain \u003ccode\u003eIterator\u003c/code\u003es this is accomplished by caching the returned\n * elements.  This class can also be used to simply add\n * {@link org.apache.commons.collections4.ResettableIterator ResettableIterator}\n * functionality to a given {@link ListIterator}.\n * \u003cp\u003e\n * The \u003ccode\u003eListIterator\u003c/code\u003e interface has additional useful methods\n * for navigation - \u003ccode\u003eprevious()\u003c/code\u003e and the index methods.\n * This class allows a regular \u003ccode\u003eIterator\u003c/code\u003e to behave as a\n * \u003ccode\u003eListIterator\u003c/code\u003e. It achieves this by building a list internally\n * of as the underlying iterator is traversed.\n * \u003cp\u003e\n * The optional operations of \u003ccode\u003eListIterator\u003c/code\u003e are not supported for plain \u003ccode\u003eIterator\u003c/code\u003es.\n * \u003cp\u003e\n * This class implements ResettableListIterator from Commons Collections 3.2.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSUPPORTED_OPERATION_MESSAGE"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": " Message used when set or add are called. "
    },
    {
      "type": "field",
      "varNames": [
        "CANNOT_REMOVE_MESSAGE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Message used when set or add are called. "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The underlying iterator being decorated. "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The list being used to cache the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "currentIndex"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The current index of this iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "wrappedIteratorIndex"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The current index of the wrapped iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "removeState"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " recall whether the wrapped iterator\u0027s \"cursor\" is in such a state as to allow remove() to be called "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.ListIteratorWrapper(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     * Constructs a new \u003ccode\u003eListIteratorWrapper\u003c/code\u003e that will wrap\n     * the given iterator.\n     *\n     * @param iterator  the iterator to wrap\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.add(E)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n     * Throws {@link UnsupportedOperationException}\n     * unless the underlying \u003ccode\u003eIterator\u003c/code\u003e is a \u003ccode\u003eListIterator\u003c/code\u003e.\n     *\n     * @param obj  the object to add\n     * @throws UnsupportedOperationException if the underlying iterator is not of\n     * type {@link ListIterator}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.hasNext()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Returns true if there are more elements in the iterator.\n     *\n     * @return true if there are more elements\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.hasPrevious()",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\n     * Returns true if there are previous elements in the iterator.\n     *\n     * @return true if there are previous elements\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.next()",
      "begin_line": 137,
      "end_line": 153,
      "comment": "\n     * Returns the next element from the iterator.\n     *\n     * @return the next element from the iterator\n     * @throws NoSuchElementException if there are no more elements\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 41)",
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.nextIndex()",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\n     * Returns the index of the next element.\n     *\n     * @return the index of the next element\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.previous()",
      "begin_line": 174,
      "end_line": 186,
      "comment": "\n     * Returns the the previous element.\n     *\n     * @return the previous element\n     * @throws NoSuchElementException  if there are no previous elements\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 185,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.previousIndex()",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Returns the index of the previous element.\n     *\n     * @return  the index of the previous element\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.remove()",
      "begin_line": 206,
      "end_line": 223,
      "comment": "\n     * Throws {@link UnsupportedOperationException} if {@link #previous()} has ever been called.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 39)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 26)",
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 31)",
        "(line 222,col 9)-(line 222,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.set(E)",
      "begin_line": 233,
      "end_line": 241,
      "comment": "\n     * Throws {@link UnsupportedOperationException}\n     * unless the underlying \u003ccode\u003eIterator\u003c/code\u003e is a \u003ccode\u003eListIterator\u003c/code\u003e.\n     *\n     * @param obj  the object to set\n     * @throws UnsupportedOperationException if the underlying iterator is not of\n     * type {@link ListIterator}\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ListIteratorWrapper.reset()",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\n     * Resets this iterator back to the position at which the iterator\n     * was created.\n     *\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 25)"
      ]
    }
  ]
}
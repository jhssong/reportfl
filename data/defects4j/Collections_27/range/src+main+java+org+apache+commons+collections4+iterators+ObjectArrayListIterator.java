{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/ObjectArrayListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectArrayListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.ObjectArrayIterator\u003cE\u003e",
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 194,
      "comment": "\n * Implements a {@link ListIterator} over an array of objects.\n * \u003cp\u003e\n * This iterator does not support {@link #add} or {@link #remove}, as the object array\n * cannot be structurally modified. The {@link #set} method is supported however.\n * \u003cp\u003e\n * The iterator implements a {@link #reset} method, allowing the reset of the iterator\n * back to the start if required.\n *\n * @see org.apache.commons.collections4.iterators.ObjectArrayIterator\n * @see java.util.Iterator\n * @see java.util.ListIterator\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastItemIndex"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Holds the index of the last item returned by a call to \u003ccode\u003enext()\u003c/code\u003e\n     * or \u003ccode\u003eprevious()\u003c/code\u003e. This is set to \u003ccode\u003e-1\u003c/code\u003e if neither method\n     * has yet been invoked. \u003ccode\u003elastItemIndex\u003c/code\u003e is used to to implement the\n     * {@link #set} method.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.ObjectArrayListIterator(E...)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructs an ObjectArrayListIterator that will iterate over the values in the\n     * specified array.\n     *\n     * @param array the array to iterate over\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.ObjectArrayListIterator(E[], int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Constructs an ObjectArrayListIterator that will iterate over the values in the\n     * specified array from a specific start index.\n     *\n     * @param array  the array to iterate over\n     * @param start  the index to start iterating at\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the start index is out of bounds\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.ObjectArrayListIterator(E[], int, int)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Construct an ObjectArrayListIterator that will iterate over a range of values\n     * in the specified array.\n     *\n     * @param array  the array to iterate over\n     * @param start  the index to start iterating at\n     * @param end  the index (exclusive) to finish iterating at\n     * @throws IndexOutOfBoundsException if the start or end index is out of bounds\n     * @throws IllegalArgumentException if end index is before the start\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.hasPrevious()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns true if there are previous elements to return from the array.\n     *\n     * @return true if there is a previous element to return\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.previous()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\n     * Gets the previous element from the array.\n     *\n     * @return the previous element\n     * @throws NoSuchElementException if there is no previous element\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 113,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.next()",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n     * Gets the next element from the array.\n     *\n     * @return the next element\n     * @throws NoSuchElementException if there is no next element\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 40)",
        "(line 128,col 9)-(line 128,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.nextIndex()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Gets the next index to be retrieved.\n     *\n     * @return the index of the item to be retrieved next\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.previousIndex()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Gets the index of the item to be retrieved if {@link #previous()} is called.\n     *\n     * @return the index of the item to be retrieved next\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.add(E)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * This iterator does not support modification of its backing array\u0027s size, and so will\n     * always throw an {@link UnsupportedOperationException} when this method is invoked.\n     *\n     * @param obj  the object to add\n     * @throws UnsupportedOperationException always thrown.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.set(E)",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * Sets the element under the cursor.\n     * \u003cp\u003e\n     * This method sets the element that was returned by the last call\n     * to {@link #next()} of {@link #previous()}.\n     *\n     * \u003cb\u003eNote:\u003c/b\u003e {@link ListIterator} implementations that support \u003ccode\u003eadd()\u003c/code\u003e\n     * and \u003ccode\u003eremove()\u003c/code\u003e only allow \u003ccode\u003eset()\u003c/code\u003e to be called once per call\n     * to \u003ccode\u003enext()\u003c/code\u003e or \u003ccode\u003eprevious\u003c/code\u003e (see the {@link ListIterator}\n     * javadoc for more details). Since this implementation does not support\n     * \u003ccode\u003eadd()\u003c/code\u003e or \u003ccode\u003eremove()\u003c/code\u003e, \u003ccode\u003eset()\u003c/code\u003e may be\n     * called as often as desired.\n     *\n     * @param obj  the object to set into the array\n     * @throws IllegalStateException if next() has not yet been called.\n     * @throws ClassCastException if the object type is unsuitable for the array\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayListIterator.reset()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     * Resets the iterator back to the start index.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 22)",
        "(line 191,col 9)-(line 191,col 32)"
      ]
    }
  ]
}
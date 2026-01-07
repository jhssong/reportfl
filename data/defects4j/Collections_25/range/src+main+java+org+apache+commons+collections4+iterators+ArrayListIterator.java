{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/ArrayListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.ArrayIterator\u003cE\u003e",
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 42,
      "end_line": 204,
      "comment": "\n * Implements a {@link ListIterator} over an array.\n * \u003cp\u003e\n * The array can be either an array of object or of primitives. If you know\n * that you have an object array, the {@link ObjectArrayListIterator}\n * class is a better choice, as it will perform better.\n *\n * \u003cp\u003e\n * This iterator does not support {@link #add(Object)} or {@link #remove()}, as the array\n * cannot be changed in size. The {@link #set(Object)} method is supported however.\n *\n * @see org.apache.commons.collections4.iterators.ArrayIterator\n * @see java.util.Iterator\n * @see java.util.ListIterator\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastItemIndex"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Holds the index of the last item returned by a call to \u003ccode\u003enext()\u003c/code\u003e\n     * or \u003ccode\u003eprevious()\u003c/code\u003e. This is set to \u003ccode\u003e-1\u003c/code\u003e if neither method\n     * has yet been invoked. \u003ccode\u003elastItemIndex\u003c/code\u003e is used to to implement\n     * the {@link #set} method.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.ArrayListIterator(java.lang.Object)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Constructs an ArrayListIterator that will iterate over the values in the\n     * specified array.\n     *\n     * @param array the array to iterate over\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.ArrayListIterator(java.lang.Object, int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructs an ArrayListIterator that will iterate over the values in the\n     * specified array from a specific start index.\n     *\n     * @param array  the array to iterate over\n     * @param startIndex  the index to start iterating at\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the start index is out of bounds\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.ArrayListIterator(java.lang.Object, int, int)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Construct an ArrayListIterator that will iterate over a range of values\n     * in the specified array.\n     *\n     * @param array  the array to iterate over\n     * @param startIndex  the index to start iterating at\n     * @param endIndex  the index (exclusive) to finish iterating at\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws IndexOutOfBoundsException if the start or end index is out of bounds\n     * @throws IllegalArgumentException if end index is before the start\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.hasPrevious()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Returns true if there are previous elements to return from the array.\n     *\n     * @return true if there is a previous element to return\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.previous()",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n     * Gets the previous element from the array.\n     *\n     * @return the previous element\n     * @throws NoSuchElementException if there is no previous element\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 120,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.next()",
      "begin_line": 129,
      "end_line": 137,
      "comment": "\n     * Gets the next element from the array.\n     *\n     * @return the next element\n     * @throws NoSuchElementException if there is no next element\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.nextIndex()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Gets the next index to be retrieved.\n     *\n     * @return the index of the item to be retrieved next\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.previousIndex()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Gets the index of the item to be retrieved if {@link #previous()} is called.\n     *\n     * @return the index of the item to be retrieved next\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.add(java.lang.Object)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * This iterator does not support modification of its backing collection, and so will\n     * always throw an {@link UnsupportedOperationException} when this method is invoked.\n     *\n     * @param o  the element to add\n     * @throws UnsupportedOperationException always thrown.\n     * @see java.util.ListIterator#set\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.set(java.lang.Object)",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * Sets the element under the cursor.\n     * \u003cp\u003e\n     * This method sets the element that was returned by the last call\n     * to {@link #next()} of {@link #previous()}.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e {@link ListIterator} implementations that support\n     * \u003ccode\u003eadd()\u003c/code\u003e and \u003ccode\u003eremove()\u003c/code\u003e only allow \u003ccode\u003eset()\u003c/code\u003e to be called\n     * once per call to \u003ccode\u003enext()\u003c/code\u003e or \u003ccode\u003eprevious\u003c/code\u003e (see the {@link ListIterator}\n     * javadoc for more details). Since this implementation does\n     * not support \u003ccode\u003eadd()\u003c/code\u003e or \u003ccode\u003eremove()\u003c/code\u003e, \u003ccode\u003eset()\u003c/code\u003e may be\n     * called as often as desired.\n     *\n     * @param o  the element to set\n     * @throws IllegalStateException if {@link #next()} or {@link #previous()} has not been called\n     * before {@link #set(Object)}\n     * @see java.util.ListIterator#set\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayListIterator.reset()",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n     * Resets the iterator back to the start index.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 22)",
        "(line 201,col 9)-(line 201,col 32)"
      ]
    }
  ]
}
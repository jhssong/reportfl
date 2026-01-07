{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/LoopingListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoopingListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 40,
      "end_line": 264,
      "comment": "\n * A ListIterator that restarts when it reaches the end or when it\n * reaches the beginning.\n * \u003cp\u003e\n * The iterator will loop continuously around the provided list,\n * unless there are no elements in the collection to begin with, or\n * all of the elements have been {@link #remove removed}.\n * \u003cp\u003e\n * Concurrent modifications are not directly supported, and for most\n * collection implementations will throw a\n * ConcurrentModificationException.\n *\n * @since 3.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The list to base the iterator on "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The current list iterator "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.LoopingListIterator(java.util.List\u003cE\u003e)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * Constructor that wraps a list.\n     * \u003cp\u003e\n     * There is no way to reset a ListIterator instance without\n     * recreating it from the original source, so the List must be\n     * passed in and a reference to it held.\n     *\n     * @param list the list to wrap\n     * @throws NullPointerException if the list it null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.hasNext()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Returns whether this iterator has any more elements.\n     * \u003cp\u003e\n     * Returns false only if the list originally had zero elements, or\n     * all elements have been {@link #remove removed}.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if there are more elements\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.next()",
      "begin_line": 86,
      "end_line": 96,
      "comment": "\n     * Returns the next object in the list.\n     * \u003cp\u003e\n     * If at the end of the list, returns the first element.\n     *\n     * @return the object after the last element returned\n     * @throws NoSuchElementException if there are no elements in the list\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.nextIndex()",
      "begin_line": 109,
      "end_line": 119,
      "comment": "\n     * Returns the index of the element that would be returned by a\n     * subsequent call to {@link #next}.\n     * \u003cp\u003e\n     * As would be expected, if the iterator is at the physical end of\n     * the underlying list, 0 is returned, signifying the beginning of\n     * the list.\n     *\n     * @return the index of the element that would be returned if next() were called\n     * @throws NoSuchElementException if there are no elements in the list\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.hasPrevious()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Returns whether this iterator has any more previous elements.\n     * \u003cp\u003e\n     * Returns false only if the list originally had zero elements, or\n     * all elements have been {@link #remove removed}.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if there are more elements\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.previous()",
      "begin_line": 143,
      "end_line": 158,
      "comment": "\n     * Returns the previous object in the list.\n     * \u003cp\u003e\n     * If at the beginning of the list, return the last element. Note\n     * that in this case, traversal to find that element takes linear time.\n     *\n     * @return the object before the last element returned\n     * @throws NoSuchElementException if there are no elements in the list\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.previousIndex()",
      "begin_line": 171,
      "end_line": 181,
      "comment": "\n     * Returns the index of the element that would be returned by a\n     * subsequent call to {@link #previous}.\n     * \u003cp\u003e\n     * As would be expected, if at the iterator is at the physical\n     * beginning of the underlying list, the list\u0027s size minus one is\n     * returned, signifying the end of the list.\n     *\n     * @return the index of the element that would be returned if previous() were called\n     * @throws NoSuchElementException if there are no elements in the list\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.remove()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Removes the previously retrieved item from the underlying list.\n     * \u003cp\u003e\n     * This feature is only supported if the underlying list\u0027s\n     * {@link List#iterator iterator} method returns an implementation\n     * that supports it.\n     * \u003cp\u003e\n     * This method can only be called after at least one {@link #next}\n     * or {@link #previous} method call. After a removal, the remove\n     * method may not be called again until another {@link #next} or\n     * {@link #previous} has been performed. If the {@link #reset} is\n     * called, then remove may not be called until {@link #next} or\n     * {@link #previous} is called again.\n     *\n     * @throws UnsupportedOperationException if the remove method is\n     * not supported by the iterator implementation of the underlying\n     * list\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.add(E)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Inserts the specified element into the underlying list.\n     * \u003cp\u003e\n     * The element is inserted before the next element that would be\n     * returned by {@link #next}, if any, and after the next element\n     * that would be returned by {@link #previous}, if any.\n     * \u003cp\u003e\n     * This feature is only supported if the underlying list\u0027s\n     * {@link List#listIterator} method returns an implementation\n     * that supports it.\n     *\n     * @param obj  the element to insert\n     * @throws UnsupportedOperationException if the add method is not\n     *  supported by the iterator implementation of the underlying list\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.set(E)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Replaces the last element that was returned by {@link #next} or\n     * {@link #previous}.\n     * \u003cp\u003e\n     * This feature is only supported if the underlying list\u0027s\n     * {@link List#listIterator} method returns an implementation\n     * that supports it.\n     *\n     * @param obj  the element with which to replace the last element returned\n     * @throws UnsupportedOperationException if the set method is not\n     *  supported by the iterator implementation of the underlying list\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.reset()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * Resets the iterator back to the start of the list.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator._reset()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.LoopingListIterator.size()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Gets the size of the list underlying the iterator.\n     *\n     * @return the current list size\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 27)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/ReverseListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReverseListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 177,
      "comment": "\n * Iterates backwards through a List, starting with the last element\n * and continuing to the first. This is useful for looping around\n * a list in reverse order without needing to actually reverse the list.\n * \u003cp\u003e\n * The first call to \u003ccode\u003enext()\u003c/code\u003e will return the last element\n * from the list, and so on. The \u003ccode\u003ehasNext()\u003c/code\u003e method works\n * in concert with the \u003ccode\u003enext()\u003c/code\u003e method as expected.\n * However, the \u003ccode\u003enextIndex()\u003c/code\u003e method returns the correct\n * index in the list, thus it starts high and reduces as the iteration\n * continues. The previous methods work similarly.\n *\n * @since 3.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The list being wrapped. "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The list iterator being wrapped. "
    },
    {
      "type": "field",
      "varNames": [
        "validForUpdate"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Flag to indicate if updating is possible at the moment. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.ReverseListIterator(java.util.List\u003cE\u003e)",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * Constructor that wraps a list.\n     *\n     * @param list  the list to create a reversed iterator for\n     * @throws NullPointerException if the list is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 60,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.hasNext()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Checks whether there is another element.\n     *\n     * @return true if there is another element\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.next()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Gets the next element.\n     * The next element is the previous in the list.\n     *\n     * @return the next element in the iterator\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 42)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.nextIndex()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Gets the index of the next element.\n     *\n     * @return the index of the next element in the iterator\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.hasPrevious()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Checks whether there is a previous element.\n     *\n     * @return true if there is a previous element\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.previous()",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Gets the previous element.\n     * The next element is the previous in the list.\n     *\n     * @return the previous element in the iterator\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 38)",
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.previousIndex()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Gets the index of the previous element.\n     *\n     * @return the index of the previous element in the iterator\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.remove()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Removes the last returned element.\n     *\n     * @throws UnsupportedOperationException if the list is unmodifiable\n     * @throws IllegalStateException if there is no element to remove\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.set(E)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * Replaces the last returned element.\n     *\n     * @param obj  the object to set\n     * @throws UnsupportedOperationException if the list is unmodifiable\n     * @throws IllegalStateException if the iterator is not in a valid state for set\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.add(E)",
      "begin_line": 158,
      "end_line": 167,
      "comment": "\n     * Adds a new element to the list between the next and previous elements.\n     *\n     * @param obj  the object to add\n     * @throws UnsupportedOperationException if the list is unmodifiable\n     * @throws IllegalStateException if the iterator is not in a valid state for set\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 31)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 166,col 9)-(line 166,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.reset()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Resets the iterator back to the start (which is the\n     * end of the list as this is a reversed iterator)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 50)"
      ]
    }
  ]
}
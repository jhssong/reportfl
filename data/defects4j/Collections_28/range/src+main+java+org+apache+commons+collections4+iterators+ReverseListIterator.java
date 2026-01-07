{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/ReverseListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReverseListIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableListIterator\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 187,
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
      "end_line": 72,
      "comment": "\n     * Checks whether there is another element.\n     *\n     * @return true if there is another element\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.next()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Gets the next element.\n     * The next element is the previous in the list.\n     *\n     * @return the next element in the iterator\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 42)",
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.nextIndex()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Gets the index of the next element.\n     *\n     * @return the index of the next element in the iterator\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.hasPrevious()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Checks whether there is a previous element.\n     *\n     * @return true if there is a previous element\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.previous()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Gets the previous element.\n     * The next element is the previous in the list.\n     *\n     * @return the previous element in the iterator\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 38)",
        "(line 116,col 9)-(line 116,col 30)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.previousIndex()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Gets the index of the previous element.\n     *\n     * @return the index of the previous element in the iterator\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.remove()",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Removes the last returned element.\n     *\n     * @throws UnsupportedOperationException if the list is unmodifiable\n     * @throws IllegalStateException if there is no element to remove\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.set(E)",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n     * Replaces the last returned element.\n     *\n     * @param obj  the object to set\n     * @throws UnsupportedOperationException if the list is unmodifiable\n     * @throws IllegalStateException if the iterator is not in a valid state for set\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.add(E)",
      "begin_line": 166,
      "end_line": 176,
      "comment": "\n     * Adds a new element to the list between the next and previous elements.\n     *\n     * @param obj  the object to add\n     * @throws UnsupportedOperationException if the list is unmodifiable\n     * @throws IllegalStateException if the iterator is not in a valid state for set\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 31)",
        "(line 174,col 9)-(line 174,col 26)",
        "(line 175,col 9)-(line 175,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ReverseListIterator.reset()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Resets the iterator back to the start (which is the\n     * end of the list as this is a reversed iterator)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 50)"
      ]
    }
  ]
}
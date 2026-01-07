{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/ArrayIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 38,
      "end_line": 200,
      "comment": "\n * Implements an {@link java.util.Iterator Iterator} over any array.\n * \u003cp\u003e\n * The array can be either an array of object or of primitives. If you know\n * that you have an object array, the\n * {@link org.apache.commons.collections4.iterators.ObjectArrayIterator ObjectArrayIterator}\n * class is a better choice, as it will perform better.\n * \u003cp\u003e\n * The iterator implements a {@link #reset} method, allowing the reset of\n * the iterator back to the start if required.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The array to iterate over "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The start index to loop from "
    },
    {
      "type": "field",
      "varNames": [
        "endIndex"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The end index to loop to "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The current iterator index "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.ArrayIterator(java.lang.Object)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Constructs an ArrayIterator that will iterate over the values in the\n     * specified array.\n     *\n     * @param array the array to iterate over.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.ArrayIterator(java.lang.Object, int)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructs an ArrayIterator that will iterate over the values in the\n     * specified array from a specific start index.\n     *\n     * @param array  the array to iterate over.\n     * @param startIndex  the index to start iterating at.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.ArrayIterator(java.lang.Object, int, int)",
      "begin_line": 88,
      "end_line": 102,
      "comment": "\n     * Construct an ArrayIterator that will iterate over a range of values\n     * in the specified array.\n     *\n     * @param array  the array to iterate over.\n     * @param startIndex  the index to start iterating at.\n     * @param endIndex  the index to finish iterating at.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if either index is invalid\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)",
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 33)",
        "(line 94,col 9)-(line 94,col 32)",
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 97,col 45)",
        "(line 98,col 9)-(line 98,col 41)",
        "(line 99,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.checkBound(int, int, java.lang.String)",
      "begin_line": 112,
      "end_line": 125,
      "comment": "\n     * Checks whether the index is valid or not.\n     *\n     * @param bound  the index to check\n     * @param len  the length of the array\n     * @param type  the index type (for error messages)\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.hasNext()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns true if there are more elements to return from the array.\n     *\n     * @return true if there is a next element to return\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.next()",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n     * Returns the next element in the array.\n     *\n     * @return the next element in the array\n     * @throws NoSuchElementException if all the elements in the array\n     *  have already been returned\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.remove()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Throws {@link UnsupportedOperationException}.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.getArray()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Gets the array that this iterator is iterating over.\n     *\n     * @return the array this iterator iterates over.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.getStartIndex()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Gets the start index to loop from.\n     *\n     * @return the start index\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.getEndIndex()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Gets the end index to loop to.\n     *\n     * @return the end index\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.reset()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Resets the iterator back to the start index.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 37)"
      ]
    }
  ]
}
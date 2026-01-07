{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/ArrayIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 39,
      "end_line": 205,
      "comment": "\n * Implements an {@link java.util.Iterator Iterator} over any array.\n * \u003cp\u003e\n * The array can be either an array of object or of primitives. If you know\n * that you have an object array, the\n * {@link org.apache.commons.collections4.iterators.ObjectArrayIterator ObjectArrayIterator}\n * class is a better choice, as it will perform better.\n * \u003cp\u003e\n * The iterator implements a {@link #reset} method, allowing the reset of\n * the iterator back to the start if required.\n *\n * @param \u003cE\u003e the type of elements returned by this iterator\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The array to iterate over "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The start index to loop from "
    },
    {
      "type": "field",
      "varNames": [
        "endIndex"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The end index to loop to "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The current iterator index "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.ArrayIterator(java.lang.Object)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Constructs an ArrayIterator that will iterate over the values in the\n     * specified array.\n     *\n     * @param array the array to iterate over.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.ArrayIterator(java.lang.Object, int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Constructs an ArrayIterator that will iterate over the values in the\n     * specified array from a specific start index.\n     *\n     * @param array  the array to iterate over.\n     * @param startIndex  the index to start iterating at.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.ArrayIterator(java.lang.Object, int, int)",
      "begin_line": 89,
      "end_line": 103,
      "comment": "\n     * Construct an ArrayIterator that will iterate over a range of values\n     * in the specified array.\n     *\n     * @param array  the array to iterate over.\n     * @param startIndex  the index to start iterating at.\n     * @param endIndex  the index to finish iterating at.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is not an array.\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if either index is invalid\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 16)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 37)",
        "(line 94,col 9)-(line 94,col 33)",
        "(line 95,col 9)-(line 95,col 32)",
        "(line 97,col 9)-(line 97,col 47)",
        "(line 98,col 9)-(line 98,col 45)",
        "(line 99,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.checkBound(int, int, java.lang.String)",
      "begin_line": 113,
      "end_line": 126,
      "comment": "\n     * Checks whether the index is valid or not.\n     *\n     * @param bound  the index to check\n     * @param len  the length of the array\n     * @param type  the index type (for error messages)\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.hasNext()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Returns true if there are more elements to return from the array.\n     *\n     * @return true if there is a next element to return\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.next()",
      "begin_line": 147,
      "end_line": 154,
      "comment": "\n     * Returns the next element in the array.\n     *\n     * @return the next element in the array\n     * @throws NoSuchElementException if all the elements in the array\n     *  have already been returned\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.remove()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n     * Throws {@link UnsupportedOperationException}.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.getArray()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Gets the array that this iterator is iterating over.\n     *\n     * @return the array this iterator iterates over.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.getStartIndex()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Gets the start index to loop from.\n     *\n     * @return the start index\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.getEndIndex()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Gets the end index to loop to.\n     *\n     * @return the end index\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ArrayIterator.reset()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Resets the iterator back to the start index.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 37)"
      ]
    }
  ]
}
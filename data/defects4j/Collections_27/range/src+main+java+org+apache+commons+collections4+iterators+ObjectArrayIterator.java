{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/ObjectArrayIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectArrayIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 35,
      "end_line": 174,
      "comment": "\n * An {@link Iterator} over an array of objects.\n * \u003cp\u003e\n * This iterator does not support {@link #remove}, as the object array cannot be\n * structurally modified.\n * \u003cp\u003e\n * The iterator implements a {@link #reset} method, allowing the reset of the iterator\n * back to the start if required.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The array "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The start index to loop from "
    },
    {
      "type": "field",
      "varNames": [
        "endIndex"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The end index to loop to "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The current iterator index "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.ObjectArrayIterator(E...)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructs an ObjectArrayIterator that will iterate over the values in the\n     * specified array.\n     *\n     * @param array the array to iterate over\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.ObjectArrayIterator(E[], int)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructs an ObjectArrayIterator that will iterate over the values in the\n     * specified array from a specific start index.\n     *\n     * @param array  the array to iterate over\n     * @param start  the index to start iterating at\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the start index is out of bounds\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.ObjectArrayIterator(E[], int, int)",
      "begin_line": 82,
      "end_line": 100,
      "comment": "\n     * Construct an ObjectArrayIterator that will iterate over a range of values\n     * in the specified array.\n     *\n     * @param array  the array to iterate over\n     * @param start  the index to start iterating at\n     * @param end  the index (exclusive) to finish iterating at\n     * @throws IndexOutOfBoundsException if the start or end index is out of bounds\n     * @throws IllegalArgumentException if end index is before the start\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 27)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 98,col 28)",
        "(line 99,col 9)-(line 99,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.hasNext()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns true if there are more elements to return from the array.\n     *\n     * @return true if there is a next element to return\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.next()",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * Returns the next element in the array.\n     *\n     * @return the next element in the array\n     * @throws NoSuchElementException if all the elements in the array\n     *    have already been returned\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.remove()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Throws {@link UnsupportedOperationException}.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.getArray()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Gets the array that this iterator is iterating over.\n     *\n     * @return the array this iterator iterates over\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.getStartIndex()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Gets the start index to loop from.\n     *\n     * @return the start index\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.getEndIndex()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Gets the end index to loop to.\n     *\n     * @return the end index\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.reset()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Resets the iterator back to the start index.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 37)"
      ]
    }
  ]
}
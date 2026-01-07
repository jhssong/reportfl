{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/ObjectArrayIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectArrayIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.ResettableIterator\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 179,
      "comment": "\n * An {@link java.util.Iterator Iterator} over an array of objects.\n * \u003cp\u003e\n * This iterator does not support {@link #remove}, as the object array cannot be\n * structurally modified.\n * \u003cp\u003e\n * The iterator implements a {@link #reset} method, allowing the reset of the iterator\n * back to the start if required.\n *\n * @param \u003cE\u003e the type to iterate over\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The array "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The start index to loop from "
    },
    {
      "type": "field",
      "varNames": [
        "endIndex"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The end index to loop to "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The current iterator index "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.ObjectArrayIterator(E...)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Constructs an ObjectArrayIterator that will iterate over the values in the\n     * specified array.\n     *\n     * @param array the array to iterate over\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.ObjectArrayIterator(E[], int)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructs an ObjectArrayIterator that will iterate over the values in the\n     * specified array from a specific start index.\n     *\n     * @param array  the array to iterate over\n     * @param start  the index to start iterating at\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the start index is out of bounds\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.ObjectArrayIterator(E[], int, int)",
      "begin_line": 83,
      "end_line": 101,
      "comment": "\n     * Construct an ObjectArrayIterator that will iterate over a range of values\n     * in the specified array.\n     *\n     * @param array  the array to iterate over\n     * @param start  the index to start iterating at\n     * @param end  the index (exclusive) to finish iterating at\n     * @throws IndexOutOfBoundsException if the start or end index is out of bounds\n     * @throws IllegalArgumentException if end index is before the start\n     * @throws NullPointerException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 16)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 32)",
        "(line 99,col 9)-(line 99,col 28)",
        "(line 100,col 9)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.hasNext()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * Returns true if there are more elements to return from the array.\n     *\n     * @return true if there is a next element to return\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.next()",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\n     * Returns the next element in the array.\n     *\n     * @return the next element in the array\n     * @throws NoSuchElementException if all the elements in the array\n     *    have already been returned\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.remove()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Throws {@link UnsupportedOperationException}.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.getArray()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Gets the array that this iterator is iterating over.\n     *\n     * @return the array this iterator iterates over\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.getStartIndex()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Gets the start index to loop from.\n     *\n     * @return the start index\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.getEndIndex()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Gets the end index to loop to.\n     *\n     * @return the end index\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.ObjectArrayIterator.reset()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Resets the iterator back to the start index.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 37)"
      ]
    }
  ]
}
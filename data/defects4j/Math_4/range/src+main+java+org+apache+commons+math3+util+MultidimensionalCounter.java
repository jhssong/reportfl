{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/MultidimensionalCounter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultidimensionalCounter",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 46,
      "end_line": 298,
      "comment": "\n * Converter between unidimensional storage structure and multidimensional\n * conceptual structure.\n * This utility will convert from indices in a multidimensional structure\n * to the corresponding index in a one-dimensional array. For example,\n * assuming that the ranges (in 3 dimensions) of indices are 2, 4 and 3,\n * the following correspondences, between 3-tuples indices and unidimensional\n * indices, will hold:\n * \u003cul\u003e\n *  \u003cli\u003e(0, 0, 0) corresponds to 0\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 1) corresponds to 1\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 2) corresponds to 2\u003c/li\u003e\n *  \u003cli\u003e(0, 1, 0) corresponds to 3\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 0, 0) corresponds to 12\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 3, 2) corresponds to 23\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Number of dimensions.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uniCounterOffset"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Offset for each dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Counter sizes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "totalSize"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Total number of (one-dimensional) slots.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Index of last dimension.\n     "
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 71,
      "end_line": 156,
      "comment": "\n     * Perform iteration over the multidimensional counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n         * Multidimensional counter.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n         * Unidimensional counter.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.Iterator()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n         * Create an iterator\n         * @see #iterator()\n         ",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.hasNext()",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 93,col 13)-(line 97,col 13)",
        "(line 98,col 13)-(line 98,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.next()",
      "begin_line": 105,
      "end_line": 116,
      "comment": "\n         * @return the unidimensional count after the counter has been\n         * incremented by {@code 1}.\n         ",
      "child_ranges": [
        "(line 106,col 13)-(line 113,col 13)",
        "(line 115,col 13)-(line 115,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCount()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n         * Get the current unidimensional counter slot.\n         *\n         * @return the index within the unidimensionl counter.\n         ",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCounts()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n         * Get the current multidimensional counter slots.\n         *\n         * @return the indices within the multidimensional counter.\n         ",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCount(int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n         * Get the current count in the selected dimension.\n         *\n         * @param dim Dimension index.\n         * @return the count at the corresponding index for the current state\n         * of the iterator.\n         * @throws IndexOutOfBoundsException if {@code index} is not in the\n         * correct interval (as defined by the length of the argument in the\n         * {@link MultidimensionalCounter#MultidimensionalCounter(int[])\n         * constructor of the enclosing class}).\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.remove()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n         * @throws UnsupportedOperationException\n         ",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.MultidimensionalCounter(int...)",
      "begin_line": 165,
      "end_line": 188,
      "comment": "\n     * Create a counter.\n     *\n     * @param size Counter sizes (number of slots in each dimension).\n     * @throws NotStrictlyPositiveException if one of the sizes is\n     * negative or zero.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 32)",
        "(line 167,col 9)-(line 167,col 44)",
        "(line 169,col 9)-(line 169,col 46)",
        "(line 171,col 9)-(line 171,col 29)",
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.iterator()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Create an iterator over this counter.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getDimension()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Get the number of dimensions of the multidimensional counter.\n     *\n     * @return the number of dimensions.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getCounts(int)",
      "begin_line": 216,
      "end_line": 240,
      "comment": "\n     * Convert to multidimensional counter.\n     *\n     * @param index Index in unidimensional counter.\n     * @return the multidimensional counts.\n     * @throws OutOfRangeException if {@code index} is not between\n     * {@code 0} and the value returned by {@link #getSize()} (excluded).\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 49)",
        "(line 224,col 9)-(line 224,col 22)",
        "(line 225,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 38)",
        "(line 239,col 9)-(line 239,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getCount(int...)",
      "begin_line": 253,
      "end_line": 268,
      "comment": "\n     * Convert to unidimensional counter.\n     *\n     * @param c Indices in multidimensional counter.\n     * @return the index within the unidimensionl counter.\n     * @throws DimensionMismatchException if the size of {@code c}\n     * does not match the size of the array given in the constructor.\n     * @throws OutOfRangeException if a value of {@code c} is not in\n     * the range of the corresponding dimension, as defined in the\n     * {@link MultidimensionalCounter#MultidimensionalCounter(int...) constructor}.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 22)",
        "(line 259,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getSize()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Get the total number of elements.\n     *\n     * @return the total size of the unidimensional counter.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getSizes()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Get the number of multidimensional counter slots in each dimension.\n     *\n     * @return the sizes of the multidimensional counter in each dimension.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.toString()",
      "begin_line": 290,
      "end_line": 297,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 53)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 29)"
      ]
    }
  ]
}
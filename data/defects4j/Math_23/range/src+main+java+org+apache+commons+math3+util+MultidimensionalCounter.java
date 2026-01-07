{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/util/MultidimensionalCounter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultidimensionalCounter",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 47,
      "end_line": 307,
      "comment": "\n * Converter between unidimensional storage structure and multidimensional\n * conceptual structure.\n * This utility will convert from indices in a multidimensional structure\n * to the corresponding index in a one-dimensional array. For example,\n * assuming that the ranges (in 3 dimensions) of indices are 2, 4 and 3,\n * the following correspondences, between 3-tuples indices and unidimensional\n * indices, will hold:\n * \u003cul\u003e\n *  \u003cli\u003e(0, 0, 0) corresponds to 0\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 1) corresponds to 1\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 2) corresponds to 2\u003c/li\u003e\n *  \u003cli\u003e(0, 1, 0) corresponds to 3\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 0, 0) corresponds to 12\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 3, 2) corresponds to 23\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Number of dimensions.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uniCounterOffset"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Offset for each dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Counter sizes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "totalSize"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Total number of (one-dimensional) slots.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Index of last dimension.\n     "
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 72,
      "end_line": 157,
      "comment": "\n     * Perform iteration over the multidimensional counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n         * Multidimensional counter.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n         * Unidimensional counter.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.Iterator()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n         * Create an iterator\n         * @see #iterator()\n         ",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.hasNext()",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 94,col 13)-(line 98,col 13)",
        "(line 99,col 13)-(line 99,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.next()",
      "begin_line": 106,
      "end_line": 117,
      "comment": "\n         * @return the unidimensional count after the counter has been\n         * incremented by {@code 1}.\n         ",
      "child_ranges": [
        "(line 107,col 13)-(line 114,col 13)",
        "(line 116,col 13)-(line 116,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCount()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n         * Get the current unidimensional counter slot.\n         *\n         * @return the index within the unidimensionl counter.\n         ",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCounts()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n         * Get the current multidimensional counter slots.\n         *\n         * @return the indices within the multidimensional counter.\n         ",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCount(int)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n         * Get the current count in the selected dimension.\n         *\n         * @param dim Dimension index.\n         * @return the count at the corresponding index for the current state\n         * of the iterator.\n         * @throws IndexOutOfBoundsException if {@code index} is not in the\n         * correct interval (as defined by the length of the argument in the\n         * {@link MultidimensionalCounter#MultidimensionalCounter(int[])\n         * constructor of the enclosing class}).\n         ",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.remove()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n         * @throws UnsupportedOperationException\n         ",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.MultidimensionalCounter(int...)",
      "begin_line": 166,
      "end_line": 189,
      "comment": "\n     * Create a counter.\n     *\n     * @param size Counter sizes (number of slots in each dimension).\n     * @throws NotStrictlyPositiveException if one of the sizes is\n     * negative or zero.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 32)",
        "(line 168,col 9)-(line 168,col 44)",
        "(line 170,col 9)-(line 170,col 46)",
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 28)",
        "(line 174,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 35)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.iterator()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Create an iterator over this counter.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getDimension()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Get the number of dimensions of the multidimensional counter.\n     *\n     * @return the number of dimensions.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getCounts(int)",
      "begin_line": 217,
      "end_line": 241,
      "comment": "\n     * Convert to multidimensional counter.\n     *\n     * @param index Index in unidimensional counter.\n     * @return the multidimensional counts.\n     * @throws OutOfRangeException if {@code index} is not between\n     * {@code 0} and the value returned by {@link #getSize()} (excluded).\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 225,col 9)-(line 225,col 22)",
        "(line 226,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 240,col 9)-(line 240,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getCount(int...)",
      "begin_line": 254,
      "end_line": 269,
      "comment": "\n     * Convert to unidimensional counter.\n     *\n     * @param c Indices in multidimensional counter.\n     * @return the index within the unidimensionl counter.\n     * @throws DimensionMismatchException if the size of {@code c}\n     * does not match the size of the array given in the constructor.\n     * @throws OutOfRangeException if a value of {@code c} is not in\n     * the range of the corresponding dimension, as defined in the\n     * {@link MultidimensionalCounter#MultidimensionalCounter(int...) constructor}.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 22)",
        "(line 260,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getSize()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Get the total number of elements.\n     *\n     * @return the total size of the unidimensional counter.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getSizes()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Get the number of multidimensional counter slots in each dimension.\n     *\n     * @return the sizes of the multidimensional counter in each dimension.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.toString()",
      "begin_line": 291,
      "end_line": 306,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 53)",
        "(line 294,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 29)"
      ]
    }
  ]
}
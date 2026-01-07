{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/util/MultidimensionalCounter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultidimensionalCounter",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 45,
      "end_line": 296,
      "comment": "\n * Converter between unidimensional storage structure and multidimensional\n * conceptual structure.\n * This utility will convert from indices in a multidimensional structure\n * to the corresponding index in a one-dimensional array. For example,\n * assuming that the ranges (in 3 dimensions) of indices are 2, 4 and 3,\n * the following correspondences, between 3-tuples indices and unidimensional\n * indices, will hold:\n * \u003cul\u003e\n *  \u003cli\u003e(0, 0, 0) corresponds to 0\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 1) corresponds to 1\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 2) corresponds to 2\u003c/li\u003e\n *  \u003cli\u003e(0, 1, 0) corresponds to 3\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 0, 0) corresponds to 12\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 3, 2) corresponds to 23\u003c/li\u003e\n * \u003c/ul\u003e\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Number of dimensions.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uniCounterOffset"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Offset for each dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Counter sizes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "totalSize"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Total number of (one-dimensional) slots.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Index of last dimension.\n     "
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 70,
      "end_line": 155,
      "comment": "\n     * Perform iteration over the multidimensional counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n         * Multidimensional counter.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n         * Unidimensional counter.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.Iterator()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n         * Create an iterator\n         * @see #iterator()\n         ",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.hasNext()",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 92,col 13)-(line 96,col 13)",
        "(line 97,col 13)-(line 97,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.next()",
      "begin_line": 104,
      "end_line": 115,
      "comment": "\n         * @return the unidimensional count after the counter has been\n         * incremented by {@code 1}.\n         ",
      "child_ranges": [
        "(line 105,col 13)-(line 112,col 13)",
        "(line 114,col 13)-(line 114,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCount()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n         * Get the current unidimensional counter slot.\n         *\n         * @return the index within the unidimensionl counter.\n         ",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCounts()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n         * Get the current multidimensional counter slots.\n         *\n         * @return the indices within the multidimensional counter.\n         ",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.getCount(int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n         * Get the current count in the selected dimension.\n         *\n         * @param dim Dimension index.\n         * @return the count at the corresponding index for the current state\n         * of the iterator.\n         * @throws IndexOutOfBoundsException if {@code index} is not in the\n         * correct interval (as defined by the length of the argument in the\n         * {@link MultidimensionalCounter#MultidimensionalCounter(int[])\n         * constructor of the enclosing class}).\n         ",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.Iterator.remove()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n         * @throws UnsupportedOperationException\n         ",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.MultidimensionalCounter(int...)",
      "begin_line": 164,
      "end_line": 187,
      "comment": "\n     * Create a counter.\n     *\n     * @param size Counter sizes (number of slots in each dimension).\n     * @throws NotStrictlyPositiveException if one of the sizes is\n     * negative or zero.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)",
        "(line 166,col 9)-(line 166,col 44)",
        "(line 168,col 9)-(line 168,col 46)",
        "(line 170,col 9)-(line 170,col 29)",
        "(line 171,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 35)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.iterator()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Create an iterator over this counter.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getDimension()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Get the number of dimensions of the multidimensional counter.\n     *\n     * @return the number of dimensions.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getCounts(int)",
      "begin_line": 215,
      "end_line": 239,
      "comment": "\n     * Convert to multidimensional counter.\n     *\n     * @param index Index in unidimensional counter.\n     * @return the multidimensional counts.\n     * @throws OutOfRangeException if {@code index} is not between\n     * {@code 0} and the value returned by {@link #getSize()} (excluded).\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 49)",
        "(line 223,col 9)-(line 223,col 22)",
        "(line 224,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 238,col 9)-(line 238,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getCount(int...)",
      "begin_line": 252,
      "end_line": 266,
      "comment": "\n     * Convert to unidimensional counter.\n     *\n     * @param c Indices in multidimensional counter.\n     * @return the index within the unidimensionl counter.\n     * @throws DimensionMismatchException if the size of {@code c}\n     * does not match the size of the array given in the constructor.\n     * @throws OutOfRangeException if a value of {@code c} is not in\n     * the range of the corresponding dimension, as defined in the\n     * {@link MultidimensionalCounter#MultidimensionalCounter(int...) constructor}.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 22)",
        "(line 257,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getSize()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Get the total number of elements.\n     *\n     * @return the total size of the unidimensional counter.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.getSizes()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Get the number of multidimensional counter slots in each dimension.\n     *\n     * @return the sizes of the multidimensional counter in each dimension.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MultidimensionalCounter.toString()",
      "begin_line": 288,
      "end_line": 295,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 53)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 29)"
      ]
    }
  ]
}
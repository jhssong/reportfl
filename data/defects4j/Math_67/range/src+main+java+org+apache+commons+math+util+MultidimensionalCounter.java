{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/util/MultidimensionalCounter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultidimensionalCounter",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 44,
      "end_line": 299,
      "comment": "\n * Converter between unidimensional storage structure and multidimensional\n * conceptual structure.\n * This utility will convert from indices in a multidimensional structure\n * to the corresponding index in a one-dimensional array. For example,\n * assuming that the ranges (in 3 dimensions) of indices are 2, 4 and 3,\n * the following correspondences, between 3-tuples indices and unidimensional\n * indices, will hold:\n * \u003cul\u003e\n *  \u003cli\u003e(0, 0, 0) corresponds to 0\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 1) corresponds to 1\u003c/li\u003e\n *  \u003cli\u003e(0, 0, 2) corresponds to 2\u003c/li\u003e\n *  \u003cli\u003e(0, 1, 0) corresponds to 3\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 0, 0) corresponds to 12\u003c/li\u003e\n *  \u003cli\u003e...\u003c/li\u003e\n *  \u003cli\u003e(1, 3, 2) corresponds to 23\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Number of dimensions.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "uniCounterOffset"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Offset for each dimension.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Counter sizes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "totalSize"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Total number of (one-dimensional) slots.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Index of last dimension.\n     "
    },
    {
      "type": "class_interface",
      "name": "Iterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 69,
      "end_line": 153,
      "comment": "\n     * Perform iteration over the multidimensional counter.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n         * Multidimensional counter.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n         * Unidimensional counter.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.Iterator()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n         * Create an iterator (see {@link MultidimensionalCounter#iterator()}.\n         ",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.hasNext()",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 90,col 13)-(line 94,col 13)",
        "(line 95,col 13)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.next()",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\n         * @return the unidimensional count after the counter has been\n         * incremented by {@code 1}.\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 110,col 13)",
        "(line 112,col 13)-(line 112,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.getCount()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n         * Get the current unidimensional counter slot.\n         *\n         * @return the index within the unidimensionl counter.\n         ",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.getCounts()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n         * Get the current multidimensional counter slots.\n         *\n         * @return the indices within the multidimensional counter.\n         ",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.getCount(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n         * Get the current count in the selected dimension.\n         *\n         * @param dim Dimension index.\n         * @return the count at the corresponding index for the current state\n         * of the iterator.\n         * @throws IndexOutOfBoundsException if {@code index} is not in the\n         * correct interval (as defined by the length of the argument in the\n         * {@link MultidimensionalCounter#MultidimensionalCounter(int[])\n         * constructor of the enclosing class}).\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.Iterator.remove()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n         * @throws UnsupportedOperationException.\n         ",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.MultidimensionalCounter(int...)",
      "begin_line": 162,
      "end_line": 185,
      "comment": "\n     * Create a counter.\n     *\n     * @param size Counter sizes (number of slots in each dimension).\n     * @throws {@link NotStrictlyPositiveException} if one of the sizes is\n     * negative or zero.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 32)",
        "(line 164,col 9)-(line 164,col 51)",
        "(line 166,col 9)-(line 166,col 46)",
        "(line 168,col 9)-(line 168,col 29)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.iterator()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Create an iterator over this counter.\n     *\n     * @return the iterator.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.getDimension()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Get the number of dimensions of the multidimensional counter.\n     *\n     * @return the number of dimensions.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.getCounts(int)",
      "begin_line": 213,
      "end_line": 243,
      "comment": "\n     * Convert to multidimensional counter.\n     *\n     * @param index Index in unidimensional counter.\n     * @return the multidimensional counts.\n     * @throws {@link OutOfRangeException} if {@code index} is not between\n     * {@code 0} and the value returned by {@link #getSize()} (excluded).\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 49)",
        "(line 221,col 9)-(line 221,col 22)",
        "(line 222,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 20)",
        "(line 235,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 14)",
        "(line 240,col 9)-(line 240,col 28)",
        "(line 242,col 9)-(line 242,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.getCount(int...)",
      "begin_line": 256,
      "end_line": 270,
      "comment": "\n     * Convert to unidimensional counter.\n     *\n     * @param c Indices in multidimensional counter.\n     * @return the index within the unidimensionl counter.\n     * @throws {@link DimensionMismatchException} if the size of {@code c}\n     * does not match the size of the array given in the contructor.\n     * @throws {@link OutOfRangeException} if a value of {@code c} is not in\n     * the range of the corresponding dimension, as defined in the\n     * {@link #MultidimensionalCounter(int[]) constructor}.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)",
        "(line 261,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.getSize()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Get the total number of elements.\n     *\n     * @return the total size of the unidimensional counter.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.getSizes()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Get the number of multidimensional counter slots in each dimension.\n     *\n     * @return the sizes of the multidimensional counter in each dimension.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MultidimensionalCounter.toString()",
      "begin_line": 292,
      "end_line": 298,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 53)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 29)"
      ]
    }
  ]
}
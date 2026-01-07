{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/PermutationIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PermutationIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.List\u003cE\u003e\u003e"
      ],
      "begin_line": 44,
      "end_line": 156,
      "comment": "\n * This iterator creates permutations of an input collection, using the\n * Steinhaus-Johnson-Trotter algorithm (also called plain changes).\n * \u003cp\u003e\n * The iterator will return exactly n! permutations of the input collection.\n * The {@code remove()} operation is not supported, and will throw an\n * {@code UnsupportedOperationException}.\n * \u003cp\u003e\n * NOTE: in case an empty collection is provided, the iterator will\n * return exactly one empty list as result, as 0! \u003d 1.\n *\n * @param \u003cE\u003e  the type of the objects being permuted\n *\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Permutation is done on theses keys to handle equal objects.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "objectMap"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Mapping between keys and objects.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Direction table used in the algorithm:\n     * \u003cul\u003e\n     *   \u003cli\u003efalse is left\u003c/li\u003e\n     *   \u003cli\u003etrue is right\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextPermutation"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Next permutation to return. When a permutation is requested\n     * this instance is provided and the next one is computed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.PermutationIterator.PermutationIterator(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 76,
      "end_line": 92,
      "comment": "\n     * Standard constructor for this class.\n     * @param coll  the collection to generate permutations for\n     * @throws NullPointerException if coll is null\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 82,col 9)-(line 82,col 45)",
        "(line 83,col 9)-(line 83,col 38)",
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PermutationIterator.hasNext()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Indicates if there are more permutation available.\n     * @return true if there are more permutations, otherwise false\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PermutationIterator.next()",
      "begin_line": 107,
      "end_line": 150,
      "comment": "\n     * Returns the next permutation of the input collection.\n     * @return a list of the permutator\u0027s elements representing a permutation\n     * @throws NoSuchElementException if there are no more permutations\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 113,col 45)",
        "(line 114,col 9)-(line 114,col 28)",
        "(line 115,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 131,col 75)",
        "(line 132,col 9)-(line 132,col 61)",
        "(line 133,col 9)-(line 133,col 87)",
        "(line 134,col 9)-(line 134,col 60)",
        "(line 135,col 9)-(line 135,col 70)",
        "(line 136,col 9)-(line 136,col 97)",
        "(line 137,col 9)-(line 137,col 71)",
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 32)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.PermutationIterator.remove()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 77)"
      ]
    }
  ]
}
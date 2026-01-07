{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/Pair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 136,
      "comment": "\n * Generic pair.\n * \u003cbr/\u003e\n * Although the instances of this class are immutable, it is impossible\n * to ensure that the references passed to the constructor will not be\n * modified by the caller.\n *\n * @param \u003cK\u003e Key type.\n * @param \u003cV\u003e Value type.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Key. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Pair.Pair(K, V)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Create an entry representing a mapping from the specified key to the\n     * specified value.\n     *\n     * @param k Key (first element of the pair).\n     * @param v Value (second element of the pair).\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)",
        "(line 47,col 9)-(line 47,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Pair.Pair(org.apache.commons.math3.util.Pair\u003c? extends K, ? extends V\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create an entry representing the same mapping as the specified entry.\n     *\n     * @param entry Entry to copy.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Pair.getKey()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Get the key.\n     *\n     * @return the key (first element of the pair).\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Pair.getValue()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Get the value.\n     *\n     * @return the value (second element of the pair).\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Pair.getFirst()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Get the first element of the pair.\n     *\n     * @return the first element of the pair.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Pair.getSecond()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Get the second element of the pair.\n     *\n     * @return the second element of the pair.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Pair.equals(java.lang.Object)",
      "begin_line": 104,
      "end_line": 120,
      "comment": "\n     * Compare the specified object with this entry for equality.\n     *\n     * @param o Object.\n     * @return {@code true} if the given object is also a map entry and\n     * the two entries represent the same mapping.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Pair.hashCode()",
      "begin_line": 127,
      "end_line": 135,
      "comment": "\n     * Compute a hash code.\n     *\n     * @return the hash code value.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 54)",
        "(line 131,col 9)-(line 131,col 59)",
        "(line 132,col 9)-(line 132,col 46)",
        "(line 134,col 9)-(line 134,col 22)"
      ]
    }
  ]
}
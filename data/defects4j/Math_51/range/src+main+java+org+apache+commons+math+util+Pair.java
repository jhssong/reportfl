{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/util/Pair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 110,
      "comment": "\n * Generic pair.\n * Immutable class.\n *\n * @param \u003cK\u003e Key type.\n * @param \u003cV\u003e Value type.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Key. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.Pair.Pair(K, V)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Create an entry representing a mapping from the specified key to the\n     * specified value.\n     *\n     * @param k Key.\n     * @param v Value.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)",
        "(line 44,col 9)-(line 44,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.Pair.Pair(org.apache.commons.math.util.Pair\u003c? extends K, ? extends V\u003e)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Create an entry representing the same mapping as the specified entry.\n     *\n     * @param entry Entry to copy.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Pair.getKey()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get the key.\n     *\n     * @return the key.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Pair.getValue()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Get the value.\n     *\n     * @return the value.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Pair.equals(java.lang.Object)",
      "begin_line": 82,
      "end_line": 98,
      "comment": "\n     * Compare the specified object with this entry for equality.\n     *\n     * @param o Object.\n     * @return {@code true} if the given object is also a map entry and\n     * the two entries represent the same mapping.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Pair.hashCode()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * Compute a hash code.\n     *\n     * @return the hash code value.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 51)"
      ]
    }
  ]
}
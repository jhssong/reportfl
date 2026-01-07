{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/util/SerializablePair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializablePair",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.Pair\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 53,
      "comment": "\n * Generic pair.\n * Immutable class.\n *\n * @param \u003cK\u003e Key type.\n * @param \u003cV\u003e Value type.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.SerializablePair.SerializablePair(K, V)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Create an entry representing a mapping from the specified key to the\n     * specified value.\n     *\n     * @param k Key.\n     * @param v Value.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.SerializablePair.SerializablePair(org.apache.commons.math.util.SerializablePair\u003c? extends K, ? extends V\u003e)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Create an entry representing the same mapping as the specified entry.\n     *\n     * @param entry Entry to copy.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)"
      ]
    }
  ]
}
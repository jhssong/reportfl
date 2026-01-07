{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/keyvalue/DefaultMapEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e"
      ],
      "begin_line": 30,
      "end_line": 62,
      "comment": "\n * A restricted implementation of {@link java.util.Map.Entry Map.Entry} that prevents\n * the {@link java.util.Map.Entry Map.Entry} contract from being broken.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultMapEntry.DefaultMapEntry(K, V)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructs a new entry with the specified key and given value.\n     *\n     * @param key  the key for the entry, may be null\n     * @param value  the value for the entry, may be null\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultMapEntry.DefaultMapEntry(org.apache.commons.collections4.KeyValue\u003c? extends K, ? extends V\u003e)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructs a new entry from the specified \u003ccode\u003eKeyValue\u003c/code\u003e.\n     *\n     * @param pair  the pair to copy, must not be null\n     * @throws NullPointerException if the entry is null\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.DefaultMapEntry.DefaultMapEntry(java.util.Map.Entry\u003c? extends K, ? extends V\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructs a new entry from the specified \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     *\n     * @param entry  the entry to copy, must not be null\n     * @throws NullPointerException if the entry is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 48)"
      ]
    }
  ]
}
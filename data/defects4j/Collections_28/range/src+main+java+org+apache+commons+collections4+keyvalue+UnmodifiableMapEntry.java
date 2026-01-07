{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/keyvalue/UnmodifiableMapEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 31,
      "end_line": 75,
      "comment": "\n * A {@link java.util.Map.Entry Map.Entry} that throws\n * UnsupportedOperationException when \u003ccode\u003esetValue\u003c/code\u003e is called.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry.UnmodifiableMapEntry(K, V)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Constructs a new entry with the specified key and given value.\n     *\n     * @param key  the key for the entry, may be null\n     * @param value  the value for the entry, may be null\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry.UnmodifiableMapEntry(org.apache.commons.collections4.KeyValue\u003c? extends K, ? extends V\u003e)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructs a new entry from the specified \u003ccode\u003eKeyValue\u003c/code\u003e.\n     *\n     * @param pair  the pair to copy, must not be null\n     * @throws NullPointerException if the entry is null\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry.UnmodifiableMapEntry(java.util.Map.Entry\u003c? extends K, ? extends V\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Constructs a new entry from the specified \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     *\n     * @param entry  the entry to copy, must not be null\n     * @throws NullPointerException if the entry is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry.setValue(V)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Throws UnsupportedOperationException.\n     *\n     * @param value  the new value\n     * @return the previous value\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 79)"
      ]
    }
  ]
}
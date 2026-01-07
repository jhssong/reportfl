{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/keyvalue/AbstractMapEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractKeyValue\u003cK, V\u003e",
        "java.util.Map.Entry\u003cK, V\u003e"
      ],
      "begin_line": 28,
      "end_line": 91,
      "comment": "\n * Abstract Pair class to assist with creating correct\n * {@link java.util.Map.Entry Map.Entry} implementations.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntry.AbstractMapEntry(K, V)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Constructs a new entry with the given key and given value.\n     *\n     * @param key  the key for the entry, may be null\n     * @param value  the value for the entry, may be null\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntry.setValue(V)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Sets the value stored in this \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     * \u003cp\u003e\n     * This \u003ccode\u003eMap.Entry\u003c/code\u003e is not connected to a Map, so only the\n     * local data is changed.\n     *\n     * @param value  the new value\n     * @return the previous value\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntry.equals(java.lang.Object)",
      "begin_line": 64,
      "end_line": 76,
      "comment": "\n     * Compares this \u003ccode\u003eMap.Entry\u003c/code\u003e with another \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implemented per API documentation of {@link java.util.Map.Entry#equals(Object)}\n     *\n     * @param obj  the object to compare to\n     * @return true if equal key and value\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 75,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.AbstractMapEntry.hashCode()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Gets a hashCode compatible with the equals method.\n     * \u003cp\u003e\n     * Implemented per API documentation of {@link java.util.Map.Entry#hashCode()}\n     *\n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 88,col 64)"
      ]
    }
  ]
}
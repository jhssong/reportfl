{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/keyvalue/TiedMapEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TiedMapEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 137,
      "comment": "\n * A {@link java.util.Map.Entry Map.Entry} tied to a map underneath.\n * \u003cp\u003e\n * This can be used to enable a map entry to make changes on the underlying\n * map, however this will probably mess up any iterators.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The map underlying the entry/iterator "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The key "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.TiedMapEntry(java.util.Map\u003cK, V\u003e, K)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Constructs a new entry with the given Map and key.\n     *\n     * @param map  the map\n     * @param key  the key\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 23)",
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.getKey()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Gets the key of this entry\n     *\n     * @return the key\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.getValue()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Gets the value of this entry direct from the map.\n     *\n     * @return the value\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.setValue(V)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n     * Sets the value associated with the key direct onto the map.\n     *\n     * @param value  the new value\n     * @return the old value\n     * @throws IllegalArgumentException if the value is set to this map entry\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.equals(java.lang.Object)",
      "begin_line": 98,
      "end_line": 111,
      "comment": "\n     * Compares this \u003ccode\u003eMap.Entry\u003c/code\u003e with another \u003ccode\u003eMap.Entry\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implemented per API documentation of {@link java.util.Map.Entry#equals(Object)}\n     *\n     * @param obj  the object to compare to\n     * @return true if equal key and value\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 108,col 9)-(line 110,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.hashCode()",
      "begin_line": 120,
      "end_line": 125,
      "comment": "\n     * Gets a hashCode compatible with the equals method.\n     * \u003cp\u003e\n     * Implemented per API documentation of {@link java.util.Map.Entry#hashCode()}\n     *\n     * @return a suitable hash code\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 124,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.keyvalue.TiedMapEntry.toString()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Gets a string version of the entry.\n     *\n     * @return entry as a string\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 43)"
      ]
    }
  ]
}
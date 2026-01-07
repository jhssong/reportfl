{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/UnmodifiableMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable",
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 159,
      "comment": "\n * Decorates another \u003ccode\u003eMap\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.unmodifiableMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 62,
      "end_line": 69,
      "comment": "\n     * Factory method to create an unmodifiable map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @return a new unmodifiable map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.UnmodifiableMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)",
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)",
        "(line 107,col 9)-(line 107,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.clear()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.put(K, V)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.remove(java.lang.Object)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.mapIterator()",
      "begin_line": 131,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 72)",
        "(line 138,col 9)-(line 138,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.entrySet()",
      "begin_line": 141,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 58)",
        "(line 144,col 9)-(line 144,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.keySet()",
      "begin_line": 147,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 42)",
        "(line 150,col 9)-(line 150,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableMap.values()",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 67)"
      ]
    }
  ]
}
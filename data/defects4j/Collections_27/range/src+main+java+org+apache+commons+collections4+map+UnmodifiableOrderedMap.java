{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/UnmodifiableOrderedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableOrderedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractOrderedMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 153,
      "comment": "\n * Decorates another \u003ccode\u003eOrderedMap\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.unmodifiableOrderedMap(org.apache.commons.collections4.OrderedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Factory method to create an unmodifiable sorted map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @return a new ordered map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.UnmodifiableOrderedMap(org.apache.commons.collections4.OrderedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 33)",
        "(line 91,col 9)-(line 91,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)",
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.mapIterator()",
      "begin_line": 109,
      "end_line": 113,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 70)",
        "(line 112,col 9)-(line 112,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.clear()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.put(K, V)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.remove(java.lang.Object)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.entrySet()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.keySet()",
      "begin_line": 141,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 144,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableOrderedMap.values()",
      "begin_line": 147,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 50)",
        "(line 150,col 9)-(line 150,col 67)"
      ]
    }
  ]
}
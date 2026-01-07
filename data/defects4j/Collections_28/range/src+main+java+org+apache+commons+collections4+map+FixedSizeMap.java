{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/FixedSizeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedSizeMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.BoundedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 172,
      "comment": "\n * Decorates another \u003ccode\u003eMap\u003c/code\u003e to fix the size, preventing add/remove.\n * \u003cp\u003e\n * Any action that would change the size of the map is disallowed.\n * The put method is allowed to change the value associated with an existing\n * key however.\n * \u003cp\u003e\n * If trying to remove or clear the map, an UnsupportedOperationException is\n * thrown. If trying to put a new mapping into the map, an\n * IllegalArgumentException is thrown. This is because the put method can\n * succeed if the mapping\u0027s key already exists in the map, so the put method\n * is not always unsupported.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that FixedSizeMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.fixedSizeMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Factory method to create a fixed size map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @return a new fixed size map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.FixedSizeMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 31)",
        "(line 111,col 9)-(line 111,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.put(K, V)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 123,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.clear()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.remove(java.lang.Object)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.entrySet()",
      "begin_line": 143,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 56)",
        "(line 147,col 9)-(line 147,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.keySet()",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 40)",
        "(line 153,col 9)-(line 153,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.values()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 48)",
        "(line 159,col 9)-(line 159,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.isFull()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeMap.maxSize()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 22)"
      ]
    }
  ]
}
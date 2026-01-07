{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/UnmodifiableSortedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableSortedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 175,
      "comment": "\n * Decorates another \u003ccode\u003eSortedMap\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.unmodifiableSortedMap(java.util.SortedMap\u003cK, ? extends V\u003e)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Factory method to create an unmodifiable sorted map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @return a new unmodifiable sorted map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.UnmodifiableSortedMap(java.util.SortedMap\u003cK, ? extends V\u003e)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.writeObject(java.io.ObjectOutputStream)",
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
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.readObject(java.io.ObjectInputStream)",
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
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.clear()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.put(K, V)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.remove(java.lang.Object)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.entrySet()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.keySet()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.values()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.firstKey()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.lastKey()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.comparator()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.subMap(K, K)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.headMap(K)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.UnmodifiableSortedMap.tailMap(K)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 77)"
      ]
    }
  ]
}
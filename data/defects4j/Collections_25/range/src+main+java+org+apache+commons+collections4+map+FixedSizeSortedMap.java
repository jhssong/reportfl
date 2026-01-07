{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/FixedSizeSortedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedSizeSortedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractSortedMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.BoundedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 182,
      "comment": "\n * Decorates another \u003ccode\u003eSortedMap\u003c/code\u003e to fix the size blocking add/remove.\n * \u003cp\u003e\n * Any action that would change the size of the map is disallowed.\n * The put method is allowed to change the value associated with an existing\n * key however.\n * \u003cp\u003e\n * If trying to remove or clear the map, an UnsupportedOperationException is\n * thrown. If trying to put a new mapping into the map, an\n * IllegalArgumentException is thrown. This is because the put method can\n * succeed if the mapping\u0027s key already exists in the map, so the put method\n * is not always unsupported.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that FixedSizeSortedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedSortedMap}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.fixedSizeSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Factory method to create a fixed size sorted map.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @return a new fixed size sorted map\n     * @throws IllegalArgumentException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.FixedSizeSortedMap(java.util.SortedMap\u003cK, V\u003e)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws IllegalArgumentException if map is null\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.getSortedMap()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Gets the map being decorated.\n     *\n     * @return the decorated map\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.put(K, V)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 125,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.clear()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.remove(java.lang.Object)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.entrySet()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.keySet()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.values()",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.subMap(K, K)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.headMap(K)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.tailMap(K)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.isFull()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.FixedSizeSortedMap.maxSize()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 22)"
      ]
    }
  ]
}
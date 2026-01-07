{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/HashedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractHashedMap\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 42,
      "end_line": 115,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that is a general purpose alternative\n * to \u003ccode\u003eHashMap\u003c/code\u003e.\n * \u003cp\u003e\n * This implementation improves on the JDK1.4 HashMap by adding the\n * {@link org.apache.commons.collections4.MapIterator MapIterator}\n * functionality and many methods for subclassing.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that HashedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialisation version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.HashedMap.HashedMap()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructs a new empty map with default size and load factor.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.HashedMap.HashedMap(int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity\n     * @throws IllegalArgumentException if the initial capacity is negative\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.HashedMap.HashedMap(int, float)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Constructs a new, empty map with the specified initial capacity and\n     * load factor.\n     *\n     * @param initialCapacity  the initial capacity\n     * @param loadFactor  the load factor\n     * @throws IllegalArgumentException if the initial capacity is negative\n     * @throws IllegalArgumentException if the load factor is less than zero\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.HashedMap.HashedMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.HashedMap.clone()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.HashedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.HashedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)",
        "(line 112,col 9)-(line 112,col 25)"
      ]
    }
  ]
}
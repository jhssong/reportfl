{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multimap/ArrayListValuedHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayListValuedHashMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractListValuedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 143,
      "comment": "\n * Implements a {@code ListValuedMap}, using a {@link HashMap} to provide data\n * storage and {@link ArrayList}s as value collections. This is the standard\n * implementation of a ListValuedMap.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that ArrayListValuedHashMap is not synchronized and is not\n * thread-safe.\u003c/strong\u003e If you wish to use this map from multiple threads\n * concurrently, you must use appropriate synchronization. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serialization Version "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_MAP_CAPACITY"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The initial map capacity used when none specified in constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_LIST_CAPACITY"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * The initial list capacity when using none specified in constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialListCapacity"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The initial list capacity when creating a new value collection.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.ArrayListValuedHashMap()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Creates an empty ArrayListValuedHashMap with the default initial\n     * map capacity (16) and the default initial list capacity (3).\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.ArrayListValuedHashMap(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Creates an empty ArrayListValuedHashMap with the default initial\n     * map capacity (16) and the specified initial list capacity.\n     *\n     * @param initialListCapacity  the initial capacity used for value collections\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.ArrayListValuedHashMap(int, int)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Creates an empty ArrayListValuedHashMap with the specified initial\n     * map and list capacities.\n     *\n     * @param initialMapCapacity  the initial hashmap capacity\n     * @param initialListCapacity  the initial capacity used for value collections\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 64)",
        "(line 91,col 9)-(line 91,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.ArrayListValuedHashMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Creates an ArrayListValuedHashMap copying all the mappings of the given map.\n     *\n     * @param map a \u003ccode\u003eMultiValuedMap\u003c/code\u003e to copy into this map\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 56)",
        "(line 101,col 9)-(line 101,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.ArrayListValuedHashMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Creates an ArrayListValuedHashMap copying all the mappings of the given map.\n     *\n     * @param map a \u003ccode\u003eMap\u003c/code\u003e to copy into this map\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 56)",
        "(line 111,col 9)-(line 111,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.createCollection()",
      "begin_line": 115,
      "end_line": 118,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.trimToSize()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Trims the capacity of all value collections to their current size.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 132,
      "end_line": 135,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.ArrayListValuedHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 32)",
        "(line 139,col 9)-(line 139,col 47)",
        "(line 140,col 9)-(line 140,col 26)"
      ]
    }
  ]
}
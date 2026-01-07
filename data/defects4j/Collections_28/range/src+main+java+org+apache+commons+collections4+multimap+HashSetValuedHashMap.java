{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multimap/HashSetValuedHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashSetValuedHashMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractSetValuedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 131,
      "comment": "\n * Implements a {@code SetValuedMap}, using a {@link HashMap} to provide data\n * storage and {@link HashSet}s as value collections. This is the standard\n * implementation of a SetValuedMap.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that HashSetValuedHashMap is not synchronized and is not\n * thread-safe.\u003c/strong\u003e If you wish to use this map from multiple threads\n * concurrently, you must use appropriate synchronization. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serialization Version "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_MAP_CAPACITY"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * The initial map capacity used when none specified in constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_SET_CAPACITY"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The initial set capacity when using none specified in constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialSetCapacity"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The initial list capacity when creating a new value collection.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.HashSetValuedHashMap()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Creates an empty HashSetValuedHashMap with the default initial\n     * map capacity (16) and the default initial set capacity (3).\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.HashSetValuedHashMap(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Creates an empty HashSetValuedHashMap with the default initial\n     * map capacity (16) and the specified initial set capacity.\n     *\n     * @param initialSetCapacity  the initial capacity used for value collections\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.HashSetValuedHashMap(int, int)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Creates an empty HashSetValuedHashMap with the specified initial\n     * map and list capacities.\n     *\n     * @param initialMapCapacity  the initial hashmap capacity\n     * @param initialSetCapacity  the initial capacity used for value collections\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 90,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.HashSetValuedHashMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Creates an HashSetValuedHashMap copying all the mappings of the given map.\n     *\n     * @param map a \u003ccode\u003eMultiValuedMap\u003c/code\u003e to copy into this map\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 55)",
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.HashSetValuedHashMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Creates an HashSetValuedHashMap copying all the mappings of the given map.\n     *\n     * @param map a \u003ccode\u003eMap\u003c/code\u003e to copy into this map\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 55)",
        "(line 110,col 9)-(line 110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.createCollection()",
      "begin_line": 114,
      "end_line": 117,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 120,
      "end_line": 123,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.HashSetValuedHashMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 32)",
        "(line 127,col 9)-(line 127,col 45)",
        "(line 128,col 9)-(line 128,col 26)"
      ]
    }
  ]
}
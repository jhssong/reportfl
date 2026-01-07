{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/multimap/MultiValuedHashMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiValuedHashMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractMultiValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 53,
      "end_line": 259,
      "comment": "\n * Implements a {@link MultiValuedMap}, using a {@link HashMap} to provide data\n * storage. This is the standard implementation of a MultiValuedMap\n * \u003cp\u003e\n * A \u003ccode\u003eMultiValuedMap\u003c/code\u003e is a Map with slightly different semantics.\n * Putting a value into the map will add the value to a Collection at that key.\n * Getting a value will return a Collection, holding all the values put to that\n * key\n * \u003cp\u003e\n * In addition, this implementation allows the type of collection used for the\n * values to be controlled. By default, an \u003ccode\u003eArrayList\u003c/code\u003e is used,\n * however a \u003ccode\u003eClass\u003c? extends Collection\u003e\u003c/code\u003e to instantiate the value\n * collection may be specified.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that MultiValuedHashMap is not synchronized and is not\n * thread-safe.\u003c/strong\u003e If you wish to use this map from multiple threads\n * concurrently, you must use appropriate synchronization. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serialization Version "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_CAPACITY"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The initial capacity used when none specified in constructor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOAD_FACTOR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The load factor used when none specified in constructor.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.listValuedHashMap()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Creates a {@link ListValuedMap} with a {@link HashMap} as its internal\n     * storage\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @return a new \u003ccode\u003eListValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.listValuedHashMap(java.lang.Class\u003cC\u003e)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Creates a {@link ListValuedMap} with a {@link HashMap} as its internal\n     * storage which maps the keys to list of type \u003ccode\u003elistClass\u003c/code\u003e\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param \u003cC\u003e the List class type\n     * @param listClass the class of the list\n     * @return a new \u003ccode\u003eListValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.setValuedHashMap()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Creates a {@link SetValuedMap} with a {@link HashMap} as its internal\n     * storage\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @return a new \u003ccode\u003eSetValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.setValuedHashMap(java.lang.Class\u003cC\u003e)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Creates a {@link SetValuedMap} with a {@link HashMap} as its internal\n     * storage which maps the keys to a set of type \u003ccode\u003esetClass\u003c/code\u003e\n     *\n     * @param \u003cK\u003e the key type\n     * @param \u003cV\u003e the value type\n     * @param \u003cC\u003e the Set class type\n     * @param setClass the class of the set\n     * @return a new \u003ccode\u003eSetValuedMap\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Creates a MultiValueMap based on a \u003ccode\u003eHashMap\u003c/code\u003e with the default\n     * initial capacity (16) and the default load factor (0.75), which stores\n     * the multiple values in an \u003ccode\u003eArrayList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Creates a MultiValueMap based on a \u003ccode\u003eHashMap\u003c/code\u003e with the initial\n     * capacity and the default load factor (0.75), which stores the multiple\n     * values in an \u003ccode\u003eArrayList\u003c/code\u003e.\n     *\n     * @param initialCapacity the initial capacity of the underlying hash map\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(int, float)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Creates a MultiValueMap based on a \u003ccode\u003eHashMap\u003c/code\u003e with the initial\n     * capacity and the load factor, which stores the multiple values in an\n     * \u003ccode\u003eArrayList\u003c/code\u003e.\n     *\n     * @param initialCapacity the initial capacity of the underlying hash map\n     * @param loadFactor the load factor of the underlying hash map\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(int, float, int)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Creates a MultiValueMap based on a \u003ccode\u003eHashMap\u003c/code\u003e with the initial\n     * capacity and the load factor, which stores the multiple values in an\n     * \u003ccode\u003eArrayList\u003c/code\u003e with the initial collection capacity.\n     *\n     * @param initialCapacity the initial capacity of the underlying hash map\n     * @param loadFactor the load factor of the underlying hash map\n     * @param initialCollectionCapacity the initial capacity of the Collection of values\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 86)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\n     * Creates a MultiValuedHashMap copying all the mappings of the given map.\n     *\n     * @param map a \u003ccode\u003eMultiValuedMap\u003c/code\u003e to copy into this map\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 77)",
        "(line 181,col 9)-(line 181,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 189,
      "end_line": 193,
      "comment": "\n     * Creates a MultiValuedHashMap copying all the mappings of the given map.\n     *\n     * @param map a \u003ccode\u003eMap\u003c/code\u003e to copy into this map\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 77)",
        "(line 192,col 9)-(line 192,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(int, float, java.lang.Class\u003cC\u003e)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * Creates a MultiValuedHashMap which creates the value collections using\n     * the supplied \u003ccode\u003ecollectionClazz\u003c/code\u003e.\n     *\n     * @param initialCapacity the initial capacity of the underlying\n     *        \u003ccode\u003eHashMap\u003c/code\u003e\n     * @param loadFactor the load factor of the underlying \u003ccode\u003eHashMap\u003c/code\u003e\n     * @param \u003cC\u003e the collection type\n     * @param collectionClazz the class of the \u003ccode\u003eCollection\u003c/code\u003e to use to\n     *        create the value collections\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 91)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.MultiValuedHashMap(int, float, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "\n     * Creates a MultiValuedHashMap which creates the value collections using\n     * the supplied \u003ccode\u003ecollectionClazz\u003c/code\u003e and the initial collection capacity.\n     *\n     * @param \u003cC\u003e the collection type\n     * @param initialCapacity the initial capacity of the underlying \u003ccode\u003eHashMap\u003c/code\u003e\n     * @param loadFactor the load factor of the underlying \u003ccode\u003eHashMap\u003c/code\u003e\n     * @param initialCollectionCapacity the initial capacity of the \u003ccode\u003eCollection\u003c/code\u003e\n     * @param collectionClazz the class of the \u003ccode\u003eCollection\u003c/code\u003e to use to create the value collections\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 224,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ListValuedHashMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractListValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 228,
      "end_line": 241,
      "comment": " Inner class for ListValuedMap "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.ListValuedHashMap.ListValuedHashMap(java.lang.Class\u003cC\u003e)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 13)-(line 233,col 101)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.ListValuedHashMap.ListValuedHashMap(java.lang.Class\u003cC\u003e, int)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 238,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetValuedHashMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multimap.AbstractSetValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 244,
      "end_line": 257,
      "comment": " Inner class for SetValuedMap "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.SetValuedHashMap.SetValuedHashMap(java.lang.Class\u003cC\u003e)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 99)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.MultiValuedHashMap.SetValuedHashMap.SetValuedHashMap(java.lang.Class\u003cC\u003e, int)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 253,col 13)-(line 254,col 40)"
      ]
    }
  ]
}
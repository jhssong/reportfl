{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bidimap/TreeBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedBidiMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 2228,
      "comment": "\n * Red-Black tree-based implementation of BidiMap where all objects added\n * implement the \u003ccode\u003eComparable\u003c/code\u003e interface.\n * \u003cp\u003e\n * This class guarantees that the map will be in both ascending key order\n * and ascending value order, sorted according to the natural order for\n * the key\u0027s and value\u0027s classes.\n * \u003cp\u003e\n * This Map is intended for applications that need to be able to look\n * up a key-value pairing by either key or value, and need to do so\n * with equal efficiency.\n * \u003cp\u003e\n * While that goal could be accomplished by taking a pair of TreeMaps\n * and redirecting requests to the appropriate TreeMap (e.g.,\n * containsKey would be directed to the TreeMap that maps values to\n * keys, containsValue would be directed to the TreeMap that maps keys\n * to values), there are problems with that implementation.\n * If the data contained in the TreeMaps is large, the cost of redundant\n * storage becomes significant. The {@link DualTreeBidiMap} and\n * {@link DualHashBidiMap} implementations use this approach.\n * \u003cp\u003e\n * This solution keeps minimizes the data storage by holding data only once.\n * The red-black algorithm is based on {@link java.util.TreeMap}, but has been modified\n * to simultaneously map a tree node by key and by value. This doubles the\n * cost of put operations (but so does using two TreeMaps), and nearly doubles\n * the cost of remove operations (there is a savings in that the lookup of the\n * node to be removed only has to be performed once). And since only one node\n * contains the key and value, storage is significantly less than that\n * required by two TreeMaps.\n * \u003cp\u003e\n * The Map.Entry instances returned by the appropriate methods will\n * not allow setValue() and will throw an\n * UnsupportedOperationException on attempts to call that method.\n *\n * @since 3.0 (previously DoubleOrderedMap v2.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement.DataElement(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n         * Create a new TreeBidiMap.DataElement.\n         *\n         * @param description  the description for the element\n         ",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement.toString()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeCount"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifications"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valuesSet"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inverse"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.TreeBidiMap()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n     * Constructs a new empty TreeBidiMap.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)",
        "(line 118,col 9)-(line 118,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.TreeBidiMap(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Constructs a new TreeBidiMap by copying an existing Map.\n     *\n     * @param map  the map to copy\n     * @throws ClassCastException if the keys/values in the map are\n     *  not Comparable or are not mutually comparable\n     * @throws NullPointerException if any key or value in the map is null\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 15)",
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.size()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Returns the number of key-value mappings in this map.\n     *\n     * @return the number of key-value mappings in this map\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.isEmpty()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Checks whether the map is empty or not.\n     *\n     * @return true if the map is empty\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.containsKey(java.lang.Object)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\n     * Checks whether this map contains the a mapping for the specified key.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key whose presence in this map is to be tested\n     * @return true if this map contains a mapping for the specified key\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 22)",
        "(line 168,col 9)-(line 168,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.containsValue(java.lang.Object)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * Checks whether this map contains the a mapping for the specified value.\n     * \u003cp\u003e\n     * The value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param value  value whose presence in this map is to be tested\n     * @return true if this map contains a mapping for the specified value\n     * @throws ClassCastException if the value is of an inappropriate type\n     * @throws NullPointerException if the value is null\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 26)",
        "(line 184,col 9)-(line 184,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.get(java.lang.Object)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\n     * Gets the value to which this map maps the specified key.\n     * Returns null if the map contains no mapping for this key.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key whose associated value is to be returned\n     * @return the value to which this map maps the specified key,\n     *  or null if the map contains no mapping for this key\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 22)",
        "(line 202,col 9)-(line 202,col 47)",
        "(line 203,col 9)-(line 203,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.put(K, V)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\n     * Puts the key-value pair into the map, replacing any previous pair.\n     * \u003cp\u003e\n     * When adding a key-value pair, the value may already exist in the map\n     * against a different key. That mapping is removed, to ensure that the\n     * value only occurs once in the inverse map.\n     * \u003cpre\u003e\n     *  BidiMap map1 \u003d new TreeBidiMap();\n     *  map.put(\"A\",\"B\");  // contains A mapped to B, as per Map\n     *  map.put(\"A\",\"C\");  // contains A mapped to C, as per Map\n     *\n     *  BidiMap map2 \u003d new TreeBidiMap();\n     *  map.put(\"A\",\"B\");  // contains A mapped to B, as per Map\n     *  map.put(\"C\",\"B\");  // contains C mapped to B, key A is removed\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Both key and value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key with which the specified value is to be  associated\n     * @param value  value to be associated with the specified key\n     * @return the previous value for the key\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 34)",
        "(line 233,col 9)-(line 233,col 26)",
        "(line 234,col 9)-(line 234,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 244,
      "end_line": 249,
      "comment": "\n     * Puts all the mappings from the specified map into this map.\n     * \u003cp\u003e\n     * All keys and values must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param map  the map to copy from\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.remove(java.lang.Object)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * Removes the mapping for this key from this map if present.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key whose mapping is to be removed from the map.\n     * @return previous value associated with specified key,\n     *  or null if there was no mapping for key.\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.clear()",
      "begin_line": 270,
      "end_line": 277,
      "comment": "\n     * Removes all mappings from this map.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 17)",
        "(line 274,col 9)-(line 274,col 22)",
        "(line 275,col 9)-(line 275,col 39)",
        "(line 276,col 9)-(line 276,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getKey(java.lang.Object)",
      "begin_line": 292,
      "end_line": 297,
      "comment": "\n     * Returns the key to which this map maps the specified value.\n     * Returns null if the map contains no mapping for this value.\n     * \u003cp\u003e\n     * The value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param value  value whose associated key is to be returned.\n     * @return the key to which this map maps the specified value,\n     *  or null if the map contains no mapping for this value.\n     * @throws ClassCastException if the value is of an inappropriate type\n     * @throws NullPointerException if the value is null\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 26)",
        "(line 295,col 9)-(line 295,col 51)",
        "(line 296,col 9)-(line 296,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.removeValue(java.lang.Object)",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * Removes the mapping for this value from this map if present.\n     * \u003cp\u003e\n     * The value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param value  value whose mapping is to be removed from the map\n     * @return previous key associated with specified value,\n     *  or null if there was no mapping for value.\n     * @throws ClassCastException if the value is of an inappropriate type\n     * @throws NullPointerException if the value is null\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.firstKey()",
      "begin_line": 322,
      "end_line": 328,
      "comment": "\n     * Gets the first (lowest) key currently in this map.\n     *\n     * @return the first (lowest) key currently in this sorted map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lastKey()",
      "begin_line": 336,
      "end_line": 342,
      "comment": "\n     * Gets the last (highest) key currently in this map.\n     *\n     * @return the last (highest) key currently in this sorted map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.nextKey(K)",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\n     * Gets the next key after the one specified.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key the key to search for next from\n     * @return the next key, null if no match or at end\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 22)",
        "(line 355,col 9)-(line 355,col 65)",
        "(line 356,col 9)-(line 356,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.previousKey(K)",
      "begin_line": 367,
      "end_line": 372,
      "comment": "\n     * Gets the previous key before the one specified.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key the key to search for previous from\n     * @return the previous key, null if no match or at start\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 22)",
        "(line 370,col 9)-(line 370,col 65)",
        "(line 371,col 9)-(line 371,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.keySet()",
      "begin_line": 387,
      "end_line": 393,
      "comment": "\n     * Returns a set view of the keys contained in this map in key order.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected in\n     * the set, and vice-versa. If the map is modified while an iteration over\n     * the set is in progress, the results of the iteration are undefined.\n     * \u003cp\u003e\n     * The set supports element removal, which removes the corresponding mapping\n     * from the map. It does not support the add or addAll operations.\n     *\n     * @return a set view of the keys contained in this map.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.values()",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\n     * Returns a set view of the values contained in this map in key order.\n     * The returned object can be cast to a Set.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected in\n     * the set, and vice-versa. If the map is modified while an iteration over\n     * the set is in progress, the results of the iteration are undefined.\n     * \u003cp\u003e\n     * The set supports element removal, which removes the corresponding mapping\n     * from the map. It does not support the add or addAll operations.\n     *\n     * @return a set view of the values contained in this map.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.entrySet()",
      "begin_line": 432,
      "end_line": 438,
      "comment": "\n     * Returns a set view of the entries contained in this map in key order.\n     * For simple iteration through the map, the MapIterator is quicker.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected in\n     * the set, and vice-versa. If the map is modified while an iteration over\n     * the set is in progress, the results of the iteration are undefined.\n     * \u003cp\u003e\n     * The set supports element removal, which removes the corresponding mapping\n     * from the map. It does not support the add or addAll operations.\n     * The returned MapEntry objects do not support setValue.\n     *\n     * @return a set view of the values contained in this map.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.mapIterator()",
      "begin_line": 441,
      "end_line": 447,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.inverseBidiMap()",
      "begin_line": 455,
      "end_line": 461,
      "comment": "\n     * Gets the inverse map for comparison.\n     *\n     * @return the inverse map\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.equals(java.lang.Object)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\n     * Compares for equals as per the API.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.hashCode()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "\n     * Gets the hash code value for this map as per the API.\n     *\n     * @return the hash code value for this map\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.toString()",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\n     * Returns a string version of this Map in standard format.\n     *\n     * @return a standard format string version of the map\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doPut(K, V)",
      "begin_line": 502,
      "end_line": 556,
      "comment": "\n     * Put logic.\n     *\n     * @param key  the key, always the main map key\n     * @param value  the value, always the main map value\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 37)",
        "(line 506,col 9)-(line 506,col 25)",
        "(line 507,col 9)-(line 507,col 29)",
        "(line 509,col 9)-(line 509,col 50)",
        "(line 510,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRemoveKey(java.lang.Object)",
      "begin_line": 558,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 47)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 31)",
        "(line 564,col 9)-(line 564,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRemoveValue(java.lang.Object)",
      "begin_line": 567,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 51)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 31)",
        "(line 573,col 9)-(line 573,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lookup(java.lang.Object, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 584,
      "end_line": 600,
      "comment": "\n     * do the actual lookup of a piece of data\n     *\n     * @param data the key or value to be looked up\n     * @param index  the KEY or VALUE int\n     * @return the desired Node, or null if there is no mapping of the\n     *         specified data\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 31)",
        "(line 587,col 9)-(line 587,col 58)",
        "(line 589,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 599,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lookupKey(java.lang.Object)",
      "begin_line": 602,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lookupValue(java.lang.Object)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.nextGreater(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 617,
      "end_line": 642,
      "comment": "\n     * get the next larger node from the specified node\n     *\n     * @param node the node to be searched from\n     * @param index  the KEY or VALUE int\n     * @return the specified node\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 24)",
        "(line 619,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.nextSmaller(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 651,
      "end_line": 676,
      "comment": "\n     * get the next larger node from the specified node\n     *\n     * @param node the node to be searched from\n     * @param index  the KEY or VALUE int\n     * @return the specified node\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 24)",
        "(line 653,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.compare(T, T)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * Compare two objects\n     *\n     * @param o1  the first object\n     * @param o2  the second object\n     *\n     * @return negative value if o1 \u0026lt; o2; 0 if o1 \u003d\u003d o2; positive\n     *         value if o1 \u0026gt; o2\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.leastNode(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 701,
      "end_line": 709,
      "comment": "\n     * Find the least node from a given node.\n     *\n     * @param node  the node from which we will start searching\n     * @param index  the KEY or VALUE int\n     * @return the smallest node, from the specified node, in the\n     *         specified mapping\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 31)",
        "(line 703,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.greatestNode(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 718,
      "end_line": 726,
      "comment": "\n     * Find the greatest node from a given node.\n     *\n     * @param node  the node from which we will start searching\n     * @param index  the KEY or VALUE int\n     * @return the greatest node, from the specified node\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 31)",
        "(line 720,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.copyColor(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 736,
      "end_line": 745,
      "comment": "\n     * copy the color from one node to another, dealing with the fact\n     * that one or both nodes may, in fact, be null\n     *\n     * @param from the node whose color we\u0027re copying; may be null\n     * @param to the node whose color we\u0027re changing; may be null\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.isRed(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\n     * is the specified node red? if the node does not exist, no, it\u0027s\n     * black, thank you\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.isBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * is the specified black red? if the node does not exist, sure,\n     * it\u0027s black, thank you\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.makeRed(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 775,
      "end_line": 779,
      "comment": "\n     * force a node (if it exists) red\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.makeBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 787,
      "end_line": 791,
      "comment": "\n     * force a node (if it exists) black\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getGrandParent(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 800,
      "end_line": 802,
      "comment": "\n     * get a node\u0027s grandparent. mind you, the node, its parent, or\n     * its grandparent may not exist. no problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getParent(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 811,
      "end_line": 813,
      "comment": "\n     * get a node\u0027s parent. mind you, the node, or its parent, may not\n     * exist. no problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getRightChild(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n     * get a node\u0027s right child. mind you, the node may not exist. no\n     * problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getLeftChild(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * get a node\u0027s left child. mind you, the node may not exist. no\n     * problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.rotateLeft(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 843,
      "end_line": 863,
      "comment": "\n     * do a rotate left. standard fare in the world of balanced trees\n     *\n     * @param node the node to be rotated\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 65)",
        "(line 845,col 9)-(line 845,col 68)",
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 71)",
        "(line 852,col 9)-(line 859,col 9)",
        "(line 861,col 9)-(line 861,col 46)",
        "(line 862,col 9)-(line 862,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.rotateRight(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 871,
      "end_line": 890,
      "comment": "\n     * do a rotate right. standard fare in the world of balanced trees\n     *\n     * @param node the node to be rotated\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 63)",
        "(line 873,col 9)-(line 873,col 67)",
        "(line 874,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 70)",
        "(line 879,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 888,col 46)",
        "(line 889,col 9)-(line 889,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRedBlackInsert(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 899,
      "end_line": 960,
      "comment": "\n     * complicated red-black insert stuff. Based on Sun\u0027s TreeMap\n     * implementation, though it\u0027s barely recognizable any more\n     *\n     * @param insertedNode the node to be inserted\n     * @param dataElement  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 46)",
        "(line 901,col 9)-(line 901,col 42)",
        "(line 903,col 9)-(line 957,col 9)",
        "(line 959,col 9)-(line 959,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRedBlackDelete(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e)",
      "begin_line": 968,
      "end_line": 1024,
      "comment": "\n     * complicated red-black delete stuff. Based on Sun\u0027s TreeMap\n     * implementation, though it\u0027s barely recognizable any more\n     *\n     * @param deletedNode the node to be deleted\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1023,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRedBlackDeleteFixup(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1035,
      "end_line": 1107,
      "comment": "\n     * complicated red-black delete stuff. Based on Sun\u0027s TreeMap\n     * implementation, though it\u0027s barely recognizable any more. This\n     * rebalances the tree (somewhat, as red-black trees are not\n     * perfectly balanced -- perfect balancing takes longer)\n     *\n     * @param replacementNode the node being replaced\n     * @param dataElement  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 49)",
        "(line 1038,col 9)-(line 1104,col 9)",
        "(line 1106,col 9)-(line 1106,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.swapPosition(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1118,
      "end_line": 1207,
      "comment": "\n     * swap two nodes (except for their content), taking care of\n     * special cases where one is the other\u0027s parent ... hey, it\n     * happens.\n     *\n     * @param x one node\n     * @param y another node\n     * @param dataElement  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 66)",
        "(line 1121,col 9)-(line 1121,col 67)",
        "(line 1122,col 9)-(line 1122,col 69)",
        "(line 1123,col 9)-(line 1123,col 66)",
        "(line 1124,col 9)-(line 1124,col 67)",
        "(line 1125,col 9)-(line 1125,col 69)",
        "(line 1126,col 9)-(line 1127,col 103)",
        "(line 1128,col 9)-(line 1129,col 103)",
        "(line 1132,col 9)-(line 1155,col 9)",
        "(line 1157,col 9)-(line 1180,col 9)",
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1195,col 9)-(line 1197,col 9)",
        "(line 1199,col 9)-(line 1199,col 37)",
        "(line 1202,col 9)-(line 1206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkNonNullComparable(java.lang.Object, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1220,
      "end_line": 1227,
      "comment": "\n     * check if an object is fit to be proper input ... has to be\n     * Comparable and non-null\n     *\n     * @param o the object being checked\n     * @param index  the KEY or VALUE int (used to put the right word in the\n     *              exception message)\n     *\n     * @throws NullPointerException if o is null\n     * @throws ClassCastException if o is not Comparable\n     ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkKey(java.lang.Object)",
      "begin_line": 1237,
      "end_line": 1239,
      "comment": "\n     * check a key for validity (non-null and implements Comparable)\n     *\n     * @param key the key to be checked\n     *\n     * @throws NullPointerException if key is null\n     * @throws ClassCastException if key is not Comparable\n     ",
      "child_ranges": [
        "(line 1238,col 9)-(line 1238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkValue(java.lang.Object)",
      "begin_line": 1249,
      "end_line": 1251,
      "comment": "\n     * check a value for validity (non-null and implements Comparable)\n     *\n     * @param value the value to be checked\n     *\n     * @throws NullPointerException if value is null\n     * @throws ClassCastException if value is not Comparable\n     ",
      "child_ranges": [
        "(line 1250,col 9)-(line 1250,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkKeyAndValue(java.lang.Object, java.lang.Object)",
      "begin_line": 1263,
      "end_line": 1266,
      "comment": "\n     * check a key and a value for validity (non-null and implements\n     * Comparable)\n     *\n     * @param key the key to be checked\n     * @param value the value to be checked\n     *\n     * @throws NullPointerException if key or value is null\n     * @throws ClassCastException if key or value is not Comparable\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 22)",
        "(line 1265,col 9)-(line 1265,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.modify()",
      "begin_line": 1273,
      "end_line": 1275,
      "comment": "\n     * increment the modification count -- used to check for\n     * concurrent modification of the map through the map and through\n     * an Iterator from one of its Set or Collection views\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.grow()",
      "begin_line": 1280,
      "end_line": 1283,
      "comment": "\n     * bump up the size and note that the map has changed\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 17)",
        "(line 1282,col 9)-(line 1282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.shrink()",
      "begin_line": 1288,
      "end_line": 1291,
      "comment": "\n     * decrement the size and note that the map has changed\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1289,col 17)",
        "(line 1290,col 9)-(line 1290,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.insertValue(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e)",
      "begin_line": 1301,
      "end_line": 1332,
      "comment": "\n     * insert a node by its value\n     *\n     * @param newNode the node to be inserted\n     *\n     * @throws IllegalArgumentException if the node already exists\n     *                                     in the value mapping\n     ",
      "child_ranges": [
        "(line 1302,col 9)-(line 1302,col 52)",
        "(line 1304,col 9)-(line 1331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doEquals(java.lang.Object, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1342,
      "end_line": 1370,
      "comment": "\n     * Compares for equals as per the API.\n     *\n     * @param obj  the object to compare to\n     * @param type  the KEY or VALUE int\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 1343,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1349,col 48)",
        "(line 1350,col 9)-(line 1352,col 9)",
        "(line 1354,col 9)-(line 1368,col 9)",
        "(line 1369,col 9)-(line 1369,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doHashCode(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1378,
      "end_line": 1388,
      "comment": "\n     * Gets the hash code value for this map as per the API.\n     *\n     * @param type  the KEY or VALUE int\n     * @return the hash code value for this map\n     ",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 22)",
        "(line 1380,col 9)-(line 1386,col 9)",
        "(line 1387,col 9)-(line 1387,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doToString(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1396,
      "end_line": 1419,
      "comment": "\n     * Gets the string form of this map as per AbstractMap.\n     *\n     * @param type  the KEY or VALUE int\n     * @return the string form of this map\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1399,col 9)",
        "(line 1400,col 9)-(line 1400,col 68)",
        "(line 1401,col 9)-(line 1401,col 24)",
        "(line 1402,col 9)-(line 1402,col 65)",
        "(line 1403,col 9)-(line 1403,col 39)",
        "(line 1404,col 9)-(line 1415,col 9)",
        "(line 1417,col 9)-(line 1417,col 24)",
        "(line 1418,col 9)-(line 1418,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getMapIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1421,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1422,col 9)-(line 1429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 1435,
      "end_line": 1445,
      "comment": "\n     * Reads the content of the stream.\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 35)",
        "(line 1438,col 9)-(line 1438,col 31)",
        "(line 1439,col 9)-(line 1439,col 36)",
        "(line 1440,col 9)-(line 1444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1450,
      "end_line": 1457,
      "comment": "\n     * Writes the content to the stream for serialization.\n     ",
      "child_ranges": [
        "(line 1451,col 9)-(line 1451,col 36)",
        "(line 1452,col 9)-(line 1452,col 37)",
        "(line 1453,col 9)-(line 1456,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "View",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cE\u003e"
      ],
      "begin_line": 1463,
      "end_line": 1487,
      "comment": "\n     * A view of this map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "orderType"
      ],
      "begin_line": 1466,
      "end_line": 1466,
      "comment": " Whether to return KEY or VALUE order. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.View.View(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1473,
      "end_line": 1476,
      "comment": "\n         * Constructor.\n         * @param orderType  the KEY or VALUE int for the order\n         * @param main  the main map\n         ",
      "child_ranges": [
        "(line 1474,col 13)-(line 1474,col 20)",
        "(line 1475,col 13)-(line 1475,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.View.size()",
      "begin_line": 1478,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1480,col 13)-(line 1480,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.View.clear()",
      "begin_line": 1483,
      "end_line": 1486,
      "comment": "",
      "child_ranges": [
        "(line 1485,col 13)-(line 1485,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cK\u003e"
      ],
      "begin_line": 1489,
      "end_line": 1514,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.KeyView(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1494,
      "end_line": 1496,
      "comment": "\n         * Create a new TreeBidiMap.KeyView.\n         ",
      "child_ranges": [
        "(line 1495,col 13)-(line 1495,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.iterator()",
      "begin_line": 1498,
      "end_line": 1501,
      "comment": "",
      "child_ranges": [
        "(line 1500,col 13)-(line 1500,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.contains(java.lang.Object)",
      "begin_line": 1503,
      "end_line": 1507,
      "comment": "",
      "child_ranges": [
        "(line 1505,col 13)-(line 1505,col 45)",
        "(line 1506,col 13)-(line 1506,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.remove(java.lang.Object)",
      "begin_line": 1509,
      "end_line": 1512,
      "comment": "",
      "child_ranges": [
        "(line 1511,col 13)-(line 1511,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cV\u003e"
      ],
      "begin_line": 1516,
      "end_line": 1541,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.ValueView(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1521,
      "end_line": 1523,
      "comment": "\n         * Create a new TreeBidiMap.ValueView.\n         ",
      "child_ranges": [
        "(line 1522,col 13)-(line 1522,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.iterator()",
      "begin_line": 1525,
      "end_line": 1528,
      "comment": "",
      "child_ranges": [
        "(line 1527,col 13)-(line 1527,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.contains(java.lang.Object)",
      "begin_line": 1530,
      "end_line": 1534,
      "comment": "",
      "child_ranges": [
        "(line 1532,col 13)-(line 1532,col 47)",
        "(line 1533,col 13)-(line 1533,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.remove(java.lang.Object)",
      "begin_line": 1536,
      "end_line": 1539,
      "comment": "",
      "child_ranges": [
        "(line 1538,col 13)-(line 1538,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1546,
      "end_line": 1582,
      "comment": "\n     * A view of this map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.EntryView()",
      "begin_line": 1548,
      "end_line": 1550,
      "comment": "",
      "child_ranges": [
        "(line 1549,col 13)-(line 1549,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.contains(java.lang.Object)",
      "begin_line": 1552,
      "end_line": 1561,
      "comment": "",
      "child_ranges": [
        "(line 1554,col 13)-(line 1556,col 13)",
        "(line 1557,col 13)-(line 1557,col 64)",
        "(line 1558,col 13)-(line 1558,col 50)",
        "(line 1559,col 13)-(line 1559,col 62)",
        "(line 1560,col 13)-(line 1560,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.remove(java.lang.Object)",
      "begin_line": 1563,
      "end_line": 1576,
      "comment": "",
      "child_ranges": [
        "(line 1565,col 13)-(line 1567,col 13)",
        "(line 1568,col 13)-(line 1568,col 64)",
        "(line 1569,col 13)-(line 1569,col 50)",
        "(line 1570,col 13)-(line 1570,col 62)",
        "(line 1571,col 13)-(line 1574,col 13)",
        "(line 1575,col 13)-(line 1575,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.iterator()",
      "begin_line": 1578,
      "end_line": 1581,
      "comment": "",
      "child_ranges": [
        "(line 1580,col 13)-(line 1580,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InverseEntryView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cjava.util.Map.Entry\u003cV, K\u003e\u003e"
      ],
      "begin_line": 1587,
      "end_line": 1623,
      "comment": "\n     * A view of this map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.InverseEntryView()",
      "begin_line": 1589,
      "end_line": 1591,
      "comment": "",
      "child_ranges": [
        "(line 1590,col 13)-(line 1590,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.contains(java.lang.Object)",
      "begin_line": 1593,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1595,col 13)-(line 1597,col 13)",
        "(line 1598,col 13)-(line 1598,col 64)",
        "(line 1599,col 13)-(line 1599,col 50)",
        "(line 1600,col 13)-(line 1600,col 64)",
        "(line 1601,col 13)-(line 1601,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.remove(java.lang.Object)",
      "begin_line": 1604,
      "end_line": 1617,
      "comment": "",
      "child_ranges": [
        "(line 1606,col 13)-(line 1608,col 13)",
        "(line 1609,col 13)-(line 1609,col 64)",
        "(line 1610,col 13)-(line 1610,col 50)",
        "(line 1611,col 13)-(line 1611,col 64)",
        "(line 1612,col 13)-(line 1615,col 13)",
        "(line 1616,col 13)-(line 1616,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.iterator()",
      "begin_line": 1619,
      "end_line": 1622,
      "comment": "",
      "child_ranges": [
        "(line 1621,col 13)-(line 1621,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ViewIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1629,
      "end_line": 1709,
      "comment": "\n     * An iterator over the map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "orderType"
      ],
      "begin_line": 1632,
      "end_line": 1632,
      "comment": " Whether to return KEY or VALUE order. "
    },
    {
      "type": "field",
      "varNames": [
        "lastReturnedNode"
      ],
      "begin_line": 1634,
      "end_line": 1634,
      "comment": " The last node returned by the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "nextNode"
      ],
      "begin_line": 1636,
      "end_line": 1636,
      "comment": " The next node to be returned by the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "previousNode"
      ],
      "begin_line": 1638,
      "end_line": 1638,
      "comment": " The previous node in the sequence returned by the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModifications"
      ],
      "begin_line": 1640,
      "end_line": 1640,
      "comment": " The modification count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.ViewIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1647,
      "end_line": 1654,
      "comment": "\n         * Constructor.\n         * @param orderType  the KEY or VALUE int for the order\n         * @param main  the main map\n         ",
      "child_ranges": [
        "(line 1648,col 13)-(line 1648,col 20)",
        "(line 1649,col 13)-(line 1649,col 39)",
        "(line 1650,col 13)-(line 1650,col 50)",
        "(line 1651,col 13)-(line 1651,col 75)",
        "(line 1652,col 13)-(line 1652,col 36)",
        "(line 1653,col 13)-(line 1653,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.hasNext()",
      "begin_line": 1656,
      "end_line": 1658,
      "comment": "",
      "child_ranges": [
        "(line 1657,col 13)-(line 1657,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.navigateNext()",
      "begin_line": 1660,
      "end_line": 1671,
      "comment": "",
      "child_ranges": [
        "(line 1661,col 13)-(line 1663,col 13)",
        "(line 1664,col 13)-(line 1666,col 13)",
        "(line 1667,col 13)-(line 1667,col 40)",
        "(line 1668,col 13)-(line 1668,col 36)",
        "(line 1669,col 13)-(line 1669,col 56)",
        "(line 1670,col 13)-(line 1670,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.hasPrevious()",
      "begin_line": 1673,
      "end_line": 1675,
      "comment": "",
      "child_ranges": [
        "(line 1674,col 13)-(line 1674,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.navigatePrevious()",
      "begin_line": 1677,
      "end_line": 1691,
      "comment": "",
      "child_ranges": [
        "(line 1678,col 13)-(line 1680,col 13)",
        "(line 1681,col 13)-(line 1683,col 13)",
        "(line 1684,col 13)-(line 1684,col 40)",
        "(line 1685,col 13)-(line 1687,col 13)",
        "(line 1688,col 13)-(line 1688,col 44)",
        "(line 1689,col 13)-(line 1689,col 64)",
        "(line 1690,col 13)-(line 1690,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.remove()",
      "begin_line": 1693,
      "end_line": 1708,
      "comment": "",
      "child_ranges": [
        "(line 1694,col 13)-(line 1696,col 13)",
        "(line 1697,col 13)-(line 1699,col 13)",
        "(line 1700,col 13)-(line 1700,col 47)",
        "(line 1701,col 13)-(line 1701,col 36)",
        "(line 1702,col 13)-(line 1702,col 36)",
        "(line 1703,col 13)-(line 1707,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ViewMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator",
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e"
      ],
      "begin_line": 1715,
      "end_line": 1756,
      "comment": "\n     * An iterator over the map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.ViewMapIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "\n         * Constructor.\n         ",
      "child_ranges": [
        "(line 1721,col 13)-(line 1721,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.getKey()",
      "begin_line": 1724,
      "end_line": 1731,
      "comment": "",
      "child_ranges": [
        "(line 1726,col 13)-(line 1729,col 13)",
        "(line 1730,col 13)-(line 1730,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.getValue()",
      "begin_line": 1733,
      "end_line": 1740,
      "comment": "",
      "child_ranges": [
        "(line 1735,col 13)-(line 1738,col 13)",
        "(line 1739,col 13)-(line 1739,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.setValue(V)",
      "begin_line": 1742,
      "end_line": 1745,
      "comment": "",
      "child_ranges": [
        "(line 1744,col 13)-(line 1744,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.next()",
      "begin_line": 1747,
      "end_line": 1750,
      "comment": "",
      "child_ranges": [
        "(line 1749,col 13)-(line 1749,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.previous()",
      "begin_line": 1752,
      "end_line": 1755,
      "comment": "",
      "child_ranges": [
        "(line 1754,col 13)-(line 1754,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InverseViewMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator",
        "org.apache.commons.collections4.OrderedMapIterator\u003cV, K\u003e"
      ],
      "begin_line": 1761,
      "end_line": 1802,
      "comment": "\n     * An iterator over the map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.InverseViewMapIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1766,
      "end_line": 1768,
      "comment": "\n         * Create a new TreeBidiMap.InverseViewMapIterator.\n         ",
      "child_ranges": [
        "(line 1767,col 13)-(line 1767,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.getKey()",
      "begin_line": 1770,
      "end_line": 1777,
      "comment": "",
      "child_ranges": [
        "(line 1772,col 13)-(line 1775,col 13)",
        "(line 1776,col 13)-(line 1776,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.getValue()",
      "begin_line": 1779,
      "end_line": 1786,
      "comment": "",
      "child_ranges": [
        "(line 1781,col 13)-(line 1784,col 13)",
        "(line 1785,col 13)-(line 1785,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.setValue(K)",
      "begin_line": 1788,
      "end_line": 1791,
      "comment": "",
      "child_ranges": [
        "(line 1790,col 13)-(line 1790,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.next()",
      "begin_line": 1793,
      "end_line": 1796,
      "comment": "",
      "child_ranges": [
        "(line 1795,col 13)-(line 1795,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.previous()",
      "begin_line": 1798,
      "end_line": 1801,
      "comment": "",
      "child_ranges": [
        "(line 1800,col 13)-(line 1800,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ViewMapEntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator",
        "org.apache.commons.collections4.OrderedIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1807,
      "end_line": 1825,
      "comment": "\n     * An iterator over the map entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator.ViewMapEntryIterator()",
      "begin_line": 1812,
      "end_line": 1814,
      "comment": "\n         * Constructor.\n         ",
      "child_ranges": [
        "(line 1813,col 13)-(line 1813,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator.next()",
      "begin_line": 1816,
      "end_line": 1819,
      "comment": "",
      "child_ranges": [
        "(line 1818,col 13)-(line 1818,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator.previous()",
      "begin_line": 1821,
      "end_line": 1824,
      "comment": "",
      "child_ranges": [
        "(line 1823,col 13)-(line 1823,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InverseViewMapEntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator",
        "org.apache.commons.collections4.OrderedIterator\u003cjava.util.Map.Entry\u003cV, K\u003e\u003e"
      ],
      "begin_line": 1830,
      "end_line": 1852,
      "comment": "\n     * An iterator over the inverse map entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.InverseViewMapEntryIterator()",
      "begin_line": 1835,
      "end_line": 1837,
      "comment": "\n         * Constructor.\n         ",
      "child_ranges": [
        "(line 1836,col 13)-(line 1836,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.next()",
      "begin_line": 1839,
      "end_line": 1842,
      "comment": "",
      "child_ranges": [
        "(line 1841,col 13)-(line 1841,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.previous()",
      "begin_line": 1844,
      "end_line": 1847,
      "comment": "",
      "child_ranges": [
        "(line 1846,col 13)-(line 1846,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.createEntry(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e)",
      "begin_line": 1849,
      "end_line": 1851,
      "comment": "",
      "child_ranges": [
        "(line 1850,col 13)-(line 1850,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 1859,
      "end_line": 2071,
      "comment": "\n     * A node used to store the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 1861,
      "end_line": 1861,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 1862,
      "end_line": 1862,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leftNode"
      ],
      "begin_line": 1863,
      "end_line": 1863,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rightNode"
      ],
      "begin_line": 1864,
      "end_line": 1864,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 1865,
      "end_line": 1865,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blackColor"
      ],
      "begin_line": 1866,
      "end_line": 1866,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashcodeValue"
      ],
      "begin_line": 1867,
      "end_line": 1867,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calculatedHashCode"
      ],
      "begin_line": 1868,
      "end_line": 1868,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.Node(K, V)",
      "begin_line": 1877,
      "end_line": 1887,
      "comment": "\n         * Make a new cell with given key and value, and with null\n         * links, and black (true) colors.\n         *\n         * @param key\n         * @param value\n         ",
      "child_ranges": [
        "(line 1879,col 13)-(line 1879,col 20)",
        "(line 1880,col 13)-(line 1880,col 27)",
        "(line 1881,col 13)-(line 1881,col 31)",
        "(line 1882,col 13)-(line 1882,col 35)",
        "(line 1883,col 13)-(line 1883,col 36)",
        "(line 1884,col 13)-(line 1884,col 37)",
        "(line 1885,col 13)-(line 1885,col 54)",
        "(line 1886,col 13)-(line 1886,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getData(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1889,
      "end_line": 1898,
      "comment": "",
      "child_ranges": [
        "(line 1890,col 13)-(line 1897,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setLeft(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1900,
      "end_line": 1902,
      "comment": "",
      "child_ranges": [
        "(line 1901,col 13)-(line 1901,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getLeft(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1904,
      "end_line": 1906,
      "comment": "",
      "child_ranges": [
        "(line 1905,col 13)-(line 1905,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setRight(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1908,
      "end_line": 1910,
      "comment": "",
      "child_ranges": [
        "(line 1909,col 13)-(line 1909,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getRight(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1912,
      "end_line": 1914,
      "comment": "",
      "child_ranges": [
        "(line 1913,col 13)-(line 1913,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setParent(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1922,
      "end_line": 1924,
      "comment": "\n         * Set this node\u0027s parent node.\n         *\n         * @param node  the new parent node\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1923,col 13)-(line 1923,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getParent(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1932,
      "end_line": 1934,
      "comment": "\n         * Get the parent node.\n         *\n         * @param index  the KEY or VALUE int\n         * @return the parent node, may be null\n         ",
      "child_ranges": [
        "(line 1933,col 13)-(line 1933,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.swapColors(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1942,
      "end_line": 1947,
      "comment": "\n         * Exchange colors with another node.\n         *\n         * @param node  the node to swap with\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1944,col 13)-(line 1944,col 93)",
        "(line 1945,col 13)-(line 1945,col 88)",
        "(line 1946,col 13)-(line 1946,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1955,
      "end_line": 1957,
      "comment": "\n         * Is this node black?\n         *\n         * @param index  the KEY or VALUE int\n         * @return true if black (which is represented as a true boolean)\n         ",
      "child_ranges": [
        "(line 1956,col 13)-(line 1956,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isRed(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1965,
      "end_line": 1967,
      "comment": "\n         * Is this node red?\n         *\n         * @param index  the KEY or VALUE int\n         * @return true if non-black\n         ",
      "child_ranges": [
        "(line 1966,col 13)-(line 1966,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1974,
      "end_line": 1976,
      "comment": "\n         * Make this node black.\n         *\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1975,col 13)-(line 1975,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setRed(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1983,
      "end_line": 1985,
      "comment": "\n         * Make this node red.\n         *\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1984,col 13)-(line 1984,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.copyColor(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1993,
      "end_line": 1995,
      "comment": "\n         * Make this node the same color as another\n         *\n         * @param node  the node whose color we\u0027re adopting\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1994,col 13)-(line 1994,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isLeftChild(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1997,
      "end_line": 2000,
      "comment": "",
      "child_ranges": [
        "(line 1998,col 13)-(line 1999,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isRightChild(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 2002,
      "end_line": 2005,
      "comment": "",
      "child_ranges": [
        "(line 2003,col 13)-(line 2004,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getKey()",
      "begin_line": 2013,
      "end_line": 2016,
      "comment": "\n         * Gets the key.\n         *\n         * @return the key corresponding to this entry.\n         ",
      "child_ranges": [
        "(line 2015,col 13)-(line 2015,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getValue()",
      "begin_line": 2023,
      "end_line": 2026,
      "comment": "\n         * Gets the value.\n         *\n         * @return the value corresponding to this entry.\n         ",
      "child_ranges": [
        "(line 2025,col 13)-(line 2025,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setValue(V)",
      "begin_line": 2035,
      "end_line": 2038,
      "comment": "\n         * Optional operation that is not permitted in this implementation\n         *\n         * @param ignored\n         * @return does not return\n         * @throws UnsupportedOperationException always\n         ",
      "child_ranges": [
        "(line 2037,col 13)-(line 2037,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.equals(java.lang.Object)",
      "begin_line": 2048,
      "end_line": 2058,
      "comment": "\n         * Compares the specified object with this entry for equality.\n         * Returns true if the given object is also a map entry and\n         * the two entries represent the same mapping.\n         *\n         * @param obj  the object to be compared for equality with this entry.\n         * @return true if the specified object is equal to this entry.\n         ",
      "child_ranges": [
        "(line 2050,col 13)-(line 2052,col 13)",
        "(line 2053,col 13)-(line 2055,col 13)",
        "(line 2056,col 13)-(line 2056,col 60)",
        "(line 2057,col 13)-(line 2057,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.hashCode()",
      "begin_line": 2063,
      "end_line": 2070,
      "comment": "\n         * @return the hash code value for this map entry.\n         ",
      "child_ranges": [
        "(line 2065,col 13)-(line 2068,col 13)",
        "(line 2069,col 13)-(line 2069,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Inverse",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedBidiMap\u003cV, K\u003e"
      ],
      "begin_line": 2077,
      "end_line": 2226,
      "comment": "\n     * The inverse map implementation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inverseKeySet"
      ],
      "begin_line": 2080,
      "end_line": 2080,
      "comment": " Store the keySet once created. "
    },
    {
      "type": "field",
      "varNames": [
        "inverseValuesSet"
      ],
      "begin_line": 2082,
      "end_line": 2082,
      "comment": " Store the valuesSet once created. "
    },
    {
      "type": "field",
      "varNames": [
        "inverseEntrySet"
      ],
      "begin_line": 2084,
      "end_line": 2084,
      "comment": " Store the entrySet once created. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.size()",
      "begin_line": 2086,
      "end_line": 2089,
      "comment": "",
      "child_ranges": [
        "(line 2088,col 13)-(line 2088,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.isEmpty()",
      "begin_line": 2091,
      "end_line": 2094,
      "comment": "",
      "child_ranges": [
        "(line 2093,col 13)-(line 2093,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.get(java.lang.Object)",
      "begin_line": 2096,
      "end_line": 2099,
      "comment": "",
      "child_ranges": [
        "(line 2098,col 13)-(line 2098,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.getKey(java.lang.Object)",
      "begin_line": 2101,
      "end_line": 2104,
      "comment": "",
      "child_ranges": [
        "(line 2103,col 13)-(line 2103,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.containsKey(java.lang.Object)",
      "begin_line": 2106,
      "end_line": 2109,
      "comment": "",
      "child_ranges": [
        "(line 2108,col 13)-(line 2108,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.containsValue(java.lang.Object)",
      "begin_line": 2111,
      "end_line": 2114,
      "comment": "",
      "child_ranges": [
        "(line 2113,col 13)-(line 2113,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.firstKey()",
      "begin_line": 2116,
      "end_line": 2122,
      "comment": "",
      "child_ranges": [
        "(line 2118,col 13)-(line 2120,col 13)",
        "(line 2121,col 13)-(line 2121,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.lastKey()",
      "begin_line": 2124,
      "end_line": 2130,
      "comment": "",
      "child_ranges": [
        "(line 2126,col 13)-(line 2128,col 13)",
        "(line 2129,col 13)-(line 2129,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.nextKey(V)",
      "begin_line": 2132,
      "end_line": 2137,
      "comment": "",
      "child_ranges": [
        "(line 2134,col 13)-(line 2134,col 26)",
        "(line 2135,col 13)-(line 2135,col 95)",
        "(line 2136,col 13)-(line 2136,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.previousKey(V)",
      "begin_line": 2139,
      "end_line": 2144,
      "comment": "",
      "child_ranges": [
        "(line 2141,col 13)-(line 2141,col 26)",
        "(line 2142,col 13)-(line 2142,col 112)",
        "(line 2143,col 13)-(line 2143,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.put(V, K)",
      "begin_line": 2146,
      "end_line": 2151,
      "comment": "",
      "child_ranges": [
        "(line 2148,col 13)-(line 2148,col 38)",
        "(line 2149,col 13)-(line 2149,col 47)",
        "(line 2150,col 13)-(line 2150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.putAll(java.util.Map\u003c? extends V, ? extends K\u003e)",
      "begin_line": 2153,
      "end_line": 2158,
      "comment": "",
      "child_ranges": [
        "(line 2155,col 13)-(line 2157,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.remove(java.lang.Object)",
      "begin_line": 2160,
      "end_line": 2163,
      "comment": "",
      "child_ranges": [
        "(line 2162,col 13)-(line 2162,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.removeValue(java.lang.Object)",
      "begin_line": 2165,
      "end_line": 2168,
      "comment": "",
      "child_ranges": [
        "(line 2167,col 13)-(line 2167,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.clear()",
      "begin_line": 2170,
      "end_line": 2173,
      "comment": "",
      "child_ranges": [
        "(line 2172,col 13)-(line 2172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.keySet()",
      "begin_line": 2175,
      "end_line": 2181,
      "comment": "",
      "child_ranges": [
        "(line 2177,col 13)-(line 2179,col 13)",
        "(line 2180,col 13)-(line 2180,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.values()",
      "begin_line": 2183,
      "end_line": 2189,
      "comment": "",
      "child_ranges": [
        "(line 2185,col 13)-(line 2187,col 13)",
        "(line 2188,col 13)-(line 2188,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.entrySet()",
      "begin_line": 2191,
      "end_line": 2197,
      "comment": "",
      "child_ranges": [
        "(line 2193,col 13)-(line 2195,col 13)",
        "(line 2196,col 13)-(line 2196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.mapIterator()",
      "begin_line": 2199,
      "end_line": 2205,
      "comment": "",
      "child_ranges": [
        "(line 2201,col 13)-(line 2203,col 13)",
        "(line 2204,col 13)-(line 2204,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.inverseBidiMap()",
      "begin_line": 2207,
      "end_line": 2210,
      "comment": "",
      "child_ranges": [
        "(line 2209,col 13)-(line 2209,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.equals(java.lang.Object)",
      "begin_line": 2212,
      "end_line": 2215,
      "comment": "",
      "child_ranges": [
        "(line 2214,col 13)-(line 2214,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.hashCode()",
      "begin_line": 2217,
      "end_line": 2220,
      "comment": "",
      "child_ranges": [
        "(line 2219,col 13)-(line 2219,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.toString()",
      "begin_line": 2222,
      "end_line": 2225,
      "comment": "",
      "child_ranges": [
        "(line 2224,col 13)-(line 2224,col 66)"
      ]
    }
  ]
}
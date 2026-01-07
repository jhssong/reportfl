{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/bidimap/TreeBidiMap.java",
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
      "end_line": 2171,
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
      "end_line": 142,
      "comment": "\n     * Returns the number of key-value mappings in this map.\n     *\n     * @return the number of key-value mappings in this map\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.isEmpty()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Checks whether the map is empty or not.\n     *\n     * @return true if the map is empty\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.containsKey(java.lang.Object)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Checks whether this map contains the a mapping for the specified key.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key whose presence in this map is to be tested\n     * @return true if this map contains a mapping for the specified key\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 165,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.containsValue(java.lang.Object)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Checks whether this map contains the a mapping for the specified value.\n     * \u003cp\u003e\n     * The value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param value  value whose presence in this map is to be tested\n     * @return true if this map contains a mapping for the specified value\n     * @throws ClassCastException if the value is of an inappropriate type\n     * @throws NullPointerException if the value is null\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 26)",
        "(line 180,col 9)-(line 180,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.get(java.lang.Object)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * Gets the value to which this map maps the specified key.\n     * Returns null if the map contains no mapping for this key.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key whose associated value is to be returned\n     * @return the value to which this map maps the specified key,\n     *  or null if the map contains no mapping for this key\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 22)",
        "(line 197,col 9)-(line 197,col 47)",
        "(line 198,col 9)-(line 198,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.put(K, V)",
      "begin_line": 225,
      "end_line": 229,
      "comment": "\n     * Puts the key-value pair into the map, replacing any previous pair.\n     * \u003cp\u003e\n     * When adding a key-value pair, the value may already exist in the map\n     * against a different key. That mapping is removed, to ensure that the\n     * value only occurs once in the inverse map.\n     * \u003cpre\u003e\n     *  BidiMap map1 \u003d new TreeBidiMap();\n     *  map.put(\"A\",\"B\");  // contains A mapped to B, as per Map\n     *  map.put(\"A\",\"C\");  // contains A mapped to C, as per Map\n     *\n     *  BidiMap map2 \u003d new TreeBidiMap();\n     *  map.put(\"A\",\"B\");  // contains A mapped to B, as per Map\n     *  map.put(\"C\",\"B\");  // contains C mapped to B, key A is removed\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * Both key and value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key with which the specified value is to be  associated\n     * @param value  value to be associated with the specified key\n     * @return the previous value for the key\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 34)",
        "(line 227,col 9)-(line 227,col 26)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\n     * Puts all the mappings from the specified map into this map.\n     * \u003cp\u003e\n     * All keys and values must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param map  the map to copy from\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.remove(java.lang.Object)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Removes the mapping for this key from this map if present.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key  key whose mapping is to be removed from the map.\n     * @return previous value associated with specified key,\n     *  or null if there was no mapping for key.\n     * @throws ClassCastException if the key is of an inappropriate type\n     * @throws NullPointerException if the key is null\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.clear()",
      "begin_line": 262,
      "end_line": 268,
      "comment": "\n     * Removes all mappings from this map.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 17)",
        "(line 265,col 9)-(line 265,col 22)",
        "(line 266,col 9)-(line 266,col 39)",
        "(line 267,col 9)-(line 267,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getKey(java.lang.Object)",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\n     * Returns the key to which this map maps the specified value.\n     * Returns null if the map contains no mapping for this value.\n     * \u003cp\u003e\n     * The value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param value  value whose associated key is to be returned.\n     * @return the key to which this map maps the specified value,\n     *  or null if the map contains no mapping for this value.\n     * @throws ClassCastException if the value is of an inappropriate type\n     * @throws NullPointerException if the value is null\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 26)",
        "(line 285,col 9)-(line 285,col 51)",
        "(line 286,col 9)-(line 286,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.removeValue(java.lang.Object)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Removes the mapping for this value from this map if present.\n     * \u003cp\u003e\n     * The value must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param value  value whose mapping is to be removed from the map\n     * @return previous key associated with specified value,\n     *  or null if there was no mapping for value.\n     * @throws ClassCastException if the value is of an inappropriate type\n     * @throws NullPointerException if the value is null\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.firstKey()",
      "begin_line": 311,
      "end_line": 316,
      "comment": "\n     * Gets the first (lowest) key currently in this map.\n     *\n     * @return the first (lowest) key currently in this sorted map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lastKey()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\n     * Gets the last (highest) key currently in this map.\n     *\n     * @return the last (highest) key currently in this sorted map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.nextKey(K)",
      "begin_line": 339,
      "end_line": 343,
      "comment": "\n     * Gets the next key after the one specified.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key the key to search for next from\n     * @return the next key, null if no match or at end\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 22)",
        "(line 341,col 9)-(line 341,col 65)",
        "(line 342,col 9)-(line 342,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.previousKey(K)",
      "begin_line": 353,
      "end_line": 357,
      "comment": "\n     * Gets the previous key before the one specified.\n     * \u003cp\u003e\n     * The key must implement \u003ccode\u003eComparable\u003c/code\u003e.\n     *\n     * @param key the key to search for previous from\n     * @return the previous key, null if no match or at start\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 22)",
        "(line 355,col 9)-(line 355,col 65)",
        "(line 356,col 9)-(line 356,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.keySet()",
      "begin_line": 372,
      "end_line": 377,
      "comment": "\n     * Returns a set view of the keys contained in this map in key order.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected in\n     * the set, and vice-versa. If the map is modified while an iteration over\n     * the set is in progress, the results of the iteration are undefined.\n     * \u003cp\u003e\n     * The set supports element removal, which removes the corresponding mapping\n     * from the map. It does not support the add or addAll operations.\n     *\n     * @return a set view of the keys contained in this map.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.values()",
      "begin_line": 393,
      "end_line": 398,
      "comment": "\n     * Returns a set view of the values contained in this map in key order.\n     * The returned object can be cast to a Set.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected in\n     * the set, and vice-versa. If the map is modified while an iteration over\n     * the set is in progress, the results of the iteration are undefined.\n     * \u003cp\u003e\n     * The set supports element removal, which removes the corresponding mapping\n     * from the map. It does not support the add or addAll operations.\n     *\n     * @return a set view of the values contained in this map.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.entrySet()",
      "begin_line": 415,
      "end_line": 420,
      "comment": "\n     * Returns a set view of the entries contained in this map in key order.\n     * For simple iteration through the map, the MapIterator is quicker.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected in\n     * the set, and vice-versa. If the map is modified while an iteration over\n     * the set is in progress, the results of the iteration are undefined.\n     * \u003cp\u003e\n     * The set supports element removal, which removes the corresponding mapping\n     * from the map. It does not support the add or addAll operations.\n     * The returned MapEntry objects do not support setValue.\n     *\n     * @return a set view of the values contained in this map.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.mapIterator()",
      "begin_line": 423,
      "end_line": 428,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.inverseBidiMap()",
      "begin_line": 436,
      "end_line": 441,
      "comment": "\n     * Gets the inverse map for comparison.\n     *\n     * @return the inverse map\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.equals(java.lang.Object)",
      "begin_line": 450,
      "end_line": 453,
      "comment": "\n     * Compares for equals as per the API.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.hashCode()",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\n     * Gets the hash code value for this map as per the API.\n     *\n     * @return the hash code value for this map\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.toString()",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\n     * Returns a string version of this Map in standard format.\n     *\n     * @return a standard format string version of the map\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doPut(K, V)",
      "begin_line": 482,
      "end_line": 536,
      "comment": "\n     * Put logic.\n     *\n     * @param key  the key, always the main map key\n     * @param value  the value, always the main map value\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 37)",
        "(line 486,col 9)-(line 486,col 25)",
        "(line 487,col 9)-(line 487,col 29)",
        "(line 489,col 9)-(line 489,col 50)",
        "(line 490,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRemoveKey(java.lang.Object)",
      "begin_line": 538,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 47)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 31)",
        "(line 544,col 9)-(line 544,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRemoveValue(java.lang.Object)",
      "begin_line": 547,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 51)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 31)",
        "(line 553,col 9)-(line 553,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lookup(java.lang.Object, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 564,
      "end_line": 580,
      "comment": "\n     * do the actual lookup of a piece of data\n     *\n     * @param data the key or value to be looked up\n     * @param index  the KEY or VALUE int\n     * @return the desired Node, or null if there is no mapping of the\n     *         specified data\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 31)",
        "(line 567,col 9)-(line 567,col 58)",
        "(line 569,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lookupKey(java.lang.Object)",
      "begin_line": 582,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.lookupValue(java.lang.Object)",
      "begin_line": 586,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.nextGreater(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 597,
      "end_line": 622,
      "comment": "\n     * get the next larger node from the specified node\n     *\n     * @param node the node to be searched from\n     * @param index  the KEY or VALUE int\n     * @return the specified node\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 24)",
        "(line 599,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.nextSmaller(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 631,
      "end_line": 656,
      "comment": "\n     * get the next larger node from the specified node\n     *\n     * @param node the node to be searched from\n     * @param index  the KEY or VALUE int\n     * @return the specified node\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 24)",
        "(line 633,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.compare(T, T)",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n     * Compare two objects\n     *\n     * @param o1  the first object\n     * @param o2  the second object\n     *\n     * @return negative value if o1 \u0026lt; o2; 0 if o1 \u003d\u003d o2; positive\n     *         value if o1 \u0026gt; o2\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.leastNode(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 681,
      "end_line": 689,
      "comment": "\n     * Find the least node from a given node.\n     *\n     * @param node  the node from which we will start searching\n     * @param index  the KEY or VALUE int\n     * @return the smallest node, from the specified node, in the\n     *         specified mapping\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 31)",
        "(line 683,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.greatestNode(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 698,
      "end_line": 706,
      "comment": "\n     * Find the greatest node from a given node.\n     *\n     * @param node  the node from which we will start searching\n     * @param index  the KEY or VALUE int\n     * @return the greatest node, from the specified node\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 31)",
        "(line 700,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.copyColor(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 716,
      "end_line": 725,
      "comment": "\n     * copy the color from one node to another, dealing with the fact\n     * that one or both nodes may, in fact, be null\n     *\n     * @param from the node whose color we\u0027re copying; may be null\n     * @param to the node whose color we\u0027re changing; may be null\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 724,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.isRed(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * is the specified node red? if the node does not exist, no, it\u0027s\n     * black, thank you\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.isBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * is the specified black red? if the node does not exist, sure,\n     * it\u0027s black, thank you\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.makeRed(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 755,
      "end_line": 759,
      "comment": "\n     * force a node (if it exists) red\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 758,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.makeBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003c?, ?\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 767,
      "end_line": 771,
      "comment": "\n     * force a node (if it exists) black\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 770,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getGrandParent(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * get a node\u0027s grandparent. mind you, the node, its parent, or\n     * its grandparent may not exist. no problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getParent(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 791,
      "end_line": 793,
      "comment": "\n     * get a node\u0027s parent. mind you, the node, or its parent, may not\n     * exist. no problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getRightChild(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\n     * get a node\u0027s right child. mind you, the node may not exist. no\n     * problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getLeftChild(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 813,
      "end_line": 815,
      "comment": "\n     * get a node\u0027s left child. mind you, the node may not exist. no\n     * problem\n     *\n     * @param node the node (may be null) in question\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.rotateLeft(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 823,
      "end_line": 843,
      "comment": "\n     * do a rotate left. standard fare in the world of balanced trees\n     *\n     * @param node the node to be rotated\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 65)",
        "(line 825,col 9)-(line 825,col 68)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 71)",
        "(line 832,col 9)-(line 839,col 9)",
        "(line 841,col 9)-(line 841,col 46)",
        "(line 842,col 9)-(line 842,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.rotateRight(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 851,
      "end_line": 870,
      "comment": "\n     * do a rotate right. standard fare in the world of balanced trees\n     *\n     * @param node the node to be rotated\n     * @param index  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 63)",
        "(line 853,col 9)-(line 853,col 67)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 70)",
        "(line 859,col 9)-(line 866,col 9)",
        "(line 868,col 9)-(line 868,col 46)",
        "(line 869,col 9)-(line 869,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRedBlackInsert(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 879,
      "end_line": 940,
      "comment": "\n     * complicated red-black insert stuff. Based on Sun\u0027s TreeMap\n     * implementation, though it\u0027s barely recognizable any more\n     *\n     * @param insertedNode the node to be inserted\n     * @param dataElement  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 46)",
        "(line 881,col 9)-(line 881,col 42)",
        "(line 883,col 9)-(line 937,col 9)",
        "(line 939,col 9)-(line 939,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRedBlackDelete(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e)",
      "begin_line": 948,
      "end_line": 1004,
      "comment": "\n     * complicated red-black delete stuff. Based on Sun\u0027s TreeMap\n     * implementation, though it\u0027s barely recognizable any more\n     *\n     * @param deletedNode the node to be deleted\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1003,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doRedBlackDeleteFixup(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1015,
      "end_line": 1087,
      "comment": "\n     * complicated red-black delete stuff. Based on Sun\u0027s TreeMap\n     * implementation, though it\u0027s barely recognizable any more. This\n     * rebalances the tree (somewhat, as red-black trees are not\n     * perfectly balanced -- perfect balancing takes longer)\n     *\n     * @param replacementNode the node being replaced\n     * @param dataElement  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 49)",
        "(line 1018,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1086,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.swapPosition(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1098,
      "end_line": 1187,
      "comment": "\n     * swap two nodes (except for their content), taking care of\n     * special cases where one is the other\u0027s parent ... hey, it\n     * happens.\n     *\n     * @param x one node\n     * @param y another node\n     * @param dataElement  the KEY or VALUE int\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 66)",
        "(line 1101,col 9)-(line 1101,col 67)",
        "(line 1102,col 9)-(line 1102,col 69)",
        "(line 1103,col 9)-(line 1103,col 66)",
        "(line 1104,col 9)-(line 1104,col 67)",
        "(line 1105,col 9)-(line 1105,col 69)",
        "(line 1106,col 9)-(line 1107,col 103)",
        "(line 1108,col 9)-(line 1109,col 103)",
        "(line 1112,col 9)-(line 1135,col 9)",
        "(line 1137,col 9)-(line 1160,col 9)",
        "(line 1163,col 9)-(line 1165,col 9)",
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1175,col 9)-(line 1177,col 9)",
        "(line 1179,col 9)-(line 1179,col 37)",
        "(line 1182,col 9)-(line 1186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkNonNullComparable(java.lang.Object, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1200,
      "end_line": 1207,
      "comment": "\n     * check if an object is fit to be proper input ... has to be\n     * Comparable and non-null\n     *\n     * @param o the object being checked\n     * @param index  the KEY or VALUE int (used to put the right word in the\n     *              exception message)\n     *\n     * @throws NullPointerException if o is null\n     * @throws ClassCastException if o is not Comparable\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkKey(java.lang.Object)",
      "begin_line": 1217,
      "end_line": 1219,
      "comment": "\n     * check a key for validity (non-null and implements Comparable)\n     *\n     * @param key the key to be checked\n     *\n     * @throws NullPointerException if key is null\n     * @throws ClassCastException if key is not Comparable\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkValue(java.lang.Object)",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\n     * check a value for validity (non-null and implements Comparable)\n     *\n     * @param value the value to be checked\n     *\n     * @throws NullPointerException if value is null\n     * @throws ClassCastException if value is not Comparable\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.checkKeyAndValue(java.lang.Object, java.lang.Object)",
      "begin_line": 1243,
      "end_line": 1246,
      "comment": "\n     * check a key and a value for validity (non-null and implements\n     * Comparable)\n     *\n     * @param key the key to be checked\n     * @param value the value to be checked\n     *\n     * @throws NullPointerException if key or value is null\n     * @throws ClassCastException if key or value is not Comparable\n     ",
      "child_ranges": [
        "(line 1244,col 9)-(line 1244,col 22)",
        "(line 1245,col 9)-(line 1245,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.modify()",
      "begin_line": 1253,
      "end_line": 1255,
      "comment": "\n     * increment the modification count -- used to check for\n     * concurrent modification of the map through the map and through\n     * an Iterator from one of its Set or Collection views\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.grow()",
      "begin_line": 1260,
      "end_line": 1263,
      "comment": "\n     * bump up the size and note that the map has changed\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1261,col 17)",
        "(line 1262,col 9)-(line 1262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.shrink()",
      "begin_line": 1268,
      "end_line": 1271,
      "comment": "\n     * decrement the size and note that the map has changed\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1269,col 17)",
        "(line 1270,col 9)-(line 1270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.insertValue(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e)",
      "begin_line": 1281,
      "end_line": 1312,
      "comment": "\n     * insert a node by its value\n     *\n     * @param newNode the node to be inserted\n     *\n     * @throws IllegalArgumentException if the node already exists\n     *                                     in the value mapping\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 52)",
        "(line 1284,col 9)-(line 1311,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doEquals(java.lang.Object, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1322,
      "end_line": 1350,
      "comment": "\n     * Compares for equals as per the API.\n     *\n     * @param obj  the object to compare to\n     * @param type  the KEY or VALUE int\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1325,col 9)",
        "(line 1326,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1329,col 48)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1334,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doHashCode(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1358,
      "end_line": 1368,
      "comment": "\n     * Gets the hash code value for this map as per the API.\n     *\n     * @param type  the KEY or VALUE int\n     * @return the hash code value for this map\n     ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1359,col 22)",
        "(line 1360,col 9)-(line 1366,col 9)",
        "(line 1367,col 9)-(line 1367,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.doToString(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1376,
      "end_line": 1399,
      "comment": "\n     * Gets the string form of this map as per AbstractMap.\n     *\n     * @param type  the KEY or VALUE int\n     * @return the string form of this map\n     ",
      "child_ranges": [
        "(line 1377,col 9)-(line 1379,col 9)",
        "(line 1380,col 9)-(line 1380,col 68)",
        "(line 1381,col 9)-(line 1381,col 24)",
        "(line 1382,col 9)-(line 1382,col 65)",
        "(line 1383,col 9)-(line 1383,col 39)",
        "(line 1384,col 9)-(line 1395,col 9)",
        "(line 1397,col 9)-(line 1397,col 24)",
        "(line 1398,col 9)-(line 1398,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.getMapIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1401,
      "end_line": 1410,
      "comment": "",
      "child_ranges": [
        "(line 1402,col 9)-(line 1409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 1415,
      "end_line": 1425,
      "comment": "\n     * Reads the content of the stream.\n     ",
      "child_ranges": [
        "(line 1417,col 9)-(line 1417,col 35)",
        "(line 1418,col 9)-(line 1418,col 31)",
        "(line 1419,col 9)-(line 1419,col 36)",
        "(line 1420,col 9)-(line 1424,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1430,
      "end_line": 1437,
      "comment": "\n     * Writes the content to the stream for serialization.\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 36)",
        "(line 1432,col 9)-(line 1432,col 37)",
        "(line 1433,col 9)-(line 1436,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "View",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cE\u003e"
      ],
      "begin_line": 1443,
      "end_line": 1467,
      "comment": "\n     * A view of this map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "orderType"
      ],
      "begin_line": 1446,
      "end_line": 1446,
      "comment": " Whether to return KEY or VALUE order. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.View.View(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1453,
      "end_line": 1456,
      "comment": "\n         * Constructor.\n         * @param orderType  the KEY or VALUE int for the order\n         * @param main  the main map\n         ",
      "child_ranges": [
        "(line 1454,col 13)-(line 1454,col 20)",
        "(line 1455,col 13)-(line 1455,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.View.size()",
      "begin_line": 1458,
      "end_line": 1461,
      "comment": "",
      "child_ranges": [
        "(line 1460,col 13)-(line 1460,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.View.clear()",
      "begin_line": 1463,
      "end_line": 1466,
      "comment": "",
      "child_ranges": [
        "(line 1465,col 13)-(line 1465,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cK\u003e"
      ],
      "begin_line": 1469,
      "end_line": 1494,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.KeyView(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1474,
      "end_line": 1476,
      "comment": "\n         * Create a new TreeBidiMap.KeyView.\n         ",
      "child_ranges": [
        "(line 1475,col 13)-(line 1475,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.iterator()",
      "begin_line": 1478,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1480,col 13)-(line 1480,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.contains(java.lang.Object)",
      "begin_line": 1483,
      "end_line": 1487,
      "comment": "",
      "child_ranges": [
        "(line 1485,col 13)-(line 1485,col 45)",
        "(line 1486,col 13)-(line 1486,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.KeyView.remove(java.lang.Object)",
      "begin_line": 1489,
      "end_line": 1492,
      "comment": "",
      "child_ranges": [
        "(line 1491,col 13)-(line 1491,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cV\u003e"
      ],
      "begin_line": 1496,
      "end_line": 1521,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.ValueView(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1501,
      "end_line": 1503,
      "comment": "\n         * Create a new TreeBidiMap.ValueView.\n         ",
      "child_ranges": [
        "(line 1502,col 13)-(line 1502,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.iterator()",
      "begin_line": 1505,
      "end_line": 1508,
      "comment": "",
      "child_ranges": [
        "(line 1507,col 13)-(line 1507,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.contains(java.lang.Object)",
      "begin_line": 1510,
      "end_line": 1514,
      "comment": "",
      "child_ranges": [
        "(line 1512,col 13)-(line 1512,col 47)",
        "(line 1513,col 13)-(line 1513,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ValueView.remove(java.lang.Object)",
      "begin_line": 1516,
      "end_line": 1519,
      "comment": "",
      "child_ranges": [
        "(line 1518,col 13)-(line 1518,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1526,
      "end_line": 1562,
      "comment": "\n     * A view of this map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.EntryView()",
      "begin_line": 1528,
      "end_line": 1530,
      "comment": "",
      "child_ranges": [
        "(line 1529,col 13)-(line 1529,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.contains(java.lang.Object)",
      "begin_line": 1532,
      "end_line": 1541,
      "comment": "",
      "child_ranges": [
        "(line 1534,col 13)-(line 1536,col 13)",
        "(line 1537,col 13)-(line 1537,col 64)",
        "(line 1538,col 13)-(line 1538,col 50)",
        "(line 1539,col 13)-(line 1539,col 62)",
        "(line 1540,col 13)-(line 1540,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.remove(java.lang.Object)",
      "begin_line": 1543,
      "end_line": 1556,
      "comment": "",
      "child_ranges": [
        "(line 1545,col 13)-(line 1547,col 13)",
        "(line 1548,col 13)-(line 1548,col 64)",
        "(line 1549,col 13)-(line 1549,col 50)",
        "(line 1550,col 13)-(line 1550,col 62)",
        "(line 1551,col 13)-(line 1554,col 13)",
        "(line 1555,col 13)-(line 1555,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.EntryView.iterator()",
      "begin_line": 1558,
      "end_line": 1561,
      "comment": "",
      "child_ranges": [
        "(line 1560,col 13)-(line 1560,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InverseEntryView",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.TreeBidiMap.View\u003cjava.util.Map.Entry\u003cV, K\u003e\u003e"
      ],
      "begin_line": 1567,
      "end_line": 1603,
      "comment": "\n     * A view of this map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.InverseEntryView()",
      "begin_line": 1569,
      "end_line": 1571,
      "comment": "",
      "child_ranges": [
        "(line 1570,col 13)-(line 1570,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.contains(java.lang.Object)",
      "begin_line": 1573,
      "end_line": 1582,
      "comment": "",
      "child_ranges": [
        "(line 1575,col 13)-(line 1577,col 13)",
        "(line 1578,col 13)-(line 1578,col 64)",
        "(line 1579,col 13)-(line 1579,col 50)",
        "(line 1580,col 13)-(line 1580,col 64)",
        "(line 1581,col 13)-(line 1581,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.remove(java.lang.Object)",
      "begin_line": 1584,
      "end_line": 1597,
      "comment": "",
      "child_ranges": [
        "(line 1586,col 13)-(line 1588,col 13)",
        "(line 1589,col 13)-(line 1589,col 64)",
        "(line 1590,col 13)-(line 1590,col 50)",
        "(line 1591,col 13)-(line 1591,col 64)",
        "(line 1592,col 13)-(line 1595,col 13)",
        "(line 1596,col 13)-(line 1596,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseEntryView.iterator()",
      "begin_line": 1599,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1601,col 13)-(line 1601,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ViewIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1609,
      "end_line": 1689,
      "comment": "\n     * An iterator over the map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "orderType"
      ],
      "begin_line": 1612,
      "end_line": 1612,
      "comment": " Whether to return KEY or VALUE order. "
    },
    {
      "type": "field",
      "varNames": [
        "lastReturnedNode"
      ],
      "begin_line": 1614,
      "end_line": 1614,
      "comment": " The last node returned by the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "nextNode"
      ],
      "begin_line": 1616,
      "end_line": 1616,
      "comment": " The next node to be returned by the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "previousNode"
      ],
      "begin_line": 1618,
      "end_line": 1618,
      "comment": " The previous node in the sequence returned by the iterator. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModifications"
      ],
      "begin_line": 1620,
      "end_line": 1620,
      "comment": " The modification count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.ViewIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1627,
      "end_line": 1634,
      "comment": "\n         * Constructor.\n         * @param orderType  the KEY or VALUE int for the order\n         * @param main  the main map\n         ",
      "child_ranges": [
        "(line 1628,col 13)-(line 1628,col 20)",
        "(line 1629,col 13)-(line 1629,col 39)",
        "(line 1630,col 13)-(line 1630,col 50)",
        "(line 1631,col 13)-(line 1631,col 75)",
        "(line 1632,col 13)-(line 1632,col 36)",
        "(line 1633,col 13)-(line 1633,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.hasNext()",
      "begin_line": 1636,
      "end_line": 1638,
      "comment": "",
      "child_ranges": [
        "(line 1637,col 13)-(line 1637,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.navigateNext()",
      "begin_line": 1640,
      "end_line": 1651,
      "comment": "",
      "child_ranges": [
        "(line 1641,col 13)-(line 1643,col 13)",
        "(line 1644,col 13)-(line 1646,col 13)",
        "(line 1647,col 13)-(line 1647,col 40)",
        "(line 1648,col 13)-(line 1648,col 36)",
        "(line 1649,col 13)-(line 1649,col 56)",
        "(line 1650,col 13)-(line 1650,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.hasPrevious()",
      "begin_line": 1653,
      "end_line": 1655,
      "comment": "",
      "child_ranges": [
        "(line 1654,col 13)-(line 1654,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.navigatePrevious()",
      "begin_line": 1657,
      "end_line": 1671,
      "comment": "",
      "child_ranges": [
        "(line 1658,col 13)-(line 1660,col 13)",
        "(line 1661,col 13)-(line 1663,col 13)",
        "(line 1664,col 13)-(line 1664,col 40)",
        "(line 1665,col 13)-(line 1667,col 13)",
        "(line 1668,col 13)-(line 1668,col 44)",
        "(line 1669,col 13)-(line 1669,col 64)",
        "(line 1670,col 13)-(line 1670,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewIterator.remove()",
      "begin_line": 1673,
      "end_line": 1688,
      "comment": "",
      "child_ranges": [
        "(line 1674,col 13)-(line 1676,col 13)",
        "(line 1677,col 13)-(line 1679,col 13)",
        "(line 1680,col 13)-(line 1680,col 47)",
        "(line 1681,col 13)-(line 1681,col 36)",
        "(line 1682,col 13)-(line 1682,col 36)",
        "(line 1683,col 13)-(line 1687,col 13)"
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
      "begin_line": 1695,
      "end_line": 1731,
      "comment": "\n     * An iterator over the map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.ViewMapIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1700,
      "end_line": 1702,
      "comment": "\n         * Constructor.\n         ",
      "child_ranges": [
        "(line 1701,col 13)-(line 1701,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.getKey()",
      "begin_line": 1704,
      "end_line": 1710,
      "comment": "",
      "child_ranges": [
        "(line 1705,col 13)-(line 1708,col 13)",
        "(line 1709,col 13)-(line 1709,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.getValue()",
      "begin_line": 1712,
      "end_line": 1718,
      "comment": "",
      "child_ranges": [
        "(line 1713,col 13)-(line 1716,col 13)",
        "(line 1717,col 13)-(line 1717,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.setValue(V)",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "",
      "child_ranges": [
        "(line 1721,col 13)-(line 1721,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.next()",
      "begin_line": 1724,
      "end_line": 1726,
      "comment": "",
      "child_ranges": [
        "(line 1725,col 13)-(line 1725,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapIterator.previous()",
      "begin_line": 1728,
      "end_line": 1730,
      "comment": "",
      "child_ranges": [
        "(line 1729,col 13)-(line 1729,col 47)"
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
      "begin_line": 1736,
      "end_line": 1772,
      "comment": "\n     * An iterator over the map.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.InverseViewMapIterator(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1741,
      "end_line": 1743,
      "comment": "\n         * Create a new TreeBidiMap.InverseViewMapIterator.\n         ",
      "child_ranges": [
        "(line 1742,col 13)-(line 1742,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.getKey()",
      "begin_line": 1745,
      "end_line": 1751,
      "comment": "",
      "child_ranges": [
        "(line 1746,col 13)-(line 1749,col 13)",
        "(line 1750,col 13)-(line 1750,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.getValue()",
      "begin_line": 1753,
      "end_line": 1759,
      "comment": "",
      "child_ranges": [
        "(line 1754,col 13)-(line 1757,col 13)",
        "(line 1758,col 13)-(line 1758,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.setValue(K)",
      "begin_line": 1761,
      "end_line": 1763,
      "comment": "",
      "child_ranges": [
        "(line 1762,col 13)-(line 1762,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.next()",
      "begin_line": 1765,
      "end_line": 1767,
      "comment": "",
      "child_ranges": [
        "(line 1766,col 13)-(line 1766,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapIterator.previous()",
      "begin_line": 1769,
      "end_line": 1771,
      "comment": "",
      "child_ranges": [
        "(line 1770,col 13)-(line 1770,col 49)"
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
      "begin_line": 1777,
      "end_line": 1793,
      "comment": "\n     * An iterator over the map entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator.ViewMapEntryIterator()",
      "begin_line": 1782,
      "end_line": 1784,
      "comment": "\n         * Constructor.\n         ",
      "child_ranges": [
        "(line 1783,col 13)-(line 1783,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator.next()",
      "begin_line": 1786,
      "end_line": 1788,
      "comment": "",
      "child_ranges": [
        "(line 1787,col 13)-(line 1787,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.ViewMapEntryIterator.previous()",
      "begin_line": 1790,
      "end_line": 1792,
      "comment": "",
      "child_ranges": [
        "(line 1791,col 13)-(line 1791,col 38)"
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
      "begin_line": 1798,
      "end_line": 1818,
      "comment": "\n     * An iterator over the inverse map entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.InverseViewMapEntryIterator()",
      "begin_line": 1803,
      "end_line": 1805,
      "comment": "\n         * Constructor.\n         ",
      "child_ranges": [
        "(line 1804,col 13)-(line 1804,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.next()",
      "begin_line": 1807,
      "end_line": 1809,
      "comment": "",
      "child_ranges": [
        "(line 1808,col 13)-(line 1808,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.previous()",
      "begin_line": 1811,
      "end_line": 1813,
      "comment": "",
      "child_ranges": [
        "(line 1812,col 13)-(line 1812,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.InverseViewMapEntryIterator.createEntry(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e)",
      "begin_line": 1815,
      "end_line": 1817,
      "comment": "",
      "child_ranges": [
        "(line 1816,col 13)-(line 1816,col 82)"
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
      "begin_line": 1825,
      "end_line": 2034,
      "comment": "\n     * A node used to store the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 1827,
      "end_line": 1827,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 1828,
      "end_line": 1828,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leftNode"
      ],
      "begin_line": 1829,
      "end_line": 1829,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rightNode"
      ],
      "begin_line": 1830,
      "end_line": 1830,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentNode"
      ],
      "begin_line": 1831,
      "end_line": 1831,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blackColor"
      ],
      "begin_line": 1832,
      "end_line": 1832,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashcodeValue"
      ],
      "begin_line": 1833,
      "end_line": 1833,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calculatedHashCode"
      ],
      "begin_line": 1834,
      "end_line": 1834,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.Node(K, V)",
      "begin_line": 1843,
      "end_line": 1853,
      "comment": "\n         * Make a new cell with given key and value, and with null\n         * links, and black (true) colors.\n         *\n         * @param key\n         * @param value\n         ",
      "child_ranges": [
        "(line 1845,col 13)-(line 1845,col 20)",
        "(line 1846,col 13)-(line 1846,col 27)",
        "(line 1847,col 13)-(line 1847,col 31)",
        "(line 1848,col 13)-(line 1848,col 35)",
        "(line 1849,col 13)-(line 1849,col 36)",
        "(line 1850,col 13)-(line 1850,col 37)",
        "(line 1851,col 13)-(line 1851,col 54)",
        "(line 1852,col 13)-(line 1852,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getData(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1855,
      "end_line": 1864,
      "comment": "",
      "child_ranges": [
        "(line 1856,col 13)-(line 1863,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setLeft(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1866,
      "end_line": 1868,
      "comment": "",
      "child_ranges": [
        "(line 1867,col 13)-(line 1867,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getLeft(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1870,
      "end_line": 1872,
      "comment": "",
      "child_ranges": [
        "(line 1871,col 13)-(line 1871,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setRight(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1874,
      "end_line": 1876,
      "comment": "",
      "child_ranges": [
        "(line 1875,col 13)-(line 1875,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getRight(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1878,
      "end_line": 1880,
      "comment": "",
      "child_ranges": [
        "(line 1879,col 13)-(line 1879,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setParent(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1888,
      "end_line": 1890,
      "comment": "\n         * Set this node\u0027s parent node.\n         *\n         * @param node  the new parent node\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1889,col 13)-(line 1889,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getParent(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1898,
      "end_line": 1900,
      "comment": "\n         * Get the parent node.\n         *\n         * @param index  the KEY or VALUE int\n         * @return the parent node, may be null\n         ",
      "child_ranges": [
        "(line 1899,col 13)-(line 1899,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.swapColors(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1908,
      "end_line": 1913,
      "comment": "\n         * Exchange colors with another node.\n         *\n         * @param node  the node to swap with\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1910,col 13)-(line 1910,col 93)",
        "(line 1911,col 13)-(line 1911,col 88)",
        "(line 1912,col 13)-(line 1912,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1921,
      "end_line": 1923,
      "comment": "\n         * Is this node black?\n         *\n         * @param index  the KEY or VALUE int\n         * @return true if black (which is represented as a true boolean)\n         ",
      "child_ranges": [
        "(line 1922,col 13)-(line 1922,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isRed(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1931,
      "end_line": 1933,
      "comment": "\n         * Is this node red?\n         *\n         * @param index  the KEY or VALUE int\n         * @return true if non-black\n         ",
      "child_ranges": [
        "(line 1932,col 13)-(line 1932,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setBlack(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1940,
      "end_line": 1942,
      "comment": "\n         * Make this node black.\n         *\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1941,col 13)-(line 1941,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setRed(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1949,
      "end_line": 1951,
      "comment": "\n         * Make this node red.\n         *\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1950,col 13)-(line 1950,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.copyColor(org.apache.commons.collections4.bidimap.TreeBidiMap.Node\u003cK, V\u003e, org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1959,
      "end_line": 1961,
      "comment": "\n         * Make this node the same color as another\n         *\n         * @param node  the node whose color we\u0027re adopting\n         * @param index  the KEY or VALUE int\n         ",
      "child_ranges": [
        "(line 1960,col 13)-(line 1960,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isLeftChild(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1963,
      "end_line": 1966,
      "comment": "",
      "child_ranges": [
        "(line 1964,col 13)-(line 1965,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.isRightChild(org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement)",
      "begin_line": 1968,
      "end_line": 1971,
      "comment": "",
      "child_ranges": [
        "(line 1969,col 13)-(line 1970,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getKey()",
      "begin_line": 1979,
      "end_line": 1981,
      "comment": "\n         * Gets the key.\n         *\n         * @return the key corresponding to this entry.\n         ",
      "child_ranges": [
        "(line 1980,col 13)-(line 1980,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.getValue()",
      "begin_line": 1988,
      "end_line": 1990,
      "comment": "\n         * Gets the value.\n         *\n         * @return the value corresponding to this entry.\n         ",
      "child_ranges": [
        "(line 1989,col 13)-(line 1989,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.setValue(V)",
      "begin_line": 1999,
      "end_line": 2001,
      "comment": "\n         * Optional operation that is not permitted in this implementation\n         *\n         * @param ignored\n         * @return does not return\n         * @throws UnsupportedOperationException always\n         ",
      "child_ranges": [
        "(line 2000,col 13)-(line 2000,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.equals(java.lang.Object)",
      "begin_line": 2011,
      "end_line": 2021,
      "comment": "\n         * Compares the specified object with this entry for equality.\n         * Returns true if the given object is also a map entry and\n         * the two entries represent the same mapping.\n         *\n         * @param obj  the object to be compared for equality with this entry.\n         * @return true if the specified object is equal to this entry.\n         ",
      "child_ranges": [
        "(line 2013,col 13)-(line 2015,col 13)",
        "(line 2016,col 13)-(line 2018,col 13)",
        "(line 2019,col 13)-(line 2019,col 60)",
        "(line 2020,col 13)-(line 2020,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Node.hashCode()",
      "begin_line": 2026,
      "end_line": 2033,
      "comment": "\n         * @return the hash code value for this map entry.\n         ",
      "child_ranges": [
        "(line 2028,col 13)-(line 2031,col 13)",
        "(line 2032,col 13)-(line 2032,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Inverse",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedBidiMap\u003cV, K\u003e"
      ],
      "begin_line": 2040,
      "end_line": 2169,
      "comment": "\n     * The inverse map implementation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inverseKeySet"
      ],
      "begin_line": 2043,
      "end_line": 2043,
      "comment": " Store the keySet once created. "
    },
    {
      "type": "field",
      "varNames": [
        "inverseValuesSet"
      ],
      "begin_line": 2045,
      "end_line": 2045,
      "comment": " Store the valuesSet once created. "
    },
    {
      "type": "field",
      "varNames": [
        "inverseEntrySet"
      ],
      "begin_line": 2047,
      "end_line": 2047,
      "comment": " Store the entrySet once created. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.size()",
      "begin_line": 2049,
      "end_line": 2051,
      "comment": "",
      "child_ranges": [
        "(line 2050,col 13)-(line 2050,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.isEmpty()",
      "begin_line": 2053,
      "end_line": 2055,
      "comment": "",
      "child_ranges": [
        "(line 2054,col 13)-(line 2054,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.get(java.lang.Object)",
      "begin_line": 2057,
      "end_line": 2059,
      "comment": "",
      "child_ranges": [
        "(line 2058,col 13)-(line 2058,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.getKey(java.lang.Object)",
      "begin_line": 2061,
      "end_line": 2063,
      "comment": "",
      "child_ranges": [
        "(line 2062,col 13)-(line 2062,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.containsKey(java.lang.Object)",
      "begin_line": 2065,
      "end_line": 2067,
      "comment": "",
      "child_ranges": [
        "(line 2066,col 13)-(line 2066,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.containsValue(java.lang.Object)",
      "begin_line": 2069,
      "end_line": 2071,
      "comment": "",
      "child_ranges": [
        "(line 2070,col 13)-(line 2070,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.firstKey()",
      "begin_line": 2073,
      "end_line": 2078,
      "comment": "",
      "child_ranges": [
        "(line 2074,col 13)-(line 2076,col 13)",
        "(line 2077,col 13)-(line 2077,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.lastKey()",
      "begin_line": 2080,
      "end_line": 2085,
      "comment": "",
      "child_ranges": [
        "(line 2081,col 13)-(line 2083,col 13)",
        "(line 2084,col 13)-(line 2084,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.nextKey(V)",
      "begin_line": 2087,
      "end_line": 2091,
      "comment": "",
      "child_ranges": [
        "(line 2088,col 13)-(line 2088,col 26)",
        "(line 2089,col 13)-(line 2089,col 95)",
        "(line 2090,col 13)-(line 2090,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.previousKey(V)",
      "begin_line": 2093,
      "end_line": 2097,
      "comment": "",
      "child_ranges": [
        "(line 2094,col 13)-(line 2094,col 26)",
        "(line 2095,col 13)-(line 2095,col 112)",
        "(line 2096,col 13)-(line 2096,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.put(V, K)",
      "begin_line": 2099,
      "end_line": 2103,
      "comment": "",
      "child_ranges": [
        "(line 2100,col 13)-(line 2100,col 38)",
        "(line 2101,col 13)-(line 2101,col 47)",
        "(line 2102,col 13)-(line 2102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.putAll(java.util.Map\u003c? extends V, ? extends K\u003e)",
      "begin_line": 2105,
      "end_line": 2109,
      "comment": "",
      "child_ranges": [
        "(line 2106,col 13)-(line 2108,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.remove(java.lang.Object)",
      "begin_line": 2111,
      "end_line": 2113,
      "comment": "",
      "child_ranges": [
        "(line 2112,col 13)-(line 2112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.removeValue(java.lang.Object)",
      "begin_line": 2115,
      "end_line": 2117,
      "comment": "",
      "child_ranges": [
        "(line 2116,col 13)-(line 2116,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.clear()",
      "begin_line": 2119,
      "end_line": 2121,
      "comment": "",
      "child_ranges": [
        "(line 2120,col 13)-(line 2120,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.keySet()",
      "begin_line": 2123,
      "end_line": 2128,
      "comment": "",
      "child_ranges": [
        "(line 2124,col 13)-(line 2126,col 13)",
        "(line 2127,col 13)-(line 2127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.values()",
      "begin_line": 2130,
      "end_line": 2135,
      "comment": "",
      "child_ranges": [
        "(line 2131,col 13)-(line 2133,col 13)",
        "(line 2134,col 13)-(line 2134,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.entrySet()",
      "begin_line": 2137,
      "end_line": 2142,
      "comment": "",
      "child_ranges": [
        "(line 2138,col 13)-(line 2140,col 13)",
        "(line 2141,col 13)-(line 2141,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.mapIterator()",
      "begin_line": 2144,
      "end_line": 2149,
      "comment": "",
      "child_ranges": [
        "(line 2145,col 13)-(line 2147,col 13)",
        "(line 2148,col 13)-(line 2148,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.inverseBidiMap()",
      "begin_line": 2151,
      "end_line": 2153,
      "comment": "",
      "child_ranges": [
        "(line 2152,col 13)-(line 2152,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.equals(java.lang.Object)",
      "begin_line": 2155,
      "end_line": 2158,
      "comment": "",
      "child_ranges": [
        "(line 2157,col 13)-(line 2157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.hashCode()",
      "begin_line": 2160,
      "end_line": 2163,
      "comment": "",
      "child_ranges": [
        "(line 2162,col 13)-(line 2162,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.TreeBidiMap.Inverse.toString()",
      "begin_line": 2165,
      "end_line": 2168,
      "comment": "",
      "child_ranges": [
        "(line 2167,col 13)-(line 2167,col 66)"
      ]
    }
  ]
}
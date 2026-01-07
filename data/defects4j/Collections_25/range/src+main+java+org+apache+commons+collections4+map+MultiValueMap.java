{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/MultiValueMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiValueMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, java.lang.Object\u003e",
        "org.apache.commons.collections4.MultiMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 561,
      "comment": "\n * A MultiValueMap decorates another map, allowing it to have\n * more than one value for a key.\n * \u003cp\u003e\n * A \u003ccode\u003eMultiMap\u003c/code\u003e is a Map with slightly different semantics.\n * Putting a value into the map will add the value to a Collection at that key.\n * Getting a value will return a Collection, holding all the values put to that key.\n * \u003cp\u003e\n * This implementation is a decorator, allowing any Map implementation\n * to be used as the base.\n * \u003cp\u003e\n * In addition, this implementation allows the type of collection used\n * for the values to be controlled. By default, an \u003ccode\u003eArrayList\u003c/code\u003e\n * is used, however a \u003ccode\u003eClass\u003c/code\u003e to instantiate may be specified,\n * or a factory that returns a \u003ccode\u003eCollection\u003c/code\u003e instance.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that MultiValueMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. This class may throw exceptions when accessed\n * by concurrent threads without synchronization.\n *\n * @since 3.2\n * @version $Id$\n * @deprecated since 4.1, use {@link org.apache.commons.collections4.MultiValuedMap MultiValuedMap} instead\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "collectionFactory"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The factory for creating value collections. "
    },
    {
      "type": "field",
      "varNames": [
        "valuesView"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The cached values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map\u003cK, ? super java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Creates a map which wraps the given map and\n     * maps keys to ArrayLists.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to wrap\n     * @return a new multi-value map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Creates a map which decorates the given \u003ccode\u003emap\u003c/code\u003e and\n     * maps keys to collections of type \u003ccode\u003ecollectionClass\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to wrap\n     * @param collectionClass  the type of the collection class\n     * @return a new multi-value map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map\u003cK, ? super C\u003e, org.apache.commons.collections4.Factory\u003cC\u003e)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Creates a map which decorates the given \u003ccode\u003emap\u003c/code\u003e and\n     * creates the value collections using the supplied \u003ccode\u003ecollectionFactory\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionFactory  the collection factory (must return a Collection object).\n     * @return a new multi-value map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.MultiValueMap()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Creates a MultiValueMap based on a \u003ccode\u003eHashMap\u003c/code\u003e and\n     * storing the multiple values in an \u003ccode\u003eArrayList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.MultiValueMap(java.util.Map\u003cK, ? super C\u003e, org.apache.commons.collections4.Factory\u003cC\u003e)",
      "begin_line": 145,
      "end_line": 153,
      "comment": "\n     * Creates a MultiValueMap which decorates the given \u003ccode\u003emap\u003c/code\u003e and\n     * creates the value collections using the supplied \u003ccode\u003ecollectionFactory\u003c/code\u003e.\n     *\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionFactory  the collection factory which must return a Collection instance\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 165,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 31)",
        "(line 179,col 9)-(line 179,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.clear()",
      "begin_line": 186,
      "end_line": 197,
      "comment": "\n     * Clear the map.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.removeMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 212,
      "end_line": 225,
      "comment": "\n     * Removes a specific value from map.\n     * \u003cp\u003e\n     * The item is removed from the collection mapped to the specified key.\n     * Other values attached to that key are unaffected.\n     * \u003cp\u003e\n     * If the last value for a key is removed, \u003ccode\u003enull\u003c/code\u003e will be returned\n     * from a subsequent \u003ccode\u003eget(key)\u003c/code\u003e.\n     *\n     * @param key  the key to remove from\n     * @param value the value to remove\n     * @return {@code true} if the mapping was removed, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 62)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 59)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.containsValue(java.lang.Object)",
      "begin_line": 235,
      "end_line": 247,
      "comment": "\n     * Checks whether the map contains the value specified.\n     * \u003cp\u003e\n     * This checks all collections against all keys for the value, and thus could be slow.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the value\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 71)",
        "(line 239,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.put(K, java.lang.Object)",
      "begin_line": 259,
      "end_line": 276,
      "comment": "\n     * Adds the value to the collection associated with the specified key.\n     * \u003cp\u003e\n     * Unlike a normal \u003ccode\u003eMap\u003c/code\u003e the previous value is not replaced.\n     * Instead the new value is added to the collection stored against the key.\n     *\n     * @param key  the key to store against\n     * @param value  the value to add to the collection at the key\n     * @return the value added if the map changed and null if the map did not change\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 31)",
        "(line 263,col 9)-(line 263,col 48)",
        "(line 264,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.putAll(java.util.Map\u003c? extends K, ?\u003e)",
      "begin_line": 289,
      "end_line": 301,
      "comment": "\n     * Override superclass to ensure that MultiMap instances are\n     * correctly handled.\n     * \u003cp\u003e\n     * If you call this method with a normal map, each entry is\n     * added using \u003ccode\u003eput(Object,Object)\u003c/code\u003e.\n     * If you call this method with a multi map, each entry is\n     * added using \u003ccode\u003eputAll(Object,Collection)\u003c/code\u003e.\n     *\n     * @param map  the map to copy (either a normal or multi map)\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.entrySet()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * NOTE: the returned Entry objects will contain as value a {@link Collection}\n     * of all values that are mapped to the given key. To get a \"flattened\" version\n     * of all mappings contained in this map, use {@link #iterator()}.\n     *\n     * @see #iterator()\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.values()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\n     * Gets a collection containing all the values in the map.\n     * \u003cp\u003e\n     * This returns a collection containing the combination of values from all keys.\n     *\n     * @return a collection view of the values contained in this map\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 44)",
        "(line 328,col 9)-(line 328,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.containsValue(java.lang.Object, java.lang.Object)",
      "begin_line": 338,
      "end_line": 344,
      "comment": "\n     * Checks whether the collection at the specified key contains the value.\n     *\n     * @param key  the key to search for\n     * @param value  the value to search for\n     * @return true if the map contains the value\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 54)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.getCollection(java.lang.Object)",
      "begin_line": 353,
      "end_line": 356,
      "comment": "\n     * Gets the collection mapped to the specified key.\n     * This method is a convenience method to typecast the result of \u003ccode\u003eget(key)\u003c/code\u003e.\n     *\n     * @param key  the key to retrieve\n     * @return the collection mapped to the key, null if no mapping\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.size(java.lang.Object)",
      "begin_line": 364,
      "end_line": 370,
      "comment": "\n     * Gets the size of the collection mapped to the specified key.\n     *\n     * @param key  the key to get size for\n     * @return the size of the collection at the key, zero if key not in map\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 54)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.putAll(K, java.util.Collection\u003cV\u003e)",
      "begin_line": 380,
      "end_line": 398,
      "comment": "\n     * Adds a collection of values to the collection associated with\n     * the specified key.\n     *\n     * @param key  the key to store against\n     * @param values  the values to add to the collection at the key, null ignored\n     * @return true if this map changed\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 31)",
        "(line 385,col 9)-(line 385,col 48)",
        "(line 386,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.iterator(java.lang.Object)",
      "begin_line": 406,
      "end_line": 411,
      "comment": "\n     * Gets an iterator for the collection mapped to the specified key.\n     *\n     * @param key  the key to get an iterator for\n     * @return the iterator of the collection at the key, empty iterator if key not in map\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.iterator()",
      "begin_line": 425,
      "end_line": 454,
      "comment": "\n     * Gets an iterator for all mappings stored in this {@link MultiValueMap}.\n     * \u003cp\u003e\n     * The iterator will return multiple Entry objects with the same key\n     * if there are multiple values mapped to this key.\n     * \u003cp\u003e\n     * NOTE: calling {@link java.util.Map.Entry#setValue(Object)} on any of the returned\n     * elements will result in a {@link UnsupportedOperationException}.\n     *\n     * @return the iterator of all mappings in this map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 65)",
        "(line 427,col 9)-(line 427,col 59)",
        "(line 429,col 9)-(line 453,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-7d255bd7-523b-45c3-ae93-605c5720148e.nextIterator(int)",
      "begin_line": 430,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 432,col 17)-(line 434,col 17)",
        "(line 435,col 17)-(line 435,col 49)",
        "(line 436,col 17)-(line 450,col 18)",
        "(line 451,col 17)-(line 451,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-3f5a8237-93a7-403a-8594-d898f0eb3806.transform(V)",
      "begin_line": 437,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 438,col 25)-(line 448,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-c835471a-4cbc-466d-b202-c3c69eae5ffc.getKey()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 33)-(line 440,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-001c8d6c-f860-4396-a029-d6d4e609dcdd.getValue()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 33)-(line 443,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-45b311f9-3d0a-424a-bd24-2450fbf2925a.setValue(V)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 33)-(line 446,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.totalSize()",
      "begin_line": 461,
      "end_line": 467,
      "comment": "\n     * Gets the total size of the map by counting all the values.\n     *\n     * @return the total size of the map counting all values\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 22)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.createCollection(int)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Creates a new instance of the map value Collection container\n     * using the factory.\n     * \u003cp\u003e\n     * This method can be overridden to perform your own processing\n     * instead of using the factory.\n     *\n     * @param size  the collection size that is about to be added\n     * @return the new collection\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 487,
      "end_line": 506,
      "comment": "\n     * Inner class that provides the values view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Values.iterator()",
      "begin_line": 488,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 490,col 13)-(line 490,col 66)",
        "(line 491,col 13)-(line 493,col 13)",
        "(line 494,col 13)-(line 494,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Values.size()",
      "begin_line": 497,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Values.clear()",
      "begin_line": 502,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 504,col 13)-(line 504,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 511,
      "end_line": 536,
      "comment": "\n     * Inner class that provides the values iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.ValuesIterator(java.lang.Object)",
      "begin_line": 516,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 27)",
        "(line 518,col 13)-(line 518,col 45)",
        "(line 519,col 13)-(line 519,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.remove()",
      "begin_line": 522,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 30)",
        "(line 524,col 13)-(line 526,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.hasNext()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 13)-(line 530,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.next()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 13)-(line 534,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Factory\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 541,
      "end_line": 559,
      "comment": "\n     * Inner class that provides a simple reflection factory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ReflectionFactory.ReflectionFactory(java.lang.Class\u003cT\u003e)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 13)-(line 549,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ReflectionFactory.create()",
      "begin_line": 552,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 553,col 13)-(line 557,col 13)"
      ]
    }
  ]
}
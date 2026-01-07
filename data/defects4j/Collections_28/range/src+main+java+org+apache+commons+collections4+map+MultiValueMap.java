{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/MultiValueMap.java",
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
      "begin_line": 66,
      "end_line": 577,
      "comment": "\n * A MultiValueMap decorates another map, allowing it to have\n * more than one value for a key.\n * \u003cp\u003e\n * A \u003ccode\u003eMultiMap\u003c/code\u003e is a Map with slightly different semantics.\n * Putting a value into the map will add the value to a Collection at that key.\n * Getting a value will return a Collection, holding all the values put to that key.\n * \u003cp\u003e\n * This implementation is a decorator, allowing any Map implementation\n * to be used as the base.\n * \u003cp\u003e\n * In addition, this implementation allows the type of collection used\n * for the values to be controlled. By default, an \u003ccode\u003eArrayList\u003c/code\u003e\n * is used, however a \u003ccode\u003eClass\u003c/code\u003e to instantiate may be specified,\n * or a factory that returns a \u003ccode\u003eCollection\u003c/code\u003e instance.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that MultiValueMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. This class may throw exceptions when accessed\n * by concurrent threads without synchronization.\n *\n * @since 3.2\n * @version $Id$\n * @deprecated since 4.1, use {@link org.apache.commons.collections4.MultiValuedMap MultiValuedMap} instead\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "collectionFactory"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The factory for creating value collections. "
    },
    {
      "type": "field",
      "varNames": [
        "valuesView"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The cached values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map\u003cK, ? super java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Creates a map which wraps the given map and\n     * maps keys to ArrayLists.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to wrap\n     * @return a new multi-value map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Creates a map which decorates the given \u003ccode\u003emap\u003c/code\u003e and\n     * maps keys to collections of type \u003ccode\u003ecollectionClass\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to wrap\n     * @param collectionClass  the type of the collection class\n     * @return a new multi-value map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.multiValueMap(java.util.Map\u003cK, ? super C\u003e, org.apache.commons.collections4.Factory\u003cC\u003e)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Creates a map which decorates the given \u003ccode\u003emap\u003c/code\u003e and\n     * creates the value collections using the supplied \u003ccode\u003ecollectionFactory\u003c/code\u003e.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionFactory  the collection factory (must return a Collection object).\n     * @return a new multi-value map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.MultiValueMap()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Creates a MultiValueMap based on a \u003ccode\u003eHashMap\u003c/code\u003e and\n     * storing the multiple values in an \u003ccode\u003eArrayList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.MultiValueMap(java.util.Map\u003cK, ? super C\u003e, org.apache.commons.collections4.Factory\u003cC\u003e)",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n     * Creates a MultiValueMap which decorates the given \u003ccode\u003emap\u003c/code\u003e and\n     * creates the value collections using the supplied \u003ccode\u003ecollectionFactory\u003c/code\u003e.\n     *\n     * @param \u003cC\u003e  the collection class type\n     * @param map  the map to decorate\n     * @param collectionFactory  the collection factory which must return a Collection instance\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 164,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 31)",
        "(line 178,col 9)-(line 178,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.clear()",
      "begin_line": 185,
      "end_line": 196,
      "comment": "\n     * Clear the map.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.removeMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 211,
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
      "end_line": 458,
      "comment": "\n     * Gets an iterator for all mappings stored in this {@link MultiValueMap}.\n     * \u003cp\u003e\n     * The iterator will return multiple Entry objects with the same key\n     * if there are multiple values mapped to this key.\n     * \u003cp\u003e\n     * NOTE: calling {@link java.util.Map.Entry#setValue(Object)} on any of the returned\n     * elements will result in a {@link UnsupportedOperationException}.\n     *\n     * @return the iterator of all mappings in this map\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 65)",
        "(line 427,col 9)-(line 427,col 59)",
        "(line 429,col 9)-(line 457,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-dec99274-e314-4438-b7f5-64715c38bbda.nextIterator(int)",
      "begin_line": 430,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 432,col 17)-(line 434,col 17)",
        "(line 435,col 17)-(line 435,col 49)",
        "(line 436,col 17)-(line 454,col 18)",
        "(line 455,col 17)-(line 455,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-b51eca3f-a9cc-42cf-b75c-c470f3208477.transform(V)",
      "begin_line": 437,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 439,col 25)-(line 452,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-f3fa6ee6-c576-4601-b9c1-53fbb386a528.getKey()",
      "begin_line": 440,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 33)-(line 442,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-2ccd08ee-739f-47c6-885e-703d37b902b0.getValue()",
      "begin_line": 444,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 33)-(line 446,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Anonymous-110cbbe0-2e0b-4d4d-b640-8f4bbd8217f1.setValue(V)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 33)-(line 450,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.totalSize()",
      "begin_line": 465,
      "end_line": 471,
      "comment": "\n     * Gets the total size of the map by counting all the values.\n     *\n     * @return the total size of the map counting all values\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 22)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.createCollection(int)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Creates a new instance of the map value Collection container\n     * using the factory.\n     * \u003cp\u003e\n     * This method can be overridden to perform your own processing\n     * instead of using the factory.\n     *\n     * @param size  the collection size that is about to be added\n     * @return the new collection\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 491,
      "end_line": 510,
      "comment": "\n     * Inner class that provides the values view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Values.iterator()",
      "begin_line": 492,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 66)",
        "(line 495,col 13)-(line 497,col 13)",
        "(line 498,col 13)-(line 498,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Values.size()",
      "begin_line": 501,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.Values.clear()",
      "begin_line": 506,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 515,
      "end_line": 543,
      "comment": "\n     * Inner class that provides the values iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.ValuesIterator(java.lang.Object)",
      "begin_line": 520,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 521,col 13)-(line 521,col 27)",
        "(line 522,col 13)-(line 522,col 45)",
        "(line 523,col 13)-(line 523,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.remove()",
      "begin_line": 526,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 30)",
        "(line 529,col 13)-(line 531,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.hasNext()",
      "begin_line": 534,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ValuesIterator.next()",
      "begin_line": 539,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 13)-(line 541,col 35)"
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
      "begin_line": 548,
      "end_line": 575,
      "comment": "\n     * Inner class that provides a simple reflection factory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ReflectionFactory.ReflectionFactory(java.lang.Class\u003cT\u003e)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 556,col 13)-(line 556,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ReflectionFactory.create()",
      "begin_line": 559,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 565,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiValueMap.ReflectionFactory.readObject(java.io.ObjectInputStream)",
      "begin_line": 568,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 35)",
        "(line 571,col 13)-(line 573,col 13)"
      ]
    }
  ]
}
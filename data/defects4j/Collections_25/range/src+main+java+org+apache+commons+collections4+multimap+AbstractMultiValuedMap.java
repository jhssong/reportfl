{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 926,
      "comment": "\n * Abstract implementation of the {@link MultiValuedMap} interface to simplify\n * the creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serialization Version "
    },
    {
      "type": "field",
      "varNames": [
        "collectionFactory"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The factory for creating value collections. "
    },
    {
      "type": "field",
      "varNames": [
        "valuesView"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The values view "
    },
    {
      "type": "field",
      "varNames": [
        "entryValuesView"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The EntryValues view "
    },
    {
      "type": "field",
      "varNames": [
        "keysBagView"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The KeyBag view "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The map used to store the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AbstractMultiValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 82,
      "end_line": 90,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param \u003cC\u003e  the collection type\n     * @param map  the map to wrap, must not be null\n     * @param collectionClazz  the collection class\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 47)",
        "(line 89,col 9)-(line 89,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AbstractMultiValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 102,
      "end_line": 114,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param \u003cC\u003e the collection type\n     * @param map the map to wrap, must not be null\n     * @param collectionClazz the collection class\n     * @param initialCollectionCapacity the initial capacity of the collection\n     * @throws NullPointerException if the map is null\n     * @throws IllegalArgumentException if initialCollectionCapacity is negative\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 47)",
        "(line 112,col 9)-(line 113,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.getMap()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Gets the map being wrapped.\n     *\n     * @return the wrapped map\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsKey(java.lang.Object)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsValue(java.lang.Object)",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 75)",
        "(line 137,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 52)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.entries()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.get(java.lang.Object)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Gets the collection of values associated with the specified key. This\n     * would return an empty collection in case the mapping is not present\n     *\n     * @param key the key to retrieve\n     * @return the \u003ccode\u003eCollection\u003c/code\u003e of values, will return an empty\n     *         \u003ccode\u003eCollection\u003c/code\u003e for no mapping\n     * @throws ClassCastException if the key is of an invalid type\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.remove(java.lang.Object)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty collection.\n     *\n     * @param key the key to remove values from\n     * @return the \u003ccode\u003eCollection\u003c/code\u003e of values removed, will return an\n     *         empty, unmodifiable collection for no mapping found.\n     * @throws ClassCastException if the key is of an invalid type\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.removeMapping(K, V)",
      "begin_line": 205,
      "end_line": 219,
      "comment": "\n     * Removes a specific value from map.\n     * \u003cp\u003e\n     * The item is removed from the collection mapped to the specified key.\n     * Other values attached to that key are unaffected.\n     * \u003cp\u003e\n     * If the last value for a key is removed, an empty collection would be\n     * returned from a subsequent \u003ccode\u003eget(Object)\u003c/code\u003e.\n     *\n     * @param key the key to remove from\n     * @param item the item to remove\n     * @return {@code true} if the mapping was removed, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 31)",
        "(line 207,col 9)-(line 207,col 52)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 34)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.isEmpty()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.keySet()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.size()",
      "begin_line": 238,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 21)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.values()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Gets a collection containing all the values in the map.\n     * \u003cp\u003e\n     * Returns a collection containing all the values from all keys.\n     *\n     * @return a collection view of the values contained in this map\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 44)",
        "(line 255,col 9)-(line 255,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.clear()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.put(K, V)",
      "begin_line": 275,
      "end_line": 290,
      "comment": "\n     * Adds the value to the collection associated with the specified key.\n     * \u003cp\u003e\n     * Unlike a normal \u003ccode\u003eMap\u003c/code\u003e the previous value is not replaced.\n     * Instead the new value is added to the collection stored against the key.\n     *\n     * @param key the key to store against\n     * @param value the value to add to the collection at the key\n     * @return the value added if the map changed and null if the map did not change\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 31)",
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 302,
      "end_line": 308,
      "comment": "\n     * Copies all of the mappings from the specified map to this map. The effect\n     * of this call is equivalent to that of calling {@link #put(Object,Object)\n     * put(k, v)} on this map once for each mapping from key {@code k} to value\n     * {@code v} in the specified map. The behavior of this operation is\n     * undefined if the specified map is modified while the operation is in\n     * progress.\n     *\n     * @param map mappings to be stored in this map\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 320,
      "end_line": 327,
      "comment": "\n     * Copies all of the mappings from the specified MultiValuedMap to this map.\n     * The effect of this call is equivalent to that of calling\n     * {@link #put(Object,Object) put(k, v)} on this map once for each mapping\n     * from key {@code k} to value {@code v} in the specified map. The\n     * behavior of this operation is undefined if the specified map is modified\n     * while the operation is in progress.\n     *\n     * @param map mappings to be stored in this map\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.keys()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Returns a {@link Bag} view of the key mapping contained in this map.\n     * \u003cp\u003e\n     * Returns a Bag of keys with its values count as the count of the Bag. This\n     * bag is backed by the map, so any changes in the map is reflected here.\n     * Any method which modifies this bag like {@code add}, {@code remove},\n     * {@code Iterator.remove} etc throws\n     * \u003ccode\u003eUnsupportedOperationException\u003c/code\u003e\n     *\n     * @return a bag view of the key mapping contained in this map\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.asMap()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 359,
      "end_line": 387,
      "comment": "\n     * Adds Iterable values to the collection associated with the specified key.\n     *\n     * @param key the key to store against\n     * @param values the values to add to the collection at the key, null\n     *        ignored\n     * @return true if this map changed\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 53)",
        "(line 364,col 9)-(line 364,col 31)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.mapIterator()",
      "begin_line": 392,
      "end_line": 397,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.equals(java.lang.Object)",
      "begin_line": 399,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 64)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 45)",
        "(line 415,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.hashCode()",
      "begin_line": 429,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 18)",
        "(line 432,col 9)-(line 432,col 78)",
        "(line 433,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.toString()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.createCollection()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrappedCollection",
      "is_interface": false,
      "parent_types": [
        "java.util.Collection\u003cV\u003e"
      ],
      "begin_line": 468,
      "end_line": 612,
      "comment": "\n     * Wrapped collection to handle add and remove on the collection returned by get(object)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.WrappedCollection(java.lang.Object)",
      "begin_line": 472,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 13)-(line 473,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.getMapping()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.add(V)",
      "begin_line": 480,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 51)",
        "(line 483,col 13)-(line 485,col 13)",
        "(line 486,col 13)-(line 486,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.addAll(java.util.Collection\u003c? extends V\u003e)",
      "begin_line": 489,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 51)",
        "(line 492,col 13)-(line 494,col 13)",
        "(line 495,col 13)-(line 495,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.clear()",
      "begin_line": 498,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 51)",
        "(line 500,col 13)-(line 503,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.iterator()",
      "begin_line": 506,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 51)",
        "(line 509,col 13)-(line 511,col 13)",
        "(line 512,col 13)-(line 512,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.size()",
      "begin_line": 515,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 51)",
        "(line 517,col 13)-(line 519,col 13)",
        "(line 520,col 13)-(line 520,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.contains(java.lang.Object)",
      "begin_line": 523,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 51)",
        "(line 525,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 528,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 531,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 51)",
        "(line 533,col 13)-(line 535,col 13)",
        "(line 536,col 13)-(line 536,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.isEmpty()",
      "begin_line": 539,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 540,col 13)-(line 540,col 51)",
        "(line 541,col 13)-(line 543,col 13)",
        "(line 544,col 13)-(line 544,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.remove(java.lang.Object)",
      "begin_line": 547,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 548,col 13)-(line 548,col 51)",
        "(line 549,col 13)-(line 551,col 13)",
        "(line 553,col 13)-(line 553,col 46)",
        "(line 554,col 13)-(line 556,col 13)",
        "(line 557,col 13)-(line 557,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 560,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 51)",
        "(line 562,col 13)-(line 564,col 13)",
        "(line 566,col 13)-(line 566,col 46)",
        "(line 567,col 13)-(line 569,col 13)",
        "(line 570,col 13)-(line 570,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 573,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 574,col 13)-(line 574,col 51)",
        "(line 575,col 13)-(line 577,col 13)",
        "(line 579,col 13)-(line 579,col 46)",
        "(line 580,col 13)-(line 582,col 13)",
        "(line 583,col 13)-(line 583,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toArray()",
      "begin_line": 586,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 587,col 13)-(line 587,col 51)",
        "(line 588,col 13)-(line 590,col 13)",
        "(line 591,col 13)-(line 591,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toArray(T[])",
      "begin_line": 594,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 596,col 13)-(line 596,col 51)",
        "(line 597,col 13)-(line 599,col 13)",
        "(line 600,col 13)-(line 600,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toString()",
      "begin_line": 603,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 605,col 13)-(line 605,col 51)",
        "(line 606,col 13)-(line 608,col 13)",
        "(line 609,col 13)-(line 609,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeysBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Bag\u003cK\u003e"
      ],
      "begin_line": 617,
      "end_line": 768,
      "comment": "\n     * Inner class that provides a Bag\u003cK\u003e keys view\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.addAll(java.util.Collection\u003c? extends K\u003e)",
      "begin_line": 619,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 620,col 13)-(line 620,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.clear()",
      "begin_line": 623,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 624,col 13)-(line 624,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.contains(java.lang.Object)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.isEmpty()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 13)-(line 632,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.toArray()",
      "begin_line": 635,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 636,col 13)-(line 636,col 55)",
        "(line 637,col 13)-(line 637,col 22)",
        "(line 638,col 13)-(line 638,col 64)",
        "(line 639,col 13)-(line 644,col 13)",
        "(line 645,col 13)-(line 645,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.toArray(T[])",
      "begin_line": 648,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 649,col 13)-(line 649,col 36)",
        "(line 650,col 13)-(line 655,col 13)",
        "(line 657,col 13)-(line 657,col 22)",
        "(line 658,col 13)-(line 658,col 64)",
        "(line 659,col 13)-(line 668,col 13)",
        "(line 669,col 13)-(line 671,col 13)",
        "(line 672,col 13)-(line 672,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.getCount(java.lang.Object)",
      "begin_line": 675,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 676,col 13)-(line 676,col 26)",
        "(line 677,col 13)-(line 677,col 81)",
        "(line 678,col 13)-(line 680,col 13)",
        "(line 681,col 13)-(line 681,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.add(K)",
      "begin_line": 684,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 13)-(line 685,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.add(K, int)",
      "begin_line": 688,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 689,col 13)-(line 689,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.remove(java.lang.Object)",
      "begin_line": 692,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 693,col 13)-(line 693,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.remove(java.lang.Object, int)",
      "begin_line": 696,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 697,col 13)-(line 697,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.uniqueSet()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 701,col 13)-(line 701,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.size()",
      "begin_line": 704,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 705,col 13)-(line 705,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 708,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 709,col 13)-(line 711,col 13)",
        "(line 712,col 13)-(line 712,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.containsAll(org.apache.commons.collections4.Bag\u003c?\u003e)",
      "begin_line": 715,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 716,col 13)-(line 716,col 64)",
        "(line 717,col 13)-(line 722,col 13)",
        "(line 723,col 13)-(line 723,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 726,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 727,col 13)-(line 727,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 731,col 13)-(line 731,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.iterator()",
      "begin_line": 734,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 735,col 13)-(line 765,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keyIterator"
      ],
      "begin_line": 737,
      "end_line": 737,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.Anonymous-7dc9c5c6-73e6-4ffa-b92d-989fe1445566.nextIterator(int)",
      "begin_line": 739,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 741,col 21)-(line 743,col 21)",
        "(line 744,col 21)-(line 744,col 53)",
        "(line 745,col 21)-(line 745,col 81)",
        "(line 746,col 21)-(line 762,col 22)",
        "(line 763,col 21)-(line 763,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.Anonymous-8e379ad8-7218-4af4-9aa1-722d03511229.hasNext()",
      "begin_line": 748,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 749,col 29)-(line 749,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.Anonymous-d9b35a71-f857-4ddb-8423-437802b67ab0.next()",
      "begin_line": 752,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 753,col 29)-(line 753,col 47)",
        "(line 756,col 29)-(line 756,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysBag.Anonymous-5fc109f1-8e69-4dfe-8f0b-ad409ebad07c.remove()",
      "begin_line": 759,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 760,col 29)-(line 760,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryValues",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 773,
      "end_line": 805,
      "comment": "\n     * Inner class that provides the Entry\u003cK, V\u003e view\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.iterator()",
      "begin_line": 775,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 777,col 13)-(line 797,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keysCol"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyIterator"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.Anonymous-158976e1-b48e-4a61-9f85-88b3a6cc8b72.nextIterator(int)",
      "begin_line": 782,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 784,col 21)-(line 786,col 21)",
        "(line 787,col 21)-(line 787,col 53)",
        "(line 788,col 21)-(line 794,col 22)",
        "(line 795,col 21)-(line 795,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.Anonymous-fa613aeb-947d-4b0a-a657-dee00f70f4ac.transform(V)",
      "begin_line": 790,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 791,col 29)-(line 791,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.size()",
      "begin_line": 800,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 802,col 13)-(line 802,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiValuedMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e"
      ],
      "begin_line": 810,
      "end_line": 821,
      "comment": "\n     * Inner class for MultiValuedMap Entries\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapEntry.MultiValuedMapEntry(K, V)",
      "begin_line": 812,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapEntry.setValue(V)",
      "begin_line": 816,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 818,col 13)-(line 818,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiValuedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e"
      ],
      "begin_line": 826,
      "end_line": 870,
      "comment": "\n     * Inner class for MapIterator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "it"
      ],
      "begin_line": 828,
      "end_line": 828,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 830,
      "end_line": 830,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.MultiValuedMapIterator()",
      "begin_line": 832,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 833,col 13)-(line 833,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.hasNext()",
      "begin_line": 836,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 837,col 13)-(line 837,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.next()",
      "begin_line": 840,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 841,col 13)-(line 841,col 32)",
        "(line 842,col 13)-(line 842,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.getKey()",
      "begin_line": 845,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 846,col 13)-(line 848,col 13)",
        "(line 849,col 13)-(line 849,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.getValue()",
      "begin_line": 852,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 853,col 13)-(line 855,col 13)",
        "(line 856,col 13)-(line 856,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.remove()",
      "begin_line": 859,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 860,col 13)-(line 860,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.setValue(V)",
      "begin_line": 863,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 864,col 13)-(line 866,col 13)",
        "(line 867,col 13)-(line 867,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 875,
      "end_line": 894,
      "comment": "\n     * Inner class that provides the values view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.iterator()",
      "begin_line": 876,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 878,col 13)-(line 878,col 66)",
        "(line 879,col 13)-(line 881,col 13)",
        "(line 882,col 13)-(line 882,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.size()",
      "begin_line": 885,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 887,col 13)-(line 887,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.clear()",
      "begin_line": 890,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 899,
      "end_line": 924,
      "comment": "\n     * Inner class that provides the values iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 900,
      "end_line": 900,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 901,
      "end_line": 901,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 902,
      "end_line": 902,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.ValuesIterator(java.lang.Object)",
      "begin_line": 904,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 905,col 13)-(line 905,col 27)",
        "(line 906,col 13)-(line 906,col 44)",
        "(line 907,col 13)-(line 907,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.remove()",
      "begin_line": 910,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 911,col 13)-(line 911,col 30)",
        "(line 912,col 13)-(line 914,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.hasNext()",
      "begin_line": 917,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 918,col 13)-(line 918,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.next()",
      "begin_line": 921,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 35)"
      ]
    }
  ]
}
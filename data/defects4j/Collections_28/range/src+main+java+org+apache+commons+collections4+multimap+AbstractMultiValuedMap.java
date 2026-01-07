{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 57,
      "end_line": 944,
      "comment": "\n * Abstract implementation of the {@link MultiValuedMap} interface to simplify\n * the creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "valuesView"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The values view "
    },
    {
      "type": "field",
      "varNames": [
        "entryValuesView"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The EntryValues view "
    },
    {
      "type": "field",
      "varNames": [
        "keysMultiSetView"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The KeyMultiSet view "
    },
    {
      "type": "field",
      "varNames": [
        "asMapView"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The AsMap view "
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
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AbstractMultiValuedMap()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Constructor needed for subclass serialisation.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AbstractMultiValuedMap(java.util.Map\u003cK, ? extends java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to wrap, must not be null\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.getMap()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Gets the map being wrapped.\n     *\n     * @return the wrapped map\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.setMap(java.util.Map\u003cK, ? extends java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Sets the map being wrapped.\n     * \u003cp\u003e\n     * \u003cb\u003eNOTE:\u003c/b\u003e this method should only be used during deserialization\n     *\n     * @param map the map to wrap\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.createCollection()",
      "begin_line": 117,
      "end_line": 117,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsKey(java.lang.Object)",
      "begin_line": 120,
      "end_line": 123,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsValue(java.lang.Object)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 47)",
        "(line 133,col 9)-(line 133,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.entries()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.get(K)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Gets the collection of values associated with the specified key. This\n     * would return an empty collection in case the mapping is not present\n     *\n     * @param key the key to retrieve\n     * @return the {@code Collection} of values, will return an empty {@code Collection} for no mapping\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.wrappedCollection(K)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.remove(java.lang.Object)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty collection.\n     *\n     * @param key  the key to remove values from\n     * @return the \u003ccode\u003eCollection\u003c/code\u003e of values removed, will return an\n     *   empty, unmodifiable collection for no mapping found\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.removeMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 184,
      "end_line": 195,
      "comment": "\n     * Removes a specific key/value mapping from the multi-valued map.\n     * \u003cp\u003e\n     * The value is removed from the collection mapped to the specified key.\n     * Other values attached to that key are unaffected.\n     * \u003cp\u003e\n     * If the last value for a key is removed, an empty collection would be\n     * returned from a subsequent {@link #get(Object)}.\n     *\n     * @param key the key to remove from\n     * @param value the value to remove\n     * @return true if the mapping was removed, false otherwise\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 45)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.isEmpty()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.keySet()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.size()",
      "begin_line": 214,
      "end_line": 225,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation does \u003cb\u003enot\u003c/b\u003e cache the total size\n     * of the multi-valued map, but rather calculates it by iterating\n     * over the entries of the underlying map.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 21)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.values()",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * Gets a collection containing all the values in the map.\n     * \u003cp\u003e\n     * Returns a collection containing all the values from all keys.\n     *\n     * @return a collection view of the values contained in this map\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 44)",
        "(line 237,col 9)-(line 237,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.clear()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.put(K, V)",
      "begin_line": 255,
      "end_line": 269,
      "comment": "\n     * Adds the value to the collection associated with the specified key.\n     * \u003cp\u003e\n     * Unlike a normal \u003ccode\u003eMap\u003c/code\u003e the previous value is not replaced.\n     * Instead the new value is added to the collection stored against the key.\n     *\n     * @param key the key to store against\n     * @param value the value to add to the collection at the key\n     * @return the value added if the map changed and null if the map did not change\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 47)",
        "(line 258,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 283,
      "end_line": 293,
      "comment": "\n     * Copies all of the mappings from the specified map to this map. The effect\n     * of this call is equivalent to that of calling {@link #put(Object,Object)\n     * put(k, v)} on this map once for each mapping from key {@code k} to value\n     * {@code v} in the specified map. The behavior of this operation is\n     * undefined if the specified map is modified while the operation is in\n     * progress.\n     *\n     * @param map mappings to be stored in this map, may not be null\n     * @return true if the map changed as a result of this operation\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 32)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 307,
      "end_line": 317,
      "comment": "\n     * Copies all of the mappings from the specified MultiValuedMap to this map.\n     * The effect of this call is equivalent to that of calling\n     * {@link #put(Object,Object) put(k, v)} on this map once for each mapping\n     * from key {@code k} to value {@code v} in the specified map. The\n     * behavior of this operation is undefined if the specified map is modified\n     * while the operation is in progress.\n     *\n     * @param map mappings to be stored in this map, may not be null\n     * @return true if the map changed as a result of this operation\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 32)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.keys()",
      "begin_line": 329,
      "end_line": 335,
      "comment": "\n     * Returns a {@link MultiSet} view of the key mapping contained in this map.\n     * \u003cp\u003e\n     * Returns a MultiSet of keys with its values count as the count of the MultiSet.\n     * This multiset is backed by the map, so any changes in the map is reflected here.\n     * Any method which modifies this multiset like {@code add}, {@code remove},\n     * {@link Iterator#remove()} etc throws {@code UnsupportedOperationException}.\n     *\n     * @return a bag view of the key mapping contained in this map\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.asMap()",
      "begin_line": 337,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 350,
      "end_line": 363,
      "comment": "\n     * Adds Iterable values to the collection associated with the specified key.\n     *\n     * @param key the key to store against\n     * @param values the values to add to the collection at the key, may not be null\n     * @return true if this map changed\n     * @throws NullPointerException if values is null\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.mapIterator()",
      "begin_line": 365,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.equals(java.lang.Object)",
      "begin_line": 373,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.hashCode()",
      "begin_line": 384,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.toString()",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrappedCollection",
      "is_interface": false,
      "parent_types": [
        "java.util.Collection\u003cV\u003e"
      ],
      "begin_line": 406,
      "end_line": 551,
      "comment": "\n     * Wrapped collection to handle add and remove on the collection returned\n     * by get(object).\n     * \u003cp\u003e\n     * Currently, the wrapped collection is not cached and has to be retrieved\n     * from the underlying map. This is safe, but not very efficient and\n     * should be improved in subsequent releases. For this purpose, the\n     * scope of this collection is set to package private to simplify later\n     * refactoring.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.WrappedCollection(K)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 13)-(line 411,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.getMapping()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 13)-(line 415,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.add(V)",
      "begin_line": 418,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 46)",
        "(line 421,col 13)-(line 424,col 13)",
        "(line 425,col 13)-(line 425,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.addAll(java.util.Collection\u003c? extends V\u003e)",
      "begin_line": 428,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 46)",
        "(line 431,col 13)-(line 434,col 13)",
        "(line 435,col 13)-(line 435,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.clear()",
      "begin_line": 438,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 52)",
        "(line 441,col 13)-(line 444,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.iterator()",
      "begin_line": 447,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 450,col 13)-(line 450,col 52)",
        "(line 451,col 13)-(line 453,col 13)",
        "(line 454,col 13)-(line 454,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.size()",
      "begin_line": 457,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 52)",
        "(line 460,col 13)-(line 460,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.contains(java.lang.Object)",
      "begin_line": 463,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 465,col 13)-(line 465,col 52)",
        "(line 466,col 13)-(line 466,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 469,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 471,col 52)",
        "(line 472,col 13)-(line 472,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.isEmpty()",
      "begin_line": 475,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 52)",
        "(line 478,col 13)-(line 478,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.remove(java.lang.Object)",
      "begin_line": 481,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 483,col 13)-(line 483,col 52)",
        "(line 484,col 13)-(line 486,col 13)",
        "(line 488,col 13)-(line 488,col 47)",
        "(line 489,col 13)-(line 491,col 13)",
        "(line 492,col 13)-(line 492,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 495,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 497,col 13)-(line 497,col 52)",
        "(line 498,col 13)-(line 500,col 13)",
        "(line 502,col 13)-(line 502,col 47)",
        "(line 503,col 13)-(line 505,col 13)",
        "(line 506,col 13)-(line 506,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 509,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 511,col 13)-(line 511,col 52)",
        "(line 512,col 13)-(line 514,col 13)",
        "(line 516,col 13)-(line 516,col 47)",
        "(line 517,col 13)-(line 519,col 13)",
        "(line 520,col 13)-(line 520,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toArray()",
      "begin_line": 523,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 52)",
        "(line 526,col 13)-(line 528,col 13)",
        "(line 529,col 13)-(line 529,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toArray(T[])",
      "begin_line": 532,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 52)",
        "(line 536,col 13)-(line 538,col 13)",
        "(line 539,col 13)-(line 539,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toString()",
      "begin_line": 542,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 544,col 13)-(line 544,col 52)",
        "(line 545,col 13)-(line 547,col 13)",
        "(line 548,col 13)-(line 548,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeysMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multiset.AbstractMultiSet\u003cK\u003e"
      ],
      "begin_line": 556,
      "end_line": 611,
      "comment": "\n     * Inner class that provides a MultiSet\u003cK\u003e keys view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.contains(java.lang.Object)",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 13)-(line 560,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.isEmpty()",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 13)-(line 565,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.size()",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.uniqueElements()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 575,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.getCount(java.lang.Object)",
      "begin_line": 578,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 580,col 13)-(line 580,col 26)",
        "(line 581,col 13)-(line 581,col 81)",
        "(line 582,col 13)-(line 584,col 13)",
        "(line 585,col 13)-(line 585,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.createEntrySetIterator()",
      "begin_line": 588,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 590,col 13)-(line 590,col 78)",
        "(line 591,col 13)-(line 591,col 93)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapEntryTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cjava.util.Map.Entry\u003cK, java.util.Collection\u003cV\u003e\u003e, org.apache.commons.collections4.MultiSet.Entry\u003cK\u003e\u003e"
      ],
      "begin_line": 594,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.MapEntryTransformer.transform(java.util.Map.Entry\u003cK, java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 596,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 598,col 17)-(line 608,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.MapEntryTransformer.Anonymous-f5596607-e007-4bf2-a696-754da9ff2d44.getElement()",
      "begin_line": 599,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 601,col 25)-(line 601,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.MapEntryTransformer.Anonymous-f51d283a-4c75-4c00-bdaf-65d93cfc4c40.getCount()",
      "begin_line": 604,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 25)-(line 606,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryValues",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 616,
      "end_line": 649,
      "comment": "\n     * Inner class that provides the Entry\u003cK, V\u003e view\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.iterator()",
      "begin_line": 618,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 620,col 13)-(line 641,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keysCol"
      ],
      "begin_line": 622,
      "end_line": 622,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyIterator"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.Anonymous-9a2c4eae-380d-4cca-8b00-6c5e0ce00e4b.nextIterator(int)",
      "begin_line": 625,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 627,col 21)-(line 629,col 21)",
        "(line 630,col 21)-(line 630,col 53)",
        "(line 631,col 21)-(line 638,col 22)",
        "(line 639,col 21)-(line 639,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.Anonymous-afe14374-f04b-46f4-bf43-f50ec5ecf6d6.transform(V)",
      "begin_line": 633,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 635,col 29)-(line 635,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.size()",
      "begin_line": 644,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 646,col 13)-(line 646,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiValuedMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e"
      ],
      "begin_line": 654,
      "end_line": 665,
      "comment": "\n     * Inner class for MultiValuedMap Entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapEntry.MultiValuedMapEntry(K, V)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapEntry.setValue(V)",
      "begin_line": 660,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiValuedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e"
      ],
      "begin_line": 670,
      "end_line": 720,
      "comment": "\n     * Inner class for MapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "it"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.MultiValuedMapIterator()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 677,col 13)-(line 677,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.hasNext()",
      "begin_line": 680,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 682,col 13)-(line 682,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.next()",
      "begin_line": 685,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 687,col 13)-(line 687,col 32)",
        "(line 688,col 13)-(line 688,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.getKey()",
      "begin_line": 691,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 693,col 13)-(line 695,col 13)",
        "(line 696,col 13)-(line 696,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.getValue()",
      "begin_line": 699,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 701,col 13)-(line 703,col 13)",
        "(line 704,col 13)-(line 704,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.remove()",
      "begin_line": 707,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 709,col 13)-(line 709,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.setValue(V)",
      "begin_line": 712,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 714,col 13)-(line 716,col 13)",
        "(line 717,col 13)-(line 717,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 725,
      "end_line": 744,
      "comment": "\n     * Inner class that provides the values view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.iterator()",
      "begin_line": 726,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 728,col 13)-(line 728,col 66)",
        "(line 729,col 13)-(line 731,col 13)",
        "(line 732,col 13)-(line 732,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.size()",
      "begin_line": 735,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 737,col 13)-(line 737,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.clear()",
      "begin_line": 740,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 742,col 13)-(line 742,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 749,
      "end_line": 777,
      "comment": "\n     * Inner class that provides the values iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 750,
      "end_line": 750,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 751,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 752,
      "end_line": 752,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.ValuesIterator(java.lang.Object)",
      "begin_line": 754,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 27)",
        "(line 756,col 13)-(line 756,col 44)",
        "(line 757,col 13)-(line 757,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.remove()",
      "begin_line": 760,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 762,col 13)-(line 762,col 30)",
        "(line 763,col 13)-(line 765,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.hasNext()",
      "begin_line": 768,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 770,col 13)-(line 770,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.next()",
      "begin_line": 773,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 775,col 13)-(line 775,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AsMap",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cK, java.util.Collection\u003cV\u003e\u003e"
      ],
      "begin_line": 782,
      "end_line": 902,
      "comment": "\n     * Inner class that provides the AsMap view.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decoratedMap"
      ],
      "begin_line": 783,
      "end_line": 783,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMap(java.util.Map\u003cK, java.util.Collection\u003cV\u003e\u003e)",
      "begin_line": 785,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 786,col 11)-(line 786,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.entrySet()",
      "begin_line": 789,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 791,col 11)-(line 791,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.containsKey(java.lang.Object)",
      "begin_line": 794,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 796,col 13)-(line 796,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.get(java.lang.Object)",
      "begin_line": 799,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 801,col 11)-(line 801,col 59)",
        "(line 802,col 11)-(line 804,col 11)",
        "(line 805,col 11)-(line 806,col 24)",
        "(line 807,col 11)-(line 807,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.keySet()",
      "begin_line": 810,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 812,col 11)-(line 812,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.size()",
      "begin_line": 815,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 817,col 11)-(line 817,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.remove(java.lang.Object)",
      "begin_line": 820,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 822,col 11)-(line 822,col 62)",
        "(line 823,col 11)-(line 825,col 11)",
        "(line 827,col 11)-(line 827,col 58)",
        "(line 828,col 11)-(line 828,col 36)",
        "(line 829,col 11)-(line 829,col 29)",
        "(line 830,col 11)-(line 830,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.equals(java.lang.Object)",
      "begin_line": 833,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 835,col 11)-(line 835,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.hashCode()",
      "begin_line": 838,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 840,col 11)-(line 840,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.toString()",
      "begin_line": 843,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 845,col 11)-(line 845,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.clear()",
      "begin_line": 848,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 850,col 13)-(line 850,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AsMapEntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, java.util.Collection\u003cV\u003e\u003e\u003e"
      ],
      "begin_line": 853,
      "end_line": 884,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySet.iterator()",
      "begin_line": 855,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 857,col 17)-(line 857,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySet.size()",
      "begin_line": 860,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 862,col 15)-(line 862,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySet.clear()",
      "begin_line": 865,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 867,col 17)-(line 867,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySet.contains(java.lang.Object)",
      "begin_line": 870,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 872,col 17)-(line 872,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySet.remove(java.lang.Object)",
      "begin_line": 875,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 877,col 17)-(line 879,col 17)",
        "(line 880,col 17)-(line 880,col 60)",
        "(line 881,col 17)-(line 881,col 67)",
        "(line 882,col 17)-(line 882,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AsMapEntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cjava.util.Map.Entry\u003cK, java.util.Collection\u003cV\u003e\u003e\u003e"
      ],
      "begin_line": 889,
      "end_line": 901,
      "comment": "\n         * EntrySet iterator for the asMap view.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySetIterator.AsMapEntrySetIterator(java.util.Iterator\u003cjava.util.Map.Entry\u003cK, java.util.Collection\u003cV\u003e\u003e\u003e)",
      "begin_line": 891,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 892,col 17)-(line 892,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AsMap.AsMapEntrySetIterator.next()",
      "begin_line": 895,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 897,col 17)-(line 897,col 71)",
        "(line 898,col 17)-(line 898,col 45)",
        "(line 899,col 17)-(line 899,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.doWriteObject(java.io.ObjectOutputStream)",
      "begin_line": 910,
      "end_line": 919,
      "comment": "\n     * Write the map out using a custom routine.\n     * @param out the output stream\n     * @throws IOException any of the usual I/O related exceptions\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 33)",
        "(line 912,col 9)-(line 918,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.doReadObject(java.io.ObjectInputStream)",
      "begin_line": 928,
      "end_line": 942,
      "comment": "\n     * Read the map in using a custom routine.\n     * @param in the input stream\n     * @throws IOException any of the usual I/O related exceptions\n     * @throws ClassNotFoundException if the stream contains an object which class can not be loaded\n     * @throws ClassCastException if the stream does not contain the correct objects\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 43)",
        "(line 931,col 9)-(line 941,col 9)"
      ]
    }
  ]
}
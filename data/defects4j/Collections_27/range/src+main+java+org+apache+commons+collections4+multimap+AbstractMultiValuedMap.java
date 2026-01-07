{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 887,
      "comment": "\n * Abstract implementation of the {@link MultiValuedMap} interface to simplify\n * the creation of subclass implementations.\n * \u003cp\u003e\n * Subclasses specify a Map implementation to use as the internal storage.\n *\n * @since 4.1\n * @version $Id$\n "
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
        "collectionFactory"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The factory for creating value collections. "
    },
    {
      "type": "field",
      "varNames": [
        "valuesView"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The values view "
    },
    {
      "type": "field",
      "varNames": [
        "entryValuesView"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The EntryValues view "
    },
    {
      "type": "field",
      "varNames": [
        "keysMultiSetView"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The KeyMultiSet view "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The map used to store the data "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AbstractMultiValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param \u003cC\u003e the collection type\n     * @param map  the map to wrap, must not be null\n     * @param collectionClazz  the collection class\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 47)",
        "(line 88,col 9)-(line 88,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.AbstractMultiValuedMap(java.util.Map\u003cK, ? super C\u003e, java.lang.Class\u003cC\u003e, int)",
      "begin_line": 101,
      "end_line": 114,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param \u003cC\u003e the collection type\n     * @param map  the map to wrap, must not be null\n     * @param collectionClazz  the collection class\n     * @param initialCollectionCapacity  the initial capacity of the collection\n     * @throws NullPointerException  if the map is null\n     * @throws IllegalArgumentException  if initialCollectionCapacity is negative\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 47)",
        "(line 111,col 9)-(line 113,col 77)"
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
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsValue(java.lang.Object)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.containsMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 47)",
        "(line 138,col 9)-(line 138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.entries()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.get(K)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "\n     * Gets the collection of values associated with the specified key. This\n     * would return an empty collection in case the mapping is not present\n     *\n     * @param key the key to retrieve\n     * @return the {@code Collection} of values, will return an empty {@code Collection} for no mapping\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.remove(java.lang.Object)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * A subsequent \u003ccode\u003eget(Object)\u003c/code\u003e would return an empty collection.\n     *\n     * @param key  the key to remove values from\n     * @return the \u003ccode\u003eCollection\u003c/code\u003e of values removed, will return an\n     *   empty, unmodifiable collection for no mapping found\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.removeMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 186,
      "end_line": 197,
      "comment": "\n     * Removes a specific key/value mapping from the multi-valued map.\n     * \u003cp\u003e\n     * The value is removed from the collection mapped to the specified key.\n     * Other values attached to that key are unaffected.\n     * \u003cp\u003e\n     * If the last value for a key is removed, an empty collection would be\n     * returned from a subsequent {@link #get(Object)}.\n     *\n     * @param key the key to remove from\n     * @param value the value to remove\n     * @return true if the mapping was removed, false otherwise\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 45)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.isEmpty()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.keySet()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.size()",
      "begin_line": 209,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 21)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.values()",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Gets a collection containing all the values in the map.\n     * \u003cp\u003e\n     * Returns a collection containing all the values from all keys.\n     *\n     * @return a collection view of the values contained in this map\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 44)",
        "(line 229,col 9)-(line 229,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.clear()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.put(K, V)",
      "begin_line": 247,
      "end_line": 261,
      "comment": "\n     * Adds the value to the collection associated with the specified key.\n     * \u003cp\u003e\n     * Unlike a normal \u003ccode\u003eMap\u003c/code\u003e the previous value is not replaced.\n     * Instead the new value is added to the collection stored against the key.\n     *\n     * @param key the key to store against\n     * @param value the value to add to the collection at the key\n     * @return the value added if the map changed and null if the map did not change\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 275,
      "end_line": 285,
      "comment": "\n     * Copies all of the mappings from the specified map to this map. The effect\n     * of this call is equivalent to that of calling {@link #put(Object,Object)\n     * put(k, v)} on this map once for each mapping from key {@code k} to value\n     * {@code v} in the specified map. The behavior of this operation is\n     * undefined if the specified map is modified while the operation is in\n     * progress.\n     *\n     * @param map mappings to be stored in this map, may not be null\n     * @return true if the map changed as a result of this operation\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 32)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 299,
      "end_line": 309,
      "comment": "\n     * Copies all of the mappings from the specified MultiValuedMap to this map.\n     * The effect of this call is equivalent to that of calling\n     * {@link #put(Object,Object) put(k, v)} on this map once for each mapping\n     * from key {@code k} to value {@code v} in the specified map. The\n     * behavior of this operation is undefined if the specified map is modified\n     * while the operation is in progress.\n     *\n     * @param map mappings to be stored in this map, may not be null\n     * @return true if the map changed as a result of this operation\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 32)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.keys()",
      "begin_line": 321,
      "end_line": 325,
      "comment": "\n     * Returns a {@link MultiSet} view of the key mapping contained in this map.\n     * \u003cp\u003e\n     * Returns a MultiSet of keys with its values count as the count of the MultiSet.\n     * This multiset is backed by the map, so any changes in the map is reflected here.\n     * Any method which modifies this multiset like {@code add}, {@code remove},\n     * {@link Iterator#remove()} etc throws {@code UnsupportedOperationException}.\n     *\n     * @return a bag view of the key mapping contained in this map\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 324,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.asMap()",
      "begin_line": 327,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 340,
      "end_line": 353,
      "comment": "\n     * Adds Iterable values to the collection associated with the specified key.\n     *\n     * @param key the key to store against\n     * @param values the values to add to the collection at the key, may not be null\n     * @return true if this map changed\n     * @throws NullPointerException if values is null\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.mapIterator()",
      "begin_line": 355,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.equals(java.lang.Object)",
      "begin_line": 363,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.hashCode()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.toString()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.createCollection()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WrappedCollection",
      "is_interface": false,
      "parent_types": [
        "java.util.Collection\u003cV\u003e"
      ],
      "begin_line": 395,
      "end_line": 540,
      "comment": "\n     * Wrapped collection to handle add and remove on the collection returned by get(object)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.WrappedCollection(K)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.getMapping()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.add(V)",
      "begin_line": 407,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 46)",
        "(line 410,col 13)-(line 413,col 13)",
        "(line 414,col 13)-(line 414,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.addAll(java.util.Collection\u003c? extends V\u003e)",
      "begin_line": 417,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 46)",
        "(line 420,col 13)-(line 423,col 13)",
        "(line 424,col 13)-(line 424,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.clear()",
      "begin_line": 427,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 429,col 13)-(line 429,col 52)",
        "(line 430,col 13)-(line 433,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.iterator()",
      "begin_line": 436,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 52)",
        "(line 440,col 13)-(line 442,col 13)",
        "(line 443,col 13)-(line 443,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.size()",
      "begin_line": 446,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 448,col 13)-(line 448,col 52)",
        "(line 449,col 13)-(line 449,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.contains(java.lang.Object)",
      "begin_line": 452,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 52)",
        "(line 455,col 13)-(line 455,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 458,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 52)",
        "(line 461,col 13)-(line 461,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.isEmpty()",
      "begin_line": 464,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 52)",
        "(line 467,col 13)-(line 467,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.remove(java.lang.Object)",
      "begin_line": 470,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 52)",
        "(line 473,col 13)-(line 475,col 13)",
        "(line 477,col 13)-(line 477,col 47)",
        "(line 478,col 13)-(line 480,col 13)",
        "(line 481,col 13)-(line 481,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 484,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 52)",
        "(line 487,col 13)-(line 489,col 13)",
        "(line 491,col 13)-(line 491,col 47)",
        "(line 492,col 13)-(line 494,col 13)",
        "(line 495,col 13)-(line 495,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 498,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 500,col 13)-(line 500,col 52)",
        "(line 501,col 13)-(line 503,col 13)",
        "(line 505,col 13)-(line 505,col 47)",
        "(line 506,col 13)-(line 508,col 13)",
        "(line 509,col 13)-(line 509,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toArray()",
      "begin_line": 512,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 52)",
        "(line 515,col 13)-(line 517,col 13)",
        "(line 518,col 13)-(line 518,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toArray(T[])",
      "begin_line": 521,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 52)",
        "(line 525,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 528,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.WrappedCollection.toString()",
      "begin_line": 531,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 533,col 13)-(line 533,col 52)",
        "(line 534,col 13)-(line 536,col 13)",
        "(line 537,col 13)-(line 537,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeysMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MultiSet\u003cK\u003e"
      ],
      "begin_line": 545,
      "end_line": 719,
      "comment": "\n     * Inner class that provides a MultiSet\u003cK\u003e keys view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.addAll(java.util.Collection\u003c? extends K\u003e)",
      "begin_line": 547,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 13)-(line 549,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.clear()",
      "begin_line": 552,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 13)-(line 554,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.contains(java.lang.Object)",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 13)-(line 559,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.isEmpty()",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.toArray()",
      "begin_line": 567,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 55)",
        "(line 570,col 13)-(line 570,col 22)",
        "(line 571,col 13)-(line 571,col 64)",
        "(line 572,col 13)-(line 577,col 13)",
        "(line 578,col 13)-(line 578,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.toArray(T[])",
      "begin_line": 581,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 36)",
        "(line 584,col 13)-(line 589,col 13)",
        "(line 591,col 13)-(line 591,col 22)",
        "(line 592,col 13)-(line 592,col 64)",
        "(line 593,col 13)-(line 602,col 13)",
        "(line 603,col 13)-(line 605,col 13)",
        "(line 606,col 13)-(line 606,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.getCount(java.lang.Object)",
      "begin_line": 609,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 611,col 13)-(line 611,col 26)",
        "(line 612,col 13)-(line 612,col 81)",
        "(line 613,col 13)-(line 615,col 13)",
        "(line 616,col 13)-(line 616,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.setCount(K, int)",
      "begin_line": 619,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.add(K)",
      "begin_line": 624,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 13)-(line 626,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.add(K, int)",
      "begin_line": 629,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 631,col 13)-(line 631,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.remove(java.lang.Object)",
      "begin_line": 634,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 636,col 13)-(line 636,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.remove(java.lang.Object, int)",
      "begin_line": 639,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 641,col 13)-(line 641,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.uniqueSet()",
      "begin_line": 644,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 646,col 13)-(line 646,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.entrySet()",
      "begin_line": 649,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 652,col 13)-(line 652,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.size()",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 660,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 50)",
        "(line 663,col 13)-(line 667,col 13)",
        "(line 668,col 13)-(line 668,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 13)-(line 673,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 676,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 13)-(line 678,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.iterator()",
      "begin_line": 681,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 683,col 13)-(line 716,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keyIterator"
      ],
      "begin_line": 685,
      "end_line": 685,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.Anonymous-417572b8-dae9-4f34-90e6-b37998b16d5e.nextIterator(int)",
      "begin_line": 687,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 689,col 21)-(line 691,col 21)",
        "(line 692,col 21)-(line 692,col 53)",
        "(line 693,col 21)-(line 693,col 81)",
        "(line 694,col 21)-(line 713,col 22)",
        "(line 714,col 21)-(line 714,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.Anonymous-fd068427-0957-4c6a-a1dd-71bf7e09cbfe.hasNext()",
      "begin_line": 696,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 698,col 29)-(line 698,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.Anonymous-9fced275-51c8-4667-aaa1-abfd4ec86793.next()",
      "begin_line": 701,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 703,col 29)-(line 703,col 47)",
        "(line 706,col 29)-(line 706,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.KeysMultiSet.Anonymous-a9904eab-5621-4d15-bc3b-a1d82837b307.remove()",
      "begin_line": 709,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 711,col 29)-(line 711,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryValues",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 724,
      "end_line": 757,
      "comment": "\n     * Inner class that provides the Entry\u003cK, V\u003e view\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.iterator()",
      "begin_line": 726,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 728,col 13)-(line 749,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "keysCol"
      ],
      "begin_line": 730,
      "end_line": 730,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyIterator"
      ],
      "begin_line": 731,
      "end_line": 731,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.Anonymous-dc8fdb44-6371-4a83-ad81-030606db0efb.nextIterator(int)",
      "begin_line": 733,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 735,col 21)-(line 737,col 21)",
        "(line 738,col 21)-(line 738,col 53)",
        "(line 739,col 21)-(line 746,col 22)",
        "(line 747,col 21)-(line 747,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.Anonymous-11a635d8-048f-49d9-b5dc-b29185d88ccb.transform(V)",
      "begin_line": 741,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 743,col 29)-(line 743,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.EntryValues.size()",
      "begin_line": 752,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 754,col 13)-(line 754,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiValuedMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e"
      ],
      "begin_line": 762,
      "end_line": 773,
      "comment": "\n     * Inner class for MultiValuedMap Entries.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapEntry.MultiValuedMapEntry(K, V)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 765,col 13)-(line 765,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapEntry.setValue(V)",
      "begin_line": 768,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 770,col 13)-(line 770,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiValuedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e"
      ],
      "begin_line": 778,
      "end_line": 828,
      "comment": "\n     * Inner class for MapIterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "it"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.MultiValuedMapIterator()",
      "begin_line": 784,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 785,col 13)-(line 785,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.hasNext()",
      "begin_line": 788,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 790,col 13)-(line 790,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.next()",
      "begin_line": 793,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 795,col 13)-(line 795,col 32)",
        "(line 796,col 13)-(line 796,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.getKey()",
      "begin_line": 799,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 801,col 13)-(line 803,col 13)",
        "(line 804,col 13)-(line 804,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.getValue()",
      "begin_line": 807,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 809,col 13)-(line 811,col 13)",
        "(line 812,col 13)-(line 812,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.remove()",
      "begin_line": 815,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 817,col 13)-(line 817,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.MultiValuedMapIterator.setValue(V)",
      "begin_line": 820,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 822,col 13)-(line 824,col 13)",
        "(line 825,col 13)-(line 825,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 833,
      "end_line": 852,
      "comment": "\n     * Inner class that provides the values view.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.iterator()",
      "begin_line": 834,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 836,col 13)-(line 836,col 66)",
        "(line 837,col 13)-(line 839,col 13)",
        "(line 840,col 13)-(line 840,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.size()",
      "begin_line": 843,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 845,col 13)-(line 845,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.Values.clear()",
      "begin_line": 848,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 850,col 13)-(line 850,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 857,
      "end_line": 885,
      "comment": "\n     * Inner class that provides the values iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 858,
      "end_line": 858,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.ValuesIterator(java.lang.Object)",
      "begin_line": 862,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 863,col 13)-(line 863,col 27)",
        "(line 864,col 13)-(line 864,col 44)",
        "(line 865,col 13)-(line 865,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.remove()",
      "begin_line": 868,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 870,col 13)-(line 870,col 30)",
        "(line 871,col 13)-(line 873,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.hasNext()",
      "begin_line": 876,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 878,col 13)-(line 878,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMap.ValuesIterator.next()",
      "begin_line": 881,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 883,col 13)-(line 883,col 35)"
      ]
    }
  ]
}
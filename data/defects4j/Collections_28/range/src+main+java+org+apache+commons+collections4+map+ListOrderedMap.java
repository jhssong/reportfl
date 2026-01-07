{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/ListOrderedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListOrderedMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 802,
      "comment": "\n * Decorates a \u003ccode\u003eMap\u003c/code\u003e to ensure that the order of addition is retained\n * using a \u003ccode\u003eList\u003c/code\u003e to maintain order.\n * \u003cp\u003e\n * The order will be used via the iterators and toArray methods on the views.\n * The order is also returned by the \u003ccode\u003eMapIterator\u003c/code\u003e.\n * The \u003ccode\u003eorderedMapIterator()\u003c/code\u003e method accesses an iterator that can\n * iterate both forwards and backwards through the map.\n * In addition, non-interface methods are provided to access the map by index.\n * \u003cp\u003e\n * If an object is added to the Map for a second time, it will remain in the\n * original position in the iteration.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that ListOrderedMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that ListOrderedMap doesn\u0027t work with\n * {@link java.util.IdentityHashMap IdentityHashMap}, {@link CaseInsensitiveMap},\n * or similar maps that violate the general contract of {@link java.util.Map}.\u003c/strong\u003e\n * The \u003ccode\u003eListOrderedMap\u003c/code\u003e (or, more precisely, the underlying \u003ccode\u003eList\u003c/code\u003e)\n * is relying on {@link Object#equals(Object) equals()}. This is fine, as long as the\n * decorated \u003ccode\u003eMap\u003c/code\u003e is also based on {@link Object#equals(Object) equals()},\n * and {@link Object#hashCode() hashCode()}, which\n * {@link java.util.IdentityHashMap IdentityHashMap}, and\n * {@link CaseInsensitiveMap} don\u0027t: The former uses \u003ccode\u003e\u003d\u003d\u003c/code\u003e, and\n * the latter uses {@link Object#equals(Object) equals()} on a lower-cased\n * key.\n * \u003cp\u003e\n * This class is {@link Serializable} starting with Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "insertOrder"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Internal list to hold the sequence of objects "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.listOrderedMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Factory method to create an ordered map.\n     * \u003cp\u003e\n     * An \u003ccode\u003eArrayList\u003c/code\u003e is used to retain order.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, must not be null\n     * @return a new list ordered map\n     * @throws NullPointerException if map is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMap()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Constructs a new empty \u003ccode\u003eListOrderedMap\u003c/code\u003e that decorates\n     * a \u003ccode\u003eHashMap\u003c/code\u003e.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMap(java.util.Map\u003cK, V\u003e)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param map  the map to decorate, must not be null\n     * @throws NullPointerException if map is null\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 19)",
        "(line 123,col 9)-(line 123,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 33)",
        "(line 136,col 9)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.mapIterator()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.firstKey()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Gets the first key in this map by insert order.\n     *\n     * @return the first key currently in this map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.lastKey()",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * Gets the last key in this map by insert order.\n     *\n     * @return the last key currently in this map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.nextKey(java.lang.Object)",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\n     * Gets the next key to the one specified using insert order.\n     * This method performs a list search to find the key and is O(n).\n     *\n     * @param key  the key to find previous for\n     * @return the next key, null if no match or at start\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 51)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.previousKey(java.lang.Object)",
      "begin_line": 211,
      "end_line": 218,
      "comment": "\n     * Gets the previous key to the one specified using insert order.\n     * This method performs a list search to find the key and is O(n).\n     *\n     * @param key  the key to find previous for\n     * @return the previous key, null if no match or at start\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.put(K, V)",
      "begin_line": 221,
      "end_line": 231,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 223,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 53)",
        "(line 229,col 9)-(line 229,col 29)",
        "(line 230,col 9)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.putAll(int, java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 248,
      "end_line": 266,
      "comment": "\n     * Puts the values contained in a supplied Map into the Map starting at\n     * the specified index.\n     *\n     * @param index the index in the Map to start at.\n     * @param map the Map containing the entries to be added.\n     * @throws IndexOutOfBoundsException if the index is out of range [0, size]\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.remove(java.lang.Object)",
      "begin_line": 268,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 24)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.clear()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 28)",
        "(line 281,col 9)-(line 281,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.keySet()",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n     * Gets a view over the keys in the map.\n     * \u003cp\u003e\n     * The Collection will be ordered by object insertion into the map.\n     *\n     * @see #keyList()\n     * @return the fully modifiable collection view over the keys\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.keyList()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Gets a view over the keys in the map as a List.\n     * \u003cp\u003e\n     * The List will be ordered by object insertion into the map.\n     * The List is unmodifiable.\n     *\n     * @see #keySet()\n     * @return the unmodifiable list view over the keys\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.values()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * Gets a view over the values in the map.\n     * \u003cp\u003e\n     * The Collection will be ordered by object insertion into the map.\n     * \u003cp\u003e\n     * From Commons Collections 3.2, this Collection can be cast\n     * to a list, see {@link #valueList()}\n     *\n     * @see #valueList()\n     * @return the fully modifiable collection view over the values\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.valueList()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Gets a view over the values in the map as a List.\n     * \u003cp\u003e\n     * The List will be ordered by object insertion into the map.\n     * The List supports remove and set, but does not support add.\n     *\n     * @see #values()\n     * @return the partially modifiable list view over the values\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.entrySet()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n     * Gets a view over the entries in the map.\n     * \u003cp\u003e\n     * The Set will be ordered by object insertion into the map.\n     *\n     * @return the fully modifiable set view over the entries\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.toString()",
      "begin_line": 360,
      "end_line": 382,
      "comment": "\n     * Returns the Map as a string.\n     *\n     * @return the Map as a String\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 54)",
        "(line 366,col 9)-(line 366,col 24)",
        "(line 367,col 9)-(line 367,col 29)",
        "(line 368,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 24)",
        "(line 381,col 9)-(line 381,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.get(int)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Gets the key at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.getValue(int)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Gets the value at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.indexOf(java.lang.Object)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Gets the index of the specified key.\n     *\n     * @param key  the key to find the index of\n     * @return the index, or -1 if not found\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.setValue(int, V)",
      "begin_line": 426,
      "end_line": 429,
      "comment": "\n     * Sets the value at the specified index.\n     *\n     * @param index  the index of the value to set\n     * @param value  the new value to set\n     * @return the previous value at that index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 45)",
        "(line 428,col 9)-(line 428,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.put(int, K, V)",
      "begin_line": 450,
      "end_line": 470,
      "comment": "\n     * Puts a key-value mapping into the map at the specified index.\n     * \u003cp\u003e\n     * If the map already contains the key, then the original mapping\n     * is removed and the new mapping added at the specified index.\n     * The remove may change the effect of the index. The index is\n     * always calculated relative to the original state of the map.\n     * \u003cp\u003e\n     * Thus the steps are: (1) remove the existing key-value mapping,\n     * then (2) insert the new key-value mapping at the position it\n     * would have been inserted had the remove not occurred.\n     *\n     * @param index  the index at which the mapping should be inserted\n     * @param key  the key\n     * @param value  the value\n     * @return the value previously mapped to the key\n     * @throws IndexOutOfBoundsException if the index is out of range [0, size]\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 40)",
        "(line 456,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 36)",
        "(line 468,col 9)-(line 468,col 26)",
        "(line 469,col 9)-(line 469,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.remove(int)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Removes the element at the specified index.\n     *\n     * @param index  the index of the object to remove\n     * @return the removed value, or \u003ccode\u003enull\u003c/code\u003e if none existed\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.asList()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * Gets an unmodifiable List view of the keys which changes as the map changes.\n     * \u003cp\u003e\n     * The returned list is unmodifiable because changes to the values of\n     * the list (using {@link java.util.ListIterator#set(Object)}) will\n     * effectively remove the value from the list and reinsert that value at\n     * the end of the list, which is an unexpected side effect of changing the\n     * value of a list.  This occurs because changing the key, changes when the\n     * mapping is added to the map and thus where it appears in the list.\n     * \u003cp\u003e\n     * An alternative to this method is to use the better named\n     * {@link #keyList()} or {@link #keySet()}.\n     *\n     * @see #keyList()\n     * @see #keySet()\n     * @return The ordered list of keys.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cV\u003e"
      ],
      "begin_line": 505,
      "end_line": 553,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.ValuesView(org.apache.commons.collections4.map.ListOrderedMap\u003c?, V\u003e)",
      "begin_line": 508,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 510,col 13)-(line 510,col 20)",
        "(line 511,col 13)-(line 511,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.size()",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.contains(java.lang.Object)",
      "begin_line": 519,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 13)-(line 521,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.clear()",
      "begin_line": 524,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 526,col 13)-(line 526,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.iterator()",
      "begin_line": 529,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 531,col 13)-(line 536,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.Anonymous-698b41d3-b64f-4b06-ad39-606a729a7d6a.next()",
      "begin_line": 532,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 21)-(line 534,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.get(int)",
      "begin_line": 539,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 13)-(line 541,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.set(int, V)",
      "begin_line": 544,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 13)-(line 546,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.remove(int)",
      "begin_line": 549,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 556,
      "end_line": 589,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 557,
      "end_line": 557,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.KeySetView(org.apache.commons.collections4.map.ListOrderedMap\u003cK, ?\u003e)",
      "begin_line": 559,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 20)",
        "(line 562,col 13)-(line 562,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.size()",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 13)-(line 567,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.contains(java.lang.Object)",
      "begin_line": 570,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.clear()",
      "begin_line": 575,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.iterator()",
      "begin_line": 580,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 582,col 13)-(line 587,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.Anonymous-56ad9f05-e2e3-4dce-a550-b62a927cb64d.next()",
      "begin_line": 583,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 21)-(line 585,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 592,
      "end_line": 670,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 593,
      "end_line": 593,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "insertOrder"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.EntrySetView(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e, java.util.List\u003cK\u003e)",
      "begin_line": 597,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 20)",
        "(line 599,col 13)-(line 599,col 33)",
        "(line 600,col 13)-(line 600,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.getEntrySet()",
      "begin_line": 603,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 604,col 13)-(line 606,col 13)",
        "(line 607,col 13)-(line 607,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.size()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 13)-(line 612,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.isEmpty()",
      "begin_line": 614,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 616,col 13)-(line 616,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.contains(java.lang.Object)",
      "begin_line": 619,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 624,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 13)-(line 626,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.remove(java.lang.Object)",
      "begin_line": 629,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 632,col 13)-(line 634,col 13)",
        "(line 635,col 13)-(line 639,col 13)",
        "(line 640,col 13)-(line 640,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.clear()",
      "begin_line": 643,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 645,col 13)-(line 645,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.equals(java.lang.Object)",
      "begin_line": 648,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 650,col 13)-(line 652,col 13)",
        "(line 653,col 13)-(line 653,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.hashCode()",
      "begin_line": 656,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 658,col 13)-(line 658,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.toString()",
      "begin_line": 661,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 663,col 13)-(line 663,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.iterator()",
      "begin_line": 666,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 668,col 13)-(line 668,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ListOrderedIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator\u003cK, java.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 673,
      "end_line": 693,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator.ListOrderedIterator(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e, java.util.List\u003cK\u003e)",
      "begin_line": 677,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 678,col 13)-(line 678,col 42)",
        "(line 679,col 13)-(line 679,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator.next()",
      "begin_line": 682,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 684,col 13)-(line 684,col 40)",
        "(line 685,col 13)-(line 685,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator.remove()",
      "begin_line": 688,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 690,col 13)-(line 690,col 27)",
        "(line 691,col 13)-(line 691,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ListOrderedMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e"
      ],
      "begin_line": 696,
      "end_line": 713,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 697,
      "end_line": 697,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry.ListOrderedMapEntry(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e, K)",
      "begin_line": 699,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 700,col 13)-(line 700,col 29)",
        "(line 701,col 13)-(line 701,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry.getValue()",
      "begin_line": 704,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 13)-(line 706,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry.setValue(V)",
      "begin_line": 709,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 711,col 13)-(line 711,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ListOrderedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 716,
      "end_line": 800,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 718,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 719,
      "end_line": 719,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readable"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.ListOrderedMapIterator(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e)",
      "begin_line": 722,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 723,col 13)-(line 723,col 20)",
        "(line 724,col 13)-(line 724,col 33)",
        "(line 725,col 13)-(line 725,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.hasNext()",
      "begin_line": 728,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 730,col 13)-(line 730,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.next()",
      "begin_line": 733,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 735,col 13)-(line 735,col 35)",
        "(line 736,col 13)-(line 736,col 28)",
        "(line 737,col 13)-(line 737,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.hasPrevious()",
      "begin_line": 740,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 742,col 13)-(line 742,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.previous()",
      "begin_line": 745,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 747,col 13)-(line 747,col 39)",
        "(line 748,col 13)-(line 748,col 28)",
        "(line 749,col 13)-(line 749,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.remove()",
      "begin_line": 752,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 754,col 13)-(line 756,col 13)",
        "(line 757,col 13)-(line 757,col 30)",
        "(line 758,col 13)-(line 758,col 36)",
        "(line 759,col 13)-(line 759,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.getKey()",
      "begin_line": 762,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 764,col 13)-(line 766,col 13)",
        "(line 767,col 13)-(line 767,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.getValue()",
      "begin_line": 770,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 772,col 13)-(line 774,col 13)",
        "(line 775,col 13)-(line 775,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.setValue(V)",
      "begin_line": 778,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 780,col 13)-(line 782,col 13)",
        "(line 783,col 13)-(line 783,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.reset()",
      "begin_line": 786,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 788,col 13)-(line 788,col 57)",
        "(line 789,col 13)-(line 789,col 24)",
        "(line 790,col 13)-(line 790,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.toString()",
      "begin_line": 793,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 795,col 13)-(line 797,col 13)",
        "(line 798,col 13)-(line 798,col 32)"
      ]
    }
  ]
}
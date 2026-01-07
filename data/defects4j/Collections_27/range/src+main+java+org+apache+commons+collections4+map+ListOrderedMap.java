{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/ListOrderedMap.java",
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
      "end_line": 786,
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
      "end_line": 171,
      "comment": "\n     * Gets the first key in this map by insert order.\n     *\n     * @return the first key currently in this map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.lastKey()",
      "begin_line": 179,
      "end_line": 184,
      "comment": "\n     * Gets the last key in this map by insert order.\n     *\n     * @return the last key currently in this map\n     * @throws NoSuchElementException if this map is empty\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.nextKey(java.lang.Object)",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Gets the next key to the one specified using insert order.\n     * This method performs a list search to find the key and is O(n).\n     *\n     * @param key  the key to find previous for\n     * @return the next key, null if no match or at start\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 51)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.previousKey(java.lang.Object)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Gets the previous key to the one specified using insert order.\n     * This method performs a list search to find the key and is O(n).\n     *\n     * @param key  the key to find previous for\n     * @return the previous key, null if no match or at start\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.put(K, V)",
      "begin_line": 217,
      "end_line": 227,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 219,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 53)",
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.putAll(int, java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 244,
      "end_line": 262,
      "comment": "\n     * Puts the values contained in a supplied Map into the Map starting at\n     * the specified index.\n     *\n     * @param index the index in the Map to start at.\n     * @param map the Map containing the entries to be added.\n     * @throws IndexOutOfBoundsException if the index is out of range [0, size]\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.remove(java.lang.Object)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 24)",
        "(line 267,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.clear()",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 28)",
        "(line 277,col 9)-(line 277,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.keySet()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * Gets a view over the keys in the map.\n     * \u003cp\u003e\n     * The Collection will be ordered by object insertion into the map.\n     *\n     * @see #keyList()\n     * @return the fully modifiable collection view over the keys\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.keyList()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Gets a view over the keys in the map as a List.\n     * \u003cp\u003e\n     * The List will be ordered by object insertion into the map.\n     * The List is unmodifiable.\n     *\n     * @see #keySet()\n     * @return the unmodifiable list view over the keys\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.values()",
      "begin_line": 319,
      "end_line": 322,
      "comment": "\n     * Gets a view over the values in the map.\n     * \u003cp\u003e\n     * The Collection will be ordered by object insertion into the map.\n     * \u003cp\u003e\n     * From Commons Collections 3.2, this Collection can be cast\n     * to a list, see {@link #valueList()}\n     *\n     * @see #valueList()\n     * @return the fully modifiable collection view over the values\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.valueList()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Gets a view over the values in the map as a List.\n     * \u003cp\u003e\n     * The List will be ordered by object insertion into the map.\n     * The List supports remove and set, but does not support add.\n     *\n     * @see #values()\n     * @return the partially modifiable list view over the values\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.entrySet()",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n     * Gets a view over the entries in the map.\n     * \u003cp\u003e\n     * The Set will be ordered by object insertion into the map.\n     *\n     * @return the fully modifiable set view over the entries\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.toString()",
      "begin_line": 356,
      "end_line": 378,
      "comment": "\n     * Returns the Map as a string.\n     *\n     * @return the Map as a String\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 54)",
        "(line 362,col 9)-(line 362,col 24)",
        "(line 363,col 9)-(line 363,col 29)",
        "(line 364,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 24)",
        "(line 377,col 9)-(line 377,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.get(int)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Gets the key at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.getValue(int)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Gets the value at the specified index.\n     *\n     * @param index  the index to retrieve\n     * @return the key at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.indexOf(java.lang.Object)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * Gets the index of the specified key.\n     *\n     * @param key  the key to find the index of\n     * @return the index, or -1 if not found\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.setValue(int, V)",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * Sets the value at the specified index.\n     *\n     * @param index  the index of the value to set\n     * @param value  the new value to set\n     * @return the previous value at that index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 45)",
        "(line 424,col 9)-(line 424,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.put(int, K, V)",
      "begin_line": 446,
      "end_line": 466,
      "comment": "\n     * Puts a key-value mapping into the map at the specified index.\n     * \u003cp\u003e\n     * If the map already contains the key, then the original mapping\n     * is removed and the new mapping added at the specified index.\n     * The remove may change the effect of the index. The index is\n     * always calculated relative to the original state of the map.\n     * \u003cp\u003e\n     * Thus the steps are: (1) remove the existing key-value mapping,\n     * then (2) insert the new key-value mapping at the position it\n     * would have been inserted had the remove not occurred.\n     *\n     * @param index  the index at which the mapping should be inserted\n     * @param key  the key\n     * @param value  the value\n     * @return the value previously mapped to the key\n     * @throws IndexOutOfBoundsException if the index is out of range [0, size]\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 40)",
        "(line 452,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 26)",
        "(line 465,col 9)-(line 465,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.remove(int)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Removes the element at the specified index.\n     *\n     * @param index  the index of the object to remove\n     * @return the removed value, or \u003ccode\u003enull\u003c/code\u003e if none existed\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.asList()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Gets an unmodifiable List view of the keys which changes as the map changes.\n     * \u003cp\u003e\n     * The returned list is unmodifiable because changes to the values of\n     * the list (using {@link java.util.ListIterator#set(Object)}) will\n     * effectively remove the value from the list and reinsert that value at\n     * the end of the list, which is an unexpected side effect of changing the\n     * value of a list.  This occurs because changing the key, changes when the\n     * mapping is added to the map and thus where it appears in the list.\n     * \u003cp\u003e\n     * An alternative to this method is to use the better named\n     * {@link #keyList()} or {@link #keySet()}.\n     *\n     * @see #keyList()\n     * @see #keySet()\n     * @return The ordered list of keys.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cV\u003e"
      ],
      "begin_line": 501,
      "end_line": 548,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.ValuesView(org.apache.commons.collections4.map.ListOrderedMap\u003c?, V\u003e)",
      "begin_line": 504,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 506,col 13)-(line 506,col 20)",
        "(line 507,col 13)-(line 507,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.size()",
      "begin_line": 510,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 13)-(line 512,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.contains(java.lang.Object)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.clear()",
      "begin_line": 520,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 13)-(line 522,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.iterator()",
      "begin_line": 525,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 527,col 13)-(line 531,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.Anonymous-1e52dda8-63ac-46a0-a5ea-3522541fcde1.next()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 21)-(line 529,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.get(int)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.set(int, V)",
      "begin_line": 539,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 13)-(line 541,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ValuesView.remove(int)",
      "begin_line": 544,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 13)-(line 546,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 551,
      "end_line": 583,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.KeySetView(org.apache.commons.collections4.map.ListOrderedMap\u003cK, ?\u003e)",
      "begin_line": 554,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 556,col 13)-(line 556,col 20)",
        "(line 557,col 13)-(line 557,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.size()",
      "begin_line": 560,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.contains(java.lang.Object)",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 13)-(line 567,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.clear()",
      "begin_line": 570,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.iterator()",
      "begin_line": 575,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 581,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.KeySetView.Anonymous-9674d8ec-db14-44ee-beed-351cc7210867.next()",
      "begin_line": 578,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 21)-(line 579,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 586,
      "end_line": 664,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 587,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "insertOrder"
      ],
      "begin_line": 588,
      "end_line": 588,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.EntrySetView(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e, java.util.List\u003cK\u003e)",
      "begin_line": 591,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 592,col 13)-(line 592,col 20)",
        "(line 593,col 13)-(line 593,col 33)",
        "(line 594,col 13)-(line 594,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.getEntrySet()",
      "begin_line": 597,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 598,col 13)-(line 600,col 13)",
        "(line 601,col 13)-(line 601,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.size()",
      "begin_line": 604,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 13)-(line 606,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.isEmpty()",
      "begin_line": 608,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 610,col 13)-(line 610,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.contains(java.lang.Object)",
      "begin_line": 613,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 618,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 620,col 13)-(line 620,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.remove(java.lang.Object)",
      "begin_line": 623,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 626,col 13)-(line 628,col 13)",
        "(line 629,col 13)-(line 633,col 13)",
        "(line 634,col 13)-(line 634,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.clear()",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 639,col 13)-(line 639,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.equals(java.lang.Object)",
      "begin_line": 642,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 644,col 13)-(line 646,col 13)",
        "(line 647,col 13)-(line 647,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.hashCode()",
      "begin_line": 650,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 652,col 13)-(line 652,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.toString()",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.EntrySetView.iterator()",
      "begin_line": 660,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ListOrderedIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator\u003cK, java.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 667,
      "end_line": 686,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 668,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 669,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator.ListOrderedIterator(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e, java.util.List\u003cK\u003e)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 672,col 13)-(line 672,col 42)",
        "(line 673,col 13)-(line 673,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator.next()",
      "begin_line": 676,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 677,col 13)-(line 677,col 40)",
        "(line 678,col 13)-(line 678,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedIterator.remove()",
      "begin_line": 681,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 683,col 13)-(line 683,col 27)",
        "(line 684,col 13)-(line 684,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ListOrderedMapEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.keyvalue.AbstractMapEntry\u003cK, V\u003e"
      ],
      "begin_line": 689,
      "end_line": 706,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 690,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry.ListOrderedMapEntry(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e, K)",
      "begin_line": 692,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 693,col 13)-(line 693,col 29)",
        "(line 694,col 13)-(line 694,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry.getValue()",
      "begin_line": 697,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 699,col 13)-(line 699,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry.setValue(V)",
      "begin_line": 702,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 704,col 13)-(line 704,col 59)"
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
      "begin_line": 709,
      "end_line": 784,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 711,
      "end_line": 711,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 712,
      "end_line": 712,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readable"
      ],
      "begin_line": 713,
      "end_line": 713,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.ListOrderedMapIterator(org.apache.commons.collections4.map.ListOrderedMap\u003cK, V\u003e)",
      "begin_line": 715,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 716,col 13)-(line 716,col 20)",
        "(line 717,col 13)-(line 717,col 33)",
        "(line 718,col 13)-(line 718,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.hasNext()",
      "begin_line": 721,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 722,col 13)-(line 722,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.next()",
      "begin_line": 725,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 726,col 13)-(line 726,col 35)",
        "(line 727,col 13)-(line 727,col 28)",
        "(line 728,col 13)-(line 728,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.hasPrevious()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 732,col 13)-(line 732,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.previous()",
      "begin_line": 735,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 736,col 13)-(line 736,col 39)",
        "(line 737,col 13)-(line 737,col 28)",
        "(line 738,col 13)-(line 738,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.remove()",
      "begin_line": 741,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 742,col 13)-(line 744,col 13)",
        "(line 745,col 13)-(line 745,col 30)",
        "(line 746,col 13)-(line 746,col 36)",
        "(line 747,col 13)-(line 747,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.getKey()",
      "begin_line": 750,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 751,col 13)-(line 753,col 13)",
        "(line 754,col 13)-(line 754,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.getValue()",
      "begin_line": 757,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 758,col 13)-(line 760,col 13)",
        "(line 761,col 13)-(line 761,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.setValue(V)",
      "begin_line": 764,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 765,col 13)-(line 767,col 13)",
        "(line 768,col 13)-(line 768,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.reset()",
      "begin_line": 771,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 772,col 13)-(line 772,col 57)",
        "(line 773,col 13)-(line 773,col 24)",
        "(line 774,col 13)-(line 774,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator.toString()",
      "begin_line": 777,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 779,col 13)-(line 781,col 13)",
        "(line 782,col 13)-(line 782,col 32)"
      ]
    }
  ]
}
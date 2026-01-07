{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/CompositeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractIterableMap\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 560,
      "comment": "\n * Decorates a map of other maps to provide a single unified view.\n * \u003cp\u003e\n * Changes made to this map will actually be made on the decorated map.\n * Add and remove operations require the use of a pluggable strategy. If no\n * strategy is provided then add and remove are unsupported.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that CompositeMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "composite"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Array of all maps in the composite "
    },
    {
      "type": "field",
      "varNames": [
        "mutator"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Handle mutation operations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CompositeMap.CompositeMap()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a new, empty, CompositeMap.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CompositeMap.CompositeMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cK, V\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Create a new CompositeMap with two composited Map instances.\n     *\n     * @param one  the first Map to be composited\n     * @param two  the second Map to be composited\n     * @throws IllegalArgumentException if there is a key collision\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CompositeMap.CompositeMap(java.util.Map\u003cK, V\u003e, java.util.Map\u003cK, V\u003e, org.apache.commons.collections4.map.CompositeMap.MapMutator\u003cK, V\u003e)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Create a new CompositeMap with two composited Map instances.\n     *\n     * @param one  the first Map to be composited\n     * @param two  the second Map to be composited\n     * @param mutator  MapMutator to be used for mutation operations\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CompositeMap.CompositeMap(java.util.Map\u003cK, V\u003e...)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Create a new CompositeMap which composites all of the Map instances in the\n     * argument. It copies the argument array, it does not use it directly.\n     *\n     * @param composite  the Maps to be composited\n     * @throws IllegalArgumentException if there is a key collision\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.CompositeMap.CompositeMap(java.util.Map\u003cK, V\u003e[], org.apache.commons.collections4.map.CompositeMap.MapMutator\u003cK, V\u003e)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\n     * Create a new CompositeMap which composites all of the Map instances in the\n     * argument. It copies the argument array, it does not use it directly.\n     *\n     * @param composite  Maps to be composited\n     * @param mutator  MapMutator to be used for mutation operations\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 109,col 36)",
        "(line 110,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.setMutator(org.apache.commons.collections4.map.CompositeMap.MapMutator\u003cK, V\u003e)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Specify the MapMutator to be used by mutation operations.\n     *\n     * @param mutator  the MapMutator to be used for mutation delegation\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.addComposited(java.util.Map\u003cK, V\u003e)",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n     * Add an additional Map to the composite.\n     *\n     * @param map  the Map to be added to the composite\n     * @throws IllegalArgumentException if there is a key collision and there is no\n     *         MapMutator set to handle it.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 68)",
        "(line 144,col 9)-(line 144,col 76)",
        "(line 145,col 9)-(line 145,col 36)",
        "(line 146,col 9)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.removeComposited(java.util.Map\u003cK, V\u003e)",
      "begin_line": 155,
      "end_line": 168,
      "comment": "\n     * Remove a Map from the composite.\n     *\n     * @param map  the Map to be removed from the composite\n     * @return The removed Map or \u003ccode\u003enull\u003c/code\u003e if map is not in the composite\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 47)",
        "(line 158,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.clear()",
      "begin_line": 176,
      "end_line": 181,
      "comment": "\n     * Calls \u003ccode\u003eclear()\u003c/code\u003e on all composited Maps.\n     *\n     * @throws UnsupportedOperationException if any of the composited Maps do not support clear()\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.containsKey(java.lang.Object)",
      "begin_line": 199,
      "end_line": 207,
      "comment": "\n     * Returns {@code true} if this map contains a mapping for the specified\n     * key.  More formally, returns {@code true} if and only if\n     * this map contains at a mapping for a key {@code k} such that\n     * {@code (key\u003d\u003dnull ? k\u003d\u003dnull : key.equals(k))}.  (There can be\n     * at most one such mapping.)\n     *\n     * @param key  key whose presence in this map is to be tested.\n     * @return {@code true} if this map contains a mapping for the specified\n     *         key.\n     *\n     * @throws ClassCastException if the key is of an inappropriate type for\n     *         this map (optional).\n     * @throws NullPointerException if the key is {@code null} and this map\n     *            does not not permit {@code null} keys (optional).\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.containsValue(java.lang.Object)",
      "begin_line": 225,
      "end_line": 233,
      "comment": "\n     * Returns {@code true} if this map maps one or more keys to the\n     * specified value.  More formally, returns {@code true} if and only if\n     * this map contains at least one mapping to a value {@code v} such that\n     * {@code (value\u003d\u003dnull ? v\u003d\u003dnull : value.equals(v))}.  This operation\n     * will probably require time linear in the map size for most\n     * implementations of the {@code Map} interface.\n     *\n     * @param value value whose presence in this map is to be tested.\n     * @return {@code true} if this map maps one or more keys to the\n     *         specified value.\n     * @throws ClassCastException if the value is of an inappropriate type for\n     *         this map (optional).\n     * @throws NullPointerException if the value is {@code null} and this map\n     *            does not not permit {@code null} values (optional).\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.entrySet()",
      "begin_line": 252,
      "end_line": 259,
      "comment": "\n     * Returns a set view of the mappings contained in this map.  Each element\n     * in the returned set is a \u003ccode\u003eMap.Entry\u003c/code\u003e.  The set is backed by the\n     * map, so changes to the map are reflected in the set, and vice-versa.\n     * If the map is modified while an iteration over the set is in progress,\n     * the results of the iteration are undefined.  The set supports element\n     * removal, which removes the corresponding mapping from the map, via the\n     * {@code Iterator.remove}, {@code Set.remove}, {@code removeAll},\n     * {@code retainAll} and {@code clear} operations.  It does not support\n     * the {@code add} or {@code addAll} operations.\n     * \u003cp\u003e\n     * This implementation returns a \u003ccode\u003eCompositeSet\u003c/code\u003e which\n     * composites the entry sets from all of the composited maps.\n     *\n     * @see CompositeSet\n     * @return a set view of the mappings contained in this map.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 89)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.get(java.lang.Object)",
      "begin_line": 285,
      "end_line": 293,
      "comment": "\n     * Returns the value to which this map maps the specified key.  Returns\n     * {@code null} if the map contains no mapping for this key.  A return\n     * value of {@code null} does not \u003ci\u003enecessarily\u003c/i\u003e indicate that the\n     * map contains no mapping for the key; it\u0027s also possible that the map\n     * explicitly maps the key to {@code null}.  The {@code containsKey}\n     * operation may be used to distinguish these two cases.\n     *\n     * \u003cp\u003eMore formally, if this map contains a mapping from a key\n     * {@code k} to a value {@code v} such that \u003ctt\u003e(key\u003d\u003dnull ? k\u003d\u003dnull :\n     * key.equals(k))\u003c/tt\u003e, then this method returns {@code v}; otherwise\n     * it returns {@code null}.  (There can be at most one such mapping.)\n     *\n     * @param key key whose associated value is to be returned.\n     * @return the value to which this map maps the specified key, or\n     *         {@code null} if the map contains no mapping for this key.\n     *\n     * @throws ClassCastException if the key is of an inappropriate type for\n     *         this map (optional).\n     * @throws NullPointerException key is {@code null} and this map does not\n     *         not permit {@code null} keys (optional).\n     *\n     * @see #containsKey(Object)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.isEmpty()",
      "begin_line": 300,
      "end_line": 308,
      "comment": "\n     * Returns {@code true} if this map contains no key-value mappings.\n     *\n     * @return {@code true} if this map contains no key-value mappings.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.keySet()",
      "begin_line": 325,
      "end_line": 332,
      "comment": "\n     * Returns a set view of the keys contained in this map.  The set is\n     * backed by the map, so changes to the map are reflected in the set, and\n     * vice-versa.  If the map is modified while an iteration over the set is\n     * in progress, the results of the iteration are undefined.  The set\n     * supports element removal, which removes the corresponding mapping from\n     * the map, via the {@code Iterator.remove}, {@code Set.remove},\n     * {@code removeAll} {@code retainAll}, and {@code clear} operations.\n     * It does not support the add or {@code addAll} operations.\n     * \u003cp\u003e\n     * This implementation returns a \u003ccode\u003eCompositeSet\u003c/code\u003e which\n     * composites the key sets from all of the composited maps.\n     *\n     * @return a set view of the keys contained in this map.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 59)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.put(K, V)",
      "begin_line": 359,
      "end_line": 365,
      "comment": "\n     * Associates the specified value with the specified key in this map\n     * (optional operation).  If the map previously contained a mapping for\n     * this key, the old value is replaced by the specified value.  (A map\n     * {@code m} is said to contain a mapping for a key {@code k} if and only\n     * if {@link #containsKey(Object) m.containsKey(k)} would return\n     * {@code true}.))\n     *\n     * @param key key with which the specified value is to be associated.\n     * @param value value to be associated with the specified key.\n     * @return previous value associated with specified key, or {@code null}\n     *         if there was no mapping for key.  A {@code null} return can\n     *         also indicate that the map previously associated {@code null}\n     *         with the specified key, if the implementation supports\n     *         {@code null} values.\n     *\n     * @throws UnsupportedOperationException if no MapMutator has been specified\n     * @throws ClassCastException if the class of the specified key or value\n     *            prevents it from being stored in this map.\n     * @throws IllegalArgumentException if some aspect of this key or value\n     *            prevents it from being stored in this map.\n     * @throws NullPointerException this map does not permit {@code null}\n     *            keys or values, and the specified key or value is\n     *            {@code null}.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 389,
      "end_line": 395,
      "comment": "\n     * Copies all of the mappings from the specified map to this map\n     * (optional operation).  The effect of this call is equivalent to that\n     * of calling {@link #put(Object,Object) put(k, v)} on this map once\n     * for each mapping from key {@code k} to value {@code v} in the\n     * specified map.  The behavior of this operation is unspecified if the\n     * specified map is modified while the operation is in progress.\n     *\n     * @param map Mappings to be stored in this map.\n     *\n     * @throws UnsupportedOperationException if the {@code putAll} method is\n     *         not supported by this map.\n     *\n     * @throws ClassCastException if the class of a key or value in the\n     *         specified map prevents it from being stored in this map.\n     *\n     * @throws IllegalArgumentException some aspect of a key or value in the\n     *         specified map prevents it from being stored in this map.\n     * @throws NullPointerException the specified map is {@code null}, or if\n     *         this map does not permit {@code null} keys or values, and the\n     *         specified map contains {@code null} keys or values.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.remove(java.lang.Object)",
      "begin_line": 422,
      "end_line": 430,
      "comment": "\n     * Removes the mapping for this key from this map if it is present\n     * (optional operation).   More formally, if this map contains a mapping\n     * from key {@code k} to value {@code v} such that\n     * \u003ccode\u003e(key\u003d\u003dnull ?  k\u003d\u003dnull : key.equals(k))\u003c/code\u003e, that mapping\n     * is removed.  (The map can contain at most one such mapping.)\n     *\n     * \u003cp\u003eReturns the value to which the map previously associated the key, or\n     * {@code null} if the map contained no mapping for this key.  (A\n     * {@code null} return can also indicate that the map previously\n     * associated {@code null} with the specified key if the implementation\n     * supports {@code null} values.)  The map will not contain a mapping for\n     * the specified  key once the call returns.\n     *\n     * @param key key whose mapping is to be removed from the map.\n     * @return previous value associated with specified key, or {@code null}\n     *         if there was no mapping for key.\n     *\n     * @throws ClassCastException if the key is of an inappropriate type for\n     *         the composited map (optional).\n     * @throws NullPointerException if the key is {@code null} and the composited map\n     *            does not not permit {@code null} keys (optional).\n     * @throws UnsupportedOperationException if the {@code remove} method is\n     *         not supported by the composited map containing the key\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.size()",
      "begin_line": 439,
      "end_line": 446,
      "comment": "\n     * Returns the number of key-value mappings in this map.  If the\n     * map contains more than {@code Integer.MAX_VALUE} elements, returns\n     * {@code Integer.MAX_VALUE}.\n     *\n     * @return the number of key-value mappings in this map.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 21)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.values()",
      "begin_line": 461,
      "end_line": 468,
      "comment": "\n     * Returns a collection view of the values contained in this map.  The\n     * collection is backed by the map, so changes to the map are reflected in\n     * the collection, and vice-versa.  If the map is modified while an\n     * iteration over the collection is in progress, the results of the\n     * iteration are undefined.  The collection supports element removal,\n     * which removes the corresponding mapping from the map, via the\n     * {@code Iterator.remove}, {@code Collection.remove},\n     * {@code removeAll}, {@code retainAll} and {@code clear} operations.\n     * It does not support the add or {@code addAll} operations.\n     *\n     * @return a collection view of the values contained in this map.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 75)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.equals(java.lang.Object)",
      "begin_line": 476,
      "end_line": 483,
      "comment": "\n     * Checks if this Map equals another as per the Map specification.\n     *\n     * @param obj  the object to compare to\n     * @return true if the maps are equal\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.hashCode()",
      "begin_line": 489,
      "end_line": 496,
      "comment": "\n     * Gets a hash code for the Map as per the Map specification.\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 21)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MapMutator",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 503,
      "end_line": 559,
      "comment": "\n     * This interface allows definition for all of the indeterminate\n     * mutators in a CompositeMap, as well as providing a hook for\n     * callbacks on key collisions.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.MapMutator.resolveCollision(org.apache.commons.collections4.map.CompositeMap\u003cK, V\u003e, java.util.Map\u003cK, V\u003e, java.util.Map\u003cK, V\u003e, java.util.Collection\u003cK\u003e)",
      "begin_line": 514,
      "end_line": 515,
      "comment": "\n         * Called when adding a new Composited Map results in a\n         * key collision.\n         *\n         * @param composite  the CompositeMap with the collision\n         * @param existing  the Map already in the composite which contains the\n         *        offending key\n         * @param added  the Map being added\n         * @param intersect  the intersection of the keysets of the existing and added maps\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.MapMutator.put(org.apache.commons.collections4.map.CompositeMap\u003cK, V\u003e, java.util.Map\u003cK, V\u003e[], K, V)",
      "begin_line": 539,
      "end_line": 539,
      "comment": "\n         * Called when the CompositeMap.put() method is invoked.\n         *\n         * @param map  the CompositeMap which is being modified\n         * @param composited  array of Maps in the CompositeMap being modified\n         * @param key  key with which the specified value is to be associated.\n         * @param value  value to be associated with the specified key.\n         * @return previous value associated with specified key, or {@code null}\n         *         if there was no mapping for key.  A {@code null} return can\n         *         also indicate that the map previously associated {@code null}\n         *         with the specified key, if the implementation supports\n         *         {@code null} values.\n         *\n         * @throws UnsupportedOperationException if not defined\n         * @throws ClassCastException if the class of the specified key or value\n         *            prevents it from being stored in this map.\n         * @throws IllegalArgumentException if some aspect of this key or value\n         *            prevents it from being stored in this map.\n         * @throws NullPointerException this map does not permit {@code null}\n         *            keys or values, and the specified key or value is\n         *            {@code null}.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.CompositeMap.MapMutator.putAll(org.apache.commons.collections4.map.CompositeMap\u003cK, V\u003e, java.util.Map\u003cK, V\u003e[], java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 557,
      "end_line": 558,
      "comment": "\n         * Called when the CompositeMap.putAll() method is invoked.\n         *\n         * @param map  the CompositeMap which is being modified\n         * @param composited  array of Maps in the CompositeMap being modified\n         * @param mapToAdd  Mappings to be stored in this CompositeMap\n         *\n         * @throws UnsupportedOperationException if not defined\n         * @throws ClassCastException if the class of the specified key or value\n         *            prevents it from being stored in this map.\n         * @throws IllegalArgumentException if some aspect of this key or value\n         *            prevents it from being stored in this map.\n         * @throws NullPointerException this map does not permit {@code null}\n         *            keys or values, and the specified key or value is\n         *            {@code null}.\n         ",
      "child_ranges": []
    }
  ]
}
{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/BidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BidiMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.IterableMap\u003cK, V\u003e"
      ],
      "begin_line": 44,
      "end_line": 144,
      "comment": "\n * Defines a map that allows bidirectional lookup between key and values.\n * \u003cp\u003e\n * This extended \u003ccode\u003eMap\u003c/code\u003e represents a mapping where a key may\n * lookup a value and a value may lookup a key with equal ease.\n * This interface extends \u003ccode\u003eMap\u003c/code\u003e and so may be used anywhere a map\n * is required. The interface provides an inverse map view, enabling\n * full access to both directions of the \u003ccode\u003eBidiMap\u003c/code\u003e.\n * \u003cp\u003e\n * Implementations should allow a value to be looked up from a key and\n * a key to be looked up from a value with equal performance.\n * \u003cp\u003e\n * This map enforces the restriction that there is a 1:1 relation between\n * keys and values, meaning that multiple keys cannot map to the same value.\n * This is required so that \"inverting\" the map results in a map without\n * duplicate keys. See the {@link #put} method description for more information.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BidiMap.put(K, V)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Puts the key-value pair into the map, replacing any previous pair.\n     * \u003cp\u003e\n     * When adding a key-value pair, the value may already exist in the map\n     * against a different key. That mapping is removed, to ensure that the\n     * value only occurs once in the inverse map.\n     * \u003cpre\u003e\n     *  BidiMap map1 \u003d new DualHashBidiMap();\n     *  map.put(\"A\",\"B\");  // contains A mapped to B, as per Map\n     *  map.put(\"A\",\"C\");  // contains A mapped to C, as per Map\n     *\n     *  BidiMap map2 \u003d new DualHashBidiMap();\n     *  map.put(\"A\",\"B\");  // contains A mapped to B, as per Map\n     *  map.put(\"C\",\"B\");  // contains C mapped to B, key A is removed\n     * \u003c/pre\u003e\n     *\n     * @param key  the key to store\n     * @param value  the value to store\n     * @return the previous value mapped to this key\n     *\n     * @throws UnsupportedOperationException if the \u003ccode\u003eput\u003c/code\u003e method is not supported\n     * @throws ClassCastException (optional) if the map limits the type of the\n     *  value and the specified value is inappropriate\n     * @throws IllegalArgumentException (optional) if the map limits the values\n     *  in some way and the value was invalid\n     * @throws NullPointerException (optional) if the map limits the values to\n     *  non-null and null was specified\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BidiMap.getKey(java.lang.Object)",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Gets the key that is currently mapped to the specified value.\n     * \u003cp\u003e\n     * If the value is not contained in the map, \u003ccode\u003enull\u003c/code\u003e is returned.\n     * \u003cp\u003e\n     * Implementations should seek to make this method perform equally as well\n     * as \u003ccode\u003eget(Object)\u003c/code\u003e.\n     *\n     * @param value  the value to find the key for\n     * @return the mapped key, or \u003ccode\u003enull\u003c/code\u003e if not found\n     *\n     * @throws ClassCastException (optional) if the map limits the type of the\n     *  value and the specified value is inappropriate\n     * @throws NullPointerException (optional) if the map limits the values to\n     *  non-null and null was specified\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BidiMap.removeValue(java.lang.Object)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Removes the key-value pair that is currently mapped to the specified\n     * value (optional operation).\n     * \u003cp\u003e\n     * If the value is not contained in the map, \u003ccode\u003enull\u003c/code\u003e is returned.\n     * \u003cp\u003e\n     * Implementations should seek to make this method perform equally as well\n     * as \u003ccode\u003eremove(Object)\u003c/code\u003e.\n     *\n     * @param value  the value to find the key-value pair for\n     * @return the key that was removed, \u003ccode\u003enull\u003c/code\u003e if nothing removed\n     *\n     * @throws ClassCastException (optional) if the map limits the type of the\n     *  value and the specified value is inappropriate\n     * @throws NullPointerException (optional) if the map limits the values to\n     *  non-null and null was specified\n     * @throws UnsupportedOperationException if this method is not supported\n     *  by the implementation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BidiMap.inverseBidiMap()",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Gets a view of this map where the keys and values are reversed.\n     * \u003cp\u003e\n     * Changes to one map will be visible in the other and vice versa.\n     * This enables both directions of the map to be accessed as a \u003ccode\u003eMap\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implementations should seek to avoid creating a new object every time this\n     * method is called. See \u003ccode\u003eAbstractMap.values()\u003c/code\u003e etc. Calling this\n     * method on the inverse map should return the original.\n     *\n     * @return an inverted bidirectional map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BidiMap.values()",
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Returns a {@link Set} view of the values contained in this map.\n     * The set is backed by the map, so changes to the map are reflected\n     * in the set, and vice-versa.  If the map is modified while an iteration\n     * over the set is in progress (except through the iterator\u0027s own\n     * {@code remove} operation), the results of the iteration are undefined.\n     * The set supports element removal, which removes the corresponding\n     * mapping from the map, via the {@code Iterator.remove},\n     * {@code Collection.remove}, {@code removeAll},\n     * {@code retainAll} and {@code clear} operations.  It does not\n     * support the {@code add} or {@code addAll} operations.\n     *\n     * @return a set view of the values contained in this map\n     ",
      "child_ranges": []
    }
  ]
}
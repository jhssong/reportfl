{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/MultiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.IterableMap\u003cK, java.lang.Object\u003e"
      ],
      "begin_line": 46,
      "end_line": 158,
      "comment": "\n * Defines a map that holds a collection of values against each key.\n * \u003cp\u003e\n * A \u003ccode\u003eMultiMap\u003c/code\u003e is a Map with slightly different semantics.\n * Putting a value into the map will add the value to a Collection at that key.\n * Getting a value will return a Collection, holding all the values put to that key.\n * \u003cp\u003e\n * For example:\n * \u003cpre\u003e\n * MultiMap mhm \u003d new MultiValueMap();\n * mhm.put(key, \"A\");\n * mhm.put(key, \"B\");\n * mhm.put(key, \"C\");\n * Collection coll \u003d (Collection) mhm.get(key);\u003c/pre\u003e\n * \u003cp\u003e\n * \u003ccode\u003ecoll\u003c/code\u003e will be a collection containing \"A\", \"B\", \"C\".\n * \u003cp\u003e\n * NOTE: Additional methods were added to this interface in Commons Collections 3.1.\n * These were added solely for documentation purposes and do not change the interface\n * as they were defined in the superinterface \u003ccode\u003eMap\u003c/code\u003e anyway.\n *\n * @since 2.0\n * @version $Id$\n * @deprecated since 4.1, use {@link MultiValuedMap} instead\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.removeMapping(K, V)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Removes a specific value from map.\n     * \u003cp\u003e\n     * The item is removed from the collection mapped to the specified key.\n     * Other values attached to that key are unaffected.\n     * \u003cp\u003e\n     * If the last value for a key is removed, implementations typically\n     * return \u003ccode\u003enull\u003c/code\u003e from a subsequent \u003ccode\u003eget(Object)\u003c/code\u003e, however\n     * they may choose to return an empty collection.\n     *\n     * @param key  the key to remove from\n     * @param item  the item to remove\n     * @return {@code true} if the mapping was removed, {@code false} otherwise\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws ClassCastException if the key or value is of an invalid type\n     * @throws NullPointerException if the key or value is null and null is invalid\n     * @since 4.0 (signature in previous releases: V remove(K, V))\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.size()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Gets the number of keys in this map.\n     * \u003cp\u003e\n     * Implementations typically return only the count of keys in the map\n     * This cannot be mandated due to backwards compatibility of this interface.\n     *\n     * @return the number of key-collection mappings in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.get(java.lang.Object)",
      "begin_line": 99,
      "end_line": 99,
      "comment": " Cannot use get(K key) as that does not properly implement Map#get",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.containsValue(java.lang.Object)",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Checks whether the map contains the value specified.\n     * \u003cp\u003e\n     * Implementations typically check all collections against all keys for the value.\n     * This cannot be mandated due to backwards compatibility of this interface.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the value\n     * @throws ClassCastException if the value is of an invalid type\n     * @throws NullPointerException if the value is null and null value are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.put(K, java.lang.Object)",
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Adds the value to the collection associated with the specified key.\n     * \u003cp\u003e\n     * Unlike a normal \u003ccode\u003eMap\u003c/code\u003e the previous value is not replaced.\n     * Instead the new value is added to the collection stored against the key.\n     * The collection may be a \u003ccode\u003eList\u003c/code\u003e, \u003ccode\u003eSet\u003c/code\u003e or other\n     * collection dependent on implementation.\n     *\n     * @param key  the key to store against\n     * @param value  the value to add to the collection at the key\n     * @return typically the value added if the map changed and null if the map did not change\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws ClassCastException if the key or value is of an invalid type\n     * @throws NullPointerException if the key or value is null and null is invalid\n     * @throws IllegalArgumentException if the key or value is invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.remove(java.lang.Object)",
      "begin_line": 145,
      "end_line": 145,
      "comment": " Cannot use remove(K key) as that does not properly implement Map#remove",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiMap.values()",
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * Gets a collection containing all the values in the map.\n     * \u003cp\u003e\n     * Implementations typically return a collection containing the combination\n     * of values from all keys.\n     * This cannot be mandated due to backwards compatibility of this interface.\n     *\n     * @return a collection view of the values contained in this map\n     ",
      "child_ranges": []
    }
  ]
}
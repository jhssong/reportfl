{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/MultiValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiValuedMap",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 317,
      "comment": "\n * Defines a map that holds a collection of values against each key.\n * \u003cp\u003e\n * A \u003ccode\u003eMultiValuedMap\u003c/code\u003e is a Map with slightly different semantics:\n * \u003cul\u003e\n *   \u003cli\u003ePutting a value into the map will add the value to a Collection at that key.\u003c/li\u003e\n *   \u003cli\u003eGetting a value will return a Collection, holding all the values put to that key.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * For example:\n * \u003cpre\u003e\n * MultiValuedMap\u0026lt;K, String\u0026gt; map \u003d new MultiValuedHashMap\u0026lt;K, String\u0026gt;();\n * map.put(key, \u0026quot;A\u0026quot;);\n * map.put(key, \u0026quot;B\u0026quot;);\n * map.put(key, \u0026quot;C\u0026quot;);\n * Collection\u0026lt;String\u0026gt; coll \u003d map.get(key);\n * \u003c/pre\u003e\n * \u003cp\u003e\n * \u003ccode\u003ecoll\u003c/code\u003e will be a collection containing \"A\", \"B\", \"C\".\n * \u003cp\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.size()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Gets the total size of the map.\n     * \u003cp\u003e\n     * Implementations would return the total size of the map which is the count\n     * of the values from all keys.\n     *\n     * @return the total size of the map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.isEmpty()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Returns {@code true} if this map contains no key-value mappings.\n     *\n     * @return {@code true} if this map contains no key-value mappings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.containsKey(java.lang.Object)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Returns {@code true} if this map contains a mapping for the specified\n     * key. More formally, returns {@code true} if and only if this map\n     * contains a mapping for a key {@code k} such that\n     * {@code (key\u003d\u003dnull ? k\u003d\u003dnull : key.equals(k))}. (There can be at most one\n     * such mapping.)\n     *\n     * @param key key whose presence in this map is to be tested\n     * @return {@code true} if this map contains a mapping for the specified key\n     * @throws ClassCastException if the key is of an inappropriate type for this map (optional)\n     * @throws NullPointerException if the specified key is null and this map\n     *        does not permit null keys (optional)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.containsValue(java.lang.Object)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Checks whether the map contains at least one mapping for the specified value.\n     *\n     * @param value the value to search for\n     * @return true if the map contains the value\n     * @throws ClassCastException if the type of the specified value is not compatible\n     *        with the used collection (optional)\n     * @throws NullPointerException if the value is null and null values are not supported\n     *        by the used collection types (optional)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.containsMapping(java.lang.Object, java.lang.Object)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Checks whether the map contains a mapping for the specified key and value.\n     *\n     * @param key the key to search for\n     * @param value the value to search for\n     * @return true if the map contains the value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.get(java.lang.Object)",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Returns a view collection of the values associated with the specified\n     * key.\n     * \u003cp\u003e\n     * This method will return an \u003cb\u003eempty\u003c/b\u003e collection if\n     * {@link #containsKey(Object)} returns {@code false}. Changes to the\n     * returned collection will update the underlying {@code MultiValuedMap} and\n     * vice-versa.\n     *\n     * @param key the key to retrieve\n     * @return the \u003ccode\u003eCollection\u003c/code\u003e of values, implementations should\n     *         return an empty collection for no mapping\n     * @throws ClassCastException if the key is of an invalid type (optional)\n     * @throws NullPointerException if the key is null and null keys are invalid (optional)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.put(K, V)",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Adds a key-value mapping to this multi-valued map.\n     * \u003cp\u003e\n     * Unlike a normal \u003ccode\u003eMap\u003c/code\u003e the previous value is not replaced.\n     * Instead the new value is added to the collection stored against the key.\n     * Depending on the collection type used, duplicate key-value mappings may\n     * be allowed.\n     * \u003cp\u003e\n     * The method will return {@code true} if the size of the multi-valued map\n     * has been increased because of this operation.\n     *\n     * @param key the key to store against\n     * @param value the value to add to the collection at the key\n     * @return {@code true} if the map changed as a result of this put operation, or\n     *        {@code false} if the map already contained the key-value mapping and the\n     *        collection type does not allow duplicate values, e.g. when using a Set\n     * @throws UnsupportedOperationException if the put operation is not supported by\n     *        this multi-valued map, e.g. if it is unmodifiable\n     * @throws ClassCastException if the key or value is of an invalid type (optional)\n     * @throws NullPointerException if the key or value is null and null is invalid (optional)\n     * @throws IllegalArgumentException if some aspect of the specified key or value prevents\n     *        it from being stored in this multi-valued map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.putAll(K, java.lang.Iterable\u003c? extends V\u003e)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Adds a mapping to the specified key for all values contained in the given Iterable.\n     *\n     * @param key the key to store against\n     * @param values the values to add to the collection at the key, null ignored\n     * @return {@code true} if the map changed as a result of this operation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 178,
      "end_line": 178,
      "comment": "\n     * Copies all mappings from the specified map to this multi-valued map (optional operation).\n     * \u003cp\u003e\n     * The effect of this call is equivalent to that of calling\n     * {@link #put(Object,Object) put(k, v)} on this map once for each mapping\n     * from key {@code k} to value {@code v} in the specified map.\n     * \u003cp\u003e\n     * The behavior of this operation is undefined if the specified map is modified\n     * while the operation is in progress.\n     *\n     * @param m mappings to be stored in this map\n     * @throws UnsupportedOperationException if the {@code putAll} operation is\n     *        not supported by this map\n     * @throws ClassCastException if the class of a key or value in the\n     *        specified map prevents it from being stored in this map (optional)\n     * @throws NullPointerException if the specified map is null, or if this map\n     *        does not permit null keys or values, and the specified map\n     *        contains null keys or values (optional)\n     * @throws IllegalArgumentException if some property of a key or value in\n     *        the specified map prevents it from being stored in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.putAll(org.apache.commons.collections4.MultiValuedMap\u003c? extends K, ? extends V\u003e)",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n     * Copies all mappings from the specified map to this multi-valued map (optional operation).\n     * \u003cp\u003e\n     * The effect of this call is equivalent to that of\n     * calling {@link #put(Object,Object) put(k, v)} on this map once for each\n     * mapping from key {@code k} to value {@code v} in the specified map.\n     * \u003cp\u003e\n     * The behavior of this operation is undefined if the specified map is modified\n     * while the operation is in progress.\n     *\n     * @param m mappings to be stored in this map\n     * @throws UnsupportedOperationException if the {@code putAll} operation is\n     *        not supported by this map\n     * @throws ClassCastException if the class of a key or value in the\n     *        specified map prevents it from being stored in this map (optional)\n     * @throws NullPointerException if the specified map is null, or if this map\n     *        does not permit null keys or values, and the specified map\n     *        contains null keys or values (optional)\n     * @throws IllegalArgumentException if some property of a key or value in\n     *        the specified map prevents it from being stored in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.remove(java.lang.Object)",
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * The returned collection \u003ci\u003emay\u003c/i\u003e be modifiable, but updates will not be propagated\n     * to this multi-valued map. In case no mapping was stored for the specified\n     * key, an empty, unmodifiable collection will be returned.\n     *\n     * @param key the key to remove values from\n     * @return the values that were removed\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws ClassCastException if the key is of an invalid type (optional)\n     * @throws NullPointerException if the key is null and null keys are invalid (optional)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.removeMapping(K, V)",
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n     * Removes a key-value mapping from the map.\n     * \u003cp\u003e\n     * The item is removed from the collection mapped to the specified key.\n     * Other values attached to that key are unaffected.\n     * \u003cp\u003e\n     * If the last value for a key is removed, implementations typically return\n     * an empty collection from a subsequent \u003ccode\u003eget(Object)\u003c/code\u003e.\n     *\n     * @param key the key to remove from\n     * @param item the item to remove\n     * @return {@code true} if the mapping was removed, {@code false} otherwise\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws ClassCastException if the key or value is of an invalid type (optional)\n     * @throws NullPointerException if the key or value is null and null is invalid (optional)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.clear()",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n     * Removes all of the mappings from this map (optional operation).\n     * \u003cp\u003e\n     * The map will be empty after this call returns.\n     *\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.entries()",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * Returns a {@link Collection} view of the mappings contained in this multi-valued map.\n     * \u003cp\u003e\n     * The collection is backed by the map, so changes to the map are reflected\n     * in the collection, and vice-versa.\n     *\n     * @return a set view of the mappings contained in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.keys()",
      "begin_line": 267,
      "end_line": 267,
      "comment": "\n     * Returns a {@link Bag} view of the keys contained in this multi-valued map.\n     * \u003cp\u003e\n     * The {@link Bag#getCount(Object)} method of the returned bag will give the\n     * same result a calling {@code get(Object).size()} for the same key.\n     * \u003cp\u003e\n     * This bag is backed by the map, so any changes in the map are reflected in the bag.\n     *\n     * @return a bag view of the keys contained in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.keySet()",
      "begin_line": 285,
      "end_line": 285,
      "comment": "\n     * Returns a {@link Set} view of the keys contained in this multi-valued map.\n     * \u003cp\u003e\n     * The set is backed by the map, so changes to the map are reflected\n     * in the set, and vice-versa.\n     * \u003cp\u003e\n     * If the map is modified while an iteration over the set is in\n     * progress (except through the iterator\u0027s own {@code remove} operation),\n     * the result of the iteration is undefined. The set supports element\n     * removal, which removes the corresponding mapping from the map, via the\n     * {@code Iterator.remove}, {@code Set.remove}, {@code removeAll},\n     * {@code retainAll}, and {@code clear} operations. It does not support\n     * the {@code add} or {@code addAll} operations.\n     *\n     * @return a set view of the keys contained in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.values()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Gets a {@link Collection} view of all values contained in this multi-valued map.\n     * \u003cp\u003e\n     * Implementations typically return a collection containing the combination\n     * of values from all keys.\n     *\n     * @return a collection view of the values contained in this map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.asMap()",
      "begin_line": 303,
      "end_line": 303,
      "comment": "\n     * Returns a {@link Map} view of this MultiValuedMap with a Collection as\n     * its value. The Collection holds all the values mapped to that key.\n     *\n     * @return a Map view of the mappings in this MultiValuedMap\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiValuedMap.mapIterator()",
      "begin_line": 315,
      "end_line": 315,
      "comment": "\n     * Obtains a \u003ccode\u003eMapIterator\u003c/code\u003e over this multi-valued map.\n     * \u003cp\u003e\n     * A map iterator is an efficient way of iterating over maps. There is no\n     * need to access the entries collection or use {@code Map.Entry} objects.\n     *\n     * @return a map iterator\n     ",
      "child_ranges": []
    }
  ]
}
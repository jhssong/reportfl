{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/SetValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SetValuedMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 33,
      "end_line": 65,
      "comment": "\n * Defines a map that holds a set of values against each key.\n * \u003cp\u003e\n * A {@code SetValuedMap} is a Map with slightly different semantics:\n * \u003cul\u003e\n *   \u003cli\u003ePutting a value into the map will add the value to a {@link Set} at that key.\u003c/li\u003e\n *   \u003cli\u003eGetting a value will return a {@link Set}, holding all the values put to that key.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetValuedMap.get(K)",
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Gets the set of values associated with the specified key.\n     * \u003cp\u003e\n     * Implementations typically return an empty {@code Set} if no values\n     * have been mapped to the key.\n     * \u003cp\u003e\n     *\n     * @param key  the key to retrieve\n     * @return the {@code Set} of values, implementations should return an\n     *   empty {@code Set} for no mapping\n     * @throws NullPointerException if the key is null and null keys are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetValuedMap.remove(java.lang.Object)",
      "begin_line": 63,
      "end_line": 64,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * The returned set \u003ci\u003emay\u003c/i\u003e be modifiable, but updates will not be\n     * propagated to this set-valued map. In case no mapping was stored for the\n     * specified key, an empty, unmodifiable set will be returned.\n     *\n     * @param key  the key to remove values from\n     * @return the {@code Set} of values removed, implementations should\n     *   return null for no mapping found, but may return an empty collection\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws NullPointerException if the key is null and null keys are invalid\n     ",
      "child_ranges": []
    }
  ]
}
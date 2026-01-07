{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/ListValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListValuedMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 33,
      "end_line": 67,
      "comment": "\n * Defines a map that holds a list of values against each key.\n * \u003cp\u003e\n * A {@code ListValuedMap} is a Map with slightly different semantics:\n * \u003cul\u003e\n *   \u003cli\u003ePutting a value into the map will add the value to a {@link List} at that key.\u003c/li\u003e\n *   \u003cli\u003eGetting a value will return a {@link List}, holding all the values put to that key.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListValuedMap.get(K)",
      "begin_line": 48,
      "end_line": 49,
      "comment": "\n     * Gets the list of values associated with the specified key.\n     * \u003cp\u003e\n     * This method will return an \u003cb\u003eempty\u003c/b\u003e list if\n     * {@link #containsKey(Object)} returns {@code false}. Changes to the\n     * returned list will update the underlying {@code ListValuedMap} and\n     * vice-versa.\n     *\n     * @param key  the key to retrieve\n     * @return the {@code List} of values, implementations should return an\n     *   empty {@code List} for no mapping\n     * @throws NullPointerException if the key is null and null keys are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListValuedMap.remove(java.lang.Object)",
      "begin_line": 64,
      "end_line": 65,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * The returned list \u003ci\u003emay\u003c/i\u003e be modifiable, but updates will not be\n     * propagated to this list-valued map. In case no mapping was stored for the\n     * specified key, an empty, unmodifiable list will be returned.\n     *\n     * @param key  the key to remove values from\n     * @return the {@code List} of values removed, implementations\n     *   typically return an empty, unmodifiable {@code List} for no mapping found\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws NullPointerException if the key is null and null keys are invalid\n     ",
      "child_ranges": []
    }
  ]
}
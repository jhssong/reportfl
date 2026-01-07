{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/SetValuedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SetValuedMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e"
      ],
      "begin_line": 35,
      "end_line": 68,
      "comment": "\n * Defines a map that holds a set of values against each key.\n * \u003cp\u003e\n * A \u003ccode\u003eSetValuedMap\u003c/code\u003e is a Map with slightly different semantics:\n * \u003cul\u003e\n * \u003cli\u003ePutting a value into the map will add the value to a \u003ccode\u003eSet\u003c/code\u003e at\n * that key.\u003c/li\u003e\n * \u003cli\u003eGetting a value will return a \u003ccode\u003eSet\u003c/code\u003e, holding all the values\n * put to that key.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetValuedMap.get(java.lang.Object)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Gets the set of values associated with the specified key.\n     * \u003cp\u003e\n     * Implementations typically return an empty \u003ccode\u003eSet\u003c/code\u003e if no values\n     * have been mapped to the key.\n     * \u003cp\u003e\n     *\n     * @param key the key to retrieve\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values, implementations should return an\n     *         empty Set for no mapping\n     * @throws ClassCastException if the key is of an invalid type\n     * @throws NullPointerException if the key is null and null keys are invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetValuedMap.remove(java.lang.Object)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Removes all values associated with the specified key.\n     * \u003cp\u003e\n     * The returned set \u003ci\u003emay\u003c/i\u003e be modifiable, but updates will not be\n     * propagated to this set-valued map. In case no mapping was stored for the\n     * specified key, an empty, unmodifiable set will be returned.\n     *\n     * @param key the key to remove values from\n     * @return the \u003ccode\u003eSet\u003c/code\u003e of values removed, implementations should\n     *         return \u003ccode\u003enull\u003c/code\u003e for no mapping found, but may return an\n     *         empty collection\n     * @throws UnsupportedOperationException if the map is unmodifiable\n     * @throws ClassCastException if the key is of an invalid type\n     * @throws NullPointerException if the key is null and null keys are invalid\n     ",
      "child_ranges": []
    }
  ]
}
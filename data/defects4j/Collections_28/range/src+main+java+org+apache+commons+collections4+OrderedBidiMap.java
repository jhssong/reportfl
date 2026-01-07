{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/OrderedBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedBidiMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.BidiMap\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedMap\u003cK, V\u003e"
      ],
      "begin_line": 32,
      "end_line": 52,
      "comment": "\n * Defines a map that allows bidirectional lookup between key and values\n * and retains and provides access to an ordering.\n * \u003cp\u003e\n * Implementations should allow a value to be looked up from a key and\n * a key to be looked up from a value with equal performance.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedBidiMap.inverseBidiMap()",
      "begin_line": 49,
      "end_line": 50,
      "comment": "\n     * Gets a view of this map where the keys and values are reversed.\n     * \u003cp\u003e\n     * Changes to one map will be visible in the other and vice versa.\n     * This enables both directions of the map to be accessed equally.\n     * \u003cp\u003e\n     * Implementations should seek to avoid creating a new object every time this\n     * method is called. See \u003ccode\u003eAbstractMap.values()\u003c/code\u003e etc. Calling this\n     * method on the inverse map should return the original.\n     * \u003cp\u003e\n     * Implementations must return an \u003ccode\u003eOrderedBidiMap\u003c/code\u003e instance,\n     * usually by forwarding to \u003ccode\u003einverseOrderedBidiMap()\u003c/code\u003e.\n     *\n     * @return an inverted bidirectional map\n     ",
      "child_ranges": []
    }
  ]
}
{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/SortedBidiMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SortedBidiMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.OrderedBidiMap\u003cK, V\u003e",
        "java.util.SortedMap\u003cK, V\u003e"
      ],
      "begin_line": 34,
      "end_line": 58,
      "comment": "\n * Defines a map that allows bidirectional lookup between key and values\n * and retains both keys and values in sorted order.\n * \u003cp\u003e\n * Implementations should allow a value to be looked up from a key and\n * a key to be looked up from a value with equal performance.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SortedBidiMap.inverseBidiMap()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Gets a view of this map where the keys and values are reversed.\n     * \u003cp\u003e\n     * Changes to one map will be visible in the other and vice versa.\n     * This enables both directions of the map to be accessed equally.\n     * \u003cp\u003e\n     * Implementations should seek to avoid creating a new object every time this\n     * method is called. See \u003ccode\u003eAbstractMap.values()\u003c/code\u003e etc. Calling this\n     * method on the inverse map should return the original.\n     * \u003cp\u003e\n     * Implementations must return a \u003ccode\u003eSortedBidiMap\u003c/code\u003e instance,\n     * usually by forwarding to \u003ccode\u003einverseSortedBidiMap()\u003c/code\u003e.\n     *\n     * @return an inverted bidirectional map\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SortedBidiMap.valueComparator()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Get the comparator used for the values in the value-to-key map aspect.\n     * @return Comparator\u003c? super V\u003e\n     ",
      "child_ranges": []
    }
  ]
}
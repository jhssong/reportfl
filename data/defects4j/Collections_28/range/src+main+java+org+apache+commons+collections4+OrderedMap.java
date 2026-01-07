{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/OrderedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.IterableMap\u003cK, V\u003e"
      ],
      "begin_line": 29,
      "end_line": 74,
      "comment": "\n * Defines a map that maintains order and allows both forward and backward\n * iteration through that order.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMap.mapIterator()",
      "begin_line": 39,
      "end_line": 40,
      "comment": "\n     * Obtains an \u003ccode\u003eOrderedMapIterator\u003c/code\u003e over the map.\n     * \u003cp\u003e\n     * A ordered map iterator is an efficient way of iterating over maps\n     * in both directions.\n     *\n     * @return a map iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMap.firstKey()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Gets the first key currently in this map.\n     *\n     * @return the first key currently in this map\n     * @throws java.util.NoSuchElementException if this map is empty\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMap.lastKey()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Gets the last key currently in this map.\n     *\n     * @return the last key currently in this map\n     * @throws java.util.NoSuchElementException if this map is empty\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMap.nextKey(K)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Gets the next key after the one specified.\n     *\n     * @param key  the key to search for next from\n     * @return the next key, null if no match or at end\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMap.previousKey(K)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Gets the previous key before the one specified.\n     *\n     * @param key  the key to search for previous from\n     * @return the previous key, null if no match or at start\n     ",
      "child_ranges": []
    }
  ]
}
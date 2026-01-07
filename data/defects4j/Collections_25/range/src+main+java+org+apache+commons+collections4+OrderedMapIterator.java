{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/OrderedMapIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedMapIterator",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cK\u003e"
      ],
      "begin_line": 29,
      "end_line": 46,
      "comment": "\n * Defines an iterator that operates over an ordered \u003ccode\u003eMap\u003c/code\u003e.\n * \u003cp\u003e\n * This iterator allows both forward and reverse iteration through the map.\n *\n * @param \u003cK\u003e the type of the keys in the map\n * @param \u003cV\u003e the type of the values in the map\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMapIterator.hasPrevious()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Checks to see if there is a previous entry that can be iterated to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has a previous element\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedMapIterator.previous()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Gets the previous \u003cem\u003ekey\u003c/em\u003e from the \u003ccode\u003eMap\u003c/code\u003e.\n     *\n     * @return the previous key in the iteration\n     * @throws java.util.NoSuchElementException if the iteration is finished\n     ",
      "child_ranges": []
    }
  ]
}
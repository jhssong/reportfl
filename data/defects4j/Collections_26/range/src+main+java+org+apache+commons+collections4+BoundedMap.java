{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/BoundedMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundedMap",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.collections4.IterableMap\u003cK, V\u003e"
      ],
      "begin_line": 29,
      "end_line": 45,
      "comment": "\n * Defines a map that is bounded in size.\n * \u003cp\u003e\n * The size of the map can vary, but it can never exceed a preset\n * maximum number of elements. This interface allows the querying of details\n * associated with the maximum number of elements.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BoundedMap.isFull()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Returns true if this map is full and no new elements can be added.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the map is full\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BoundedMap.maxSize()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Gets the maximum size of the map (the bound).\n     *\n     * @return the maximum number of elements the map can hold\n     ",
      "child_ranges": []
    }
  ]
}
{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/BoundedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundedCollection",
      "is_interface": true,
      "parent_types": [
        "java.util.Collection\u003cE\u003e"
      ],
      "begin_line": 34,
      "end_line": 50,
      "comment": "\n * Defines a collection that is bounded in size.\n * \u003cp\u003e\n * The size of the collection can vary, but it can never exceed a preset\n * maximum number of elements. This interface allows the querying of details\n * associated with the maximum number of elements.\n *\n * @see CollectionUtils#isFull\n * @see CollectionUtils#maxSize\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BoundedCollection.isFull()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Returns true if this collection is full and no new elements can be added.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the collection is full\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BoundedCollection.maxSize()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Gets the maximum size of the collection (the bound).\n     *\n     * @return the maximum number of elements the collection can hold\n     ",
      "child_ranges": []
    }
  ]
}
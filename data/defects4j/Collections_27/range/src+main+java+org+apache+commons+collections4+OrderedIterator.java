{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/OrderedIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedIterator",
      "is_interface": true,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 30,
      "end_line": 47,
      "comment": "\n * Defines an iterator that operates over an ordered container. Subset of {@link java.util.ListIterator}.\n * \u003cp\u003e\n * This iterator allows both forward and reverse iteration through the container.\n *\n * @param \u003cE\u003e the type to iterate over\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedIterator.hasPrevious()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Checks to see if there is a previous element that can be iterated to.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has a previous element\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.OrderedIterator.previous()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Gets the previous element from the container.\n     *\n     * @return the previous element in the iteration\n     * @throws java.util.NoSuchElementException if the iteration is finished\n     ",
      "child_ranges": []
    }
  ]
}
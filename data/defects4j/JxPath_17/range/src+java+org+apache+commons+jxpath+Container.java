{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/Container.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Container",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 43,
      "comment": "\n * A Container is an object implementing an indirection\n * mechanism transparent to JXPath.  For example, if property\n * \"foo\" of the context node has a Container as its value,\n * the XPath \"foo\" will produce the contents of that Container,\n * rather than the container itself.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Container.getValue()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Returns the contained value.\n     * @return Object value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Container.setValue(java.lang.Object)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Modifies the value contained by this container.  May throw\n     * UnsupportedOperationException.\n     * @param value Object value to set.\n     ",
      "child_ranges": []
    }
  ]
}
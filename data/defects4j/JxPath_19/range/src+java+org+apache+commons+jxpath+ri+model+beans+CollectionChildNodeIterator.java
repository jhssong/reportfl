{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionChildNodeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionChildNodeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator"
      ],
      "begin_line": 30,
      "end_line": 53,
      "comment": "\n * Combines child node iterators of all elements of a collection into one\n * aggregate child node iterator.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "test"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator.CollectionChildNodeIterator(org.apache.commons.jxpath.ri.model.beans.CollectionPointer, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 41,
      "end_line": 48,
      "comment": "\n     * Create a new CollectionChildNodeIterator.\n     * @param pointer CollectionPointer\n     * @param test child test\n     * @param reverse iteration order\n     * @param startWith starting pointer\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 43)",
        "(line 47,col 9)-(line 47,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator.getElementNodeIterator(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 63)"
      ]
    }
  ]
}
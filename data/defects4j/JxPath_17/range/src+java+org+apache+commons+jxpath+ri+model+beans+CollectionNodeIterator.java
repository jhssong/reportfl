{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionNodeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionNodeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 33,
      "end_line": 133,
      "comment": "\n * Combines node iterators of all elements of a collection into one\n * aggregate node iterator.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pointer"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverse"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startWith"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.CollectionNodeIterator(org.apache.commons.jxpath.ri.model.beans.CollectionPointer, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n     * Create a new CollectionNodeIterator.\n     * @param pointer collection pointer\n     * @param reverse iteration order\n     * @param startWith starting pointer\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 31)",
        "(line 51,col 9)-(line 51,col 31)",
        "(line 52,col 9)-(line 52,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.getElementNodeIterator(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * Implemented by subclasses to produce child/attribute node iterators.\n     * @param elementPointer owning pointer\n     * @return NodeIterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.getPosition()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.setPosition(int)",
      "begin_line": 73,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 33)",
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.getNodePointer()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.prepare()",
      "begin_line": 98,
      "end_line": 132,
      "comment": "\n     * Prepare...\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 37)",
        "(line 100,col 9)-(line 100,col 56)",
        "(line 101,col 9)-(line 101,col 37)",
        "(line 102,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 131,col 9)"
      ]
    }
  ]
}
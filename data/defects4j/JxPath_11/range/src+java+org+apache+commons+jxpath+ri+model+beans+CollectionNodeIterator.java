{
  "filepath": "/tmp/JxPath-11b/src/java/org/apache/commons/jxpath/ri/model/beans/CollectionNodeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionNodeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 33,
      "end_line": 114,
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
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 31)",
        "(line 46,col 9)-(line 46,col 31)",
        "(line 47,col 9)-(line 47,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.getElementNodeIterator(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 53,
      "end_line": 54,
      "comment": "\n     * Implemened by subclasses to produce child/attribute node iterators.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.getPosition()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.setPosition(int)",
      "begin_line": 60,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.getNodePointer()",
      "begin_line": 72,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator.prepare()",
      "begin_line": 79,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 37)",
        "(line 81,col 9)-(line 81,col 56)",
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 112,col 9)"
      ]
    }
  ]
}
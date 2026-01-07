{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNodeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNodeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 30,
      "end_line": 161,
      "comment": "\n * An iterator of children of a DOM Node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "child"
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
        "position"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.DOMNodeIterator(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 45,
      "end_line": 57,
      "comment": "\n     * Create a new DOMNodeIterator.\n     * @param parent parent pointer\n     * @param nodeTest test\n     * @param reverse whether to iterate in reverse\n     * @param startWith starting pointer\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 44)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.getNodePointer()",
      "begin_line": 59,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.getPosition()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.setPosition(int)",
      "begin_line": 70,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.previous()",
      "begin_line": 88,
      "end_line": 111,
      "comment": "\n     * Set the previous position.\n     * @return whether valid\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 90,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.next()",
      "begin_line": 117,
      "end_line": 152,
      "comment": "\n     * Set the next position.\n     * @return whether valid\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 19)",
        "(line 119,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.testChild()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Test child.\n     * @return result of the test\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 56)"
      ]
    }
  ]
}
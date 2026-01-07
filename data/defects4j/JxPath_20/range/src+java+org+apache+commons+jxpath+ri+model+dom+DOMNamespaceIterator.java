{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/model/dom/DOMNamespaceIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DOMNamespaceIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 35,
      "end_line": 106,
      "comment": "\n * An iterator of namespaces of a DOM Node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "attributes"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.DOMNamespaceIterator(org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Create a new DOMNamespaceIterator.\n     * @param parent parent pointer\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 29)",
        "(line 46,col 9)-(line 46,col 37)",
        "(line 47,col 9)-(line 47,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.collectNamespaces(java.util.List, org.w3c.dom.Node)",
      "begin_line": 55,
      "end_line": 76,
      "comment": "\n     * Collect namespaces from attribute nodes.\n     * @param attributes attribute list\n     * @param node target node\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 43)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.getNodePointer()",
      "begin_line": 78,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 33)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 49)",
        "(line 91,col 9)-(line 91,col 39)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.getPosition()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.setPosition(int)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 62)"
      ]
    }
  ]
}
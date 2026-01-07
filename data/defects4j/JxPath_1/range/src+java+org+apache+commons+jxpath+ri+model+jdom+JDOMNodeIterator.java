{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 34,
      "end_line": 166,
      "comment": "\n * An iterator of children of a JDOM Node.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverse"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "children"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "child"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.JDOMNodeIterator(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 44,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 53,col 9)-(line 53,col 39)",
        "(line 54,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 33)",
        "(line 64,col 9)-(line 64,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.getNodePointer()",
      "begin_line": 67,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.getPosition()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.setPosition(int)",
      "begin_line": 82,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.previous()",
      "begin_line": 102,
      "end_line": 121,
      "comment": "\n     * This is actually never invoked during the normal evaluation\n     * of xpaths - an iterator is always going forward, never backwards.\n     * So, this is implemented only for completeness and perhaps for\n     * those who use these iterators outside of XPath evaluation.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 19)",
        "(line 104,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.next()",
      "begin_line": 123,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 19)",
        "(line 125,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.testChild()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 65)"
      ]
    }
  ]
}
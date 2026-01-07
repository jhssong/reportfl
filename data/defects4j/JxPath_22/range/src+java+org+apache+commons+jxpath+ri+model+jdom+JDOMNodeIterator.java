{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/model/jdom/JDOMNodeIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDOMNodeIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.model.NodeIterator"
      ],
      "begin_line": 34,
      "end_line": 181,
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
      "begin_line": 51,
      "end_line": 71,
      "comment": "\n     * Create a new JDOMNodeIterator.\n     * @param parent pointer\n     * @param nodeTest test\n     * @param reverse whether to iterate in reverse\n     * @param startWith starting pointer\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 29)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 59,col 9)-(line 59,col 39)",
        "(line 60,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 33)",
        "(line 70,col 9)-(line 70,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.getNodePointer()",
      "begin_line": 73,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.getPosition()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.setPosition(int)",
      "begin_line": 88,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.previous()",
      "begin_line": 109,
      "end_line": 128,
      "comment": "\n     * This is actually never invoked during the normal evaluation\n     * of xpaths - an iterator is always going forward, never backwards.\n     * So, this is implemented only for completeness and perhaps for\n     * those who use these iterators outside of XPath evaluation.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)",
        "(line 111,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.next()",
      "begin_line": 134,
      "end_line": 172,
      "comment": "\n     * Iterate to next pointer.\n     * @return whether valid\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 19)",
        "(line 136,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.testChild()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Test a child node.\n     * @return whether test passes.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 65)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/axes/AncestorContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AncestorContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 29,
      "end_line": 117,
      "comment": "\n * EvalContext that walks the \"ancestor::\" and \"ancestor-or-self::\" axes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "setStarted"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentNodePointer"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeSelf"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.AncestorContext(org.apache.commons.jxpath.ri.EvalContext, boolean, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 42,
      "end_line": 49,
      "comment": "\n     * Create a new AncestorContext.\n     * @param parentContext represents the previous step on the path\n     * @param  includeSelf differentiates between \"ancestor::\" and\n     *                     \"ancestor-or-self::\" axes\n     * @param nodeTest is the name of the element(s) we are looking for\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 29)",
        "(line 47,col 9)-(line 47,col 39)",
        "(line 48,col 9)-(line 48,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.getCurrentNodePointer()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.getDocumentOrder()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.reset()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.setPosition(int)",
      "begin_line": 76,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.nextNode()",
      "begin_line": 92,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 115,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/axes/AncestorContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AncestorContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 29,
      "end_line": 100,
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
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.getDocumentOrder()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.reset()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.setPosition(int)",
      "begin_line": 64,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AncestorContext.nextNode()",
      "begin_line": 77,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 98,col 9)"
      ]
    }
  ]
}
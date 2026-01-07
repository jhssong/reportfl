{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/axes/ParentContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParentContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 29,
      "end_line": 85,
      "comment": "\n * EvalContext that walks the \"parent::\" axis.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.ParentContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Create a new ParentContext.\n     * @param parentContext parent context\n     * @param nodeTest test\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 29)",
        "(line 41,col 9)-(line 41,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.getCurrentNodePointer()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.getCurrentPosition()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.getDocumentOrder()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.reset()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)",
        "(line 58,col 9)-(line 58,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.setPosition(int)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 36)",
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ParentContext.nextNode()",
      "begin_line": 66,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 26)",
        "(line 72,col 9)-(line 72,col 73)",
        "(line 73,col 9)-(line 73,col 70)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 21)"
      ]
    }
  ]
}
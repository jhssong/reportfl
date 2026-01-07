{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/axes/PrecedingOrFollowingContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrecedingOrFollowingContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 33,
      "end_line": 166,
      "comment": "\n * EvalContext that walks the \"preceding::\" and \"following::\" axes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "setStarted"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "started"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameStack"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentNodePointer"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentRootLocation"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverse"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.PrecedingOrFollowingContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean)",
      "begin_line": 43,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 49,col 33)",
        "(line 50,col 9)-(line 50,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getCurrentNodePointer()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getDocumentOrder()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.reset()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 63,col 28)",
        "(line 64,col 9)-(line 64,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.setPosition(int)",
      "begin_line": 67,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.nextNode()",
      "begin_line": 80,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    }
  ]
}
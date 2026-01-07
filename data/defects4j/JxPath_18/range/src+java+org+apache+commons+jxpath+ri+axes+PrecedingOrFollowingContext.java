{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/axes/PrecedingOrFollowingContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrecedingOrFollowingContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 163,
      "comment": "\n * EvalContext that walks the \"preceding::\" and \"following::\" axes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "setStarted"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentNodePointer"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentRootLocation"
      ],
      "begin_line": 37,
      "end_line": 37,
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.PrecedingOrFollowingContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean)",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 29)",
        "(line 46,col 9)-(line 46,col 33)",
        "(line 47,col 9)-(line 47,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getCurrentNodePointer()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getDocumentOrder()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.reset()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)",
        "(line 60,col 9)-(line 60,col 28)",
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.setPosition(int)",
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
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.nextNode()",
      "begin_line": 77,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 21)"
      ]
    }
  ]
}
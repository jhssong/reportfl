{
  "filepath": "/tmp/JxPath-5b/src/java/org/apache/commons/jxpath/ri/axes/PrecedingOrFollowingContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrecedingOrFollowingContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 33,
      "end_line": 164,
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
        "stack"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentNodePointer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentRootLocation"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverse"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.PrecedingOrFollowingContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean)",
      "begin_line": 41,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 29)",
        "(line 47,col 9)-(line 47,col 33)",
        "(line 48,col 9)-(line 48,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getCurrentNodePointer()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getDocumentOrder()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.reset()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 28)",
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.setPosition(int)",
      "begin_line": 65,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.nextNode()",
      "begin_line": 78,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 21)"
      ]
    }
  ]
}
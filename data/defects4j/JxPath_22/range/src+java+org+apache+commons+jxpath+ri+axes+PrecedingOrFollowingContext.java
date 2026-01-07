{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/axes/PrecedingOrFollowingContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrecedingOrFollowingContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 173,
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
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n     * Create a new PrecedingOrFollowingContext.\n     * @param parentContext parent context\n     * @param nodeTest test\n     * @param reverse whether to iterate in reverse order\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 33)",
        "(line 52,col 9)-(line 52,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getCurrentNodePointer()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.getDocumentOrder()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.reset()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)",
        "(line 65,col 9)-(line 65,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.setPosition(int)",
      "begin_line": 68,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext.nextNode()",
      "begin_line": 81,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 21)"
      ]
    }
  ]
}
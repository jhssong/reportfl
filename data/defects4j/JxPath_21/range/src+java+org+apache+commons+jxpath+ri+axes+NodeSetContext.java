{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/axes/NodeSetContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeSetContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 29,
      "end_line": 70,
      "comment": "\n * A simple context that is based on a {@link NodeSet}.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "startedSet"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeSet"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.NodeSetContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.NodeSet)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Create a new NodeSetContext.\n     * @param parentContext parent context\n     * @param nodeSet associated NodeSet\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 29)",
        "(line 40,col 9)-(line 40,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.getNodeSet()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer()",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(int)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 36)",
        "(line 56,col 9)-(line 56,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.nextSet()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 26)",
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)"
      ]
    }
  ]
}
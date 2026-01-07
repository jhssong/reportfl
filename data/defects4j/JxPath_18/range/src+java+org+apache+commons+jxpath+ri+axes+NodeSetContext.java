{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/axes/NodeSetContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeSetContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 29,
      "end_line": 87,
      "comment": "\n * A simple context that is based on a NodeSet.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer()",
      "begin_line": 53,
      "end_line": 60,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(int)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 36)",
        "(line 67,col 9)-(line 67,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.nextSet()",
      "begin_line": 73,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 26)",
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 41)"
      ]
    }
  ]
}
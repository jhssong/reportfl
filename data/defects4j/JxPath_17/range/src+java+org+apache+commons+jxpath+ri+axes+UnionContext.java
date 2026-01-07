{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/axes/UnionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnionContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.axes.NodeSetContext"
      ],
      "begin_line": 34,
      "end_line": 82,
      "comment": "\n * EvalContext that represents a union between other contexts - result\n * of a union operation like (a | b)\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "contexts"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prepared"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.UnionContext.UnionContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.EvalContext[])",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Create a new UnionContext.\n     * @param parentContext parent context\n     * @param contexts child contexts\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 49)",
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.UnionContext.getDocumentOrder()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(int)",
      "begin_line": 58,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 43)"
      ]
    }
  ]
}
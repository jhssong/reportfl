{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/axes/AttributeContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AttributeContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 91,
      "comment": "\n * EvalContext that walks the \"attribute::\" axis.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
        "iterator"
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.AttributeContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * @param parentContext represents the previous step on the path\n     * @param nodeTest is the name of the attribute we are looking for\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 29)",
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.getCurrentNodePointer()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.reset()",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 27)",
        "(line 54,col 9)-(line 54,col 24)",
        "(line 55,col 9)-(line 55,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(int)",
      "begin_line": 58,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode()",
      "begin_line": 71,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 55)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    }
  ]
}
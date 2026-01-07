{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/axes/AttributeContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AttributeContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 34,
      "end_line": 105,
      "comment": "\n * EvalContext that walks the \"attribute::\" axis.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WILDCARD"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "setStarted"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentNodePointer"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.AttributeContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Create a new AttributeContext.\n     * @param parentContext represents the previous step on the path\n     * @param nodeTest is the name of the attribute we are looking for\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 49,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.getCurrentNodePointer()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.reset()",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 27)",
        "(line 58,col 9)-(line 58,col 24)",
        "(line 59,col 9)-(line 59,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(int)",
      "begin_line": 62,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode()",
      "begin_line": 75,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 55)",
        "(line 103,col 9)-(line 103,col 20)"
      ]
    }
  ]
}
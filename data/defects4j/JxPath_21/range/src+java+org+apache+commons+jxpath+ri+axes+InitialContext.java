{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/axes/InitialContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InitialContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 31,
      "end_line": 85,
      "comment": "\n * A single-set EvalContext that provides access to the current node of\n * the parent context and nothing else.  It does not pass the iteration\n * on to the parent context.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "started"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodePointer"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.InitialContext(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 40,
      "end_line": 48,
      "comment": "\n     * Create a new InitialContext.\n     * @param parentContext parent context\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 29)",
        "(line 42,col 9)-(line 43,col 72)",
        "(line 44,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.getSingleNodePointer()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.getCurrentNodePointer()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.getValue()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.nextNode()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.setPosition(int)",
      "begin_line": 66,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.InitialContext.nextSet()",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 20)"
      ]
    }
  ]
}
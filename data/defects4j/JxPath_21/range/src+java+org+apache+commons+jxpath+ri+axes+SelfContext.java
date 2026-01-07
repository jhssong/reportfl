{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/axes/SelfContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SelfContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 31,
      "end_line": 82,
      "comment": "\n * EvalContext that returns the current node from the parent context if the\n * test succeeds.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startedSet"
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
      "signature": "org.apache.commons.jxpath.ri.axes.SelfContext.SelfContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Create a new SelfContext.\n     * @param parentContext EvalContext\n     * @param nodeTest guard\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 29)",
        "(line 43,col 9)-(line 43,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SelfContext.getSingleNodePointer()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SelfContext.getCurrentNodePointer()",
      "begin_line": 50,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SelfContext.nextNode()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SelfContext.reset()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 63,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.SelfContext.setPosition(int)",
      "begin_line": 66,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 36)",
        "(line 71,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 66)"
      ]
    }
  ]
}
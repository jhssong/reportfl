{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/axes/NamespaceContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NamespaceContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 104,
      "comment": "\n * EvalContext that walks the \"namespace::\" axis.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
        "iterator"
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
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.NamespaceContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * @param parentContext represents the previous step on the path\n     * @param nodeTest is the name of the namespace we are looking for\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 29)",
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.getCurrentNodePointer()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.reset()",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)",
        "(line 53,col 9)-(line 53,col 24)",
        "(line 54,col 9)-(line 54,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.setPosition(int)",
      "begin_line": 57,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.nextNode()",
      "begin_line": 70,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 52)",
        "(line 72,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/ri/axes/NamespaceContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NamespaceContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 116,
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
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.reset()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 24)",
        "(line 60,col 9)-(line 60,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.setPosition(int)",
      "begin_line": 66,
      "end_line": 77,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.NamespaceContext.nextNode()",
      "begin_line": 82,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 55)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    }
  ]
}
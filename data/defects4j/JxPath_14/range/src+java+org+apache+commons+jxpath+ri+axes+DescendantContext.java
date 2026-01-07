{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/ri/axes/DescendantContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescendantContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 36,
      "end_line": 150,
      "comment": "\n * An EvalContext that walks the \"descendant::\" and \"descendant-or-self::\"\n * axes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
        "stack"
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
      "type": "field",
      "varNames": [
        "includeSelf"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ELEMENT_NODE_TEST"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.DescendantContext(org.apache.commons.jxpath.ri.EvalContext, boolean, org.apache.commons.jxpath.ri.compiler.NodeTest)",
      "begin_line": 45,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 39)",
        "(line 52,col 9)-(line 52,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.isChildOrderingRequired()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.getCurrentNodePointer()",
      "begin_line": 59,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.reset()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.setPosition(int)",
      "begin_line": 73,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.nextNode()",
      "begin_line": 86,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.isRecursive()",
      "begin_line": 139,
      "end_line": 149,
      "comment": "\n     * Checks if we are reentering a bean we have already seen and if so\n     * returns true to prevent infinite recursion.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 51)",
        "(line 141,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    }
  ]
}
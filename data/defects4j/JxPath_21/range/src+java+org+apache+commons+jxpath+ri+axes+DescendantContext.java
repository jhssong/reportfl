{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/axes/DescendantContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescendantContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 36,
      "end_line": 155,
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
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Create a new DescendantContext.\n     * @param parentContext parent context\n     * @param includeSelf whether to include this node\n     * @param nodeTest test\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)",
        "(line 54,col 9)-(line 54,col 39)",
        "(line 55,col 9)-(line 55,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.isChildOrderingRequired()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.getCurrentNodePointer()",
      "begin_line": 62,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.reset()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 22)",
        "(line 71,col 9)-(line 71,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.setPosition(int)",
      "begin_line": 74,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.nextNode()",
      "begin_line": 87,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.DescendantContext.isRecursive()",
      "begin_line": 144,
      "end_line": 154,
      "comment": "\n     * Checks if we are reentering a bean we have already seen and if so\n     * returns true to prevent infinite recursion.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 51)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 21)"
      ]
    }
  ]
}
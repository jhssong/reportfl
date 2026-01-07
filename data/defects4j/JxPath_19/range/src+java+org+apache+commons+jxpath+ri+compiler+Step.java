{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/ri/compiler/Step.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Step",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 165,
      "comment": "\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "predicates"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.Step(int, org.apache.commons.jxpath.ri.compiler.NodeTest, org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 36,
      "end_line": 40,
      "comment": "\n     * Create a new Step.\n     * @param axis axis code\n     * @param nodeTest step test\n     * @param predicates predicate expressions\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 25)",
        "(line 38,col 9)-(line 38,col 33)",
        "(line 39,col 9)-(line 39,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.getAxis()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Get the axis code.\n     * @return int\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.getNodeTest()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Get the step test.\n     * @return NodeTest\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.getPredicates()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Get the predicates.\n     * @return Expression[]\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.isContextDependent()",
      "begin_line": 70,
      "end_line": 79,
      "comment": "\n     * Learn whether this step contains any predicate that is context dependent.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.toString()",
      "begin_line": 81,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 49)",
        "(line 83,col 9)-(line 83,col 29)",
        "(line 84,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Step.axisToString(int)",
      "begin_line": 133,
      "end_line": 164,
      "comment": "\n     * Decode an axis code to its name.\n     * @param axis int code\n     * @return String name.\n     * @see Compiler\n     * @see http://www.w3.org/TR/xpath#axes\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 163,col 9)"
      ]
    }
  ]
}
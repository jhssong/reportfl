{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/axes/PredicateContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicateContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 35,
      "end_line": 187,
      "comment": "\n * EvalContext that checks predicates.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "expression"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "done"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameTestExpression"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dynamicPropertyPointer"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.PredicateContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 41,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 29)",
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode()",
      "begin_line": 50,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.setupDynamicPropertyPointer()",
      "begin_line": 113,
      "end_line": 131,
      "comment": "\n     * Used for an optimized access to dynamic properties using the\n     * \"map[@name \u003d \u0027name\u0027]\" syntax\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 67)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 42)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 129,col 25)",
        "(line 130,col 9)-(line 130,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(int)",
      "begin_line": 133,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer()",
      "begin_line": 152,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.reset()",
      "begin_line": 164,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 22)",
        "(line 166,col 9)-(line 166,col 30)",
        "(line 167,col 9)-(line 167,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.nextSet()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 16)",
        "(line 172,col 9)-(line 172,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(int)",
      "begin_line": 175,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 20)"
      ]
    }
  ]
}
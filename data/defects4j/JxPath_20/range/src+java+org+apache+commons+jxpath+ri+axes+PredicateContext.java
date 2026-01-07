{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/axes/PredicateContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicateContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 35,
      "end_line": 194,
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
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n     * Create a new PredicateContext.\n     * @param parentContext parent context\n     * @param expression compiled Expression\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 29)",
        "(line 48,col 9)-(line 48,col 37)",
        "(line 49,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.nextNode()",
      "begin_line": 55,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.setupDynamicPropertyPointer()",
      "begin_line": 119,
      "end_line": 137,
      "comment": "\n     * Used for an optimized access to dynamic properties using the\n     * \"map[@name \u003d \u0027name\u0027]\" syntax\n     * @return whether valid\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 67)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 135,col 25)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.setPosition(int)",
      "begin_line": 139,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.getCurrentNodePointer()",
      "begin_line": 156,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.reset()",
      "begin_line": 166,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 22)",
        "(line 168,col 9)-(line 168,col 30)",
        "(line 169,col 9)-(line 169,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.nextSet()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 16)",
        "(line 174,col 9)-(line 174,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.PredicateContext.setPositionStandard(int)",
      "begin_line": 182,
      "end_line": 193,
      "comment": "\n     * Basic setPosition\n     * @param position to set\n     * @return whether valid\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 20)"
      ]
    }
  ]
}
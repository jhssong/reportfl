{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/compiler/ExpressionPath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpressionPath",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Path"
      ],
      "begin_line": 36,
      "end_line": 191,
      "comment": "\n * An  element of the parse tree that represents an expression path, which is a\n * path that starts with an expression like a function call: \u003ccode\u003egetFoo(.)\n * /bar\u003c/code\u003e.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "expression"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "predicates"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basicKnown"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basic"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.ExpressionPath(org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression[], org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 21)",
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.getExpression()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.getPredicates()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Predicates are the expressions in brackets that may follow\n     * the root expression of the path.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent()",
      "begin_line": 70,
      "end_line": 82,
      "comment": "\n     * Returns true if the root expression or any of the\n     * predicates or the path steps are context dependent.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.isSimpleExpressionPath()",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Recognized paths formatted as \u003ccode\u003e$x[3]/foo[2]\u003c/code\u003e.  The\n     * evaluation of such \"simple\" paths is optimized and streamlined.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.toString()",
      "begin_line": 96,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 49)",
        "(line 98,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(org.apache.commons.jxpath.ri.EvalContext, boolean)",
      "begin_line": 137,
      "end_line": 190,
      "comment": "\n     * Walks an expression path (a path that starts with an expression)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 28)",
        "(line 143,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 189,col 9)"
      ]
    }
  ]
}
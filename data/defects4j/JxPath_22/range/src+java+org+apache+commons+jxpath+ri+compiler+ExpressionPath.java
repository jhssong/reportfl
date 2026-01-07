{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/compiler/ExpressionPath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpressionPath",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Path"
      ],
      "begin_line": 35,
      "end_line": 196,
      "comment": "\n * An  element of the parse tree that represents an expression path, which is a\n * path that starts with an expression like a function call: \u003ccode\u003egetFoo(.)\n * /bar\u003c/code\u003e.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "expression"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "predicates"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basicKnown"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basic"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.ExpressionPath(org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression[], org.apache.commons.jxpath.ri.compiler.Step[])",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Create a new ExpressionPath.\n     * @param expression Expression\n     * @param predicates to execute\n     * @param steps navigation\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)",
        "(line 52,col 9)-(line 52,col 37)",
        "(line 53,col 9)-(line 53,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.getExpression()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Get the expression.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.getPredicates()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Predicates are the expressions in brackets that may follow\n     * the root expression of the path.\n     * @return Expression[]\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent()",
      "begin_line": 78,
      "end_line": 90,
      "comment": "\n     * Returns true if the root expression or any of the\n     * predicates or the path steps are context dependent.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.isSimpleExpressionPath()",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n     * Recognized paths formatted as \u003ccode\u003e$x[3]/foo[2]\u003c/code\u003e.  The\n     * evaluation of such \"simple\" paths is optimized and streamlined.\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.toString()",
      "begin_line": 105,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 49)",
        "(line 107,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(org.apache.commons.jxpath.ri.EvalContext, boolean)",
      "begin_line": 149,
      "end_line": 195,
      "comment": "\n     * Walks an expression path (a path that starts with an expression)\n     * @param evalContext base context\n     * @param firstMatch whether to return the first match found\n     * @return Object found\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 55)",
        "(line 151,col 9)-(line 151,col 28)",
        "(line 152,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 194,col 37)"
      ]
    }
  ]
}
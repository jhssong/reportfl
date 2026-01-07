{
  "filepath": "/tmp/JxPath-11b/src/java/org/apache/commons/jxpath/ri/compiler/ExpressionPath.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpressionPath",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Path"
      ],
      "begin_line": 35,
      "end_line": 186,
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
      "begin_line": 43,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 21)",
        "(line 49,col 9)-(line 49,col 37)",
        "(line 50,col 9)-(line 50,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.getExpression()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.getPredicates()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Predicates are the expressions in brackets that may follow\n     * the root expression of the path.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent()",
      "begin_line": 69,
      "end_line": 81,
      "comment": "\n     * Returns true if the root expression or any of the\n     * predicates or the path steps are context dependent.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.isSimpleExpressionPath()",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Recognized paths formatted as \u003ccode\u003e$x[3]/foo[2]\u003c/code\u003e.  The\n     * evaluation of such \"simple\" paths is optimized and streamlined.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.toString()",
      "begin_line": 95,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 49)",
        "(line 97,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(org.apache.commons.jxpath.ri.EvalContext, boolean)",
      "begin_line": 136,
      "end_line": 185,
      "comment": "\n     * Walks an expression path (a path that starts with an expression)\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 55)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 184,col 37)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 28,
      "end_line": 117,
      "comment": "\n * The common subclass for tree elements representing core operations like \"+\",\n * \"- \", \"*\" etc.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "OR_PRECEDENCE"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " or precedence "
    },
    {
      "type": "field",
      "varNames": [
        "AND_PRECEDENCE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " and precedence "
    },
    {
      "type": "field",
      "varNames": [
        "COMPARE_PRECEDENCE"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " compare precedence "
    },
    {
      "type": "field",
      "varNames": [
        "RELATIONAL_EXPR_PRECEDENCE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " relational expression precedence "
    },
    {
      "type": "field",
      "varNames": [
        "ADD_PRECEDENCE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " add/subtract precedence "
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLY_PRECEDENCE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " multiply/divide/mod precedence "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATE_PRECEDENCE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " negate precedence "
    },
    {
      "type": "field",
      "varNames": [
        "UNION_PRECEDENCE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " union precedence "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.CoreOperation(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a new CoreOperation.\n     * @param args Expression[]\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.getSymbol()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns the XPath symbol for this operation, e.g. \"+\", \"div\", etc.\n     * @return String symbol\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.isSymmetric()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Returns true if the operation is not sensitive to the order of arguments,\n     * e.g. \"\u003d\", \"and\" etc, and false if it is, e.g. \"\u0026lt;\u003d\", \"div\".\n     * @return boolean\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.getPrecedence()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Computes the precedence of the operation.\n     * @return int precedence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.toString()",
      "begin_line": 80,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 85,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.parenthesize(org.apache.commons.jxpath.ri.compiler.Expression, boolean)",
      "begin_line": 102,
      "end_line": 116,
      "comment": "\n     * Wrap an expression in parens if necessary.\n     * @param expression other Expression\n     * @param left whether \u003ccode\u003eexpression\u003c/code\u003e is left of this one.\n     * @return String\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 86)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 29)"
      ]
    }
  ]
}
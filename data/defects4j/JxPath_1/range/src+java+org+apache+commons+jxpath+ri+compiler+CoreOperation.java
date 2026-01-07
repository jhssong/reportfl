{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 28,
      "end_line": 102,
      "comment": "\n * The common subclass for tree elements representing core operations like \"+\",\n * \"- \", \"*\" etc.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.CoreOperation(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.getSymbol()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Returns the XPath symbol for this operation, e.g. \"+\", \"div\", etc.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.isSymmetric()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Returns true if the operation is not sensitive to the order of arguments,\n     * e.g. \"\u003d\", \"and\" etc, and false if it is, e.g. \"\u0026lt;\u003d\", \"div\".\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.getPrecedence()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Computes the precedence of the operation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.toString()",
      "begin_line": 56,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.parenthesize(org.apache.commons.jxpath.ri.compiler.Expression, boolean)",
      "begin_line": 74,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 54)",
        "(line 79,col 9)-(line 79,col 43)",
        "(line 80,col 9)-(line 80,col 47)",
        "(line 82,col 9)-(line 82,col 34)",
        "(line 83,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 100,col 9)"
      ]
    }
  ]
}
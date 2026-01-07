{
  "filepath": "/tmp/JxPath-11b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperation",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 28,
      "end_line": 87,
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
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 49)",
        "(line 61,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperation.parenthesize(org.apache.commons.jxpath.ri.compiler.Expression, boolean)",
      "begin_line": 72,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 41)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 86)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 29)"
      ]
    }
  ]
}
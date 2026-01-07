{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationNegate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationNegate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 28,
      "end_line": 54,
      "comment": "\n * Implementation of {@link Expression} for the operation unary \"-\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.CoreOperationNegate(org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Create a new CoreOperationNegate.\n     * @param arg the Expression to negate\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 74)",
        "(line 40,col 9)-(line 40,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.getPrecedence()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.isSymmetric()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.getSymbol()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)"
      ]
    }
  ]
}
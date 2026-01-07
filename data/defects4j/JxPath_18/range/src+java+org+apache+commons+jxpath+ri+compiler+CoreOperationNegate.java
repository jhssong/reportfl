{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationNegate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationNegate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 28,
      "end_line": 66,
      "comment": "\n * Implementation of Expression for the operation unary \"-\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 74)",
        "(line 43,col 9)-(line 43,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.getPrecedence()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.isSymmetric()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate.getSymbol()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 19)"
      ]
    }
  ]
}
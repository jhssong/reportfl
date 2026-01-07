{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationMod.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationMod",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 28,
      "end_line": 68,
      "comment": "\n * Implementation of Expression for the operation \"mod\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.CoreOperationMod(org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Create a new CoreOperationMod.\n     * @param arg1 dividend\n     * @param arg2 divisor\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 79)",
        "(line 44,col 9)-(line 44,col 79)",
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.getPrecedence()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.isSymmetric()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.getSymbol()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 21)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationMod.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationMod",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 28,
      "end_line": 56,
      "comment": "\n * Implementation of {@link Expression} for the operation \"mod\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 79)",
        "(line 41,col 9)-(line 41,col 79)",
        "(line 42,col 9)-(line 42,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.getPrecedence()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.isSymmetric()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationMod.getSymbol()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationAdd.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationAdd",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 28,
      "end_line": 69,
      "comment": "\n * Implementation of Expression for the operation \"+\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.CoreOperationAdd(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Create a new CoreOperationAdd.\n     * @param args Expression arguments to add together.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 41,
      "end_line": 47,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 23)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.getPrecedence()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.isSymmetric()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.getSymbol()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 19)"
      ]
    }
  ]
}
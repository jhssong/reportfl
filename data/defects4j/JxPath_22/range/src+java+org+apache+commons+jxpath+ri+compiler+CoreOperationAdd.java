{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationAdd.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationAdd",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 28,
      "end_line": 57,
      "comment": "\n * Implementation of {@link Expression} for the operation \"+\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 38,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 23)",
        "(line 40,col 9)-(line 42,col 9)",
        "(line 43,col 9)-(line 43,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.getPrecedence()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.isSymmetric()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationAdd.getSymbol()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    }
  ]
}
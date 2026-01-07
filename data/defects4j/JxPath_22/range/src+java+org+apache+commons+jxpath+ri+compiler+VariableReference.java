{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/compiler/VariableReference.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableReference",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Expression"
      ],
      "begin_line": 28,
      "end_line": 72,
      "comment": "\n * An element of the compile tree holding a variable reference.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "varName"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.VariableReference(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Create a new VariableReference.\n     * @param varName variable name\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.getVariableName()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Get the variable name.\n     * @return QName\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.toString()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.isContextDependent()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.computeContextDependent()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.VariableReference.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns the value of the variable.\n     * @param context EvalContext against which to compute the variable\u0027s value.\n     * @return Object\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 68)"
      ]
    }
  ]
}
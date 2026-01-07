{
  "filepath": "/tmp/JxPath-7b/src/java/org/apache/commons/jxpath/ri/compiler/Constant.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Constant",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Expression"
      ],
      "begin_line": 28,
      "end_line": 71,
      "comment": "\n * A compile tree element containing a constant number or string.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.Constant(java.lang.Number)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.Constant(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Returns the value of the constant.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.isContextDependent()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Returns false\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.computeContextDependent()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Returns false\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.toString()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 33)"
      ]
    }
  ]
}
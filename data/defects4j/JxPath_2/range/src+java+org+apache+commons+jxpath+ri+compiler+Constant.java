{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/ri/compiler/Constant.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Constant",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Expression"
      ],
      "begin_line": 27,
      "end_line": 79,
      "comment": "\n * A compile tree element containing a constant number or string.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.Constant(java.lang.Number)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.Constant(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Returns the value of the constant.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.isContextDependent()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Returns false\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.computeContextDependent()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Returns false\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.toString()",
      "begin_line": 64,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 77,col 9)"
      ]
    }
  ]
}
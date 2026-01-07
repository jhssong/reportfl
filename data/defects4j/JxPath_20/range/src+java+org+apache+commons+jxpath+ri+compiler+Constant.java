{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/compiler/Constant.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Constant",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Expression"
      ],
      "begin_line": 28,
      "end_line": 78,
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
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Create a new Constant.\n     * @param number constant\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.Constant(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create a new Constant.\n     * @param string constant\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.isContextDependent()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Returns false\n     * @return false\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.computeContextDependent()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns false\n     * @return false\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.Constant.toString()",
      "begin_line": 72,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 33)"
      ]
    }
  ]
}
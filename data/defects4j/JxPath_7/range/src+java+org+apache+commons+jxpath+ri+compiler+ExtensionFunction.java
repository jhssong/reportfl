{
  "filepath": "/tmp/JxPath-7b/src/java/org/apache/commons/jxpath/ri/compiler/ExtensionFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtensionFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 33,
      "end_line": 97,
      "comment": "\n * Represents an element of the parse tree representing an extension function\n * call.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionName"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.ExtensionFunction(org.apache.commons.jxpath.ri.QName, org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)",
        "(line 39,col 9)-(line 39,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.getFunctionName()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.computeContextDependent()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * An extension function gets the current context, therefore it MAY be\n     * context dependent.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.toString()",
      "begin_line": 54,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 49)",
        "(line 56,col 9)-(line 56,col 36)",
        "(line 57,col 9)-(line 57,col 27)",
        "(line 58,col 9)-(line 58,col 43)",
        "(line 59,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 27)",
        "(line 68,col 9)-(line 68,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 75,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 85,col 75)",
        "(line 86,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.convert(java.lang.Object)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 90)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/compiler/ExtensionFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtensionFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.Operation"
      ],
      "begin_line": 35,
      "end_line": 115,
      "comment": "\n * Represents an element of the parse tree representing an extension function\n * call.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionName"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.ExtensionFunction(org.apache.commons.jxpath.ri.QName, org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Create a new ExtensionFunction.\n     * @param functionName name of the function\n     * @param args Expression[] of function args\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)",
        "(line 46,col 9)-(line 46,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.getFunctionName()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Get the function name\n     * @return QName\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.computeContextDependent()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * An extension function gets the current context, therefore it MAY be\n     * context dependent.\n     * @return true\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.toString()",
      "begin_line": 66,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 49)",
        "(line 68,col 9)-(line 68,col 36)",
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 43)",
        "(line 71,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.compute(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 87,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 97,col 75)",
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 61)",
        "(line 103,col 9)-(line 104,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.ExtensionFunction.convert(java.lang.Object)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Convert any incoming context to a value.\n     * @param object Object to convert\n     * @return context value or \u003ccode\u003eobject\u003c/code\u003e unscathed.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 90)"
      ]
    }
  ]
}
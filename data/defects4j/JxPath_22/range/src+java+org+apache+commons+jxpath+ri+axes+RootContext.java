{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/axes/RootContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RootContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 33,
      "end_line": 178,
      "comment": "\n * EvalContext that is used to hold the root node for the path traversal.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "jxpathContext"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointer"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registers"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "availableRegister"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_VALUE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_REGISTER"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.RootContext(org.apache.commons.jxpath.ri.JXPathContextReferenceImpl, org.apache.commons.jxpath.ri.model.NodePointer)",
      "begin_line": 46,
      "end_line": 54,
      "comment": "\n     * Create a new RootContext.\n     * @param jxpathContext context\n     * @param pointer pointer\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 20)",
        "(line 49,col 9)-(line 49,col 43)",
        "(line 50,col 9)-(line 50,col 31)",
        "(line 51,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getJXPathContext()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getRootContext()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Get absolute root context\n     * @return EvalContext\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getCurrentNodePointer()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getValue()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getCurrentPosition()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.nextNode()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.nextSet()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.setPosition(int)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getConstantContext(java.lang.Object)",
      "begin_line": 101,
      "end_line": 119,
      "comment": "\n     * Get a context that points to the specified object.\n     * @param constant object\n     * @return EvalContext\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 28)",
        "(line 109,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getVariableContext(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * Get variable context.\n     * @param variableName variable name\n     * @return EvalContext\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 130,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Get the specified function from the context.\n     * @param functionName QName\n     * @param parameters Object[]\n     * @return Function\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getRegisteredValue(int)",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\n     * Get a registered value.\n     * @param id int\n     * @return Object\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.setRegisteredValue(java.lang.Object)",
      "begin_line": 160,
      "end_line": 173,
      "comment": "\n     * Set the next registered value.\n     * @param value Object\n     * @return the id that can reclaim value.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 45)",
        "(line 171,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.toString()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 57)"
      ]
    }
  ]
}
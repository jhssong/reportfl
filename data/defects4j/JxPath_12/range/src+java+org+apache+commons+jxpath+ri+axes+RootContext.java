{
  "filepath": "/tmp/JxPath-12b/src/java/org/apache/commons/jxpath/ri/axes/RootContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RootContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 33,
      "end_line": 145,
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
      "begin_line": 41,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)",
        "(line 46,col 9)-(line 46,col 43)",
        "(line 47,col 9)-(line 47,col 31)",
        "(line 48,col 9)-(line 50,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getJXPathContext()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getRootContext()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getCurrentNodePointer()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getValue()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getCurrentPosition()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.nextNode()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.nextSet()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.setPosition(int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getConstantContext(java.lang.Object)",
      "begin_line": 89,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 28)",
        "(line 97,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getVariableContext(org.apache.commons.jxpath.ri.QName)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 113,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getFunction(org.apache.commons.jxpath.ri.QName, java.lang.Object[])",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.getRegisteredValue(int)",
      "begin_line": 120,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.setRegisteredValue(java.lang.Object)",
      "begin_line": 127,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 45)",
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.RootContext.toString()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 57)"
      ]
    }
  ]
}
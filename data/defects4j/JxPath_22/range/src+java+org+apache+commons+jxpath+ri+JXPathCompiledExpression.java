{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/JXPathCompiledExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathCompiledExpression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.CompiledExpression"
      ],
      "begin_line": 32,
      "end_line": 114,
      "comment": "\n * RI of CompiledExpression.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "xpath"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expression"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.JXPathCompiledExpression(java.lang.String, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Create a new JXPathCompiledExpression.\n     * @param xpath source\n     * @param expression compiled\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 27)",
        "(line 44,col 9)-(line 44,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getXPath()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Get the source expression.\n     * @return String\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getExpression()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Get the compiled expression.\n     * @return Expression\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.toString()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getValue(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 69,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getValue(org.apache.commons.jxpath.JXPathContext, java.lang.Class)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.setValue(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.createPathAndSetValue(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 89,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.iterate(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getPointer(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.iteratePointers(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.removePath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.removeAll(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 76)"
      ]
    }
  ]
}
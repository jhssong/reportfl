{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/JXPathCompiledExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathCompiledExpression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.CompiledExpression"
      ],
      "begin_line": 32,
      "end_line": 131,
      "comment": "\n *\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 27)",
        "(line 39,col 9)-(line 39,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getXPath()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getExpression()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.toString()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getValue(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * @see CompiledExpression#getValue(JXPathContext)\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getValue(org.apache.commons.jxpath.JXPathContext, java.lang.Class)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * @see CompiledExpression#getValue(JXPathContext, Class)\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.setValue(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * @see CompiledExpression#setValue(JXPathContext, Object)\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 75,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * @see CompiledExpression#createPath(JXPathContext)\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 83,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.createPathAndSetValue(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * @see CompiledExpression#createPathAndSetValue(JXPathContext, Object)\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.iterate(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * @see CompiledExpression#iterate(JXPathContext)\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.getPointer(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * @see CompiledExpression#getPointer(JXPathContext, String)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.iteratePointers(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * @see CompiledExpression#iteratePointers(JXPathContext)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 115,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.removePath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * @see CompiledExpression#removePath(JXPathContext)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.JXPathCompiledExpression.removeAll(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * @see CompiledExpression#removeAll(JXPathContext)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 76)"
      ]
    }
  ]
}
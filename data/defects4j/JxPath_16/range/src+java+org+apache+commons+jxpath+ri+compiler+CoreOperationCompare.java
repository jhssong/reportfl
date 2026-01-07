{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationCompare.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationCompare",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 36,
      "end_line": 163,
      "comment": "\n * Common superclass for the implementations of Expression for the operations\n * \"\u003d\" and \"!\u003d\".\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "invert"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.CoreOperationCompare(org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.CoreOperationCompare(org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression, boolean)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 47)",
        "(line 45,col 9)-(line 45,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.getPrecedence()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.isSymmetric()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 63,
      "end_line": 105,
      "comment": "\n     * Compares two values\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 41)",
        "(line 69,col 9)-(line 69,col 42)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains(java.util.Iterator, java.lang.Object)",
      "begin_line": 107,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch(java.util.Iterator, java.util.Iterator)",
      "begin_line": 117,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(java.lang.Object, java.lang.Object)",
      "begin_line": 130,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 23)",
        "(line 140,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 31)"
      ]
    }
  ]
}
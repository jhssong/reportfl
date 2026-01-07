{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationCompare.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationCompare",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 36,
      "end_line": 195,
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
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create a new CoreOperationCompare.\n     * @param arg1 left operand\n     * @param arg2 right operand\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.CoreOperationCompare(org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression, boolean)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Create a new CoreOperationCompare.\n     * @param arg1 left operand\n     * @param arg2 right operand\n     * @param invert whether to invert (not) the comparison\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 47)",
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.getPrecedence()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.isSymmetric()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)",
      "begin_line": 78,
      "end_line": 117,
      "comment": "\n     * Compares two values.\n     * @param context evaluation context\n     * @param left operand\n     * @param right operand\n     * @return whether left \u003d right in XPath terms\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 41)",
        "(line 81,col 9)-(line 81,col 42)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains(java.util.Iterator, java.lang.Object)",
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * Learn whether it contains value.\n     * @param it Iterator to check\n     * @param value for which to look\n     * @return whether value was found\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch(java.util.Iterator, java.util.Iterator)",
      "begin_line": 141,
      "end_line": 152,
      "comment": "\n     * Learn whether lit intersects rit.\n     * @param lit left Iterator\n     * @param rit right Iterator\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(java.lang.Object, java.lang.Object)",
      "begin_line": 160,
      "end_line": 193,
      "comment": "\n     * Learn whether l equals r in XPath terms.\n     * @param l left operand\n     * @param r right operand\n     * @return whether l \u003d r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 23)",
        "(line 170,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 31)"
      ]
    }
  ]
}
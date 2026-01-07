{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationRelationalExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationRelationalExpression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 35,
      "end_line": 119,
      "comment": "\n * Base implementation of Expression for the operations \"\u0026gt;\", \"\u0026gt;\u003d\", \"\u0026lt;\", \"\u0026lt;\u003d\".\n * @since JXPath 1.3\n *\n * @author Matt Benson\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.CoreOperationRelationalExpression(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 43,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.getPrecedence()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.isSymmetric()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.evaluateCompare(int)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(java.lang.Object, java.lang.Object)",
      "begin_line": 56,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 28)",
        "(line 58,col 9)-(line 58,col 30)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 50)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 51)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(java.lang.Object)",
      "begin_line": 86,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(java.util.Iterator, java.lang.Object)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(java.util.Iterator, java.util.Iterator)",
      "begin_line": 106,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    }
  ]
}
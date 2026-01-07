{
  "filepath": "/tmp/JxPath-8b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationRelationalExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationRelationalExpression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 35,
      "end_line": 113,
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
        "(line 42,col 9)-(line 43,col 71)"
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
      "end_line": 78,
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
        "(line 76,col 9)-(line 76,col 51)",
        "(line 77,col 9)-(line 77,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(java.lang.Object)",
      "begin_line": 80,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(java.util.Iterator, java.lang.Object)",
      "begin_line": 90,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(java.util.Iterator, java.util.Iterator)",
      "begin_line": 100,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 37)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 21)"
      ]
    }
  ]
}
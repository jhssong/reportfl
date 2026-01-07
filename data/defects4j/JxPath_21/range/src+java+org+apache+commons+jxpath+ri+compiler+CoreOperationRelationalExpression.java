{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/ri/compiler/CoreOperationRelationalExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoreOperationRelationalExpression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.compiler.CoreOperation"
      ],
      "begin_line": 35,
      "end_line": 167,
      "comment": "\n * Base implementation of Expression for the operations \"\u0026gt;\", \"\u0026gt;\u003d\", \"\u0026lt;\", \"\u0026lt;\u003d\".\n * @since JXPath 1.3\n *\n * @author Matt Benson\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.CoreOperationRelationalExpression(org.apache.commons.jxpath.ri.compiler.Expression[])",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Create a new CoreOperationRelationalExpression.\n     * @param args arguments\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.computeValue(org.apache.commons.jxpath.ri.EvalContext)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 47,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.getPrecedence()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.isSymmetric()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.evaluateCompare(int)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Template method for subclasses to evaluate the result of a comparison.\n     * @param compare result of comparison to evaluate\n     * @return ultimate operation success/failure\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.compute(java.lang.Object, java.lang.Object)",
      "begin_line": 71,
      "end_line": 99,
      "comment": "\n     * Compare left to right.\n     * @param left left operand\n     * @param right right operand\n     * @return operation success/failure\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 28)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 51)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.reduce(java.lang.Object)",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n     * Reduce an operand for comparison.\n     * @param o Object to reduce\n     * @return reduced operand\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(java.util.Iterator, java.lang.Object)",
      "begin_line": 122,
      "end_line": 130,
      "comment": "\n     * Learn whether any element returned from an Iterator matches a given value.\n     * @param it Iterator\n     * @param value to look for\n     * @return whether a match was found\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.containsMatch(java.lang.Object, java.util.Iterator)",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\n     * Learn whether any element returned from an Iterator matches a given value.\n     * @param it Iterator\n     * @param value to look for\n     * @return whether a match was found\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression.findMatch(java.util.Iterator, java.util.Iterator)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "\n     * Learn whether there is an intersection between two Iterators.\n     * @param lit left Iterator\n     * @param rit right Iterator\n     * @return whether a match was found\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 37)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    }
  ]
}
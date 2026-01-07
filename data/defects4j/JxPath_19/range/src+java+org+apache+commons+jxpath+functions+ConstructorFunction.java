{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/functions/ConstructorFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Function"
      ],
      "begin_line": 33,
      "end_line": 82,
      "comment": "\n * An extension function that creates an instance using a constructor.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ARRAY"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.functions.ConstructorFunction.ConstructorFunction(java.lang.reflect.Constructor)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Create a new ConstructorFunction.\n     * @param constructor the constructor to call.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.functions.ConstructorFunction.invoke(org.apache.commons.jxpath.ExpressionContext, java.lang.Object[])",
      "begin_line": 52,
      "end_line": 81,
      "comment": "\n     * Converts parameters to suitable types and invokes the constructor.\n     * @param context evaluation context\n     * @param parameters constructor args\n     * @return new instance\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 80,col 9)"
      ]
    }
  ]
}
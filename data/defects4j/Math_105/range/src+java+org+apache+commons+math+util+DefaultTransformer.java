{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/util/DefaultTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.NumberTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 59,
      "comment": "\n * A Default NumberTransformer for java.lang.Numbers and Numeric Strings. This \n * provides some simple conversion capabilities to turn any java/lang.Number \n * into a primitive double or to turn a String representation of a Number into \n * a double.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.transform(java.lang.Object)",
      "begin_line": 43,
      "end_line": 58,
      "comment": "\n     * @param o  the object that gets transformed.\n     * @return a double primitive representation of the Object o.\n     * @throws org.apache.commons.math.MathException If it cannot successfully \n     * be transformed or is null.\n     * @see org.apache.commons.collections.Transformer#transform(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 49,col 9)-(line 51,col 9)",
        "(line 53,col 9)-(line 57,col 9)"
      ]
    }
  ]
}
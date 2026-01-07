{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/DefaultTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.NumberTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 81,
      "comment": "\n * A Default NumberTransformer for java.lang.Numbers and Numeric Strings. This\n * provides some simple conversion capabilities to turn any java.lang.Number\n * into a primitive double or to turn a String representation of a Number into\n * a double.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.transform(java.lang.Object)",
      "begin_line": 44,
      "end_line": 60,
      "comment": "\n     * @param o  the object that gets transformed.\n     * @return a double primitive representation of the Object o.\n     * @throws org.apache.commons.math.MathException If it cannot successfully\n     * be transformed or is null.\n     * @see \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/Transformer.html\"/\u003e\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.equals(java.lang.Object)",
      "begin_line": 63,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.hashCode()",
      "begin_line": 75,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    }
  ]
}
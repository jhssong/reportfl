{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/util/DefaultTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.NumberTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 82,
      "comment": "\n * A Default NumberTransformer for java.lang.Numbers and Numeric Strings. This\n * provides some simple conversion capabilities to turn any java.lang.Number\n * into a primitive double or to turn a String representation of a Number into\n * a double.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.transform(java.lang.Object)",
      "begin_line": 46,
      "end_line": 61,
      "comment": "\n     * @param o  the object that gets transformed.\n     * @return a double primitive representation of the Object o.\n     * @throws MathException if it cannot successfully be transformed.\n     * @throws NullArgumentException if is {@code null}.\n     * @see \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/Transformer.html\"\u003eCommons Collections Transformer\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 9)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 55,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.equals(java.lang.Object)",
      "begin_line": 64,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DefaultTransformer.hashCode()",
      "begin_line": 76,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    }
  ]
}
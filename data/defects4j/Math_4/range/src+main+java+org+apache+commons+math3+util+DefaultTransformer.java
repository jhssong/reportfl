{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/DefaultTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.NumberTransformer",
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
      "signature": "org.apache.commons.math3.util.DefaultTransformer.transform(java.lang.Object)",
      "begin_line": 47,
      "end_line": 64,
      "comment": "\n     * @param o  the object that gets transformed.\n     * @return a double primitive representation of the Object o.\n     * @throws NullArgumentException if Object \u003ccode\u003eo\u003c/code\u003e is {@code null}.\n     * @throws MathIllegalArgumentException if Object \u003ccode\u003eo\u003c/code\u003e\n     * cannot successfully be transformed\n     * @see \u003ca href\u003d\"http://commons.apache.org/collections/api-release/org/apache/commons/collections/Transformer.html\"\u003eCommons Collections Transformer\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.DefaultTransformer.equals(java.lang.Object)",
      "begin_line": 67,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.DefaultTransformer.hashCode()",
      "begin_line": 76,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    }
  ]
}
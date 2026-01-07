{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/DefaultFieldMatrixChangingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultFieldMatrixChangingVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e"
      ],
      "begin_line": 33,
      "end_line": 62,
      "comment": "\n * Default implementation of the {@link FieldMatrixChangingVisitor} interface.\n * \u003cp\u003e\n * This class is a convenience to create custom visitors without defining all\n * methods. This class provides default implementations that do nothing.\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Zero element of the field. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor.DefaultFieldMatrixChangingVisitor(T)",
      "begin_line": 42,
      "end_line": 44,
      "comment": " Build a new instance.\n     * @param zero additive identity of the field\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor.start(int, int, int, int, int, int)",
      "begin_line": 47,
      "end_line": 49,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor.visit(int, int, T)",
      "begin_line": 52,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor.end()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    }
  ]
}
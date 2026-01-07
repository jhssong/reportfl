{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/DefaultFieldMatrixPreservingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultFieldMatrixPreservingVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e"
      ],
      "begin_line": 33,
      "end_line": 61,
      "comment": "\n * Default implementation of the {@link FieldMatrixPreservingVisitor} interface.\n * \u003cp\u003e\n * This class is a convenience to create custom visitors without defining all\n * methods. This class provides default implementations that do nothing.\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor.DefaultFieldMatrixPreservingVisitor(T)",
      "begin_line": 42,
      "end_line": 44,
      "comment": " Build a new instance.\n     * @param zero additive identity of the field\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor.start(int, int, int, int, int, int)",
      "begin_line": 47,
      "end_line": 49,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor.visit(int, int, T)",
      "begin_line": 52,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor.end()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    }
  ]
}
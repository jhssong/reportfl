{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/DefaultFieldMatrixPreservingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultFieldMatrixPreservingVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e"
      ],
      "begin_line": 33,
      "end_line": 57,
      "comment": "\n * Default implementation of the {@link FieldMatrixPreservingVisitor} interface.\n * \u003cp\u003e\n * This class is a convenience to create custom visitors without defining all\n * methods. This class provides default implementations that do nothing.\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "zero"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Zero element of the field. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor.DefaultFieldMatrixPreservingVisitor(T)",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Build a new instance.\n     * @param zero additive identity of the field\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor.start(int, int, int, int, int, int)",
      "begin_line": 46,
      "end_line": 48,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor.visit(int, int, T)",
      "begin_line": 51,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor.end()",
      "begin_line": 54,
      "end_line": 56,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 20)"
      ]
    }
  ]
}
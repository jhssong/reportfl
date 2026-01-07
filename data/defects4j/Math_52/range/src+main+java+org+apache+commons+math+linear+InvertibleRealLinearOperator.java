{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/linear/InvertibleRealLinearOperator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvertibleRealLinearOperator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealLinearOperator"
      ],
      "begin_line": 28,
      "end_line": 57,
      "comment": "\n * This interface defines a {@link RealLinearOperator} which can be inverted.\n * Preconditioners typically fall into this category.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.InvertibleRealLinearOperator.solve(double[])",
      "begin_line": 36,
      "end_line": 47,
      "comment": "\n     * Computes the matrix-vector product of the inverse of this instance\n     * with {@code b} and returns the result.\n     *\n     * @param b Right-hand side vector.\n     * @return the left-hand side vector.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 41,col 66)",
        "(line 42,col 9)-(line 46,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.InvertibleRealLinearOperator.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Computes the matrix-vector product of the inverse of this instance\n     * with {@code b} and returns the result.\n     *\n     * @param b Right-hand side vector.\n     * @return the left-hand side vector.\n     ",
      "child_ranges": []
    }
  ]
}
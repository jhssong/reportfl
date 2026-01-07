{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/linear/InvertibleRealLinearOperator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvertibleRealLinearOperator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealLinearOperator"
      ],
      "begin_line": 28,
      "end_line": 66,
      "comment": "\n * This interface defines a {@link RealLinearOperator} which can be inverted.\n * Preconditioners typically fall into this category.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.InvertibleRealLinearOperator.InvertibleRealLinearOperator(int)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Creates a new instance of this class with the specified dimension.\n     *\n     * @param dim Common dimension of the domain and codomain.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.InvertibleRealLinearOperator.solve(double[])",
      "begin_line": 45,
      "end_line": 56,
      "comment": "\n     * Computes the matrix-vector product of the inverse of this instance\n     * with {@code b} and returns the result.\n     *\n     * @param b Right-hand side vector.\n     * @return the left-hand side vector.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 66)",
        "(line 51,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.InvertibleRealLinearOperator.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Computes the matrix-vector product of the inverse of this instance\n     * with {@code b} and returns the result.\n     *\n     * @param b Right-hand side vector.\n     * @return the left-hand side vector.\n     ",
      "child_ranges": []
    }
  ]
}
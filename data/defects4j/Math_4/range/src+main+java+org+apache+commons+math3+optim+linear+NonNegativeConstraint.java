{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/linear/NonNegativeConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonNegativeConstraint",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 28,
      "end_line": 48,
      "comment": "\n * A constraint for a linear optimization problem indicating whether all\n * variables must be restricted to non-negative values.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "isRestricted"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Whether the variables are all positive. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.NonNegativeConstraint.NonNegativeConstraint(boolean)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * @param restricted If {@code true}, all the variables must be positive.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.NonNegativeConstraint.isRestrictedToNonNegative()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Indicates whether all the variables must be restricted to non-negative\n     * values.\n     *\n     * @return {@code true} if all the variables must be positive.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)"
      ]
    }
  ]
}
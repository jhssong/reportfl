{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/optimization/ConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceChecker",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 45,
      "comment": "\n * This interface specifies how to check if an optimization algorithm has\n * converged.\n * Deciding if convergence has been reached is a problem-dependent issue. The\n * user should provide a class implementing this interface to allow the\n * optimization algorithm to stop its search according to the problem at hand.\n *\n * @param \u003cPAIR\u003e Type of the (point, objective value) pair.\n *\n * @see org.apache.commons.math.optimization.SimpleScalarValueChecker\n * @see org.apache.commons.math.optimization.SimpleRealPointChecker\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.ConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Check if the optimization algorithm has converged.\n     *\n     * @param iteration Current iteration.\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm is considered to have converged.\n     ",
      "child_ranges": []
    }
  ]
}
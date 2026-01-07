{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/ConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceChecker",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 58,
      "comment": "\n * This interface specifies how to check if an optimization algorithm has\n * converged.\n * Deciding if convergence has been reached is a problem-dependent issue. The\n * user should provide a class implementing this interface to allow the\n * optimization algorithm to stop its search according to the problem at hand.\n *\n * @param \u003cPAIR\u003e Type of the (point, objective value) pair.\n *\n * @see org.apache.commons.math.optimization.SimpleScalarValueChecker\n * @see org.apache.commons.math.optimization.SimpleRealPointChecker\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.ConvergenceChecker.converged(int, PAIR...)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Check if the optimization algorithm has converged.\n     *\n     * @param iteration Current iteration.\n     * @param points Data used for checking the convergence.\n     * @return {@code true} if the algorithm is considered to have converged.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.ConvergenceChecker.getRelativeThreshold()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Get the relative tolerance.\n     *\n     * @return the relative threshold.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.ConvergenceChecker.getAbsoluteThreshold()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Get the absolute tolerance.\n     *\n     * @return the absolute threshold.\n     ",
      "child_ranges": []
    }
  ]
}
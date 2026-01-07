{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/ConvergenceChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergenceChecker",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 58,
      "comment": "\n * This interface specifies how to check if an optimization algorithm has\n * converged.\n * \u003cbr/\u003e\n * Deciding if convergence has been reached is a problem-dependent issue. The\n * user should provide a class implementing this interface to allow the\n * optimization algorithm to stop its search according to the problem at hand.\n * \u003cbr/\u003e\n * For convenience, three implementations that fit simple needs are already\n * provided: {@link SimpleValueChecker}, {@link SimpleVectorValueChecker} and\n * {@link SimplePointChecker}. The first two consider that convergence is\n * reached when the objective function value does not change much anymore, it\n * does not use the point set at all.\n * The third one considers that convergence is reached when the input point\n * set does not change much anymore, it does not use objective function value\n * at all.\n *\n * @param \u003cPAIR\u003e Type of the (point, objective value) pair.\n *\n * @see org.apache.commons.math3.optimization.SimplePointChecker\n * @see org.apache.commons.math3.optimization.SimpleValueChecker\n * @see org.apache.commons.math3.optimization.SimpleVectorValueChecker\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.ConvergenceChecker.converged(int, PAIR, PAIR)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Check if the optimization algorithm has converged.\n     *\n     * @param iteration Current iteration.\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm is considered to have converged.\n     ",
      "child_ranges": []
    }
  ]
}
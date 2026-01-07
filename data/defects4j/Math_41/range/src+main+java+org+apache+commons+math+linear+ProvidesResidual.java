{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/linear/ProvidesResidual.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProvidesResidual",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 36,
      "comment": "\n * This interface provides access to the current value of the residual of an\n * {@link IterativeLinearSolver}. It might be implemented by\n * {@link IterativeLinearSolverEvent}, for example.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ProvidesResidual.getResidual()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Returns the current value of the residual. This should be an\n     * unmodifiable view or a deep copy of the residual, in order not to\n     * compromise the subsequent iterations.\n     *\n     * @return the current value of the residual.\n     ",
      "child_ranges": []
    }
  ]
}
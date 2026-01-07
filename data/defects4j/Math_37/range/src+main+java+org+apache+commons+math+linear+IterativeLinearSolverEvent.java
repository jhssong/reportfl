{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/linear/IterativeLinearSolverEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLinearSolverEvent",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.util.IterationEvent"
      ],
      "begin_line": 28,
      "end_line": 63,
      "comment": "\n * This is the base class for all events occuring during the iterations of a\n * {@link IterativeLinearSolver}.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolverEvent.IterativeLinearSolverEvent(java.lang.Object)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param source The iterative algorithm on which the event initially\n     *        occurred.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolverEvent.getRightHandSideVector()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Returns the current right-hand side of the linear system to be solved.\n     * This method should return an unmodifiable view, or a deep copy of the\n     * actual right-hand side, in order not to compromise subsequent iterations\n     * of the source {@link IterativeLinearSolver}.\n     *\n     * @return The right-hand side vector, b.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolverEvent.getSolution()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Returns the current estimate of the solution to the linear system to be\n     * solved. This method should return an unmodifiable view, or a deep copy of\n     * the actual current solution, in order not to compromise subsequent\n     * iterations of the source {@link IterativeLinearSolver}.\n     *\n     * @return The solution, x.\n     ",
      "child_ranges": []
    }
  ]
}
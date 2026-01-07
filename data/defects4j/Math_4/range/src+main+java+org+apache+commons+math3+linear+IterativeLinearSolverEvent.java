{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/IterativeLinearSolverEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLinearSolverEvent",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.util.IterationEvent"
      ],
      "begin_line": 29,
      "end_line": 116,
      "comment": "\n * This is the base class for all events occuring during the iterations of a\n * {@link IterativeLinearSolver}.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolverEvent.IterativeLinearSolverEvent(java.lang.Object, int)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param source the iterative algorithm on which the event initially\n     * occurred\n     * @param iterations the number of iterations performed at the time\n     * {@code this} event is created\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolverEvent.getRightHandSideVector()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Returns the current right-hand side of the linear system to be solved.\n     * This method should return an unmodifiable view, or a deep copy of the\n     * actual right-hand side vector, in order not to compromise subsequent\n     * iterations of the source {@link IterativeLinearSolver}.\n     *\n     * @return the right-hand side vector, b\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolverEvent.getNormOfResidual()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the norm of the residual. The returned value is not required to\n     * be \u003cem\u003eexact\u003c/em\u003e. Instead, the norm of the so-called \u003cem\u003eupdated\u003c/em\u003e\n     * residual (if available) should be returned. For example, the\n     * {@link ConjugateGradient conjugate gradient} method computes a sequence\n     * of residuals, the norm of which is cheap to compute. However, due to\n     * accumulation of round-off errors, this residual might differ from the\n     * true residual after some iterations. See e.g. A. Greenbaum and\n     * Z. Strakos, \u003cem\u003ePredicting the Behavior of Finite Precision Lanzos and\n     * Conjugate Gradient Computations\u003c/em\u003e, Technical Report 538, Department of\n     * Computer Science, New York University, 1991 (available\n     * \u003ca href\u003d\"http://www.archive.org/details/predictingbehavi00gree\"\u003ehere\u003c/a\u003e).\n     *\n     * @return the norm of the residual, ||r||\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolverEvent.getResidual()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003e\n     * Returns the residual. This is an optional operation, as all iterative\n     * linear solvers do not provide cheap estimate of the updated residual\n     * vector, in which case\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ethis method should throw a\n     * {@link MathUnsupportedOperationException},\u003c/li\u003e\n     * \u003cli\u003e{@link #providesResidual()} returns {@code false}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * The default implementation throws a\n     * {@link MathUnsupportedOperationException}. If this method is overriden,\n     * then {@link #providesResidual()} should be overriden as well.\n     * \u003c/p\u003e\n     *\n     * @return the updated residual, r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolverEvent.getSolution()",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Returns the current estimate of the solution to the linear system to be\n     * solved. This method should return an unmodifiable view, or a deep copy of\n     * the actual current solution, in order not to compromise subsequent\n     * iterations of the source {@link IterativeLinearSolver}.\n     *\n     * @return the solution, x\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolverEvent.providesResidual()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns {@code true} if {@link #getResidual()} is supported. The default\n     * implementation returns {@code false}.\n     *\n     * @return {@code false} if {@link #getResidual()} throws a\n     * {@link MathUnsupportedOperationException}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 21)"
      ]
    }
  ]
}
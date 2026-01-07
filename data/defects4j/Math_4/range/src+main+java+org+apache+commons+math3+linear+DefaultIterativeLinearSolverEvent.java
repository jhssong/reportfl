{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/DefaultIterativeLinearSolverEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultIterativeLinearSolverEvent",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.IterativeLinearSolverEvent"
      ],
      "begin_line": 27,
      "end_line": 144,
      "comment": "\n * A default concrete implementation of the abstract class\n * {@link IterativeLinearSolverEvent}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The right-hand side vector. "
    },
    {
      "type": "field",
      "varNames": [
        "r"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The current estimate of the residual. "
    },
    {
      "type": "field",
      "varNames": [
        "rnorm"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The current estimate of the norm of the residual. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The current estimate of the solution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.DefaultIterativeLinearSolverEvent(java.lang.Object, int, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 63,
      "end_line": 71,
      "comment": "\n     * Creates a new instance of this class. This implementation does\n     * \u003cem\u003enot\u003c/em\u003e deep copy the specified vectors {@code x}, {@code b},\n     * {@code r}. Therefore the user must make sure that these vectors are\n     * either unmodifiable views or deep copies of the same vectors actually\n     * used by the {@code source}. Failure to do so may compromise subsequent\n     * iterations of the {@code source}. If the residual vector {@code r} is\n     * {@code null}, then {@link #getResidual()} throws a\n     * {@link MathUnsupportedOperationException}, and\n     * {@link #providesResidual()} returns {@code false}.\n     *\n     * @param source the iterative solver which fired this event\n     * @param iterations the number of iterations performed at the time\n     * {@code this} event is created\n     * @param x the current estimate of the solution\n     * @param b the right-hand side vector\n     * @param r the current estimate of the residual (can be {@code null})\n     * @param rnorm the norm of the current estimate of the residual\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 34)",
        "(line 67,col 9)-(line 67,col 19)",
        "(line 68,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 19)",
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.DefaultIterativeLinearSolverEvent(java.lang.Object, int, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n     * Creates a new instance of this class. This implementation does\n     * \u003cem\u003enot\u003c/em\u003e deep copy the specified vectors {@code x}, {@code b}.\n     * Therefore the user must make sure that these vectors are either\n     * unmodifiable views or deep copies of the same vectors actually used by\n     * the {@code source}. Failure to do so may compromise subsequent iterations\n     * of the {@code source}. Callling {@link #getResidual()} on instances\n     * returned by this constructor throws a\n     * {@link MathUnsupportedOperationException}, while\n     * {@link #providesResidual()} returns {@code false}.\n     *\n     * @param source the iterative solver which fired this event\n     * @param iterations the number of iterations performed at the time\n     * {@code this} event is created\n     * @param x the current estimate of the solution\n     * @param b the right-hand side vector\n     * @param rnorm the norm of the current estimate of the residual\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 34)",
        "(line 94,col 9)-(line 94,col 19)",
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.getNormOfResidual()",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.getResidual()",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This implementation throws an {@link MathUnsupportedOperationException}\n     * if no residual vector {@code r} was provided at construction time.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.getRightHandSideVector()",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.getSolution()",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent.providesResidual()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This implementation returns {@code true} if a non-{@code null} value was\n     * specified for the residual vector {@code r} at construction time.\n     *\n     * @return {@code true} if {@code r !\u003d null}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 25)"
      ]
    }
  ]
}
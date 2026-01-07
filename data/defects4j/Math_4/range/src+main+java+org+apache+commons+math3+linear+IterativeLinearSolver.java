{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/IterativeLinearSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLinearSolver",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 174,
      "comment": "\n * This abstract class defines an iterative solver for the linear system A\n * \u0026middot; x \u003d b. In what follows, the \u003cem\u003eresidual\u003c/em\u003e r is defined as r \u003d b\n * - A \u0026middot; x, where A is the linear operator of the linear system, b is the\n * right-hand side vector, and x the current estimate of the solution.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "manager"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The object in charge of managing the iterations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.IterativeLinearSolver(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a new instance of this class, with default iteration manager.\n     *\n     * @param maxIterations the maximum number of iterations\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.IterativeLinearSolver(org.apache.commons.math3.util.IterationManager)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Creates a new instance of this class, with custom iteration manager.\n     *\n     * @param manager the custom iteration manager\n     * @throws NullArgumentException if {@code manager} is {@code null}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 40)",
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.checkParameters(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 74,
      "end_line": 93,
      "comment": "\n     * Performs all dimension checks on the parameters of\n     * {@link #solve(RealLinearOperator, RealVector, RealVector) solve} and\n     * {@link #solveInPlace(RealLinearOperator, RealVector, RealVector) solveInPlace},\n     * and throws an exception if one of the checks fails.\n     *\n     * @param a the linear operator A of the system\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} is not square\n     * @throws DimensionMismatchException if {@code b} or {@code x0} have\n     * dimensions inconsistent with {@code a}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 34)",
        "(line 79,col 9)-(line 79,col 34)",
        "(line 80,col 9)-(line 80,col 35)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.getIterationManager()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns the iteration manager attached to this solver.\n     *\n     * @return the manager\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a the linear operator A of the system\n     * @param b the right-hand side vector\n     * @return a new vector containing the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} is not square\n     * @throws DimensionMismatchException if {@code b} has dimensions\n     * inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 73)",
        "(line 125,col 9)-(line 125,col 18)",
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a the linear operator A of the system\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @return a new vector containing the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} is not square\n     * @throws DimensionMismatchException if {@code b} or {@code x0} have\n     * dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.IterativeLinearSolver.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place (initial guess is modified).\n     *\n     * @param a the linear operator A of the system\n     * @param b the right-hand side vector\n     * @param x0 initial guess of the solution\n     * @return a reference to {@code x0} (shallow copy) updated with the\n     * solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} is not square\n     * @throws DimensionMismatchException if {@code b} or {@code x0} have\n     * dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     ",
      "child_ranges": []
    }
  ]
}
{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/linear/PreconditionedIterativeLinearSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PreconditionedIterativeLinearSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.IterativeLinearSolver"
      ],
      "begin_line": 43,
      "end_line": 211,
      "comment": "\n * \u003cp\u003e\n * This abstract class defines preconditioned iterative solvers. When A is\n * ill-conditioned, instead of solving system A \u0026middot; x \u003d b directly, it is\n * preferable to solve M\u003csup\u003e-1\u003c/sup\u003e \u0026middot; A \u0026middot; x \u003d M\u003csup\u003e-1\u003c/sup\u003e\n * \u0026middot; b, where M approximates in some way A, while remaining comparatively\n * easier to invert. M (not M\u003csup\u003e-1\u003c/sup\u003e!) is called the\n * \u003cem\u003epreconditionner\u003c/em\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Concrete implementations of this abstract class must be provided with\n * M\u003csup\u003e-1\u003c/sup\u003e, the inverse of the preconditioner, as a\n * {@link RealLinearOperator}.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.PreconditionedIterativeLinearSolver(int)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates a new instance of this class, with default iteration manager.\n     *\n     * @param maxIterations the maximum number of iterations\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.PreconditionedIterativeLinearSolver(org.apache.commons.math.util.IterationManager)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Creates a new instance of this class, with custom iteration manager.\n     *\n     * @param manager the custom iteration manager\n     * @throws NullArgumentException if {@code manager} is {@code null}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 86,
      "end_line": 92,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a the linear operator A of the system\n     * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n     * (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @return a new vector containing the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code minv} is not\n     * square\n     * @throws DimensionMismatchException if {@code minv}, {@code b} or\n     * {@code x0} have dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 35)",
        "(line 91,col 9)-(line 91,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 95,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 34)",
        "(line 100,col 9)-(line 100,col 73)",
        "(line 101,col 9)-(line 101,col 18)",
        "(line 102,col 9)-(line 102,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 106,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.checkParameters(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 133,
      "end_line": 148,
      "comment": "\n     * Performs all dimension checks on the parameters of\n     * {@link #solve(RealLinearOperator, RealLinearOperator, RealVector, RealVector) solve}\n     * and\n     * {@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector) solveInPlace},\n     * and throws an exception if one of the checks fails.\n     *\n     * @param a the linear operator A of the system\n     * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n     * (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code minv} is not\n     * square\n     * @throws DimensionMismatchException if {@code minv}, {@code b} or\n     * {@code x0} have dimensions inconsistent with {@code a}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 169,
      "end_line": 175,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a the linear operator A of the system\n     * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n     * (can be {@code null})\n     * @param b the right-hand side vector\n     * @return a new vector containing the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code minv} is not\n     * square\n     * @throws DimensionMismatchException if {@code minv} or {@code b} have\n     * dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 73)",
        "(line 174,col 9)-(line 174,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place (initial guess is modified).\n     *\n     * @param a the linear operator A of the system\n     * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n     * (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @return a reference to {@code x0} (shallow copy) updated with the\n     * solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code minv} is not\n     * square\n     * @throws DimensionMismatchException if {@code minv}, {@code b} or\n     * {@code x0} have dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 204,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 44)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/PreconditionedIterativeLinearSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PreconditionedIterativeLinearSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.IterativeLinearSolver"
      ],
      "begin_line": 51,
      "end_line": 215,
      "comment": "\n * \u003cp\u003e\n * This abstract class defines preconditioned iterative solvers. When A is\n * ill-conditioned, instead of solving system A \u0026middot; x \u003d b directly, it is\n * preferable to solve either\n * \u003ccenter\u003e\n * (M \u0026middot; A) \u0026middot; x \u003d M \u0026middot; b\n * \u003c/center\u003e\n * (left preconditioning), or\n * \u003ccenter\u003e\n * (A \u0026middot; M) \u0026middot; y \u003d b, \u0026nbsp;\u0026nbsp;\u0026nbsp;\u0026nbsp;followed by\n * M \u0026middot; y \u003d x\n * \u003c/center\u003e\n * (right preconditioning), where M approximates in some way A\u003csup\u003e-1\u003c/sup\u003e,\n * while matrix-vector products of the type M \u0026middot; y remain comparatively\n * easy to compute. In this library, M (not M\u003csup\u003e-1\u003c/sup\u003e!) is called the\n * \u003cem\u003epreconditionner\u003c/em\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Concrete implementations of this abstract class must be provided with the\n * preconditioner M, as a {@link RealLinearOperator}.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.PreconditionedIterativeLinearSolver(int)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Creates a new instance of this class, with default iteration manager.\n     *\n     * @param maxIterations the maximum number of iterations\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.PreconditionedIterativeLinearSolver(org.apache.commons.math3.util.IterationManager)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Creates a new instance of this class, with custom iteration manager.\n     *\n     * @param manager the custom iteration manager\n     * @throws NullArgumentException if {@code manager} is {@code null}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a the linear operator A of the system\n     * @param m the preconditioner, M (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @return a new vector containing the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square\n     * @throws DimensionMismatchException if {@code m}, {@code b} or\n     * {@code x0} have dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 35)",
        "(line 98,col 9)-(line 98,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 102,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 34)",
        "(line 107,col 9)-(line 107,col 73)",
        "(line 108,col 9)-(line 108,col 18)",
        "(line 109,col 9)-(line 109,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 113,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.checkParameters(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 139,
      "end_line": 154,
      "comment": "\n     * Performs all dimension checks on the parameters of\n     * {@link #solve(RealLinearOperator, RealLinearOperator, RealVector, RealVector) solve}\n     * and\n     * {@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector) solveInPlace},\n     * and throws an exception if one of the checks fails.\n     *\n     * @param a the linear operator A of the system\n     * @param m the preconditioner, M (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square\n     * @throws DimensionMismatchException if {@code m}, {@code b} or\n     * {@code x0} have dimensions inconsistent with {@code a}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 34)",
        "(line 144,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 174,
      "end_line": 180,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a the linear operator A of the system\n     * @param m the preconditioner, M (can be {@code null})\n     * @param b the right-hand side vector\n     * @return a new vector containing the solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square\n     * @throws DimensionMismatchException if {@code m} or {@code b} have\n     * dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 178,col 73)",
        "(line 179,col 9)-(line 179,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place (initial guess is modified).\n     *\n     * @param a the linear operator A of the system\n     * @param m the preconditioner, M (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x0 the initial guess of the solution\n     * @return a reference to {@code x0} (shallow copy) updated with the\n     * solution\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square\n     * @throws DimensionMismatchException if {@code m}, {@code b} or\n     * {@code x0} have dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 208,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 44)"
      ]
    }
  ]
}
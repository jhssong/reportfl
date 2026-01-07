{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/linear/PreconditionedIterativeLinearSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PreconditionedIterativeLinearSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.IterativeLinearSolver"
      ],
      "begin_line": 36,
      "end_line": 202,
      "comment": "\n * This abstract class defines preconditioned iterative solvers. When A is\n * ill-conditioned, instead of solving system A \u0026middot; x \u003d b directly, it is\n * preferable to solve M\u003csup\u003e-1\u003c/sup\u003e \u0026middot; A \u0026middot; x \u003d M\u003csup\u003e-1\u003c/sup\u003e\n * \u0026middot; b, where M approximates in some way A, while remaining comparatively\n * easier to invert. M (not M\u003csup\u003e-1\u003c/sup\u003e!) is called the\n * \u003cem\u003epreconditionner\u003c/em\u003e.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.PreconditionedIterativeLinearSolver(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a new instance of this class, with default iteration manager.\n     *\n     * @param maxIterations Maximum number of iterations.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.PreconditionedIterativeLinearSolver(org.apache.commons.math.util.IterationManager)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Creates a new instance of this class, with custom iteration manager.\n     *\n     * @param manager Custom iteration manager.\n     * @throws NullArgumentException if {@code manager} is {@code null}.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param x0 Initial guess of the solution.\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x0}\n     * have dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)",
        "(line 83,col 9)-(line 83,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 87,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 34)",
        "(line 92,col 9)-(line 92,col 73)",
        "(line 93,col 9)-(line 93,col 18)",
        "(line 94,col 9)-(line 94,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 98,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 35)",
        "(line 104,col 9)-(line 104,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.checkParameters(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 124,
      "end_line": 141,
      "comment": "\n     * Performs all dimension checks on the parameters of\n     * {@link #solve(RealLinearOperator, InvertibleRealLinearOperator, RealVector, RealVector) solve}\n     * and\n     * {@link #solveInPlace(RealLinearOperator, InvertibleRealLinearOperator, RealVector, RealVector) solveInPlace}\n     * , and throws an exception if one of the checks fails.\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param x0 Initial guess of the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x0}\n     * have dimensions inconsistent with {@code a}.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m} or {@code b} have\n     * dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 34)",
        "(line 165,col 9)-(line 165,col 73)",
        "(line 166,col 9)-(line 166,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place (initial guess is modified).\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param x0 Initial guess of the solution.\n     * @return A reference to {@code x0} (shallow copy) updated with the\n     * solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x0}\n     * have dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 195,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 44)"
      ]
    }
  ]
}
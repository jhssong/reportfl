{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/linear/IterativeLinearSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterativeLinearSolver",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 173,
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
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.IterativeLinearSolver(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a new instance of this class, with default iteration manager.\n     *\n     * @param maxIterations Maximum number of iterations.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.IterativeLinearSolver(org.apache.commons.math.util.IterationManager)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Creates a new instance of this class, with custom iteration manager.\n     *\n     * @param manager Custom iteration manager.\n     * @throws NullArgumentException if {@code manager} is {@code null}.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 40)",
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.checkParameters(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 74,
      "end_line": 94,
      "comment": "\n     * Performs all dimension checks on the parameters of\n     * {@link #solve(RealLinearOperator, RealVector, RealVector) solve} and\n     * {@link #solveInPlace(RealLinearOperator, RealVector, RealVector) solveInPlace},\n     * and throws an exception if one of the checks fails.\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @param x0 Initial guess of the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} or {@code x0} have\n     * dimensions inconsistent with {@code a}.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 34)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 35)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.getIterationManager()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the {@link IterationManager} attached to this solver.\n     *\n     * @return the manager.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} has dimensions\n     * inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 73)",
        "(line 125,col 9)-(line 125,col 18)",
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @param x0 Initial guess of the solution.\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} or {@code x0} have\n     * dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.IterativeLinearSolver.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place (initial guess is modified).\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @param x0 Initial guess of the solution.\n     * @return A reference to {@code x0} (shallow copy) updated with the\n     * solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} or {@code x0} have\n     * dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": []
    }
  ]
}
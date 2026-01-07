{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/DecompositionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DecompositionSolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 84,
      "comment": "\n * Interface handling decomposition algorithms that can solve A \u0026times; X \u003d B.\n * \u003cp\u003eDecomposition algorithms decompose an A matrix has a product of several specific\n * matrices from which they can solve A \u0026times; X \u003d B in least squares sense: they find X\n * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n * \u003cp\u003eSome solvers like {@link LUDecomposition} can only find the solution for\n * square matrices and when the solution is an exact linear solution, i.e. when\n * ||A \u0026times; X - B|| is exactly 0. Other solvers can also find solutions\n * with non-square matrix A and with non-null minimal norm. If an exact linear\n * solution exists it is also the minimal norm solution.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(double[])",
      "begin_line": 46,
      "end_line": 47,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n     * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n     * decomposition algorithm.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 57,
      "end_line": 58,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n     * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n     * decomposition algorithm.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 68,
      "end_line": 69,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n     * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n     * decomposition algorithm.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.isNonSingular()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Check if the decomposed matrix is non-singular.\n     * @return true if the decomposed matrix is non-singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.getInverse()",
      "begin_line": 81,
      "end_line": 82,
      "comment": " Get the inverse (or pseudo-inverse) of the decomposed matrix.\n     * @return inverse matrix\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    }
  ]
}
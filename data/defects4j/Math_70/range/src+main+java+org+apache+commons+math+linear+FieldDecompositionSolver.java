{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/FieldDecompositionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldDecompositionSolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 86,
      "comment": "\n * Interface handling decomposition algorithms that can solve A \u0026times; X \u003d B.\n * \u003cp\u003eDecomposition algorithms decompose an A matrix has a product of several specific\n * matrices from which they can solve A \u0026times; X \u003d B in least squares sense: they find X\n * such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n * \u003cp\u003eSome solvers like {@link LUDecomposition} can only find the solution for\n * square matrices and when the solution is an exact linear solution, i.e. when\n * ||A \u0026times; X - B|| is exactly 0. Other solvers can also find solutions\n * with non-square matrix A and with non-null minimal norm. If an exact linear\n * solution exists it is also the minimal norm solution.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldDecompositionSolver.solve(T[])",
      "begin_line": 48,
      "end_line": 49,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n     * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n     * decomposition algorithm.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldDecompositionSolver.solve(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 59,
      "end_line": 60,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n     * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n     * decomposition algorithm.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldDecompositionSolver.solve(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 70,
      "end_line": 71,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n     * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n     * decomposition algorithm.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldDecompositionSolver.isNonSingular()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Check if the decomposed matrix is non-singular.\n     * @return true if the decomposed matrix is non-singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldDecompositionSolver.getInverse()",
      "begin_line": 83,
      "end_line": 84,
      "comment": " Get the inverse (or pseudo-inverse) of the decomposed matrix.\n     * @return inverse matrix\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    }
  ]
}
{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/DecompositionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DecompositionSolver",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 89,
      "comment": "\n * A base interface to decomposition algorithms that can solve A \u0026times; X \u003d B.\n * \u003cp\u003eThis interface is the common base of decomposition algorithms like\n * {@link QRDecomposition}, {@link LUDecomposition} or {@link\n * SingularValueDecomposition}. All these algorithms decompose an A matrix has a\n * product of several specific matrices from which they can solve A \u0026times; X \u003d B\n * in least squares sense: they find X such that ||A \u0026times; X - B|| is minimal.\u003c/p\u003e\n * \u003cp\u003eSome solvers like {@link LUDecomposition} can only find the solution for\n * square matrices and when the solution is an exact linear solution, i.e. when\n * ||A \u0026times; X - B|| is exactly 0. Other solvers can also find solutions\n * with non-square matrix A and with non-null minimal norm. If an exact linear\n * solution exists it is also the minimal norm solution.\u003c/p\u003e\n *   \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.decompose(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Decompose a matrix.\n     * @param matrix\n     * @exception InvalidMatrixException if matrix does not fulfill\n     * the decomposition requirements (for example non-square matrix\n     * for {@link LUDecomposition})\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(double[])",
      "begin_line": 60,
      "end_line": 61,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It \u003cstrong\u003emust\u003c/strong\u003e have\n     * already been provided by a previous call to {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n     * has not been called\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 73,
      "end_line": 74,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It \u003cstrong\u003emust\u003c/strong\u003e have\n     * already been provided by a previous call to {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n     * has not been called\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 86,
      "end_line": 87,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It \u003cstrong\u003emust\u003c/strong\u003e have\n     * already been provided by a previous call to {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n     * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n     * has not been called\n     * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n     * @exception InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    }
  ]
}
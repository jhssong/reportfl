{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/DecompositionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DecompositionSolver",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 69,
      "comment": "\n * A base interface to decomposition algorithms that can solve A \u0026times; X \u003d B.\n * \u003cp\u003eThis interface is the common base of decomposition algorithms like\n * {@link QRDecomposition} or {@link LUDecomposition}. All these algorithms\n * decompose an A matrix has a product of several specific matrices from\n * which they can solve A \u0026times; X \u003d B.\u003c/p\u003e\n * \u003cp\u003eDepending on the solver, the solution is either an exact linear solution\n * or a least squares solution. When an exact linear solution exist, both the\n * linear and the least squares solution are equal. When no exact linear solution\n * exist, a least square solution gives an X which such that A \u0026times; X is the\n * closest possible to B.\u003c/p\u003e\n *   \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(double[])",
      "begin_line": 46,
      "end_line": 47,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 56,
      "end_line": 57,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X that minimizes the two norm of A \u0026times; X - B\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DecompositionSolver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 66,
      "end_line": 67,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": []
    }
  ]
}
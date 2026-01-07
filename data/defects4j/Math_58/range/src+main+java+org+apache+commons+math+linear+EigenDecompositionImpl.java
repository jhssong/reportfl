{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 56,
      "end_line": 594,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003e\n * The eigen decomposition of matrix A is a set of two matrices: V and D such\n * that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m matrices.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \u0027The Implicit QL Algorithm\u0027 in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     *\n     * @param matrix Matrix to decompose. It \u003cem\u003emust\u003c/em\u003e be symmetric.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 118,
      "end_line": 129,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric triadiagonal form\n     * @param secondary Secondary of the tridiagonal form\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 43)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 46)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 141,
      "end_line": 160,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 56)",
        "(line 145,col 9)-(line 145,col 67)",
        "(line 146,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 163,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 178,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 187,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 199,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 203,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 208,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 213,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 218,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 223,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 231,
      "end_line": 237,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 31)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 240,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 245,
      "end_line": 426,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 265,
      "end_line": 271,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues\n         *            real parts of the eigenvalues\n         * @param imagEigenvalues\n         *            imaginary parts of the eigenvalues\n         * @param eigenvectors\n         *            eigenvectors\n         ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 51)",
        "(line 269,col 13)-(line 269,col 51)",
        "(line 270,col 13)-(line 270,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 284,
      "end_line": 307,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 286,col 13)-(line 288,col 13)",
        "(line 290,col 13)-(line 290,col 49)",
        "(line 291,col 13)-(line 293,col 13)",
        "(line 295,col 13)-(line 295,col 46)",
        "(line 296,col 13)-(line 303,col 13)",
        "(line 305,col 13)-(line 305,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 320,
      "end_line": 341,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 321,col 13)-(line 323,col 13)",
        "(line 325,col 13)-(line 325,col 49)",
        "(line 326,col 13)-(line 328,col 13)",
        "(line 330,col 13)-(line 330,col 46)",
        "(line 331,col 13)-(line 338,col 13)",
        "(line 340,col 13)-(line 340,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 354,
      "end_line": 384,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a Matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 356,col 13)-(line 358,col 13)",
        "(line 360,col 13)-(line 360,col 49)",
        "(line 361,col 13)-(line 363,col 13)",
        "(line 365,col 13)-(line 365,col 53)",
        "(line 366,col 13)-(line 366,col 55)",
        "(line 367,col 13)-(line 380,col 13)",
        "(line 382,col 13)-(line 382,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 390,
      "end_line": 397,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 395,col 13)",
        "(line 396,col 13)-(line 396,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 405,
      "end_line": 425,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 406,col 13)-(line 408,col 13)",
        "(line 410,col 13)-(line 410,col 49)",
        "(line 411,col 13)-(line 411,col 56)",
        "(line 413,col 13)-(line 423,col 13)",
        "(line 424,col 13)-(line 424,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 433,
      "end_line": 438,
      "comment": "\n     * Transform matrix to tridiagonal.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 57)",
        "(line 436,col 9)-(line 436,col 48)",
        "(line 437,col 9)-(line 437,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(double[][])",
      "begin_line": 446,
      "end_line": 593,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tri-diagonal form.\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 48)",
        "(line 448,col 9)-(line 448,col 34)",
        "(line 449,col 9)-(line 449,col 40)",
        "(line 450,col 9)-(line 450,col 40)",
        "(line 451,col 9)-(line 451,col 35)",
        "(line 452,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 45)",
        "(line 457,col 9)-(line 457,col 23)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 568,col 9)",
        "(line 571,col 9)-(line 571,col 29)",
        "(line 572,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 46)",
        "(line 586,col 9)-(line 586,col 37)",
        "(line 587,col 9)-(line 592,col 9)"
      ]
    }
  ]
}
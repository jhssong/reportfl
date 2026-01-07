{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 54,
      "end_line": 614,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003e\n * The eigen decomposition of matrix A is a set of two matrices: V and D such\n * that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m matrices.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \u0027The Implicit QL Algorithm\u0027 in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     *\n     * @param matrix Matrix to decompose. It \u003cem\u003emust\u003c/em\u003e be symmetric.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 116,
      "end_line": 127,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric triadiagonal form\n     * @param secondary Secondary of the tridiagonal form\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 38)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 46)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 139,
      "end_line": 158,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 56)",
        "(line 143,col 9)-(line 143,col 67)",
        "(line 144,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 161,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 176,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 185,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 201,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 206,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 216,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 221,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 229,
      "end_line": 235,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 31)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 243,
      "end_line": 445,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues\n         *            real parts of the eigenvalues\n         * @param imagEigenvalues\n         *            imaginary parts of the eigenvalues\n         * @param eigenvectors\n         *            eigenvectors\n         ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 51)",
        "(line 267,col 13)-(line 267,col 51)",
        "(line 268,col 13)-(line 268,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 282,
      "end_line": 305,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 284,col 13)-(line 286,col 13)",
        "(line 288,col 13)-(line 288,col 49)",
        "(line 289,col 13)-(line 291,col 13)",
        "(line 293,col 13)-(line 293,col 46)",
        "(line 294,col 13)-(line 301,col 13)",
        "(line 303,col 13)-(line 303,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 318,
      "end_line": 339,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 319,col 13)-(line 321,col 13)",
        "(line 323,col 13)-(line 323,col 49)",
        "(line 324,col 13)-(line 326,col 13)",
        "(line 328,col 13)-(line 328,col 46)",
        "(line 329,col 13)-(line 336,col 13)",
        "(line 338,col 13)-(line 338,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[][], boolean)",
      "begin_line": 353,
      "end_line": 393,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for matrices A.\n         * \u003cp\u003eThe A matrix is implicit, it is provided by the underlying\n         * decomposition algorithm.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @param reuseB if true, the b array will be reused and returned,\n         * instead of being copied\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         * @throws SingularMatrixException\n         * if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 355,col 13)-(line 357,col 13)",
        "(line 359,col 13)-(line 359,col 49)",
        "(line 360,col 13)-(line 362,col 13)",
        "(line 364,col 13)-(line 364,col 42)",
        "(line 365,col 13)-(line 365,col 32)",
        "(line 366,col 13)-(line 370,col 13)",
        "(line 371,col 13)-(line 371,col 50)",
        "(line 372,col 13)-(line 389,col 13)",
        "(line 391,col 13)-(line 391,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[][])",
      "begin_line": 396,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 401,
      "end_line": 403,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 409,
      "end_line": 416,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 410,col 13)-(line 414,col 13)",
        "(line 415,col 13)-(line 415,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 424,
      "end_line": 444,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 425,col 13)-(line 427,col 13)",
        "(line 429,col 13)-(line 429,col 49)",
        "(line 430,col 13)-(line 430,col 56)",
        "(line 432,col 13)-(line 442,col 13)",
        "(line 443,col 13)-(line 443,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 452,
      "end_line": 457,
      "comment": "\n     * Transform matrix to tridiagonal.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 57)",
        "(line 455,col 9)-(line 455,col 48)",
        "(line 456,col 9)-(line 456,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(double[][])",
      "begin_line": 465,
      "end_line": 613,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tri-diagonal form.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 48)",
        "(line 467,col 9)-(line 467,col 34)",
        "(line 468,col 9)-(line 468,col 40)",
        "(line 469,col 9)-(line 469,col 40)",
        "(line 470,col 9)-(line 470,col 35)",
        "(line 471,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 45)",
        "(line 476,col 9)-(line 476,col 23)",
        "(line 479,col 9)-(line 479,col 36)",
        "(line 480,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 567,col 9)",
        "(line 570,col 9)-(line 588,col 9)",
        "(line 591,col 9)-(line 591,col 29)",
        "(line 592,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 46)",
        "(line 606,col 9)-(line 606,col 37)",
        "(line 607,col 9)-(line 612,col 9)"
      ]
    }
  ]
}
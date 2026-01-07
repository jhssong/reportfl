{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 54,
      "end_line": 619,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003e\n * The eigen decomposition of matrix A is a set of two matrices: V and D such\n * that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m matrices.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \u0027The Implicit QL Algorithm\u0027 in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance dummy parameter, present for backward compatibility only.\n     * @exception InvalidMatrixException (wrapping a\n     * {@link org.apache.commons.math.ConvergenceException} if algorithm\n     * fails to converge\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 121,
      "end_line": 133,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     * @param main Main diagonal of the symmetric triadiagonal form\n     * @param secondary Secondary of the tridiagonal form\n     * @param splitTolerance dummy parameter, present for backward compatibility only.\n     * @exception InvalidMatrixException (wrapping a\n     * {@link org.apache.commons.math.ConvergenceException} if algorithm\n     * fails to converge\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 125,col 43)",
        "(line 126,col 9)-(line 126,col 30)",
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 141,
      "end_line": 156,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix\n     *            matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 50)",
        "(line 143,col 9)-(line 143,col 56)",
        "(line 144,col 9)-(line 144,col 67)",
        "(line 145,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 159,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 174,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 183,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 195,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 199,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 204,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 215,
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
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 230,
      "end_line": 236,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 31)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 239,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 244,
      "end_line": 450,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 264,
      "end_line": 270,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues\n         *            real parts of the eigenvalues\n         * @param imagEigenvalues\n         *            imaginary parts of the eigenvalues\n         * @param eigenvectors\n         *            eigenvectors\n         ",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 51)",
        "(line 268,col 13)-(line 268,col 51)",
        "(line 269,col 13)-(line 269,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 286,
      "end_line": 312,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 289,col 13)-(line 291,col 13)",
        "(line 293,col 13)-(line 293,col 49)",
        "(line 294,col 13)-(line 298,col 13)",
        "(line 300,col 13)-(line 300,col 46)",
        "(line 301,col 13)-(line 308,col 13)",
        "(line 310,col 13)-(line 310,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 328,
      "end_line": 354,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 333,col 13)",
        "(line 335,col 13)-(line 335,col 49)",
        "(line 336,col 13)-(line 340,col 13)",
        "(line 342,col 13)-(line 342,col 46)",
        "(line 343,col 13)-(line 350,col 13)",
        "(line 352,col 13)-(line 352,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 370,
      "end_line": 405,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 373,col 13)-(line 375,col 13)",
        "(line 377,col 13)-(line 377,col 49)",
        "(line 378,col 13)-(line 384,col 13)",
        "(line 386,col 13)-(line 386,col 53)",
        "(line 387,col 13)-(line 387,col 55)",
        "(line 388,col 13)-(line 401,col 13)",
        "(line 403,col 13)-(line 403,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 411,
      "end_line": 418,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 412,col 13)-(line 416,col 13)",
        "(line 417,col 13)-(line 417,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 426,
      "end_line": 448,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException\n         *             if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 430,col 13)",
        "(line 432,col 13)-(line 432,col 49)",
        "(line 433,col 13)-(line 433,col 56)",
        "(line 435,col 13)-(line 445,col 13)",
        "(line 446,col 13)-(line 446,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 457,
      "end_line": 464,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix\n     *            matrix to transform\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 57)",
        "(line 461,col 9)-(line 461,col 48)",
        "(line 462,col 9)-(line 462,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(double[][])",
      "begin_line": 471,
      "end_line": 618,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     * @param householderMatrix Householder matrix of the transformation\n     *  to tri-diagonal form.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 48)",
        "(line 474,col 9)-(line 474,col 34)",
        "(line 475,col 9)-(line 475,col 40)",
        "(line 476,col 9)-(line 476,col 40)",
        "(line 477,col 9)-(line 477,col 35)",
        "(line 478,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 45)",
        "(line 483,col 9)-(line 483,col 23)",
        "(line 486,col 9)-(line 486,col 36)",
        "(line 487,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 505,col 9)",
        "(line 507,col 9)-(line 572,col 9)",
        "(line 575,col 9)-(line 593,col 9)",
        "(line 596,col 9)-(line 596,col 29)",
        "(line 597,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 46)",
        "(line 611,col 9)-(line 611,col 37)",
        "(line 612,col 9)-(line 617,col 9)"
      ]
    }
  ]
}
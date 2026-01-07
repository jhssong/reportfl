{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 52,
      "end_line": 617,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003e\n * The eigen decomposition of matrix A is a set of two matrices: V and D such\n * that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m matrices.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \u0027The Implicit QL Algorithm\u0027 in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 95,
      "end_line": 107,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance dummy parameter, present for backward compatibility only.\n     * @exception InvalidMatrixException (wrapping a\n     * {@link org.apache.commons.math.ConvergenceException} if algorithm\n     * fails to converge\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 119,
      "end_line": 131,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     * @param main Main diagonal of the symmetric triadiagonal form\n     * @param secondary Secondary of the tridiagonal form\n     * @param splitTolerance dummy parameter, present for backward compatibility only.\n     * @exception InvalidMatrixException (wrapping a\n     * {@link org.apache.commons.math.ConvergenceException} if algorithm\n     * fails to converge\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 43)",
        "(line 124,col 9)-(line 124,col 30)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 46)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 139,
      "end_line": 154,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix\n     *            matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 141,col 56)",
        "(line 142,col 9)-(line 142,col 67)",
        "(line 143,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 157,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 172,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 181,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 197,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 202,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 213,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 219,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 31)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 237,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 242,
      "end_line": 448,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 262,
      "end_line": 268,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues\n         *            real parts of the eigenvalues\n         * @param imagEigenvalues\n         *            imaginary parts of the eigenvalues\n         * @param eigenvectors\n         *            eigenvectors\n         ",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 51)",
        "(line 266,col 13)-(line 266,col 51)",
        "(line 267,col 13)-(line 267,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 284,
      "end_line": 310,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 287,col 13)-(line 289,col 13)",
        "(line 291,col 13)-(line 291,col 49)",
        "(line 292,col 13)-(line 296,col 13)",
        "(line 298,col 13)-(line 298,col 46)",
        "(line 299,col 13)-(line 306,col 13)",
        "(line 308,col 13)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 326,
      "end_line": 352,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 329,col 13)-(line 331,col 13)",
        "(line 333,col 13)-(line 333,col 49)",
        "(line 334,col 13)-(line 338,col 13)",
        "(line 340,col 13)-(line 340,col 46)",
        "(line 341,col 13)-(line 348,col 13)",
        "(line 350,col 13)-(line 350,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 368,
      "end_line": 403,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 371,col 13)-(line 373,col 13)",
        "(line 375,col 13)-(line 375,col 49)",
        "(line 376,col 13)-(line 382,col 13)",
        "(line 384,col 13)-(line 384,col 53)",
        "(line 385,col 13)-(line 385,col 55)",
        "(line 386,col 13)-(line 399,col 13)",
        "(line 401,col 13)-(line 401,col 52)"
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
      "end_line": 446,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException\n         *             if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 426,col 13)-(line 428,col 13)",
        "(line 430,col 13)-(line 430,col 49)",
        "(line 431,col 13)-(line 431,col 56)",
        "(line 433,col 13)-(line 443,col 13)",
        "(line 444,col 13)-(line 444,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 455,
      "end_line": 462,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix\n     *            matrix to transform\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 57)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(double[][])",
      "begin_line": 469,
      "end_line": 616,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     * @param householderMatrix Householder matrix of the transformation\n     *  to tri-diagonal form.\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 48)",
        "(line 472,col 9)-(line 472,col 34)",
        "(line 473,col 9)-(line 473,col 40)",
        "(line 474,col 9)-(line 474,col 40)",
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 45)",
        "(line 481,col 9)-(line 481,col 23)",
        "(line 484,col 9)-(line 484,col 36)",
        "(line 485,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 570,col 9)",
        "(line 573,col 9)-(line 591,col 9)",
        "(line 594,col 9)-(line 594,col 29)",
        "(line 595,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 46)",
        "(line 609,col 9)-(line 609,col 37)",
        "(line 610,col 9)-(line 615,col 9)"
      ]
    }
  ]
}
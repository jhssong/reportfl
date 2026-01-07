{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 53,
      "end_line": 618,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003e\n * The eigen decomposition of matrix A is a set of two matrices: V and D such\n * that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m matrices.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \u0027The Implicit QL Algorithm\u0027 in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 96,
      "end_line": 108,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance dummy parameter, present for backward compatibility only.\n     * @exception InvalidMatrixException (wrapping a\n     * {@link org.apache.commons.math.ConvergenceException} if algorithm\n     * fails to converge\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 120,
      "end_line": 132,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     * @param main Main diagonal of the symmetric triadiagonal form\n     * @param secondary Secondary of the tridiagonal form\n     * @param splitTolerance dummy parameter, present for backward compatibility only.\n     * @exception InvalidMatrixException (wrapping a\n     * {@link org.apache.commons.math.ConvergenceException} if algorithm\n     * fails to converge\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 38)",
        "(line 124,col 9)-(line 124,col 43)",
        "(line 125,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 140,
      "end_line": 155,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix\n     *            matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 56)",
        "(line 143,col 9)-(line 143,col 67)",
        "(line 144,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 158,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 173,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 182,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 191,col 9)",
        "(line 194,col 9)-(line 194,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 198,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 203,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 214,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 220,
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
      "end_line": 449,
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
      "begin_line": 285,
      "end_line": 311,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 288,col 13)-(line 290,col 13)",
        "(line 292,col 13)-(line 292,col 49)",
        "(line 293,col 13)-(line 297,col 13)",
        "(line 299,col 13)-(line 299,col 46)",
        "(line 300,col 13)-(line 307,col 13)",
        "(line 309,col 13)-(line 309,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 327,
      "end_line": 353,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 332,col 13)",
        "(line 334,col 13)-(line 334,col 49)",
        "(line 335,col 13)-(line 339,col 13)",
        "(line 341,col 13)-(line 341,col 46)",
        "(line 342,col 13)-(line 349,col 13)",
        "(line 351,col 13)-(line 351,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 369,
      "end_line": 404,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b\n         *            right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException\n         *                if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException\n         *                if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 372,col 13)-(line 374,col 13)",
        "(line 376,col 13)-(line 376,col 49)",
        "(line 377,col 13)-(line 383,col 13)",
        "(line 385,col 13)-(line 385,col 53)",
        "(line 386,col 13)-(line 386,col 55)",
        "(line 387,col 13)-(line 400,col 13)",
        "(line 402,col 13)-(line 402,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 410,
      "end_line": 417,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 411,col 13)-(line 415,col 13)",
        "(line 416,col 13)-(line 416,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 425,
      "end_line": 447,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException\n         *             if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 427,col 13)-(line 429,col 13)",
        "(line 431,col 13)-(line 431,col 49)",
        "(line 432,col 13)-(line 432,col 56)",
        "(line 434,col 13)-(line 444,col 13)",
        "(line 445,col 13)-(line 445,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 456,
      "end_line": 463,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix\n     *            matrix to transform\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 57)",
        "(line 460,col 9)-(line 460,col 48)",
        "(line 461,col 9)-(line 461,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(double[][])",
      "begin_line": 470,
      "end_line": 617,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     * @param householderMatrix Householder matrix of the transformation\n     *  to tri-diagonal form.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 48)",
        "(line 473,col 9)-(line 473,col 34)",
        "(line 474,col 9)-(line 474,col 40)",
        "(line 475,col 9)-(line 475,col 40)",
        "(line 476,col 9)-(line 476,col 35)",
        "(line 477,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 45)",
        "(line 482,col 9)-(line 482,col 23)",
        "(line 485,col 9)-(line 485,col 36)",
        "(line 486,col 9)-(line 493,col 9)",
        "(line 495,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 571,col 9)",
        "(line 574,col 9)-(line 592,col 9)",
        "(line 595,col 9)-(line 595,col 29)",
        "(line 596,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 46)",
        "(line 610,col 9)-(line 610,col 37)",
        "(line 611,col 9)-(line 616,col 9)"
      ]
    }
  ]
}
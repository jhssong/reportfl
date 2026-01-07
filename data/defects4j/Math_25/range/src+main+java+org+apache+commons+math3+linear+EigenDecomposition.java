{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 948,
      "comment": "\n * Calculates the eigen decomposition of a real matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V \u0026times; D \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * A, V and D are all m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis class is similar in spirit to the \u003ccode\u003eEigenvalueDecomposition\u003c/code\u003e\n * class from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e\n * library, with the following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getVT() getVt} method has been added,\u003c/li\u003e\n *   \u003cli\u003etwo {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)\n *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getEigenvector(int) getEigenvector} method to pick up a single\n *   eigenvector has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added.\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * As of 3.1, this class supports general real matrices (both symmetric and non-symmetric):\n * \u003c/p\u003e\n * \u003cp\u003e\n * If A is symmetric, then A \u003d V*D*V\u0027 where the eigenvalue matrix D is diagonal and the eigenvector\n * matrix V is orthogonal, i.e. A \u003d V.multiply(D.multiply(V.transpose())) and\n * V.multiply(V.transpose()) equals the identity matrix.\n * \u003c/p\u003e\n * \u003cp\u003e\n * If A is not symmetric, then the eigenvalue matrix D is block diagonal with the real eigenvalues\n * in 1-by-1 blocks and any complex eigenvalues, lambda + i*mu, in 2-by-2 blocks:\n * \u003cpre\u003e\n *    [lambda, mu    ]\n *    [   -mu, lambda]\n * \u003c/pre\u003e\n * The columns of V represent the eigenvectors in the sense that A*V \u003d V*D,\n * i.e. A.multiply(V) equals V.multiply(D).\n * The matrix V may be badly conditioned, or even singular, so the validity of the equation\n * A \u003d V*D*inverse(V) depends upon the condition of V.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \"The Implicit QL Algorithm\" in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/EigenDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Internally used epsilon criteria. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\n     * Calculates the eigen decomposition of the given real matrix.\n     * \u003cp\u003e\n     * Supports decomposition of a general matrix since 3.1.\n     *\n     * @param matrix Matrix to decompose.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @throws MathArithmeticException if the decomposition of a general matrix\n     * results in a matrix with zero norm\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 133,
      "end_line": 137,
      "comment": "\n     * Calculates the eigen decomposition of the given real matrix.\n     *\n     * @param matrix Matrix to decompose.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(double[], double[])",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 38)",
        "(line 149,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 151,col 37)",
        "(line 152,col 9)-(line 152,col 52)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(double[], double[], double)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.isSymmetric(org.apache.commons.math3.linear.RealMatrix, boolean)",
      "begin_line": 186,
      "end_line": 205,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 50)",
        "(line 189,col 9)-(line 189,col 56)",
        "(line 190,col 9)-(line 190,col 67)",
        "(line 191,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getV()",
      "begin_line": 217,
      "end_line": 228,
      "comment": "\n     * Gets the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the V matrix.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getD()",
      "begin_line": 241,
      "end_line": 256,
      "comment": "\n     * Gets the block diagonal matrix D of the decomposition.\n     * D is a block diagonal matrix.\n     * Real eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\n     *\n     * @return the D matrix.\n     *\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getVT()",
      "begin_line": 268,
      "end_line": 280,
      "comment": "\n     * Gets the transpose of the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the transpose of the V matrix.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 279,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.hasComplexEigenvalues()",
      "begin_line": 291,
      "end_line": 298,
      "comment": "\n     * Returns whether the calculated eigen values are complex or real.\n     * \u003cp\u003eThe method performs a zero check for each element of the\n     * {@link #getImagEigenvalues()} array and returns {@code true} if any\n     * element is not equal to zero.\n     *\n     * @return {@code true} if the eigen values are complex, {@code false} otherwise\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Gets a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @return a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Gets a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @return a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Gets the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i Index of the eigenvalue (counting from 0).\n     * @return the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * Gets a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     *\n     * @param i Index of the eigenvector (counting from 0).\n     * @return a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @see #getD()\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 376,
      "end_line": 382,
      "comment": "\n     * Computes the determinant of the matrix.\n     *\n     * @return the determinant of the matrix.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 31)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getSolver()",
      "begin_line": 395,
      "end_line": 400,
      "comment": "\n     * Gets a solver for finding the A \u0026times; X \u003d B solution in exact\n     * linear sense.\n     * \u003cp\u003e\n     * Since 3.1, eigen decomposition of a general matrix is supported,\n     * but the {@link DecompositionSolver} only supports real eigenvalues.\n     *\n     * @return a solver\n     * @throws MathUnsupportedOperationException if the decomposition resulted in\n     * complex eigenvalues\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 403,
      "end_line": 542,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.Solver(double[], double[], org.apache.commons.math3.linear.ArrayRealVector[])",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\n         * Builds a solver from decomposed matrix.\n         *\n         * @param realEigenvalues Real parts of the eigenvalues.\n         * @param imagEigenvalues Imaginary parts of the eigenvalues.\n         * @param eigenvectors Eigenvectors.\n         ",
      "child_ranges": [
        "(line 421,col 13)-(line 421,col 51)",
        "(line 422,col 13)-(line 422,col 51)",
        "(line 423,col 13)-(line 423,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 439,
      "end_line": 460,
      "comment": "\n         * Solves the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only finds exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B.\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B.\n         *\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 440,col 13)-(line 442,col 13)",
        "(line 444,col 13)-(line 444,col 49)",
        "(line 445,col 13)-(line 447,col 13)",
        "(line 449,col 13)-(line 449,col 46)",
        "(line 450,col 13)-(line 457,col 13)",
        "(line 459,col 13)-(line 459,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 463,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 13)-(line 467,col 13)",
        "(line 469,col 13)-(line 469,col 49)",
        "(line 470,col 13)-(line 472,col 13)",
        "(line 474,col 13)-(line 474,col 53)",
        "(line 475,col 13)-(line 475,col 55)",
        "(line 476,col 13)-(line 476,col 50)",
        "(line 477,col 13)-(line 494,col 13)",
        "(line 496,col 13)-(line 496,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.isNonSingular()",
      "begin_line": 505,
      "end_line": 513,
      "comment": "\n         * Checks whether the decomposed matrix is non-singular.\n         *\n         * @return true if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 506,col 13)-(line 511,col 13)",
        "(line 512,col 13)-(line 512,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.getInverse()",
      "begin_line": 521,
      "end_line": 541,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 522,col 13)-(line 524,col 13)",
        "(line 526,col 13)-(line 526,col 49)",
        "(line 527,col 13)-(line 527,col 56)",
        "(line 529,col 13)-(line 539,col 13)",
        "(line 540,col 13)-(line 540,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToTridiagonal(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 549,
      "end_line": 554,
      "comment": "\n     * Transforms the matrix to tridiagonal form.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 57)",
        "(line 552,col 9)-(line 552,col 48)",
        "(line 553,col 9)-(line 553,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectors(double[][])",
      "begin_line": 562,
      "end_line": 711,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tridiagonal form.\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 54)",
        "(line 564,col 9)-(line 564,col 34)",
        "(line 565,col 9)-(line 565,col 40)",
        "(line 566,col 9)-(line 566,col 40)",
        "(line 567,col 9)-(line 567,col 41)",
        "(line 568,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 45)",
        "(line 573,col 9)-(line 573,col 21)",
        "(line 576,col 9)-(line 576,col 36)",
        "(line 577,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 665,col 9)",
        "(line 668,col 9)-(line 686,col 9)",
        "(line 689,col 9)-(line 689,col 29)",
        "(line 690,col 9)-(line 694,col 9)",
        "(line 696,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 46)",
        "(line 704,col 9)-(line 704,col 43)",
        "(line 705,col 9)-(line 710,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToSchur(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 719,
      "end_line": 742,
      "comment": "\n     * Transforms the matrix to Schur form and calculates the eigenvalues.\n     *\n     * @param matrix Matrix to transform.\n     * @return the {@link SchurTransform} for this matrix\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 77)",
        "(line 721,col 9)-(line 721,col 64)",
        "(line 723,col 9)-(line 723,col 50)",
        "(line 724,col 9)-(line 724,col 50)",
        "(line 726,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.cdiv(double, double, double, double)",
      "begin_line": 753,
      "end_line": 756,
      "comment": "\n     * Performs a division of two complex numbers.\n     *\n     * @param xr real part of the first number\n     * @param xi imaginary part of the first number\n     * @param yr real part of the second number\n     * @param yi imaginary part of the second number\n     * @return result of the complex division\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectorsFromSchur(org.apache.commons.math3.linear.SchurTransformer)",
      "begin_line": 764,
      "end_line": 947,
      "comment": "\n     * Find eigenvectors from a matrix transformed to Schur form.\n     *\n     * @param schur the schur transformation of the matrix\n     * @throws MathArithmeticException if the Schur form has a norm of zero\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 58)",
        "(line 766,col 9)-(line 766,col 58)",
        "(line 768,col 9)-(line 768,col 37)",
        "(line 771,col 9)-(line 771,col 26)",
        "(line 772,col 9)-(line 776,col 9)",
        "(line 779,col 9)-(line 781,col 9)",
        "(line 785,col 9)-(line 785,col 23)",
        "(line 786,col 9)-(line 786,col 23)",
        "(line 787,col 9)-(line 787,col 23)",
        "(line 789,col 9)-(line 917,col 9)",
        "(line 920,col 9)-(line 926,col 9)",
        "(line 929,col 9)-(line 937,col 9)",
        "(line 939,col 9)-(line 939,col 46)",
        "(line 940,col 9)-(line 940,col 43)",
        "(line 941,col 9)-(line 946,col 9)"
      ]
    }
  ]
}
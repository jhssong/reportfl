{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 75,
      "end_line": 890,
      "comment": "\n * Calculates the eigen decomposition of a real matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V \u0026times; D \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * A, V and D are all m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis class is similar in spirit to the \u003ccode\u003eEigenvalueDecomposition\u003c/code\u003e\n * class from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e\n * library, with the following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getVT() getVt} method has been added,\u003c/li\u003e\n *   \u003cli\u003etwo {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)\n *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getEigenvector(int) getEigenvector} method to pick up a single\n *   eigenvector has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added.\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * As of 3.1, this class supports general real matrices (both symmetric and non-symmetric):\n * \u003c/p\u003e\n * \u003cp\u003e\n * If A is symmetric, then A \u003d V*D*V\u0027 where the eigenvalue matrix D is diagonal and the eigenvector\n * matrix V is orthogonal, i.e. A \u003d V.multiply(D.multiply(V.transpose())) and\n * V.multiply(V.transpose()) equals the identity matrix.\n * \u003c/p\u003e\n * \u003cp\u003e\n * If A is not symmetric, then the eigenvalue matrix D is block diagonal with the real eigenvalues\n * in 1-by-1 blocks and any complex eigenvalues, lambda + i*mu, in 2-by-2 blocks:\n * \u003cpre\u003e\n *    [lambda, mu    ]\n *    [   -mu, lambda]\n * \u003c/pre\u003e\n * The columns of V represent the eigenvectors in the sense that A*V \u003d V*D,\n * i.e. A.multiply(V) equals V.multiply(D).\n * The matrix V may be badly conditioned, or even singular, so the validity of the equation\n * A \u003d V*D*inverse(V) depends upon the condition of V.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \"The Implicit QL Algorithm\" in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/EigenDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Internally used epsilon criteria. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 111,
      "end_line": 120,
      "comment": "\n     * Calculates the eigen decomposition of the given real matrix.\n     *\n     * @param matrix Matrix to decompose.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(double[], double[], double)",
      "begin_line": 132,
      "end_line": 143,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 43)",
        "(line 136,col 9)-(line 136,col 30)",
        "(line 137,col 9)-(line 137,col 37)",
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.isSymmetric(org.apache.commons.math3.linear.RealMatrix, boolean)",
      "begin_line": 155,
      "end_line": 174,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 50)",
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 159,col 67)",
        "(line 160,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getV()",
      "begin_line": 186,
      "end_line": 198,
      "comment": "\n     * Gets the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the V matrix.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getD()",
      "begin_line": 211,
      "end_line": 225,
      "comment": "\n     * Gets the block diagonal matrix D of the decomposition.\n     * D is a block diagonal matrix.\n     * Real eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\n     *\n     * @return the D matrix.\n     *\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getVT()",
      "begin_line": 237,
      "end_line": 249,
      "comment": "\n     * Gets the transpose of the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the transpose of the V matrix.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 245,col 9)",
        "(line 248,col 9)-(line 248,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Gets a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @return a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Gets a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @return a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Gets the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i Index of the eigenvalue (counting from 0).\n     * @return the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Gets a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     *\n     * @param i Index of the eigenvector (counting from 0).\n     * @return a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @see #getD()\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 327,
      "end_line": 333,
      "comment": "\n     * Computes the determinant of the matrix.\n     *\n     * @return the determinant of the matrix.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 31)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getSolver()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Gets a solver for finding the A \u0026times; X \u003d B solution in exact\n     * linear sense.\n     *\n     * @return a solver.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 346,
      "end_line": 485,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.Solver(double[], double[], org.apache.commons.math3.linear.ArrayRealVector[])",
      "begin_line": 361,
      "end_line": 367,
      "comment": "\n         * Builds a solver from decomposed matrix.\n         *\n         * @param realEigenvalues Real parts of the eigenvalues.\n         * @param imagEigenvalues Imaginary parts of the eigenvalues.\n         * @param eigenvectors Eigenvectors.\n         ",
      "child_ranges": [
        "(line 364,col 13)-(line 364,col 51)",
        "(line 365,col 13)-(line 365,col 51)",
        "(line 366,col 13)-(line 366,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 382,
      "end_line": 403,
      "comment": "\n         * Solves the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only finds exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B.\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B.\n         *\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 383,col 13)-(line 385,col 13)",
        "(line 387,col 13)-(line 387,col 49)",
        "(line 388,col 13)-(line 390,col 13)",
        "(line 392,col 13)-(line 392,col 46)",
        "(line 393,col 13)-(line 400,col 13)",
        "(line 402,col 13)-(line 402,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 406,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 408,col 13)-(line 410,col 13)",
        "(line 412,col 13)-(line 412,col 49)",
        "(line 413,col 13)-(line 415,col 13)",
        "(line 417,col 13)-(line 417,col 53)",
        "(line 418,col 13)-(line 418,col 55)",
        "(line 419,col 13)-(line 419,col 50)",
        "(line 420,col 13)-(line 437,col 13)",
        "(line 439,col 13)-(line 439,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.isNonSingular()",
      "begin_line": 448,
      "end_line": 456,
      "comment": "\n         * Checks whether the decomposed matrix is non-singular.\n         *\n         * @return true if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 449,col 13)-(line 454,col 13)",
        "(line 455,col 13)-(line 455,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.getInverse()",
      "begin_line": 464,
      "end_line": 484,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 465,col 13)-(line 467,col 13)",
        "(line 469,col 13)-(line 469,col 49)",
        "(line 470,col 13)-(line 470,col 56)",
        "(line 472,col 13)-(line 482,col 13)",
        "(line 483,col 13)-(line 483,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToTridiagonal(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 492,
      "end_line": 497,
      "comment": "\n     * Transforms the matrix to tridiagonal form.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 57)",
        "(line 495,col 9)-(line 495,col 48)",
        "(line 496,col 9)-(line 496,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectors(double[][])",
      "begin_line": 505,
      "end_line": 654,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tridiagonal form.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 54)",
        "(line 507,col 9)-(line 507,col 34)",
        "(line 508,col 9)-(line 508,col 40)",
        "(line 509,col 9)-(line 509,col 40)",
        "(line 510,col 9)-(line 510,col 41)",
        "(line 511,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 45)",
        "(line 516,col 9)-(line 516,col 21)",
        "(line 519,col 9)-(line 519,col 36)",
        "(line 520,col 9)-(line 527,col 9)",
        "(line 529,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 608,col 9)",
        "(line 611,col 9)-(line 629,col 9)",
        "(line 632,col 9)-(line 632,col 29)",
        "(line 633,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 46)",
        "(line 647,col 9)-(line 647,col 43)",
        "(line 648,col 9)-(line 653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToSchur(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 662,
      "end_line": 685,
      "comment": "\n     * Transforms the matrix to Schur form and calculates the eigenvalues.\n     *\n     * @param matrix Matrix to transform.\n     * @return the {@link SchurTransform} for this matrix\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 77)",
        "(line 664,col 9)-(line 664,col 64)",
        "(line 666,col 9)-(line 666,col 50)",
        "(line 667,col 9)-(line 667,col 50)",
        "(line 669,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.cdiv(double, double, double, double)",
      "begin_line": 696,
      "end_line": 699,
      "comment": "\n     * Performs a division of two complex numbers.\n     *\n     * @param xr real part of the first number\n     * @param xi imaginary part of the first number\n     * @param yr real part of the second number\n     * @param yi imaginary part of the second number\n     * @return result of the complex division\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectorsFromSchur(org.apache.commons.math3.linear.SchurTransformer)",
      "begin_line": 706,
      "end_line": 889,
      "comment": "\n     * Find eigenvectors from a matrix transformed to Schur form.\n     *\n     * @param schur the schur transformation of the matrix\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 58)",
        "(line 708,col 9)-(line 708,col 58)",
        "(line 710,col 9)-(line 710,col 37)",
        "(line 713,col 9)-(line 713,col 26)",
        "(line 714,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 723,col 9)",
        "(line 727,col 9)-(line 727,col 23)",
        "(line 728,col 9)-(line 728,col 23)",
        "(line 729,col 9)-(line 729,col 23)",
        "(line 731,col 9)-(line 859,col 9)",
        "(line 862,col 9)-(line 868,col 9)",
        "(line 871,col 9)-(line 879,col 9)",
        "(line 881,col 9)-(line 881,col 46)",
        "(line 882,col 9)-(line 882,col 43)",
        "(line 883,col 9)-(line 888,col 9)"
      ]
    }
  ]
}
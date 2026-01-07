{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 956,
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
      "type": "field",
      "varNames": [
        "isSymmetric"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Whether the matrix is symmetric. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 116,
      "end_line": 127,
      "comment": "\n     * Calculates the eigen decomposition of the given real matrix.\n     * \u003cp\u003e\n     * Supports decomposition of a general matrix since 3.1.\n     *\n     * @param matrix Matrix to decompose.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @throws MathArithmeticException if the decomposition of a general matrix\n     * results in a matrix with zero norm\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 110)",
        "(line 119,col 9)-(line 119,col 62)",
        "(line 120,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Calculates the eigen decomposition of the given real matrix.\n     *\n     * @param matrix Matrix to decompose.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MathArithmeticException  if the decomposition of a general matrix\n     * results in a matrix with zero norm\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(double[], double[])",
      "begin_line": 155,
      "end_line": 166,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 158,col 43)",
        "(line 159,col 9)-(line 159,col 30)",
        "(line 160,col 9)-(line 160,col 37)",
        "(line 161,col 9)-(line 161,col 52)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(double[], double[], double)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getV()",
      "begin_line": 195,
      "end_line": 206,
      "comment": "\n     * Gets the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the V matrix.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getD()",
      "begin_line": 219,
      "end_line": 234,
      "comment": "\n     * Gets the block diagonal matrix D of the decomposition.\n     * D is a block diagonal matrix.\n     * Real eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\n     *\n     * @return the D matrix.\n     *\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getVT()",
      "begin_line": 246,
      "end_line": 258,
      "comment": "\n     * Gets the transpose of the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the transpose of the V matrix.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 254,col 9)",
        "(line 257,col 9)-(line 257,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.hasComplexEigenvalues()",
      "begin_line": 269,
      "end_line": 276,
      "comment": "\n     * Returns whether the calculated eigen values are complex or real.\n     * \u003cp\u003eThe method performs a zero check for each element of the\n     * {@link #getImagEigenvalues()} array and returns {@code true} if any\n     * element is not equal to zero.\n     *\n     * @return {@code true} if the eigen values are complex, {@code false} otherwise\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Gets a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @return a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Gets a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @return a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Gets the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i Index of the eigenvalue (counting from 0).\n     * @return the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Gets a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     *\n     * @param i Index of the eigenvector (counting from 0).\n     * @return a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @see #getD()\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 354,
      "end_line": 360,
      "comment": "\n     * Computes the determinant of the matrix.\n     *\n     * @return the determinant of the matrix.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 31)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getSquareRoot()",
      "begin_line": 371,
      "end_line": 389,
      "comment": "\n     * Computes the square-root of the matrix.\n     * This implementation assumes that the matrix is symmetric and postive\n     * definite.\n     *\n     * @return the square-root of the matrix.\n     * @throws MathUnsupportedOperationException if the matrix is not\n     * symmetric or not positive definite.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 76)",
        "(line 377,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 91)",
        "(line 385,col 9)-(line 385,col 36)",
        "(line 386,col 9)-(line 386,col 38)",
        "(line 388,col 9)-(line 388,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getSolver()",
      "begin_line": 402,
      "end_line": 407,
      "comment": "\n     * Gets a solver for finding the A \u0026times; X \u003d B solution in exact\n     * linear sense.\n     * \u003cp\u003e\n     * Since 3.1, eigen decomposition of a general matrix is supported,\n     * but the {@link DecompositionSolver} only supports real eigenvalues.\n     *\n     * @return a solver\n     * @throws MathUnsupportedOperationException if the decomposition resulted in\n     * complex eigenvalues\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 410,
      "end_line": 549,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.Solver(double[], double[], org.apache.commons.math3.linear.ArrayRealVector[])",
      "begin_line": 425,
      "end_line": 431,
      "comment": "\n         * Builds a solver from decomposed matrix.\n         *\n         * @param realEigenvalues Real parts of the eigenvalues.\n         * @param imagEigenvalues Imaginary parts of the eigenvalues.\n         * @param eigenvectors Eigenvectors.\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 51)",
        "(line 429,col 13)-(line 429,col 51)",
        "(line 430,col 13)-(line 430,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 446,
      "end_line": 467,
      "comment": "\n         * Solves the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only finds exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B.\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B.\n         *\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 447,col 13)-(line 449,col 13)",
        "(line 451,col 13)-(line 451,col 49)",
        "(line 452,col 13)-(line 454,col 13)",
        "(line 456,col 13)-(line 456,col 46)",
        "(line 457,col 13)-(line 464,col 13)",
        "(line 466,col 13)-(line 466,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 470,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 13)-(line 474,col 13)",
        "(line 476,col 13)-(line 476,col 49)",
        "(line 477,col 13)-(line 479,col 13)",
        "(line 481,col 13)-(line 481,col 53)",
        "(line 482,col 13)-(line 482,col 55)",
        "(line 483,col 13)-(line 483,col 50)",
        "(line 484,col 13)-(line 501,col 13)",
        "(line 503,col 13)-(line 503,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.isNonSingular()",
      "begin_line": 512,
      "end_line": 520,
      "comment": "\n         * Checks whether the decomposed matrix is non-singular.\n         *\n         * @return true if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 513,col 13)-(line 518,col 13)",
        "(line 519,col 13)-(line 519,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.getInverse()",
      "begin_line": 528,
      "end_line": 548,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 529,col 13)-(line 531,col 13)",
        "(line 533,col 13)-(line 533,col 49)",
        "(line 534,col 13)-(line 534,col 56)",
        "(line 536,col 13)-(line 546,col 13)",
        "(line 547,col 13)-(line 547,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToTridiagonal(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\n     * Transforms the matrix to tridiagonal form.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 57)",
        "(line 559,col 9)-(line 559,col 48)",
        "(line 560,col 9)-(line 560,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectors(double[][])",
      "begin_line": 569,
      "end_line": 718,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tridiagonal form.\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 54)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 40)",
        "(line 573,col 9)-(line 573,col 40)",
        "(line 574,col 9)-(line 574,col 41)",
        "(line 575,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 45)",
        "(line 580,col 9)-(line 580,col 21)",
        "(line 583,col 9)-(line 583,col 36)",
        "(line 584,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 672,col 9)",
        "(line 675,col 9)-(line 693,col 9)",
        "(line 696,col 9)-(line 696,col 29)",
        "(line 697,col 9)-(line 701,col 9)",
        "(line 703,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 46)",
        "(line 711,col 9)-(line 711,col 43)",
        "(line 712,col 9)-(line 717,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToSchur(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 726,
      "end_line": 749,
      "comment": "\n     * Transforms the matrix to Schur form and calculates the eigenvalues.\n     *\n     * @param matrix Matrix to transform.\n     * @return the {@link SchurTransformer Shur transform} for this matrix\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 77)",
        "(line 728,col 9)-(line 728,col 64)",
        "(line 730,col 9)-(line 730,col 50)",
        "(line 731,col 9)-(line 731,col 50)",
        "(line 733,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.cdiv(double, double, double, double)",
      "begin_line": 760,
      "end_line": 763,
      "comment": "\n     * Performs a division of two complex numbers.\n     *\n     * @param xr real part of the first number\n     * @param xi imaginary part of the first number\n     * @param yr real part of the second number\n     * @param yi imaginary part of the second number\n     * @return result of the complex division\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectorsFromSchur(org.apache.commons.math3.linear.SchurTransformer)",
      "begin_line": 771,
      "end_line": 955,
      "comment": "\n     * Find eigenvectors from a matrix transformed to Schur form.\n     *\n     * @param schur the schur transformation of the matrix\n     * @throws MathArithmeticException if the Schur form has a norm of zero\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 58)",
        "(line 774,col 9)-(line 774,col 58)",
        "(line 776,col 9)-(line 776,col 37)",
        "(line 779,col 9)-(line 779,col 26)",
        "(line 780,col 9)-(line 784,col 9)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 793,col 9)-(line 793,col 23)",
        "(line 794,col 9)-(line 794,col 23)",
        "(line 795,col 9)-(line 795,col 23)",
        "(line 797,col 9)-(line 925,col 9)",
        "(line 928,col 9)-(line 934,col 9)",
        "(line 937,col 9)-(line 945,col 9)",
        "(line 947,col 9)-(line 947,col 46)",
        "(line 948,col 9)-(line 948,col 43)",
        "(line 949,col 9)-(line 954,col 9)"
      ]
    }
  ]
}
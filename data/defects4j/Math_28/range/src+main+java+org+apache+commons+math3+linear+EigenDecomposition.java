{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 947,
      "comment": "\n * Calculates the eigen decomposition of a real matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V \u0026times; D \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * A, V and D are all m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis class is similar in spirit to the \u003ccode\u003eEigenvalueDecomposition\u003c/code\u003e\n * class from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e\n * library, with the following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getVT() getVt} method has been added,\u003c/li\u003e\n *   \u003cli\u003etwo {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)\n *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getEigenvector(int) getEigenvector} method to pick up a single\n *   eigenvector has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added.\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * As of 3.1, this class supports general real matrices (both symmetric and non-symmetric):\n * \u003c/p\u003e\n * \u003cp\u003e\n * If A is symmetric, then A \u003d V*D*V\u0027 where the eigenvalue matrix D is diagonal and the eigenvector\n * matrix V is orthogonal, i.e. A \u003d V.multiply(D.multiply(V.transpose())) and\n * V.multiply(V.transpose()) equals the identity matrix.\n * \u003c/p\u003e\n * \u003cp\u003e\n * If A is not symmetric, then the eigenvalue matrix D is block diagonal with the real eigenvalues\n * in 1-by-1 blocks and any complex eigenvalues, lambda + i*mu, in 2-by-2 blocks:\n * \u003cpre\u003e\n *    [lambda, mu    ]\n *    [   -mu, lambda]\n * \u003c/pre\u003e\n * The columns of V represent the eigenvectors in the sense that A*V \u003d V*D,\n * i.e. A.multiply(V) equals V.multiply(D).\n * The matrix V may be badly conditioned, or even singular, so the validity of the equation\n * A \u003d V*D*inverse(V) depends upon the condition of V.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \"The Implicit QL Algorithm\" in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/EigenDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Internally used epsilon criteria. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 115,
      "end_line": 123,
      "comment": "\n     * Calculates the eigen decomposition of the given real matrix.\n     * \u003cp\u003e\n     * Supports decomposition of a general matrix since 3.1.\n     *\n     * @param matrix Matrix to decompose.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @throws MathArithmeticException if the decomposition of a general matrix\n     * results in a matrix with zero norm\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 134,
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
      "end_line": 173,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     * @deprecated in 3.1 (to be removed in 4.0) due to unused parameter\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.isSymmetric(org.apache.commons.math3.linear.RealMatrix, boolean)",
      "begin_line": 185,
      "end_line": 204,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 50)",
        "(line 188,col 9)-(line 188,col 56)",
        "(line 189,col 9)-(line 189,col 67)",
        "(line 190,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getV()",
      "begin_line": 216,
      "end_line": 227,
      "comment": "\n     * Gets the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the V matrix.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getD()",
      "begin_line": 240,
      "end_line": 255,
      "comment": "\n     * Gets the block diagonal matrix D of the decomposition.\n     * D is a block diagonal matrix.\n     * Real eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\n     *\n     * @return the D matrix.\n     *\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getVT()",
      "begin_line": 267,
      "end_line": 279,
      "comment": "\n     * Gets the transpose of the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the transpose of the V matrix.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 278,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.hasComplexEigenvalues()",
      "begin_line": 290,
      "end_line": 297,
      "comment": "\n     * Returns whether the calculated eigen values are complex or real.\n     * \u003cp\u003eThe method performs a zero check for each element of the\n     * {@link #getImagEigenvalues()} array and returns {@code true} if any\n     * element is not equal to zero.\n     *\n     * @return {@code true} if the eigen values are complex, {@code false} otherwise\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Gets a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @return a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Gets a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @return a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Gets the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i Index of the eigenvalue (counting from 0).\n     * @return the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Gets a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     *\n     * @param i Index of the eigenvector (counting from 0).\n     * @return a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @see #getD()\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 375,
      "end_line": 381,
      "comment": "\n     * Computes the determinant of the matrix.\n     *\n     * @return the determinant of the matrix.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 31)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.getSolver()",
      "begin_line": 394,
      "end_line": 399,
      "comment": "\n     * Gets a solver for finding the A \u0026times; X \u003d B solution in exact\n     * linear sense.\n     * \u003cp\u003e\n     * Since 3.1, eigen decomposition of a general matrix is supported,\n     * but the {@link DecompositionSolver} only supports real eigenvalues.\n     *\n     * @return a solver\n     * @throws MathUnsupportedOperationException if the decomposition resulted in\n     * complex eigenvalues\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 402,
      "end_line": 541,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.Solver(double[], double[], org.apache.commons.math3.linear.ArrayRealVector[])",
      "begin_line": 417,
      "end_line": 423,
      "comment": "\n         * Builds a solver from decomposed matrix.\n         *\n         * @param realEigenvalues Real parts of the eigenvalues.\n         * @param imagEigenvalues Imaginary parts of the eigenvalues.\n         * @param eigenvectors Eigenvectors.\n         ",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 51)",
        "(line 421,col 13)-(line 421,col 51)",
        "(line 422,col 13)-(line 422,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 438,
      "end_line": 459,
      "comment": "\n         * Solves the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only finds exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B.\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B.\n         *\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 439,col 13)-(line 441,col 13)",
        "(line 443,col 13)-(line 443,col 49)",
        "(line 444,col 13)-(line 446,col 13)",
        "(line 448,col 13)-(line 448,col 46)",
        "(line 449,col 13)-(line 456,col 13)",
        "(line 458,col 13)-(line 458,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 462,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 13)-(line 466,col 13)",
        "(line 468,col 13)-(line 468,col 49)",
        "(line 469,col 13)-(line 471,col 13)",
        "(line 473,col 13)-(line 473,col 53)",
        "(line 474,col 13)-(line 474,col 55)",
        "(line 475,col 13)-(line 475,col 50)",
        "(line 476,col 13)-(line 493,col 13)",
        "(line 495,col 13)-(line 495,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.isNonSingular()",
      "begin_line": 504,
      "end_line": 512,
      "comment": "\n         * Checks whether the decomposed matrix is non-singular.\n         *\n         * @return true if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 505,col 13)-(line 510,col 13)",
        "(line 511,col 13)-(line 511,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.Solver.getInverse()",
      "begin_line": 520,
      "end_line": 540,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 521,col 13)-(line 523,col 13)",
        "(line 525,col 13)-(line 525,col 49)",
        "(line 526,col 13)-(line 526,col 56)",
        "(line 528,col 13)-(line 538,col 13)",
        "(line 539,col 13)-(line 539,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToTridiagonal(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 548,
      "end_line": 553,
      "comment": "\n     * Transforms the matrix to tridiagonal form.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 57)",
        "(line 551,col 9)-(line 551,col 48)",
        "(line 552,col 9)-(line 552,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectors(double[][])",
      "begin_line": 561,
      "end_line": 710,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tridiagonal form.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 54)",
        "(line 563,col 9)-(line 563,col 34)",
        "(line 564,col 9)-(line 564,col 40)",
        "(line 565,col 9)-(line 565,col 40)",
        "(line 566,col 9)-(line 566,col 41)",
        "(line 567,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 45)",
        "(line 572,col 9)-(line 572,col 21)",
        "(line 575,col 9)-(line 575,col 36)",
        "(line 576,col 9)-(line 583,col 9)",
        "(line 585,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 664,col 9)",
        "(line 667,col 9)-(line 685,col 9)",
        "(line 688,col 9)-(line 688,col 29)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 46)",
        "(line 703,col 9)-(line 703,col 43)",
        "(line 704,col 9)-(line 709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.transformToSchur(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 718,
      "end_line": 741,
      "comment": "\n     * Transforms the matrix to Schur form and calculates the eigenvalues.\n     *\n     * @param matrix Matrix to transform.\n     * @return the {@link SchurTransform} for this matrix\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 77)",
        "(line 720,col 9)-(line 720,col 64)",
        "(line 722,col 9)-(line 722,col 50)",
        "(line 723,col 9)-(line 723,col 50)",
        "(line 725,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.cdiv(double, double, double, double)",
      "begin_line": 752,
      "end_line": 755,
      "comment": "\n     * Performs a division of two complex numbers.\n     *\n     * @param xr real part of the first number\n     * @param xi imaginary part of the first number\n     * @param yr real part of the second number\n     * @param yi imaginary part of the second number\n     * @return result of the complex division\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.EigenDecomposition.findEigenVectorsFromSchur(org.apache.commons.math3.linear.SchurTransformer)",
      "begin_line": 763,
      "end_line": 946,
      "comment": "\n     * Find eigenvectors from a matrix transformed to Schur form.\n     *\n     * @param schur the schur transformation of the matrix\n     * @throws MathArithmeticException if the Schur form has a norm of zero\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 58)",
        "(line 765,col 9)-(line 765,col 58)",
        "(line 767,col 9)-(line 767,col 37)",
        "(line 770,col 9)-(line 770,col 26)",
        "(line 771,col 9)-(line 775,col 9)",
        "(line 778,col 9)-(line 780,col 9)",
        "(line 784,col 9)-(line 784,col 23)",
        "(line 785,col 9)-(line 785,col 23)",
        "(line 786,col 9)-(line 786,col 23)",
        "(line 788,col 9)-(line 916,col 9)",
        "(line 919,col 9)-(line 925,col 9)",
        "(line 928,col 9)-(line 936,col 9)",
        "(line 938,col 9)-(line 938,col 46)",
        "(line 939,col 9)-(line 939,col 43)",
        "(line 940,col 9)-(line 945,col 9)"
      ]
    }
  ]
}
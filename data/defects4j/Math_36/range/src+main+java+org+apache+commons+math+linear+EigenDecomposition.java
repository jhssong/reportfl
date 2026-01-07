{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 635,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V \u0026times; D \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * A, V and D are all m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis class is similar in spirit to the \u003ccode\u003eEigenvalueDecomposition\u003c/code\u003e\n * class from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e\n * library, with the following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getVT() getVt} method has been added,\u003c/li\u003e\n *   \u003cli\u003etwo {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)\n *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getEigenvector(int) getEigenvector} method to pick up a single\n *   eigenvector has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added.\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \"The Implicit QL Algorithm\" in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/EigenDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     *\n     * @param matrix Matrix to decompose. It \u003cem\u003emust\u003c/em\u003e be symmetric.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.EigenDecomposition(double[], double[], double)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric tridiagonal form.\n     * @param secondary Secondary of the tridiagonal form.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 38)",
        "(line 122,col 9)-(line 122,col 43)",
        "(line 123,col 9)-(line 123,col 30)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 46)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.isSymmetric(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 142,
      "end_line": 161,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 145,col 56)",
        "(line 146,col 9)-(line 146,col 67)",
        "(line 147,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getV()",
      "begin_line": 173,
      "end_line": 185,
      "comment": "\n     * Gets the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the V matrix.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getD()",
      "begin_line": 198,
      "end_line": 204,
      "comment": "\n     * Gets the block diagonal matrix D of the decomposition.\n     * D is a block diagonal matrix.\n     * Real eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\n     *\n     * @return the D matrix.\n     *\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getVT()",
      "begin_line": 216,
      "end_line": 229,
      "comment": "\n     * Gets the transpose of the matrix V of the decomposition.\n     * V is an orthogonal matrix, i.e. its transpose is also its inverse.\n     * The columns of V are the eigenvectors of the original matrix.\n     * No assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\n     *\n     * @return the transpose of the V matrix.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 225,col 9)",
        "(line 228,col 9)-(line 228,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Gets a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @return a copy of the real parts of the eigenvalues of the original matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Gets a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @return a copy of the imaginary parts of the eigenvalues of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Gets the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @param i Index of the eigenvalue (counting from 0).\n     * @return the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original\n     * matrix.\n     *\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Gets a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     *\n     * @param i Index of the eigenvector (counting from 0).\n     * @return a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @see #getD()\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 307,
      "end_line": 313,
      "comment": "\n     * Computes the determinant of the matrix.\n     *\n     * @return the determinant of the matrix.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 31)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getSolver()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Gets a solver for finding the A \u0026times; X \u003d B solution in exact\n     * linear sense.\n     *\n     * @return a solver.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 326,
      "end_line": 465,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 341,
      "end_line": 347,
      "comment": "\n         * Builds a solver from decomposed matrix.\n         *\n         * @param realEigenvalues Real parts of the eigenvalues.\n         * @param imagEigenvalues Imaginary parts of the eigenvalues.\n         * @param eigenvectors Eigenvectors.\n         ",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 51)",
        "(line 345,col 13)-(line 345,col 51)",
        "(line 346,col 13)-(line 346,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 362,
      "end_line": 383,
      "comment": "\n         * Solves the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only finds exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B.\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B.\n         *\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 363,col 13)-(line 365,col 13)",
        "(line 367,col 13)-(line 367,col 49)",
        "(line 368,col 13)-(line 370,col 13)",
        "(line 372,col 13)-(line 372,col 46)",
        "(line 373,col 13)-(line 380,col 13)",
        "(line 382,col 13)-(line 382,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 386,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 13)-(line 390,col 13)",
        "(line 392,col 13)-(line 392,col 49)",
        "(line 393,col 13)-(line 395,col 13)",
        "(line 397,col 13)-(line 397,col 53)",
        "(line 398,col 13)-(line 398,col 55)",
        "(line 399,col 13)-(line 399,col 50)",
        "(line 400,col 13)-(line 417,col 13)",
        "(line 419,col 13)-(line 419,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.isNonSingular()",
      "begin_line": 428,
      "end_line": 436,
      "comment": "\n         * Checks whether the decomposed matrix is non-singular.\n         *\n         * @return true if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 429,col 13)-(line 434,col 13)",
        "(line 435,col 13)-(line 435,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.getInverse()",
      "begin_line": 444,
      "end_line": 464,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 445,col 13)-(line 447,col 13)",
        "(line 449,col 13)-(line 449,col 49)",
        "(line 450,col 13)-(line 450,col 56)",
        "(line 452,col 13)-(line 462,col 13)",
        "(line 463,col 13)-(line 463,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 472,
      "end_line": 477,
      "comment": "\n     * Transforms the matrix to tridiagonal form.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 57)",
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 476,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.findEigenVectors(double[][])",
      "begin_line": 485,
      "end_line": 634,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tridiagonal form.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 54)",
        "(line 487,col 9)-(line 487,col 34)",
        "(line 488,col 9)-(line 488,col 40)",
        "(line 489,col 9)-(line 489,col 40)",
        "(line 490,col 9)-(line 490,col 41)",
        "(line 491,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 45)",
        "(line 496,col 9)-(line 496,col 21)",
        "(line 499,col 9)-(line 499,col 36)",
        "(line 500,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 588,col 9)",
        "(line 591,col 9)-(line 609,col 9)",
        "(line 612,col 9)-(line 612,col 29)",
        "(line 613,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 46)",
        "(line 627,col 9)-(line 627,col 43)",
        "(line 628,col 9)-(line 633,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 623,
      "comment": "\n * Calculates the eigen decomposition of a real \u003cstrong\u003esymmetric\u003c/strong\u003e\n * matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V \u0026times; D \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * A, V and D are all m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis class is similar in spirit to the \u003ccode\u003eEigenvalueDecomposition\u003c/code\u003e\n * class from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e\n * library, with the following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getVT() getVt} method has been added,\u003c/li\u003e\n *   \u003cli\u003etwo {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)\n *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getEigenvector(int) getEigenvector} method to pick up a single\n *   eigenvector has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added.\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * As of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices, and\n * hence computes only real realEigenvalues. This implies the D matrix returned\n * by {@link #getD()} is always diagonal and the imaginary values returned\n * {@link #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always\n * null.\n * \u003c/p\u003e\n * \u003cp\u003e\n * When called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at\n * all.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This implementation is based on the paper by A. Drubrulle, R.S. Martin and\n * J.H. Wilkinson \u0027The Implicit QL Algorithm\u0027 in Wilksinson and Reinsch (1971)\n * Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,\n * New-York\n * \u003c/p\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/EigenDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Maximum number of iterations accepted in the implicit QL transformation "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Transformer to tridiagonal (may be null if matrix is already\n     * tridiagonal).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 91,
      "end_line": 91,
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
      "begin_line": 97,
      "end_line": 97,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.EigenDecomposition(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     *\n     * @param matrix Matrix to decompose. It \u003cem\u003emust\u003c/em\u003e be symmetric.\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.EigenDecomposition(double[], double[], double)",
      "begin_line": 129,
      "end_line": 140,
      "comment": "\n     * Calculates the eigen decomposition of the symmetric tridiagonal\n     * matrix.  The Householder matrix is assumed to be the identity matrix.\n     *\n     * @param main Main diagonal of the symmetric triadiagonal form\n     * @param secondary Secondary of the tridiagonal form\n     * @param splitTolerance Dummy parameter (present for backward\n     * compatibility only).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 38)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 133,col 30)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 135,col 46)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.isSymmetric(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 152,
      "end_line": 171,
      "comment": "\n     * Check if a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param raiseException If {@code true}, the method will throw an\n     * exception if {@code matrix} is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric and\n     * {@code raiseException} is {@code true}.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 67)",
        "(line 157,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getV()",
      "begin_line": 182,
      "end_line": 194,
      "comment": "\n     * Returns the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * \u003cp\u003eThe columns of V are the eigenvectors of the original matrix.\u003c/p\u003e\n     * \u003cp\u003eNo assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getD()",
      "begin_line": 205,
      "end_line": 211,
      "comment": "\n     * Returns the block diagonal matrix D of the decomposition.\n     * \u003cp\u003eD is a block diagonal matrix.\u003c/p\u003e\n     * \u003cp\u003eReal eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\u003c/p\u003e\n     * @return the D matrix\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getVT()",
      "begin_line": 222,
      "end_line": 235,
      "comment": "\n     * Returns the transpose of the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * \u003cp\u003eThe columns of V are the eigenvectors of the original matrix.\u003c/p\u003e\n     * \u003cp\u003eNo assumption is made about the orientation of the system axes formed\n     * by the columns of V (e.g. in a 3-dimension space, V can form a left-\n     * or right-handed system).\u003c/p\u003e\n     * @return the transpose of the V matrix\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns a copy of the real parts of the eigenvalues of the original matrix.\n     * @return a copy of the real parts of the eigenvalues of the original matrix\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix.\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns a copy of the imaginary parts of the eigenvalues of the original matrix.\n     * @return a copy of the imaginary parts of the eigenvalues of the original matrix\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Returns the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix.\n     * @param i index of the eigenvalue (counting from 0)\n     * @return imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @param i index of the eigenvector (counting from 0)\n     * @return copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix\n     * @see #getD()\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 297,
      "end_line": 303,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getSolver()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in exact linear sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 314,
      "end_line": 454,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 334,
      "end_line": 340,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues\n         *            real parts of the eigenvalues\n         * @param imagEigenvalues\n         *            imaginary parts of the eigenvalues\n         * @param eigenvectors\n         *            eigenvectors\n         ",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 51)",
        "(line 338,col 13)-(line 338,col 51)",
        "(line 339,col 13)-(line 339,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 353,
      "end_line": 374,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003e\n         * This method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a Vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 354,col 13)-(line 356,col 13)",
        "(line 358,col 13)-(line 358,col 49)",
        "(line 359,col 13)-(line 361,col 13)",
        "(line 363,col 13)-(line 363,col 46)",
        "(line 364,col 13)-(line 371,col 13)",
        "(line 373,col 13)-(line 373,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 377,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 13)-(line 381,col 13)",
        "(line 383,col 13)-(line 383,col 49)",
        "(line 384,col 13)-(line 386,col 13)",
        "(line 388,col 13)-(line 388,col 53)",
        "(line 389,col 13)-(line 389,col 55)",
        "(line 390,col 13)-(line 390,col 50)",
        "(line 391,col 13)-(line 408,col 13)",
        "(line 410,col 13)-(line 410,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.isNonSingular()",
      "begin_line": 418,
      "end_line": 425,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 419,col 13)-(line 423,col 13)",
        "(line 424,col 13)-(line 424,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.Solver.getInverse()",
      "begin_line": 433,
      "end_line": 453,
      "comment": "\n         * Get the inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 434,col 13)-(line 436,col 13)",
        "(line 438,col 13)-(line 438,col 49)",
        "(line 439,col 13)-(line 439,col 56)",
        "(line 441,col 13)-(line 451,col 13)",
        "(line 452,col 13)-(line 452,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\n     * Transform matrix to tridiagonal.\n     *\n     * @param matrix Matrix to transform.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 57)",
        "(line 464,col 9)-(line 464,col 48)",
        "(line 465,col 9)-(line 465,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.findEigenVectors(double[][])",
      "begin_line": 474,
      "end_line": 622,
      "comment": "\n     * Find eigenvalues and eigenvectors (Dubrulle et al., 1971)\n     *\n     * @param householderMatrix Householder matrix of the transformation\n     * to tri-diagonal form.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 476,col 34)",
        "(line 477,col 9)-(line 477,col 40)",
        "(line 478,col 9)-(line 478,col 40)",
        "(line 479,col 9)-(line 479,col 35)",
        "(line 480,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 45)",
        "(line 485,col 9)-(line 485,col 23)",
        "(line 488,col 9)-(line 488,col 36)",
        "(line 489,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 576,col 9)",
        "(line 579,col 9)-(line 597,col 9)",
        "(line 600,col 9)-(line 600,col 29)",
        "(line 601,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 46)",
        "(line 615,col 9)-(line 615,col 37)",
        "(line 616,col 9)-(line 621,col 9)"
      ]
    }
  ]
}
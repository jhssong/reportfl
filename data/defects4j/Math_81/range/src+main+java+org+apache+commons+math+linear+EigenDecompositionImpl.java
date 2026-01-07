{
  "filepath": "/tmp/Math-81b/src/main/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 61,
      "end_line": 1842,
      "comment": "\n * Calculates the eigen decomposition of a \u003cstrong\u003esymmetric\u003c/strong\u003e matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m\n * matrices.\u003c/p\u003e\n * \u003cp\u003eAs of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices,\n * and hence computes only real realEigenvalues. This implies the D matrix returned by\n * {@link #getD()} is always diagonal and the imaginary values returned {@link\n * #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always null.\u003c/p\u003e\n * \u003cp\u003eWhen called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eEigenvalues are computed as soon as the matrix is decomposed, but eigenvectors\n * are computed only when required, i.e. only when one of the {@link #getEigenvector(int)},\n * {@link #getV()}, {@link #getVT()}, {@link #getSolver()} methods is called.\u003c/p\u003e\n * \u003cp\u003eThis implementation is based on Inderjit Singh Dhillon thesis\n * \u003ca href\u003d\"http://www.cs.utexas.edu/users/inderjit/public_papers/thesis.pdf\"\u003eA\n * New O(n\u003csup\u003e2\u003c/sup\u003e) Algorithm for the Symmetric Tridiagonal Eigenvalue/Eigenvector\n * Problem\u003c/a\u003e, on Beresford N. Parlett and Osni A. Marques paper \u003ca\n * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn Implementation of the\n * dqds Algorithm (Positive Case)\u003c/a\u003e and on the corresponding LAPACK routines (DLARRE,\n * DLASQ2, DLAZQ3, DLAZQ4, DLASQ5 and DLASQ6).\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n *   \u003cul\u003e\n *     \u003cli\u003eBeresford Parlett, University of California, Berkeley, USA\u003c/li\u003e\n *     \u003cli\u003eJim Demmel, University of California, Berkeley, USA\u003c/li\u003e\n *     \u003cli\u003eInderjit Dhillon, University of Texas, Austin, USA\u003c/li\u003e\n *     \u003cli\u003eOsni Marques, LBNL/NERSC, USA\u003c/li\u003e\n *     \u003cli\u003eChristof Voemel, University of California, Berkeley, USA\u003c/li\u003e\n *   \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE_2"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Squared tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "splitTolerance"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Split tolerance. "
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
        "squaredSecondary"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Squared secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Transformer to tridiagonal (may be null if matrix is already tridiagonal). "
    },
    {
      "type": "field",
      "varNames": [
        "lowerSpectra"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Lower bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "upperSpectra"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Upper bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "minPivot"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Minimum pivot in the Sturm sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "sigmaLow"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Low part of the current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "tau"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Shift increment to apply. "
    },
    {
      "type": "field",
      "varNames": [
        "work"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Work array for all decomposition algorithms. "
    },
    {
      "type": "field",
      "varNames": [
        "pingPong"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Shift within qd array for ping-pong implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "qMax"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Max value of diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "eMin"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Min value of off-diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "tType"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Type of the last dqds shift. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Minimal value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin1"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Minimal value on current state of the diagonal, excluding last element. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin2"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Minimal value on current state of the diagonal, excluding last two elements. "
    },
    {
      "type": "field",
      "varNames": [
        "dN"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Last value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN1"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Last but one value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN2"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Last but two on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "g"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Shift ratio with respect to dMin used when tType \u003d\u003d 6. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 165,
      "end_line": 177,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix.\n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link\n     * org.apache.commons.math.ConvergenceException} if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 189,
      "end_line": 207,
      "comment": "\n     * Calculates the eigen decomposition of the given tridiagonal symmetric matrix.\n     * @param main the main diagonal of the matrix (will be copied)\n     * @param secondary the secondary diagonal of the matrix (will be copied)\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link\n     * org.apache.commons.math.ConvergenceException} if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 38)",
        "(line 194,col 9)-(line 194,col 43)",
        "(line 195,col 9)-(line 195,col 30)",
        "(line 198,col 9)-(line 198,col 56)",
        "(line 199,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 45)",
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 214,
      "end_line": 228,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)",
        "(line 216,col 9)-(line 216,col 56)",
        "(line 217,col 9)-(line 217,col 68)",
        "(line 218,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.decompose()",
      "begin_line": 235,
      "end_line": 251,
      "comment": "\n     * Decompose a tridiagonal symmetric matrix.\n     * @exception InvalidMatrixException (wrapping a {@link\n     * org.apache.commons.math.ConvergenceException} if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 24)",
        "(line 238,col 9)-(line 238,col 24)",
        "(line 239,col 9)-(line 239,col 24)",
        "(line 240,col 9)-(line 240,col 47)",
        "(line 243,col 9)-(line 243,col 35)",
        "(line 246,col 9)-(line 246,col 26)",
        "(line 249,col 9)-(line 249,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 254,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 269,col 9)",
        "(line 272,col 9)-(line 272,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 277,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 287,
      "end_line": 307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 302,col 9)",
        "(line 305,col 9)-(line 305,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 310,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 316,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 322,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 328,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 334,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 346,
      "end_line": 352,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 31)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 355,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 363,
      "end_line": 544,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 380,
      "end_line": 385,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues real parts of the eigenvalues\n         * @param imagEigenvalues imaginary parts of the eigenvalues\n         * @param eigenvectors eigenvectors\n         ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 51)",
        "(line 383,col 13)-(line 383,col 51)",
        "(line 384,col 13)-(line 384,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 395,
      "end_line": 421,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 398,col 13)-(line 400,col 13)",
        "(line 402,col 13)-(line 402,col 49)",
        "(line 403,col 13)-(line 407,col 13)",
        "(line 409,col 13)-(line 409,col 46)",
        "(line 410,col 13)-(line 417,col 13)",
        "(line 419,col 13)-(line 419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 431,
      "end_line": 457,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 434,col 13)-(line 436,col 13)",
        "(line 438,col 13)-(line 438,col 49)",
        "(line 439,col 13)-(line 443,col 13)",
        "(line 445,col 13)-(line 445,col 46)",
        "(line 446,col 13)-(line 453,col 13)",
        "(line 455,col 13)-(line 455,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 467,
      "end_line": 500,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 470,col 13)-(line 472,col 13)",
        "(line 474,col 13)-(line 474,col 49)",
        "(line 475,col 13)-(line 479,col 13)",
        "(line 481,col 13)-(line 481,col 53)",
        "(line 482,col 13)-(line 482,col 55)",
        "(line 483,col 13)-(line 496,col 13)",
        "(line 498,col 13)-(line 498,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 506,
      "end_line": 513,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 507,col 13)-(line 511,col 13)",
        "(line 512,col 13)-(line 512,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 519,
      "end_line": 542,
      "comment": " Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 550,
      "end_line": 564,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 57)",
        "(line 554,col 9)-(line 554,col 53)",
        "(line 555,col 9)-(line 555,col 58)",
        "(line 558,col 9)-(line 558,col 56)",
        "(line 559,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles()",
      "begin_line": 569,
      "end_line": 605,
      "comment": "\n     * Compute the Gershgorin circles for all rows.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 38)",
        "(line 572,col 9)-(line 572,col 37)",
        "(line 573,col 9)-(line 573,col 37)",
        "(line 574,col 9)-(line 574,col 48)",
        "(line 575,col 9)-(line 575,col 48)",
        "(line 576,col 9)-(line 576,col 24)",
        "(line 578,col 9)-(line 578,col 28)",
        "(line 579,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 597,col 44)",
        "(line 598,col 9)-(line 598,col 49)",
        "(line 599,col 9)-(line 599,col 41)",
        "(line 600,col 9)-(line 600,col 53)",
        "(line 601,col 9)-(line 601,col 49)",
        "(line 602,col 9)-(line 602,col 41)",
        "(line 603,col 9)-(line 603,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues()",
      "begin_line": 611,
      "end_line": 684,
      "comment": "\n     * Find the realEigenvalues.\n     * @exception InvalidMatrixException if a block cannot be diagonalized\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 53)",
        "(line 618,col 9)-(line 618,col 50)",
        "(line 619,col 9)-(line 619,col 50)",
        "(line 620,col 9)-(line 620,col 22)",
        "(line 621,col 9)-(line 672,col 9)",
        "(line 675,col 9)-(line 675,col 37)",
        "(line 676,col 9)-(line 676,col 43)",
        "(line 677,col 9)-(line 682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits()",
      "begin_line": 690,
      "end_line": 710,
      "comment": "\n     * Compute splitting points.\n     * @return list of indices after matrix can be split\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 60)",
        "(line 695,col 9)-(line 695,col 47)",
        "(line 696,col 9)-(line 705,col 9)",
        "(line 707,col 9)-(line 707,col 39)",
        "(line 708,col 9)-(line 708,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(int)",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * Find eigenvalue in a block with 1 row.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(int)",
      "begin_line": 727,
      "end_line": 747,
      "comment": "\n     * Find realEigenvalues in a block with 2 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if characteristic polynomial cannot be solved\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 40)",
        "(line 733,col 9)-(line 733,col 44)",
        "(line 734,col 9)-(line 734,col 52)",
        "(line 736,col 9)-(line 736,col 37)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 738,col 9)-(line 738,col 43)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 743,col 9)-(line 743,col 64)",
        "(line 744,col 9)-(line 744,col 49)",
        "(line 745,col 9)-(line 745,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(int)",
      "begin_line": 755,
      "end_line": 809,
      "comment": "\n     * Find realEigenvalues in a block with 3 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if diagonal elements are not positive\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 44)",
        "(line 761,col 9)-(line 761,col 48)",
        "(line 762,col 9)-(line 762,col 48)",
        "(line 763,col 9)-(line 763,col 56)",
        "(line 764,col 9)-(line 764,col 70)",
        "(line 767,col 9)-(line 767,col 48)",
        "(line 768,col 9)-(line 768,col 67)",
        "(line 769,col 9)-(line 769,col 57)",
        "(line 772,col 9)-(line 772,col 38)",
        "(line 773,col 9)-(line 773,col 49)",
        "(line 774,col 9)-(line 774,col 69)",
        "(line 775,col 9)-(line 775,col 50)",
        "(line 776,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 44)",
        "(line 783,col 9)-(line 783,col 59)",
        "(line 784,col 9)-(line 784,col 41)",
        "(line 785,col 9)-(line 785,col 36)",
        "(line 787,col 9)-(line 787,col 55)",
        "(line 788,col 9)-(line 788,col 71)",
        "(line 789,col 9)-(line 789,col 71)",
        "(line 790,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 40)",
        "(line 806,col 9)-(line 806,col 40)",
        "(line 807,col 9)-(line 807,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(int)",
      "begin_line": 822,
      "end_line": 928,
      "comment": "\n     * Find realEigenvalues using dqd/dqds algorithms.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLASQ2.\u003c/p\u003e\n     * @param n number of rows of the block\n     * @exception InvalidMatrixException if block cannot be diagonalized\n     * after 30 * n iterations\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 30)",
        "(line 827,col 9)-(line 831,col 9)",
        "(line 833,col 9)-(line 836,col 9)",
        "(line 839,col 9)-(line 839,col 30)",
        "(line 842,col 9)-(line 842,col 25)",
        "(line 845,col 9)-(line 845,col 18)",
        "(line 846,col 9)-(line 846,col 18)",
        "(line 847,col 9)-(line 847,col 18)",
        "(line 848,col 9)-(line 848,col 18)",
        "(line 849,col 9)-(line 849,col 18)",
        "(line 850,col 9)-(line 850,col 18)",
        "(line 851,col 9)-(line 851,col 18)",
        "(line 854,col 9)-(line 854,col 19)",
        "(line 855,col 9)-(line 855,col 19)",
        "(line 856,col 9)-(line 926,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(int)",
      "begin_line": 934,
      "end_line": 977,
      "comment": "\n     * Perform two iterations with Li\u0027s tests for initial splits.\n     * @param n number of rows of the matrix to process\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 21)",
        "(line 937,col 9)-(line 975,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(int, int)",
      "begin_line": 990,
      "end_line": 1122,
      "comment": "\n     * Perform one \"good\" dqd/dqds step.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLAZQ3.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @return new end (maybe deflated)\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 16)",
        "(line 995,col 9)-(line 995,col 30)",
        "(line 996,col 9)-(line 1047,col 9)",
        "(line 1049,col 9)-(line 1049,col 53)",
        "(line 1052,col 9)-(line 1064,col 9)",
        "(line 1066,col 9)-(line 1115,col 9)",
        "(line 1118,col 9)-(line 1118,col 32)",
        "(line 1120,col 9)-(line 1120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(int, int)",
      "begin_line": 1131,
      "end_line": 1146,
      "comment": "\n     * Flip qd array if warranted.\n     * @param n number of rows in the block\n     * @param step within the array (1 for flipping all elements, 2 for flipping\n     * only every other element)\n     * @return true if qd array was flipped\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1144,col 9)",
        "(line 1145,col 9)-(line 1145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(int, int)",
      "begin_line": 1154,
      "end_line": 1220,
      "comment": "\n     * Compute an interval containing all realEigenvalues of a block.\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return an interval containing the realEigenvalues\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1157,col 47)",
        "(line 1158,col 9)-(line 1158,col 47)",
        "(line 1159,col 9)-(line 1159,col 48)",
        "(line 1160,col 9)-(line 1160,col 48)",
        "(line 1161,col 9)-(line 1164,col 9)",
        "(line 1167,col 9)-(line 1167,col 72)",
        "(line 1168,col 9)-(line 1168,col 70)",
        "(line 1169,col 9)-(line 1169,col 54)",
        "(line 1170,col 9)-(line 1171,col 90)",
        "(line 1172,col 9)-(line 1172,col 81)",
        "(line 1175,col 9)-(line 1175,col 38)",
        "(line 1176,col 9)-(line 1176,col 38)",
        "(line 1177,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1194,col 81)",
        "(line 1197,col 9)-(line 1197,col 31)",
        "(line 1198,col 9)-(line 1198,col 31)",
        "(line 1199,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 83)",
        "(line 1218,col 9)-(line 1218,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(double, int, int)",
      "begin_line": 1229,
      "end_line": 1239,
      "comment": "\n     * Count the number of realEigenvalues below a point.\n     * @param t value below which we must count the number of realEigenvalues\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return number of realEigenvalues smaller than t\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 39)",
        "(line 1231,col 9)-(line 1231,col 40)",
        "(line 1232,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1238,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(double, int, int)",
      "begin_line": 1252,
      "end_line": 1263,
      "comment": "\n     * Decompose the shifted tridiagonal matrix T-\u0026lambda;I as LDL\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eA shifted symmetric tridiagonal matrix T can be decomposed as\n     * LDL\u003csup\u003eT\u003c/sup\u003e where L is a lower bidiagonal matrix with unit diagonal\n     * and D is a diagonal matrix. This method is an implementation of\n     * algorithm 4.4.7 from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param lambda shift to add to the matrix before decomposing it\n     * to ensure it is positive definite\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     ",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 41)",
        "(line 1254,col 9)-(line 1254,col 31)",
        "(line 1255,col 9)-(line 1262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.dqds(int, int)",
      "begin_line": 1271,
      "end_line": 1319,
      "comment": "\n     * Perform a dqds step, using current shift increment.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ5.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 46)",
        "(line 1274,col 9)-(line 1274,col 52)",
        "(line 1275,col 9)-(line 1275,col 17)",
        "(line 1276,col 9)-(line 1276,col 44)",
        "(line 1278,col 9)-(line 1296,col 9)",
        "(line 1299,col 9)-(line 1299,col 16)",
        "(line 1300,col 9)-(line 1300,col 21)",
        "(line 1301,col 9)-(line 1301,col 46)",
        "(line 1302,col 9)-(line 1302,col 41)",
        "(line 1303,col 9)-(line 1303,col 40)",
        "(line 1304,col 9)-(line 1304,col 64)",
        "(line 1305,col 9)-(line 1305,col 58)",
        "(line 1306,col 9)-(line 1306,col 35)",
        "(line 1308,col 9)-(line 1308,col 21)",
        "(line 1309,col 9)-(line 1309,col 20)",
        "(line 1310,col 9)-(line 1310,col 37)",
        "(line 1311,col 9)-(line 1311,col 40)",
        "(line 1312,col 9)-(line 1312,col 64)",
        "(line 1313,col 9)-(line 1313,col 57)",
        "(line 1314,col 9)-(line 1314,col 34)",
        "(line 1316,col 9)-(line 1316,col 26)",
        "(line 1317,col 9)-(line 1317,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.dqd(int, int)",
      "begin_line": 1328,
      "end_line": 1421,
      "comment": "\n     * Perform a dqd step.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ6.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1330,col 46)",
        "(line 1331,col 9)-(line 1331,col 46)",
        "(line 1332,col 9)-(line 1332,col 17)",
        "(line 1334,col 9)-(line 1374,col 9)",
        "(line 1377,col 9)-(line 1377,col 18)",
        "(line 1378,col 9)-(line 1378,col 21)",
        "(line 1379,col 9)-(line 1379,col 46)",
        "(line 1380,col 9)-(line 1380,col 41)",
        "(line 1381,col 9)-(line 1381,col 40)",
        "(line 1382,col 9)-(line 1395,col 9)",
        "(line 1396,col 9)-(line 1396,col 35)",
        "(line 1398,col 9)-(line 1398,col 21)",
        "(line 1399,col 9)-(line 1399,col 20)",
        "(line 1400,col 9)-(line 1400,col 37)",
        "(line 1401,col 9)-(line 1401,col 40)",
        "(line 1402,col 9)-(line 1415,col 9)",
        "(line 1416,col 9)-(line 1416,col 34)",
        "(line 1418,col 9)-(line 1418,col 26)",
        "(line 1419,col 9)-(line 1419,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(int, int, int)",
      "begin_line": 1430,
      "end_line": 1672,
      "comment": "\n     * Compute the shift increment as an estimate of the smallest eigenvalue.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLAZQ4.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @param deflated number of realEigenvalues just deflated\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 35)",
        "(line 1433,col 9)-(line 1433,col 35)",
        "(line 1434,col 9)-(line 1434,col 34)",
        "(line 1438,col 9)-(line 1442,col 9)",
        "(line 1444,col 9)-(line 1444,col 40)",
        "(line 1445,col 9)-(line 1670,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.updateSigma(double)",
      "begin_line": 1678,
      "end_line": 1692,
      "comment": "\n     * Update sigma.\n     * @param shift shift to apply to sigma\n     ",
      "child_ranges": [
        "(line 1682,col 9)-(line 1691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors()",
      "begin_line": 1697,
      "end_line": 1722,
      "comment": "\n     * Find eigenvectors.\n     ",
      "child_ranges": [
        "(line 1699,col 9)-(line 1699,col 34)",
        "(line 1700,col 9)-(line 1700,col 46)",
        "(line 1703,col 9)-(line 1703,col 41)",
        "(line 1704,col 9)-(line 1704,col 45)",
        "(line 1706,col 9)-(line 1706,col 109)",
        "(line 1707,col 9)-(line 1707,col 31)",
        "(line 1708,col 9)-(line 1708,col 18)",
        "(line 1709,col 9)-(line 1715,col 9)",
        "(line 1718,col 9)-(line 1720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(double, double[], double[])",
      "begin_line": 1733,
      "end_line": 1784,
      "comment": "\n     * Find an eigenvector corresponding to an eigenvalue, using bidiagonals.\n     * \u003cp\u003eThis method corresponds to algorithm X from Dhillon\u0027s thesis.\u003c/p\u003e\n     *\n     * @param eigenvalue eigenvalue for which eigenvector is desired\n     * @param d diagonal elements of the initial non-shifted D matrix\n     * @param l off-diagonal elements of the initial non-shifted L matrix\n     * @return an eigenvector\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1738,col 34)",
        "(line 1739,col 9)-(line 1739,col 64)",
        "(line 1740,col 9)-(line 1740,col 65)",
        "(line 1744,col 9)-(line 1744,col 22)",
        "(line 1745,col 9)-(line 1745,col 75)",
        "(line 1746,col 9)-(line 1746,col 21)",
        "(line 1747,col 9)-(line 1754,col 9)",
        "(line 1758,col 9)-(line 1758,col 45)",
        "(line 1759,col 9)-(line 1759,col 22)",
        "(line 1760,col 9)-(line 1760,col 27)",
        "(line 1761,col 9)-(line 1761,col 21)",
        "(line 1762,col 9)-(line 1766,col 9)",
        "(line 1767,col 9)-(line 1767,col 14)",
        "(line 1768,col 9)-(line 1772,col 9)",
        "(line 1775,col 9)-(line 1775,col 47)",
        "(line 1776,col 9)-(line 1778,col 9)",
        "(line 1780,col 9)-(line 1782,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1794,
      "end_line": 1812,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * L\u003csub\u003e+\u003c/sub\u003eD\u003csub\u003e+\u003c/sub\u003eL\u003csub\u003e+\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.3 (dstqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D,\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1796,col 9)-(line 1796,col 37)",
        "(line 1797,col 9)-(line 1797,col 28)",
        "(line 1798,col 9)-(line 1798,col 21)",
        "(line 1799,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1810,col 40)",
        "(line 1811,col 9)-(line 1811,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1822,
      "end_line": 1840,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * U\u003csub\u003e-\u003c/sub\u003eD\u003csub\u003e-\u003c/sub\u003eU\u003csub\u003e-\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.5 (dqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1824,col 37)",
        "(line 1825,col 9)-(line 1825,col 36)",
        "(line 1826,col 9)-(line 1826,col 33)",
        "(line 1827,col 9)-(line 1837,col 9)",
        "(line 1838,col 9)-(line 1838,col 21)",
        "(line 1839,col 9)-(line 1839,col 21)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 58,
      "end_line": 1825,
      "comment": "\n * Calculates the eigen decomposition of a \u003cstrong\u003esymmetric\u003c/strong\u003e matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m\n * matrices.\u003c/p\u003e\n * \u003cp\u003eAs of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices,\n * and hence computes only real realEigenvalues. This implies the D matrix returned by\n * {@link #getD()} is always diagonal and the imaginary values returned {@link\n * #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always null.\u003c/p\u003e\n * \u003cp\u003eWhen called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eEigenvalues are computed as soon as the matrix is decomposed, but eigenvectors\n * are computed only when required, i.e. only when one of the {@link #getEigenvector(int)},\n * {@link #getV()}, {@link #getVT()}, {@link #getSolver()} methods is called.\u003c/p\u003e\n * \u003cp\u003eThis implementation is based on Inderjit Singh Dhillon thesis\n * \u003ca href\u003d\"http://www.cs.utexas.edu/users/inderjit/public_papers/thesis.pdf\"\u003eA\n * New O(n\u003csup\u003e2\u003c/sup\u003e) Algorithm for the Symmetric Tridiagonal Eigenvalue/Eigenvector\n * Problem\u003c/a\u003e, on Beresford N. Parlett and Osni A. Marques paper \u003ca\n * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn Implementation of the\n * dqds Algorithm (Positive Case)\u003c/a\u003e and on the corresponding LAPACK routines (DLARRE,\n * DLASQ2, DLAZQ3, DLAZQ4, DLASQ5 and DLASQ6).\u003c/p\u003e\n * @author Beresford Parlett, University of California, Berkeley, USA (fortran version)\n * @author Jim Demmel, University of California, Berkeley, USA (fortran version)\n * @author Inderjit Dhillon, University of Texas, Austin, USA(fortran version)\n * @author Osni Marques, LBNL/NERSC, USA (fortran version)\n * @author Christof Voemel, University of California, Berkeley, USA(fortran version)\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE_2"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Squared tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "splitTolerance"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Split tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 70,
      "end_line": 70,
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
        "squaredSecondary"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Squared secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Transformer to tridiagonal (may be null if matrix is already tridiagonal). "
    },
    {
      "type": "field",
      "varNames": [
        "lowerSpectra"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Lower bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "upperSpectra"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Upper bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "minPivot"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Minimum pivot in the Sturm sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "sigmaLow"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Low part of the current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "tau"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Shift increment to apply. "
    },
    {
      "type": "field",
      "varNames": [
        "work"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Work array for all decomposition algorithms. "
    },
    {
      "type": "field",
      "varNames": [
        "pingPong"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Shift within qd array for ping-pong implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "qMax"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Max value of diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "eMin"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Min value of off-diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "tType"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Type of the last dqds shift. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Minimal value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin1"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Minimal value on current state of the diagonal, excluding last element. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin2"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Minimal value on current state of the diagonal, excluding last two elements. "
    },
    {
      "type": "field",
      "varNames": [
        "dN"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Last value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN1"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Last but one value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN2"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Last but two on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "g"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Shift ratio with respect to dMin used when tType \u003d\u003d 6. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 162,
      "end_line": 174,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix. \n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 186,
      "end_line": 204,
      "comment": "\n     * Calculates the eigen decomposition of the given tridiagonal symmetric matrix. \n     * @param main the main diagonal of the matrix (will be copied)\n     * @param secondary the secondary diagonal of the matrix (will be copied)\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 192,col 30)",
        "(line 195,col 9)-(line 195,col 56)",
        "(line 196,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 45)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 211,
      "end_line": 225,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 53)",
        "(line 213,col 9)-(line 213,col 56)",
        "(line 214,col 9)-(line 214,col 68)",
        "(line 215,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.decompose()",
      "begin_line": 232,
      "end_line": 248,
      "comment": "\n     * Decompose a tridiagonal symmetric matrix. \n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 24)",
        "(line 235,col 9)-(line 235,col 24)",
        "(line 236,col 9)-(line 236,col 24)",
        "(line 237,col 9)-(line 237,col 47)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 246,col 9)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
      "begin_line": 251,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 266,col 9)",
        "(line 269,col 9)-(line 269,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
      "begin_line": 274,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
      "begin_line": 284,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 299,col 9)",
        "(line 302,col 9)-(line 302,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 307,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 313,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 319,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 325,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 331,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 343,
      "end_line": 349,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 31)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 352,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 360,
      "end_line": 541,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.ArrayRealVector[])",
      "begin_line": 377,
      "end_line": 382,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues real parts of the eigenvalues\n         * @param imagEigenvalues imaginary parts of the eigenvalues\n         * @param eigenvectors eigenvectors\n         ",
      "child_ranges": [
        "(line 379,col 13)-(line 379,col 51)",
        "(line 380,col 13)-(line 380,col 51)",
        "(line 381,col 13)-(line 381,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 392,
      "end_line": 418,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 395,col 13)-(line 397,col 13)",
        "(line 399,col 13)-(line 399,col 49)",
        "(line 400,col 13)-(line 404,col 13)",
        "(line 406,col 13)-(line 406,col 46)",
        "(line 407,col 13)-(line 414,col 13)",
        "(line 416,col 13)-(line 416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 428,
      "end_line": 454,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 431,col 13)-(line 433,col 13)",
        "(line 435,col 13)-(line 435,col 49)",
        "(line 436,col 13)-(line 440,col 13)",
        "(line 442,col 13)-(line 442,col 46)",
        "(line 443,col 13)-(line 450,col 13)",
        "(line 452,col 13)-(line 452,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 464,
      "end_line": 497,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 467,col 13)-(line 469,col 13)",
        "(line 471,col 13)-(line 471,col 49)",
        "(line 472,col 13)-(line 476,col 13)",
        "(line 478,col 13)-(line 478,col 53)",
        "(line 479,col 13)-(line 479,col 55)",
        "(line 480,col 13)-(line 493,col 13)",
        "(line 495,col 13)-(line 495,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 503,
      "end_line": 510,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 504,col 13)-(line 508,col 13)",
        "(line 509,col 13)-(line 509,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 516,
      "end_line": 539,
      "comment": " Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 519,col 13)-(line 521,col 13)",
        "(line 523,col 13)-(line 523,col 49)",
        "(line 524,col 13)-(line 524,col 56)",
        "(line 526,col 13)-(line 536,col 13)",
        "(line 537,col 13)-(line 537,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 547,
      "end_line": 561,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 57)",
        "(line 551,col 9)-(line 551,col 53)",
        "(line 552,col 9)-(line 552,col 58)",
        "(line 555,col 9)-(line 555,col 56)",
        "(line 556,col 9)-(line 559,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles()",
      "begin_line": 566,
      "end_line": 599,
      "comment": "\n     * Compute the Gershgorin circles for all rows.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 38)",
        "(line 569,col 9)-(line 569,col 37)",
        "(line 570,col 9)-(line 570,col 37)",
        "(line 571,col 9)-(line 571,col 48)",
        "(line 572,col 9)-(line 572,col 48)",
        "(line 573,col 9)-(line 573,col 24)",
        "(line 575,col 9)-(line 575,col 28)",
        "(line 576,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 594,col 44)",
        "(line 595,col 9)-(line 595,col 55)",
        "(line 596,col 9)-(line 596,col 55)",
        "(line 597,col 9)-(line 597,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues()",
      "begin_line": 605,
      "end_line": 676,
      "comment": "\n     * Find the realEigenvalues.\n     * @exception InvalidMatrixException if a block cannot be diagonalized\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 53)",
        "(line 612,col 9)-(line 612,col 50)",
        "(line 613,col 9)-(line 613,col 50)",
        "(line 614,col 9)-(line 614,col 22)",
        "(line 615,col 9)-(line 666,col 9)",
        "(line 669,col 9)-(line 669,col 37)",
        "(line 670,col 9)-(line 674,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits()",
      "begin_line": 682,
      "end_line": 702,
      "comment": "\n     * Compute splitting points.\n     * @return list of indices after matrix can be split\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 60)",
        "(line 687,col 9)-(line 687,col 47)",
        "(line 688,col 9)-(line 697,col 9)",
        "(line 699,col 9)-(line 699,col 39)",
        "(line 700,col 9)-(line 700,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(int)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * Find eigenvalue in a block with 1 row.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(int)",
      "begin_line": 719,
      "end_line": 739,
      "comment": "\n     * Find realEigenvalues in a block with 2 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if characteristic polynomial cannot be solved\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 40)",
        "(line 725,col 9)-(line 725,col 44)",
        "(line 726,col 9)-(line 726,col 52)",
        "(line 728,col 9)-(line 728,col 37)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 730,col 43)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 64)",
        "(line 736,col 9)-(line 736,col 49)",
        "(line 737,col 9)-(line 737,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(int)",
      "begin_line": 747,
      "end_line": 801,
      "comment": "\n     * Find realEigenvalues in a block with 3 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if diagonal elements are not positive\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 44)",
        "(line 753,col 9)-(line 753,col 48)",
        "(line 754,col 9)-(line 754,col 48)",
        "(line 755,col 9)-(line 755,col 56)",
        "(line 756,col 9)-(line 756,col 70)",
        "(line 759,col 9)-(line 759,col 48)",
        "(line 760,col 9)-(line 760,col 67)",
        "(line 761,col 9)-(line 761,col 57)",
        "(line 764,col 9)-(line 764,col 38)",
        "(line 765,col 9)-(line 765,col 49)",
        "(line 766,col 9)-(line 766,col 69)",
        "(line 767,col 9)-(line 767,col 50)",
        "(line 768,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 44)",
        "(line 775,col 9)-(line 775,col 59)",
        "(line 776,col 9)-(line 776,col 41)",
        "(line 777,col 9)-(line 777,col 36)",
        "(line 779,col 9)-(line 779,col 55)",
        "(line 780,col 9)-(line 780,col 71)",
        "(line 781,col 9)-(line 781,col 71)",
        "(line 782,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 40)",
        "(line 798,col 9)-(line 798,col 40)",
        "(line 799,col 9)-(line 799,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(int)",
      "begin_line": 814,
      "end_line": 920,
      "comment": "\n     * Find realEigenvalues using dqd/dqds algorithms.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLASQ2.\u003c/p\u003e\n     * @param n number of rows of the block\n     * @exception InvalidMatrixException if block cannot be diagonalized\n     * after 30 * n iterations\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 30)",
        "(line 819,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 828,col 9)",
        "(line 831,col 9)-(line 831,col 30)",
        "(line 834,col 9)-(line 834,col 25)",
        "(line 837,col 9)-(line 837,col 18)",
        "(line 838,col 9)-(line 838,col 18)",
        "(line 839,col 9)-(line 839,col 18)",
        "(line 840,col 9)-(line 840,col 18)",
        "(line 841,col 9)-(line 841,col 18)",
        "(line 842,col 9)-(line 842,col 18)",
        "(line 843,col 9)-(line 843,col 18)",
        "(line 846,col 9)-(line 846,col 19)",
        "(line 847,col 9)-(line 847,col 19)",
        "(line 848,col 9)-(line 918,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(int)",
      "begin_line": 926,
      "end_line": 969,
      "comment": "\n     * Perform two iterations with Li\u0027s tests for initial splits.\n     * @param n number of rows of the matrix to process\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 21)",
        "(line 929,col 9)-(line 967,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(int, int)",
      "begin_line": 982,
      "end_line": 1114,
      "comment": "\n     * Perform one \"good\" dqd/dqds step.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLAZQ3.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @return new end (maybe deflated)\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 16)",
        "(line 987,col 9)-(line 987,col 30)",
        "(line 988,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 53)",
        "(line 1044,col 9)-(line 1056,col 9)",
        "(line 1058,col 9)-(line 1107,col 9)",
        "(line 1110,col 9)-(line 1110,col 32)",
        "(line 1112,col 9)-(line 1112,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(int, int)",
      "begin_line": 1123,
      "end_line": 1136,
      "comment": "\n     * Flip qd array if warranted.\n     * @param n number of rows in the block\n     * @param step within the array (1 for flipping all elements, 2 for flipping\n     * only every other element)\n     * @return true if qd array was flipped\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(int, int)",
      "begin_line": 1144,
      "end_line": 1210,
      "comment": "\n     * Compute an interval containing all realEigenvalues of a block.\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return an interval containing the realEigenvalues\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 47)",
        "(line 1148,col 9)-(line 1148,col 47)",
        "(line 1149,col 9)-(line 1149,col 48)",
        "(line 1150,col 9)-(line 1150,col 48)",
        "(line 1151,col 9)-(line 1154,col 9)",
        "(line 1157,col 9)-(line 1157,col 72)",
        "(line 1158,col 9)-(line 1158,col 70)",
        "(line 1159,col 9)-(line 1159,col 54)",
        "(line 1160,col 9)-(line 1161,col 90)",
        "(line 1162,col 9)-(line 1162,col 81)",
        "(line 1165,col 9)-(line 1165,col 38)",
        "(line 1166,col 9)-(line 1166,col 38)",
        "(line 1167,col 9)-(line 1183,col 9)",
        "(line 1184,col 9)-(line 1184,col 81)",
        "(line 1187,col 9)-(line 1187,col 31)",
        "(line 1188,col 9)-(line 1188,col 31)",
        "(line 1189,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1206,col 83)",
        "(line 1208,col 9)-(line 1208,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(double, int, int)",
      "begin_line": 1219,
      "end_line": 1229,
      "comment": "\n     * Count the number of realEigenvalues below a point.\n     * @param t value below which we must count the number of realEigenvalues\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return number of realEigenvalues smaller than t\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 39)",
        "(line 1221,col 9)-(line 1221,col 40)",
        "(line 1222,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1228,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(double, int, int)",
      "begin_line": 1242,
      "end_line": 1253,
      "comment": "\n     * Decompose the shifted tridiagonal matrix T-\u0026lambda;I as LDL\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eA shifted symmetric tridiagonal matrix T can be decomposed as\n     * LDL\u003csup\u003eT\u003c/sup\u003e where L is a lower bidiagonal matrix with unit diagonal\n     * and D is a diagonal matrix. This method is an implementation of\n     * algorithm 4.4.7 from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param lambda shift to add to the matrix before decomposing it\n     * to ensure it is positive definite\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 41)",
        "(line 1244,col 9)-(line 1244,col 31)",
        "(line 1245,col 9)-(line 1252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.dqds(int, int)",
      "begin_line": 1261,
      "end_line": 1309,
      "comment": "\n     * Perform a dqds step, using current shift increment.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ5.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1263,col 9)-(line 1263,col 46)",
        "(line 1264,col 9)-(line 1264,col 52)",
        "(line 1265,col 9)-(line 1265,col 17)",
        "(line 1266,col 9)-(line 1266,col 44)",
        "(line 1268,col 9)-(line 1286,col 9)",
        "(line 1289,col 9)-(line 1289,col 16)",
        "(line 1290,col 9)-(line 1290,col 21)",
        "(line 1291,col 9)-(line 1291,col 46)",
        "(line 1292,col 9)-(line 1292,col 41)",
        "(line 1293,col 9)-(line 1293,col 40)",
        "(line 1294,col 9)-(line 1294,col 64)",
        "(line 1295,col 9)-(line 1295,col 58)",
        "(line 1296,col 9)-(line 1296,col 35)",
        "(line 1298,col 9)-(line 1298,col 21)",
        "(line 1299,col 9)-(line 1299,col 20)",
        "(line 1300,col 9)-(line 1300,col 37)",
        "(line 1301,col 9)-(line 1301,col 40)",
        "(line 1302,col 9)-(line 1302,col 64)",
        "(line 1303,col 9)-(line 1303,col 57)",
        "(line 1304,col 9)-(line 1304,col 34)",
        "(line 1306,col 9)-(line 1306,col 26)",
        "(line 1307,col 9)-(line 1307,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.dqd(int, int)",
      "begin_line": 1318,
      "end_line": 1411,
      "comment": "\n     * Perform a dqd step.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ6.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 46)",
        "(line 1321,col 9)-(line 1321,col 46)",
        "(line 1322,col 9)-(line 1322,col 17)",
        "(line 1324,col 9)-(line 1364,col 9)",
        "(line 1367,col 9)-(line 1367,col 18)",
        "(line 1368,col 9)-(line 1368,col 21)",
        "(line 1369,col 9)-(line 1369,col 46)",
        "(line 1370,col 9)-(line 1370,col 41)",
        "(line 1371,col 9)-(line 1371,col 40)",
        "(line 1372,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1386,col 35)",
        "(line 1388,col 9)-(line 1388,col 21)",
        "(line 1389,col 9)-(line 1389,col 20)",
        "(line 1390,col 9)-(line 1390,col 37)",
        "(line 1391,col 9)-(line 1391,col 40)",
        "(line 1392,col 9)-(line 1405,col 9)",
        "(line 1406,col 9)-(line 1406,col 34)",
        "(line 1408,col 9)-(line 1408,col 26)",
        "(line 1409,col 9)-(line 1409,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(int, int, int)",
      "begin_line": 1420,
      "end_line": 1662,
      "comment": "\n     * Compute the shift increment as an estimate of the smallest eigenvalue.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLAZQ4.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @param deflated number of realEigenvalues just deflated\n     ",
      "child_ranges": [
        "(line 1422,col 9)-(line 1422,col 35)",
        "(line 1423,col 9)-(line 1423,col 35)",
        "(line 1424,col 9)-(line 1424,col 34)",
        "(line 1428,col 9)-(line 1432,col 9)",
        "(line 1434,col 9)-(line 1434,col 40)",
        "(line 1435,col 9)-(line 1660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.updateSigma(double)",
      "begin_line": 1668,
      "end_line": 1682,
      "comment": "\n     * Update sigma.\n     * @param tau shift to apply to sigma\n     ",
      "child_ranges": [
        "(line 1672,col 9)-(line 1681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors()",
      "begin_line": 1687,
      "end_line": 1710,
      "comment": "\n     * Find eigenvectors.\n     ",
      "child_ranges": [
        "(line 1689,col 9)-(line 1689,col 34)",
        "(line 1690,col 9)-(line 1690,col 46)",
        "(line 1693,col 9)-(line 1693,col 41)",
        "(line 1694,col 9)-(line 1694,col 45)",
        "(line 1695,col 9)-(line 1695,col 28)",
        "(line 1696,col 9)-(line 1696,col 18)",
        "(line 1697,col 9)-(line 1703,col 9)",
        "(line 1706,col 9)-(line 1708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(double, double[], double[])",
      "begin_line": 1721,
      "end_line": 1771,
      "comment": "\n     * Find an eigenvector corresponding to an eigenvalue, using bidiagonals.\n     * \u003cp\u003eThis method corresponds to algorithm X from Dhillon\u0027s thesis.\u003c/p\u003e\n     * \n     * @param eigenvalue eigenvalue for which eigenvector is desired\n     * @param d diagonal elements of the initial non-shifted D matrix\n     * @param l off-diagonal elements of the initial non-shifted L matrix\n     * @return an eigenvector\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1726,col 34)",
        "(line 1727,col 9)-(line 1727,col 64)",
        "(line 1728,col 9)-(line 1728,col 65)",
        "(line 1732,col 9)-(line 1732,col 22)",
        "(line 1733,col 9)-(line 1733,col 75)",
        "(line 1734,col 9)-(line 1741,col 9)",
        "(line 1745,col 9)-(line 1745,col 45)",
        "(line 1746,col 9)-(line 1746,col 22)",
        "(line 1747,col 9)-(line 1747,col 27)",
        "(line 1748,col 9)-(line 1748,col 21)",
        "(line 1749,col 9)-(line 1753,col 9)",
        "(line 1754,col 9)-(line 1754,col 14)",
        "(line 1755,col 9)-(line 1759,col 9)",
        "(line 1762,col 9)-(line 1762,col 47)",
        "(line 1763,col 9)-(line 1765,col 9)",
        "(line 1767,col 9)-(line 1769,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1781,
      "end_line": 1797,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * L\u003csub\u003e+\u003c/sub\u003eD\u003csub\u003e+\u003c/sub\u003eL\u003csub\u003e+\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.3 (dstqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D,\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1783,col 9)-(line 1783,col 37)",
        "(line 1784,col 9)-(line 1784,col 28)",
        "(line 1785,col 9)-(line 1794,col 9)",
        "(line 1795,col 9)-(line 1795,col 40)",
        "(line 1796,col 9)-(line 1796,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1807,
      "end_line": 1823,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * U\u003csub\u003e-\u003c/sub\u003eD\u003csub\u003e-\u003c/sub\u003eU\u003csub\u003e-\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.5 (dqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1809,col 37)",
        "(line 1810,col 9)-(line 1810,col 36)",
        "(line 1811,col 9)-(line 1820,col 9)",
        "(line 1821,col 9)-(line 1821,col 21)",
        "(line 1822,col 9)-(line 1822,col 21)"
      ]
    }
  ]
}
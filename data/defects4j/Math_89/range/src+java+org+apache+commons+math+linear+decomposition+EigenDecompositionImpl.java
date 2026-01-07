{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/linear/decomposition/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.EigenDecomposition"
      ],
      "begin_line": 63,
      "end_line": 1836,
      "comment": "\n * Calculates the eigen decomposition of a \u003cstrong\u003esymmetric\u003c/strong\u003e matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m\n * matrices.\u003c/p\u003e\n * \u003cp\u003eAs of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices,\n * and hence computes only real realEigenvalues. This implies the D matrix returned by\n * {@link #getD()} is always diagonal and the imaginary values returned {@link\n * #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always null.\u003c/p\u003e\n * \u003cp\u003eWhen called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eEigenvalues are computed as soon as the matrix is decomposed, but eigenvectors\n * are computed only when required, i.e. only when one of the {@link #getEigenvector(int)},\n * {@link #getV()}, {@link #getVT()}, {@link #getSolver()} methods is called.\u003c/p\u003e\n * \u003cp\u003eThis implementation is based on Inderjit Singh Dhillon thesis\n * \u003ca href\u003d\"http://www.cs.utexas.edu/users/inderjit/public_papers/thesis.pdf\"\u003eA\n * New O(n\u003csup\u003e2\u003c/sup\u003e) Algorithm for the Symmetric Tridiagonal Eigenvalue/Eigenvector\n * Problem\u003c/a\u003e, on Beresford N. Parlett and Osni A. Marques paper \u003ca\n * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn Implementation of the\n * dqds Algorithm (Positive Case)\u003c/a\u003e and on the corresponding LAPACK routines (DLARRE,\n * DLASQ2, DLAZQ3, DLAZQ4, DLASQ5 and DLASQ6).\u003c/p\u003e\n * @author Beresford Parlett, University of California, Berkeley, USA (fortran version)\n * @author Jim Demmel, University of California, Berkeley, USA (fortran version)\n * @author Inderjit Dhillon, University of Texas, Austin, USA(fortran version)\n * @author Osni Marques, LBNL/NERSC, USA (fortran version)\n * @author Christof Voemel, University of California, Berkeley, USA(fortran version)\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE_2"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Squared tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "splitTolerance"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Split tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 78,
      "end_line": 78,
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
        "squaredSecondary"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Squared secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Transformer to tridiagonal (may be null if matrix is already tridiagonal). "
    },
    {
      "type": "field",
      "varNames": [
        "lowerSpectra"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Lower bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "upperSpectra"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Upper bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "minPivot"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Minimum pivot in the Sturm sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "sigmaLow"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Low part of the current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "tau"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Shift increment to apply. "
    },
    {
      "type": "field",
      "varNames": [
        "work"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Work array for all decomposition algorithms. "
    },
    {
      "type": "field",
      "varNames": [
        "pingPong"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Shift within qd array for ping-pong implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "qMax"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Max value of diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "eMin"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Min value of off-diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "tType"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Type of the last dqds shift. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Minimal value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin1"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Minimal value on current state of the diagonal, excluding last element. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin2"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Minimal value on current state of the diagonal, excluding last two elements. "
    },
    {
      "type": "field",
      "varNames": [
        "dN"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Last value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN1"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Last but one value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN2"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Last but two on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "g"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " Shift ratio with respect to dMin used when tType \u003d\u003d 6. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 170,
      "end_line": 182,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix. \n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 194,
      "end_line": 212,
      "comment": "\n     * Calculates the eigen decomposition of the given tridiagonal symmetric matrix. \n     * @param main the main diagonal of the matrix (will be copied)\n     * @param secondary the secondary diagonal of the matrix (will be copied)\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 38)",
        "(line 199,col 9)-(line 199,col 43)",
        "(line 200,col 9)-(line 200,col 30)",
        "(line 203,col 9)-(line 203,col 56)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 45)",
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 219,
      "end_line": 233,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 53)",
        "(line 221,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 222,col 68)",
        "(line 223,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.decompose()",
      "begin_line": 240,
      "end_line": 256,
      "comment": "\n     * Decompose a tridiagonal symmetric matrix. \n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 24)",
        "(line 243,col 9)-(line 243,col 24)",
        "(line 244,col 9)-(line 244,col 24)",
        "(line 245,col 9)-(line 245,col 47)",
        "(line 248,col 9)-(line 248,col 35)",
        "(line 251,col 9)-(line 251,col 26)",
        "(line 254,col 9)-(line 254,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getV()",
      "begin_line": 259,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 277,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getD()",
      "begin_line": 282,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getVT()",
      "begin_line": 292,
      "end_line": 312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 307,col 9)",
        "(line 310,col 9)-(line 310,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 315,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 321,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 327,
      "end_line": 330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 333,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 339,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 351,
      "end_line": 357,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 31)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getSolver()",
      "begin_line": 360,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.DecompositionSolver"
      ],
      "begin_line": 368,
      "end_line": 552,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.RealVectorImpl[])",
      "begin_line": 388,
      "end_line": 393,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues real parts of the eigenvalues\n         * @param imagEigenvalues imaginary parts of the eigenvalues\n         * @param eigenvectors eigenvectors\n         ",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 51)",
        "(line 391,col 13)-(line 391,col 51)",
        "(line 392,col 13)-(line 392,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 403,
      "end_line": 429,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 406,col 13)-(line 408,col 13)",
        "(line 410,col 13)-(line 410,col 49)",
        "(line 411,col 13)-(line 415,col 13)",
        "(line 417,col 13)-(line 417,col 46)",
        "(line 418,col 13)-(line 425,col 13)",
        "(line 427,col 13)-(line 427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 439,
      "end_line": 465,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 442,col 13)-(line 444,col 13)",
        "(line 446,col 13)-(line 446,col 49)",
        "(line 447,col 13)-(line 451,col 13)",
        "(line 453,col 13)-(line 453,col 46)",
        "(line 454,col 13)-(line 461,col 13)",
        "(line 463,col 13)-(line 463,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 475,
      "end_line": 508,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 478,col 13)-(line 480,col 13)",
        "(line 482,col 13)-(line 482,col 49)",
        "(line 483,col 13)-(line 487,col 13)",
        "(line 489,col 13)-(line 489,col 53)",
        "(line 490,col 13)-(line 490,col 55)",
        "(line 491,col 13)-(line 504,col 13)",
        "(line 506,col 13)-(line 506,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 514,
      "end_line": 521,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 515,col 13)-(line 519,col 13)",
        "(line 520,col 13)-(line 520,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 527,
      "end_line": 550,
      "comment": " Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 530,col 13)-(line 532,col 13)",
        "(line 534,col 13)-(line 534,col 49)",
        "(line 535,col 13)-(line 535,col 56)",
        "(line 537,col 13)-(line 547,col 13)",
        "(line 548,col 13)-(line 548,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 558,
      "end_line": 572,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 57)",
        "(line 562,col 9)-(line 562,col 53)",
        "(line 563,col 9)-(line 563,col 58)",
        "(line 566,col 9)-(line 566,col 56)",
        "(line 567,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.computeGershgorinCircles()",
      "begin_line": 577,
      "end_line": 610,
      "comment": "\n     * Compute the Gershgorin circles for all rows.\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 38)",
        "(line 580,col 9)-(line 580,col 37)",
        "(line 581,col 9)-(line 581,col 37)",
        "(line 582,col 9)-(line 582,col 48)",
        "(line 583,col 9)-(line 583,col 48)",
        "(line 584,col 9)-(line 584,col 24)",
        "(line 586,col 9)-(line 586,col 28)",
        "(line 587,col 9)-(line 603,col 9)",
        "(line 605,col 9)-(line 605,col 44)",
        "(line 606,col 9)-(line 606,col 55)",
        "(line 607,col 9)-(line 607,col 55)",
        "(line 608,col 9)-(line 608,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.findEigenvalues()",
      "begin_line": 616,
      "end_line": 687,
      "comment": "\n     * Find the realEigenvalues.\n     * @exception InvalidMatrixException if a block cannot be diagonalized\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 53)",
        "(line 623,col 9)-(line 623,col 50)",
        "(line 624,col 9)-(line 624,col 50)",
        "(line 625,col 9)-(line 625,col 22)",
        "(line 626,col 9)-(line 677,col 9)",
        "(line 680,col 9)-(line 680,col 37)",
        "(line 681,col 9)-(line 685,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.computeSplits()",
      "begin_line": 693,
      "end_line": 713,
      "comment": "\n     * Compute splitting points.\n     * @return list of indices after matrix can be split\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 60)",
        "(line 698,col 9)-(line 698,col 47)",
        "(line 699,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 39)",
        "(line 711,col 9)-(line 711,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.process1RowBlock(int)",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\n     * Find eigenvalue in a block with 1 row.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.process2RowsBlock(int)",
      "begin_line": 730,
      "end_line": 750,
      "comment": "\n     * Find realEigenvalues in a block with 2 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if characteristic polynomial cannot be solved\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 40)",
        "(line 736,col 9)-(line 736,col 44)",
        "(line 737,col 9)-(line 737,col 52)",
        "(line 739,col 9)-(line 739,col 37)",
        "(line 740,col 9)-(line 740,col 43)",
        "(line 741,col 9)-(line 741,col 43)",
        "(line 742,col 9)-(line 744,col 9)",
        "(line 746,col 9)-(line 746,col 64)",
        "(line 747,col 9)-(line 747,col 49)",
        "(line 748,col 9)-(line 748,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.process3RowsBlock(int)",
      "begin_line": 758,
      "end_line": 812,
      "comment": "\n     * Find realEigenvalues in a block with 3 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if diagonal elements are not positive\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 44)",
        "(line 764,col 9)-(line 764,col 48)",
        "(line 765,col 9)-(line 765,col 48)",
        "(line 766,col 9)-(line 766,col 56)",
        "(line 767,col 9)-(line 767,col 70)",
        "(line 770,col 9)-(line 770,col 48)",
        "(line 771,col 9)-(line 771,col 67)",
        "(line 772,col 9)-(line 772,col 57)",
        "(line 775,col 9)-(line 775,col 38)",
        "(line 776,col 9)-(line 776,col 49)",
        "(line 777,col 9)-(line 777,col 69)",
        "(line 778,col 9)-(line 778,col 50)",
        "(line 779,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 44)",
        "(line 786,col 9)-(line 786,col 59)",
        "(line 787,col 9)-(line 787,col 41)",
        "(line 788,col 9)-(line 788,col 36)",
        "(line 790,col 9)-(line 790,col 55)",
        "(line 791,col 9)-(line 791,col 71)",
        "(line 792,col 9)-(line 792,col 71)",
        "(line 793,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 40)",
        "(line 809,col 9)-(line 809,col 40)",
        "(line 810,col 9)-(line 810,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.processGeneralBlock(int)",
      "begin_line": 825,
      "end_line": 931,
      "comment": "\n     * Find realEigenvalues using dqd/dqds algorithms.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLASQ2.\u003c/p\u003e\n     * @param n number of rows of the block\n     * @exception InvalidMatrixException if block cannot be diagonalized\n     * after 30 * n iterations\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 30)",
        "(line 830,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 839,col 9)",
        "(line 842,col 9)-(line 842,col 30)",
        "(line 845,col 9)-(line 845,col 25)",
        "(line 848,col 9)-(line 848,col 18)",
        "(line 849,col 9)-(line 849,col 18)",
        "(line 850,col 9)-(line 850,col 18)",
        "(line 851,col 9)-(line 851,col 18)",
        "(line 852,col 9)-(line 852,col 18)",
        "(line 853,col 9)-(line 853,col 18)",
        "(line 854,col 9)-(line 854,col 18)",
        "(line 857,col 9)-(line 857,col 19)",
        "(line 858,col 9)-(line 858,col 19)",
        "(line 859,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.initialSplits(int)",
      "begin_line": 937,
      "end_line": 980,
      "comment": "\n     * Perform two iterations with Li\u0027s tests for initial splits.\n     * @param n number of rows of the matrix to process\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 21)",
        "(line 940,col 9)-(line 978,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.goodStep(int, int)",
      "begin_line": 993,
      "end_line": 1125,
      "comment": "\n     * Perform one \"good\" dqd/dqds step.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLAZQ3.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @return new end (maybe deflated)\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 16)",
        "(line 998,col 9)-(line 998,col 30)",
        "(line 999,col 9)-(line 1050,col 9)",
        "(line 1052,col 9)-(line 1052,col 53)",
        "(line 1055,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1118,col 9)",
        "(line 1121,col 9)-(line 1121,col 32)",
        "(line 1123,col 9)-(line 1123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.flipIfWarranted(int, int)",
      "begin_line": 1134,
      "end_line": 1147,
      "comment": "\n     * Flip qd array if warranted.\n     * @param n number of rows in the block\n     * @param step within the array (1 for flipping all elements, 2 for flipping\n     * only every other element)\n     * @return true if qd array was flipped\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1145,col 9)",
        "(line 1146,col 9)-(line 1146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.eigenvaluesRange(int, int)",
      "begin_line": 1155,
      "end_line": 1221,
      "comment": "\n     * Compute an interval containing all realEigenvalues of a block.\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return an interval containing the realEigenvalues\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 47)",
        "(line 1159,col 9)-(line 1159,col 47)",
        "(line 1160,col 9)-(line 1160,col 48)",
        "(line 1161,col 9)-(line 1161,col 48)",
        "(line 1162,col 9)-(line 1165,col 9)",
        "(line 1168,col 9)-(line 1168,col 72)",
        "(line 1169,col 9)-(line 1169,col 70)",
        "(line 1170,col 9)-(line 1170,col 54)",
        "(line 1171,col 9)-(line 1172,col 90)",
        "(line 1173,col 9)-(line 1173,col 81)",
        "(line 1176,col 9)-(line 1176,col 38)",
        "(line 1177,col 9)-(line 1177,col 38)",
        "(line 1178,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1195,col 81)",
        "(line 1198,col 9)-(line 1198,col 31)",
        "(line 1199,col 9)-(line 1199,col 31)",
        "(line 1200,col 9)-(line 1216,col 9)",
        "(line 1217,col 9)-(line 1217,col 83)",
        "(line 1219,col 9)-(line 1219,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.countEigenValues(double, int, int)",
      "begin_line": 1230,
      "end_line": 1240,
      "comment": "\n     * Count the number of realEigenvalues below a point.\n     * @param t value below which we must count the number of realEigenvalues\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return number of realEigenvalues smaller than t\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 39)",
        "(line 1232,col 9)-(line 1232,col 40)",
        "(line 1233,col 9)-(line 1238,col 9)",
        "(line 1239,col 9)-(line 1239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.ldlTDecomposition(double, int, int)",
      "begin_line": 1253,
      "end_line": 1264,
      "comment": "\n     * Decompose the shifted tridiagonal matrix T-\u0026lambda;I as LDL\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eA shifted symmetric tridiagonal matrix T can be decomposed as\n     * LDL\u003csup\u003eT\u003c/sup\u003e where L is a lower bidiagonal matrix with unit diagonal\n     * and D is a diagonal matrix. This method is an implementation of\n     * algorithm 4.4.7 from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param lambda shift to add to the matrix before decomposing it\n     * to ensure it is positive definite\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 41)",
        "(line 1255,col 9)-(line 1255,col 31)",
        "(line 1256,col 9)-(line 1263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.dqds(int, int)",
      "begin_line": 1272,
      "end_line": 1320,
      "comment": "\n     * Perform a dqds step, using current shift increment.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ5.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 46)",
        "(line 1275,col 9)-(line 1275,col 52)",
        "(line 1276,col 9)-(line 1276,col 17)",
        "(line 1277,col 9)-(line 1277,col 44)",
        "(line 1279,col 9)-(line 1297,col 9)",
        "(line 1300,col 9)-(line 1300,col 16)",
        "(line 1301,col 9)-(line 1301,col 21)",
        "(line 1302,col 9)-(line 1302,col 46)",
        "(line 1303,col 9)-(line 1303,col 41)",
        "(line 1304,col 9)-(line 1304,col 40)",
        "(line 1305,col 9)-(line 1305,col 64)",
        "(line 1306,col 9)-(line 1306,col 58)",
        "(line 1307,col 9)-(line 1307,col 35)",
        "(line 1309,col 9)-(line 1309,col 21)",
        "(line 1310,col 9)-(line 1310,col 20)",
        "(line 1311,col 9)-(line 1311,col 37)",
        "(line 1312,col 9)-(line 1312,col 40)",
        "(line 1313,col 9)-(line 1313,col 64)",
        "(line 1314,col 9)-(line 1314,col 57)",
        "(line 1315,col 9)-(line 1315,col 34)",
        "(line 1317,col 9)-(line 1317,col 26)",
        "(line 1318,col 9)-(line 1318,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.dqd(int, int)",
      "begin_line": 1329,
      "end_line": 1422,
      "comment": "\n     * Perform a dqd step.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ6.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 46)",
        "(line 1332,col 9)-(line 1332,col 46)",
        "(line 1333,col 9)-(line 1333,col 17)",
        "(line 1335,col 9)-(line 1375,col 9)",
        "(line 1378,col 9)-(line 1378,col 18)",
        "(line 1379,col 9)-(line 1379,col 21)",
        "(line 1380,col 9)-(line 1380,col 46)",
        "(line 1381,col 9)-(line 1381,col 41)",
        "(line 1382,col 9)-(line 1382,col 40)",
        "(line 1383,col 9)-(line 1396,col 9)",
        "(line 1397,col 9)-(line 1397,col 35)",
        "(line 1399,col 9)-(line 1399,col 21)",
        "(line 1400,col 9)-(line 1400,col 20)",
        "(line 1401,col 9)-(line 1401,col 37)",
        "(line 1402,col 9)-(line 1402,col 40)",
        "(line 1403,col 9)-(line 1416,col 9)",
        "(line 1417,col 9)-(line 1417,col 34)",
        "(line 1419,col 9)-(line 1419,col 26)",
        "(line 1420,col 9)-(line 1420,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.computeShiftIncrement(int, int, int)",
      "begin_line": 1431,
      "end_line": 1673,
      "comment": "\n     * Compute the shift increment as an estimate of the smallest eigenvalue.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLAZQ4.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @param deflated number of realEigenvalues just deflated\n     ",
      "child_ranges": [
        "(line 1433,col 9)-(line 1433,col 35)",
        "(line 1434,col 9)-(line 1434,col 35)",
        "(line 1435,col 9)-(line 1435,col 34)",
        "(line 1439,col 9)-(line 1443,col 9)",
        "(line 1445,col 9)-(line 1445,col 40)",
        "(line 1446,col 9)-(line 1671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.updateSigma(double)",
      "begin_line": 1679,
      "end_line": 1693,
      "comment": "\n     * Update sigma.\n     * @param tau shift to apply to sigma\n     ",
      "child_ranges": [
        "(line 1683,col 9)-(line 1692,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.findEigenVectors()",
      "begin_line": 1698,
      "end_line": 1721,
      "comment": "\n     * Find eigenvectors.\n     ",
      "child_ranges": [
        "(line 1700,col 9)-(line 1700,col 34)",
        "(line 1701,col 9)-(line 1701,col 45)",
        "(line 1704,col 9)-(line 1704,col 41)",
        "(line 1705,col 9)-(line 1705,col 45)",
        "(line 1706,col 9)-(line 1706,col 28)",
        "(line 1707,col 9)-(line 1707,col 18)",
        "(line 1708,col 9)-(line 1714,col 9)",
        "(line 1717,col 9)-(line 1719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.findEigenvector(double, double[], double[])",
      "begin_line": 1732,
      "end_line": 1782,
      "comment": "\n     * Find an eigenvector corresponding to an eigenvalue, using bidiagonals.\n     * \u003cp\u003eThis method corresponds to algorithm X from Dhillon\u0027s thesis.\u003c/p\u003e\n     * \n     * @param eigenvalue eigenvalue for which eigenvector is desired\n     * @param d diagonal elements of the initial non-shifted D matrix\n     * @param l off-diagonal elements of the initial non-shifted L matrix\n     * @return an eigenvector\n     ",
      "child_ranges": [
        "(line 1737,col 9)-(line 1737,col 34)",
        "(line 1738,col 9)-(line 1738,col 64)",
        "(line 1739,col 9)-(line 1739,col 65)",
        "(line 1743,col 9)-(line 1743,col 22)",
        "(line 1744,col 9)-(line 1744,col 75)",
        "(line 1745,col 9)-(line 1752,col 9)",
        "(line 1756,col 9)-(line 1756,col 45)",
        "(line 1757,col 9)-(line 1757,col 22)",
        "(line 1758,col 9)-(line 1758,col 27)",
        "(line 1759,col 9)-(line 1759,col 21)",
        "(line 1760,col 9)-(line 1764,col 9)",
        "(line 1765,col 9)-(line 1765,col 14)",
        "(line 1766,col 9)-(line 1770,col 9)",
        "(line 1773,col 9)-(line 1773,col 47)",
        "(line 1774,col 9)-(line 1776,col 9)",
        "(line 1778,col 9)-(line 1780,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1792,
      "end_line": 1808,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * L\u003csub\u003e+\u003c/sub\u003eD\u003csub\u003e+\u003c/sub\u003eL\u003csub\u003e+\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.3 (dstqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D,\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1794,col 9)-(line 1794,col 37)",
        "(line 1795,col 9)-(line 1795,col 28)",
        "(line 1796,col 9)-(line 1805,col 9)",
        "(line 1806,col 9)-(line 1806,col 40)",
        "(line 1807,col 9)-(line 1807,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1818,
      "end_line": 1834,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * U\u003csub\u003e-\u003c/sub\u003eD\u003csub\u003e-\u003c/sub\u003eU\u003csub\u003e-\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.5 (dqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1820,col 9)-(line 1820,col 37)",
        "(line 1821,col 9)-(line 1821,col 36)",
        "(line 1822,col 9)-(line 1831,col 9)",
        "(line 1832,col 9)-(line 1832,col 21)",
        "(line 1833,col 9)-(line 1833,col 21)"
      ]
    }
  ]
}
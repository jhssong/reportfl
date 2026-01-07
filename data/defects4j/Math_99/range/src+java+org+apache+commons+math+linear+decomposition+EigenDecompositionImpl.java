{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/linear/decomposition/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.EigenDecomposition"
      ],
      "begin_line": 63,
      "end_line": 1840,
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
      "end_line": 183,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix. \n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 195,
      "end_line": 213,
      "comment": "\n     * Calculates the eigen decomposition of the given tridiagonal symmetric matrix. \n     * @param main the main diagonal of the matrix (will be copied)\n     * @param secondary the secondary diagonal of the matrix (will be copied)\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 43)",
        "(line 201,col 9)-(line 201,col 30)",
        "(line 204,col 9)-(line 204,col 56)",
        "(line 205,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 220,
      "end_line": 234,
      "comment": "\n     * Check if a matrix is symmetric.\n     * @param matrix matrix to check\n     * @return true if matrix is symmetric\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 53)",
        "(line 222,col 9)-(line 222,col 56)",
        "(line 223,col 9)-(line 223,col 68)",
        "(line 224,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.decompose()",
      "begin_line": 241,
      "end_line": 257,
      "comment": "\n     * Decompose a tridiagonal symmetric matrix. \n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 24)",
        "(line 244,col 9)-(line 244,col 24)",
        "(line 245,col 9)-(line 245,col 24)",
        "(line 246,col 9)-(line 246,col 47)",
        "(line 249,col 9)-(line 249,col 35)",
        "(line 252,col 9)-(line 252,col 26)",
        "(line 255,col 9)-(line 255,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getV()",
      "begin_line": 260,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 278,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getD()",
      "begin_line": 283,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getVT()",
      "begin_line": 293,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 308,col 9)",
        "(line 311,col 9)-(line 311,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 316,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 322,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 328,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 334,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getEigenvector(int)",
      "begin_line": 340,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 352,
      "end_line": 358,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.getSolver()",
      "begin_line": 361,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.DecompositionSolver"
      ],
      "begin_line": 369,
      "end_line": 556,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.RealVectorImpl[])",
      "begin_line": 389,
      "end_line": 394,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues real parts of the eigenvalues\n         * @param imagEigenvalues imaginary parts of the eigenvalues\n         * @param eigenvectors eigenvectors\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 51)",
        "(line 392,col 13)-(line 392,col 51)",
        "(line 393,col 13)-(line 393,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 404,
      "end_line": 430,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 407,col 13)-(line 409,col 13)",
        "(line 411,col 13)-(line 411,col 49)",
        "(line 412,col 13)-(line 416,col 13)",
        "(line 418,col 13)-(line 418,col 46)",
        "(line 419,col 13)-(line 426,col 13)",
        "(line 428,col 13)-(line 428,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 440,
      "end_line": 466,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 443,col 13)-(line 445,col 13)",
        "(line 447,col 13)-(line 447,col 49)",
        "(line 448,col 13)-(line 452,col 13)",
        "(line 454,col 13)-(line 454,col 46)",
        "(line 455,col 13)-(line 462,col 13)",
        "(line 464,col 13)-(line 464,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 476,
      "end_line": 512,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 479,col 13)-(line 481,col 13)",
        "(line 483,col 13)-(line 483,col 49)",
        "(line 484,col 13)-(line 491,col 13)",
        "(line 493,col 13)-(line 493,col 53)",
        "(line 494,col 13)-(line 494,col 55)",
        "(line 495,col 13)-(line 508,col 13)",
        "(line 510,col 13)-(line 510,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 518,
      "end_line": 525,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 519,col 13)-(line 523,col 13)",
        "(line 524,col 13)-(line 524,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 531,
      "end_line": 554,
      "comment": " Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 534,col 13)-(line 536,col 13)",
        "(line 538,col 13)-(line 538,col 49)",
        "(line 539,col 13)-(line 539,col 56)",
        "(line 541,col 13)-(line 551,col 13)",
        "(line 552,col 13)-(line 552,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 562,
      "end_line": 576,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 57)",
        "(line 566,col 9)-(line 566,col 53)",
        "(line 567,col 9)-(line 567,col 58)",
        "(line 570,col 9)-(line 570,col 56)",
        "(line 571,col 9)-(line 574,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.computeGershgorinCircles()",
      "begin_line": 581,
      "end_line": 614,
      "comment": "\n     * Compute the Gershgorin circles for all rows.\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 38)",
        "(line 584,col 9)-(line 584,col 37)",
        "(line 585,col 9)-(line 585,col 37)",
        "(line 586,col 9)-(line 586,col 48)",
        "(line 587,col 9)-(line 587,col 48)",
        "(line 588,col 9)-(line 588,col 24)",
        "(line 590,col 9)-(line 590,col 28)",
        "(line 591,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 44)",
        "(line 610,col 9)-(line 610,col 55)",
        "(line 611,col 9)-(line 611,col 55)",
        "(line 612,col 9)-(line 612,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.findEigenvalues()",
      "begin_line": 620,
      "end_line": 691,
      "comment": "\n     * Find the realEigenvalues.\n     * @exception InvalidMatrixException if a block cannot be diagonalized\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 53)",
        "(line 627,col 9)-(line 627,col 50)",
        "(line 628,col 9)-(line 628,col 50)",
        "(line 629,col 9)-(line 629,col 22)",
        "(line 630,col 9)-(line 681,col 9)",
        "(line 684,col 9)-(line 684,col 37)",
        "(line 685,col 9)-(line 689,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.computeSplits()",
      "begin_line": 697,
      "end_line": 717,
      "comment": "\n     * Compute splitting points.\n     * @return list of indices after matrix can be split\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 60)",
        "(line 702,col 9)-(line 702,col 47)",
        "(line 703,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 39)",
        "(line 715,col 9)-(line 715,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.process1RowBlock(int)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Find eigenvalue in a block with 1 row.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.process2RowsBlock(int)",
      "begin_line": 734,
      "end_line": 754,
      "comment": "\n     * Find realEigenvalues in a block with 2 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if characteristic polynomial cannot be solved\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 40)",
        "(line 740,col 9)-(line 740,col 44)",
        "(line 741,col 9)-(line 741,col 52)",
        "(line 743,col 9)-(line 743,col 37)",
        "(line 744,col 9)-(line 744,col 43)",
        "(line 745,col 9)-(line 745,col 43)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 750,col 64)",
        "(line 751,col 9)-(line 751,col 49)",
        "(line 752,col 9)-(line 752,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.process3RowsBlock(int)",
      "begin_line": 762,
      "end_line": 816,
      "comment": "\n     * Find realEigenvalues in a block with 3 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if diagonal elements are not positive\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 44)",
        "(line 768,col 9)-(line 768,col 48)",
        "(line 769,col 9)-(line 769,col 48)",
        "(line 770,col 9)-(line 770,col 56)",
        "(line 771,col 9)-(line 771,col 70)",
        "(line 774,col 9)-(line 774,col 48)",
        "(line 775,col 9)-(line 775,col 67)",
        "(line 776,col 9)-(line 776,col 57)",
        "(line 779,col 9)-(line 779,col 38)",
        "(line 780,col 9)-(line 780,col 49)",
        "(line 781,col 9)-(line 781,col 69)",
        "(line 782,col 9)-(line 782,col 50)",
        "(line 783,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 44)",
        "(line 790,col 9)-(line 790,col 59)",
        "(line 791,col 9)-(line 791,col 41)",
        "(line 792,col 9)-(line 792,col 36)",
        "(line 794,col 9)-(line 794,col 55)",
        "(line 795,col 9)-(line 795,col 71)",
        "(line 796,col 9)-(line 796,col 71)",
        "(line 797,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 40)",
        "(line 813,col 9)-(line 813,col 40)",
        "(line 814,col 9)-(line 814,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.processGeneralBlock(int)",
      "begin_line": 829,
      "end_line": 935,
      "comment": "\n     * Find realEigenvalues using dqd/dqds algorithms.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLASQ2.\u003c/p\u003e\n     * @param n number of rows of the block\n     * @exception InvalidMatrixException if block cannot be diagonalized\n     * after 30 * n iterations\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 30)",
        "(line 834,col 9)-(line 838,col 9)",
        "(line 840,col 9)-(line 843,col 9)",
        "(line 846,col 9)-(line 846,col 30)",
        "(line 849,col 9)-(line 849,col 25)",
        "(line 852,col 9)-(line 852,col 18)",
        "(line 853,col 9)-(line 853,col 18)",
        "(line 854,col 9)-(line 854,col 18)",
        "(line 855,col 9)-(line 855,col 18)",
        "(line 856,col 9)-(line 856,col 18)",
        "(line 857,col 9)-(line 857,col 18)",
        "(line 858,col 9)-(line 858,col 18)",
        "(line 861,col 9)-(line 861,col 19)",
        "(line 862,col 9)-(line 862,col 19)",
        "(line 863,col 9)-(line 933,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.initialSplits(int)",
      "begin_line": 941,
      "end_line": 984,
      "comment": "\n     * Perform two iterations with Li\u0027s tests for initial splits.\n     * @param n number of rows of the matrix to process\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 21)",
        "(line 944,col 9)-(line 982,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.goodStep(int, int)",
      "begin_line": 997,
      "end_line": 1129,
      "comment": "\n     * Perform one \"good\" dqd/dqds step.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLAZQ3.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @return new end (maybe deflated)\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 16)",
        "(line 1002,col 9)-(line 1002,col 30)",
        "(line 1003,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 53)",
        "(line 1059,col 9)-(line 1071,col 9)",
        "(line 1073,col 9)-(line 1122,col 9)",
        "(line 1125,col 9)-(line 1125,col 32)",
        "(line 1127,col 9)-(line 1127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.flipIfWarranted(int, int)",
      "begin_line": 1138,
      "end_line": 1151,
      "comment": "\n     * Flip qd array if warranted.\n     * @param n number of rows in the block\n     * @param step within the array (1 for flipping all elements, 2 for flipping\n     * only every other element)\n     * @return true if qd array was flipped\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1149,col 9)",
        "(line 1150,col 9)-(line 1150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.eigenvaluesRange(int, int)",
      "begin_line": 1159,
      "end_line": 1225,
      "comment": "\n     * Compute an interval containing all realEigenvalues of a block.\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return an interval containing the realEigenvalues\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 47)",
        "(line 1163,col 9)-(line 1163,col 47)",
        "(line 1164,col 9)-(line 1164,col 48)",
        "(line 1165,col 9)-(line 1165,col 48)",
        "(line 1166,col 9)-(line 1169,col 9)",
        "(line 1172,col 9)-(line 1172,col 72)",
        "(line 1173,col 9)-(line 1173,col 70)",
        "(line 1174,col 9)-(line 1174,col 54)",
        "(line 1175,col 9)-(line 1176,col 90)",
        "(line 1177,col 9)-(line 1177,col 81)",
        "(line 1180,col 9)-(line 1180,col 38)",
        "(line 1181,col 9)-(line 1181,col 38)",
        "(line 1182,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 81)",
        "(line 1202,col 9)-(line 1202,col 31)",
        "(line 1203,col 9)-(line 1203,col 31)",
        "(line 1204,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1221,col 83)",
        "(line 1223,col 9)-(line 1223,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.countEigenValues(double, int, int)",
      "begin_line": 1234,
      "end_line": 1244,
      "comment": "\n     * Count the number of realEigenvalues below a point.\n     * @param t value below which we must count the number of realEigenvalues\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return number of realEigenvalues smaller than t\n     ",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 39)",
        "(line 1236,col 9)-(line 1236,col 40)",
        "(line 1237,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1243,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.ldlTDecomposition(double, int, int)",
      "begin_line": 1257,
      "end_line": 1268,
      "comment": "\n     * Decompose the shifted tridiagonal matrix T-\u0026lambda;I as LDL\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eA shifted symmetric tridiagonal matrix T can be decomposed as\n     * LDL\u003csup\u003eT\u003c/sup\u003e where L is a lower bidiagonal matrix with unit diagonal\n     * and D is a diagonal matrix. This method is an implementation of\n     * algorithm 4.4.7 from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param lambda shift to add to the matrix before decomposing it\n     * to ensure it is positive definite\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 41)",
        "(line 1259,col 9)-(line 1259,col 31)",
        "(line 1260,col 9)-(line 1267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.dqds(int, int)",
      "begin_line": 1276,
      "end_line": 1324,
      "comment": "\n     * Perform a dqds step, using current shift increment.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ5.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1278,col 9)-(line 1278,col 46)",
        "(line 1279,col 9)-(line 1279,col 52)",
        "(line 1280,col 9)-(line 1280,col 17)",
        "(line 1281,col 9)-(line 1281,col 44)",
        "(line 1283,col 9)-(line 1301,col 9)",
        "(line 1304,col 9)-(line 1304,col 16)",
        "(line 1305,col 9)-(line 1305,col 21)",
        "(line 1306,col 9)-(line 1306,col 46)",
        "(line 1307,col 9)-(line 1307,col 41)",
        "(line 1308,col 9)-(line 1308,col 40)",
        "(line 1309,col 9)-(line 1309,col 64)",
        "(line 1310,col 9)-(line 1310,col 58)",
        "(line 1311,col 9)-(line 1311,col 35)",
        "(line 1313,col 9)-(line 1313,col 21)",
        "(line 1314,col 9)-(line 1314,col 20)",
        "(line 1315,col 9)-(line 1315,col 37)",
        "(line 1316,col 9)-(line 1316,col 40)",
        "(line 1317,col 9)-(line 1317,col 64)",
        "(line 1318,col 9)-(line 1318,col 57)",
        "(line 1319,col 9)-(line 1319,col 34)",
        "(line 1321,col 9)-(line 1321,col 26)",
        "(line 1322,col 9)-(line 1322,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.dqd(int, int)",
      "begin_line": 1333,
      "end_line": 1426,
      "comment": "\n     * Perform a dqd step.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ6.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1335,col 46)",
        "(line 1336,col 9)-(line 1336,col 46)",
        "(line 1337,col 9)-(line 1337,col 17)",
        "(line 1339,col 9)-(line 1379,col 9)",
        "(line 1382,col 9)-(line 1382,col 18)",
        "(line 1383,col 9)-(line 1383,col 21)",
        "(line 1384,col 9)-(line 1384,col 46)",
        "(line 1385,col 9)-(line 1385,col 41)",
        "(line 1386,col 9)-(line 1386,col 40)",
        "(line 1387,col 9)-(line 1400,col 9)",
        "(line 1401,col 9)-(line 1401,col 35)",
        "(line 1403,col 9)-(line 1403,col 21)",
        "(line 1404,col 9)-(line 1404,col 20)",
        "(line 1405,col 9)-(line 1405,col 37)",
        "(line 1406,col 9)-(line 1406,col 40)",
        "(line 1407,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 34)",
        "(line 1423,col 9)-(line 1423,col 26)",
        "(line 1424,col 9)-(line 1424,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.computeShiftIncrement(int, int, int)",
      "begin_line": 1435,
      "end_line": 1677,
      "comment": "\n     * Compute the shift increment as an estimate of the smallest eigenvalue.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLAZQ4.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @param deflated number of realEigenvalues just deflated\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 35)",
        "(line 1438,col 9)-(line 1438,col 35)",
        "(line 1439,col 9)-(line 1439,col 34)",
        "(line 1443,col 9)-(line 1447,col 9)",
        "(line 1449,col 9)-(line 1449,col 40)",
        "(line 1450,col 9)-(line 1675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.updateSigma(double)",
      "begin_line": 1683,
      "end_line": 1697,
      "comment": "\n     * Update sigma.\n     * @param tau shift to apply to sigma\n     ",
      "child_ranges": [
        "(line 1687,col 9)-(line 1696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.findEigenVectors()",
      "begin_line": 1702,
      "end_line": 1725,
      "comment": "\n     * Find eigenvectors.\n     ",
      "child_ranges": [
        "(line 1704,col 9)-(line 1704,col 34)",
        "(line 1705,col 9)-(line 1705,col 45)",
        "(line 1708,col 9)-(line 1708,col 41)",
        "(line 1709,col 9)-(line 1709,col 45)",
        "(line 1710,col 9)-(line 1710,col 28)",
        "(line 1711,col 9)-(line 1711,col 18)",
        "(line 1712,col 9)-(line 1718,col 9)",
        "(line 1721,col 9)-(line 1723,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.findEigenvector(double, double[], double[])",
      "begin_line": 1736,
      "end_line": 1786,
      "comment": "\n     * Find an eigenvector corresponding to an eigenvalue, using bidiagonals.\n     * \u003cp\u003eThis method corresponds to algorithm X from Dhillon\u0027s thesis.\u003c/p\u003e\n     * \n     * @param eigenvalue eigenvalue for which eigenvector is desired\n     * @param d diagonal elements of the initial non-shifted D matrix\n     * @param l off-diagonal elements of the initial non-shifted L matrix\n     * @return an eigenvector\n     ",
      "child_ranges": [
        "(line 1741,col 9)-(line 1741,col 34)",
        "(line 1742,col 9)-(line 1742,col 64)",
        "(line 1743,col 9)-(line 1743,col 65)",
        "(line 1747,col 9)-(line 1747,col 22)",
        "(line 1748,col 9)-(line 1748,col 75)",
        "(line 1749,col 9)-(line 1756,col 9)",
        "(line 1760,col 9)-(line 1760,col 45)",
        "(line 1761,col 9)-(line 1761,col 22)",
        "(line 1762,col 9)-(line 1762,col 27)",
        "(line 1763,col 9)-(line 1763,col 21)",
        "(line 1764,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1769,col 14)",
        "(line 1770,col 9)-(line 1774,col 9)",
        "(line 1777,col 9)-(line 1777,col 47)",
        "(line 1778,col 9)-(line 1780,col 9)",
        "(line 1782,col 9)-(line 1784,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1796,
      "end_line": 1812,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * L\u003csub\u003e+\u003c/sub\u003eD\u003csub\u003e+\u003c/sub\u003eL\u003csub\u003e+\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.3 (dstqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D,\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1798,col 9)-(line 1798,col 37)",
        "(line 1799,col 9)-(line 1799,col 28)",
        "(line 1800,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1810,col 40)",
        "(line 1811,col 9)-(line 1811,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1822,
      "end_line": 1838,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * U\u003csub\u003e-\u003c/sub\u003eD\u003csub\u003e-\u003c/sub\u003eU\u003csub\u003e-\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.5 (dqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1824,col 37)",
        "(line 1825,col 9)-(line 1825,col 36)",
        "(line 1826,col 9)-(line 1835,col 9)",
        "(line 1836,col 9)-(line 1836,col 21)",
        "(line 1837,col 9)-(line 1837,col 21)"
      ]
    }
  ]
}
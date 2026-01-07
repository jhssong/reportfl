{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/linear/EigenDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.EigenDecomposition"
      ],
      "begin_line": 59,
      "end_line": 1832,
      "comment": "\n * Calculates the eigen decomposition of a \u003cstrong\u003esymmetric\u003c/strong\u003e matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V D V\u003csup\u003eT\u003c/sup\u003e. A, V and D are all m \u0026times; m\n * matrices.\u003c/p\u003e\n * \u003cp\u003eAs of 2.0, this class supports only \u003cstrong\u003esymmetric\u003c/strong\u003e matrices,\n * and hence computes only real realEigenvalues. This implies the D matrix returned by\n * {@link #getD()} is always diagonal and the imaginary values returned {@link\n * #getImagEigenvalue(int)} and {@link #getImagEigenvalues()} are always null.\u003c/p\u003e\n * \u003cp\u003eWhen called with a {@link RealMatrix} argument, this implementation only uses\n * the upper part of the matrix, the part below the diagonal is not accessed at all.\u003c/p\u003e\n * \u003cp\u003eEigenvalues are computed as soon as the matrix is decomposed, but eigenvectors\n * are computed only when required, i.e. only when one of the {@link #getEigenvector(int)},\n * {@link #getV()}, {@link #getVT()}, {@link #getInverse()}, {@link #solve(double[])},\n * {@link #solve(RealMatrix)}, {@link #solve(RealVector)} or {@link #solve(RealVectorImpl)}\n * methods is called.\u003c/p\u003e\n * \u003cp\u003eThis implementation is based on Inderjit Singh Dhillon thesis\n * \u003ca href\u003d\"http://www.cs.utexas.edu/users/inderjit/public_papers/thesis.pdf\"\u003eA\n * New O(n\u003csup\u003e2\u003c/sup\u003e) Algorithm for the Symmetric Tridiagonal Eigenvalue/Eigenvector\n * Problem\u003c/a\u003e, on Beresford N. Parlett and Osni A. Marques paper \u003ca\n * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn Implementation of the\n * dqds Algorithm (Positive Case)\u003c/a\u003e and on the corresponding LAPACK routines (DLARRE,\n * DLASQ2, DLAZQ3, DLAZQ4, DLASQ5 and DLASQ6).\u003c/p\u003e\n * @author Beresford Parlett, University of California, Berkeley, USA (fortran version)\n * @author Jim Demmel, University of California, Berkeley, USA (fortran version)\n * @author Inderjit Dhillon, University of Texas, Austin, USA(fortran version)\n * @author Osni Marques, LBNL/NERSC, USA (fortran version)\n * @author Christof Voemel, University of California, Berkeley, USA(fortran version)\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "TOLERANCE_2"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Squared tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "splitTolerance"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Split tolerance. "
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Main diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "secondary"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "squaredSecondary"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Squared secondary diagonal of the tridiagonal matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Transformer to tridiagonal (may be null if matrix is already tridiagonal). "
    },
    {
      "type": "field",
      "varNames": [
        "lowerSpectra"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Lower bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "upperSpectra"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Upper bound of spectra. "
    },
    {
      "type": "field",
      "varNames": [
        "minPivot"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Minimum pivot in the Sturm sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "sigmaLow"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Low part of the current shift. "
    },
    {
      "type": "field",
      "varNames": [
        "tau"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Shift increment to apply. "
    },
    {
      "type": "field",
      "varNames": [
        "work"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Work array for all decomposition algorithms. "
    },
    {
      "type": "field",
      "varNames": [
        "pingPong"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Shift within qd array for ping-pong implementation. "
    },
    {
      "type": "field",
      "varNames": [
        "qMax"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Max value of diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "eMin"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Min value of off-diagonal elements in current segment. "
    },
    {
      "type": "field",
      "varNames": [
        "tType"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Type of the last dqds shift. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Minimal value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin1"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Minimal value on current state of the diagonal, excluding last element. "
    },
    {
      "type": "field",
      "varNames": [
        "dMin2"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Minimal value on current state of the diagonal, excluding last two elements. "
    },
    {
      "type": "field",
      "varNames": [
        "dN"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Last value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN1"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Last but one value on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "dN2"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Last but two on current state of the diagonal. "
    },
    {
      "type": "field",
      "varNames": [
        "g"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Shift ratio with respect to dMin used when tType \u003d\u003d 6. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Eigenvectors. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Cached value of V. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedD"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Cached value of D. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Cached value of Vt. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 168,
      "end_line": 181,
      "comment": "\n     * Calculates the eigen decomposition of the given symmetric matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param matrix The \u003cstrong\u003esymmetric\u003c/strong\u003e matrix to decompose.\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.EigenDecompositionImpl(double[], double[], double)",
      "begin_line": 195,
      "end_line": 213,
      "comment": "\n     * Calculates the eigen decomposition of the given tridiagonal symmetric matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(double[], double[])}.\u003c/p\u003e\n     * @param main the main diagonal of the matrix (will be copied)\n     * @param secondary the secondary diagonal of the matrix (will be copied)\n     * @param splitTolerance tolerance on the off-diagonal elements relative to the\n     * geometric mean to split the tridiagonal matrix (a suggested value is\n     * {@link MathUtils#SAFE_MIN})\n     * @exception InvalidMatrixException (wrapping a {@link ConvergenceException}\n     * if algorithm fails to converge\n     ",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.isSymmetric(org.apache.commons.math.linear.RealMatrix)",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.decompose()",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getV()",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getD()",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getVT()",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalues()",
      "begin_line": 316,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getRealEigenvalue(int)",
      "begin_line": 322,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalues()",
      "begin_line": 328,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getImagEigenvalue(int)",
      "begin_line": 334,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getEigenvector(int)",
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
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getDeterminant()",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     * @see #isNonSingular()\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 31)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.getSolver()",
      "begin_line": 362,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 370,
      "end_line": 548,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "realEigenvalues"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Real part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "imagEigenvalues"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " Imaginary part of the realEigenvalues. "
    },
    {
      "type": "field",
      "varNames": [
        "eigenvectors"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " Eigenvectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.Solver(double[], double[], org.apache.commons.math.linear.RealVectorImpl[])",
      "begin_line": 390,
      "end_line": 395,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param realEigenvalues real parts of the eigenvalues\n         * @param imagEigenvalues imaginary parts of the eigenvalues\n         * @param eigenvectors eigenvectors\n         ",
      "child_ranges": [
        "(line 392,col 13)-(line 392,col 51)",
        "(line 393,col 13)-(line 393,col 51)",
        "(line 394,col 13)-(line 394,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(double[])",
      "begin_line": 405,
      "end_line": 429,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 408,col 13)-(line 410,col 13)",
        "(line 412,col 13)-(line 412,col 49)",
        "(line 413,col 13)-(line 415,col 13)",
        "(line 417,col 13)-(line 417,col 46)",
        "(line 418,col 13)-(line 425,col 13)",
        "(line 427,col 13)-(line 427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 439,
      "end_line": 463,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 442,col 13)-(line 444,col 13)",
        "(line 446,col 13)-(line 446,col 49)",
        "(line 447,col 13)-(line 449,col 13)",
        "(line 451,col 13)-(line 451,col 46)",
        "(line 452,col 13)-(line 459,col 13)",
        "(line 461,col 13)-(line 461,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 473,
      "end_line": 504,
      "comment": " Solve the linear equation A \u0026times; X \u003d B for symmetric matrices A.\n         * \u003cp\u003eThis method only find exact linear solutions, i.e. solutions for\n         * which ||A \u0026times; X - B|| is exactly 0.\u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 476,col 13)-(line 478,col 13)",
        "(line 480,col 13)-(line 480,col 49)",
        "(line 481,col 13)-(line 483,col 13)",
        "(line 485,col 13)-(line 485,col 53)",
        "(line 486,col 13)-(line 486,col 55)",
        "(line 487,col 13)-(line 500,col 13)",
        "(line 502,col 13)-(line 502,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 510,
      "end_line": 517,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         * @return true if the decomposed matrix is non-singular\n         ",
      "child_ranges": [
        "(line 511,col 13)-(line 515,col 13)",
        "(line 516,col 13)-(line 516,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.Solver.getInverse()",
      "begin_line": 523,
      "end_line": 546,
      "comment": " Get the inverse of the decomposed matrix.\n         * @return inverse matrix\n         * @throws InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 526,col 13)-(line 528,col 13)",
        "(line 530,col 13)-(line 530,col 49)",
        "(line 531,col 13)-(line 531,col 56)",
        "(line 533,col 13)-(line 543,col 13)",
        "(line 544,col 13)-(line 544,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.transformToTridiagonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 554,
      "end_line": 568,
      "comment": "\n     * Transform matrix to tridiagonal.\n     * @param matrix matrix to transform\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 57)",
        "(line 558,col 9)-(line 558,col 53)",
        "(line 559,col 9)-(line 559,col 58)",
        "(line 562,col 9)-(line 562,col 56)",
        "(line 563,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeGershgorinCircles()",
      "begin_line": 573,
      "end_line": 606,
      "comment": "\n     * Compute the Gershgorin circles for all rows.\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 38)",
        "(line 576,col 9)-(line 576,col 37)",
        "(line 577,col 9)-(line 577,col 37)",
        "(line 578,col 9)-(line 578,col 48)",
        "(line 579,col 9)-(line 579,col 48)",
        "(line 580,col 9)-(line 580,col 24)",
        "(line 582,col 9)-(line 582,col 28)",
        "(line 583,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 601,col 44)",
        "(line 602,col 9)-(line 602,col 55)",
        "(line 603,col 9)-(line 603,col 55)",
        "(line 604,col 9)-(line 604,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvalues()",
      "begin_line": 612,
      "end_line": 683,
      "comment": "\n     * Find the realEigenvalues.\n     * @exception InvalidMatrixException if a block cannot be diagonalized\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 53)",
        "(line 619,col 9)-(line 619,col 50)",
        "(line 620,col 9)-(line 620,col 50)",
        "(line 621,col 9)-(line 621,col 22)",
        "(line 622,col 9)-(line 673,col 9)",
        "(line 676,col 9)-(line 676,col 37)",
        "(line 677,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeSplits()",
      "begin_line": 689,
      "end_line": 709,
      "comment": "\n     * Compute splitting points.\n     * @return list of indices after matrix can be split\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 60)",
        "(line 694,col 9)-(line 694,col 47)",
        "(line 695,col 9)-(line 704,col 9)",
        "(line 706,col 9)-(line 706,col 39)",
        "(line 707,col 9)-(line 707,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process1RowBlock(int)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * Find eigenvalue in a block with 1 row.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process2RowsBlock(int)",
      "begin_line": 726,
      "end_line": 746,
      "comment": "\n     * Find realEigenvalues in a block with 2 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if characteristic polynomial cannot be solved\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 40)",
        "(line 732,col 9)-(line 732,col 44)",
        "(line 733,col 9)-(line 733,col 52)",
        "(line 735,col 9)-(line 735,col 37)",
        "(line 736,col 9)-(line 736,col 43)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 742,col 9)-(line 742,col 64)",
        "(line 743,col 9)-(line 743,col 49)",
        "(line 744,col 9)-(line 744,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.process3RowsBlock(int)",
      "begin_line": 754,
      "end_line": 808,
      "comment": "\n     * Find realEigenvalues in a block with 3 rows.\n     * \u003cp\u003eIn low dimensions, we simply solve the characteristic polynomial.\u003c/p\u003e\n     * @param index index of the first row of the block\n     * @exception InvalidMatrixException if diagonal elements are not positive\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 44)",
        "(line 760,col 9)-(line 760,col 48)",
        "(line 761,col 9)-(line 761,col 48)",
        "(line 762,col 9)-(line 762,col 56)",
        "(line 763,col 9)-(line 763,col 70)",
        "(line 766,col 9)-(line 766,col 48)",
        "(line 767,col 9)-(line 767,col 67)",
        "(line 768,col 9)-(line 768,col 57)",
        "(line 771,col 9)-(line 771,col 38)",
        "(line 772,col 9)-(line 772,col 49)",
        "(line 773,col 9)-(line 773,col 69)",
        "(line 774,col 9)-(line 774,col 50)",
        "(line 775,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 44)",
        "(line 782,col 9)-(line 782,col 59)",
        "(line 783,col 9)-(line 783,col 41)",
        "(line 784,col 9)-(line 784,col 36)",
        "(line 786,col 9)-(line 786,col 55)",
        "(line 787,col 9)-(line 787,col 71)",
        "(line 788,col 9)-(line 788,col 71)",
        "(line 789,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 40)",
        "(line 805,col 9)-(line 805,col 40)",
        "(line 806,col 9)-(line 806,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.processGeneralBlock(int)",
      "begin_line": 821,
      "end_line": 927,
      "comment": "\n     * Find realEigenvalues using dqd/dqds algorithms.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLASQ2.\u003c/p\u003e\n     * @param n number of rows of the block\n     * @exception InvalidMatrixException if block cannot be diagonalized\n     * after 30 * n iterations\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 30)",
        "(line 826,col 9)-(line 830,col 9)",
        "(line 832,col 9)-(line 835,col 9)",
        "(line 838,col 9)-(line 838,col 30)",
        "(line 841,col 9)-(line 841,col 25)",
        "(line 844,col 9)-(line 844,col 18)",
        "(line 845,col 9)-(line 845,col 18)",
        "(line 846,col 9)-(line 846,col 18)",
        "(line 847,col 9)-(line 847,col 18)",
        "(line 848,col 9)-(line 848,col 18)",
        "(line 849,col 9)-(line 849,col 18)",
        "(line 850,col 9)-(line 850,col 18)",
        "(line 853,col 9)-(line 853,col 19)",
        "(line 854,col 9)-(line 854,col 19)",
        "(line 855,col 9)-(line 925,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.initialSplits(int)",
      "begin_line": 933,
      "end_line": 976,
      "comment": "\n     * Perform two iterations with Li\u0027s tests for initial splits.\n     * @param n number of rows of the matrix to process\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 21)",
        "(line 936,col 9)-(line 974,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.goodStep(int, int)",
      "begin_line": 989,
      "end_line": 1121,
      "comment": "\n     * Perform one \"good\" dqd/dqds step.\n     * \u003cp\u003eThis implementation is based on Beresford N. Parlett\n     * and Osni A. Marques paper \u003ca\n     * href\u003d\"http://www.netlib.org/lapack/lawnspdf/lawn155.pdf\"\u003eAn\n     * Implementation of the dqds Algorithm (Positive Case)\u003c/a\u003e and on the\n     * corresponding LAPACK routine DLAZQ3.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @return new end (maybe deflated)\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 16)",
        "(line 994,col 9)-(line 994,col 30)",
        "(line 995,col 9)-(line 1046,col 9)",
        "(line 1048,col 9)-(line 1048,col 53)",
        "(line 1051,col 9)-(line 1063,col 9)",
        "(line 1065,col 9)-(line 1114,col 9)",
        "(line 1117,col 9)-(line 1117,col 32)",
        "(line 1119,col 9)-(line 1119,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.flipIfWarranted(int, int)",
      "begin_line": 1130,
      "end_line": 1143,
      "comment": "\n     * Flip qd array if warranted.\n     * @param n number of rows in the block\n     * @param step within the array (1 for flipping all elements, 2 for flipping\n     * only every other element)\n     * @return true if qd array was flipped\n     ",
      "child_ranges": [
        "(line 1131,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.eigenvaluesRange(int, int)",
      "begin_line": 1151,
      "end_line": 1217,
      "comment": "\n     * Compute an interval containing all realEigenvalues of a block.\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return an interval containing the realEigenvalues\n     ",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 47)",
        "(line 1155,col 9)-(line 1155,col 47)",
        "(line 1156,col 9)-(line 1156,col 48)",
        "(line 1157,col 9)-(line 1157,col 48)",
        "(line 1158,col 9)-(line 1161,col 9)",
        "(line 1164,col 9)-(line 1164,col 72)",
        "(line 1165,col 9)-(line 1165,col 70)",
        "(line 1166,col 9)-(line 1166,col 54)",
        "(line 1167,col 9)-(line 1168,col 90)",
        "(line 1169,col 9)-(line 1169,col 81)",
        "(line 1172,col 9)-(line 1172,col 38)",
        "(line 1173,col 9)-(line 1173,col 38)",
        "(line 1174,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 81)",
        "(line 1194,col 9)-(line 1194,col 31)",
        "(line 1195,col 9)-(line 1195,col 31)",
        "(line 1196,col 9)-(line 1212,col 9)",
        "(line 1213,col 9)-(line 1213,col 83)",
        "(line 1215,col 9)-(line 1215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.countEigenValues(double, int, int)",
      "begin_line": 1226,
      "end_line": 1236,
      "comment": "\n     * Count the number of realEigenvalues below a point.\n     * @param t value below which we must count the number of realEigenvalues\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     * @return number of realEigenvalues smaller than t\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 39)",
        "(line 1228,col 9)-(line 1228,col 40)",
        "(line 1229,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1235,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.ldlTDecomposition(double, int, int)",
      "begin_line": 1249,
      "end_line": 1260,
      "comment": "\n     * Decompose the shifted tridiagonal matrix T-\u0026lambda;I as LDL\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eA shifted symmetric tridiagonal matrix T can be decomposed as\n     * LDL\u003csup\u003eT\u003c/sup\u003e where L is a lower bidiagonal matrix with unit diagonal\n     * and D is a diagonal matrix. This method is an implementation of\n     * algorithm 4.4.7 from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param lambda shift to add to the matrix before decomposing it\n     * to ensure it is positive definite\n     * @param index index of the first row of the block\n     * @param n number of rows of the block\n     ",
      "child_ranges": [
        "(line 1250,col 9)-(line 1250,col 41)",
        "(line 1251,col 9)-(line 1251,col 31)",
        "(line 1252,col 9)-(line 1259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.dqds(int, int)",
      "begin_line": 1268,
      "end_line": 1316,
      "comment": "\n     * Perform a dqds step, using current shift increment.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ5.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 46)",
        "(line 1271,col 9)-(line 1271,col 52)",
        "(line 1272,col 9)-(line 1272,col 17)",
        "(line 1273,col 9)-(line 1273,col 44)",
        "(line 1275,col 9)-(line 1293,col 9)",
        "(line 1296,col 9)-(line 1296,col 16)",
        "(line 1297,col 9)-(line 1297,col 21)",
        "(line 1298,col 9)-(line 1298,col 46)",
        "(line 1299,col 9)-(line 1299,col 41)",
        "(line 1300,col 9)-(line 1300,col 40)",
        "(line 1301,col 9)-(line 1301,col 64)",
        "(line 1302,col 9)-(line 1302,col 58)",
        "(line 1303,col 9)-(line 1303,col 35)",
        "(line 1305,col 9)-(line 1305,col 21)",
        "(line 1306,col 9)-(line 1306,col 20)",
        "(line 1307,col 9)-(line 1307,col 37)",
        "(line 1308,col 9)-(line 1308,col 40)",
        "(line 1309,col 9)-(line 1309,col 64)",
        "(line 1310,col 9)-(line 1310,col 57)",
        "(line 1311,col 9)-(line 1311,col 34)",
        "(line 1313,col 9)-(line 1313,col 26)",
        "(line 1314,col 9)-(line 1314,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.dqd(int, int)",
      "begin_line": 1325,
      "end_line": 1418,
      "comment": "\n     * Perform a dqd step.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLASQ6.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 46)",
        "(line 1328,col 9)-(line 1328,col 46)",
        "(line 1329,col 9)-(line 1329,col 17)",
        "(line 1331,col 9)-(line 1371,col 9)",
        "(line 1374,col 9)-(line 1374,col 18)",
        "(line 1375,col 9)-(line 1375,col 21)",
        "(line 1376,col 9)-(line 1376,col 46)",
        "(line 1377,col 9)-(line 1377,col 41)",
        "(line 1378,col 9)-(line 1378,col 40)",
        "(line 1379,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1393,col 35)",
        "(line 1395,col 9)-(line 1395,col 21)",
        "(line 1396,col 9)-(line 1396,col 20)",
        "(line 1397,col 9)-(line 1397,col 37)",
        "(line 1398,col 9)-(line 1398,col 40)",
        "(line 1399,col 9)-(line 1412,col 9)",
        "(line 1413,col 9)-(line 1413,col 34)",
        "(line 1415,col 9)-(line 1415,col 26)",
        "(line 1416,col 9)-(line 1416,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.computeShiftIncrement(int, int, int)",
      "begin_line": 1427,
      "end_line": 1669,
      "comment": "\n     * Compute the shift increment as an estimate of the smallest eigenvalue.\n     * \u003cp\u003eThis implementation is a translation of the LAPACK routine DLAZQ4.\u003c/p\u003e\n     * @param start start index\n     * @param end end index\n     * @param deflated number of realEigenvalues just deflated\n     ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 35)",
        "(line 1430,col 9)-(line 1430,col 35)",
        "(line 1431,col 9)-(line 1431,col 34)",
        "(line 1435,col 9)-(line 1439,col 9)",
        "(line 1441,col 9)-(line 1441,col 40)",
        "(line 1442,col 9)-(line 1667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.updateSigma(double)",
      "begin_line": 1675,
      "end_line": 1689,
      "comment": "\n     * Update sigma.\n     * @param tau shift to apply to sigma\n     ",
      "child_ranges": [
        "(line 1679,col 9)-(line 1688,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors()",
      "begin_line": 1694,
      "end_line": 1717,
      "comment": "\n     * Find eigenvectors.\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1696,col 34)",
        "(line 1697,col 9)-(line 1697,col 45)",
        "(line 1700,col 9)-(line 1700,col 41)",
        "(line 1701,col 9)-(line 1701,col 45)",
        "(line 1702,col 9)-(line 1702,col 28)",
        "(line 1703,col 9)-(line 1703,col 18)",
        "(line 1704,col 9)-(line 1710,col 9)",
        "(line 1713,col 9)-(line 1715,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(double, double[], double[])",
      "begin_line": 1728,
      "end_line": 1778,
      "comment": "\n     * Find an eigenvector corresponding to an eigenvalue, using bidiagonals.\n     * \u003cp\u003eThis method corresponds to algorithm X from Dhillon\u0027s thesis.\u003c/p\u003e\n     * \n     * @param eigenvalue eigenvalue for which eigenvector is desired\n     * @param d diagonal elements of the initial non-shifted D matrix\n     * @param l off-diagonal elements of the initial non-shifted L matrix\n     * @return an eigenvector\n     ",
      "child_ranges": [
        "(line 1733,col 9)-(line 1733,col 34)",
        "(line 1734,col 9)-(line 1734,col 64)",
        "(line 1735,col 9)-(line 1735,col 65)",
        "(line 1739,col 9)-(line 1739,col 22)",
        "(line 1740,col 9)-(line 1740,col 75)",
        "(line 1741,col 9)-(line 1748,col 9)",
        "(line 1752,col 9)-(line 1752,col 45)",
        "(line 1753,col 9)-(line 1753,col 22)",
        "(line 1754,col 9)-(line 1754,col 27)",
        "(line 1755,col 9)-(line 1755,col 21)",
        "(line 1756,col 9)-(line 1760,col 9)",
        "(line 1761,col 9)-(line 1761,col 14)",
        "(line 1762,col 9)-(line 1766,col 9)",
        "(line 1769,col 9)-(line 1769,col 47)",
        "(line 1770,col 9)-(line 1772,col 9)",
        "(line 1774,col 9)-(line 1776,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1788,
      "end_line": 1804,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * L\u003csub\u003e+\u003c/sub\u003eD\u003csub\u003e+\u003c/sub\u003eL\u003csub\u003e+\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.3 (dstqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D,\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1790,col 9)-(line 1790,col 37)",
        "(line 1791,col 9)-(line 1791,col 28)",
        "(line 1792,col 9)-(line 1801,col 9)",
        "(line 1802,col 9)-(line 1802,col 40)",
        "(line 1803,col 9)-(line 1803,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecompositionImpl.progressiveQuotientDifferenceWithShift(double[], double[], double)",
      "begin_line": 1814,
      "end_line": 1830,
      "comment": "\n     * Decompose matrix LDL\u003csup\u003eT\u003c/sup\u003e - \u0026lambda; I as\n     * U\u003csub\u003e-\u003c/sub\u003eD\u003csub\u003e-\u003c/sub\u003eU\u003csub\u003e-\u003c/sub\u003e\u003csup\u003eT\u003c/sup\u003e.\n     * \u003cp\u003eThis method corresponds to algorithm 4.4.5 (dqds) from Dhillon\u0027s thesis.\u003c/p\u003e\n     * @param d diagonal elements of D\n     * @param l off-diagonal elements of L\n     * @param lambda shift to apply\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 37)",
        "(line 1817,col 9)-(line 1817,col 36)",
        "(line 1818,col 9)-(line 1827,col 9)",
        "(line 1828,col 9)-(line 1828,col 21)",
        "(line 1829,col 9)-(line 1829,col 21)"
      ]
    }
  ]
}
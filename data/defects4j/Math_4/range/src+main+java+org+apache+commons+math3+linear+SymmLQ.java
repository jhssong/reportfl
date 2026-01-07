{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/SymmLQ.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymmLQ",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver"
      ],
      "begin_line": 154,
      "end_line": 1222,
      "comment": "\n * \u003cp\u003e\n * Implementation of the SYMMLQ iterative linear solver proposed by \u003ca\n * href\u003d\"#PAIG1975\"\u003ePaige and Saunders (1975)\u003c/a\u003e. This implementation is\n * largely based on the FORTRAN code by Pr. Michael A. Saunders, available \u003ca\n * href\u003d\"http://www.stanford.edu/group/SOL/software/symmlq/f77/\"\u003ehere\u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * SYMMLQ is designed to solve the system of linear equations A \u0026middot; x \u003d b\n * where A is an n \u0026times; n self-adjoint linear operator (defined as a\n * {@link RealLinearOperator}), and b is a given vector. The operator A is not\n * required to be positive definite. If A is known to be definite, the method of\n * conjugate gradients might be preferred, since it will require about the same\n * number of iterations as SYMMLQ but slightly less work per iteration.\n * \u003c/p\u003e\n * \u003cp\u003e\n * SYMMLQ is designed to solve the system (A - shift \u0026middot; I) \u0026middot; x \u003d b,\n * where shift is a specified scalar value. If shift and b are suitably chosen,\n * the computed vector x may approximate an (unnormalized) eigenvector of A, as\n * in the methods of inverse iteration and/or Rayleigh-quotient iteration.\n * Again, the linear operator (A - shift \u0026middot; I) need not be positive\n * definite (but \u003cem\u003emust\u003c/em\u003e be self-adjoint). The work per iteration is very\n * slightly less if shift \u003d 0.\n * \u003c/p\u003e\n * \u003ch3\u003ePreconditioning\u003c/h3\u003e\n * \u003cp\u003e\n * Preconditioning may reduce the number of iterations required. The solver may\n * be provided with a positive definite preconditioner\n * M \u003d P\u003csup\u003eT\u003c/sup\u003e \u0026middot; P\n * that is known to approximate\n * (A - shift \u0026middot; I)\u003csup\u003e-1\u003c/sup\u003e in some sense, where matrix-vector\n * products of the form M \u0026middot; y \u003d x can be computed efficiently. Then\n * SYMMLQ will implicitly solve the system of equations\n * P \u0026middot; (A - shift \u0026middot; I) \u0026middot; P\u003csup\u003eT\u003c/sup\u003e \u0026middot;\n * x\u003csub\u003ehat\u003c/sub\u003e \u003d P \u0026middot; b, i.e.\n * A\u003csub\u003ehat\u003c/sub\u003e \u0026middot; x\u003csub\u003ehat\u003c/sub\u003e \u003d b\u003csub\u003ehat\u003c/sub\u003e,\n * where\n * A\u003csub\u003ehat\u003c/sub\u003e \u003d P \u0026middot; (A - shift \u0026middot; I) \u0026middot; P\u003csup\u003eT\u003c/sup\u003e,\n * b\u003csub\u003ehat\u003c/sub\u003e \u003d P \u0026middot; b,\n * and return the solution\n * x \u003d P\u003csup\u003eT\u003c/sup\u003e \u0026middot; x\u003csub\u003ehat\u003c/sub\u003e.\n * The associated residual is\n * r\u003csub\u003ehat\u003c/sub\u003e \u003d b\u003csub\u003ehat\u003c/sub\u003e - A\u003csub\u003ehat\u003c/sub\u003e \u0026middot; x\u003csub\u003ehat\u003c/sub\u003e\n *                 \u003d P \u0026middot; [b - (A - shift \u0026middot; I) \u0026middot; x]\n *                 \u003d P \u0026middot; r.\n * \u003c/p\u003e\n * \u003cp\u003e\n * In the case of preconditioning, the {@link IterativeLinearSolverEvent}s that\n * this solver fires are such that\n * {@link IterativeLinearSolverEvent#getNormOfResidual()} returns the norm of\n * the \u003cem\u003epreconditioned\u003c/em\u003e, updated residual, ||P \u0026middot; r||, not the norm\n * of the \u003cem\u003etrue\u003c/em\u003e residual ||r||.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"stopcrit\"\u003eDefault stopping criterion\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * A default stopping criterion is implemented. The iterations stop when || rhat\n * || \u0026le; \u0026delta; || Ahat || || xhat ||, where xhat is the current estimate of\n * the solution of the transformed system, rhat the current estimate of the\n * corresponding residual, and \u0026delta; a user-specified tolerance.\n * \u003c/p\u003e\n * \u003ch3\u003eIteration count\u003c/h3\u003e\n * \u003cp\u003e\n * In the present context, an iteration should be understood as one evaluation\n * of the matrix-vector product A \u0026middot; x. The initialization phase therefore\n * counts as one iteration. If the user requires checks on the symmetry of A,\n * this entails one further matrix-vector product in the initial phase. This\n * further product is \u003cem\u003enot\u003c/em\u003e accounted for in the iteration count. In\n * other words, the number of iterations required to reach convergence will be\n * identical, whether checks have been required or not.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The present definition of the iteration count differs from that adopted in\n * the original FOTRAN code, where the initialization phase was \u003cem\u003enot\u003c/em\u003e\n * taken into account.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"initguess\"\u003eInitial guess of the solution\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The {@code x} parameter in\n * \u003cul\u003e\n * \u003cli\u003e{@link #solve(RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solve(RealLinearOperator, RealLinearOperator, RealVector, RealVector)}},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector, boolean, double)},\u003c/li\u003e\n * \u003c/ul\u003e\n * should not be considered as an initial guess, as it is set to zero in the\n * initial phase. If x\u003csub\u003e0\u003c/sub\u003e is known to be a good approximation to x, one\n * should compute r\u003csub\u003e0\u003c/sub\u003e \u003d b - A \u0026middot; x, solve A \u0026middot; dx \u003d r0,\n * and set x \u003d x\u003csub\u003e0\u003c/sub\u003e + dx.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"context\"\u003eException context\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * Besides standard {@link DimensionMismatchException}, this class might throw\n * {@link NonSelfAdjointOperatorException} if the linear operator or the\n * preconditioner are not symmetric. In this case, the {@link ExceptionContext}\n * provides more information\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"} points to the offending linear operator, say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector1\"} points to the first offending vector, say x,\n * \u003cli\u003ekey {@code \"vector2\"} points to the second offending vector, say y, such\n * that x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; y \u0026ne; y\u003csup\u003eT\u003c/sup\u003e \u0026middot; L\n * \u0026middot; x (within a certain accuracy).\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link NonPositiveDefiniteOperatorException} might also be thrown in case the\n * preconditioner is not positive definite. The relevant keys to the\n * {@link ExceptionContext} are\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"}, which points to the offending linear operator,\n * say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector\"}, which points to the offending vector, say x, such\n * that x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; x \u003c 0.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003ch3\u003eReferences\u003c/h3\u003e\n * \u003cdl\u003e\n * \u003cdt\u003e\u003ca id\u003d\"PAIG1975\"\u003ePaige and Saunders (1975)\u003c/a\u003e\u003c/dt\u003e\n * \u003cdd\u003eC. C. Paige and M. A. Saunders, \u003ca\n * href\u003d\"http://www.stanford.edu/group/SOL/software/symmlq/PS75.pdf\"\u003e\u003cem\u003e\n * Solution of Sparse Indefinite Systems of Linear Equations\u003c/em\u003e\u003c/a\u003e, SIAM\n * Journal on Numerical Analysis 12(4): 617-629, 1975\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 242,
      "end_line": 834,
      "comment": "\n     * \u003cp\u003e\n     * A simple container holding the non-final variables used in the\n     * iterations. Making the current state of the solver visible from the\n     * outside is necessary, because during the iterations, {@code x} does not\n     * \u003cem\u003eexactly\u003c/em\u003e hold the current estimate of the solution. Indeed,\n     * {@code x} needs in general to be moved from the LQ point to the CG point.\n     * Besides, additional upudates must be carried out in case {@code goodb} is\n     * set to {@code true}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In all subsequent comments, the description of the state variables refer\n     * to their value after a call to {@link #update()}. In these comments, k is\n     * the current number of evaluations of matrix-vector products.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CBRT_MACH_PREC"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " The cubic root of {@link #MACH_PREC}. "
    },
    {
      "type": "field",
      "varNames": [
        "MACH_PREC"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " The machine precision. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Reference to the linear operator. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " Reference to the right-hand side vector. "
    },
    {
      "type": "field",
      "varNames": [
        "check"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " {@code true} if symmetry of matrix and conditioner must be checked. "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": "\n         * The value of the custom tolerance \u0026delta; for the default stopping\n         * criterion.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " The value of beta[k+1]. "
    },
    {
      "type": "field",
      "varNames": [
        "beta1"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " The value of beta[1]. "
    },
    {
      "type": "field",
      "varNames": [
        "bstep"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " The value of bstep[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "cgnorm"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " The estimate of the norm of P * rC[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "dbar"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " The value of dbar[k+1] \u003d -beta[k+1] * c[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "gammaZeta"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n         * The value of gamma[k] * zeta[k]. Was called {@code rhs1} in the\n         * initial code.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "gbar"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The value of gbar[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "gmax"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The value of max(|alpha[1]|, gamma[1], ..., gamma[k-1]). "
    },
    {
      "type": "field",
      "varNames": [
        "gmin"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The value of min(|alpha[1]|, gamma[1], ..., gamma[k-1]). "
    },
    {
      "type": "field",
      "varNames": [
        "goodb"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Copy of the {@code goodb} parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "hasConverged"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " {@code true} if the default convergence criterion is verified. "
    },
    {
      "type": "field",
      "varNames": [
        "lqnorm"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " The estimate of the norm of P * rL[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Reference to the preconditioner, M. "
    },
    {
      "type": "field",
      "varNames": [
        "minusEpsZeta"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n         * The value of (-eps[k+1] * zeta[k-1]). Was called {@code rhs2} in the\n         * initial code.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "mb"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The value of M * b. "
    },
    {
      "type": "field",
      "varNames": [
        "oldb"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " The value of beta[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "r1"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " The value of beta[k] * M^(-1) * P\u0027 * v[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "r2"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The value of beta[k+1] * M^(-1) * P\u0027 * v[k+1]. "
    },
    {
      "type": "field",
      "varNames": [
        "rnorm"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": "\n         * The value of the updated, preconditioned residual P * r. This value is\n         * given by {@code min(}{@link #cgnorm}{@code , }{@link #lqnorm}{@code )}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "shift"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Copy of the {@code shift} parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "snprod"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " The value of s[1] * ... * s[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "tnorm"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": "\n         * An estimate of the square of the norm of A * V[k], based on Paige and\n         * Saunders (1975), equation (3.3).\n         "
    },
    {
      "type": "field",
      "varNames": [
        "wbar"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": "\n         * The value of P\u0027 * wbar[k] or P\u0027 * (wbar[k] - s[1] * ... * s[k-1] *\n         * v[1]) if {@code goodb} is {@code true}. Was called {@code w} in the\n         * initial code.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "xL"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": "\n         * A reference to the vector to be updated with the solution. Contains\n         * the value of xL[k-1] if {@code goodb} is {@code false}, (xL[k-1] -\n         * bstep[k-1] * v[1]) otherwise.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " The value of beta[k+1] * P\u0027 * v[k+1]. "
    },
    {
      "type": "field",
      "varNames": [
        "ynorm2"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " The value of zeta[1]^2 + ... + zeta[k-1]^2. "
    },
    {
      "type": "field",
      "varNames": [
        "bIsNull"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " The value of {@code b \u003d\u003d 0} (exact floating-point equality). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.State(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, boolean, double, double, boolean)",
      "begin_line": 384,
      "end_line": 401,
      "comment": "\n         * Creates and inits to k \u003d 1 a new instance of this class.\n         *\n         * @param a the linear operator A of the system\n         * @param m the preconditioner, M (can be {@code null})\n         * @param b the right-hand side vector\n         * @param goodb usually {@code false}, except if {@code x} is expected\n         * to contain a large multiple of {@code b}\n         * @param shift the amount to be subtracted to all diagonal elements of\n         * A\n         * @param delta the \u0026delta; parameter for the default stopping criterion\n         * @param check {@code true} if self-adjointedness of both matrix and\n         * preconditioner should be checked\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 23)",
        "(line 392,col 13)-(line 392,col 23)",
        "(line 393,col 13)-(line 393,col 23)",
        "(line 394,col 13)-(line 394,col 60)",
        "(line 395,col 13)-(line 395,col 31)",
        "(line 396,col 13)-(line 396,col 31)",
        "(line 397,col 13)-(line 397,col 51)",
        "(line 398,col 13)-(line 398,col 38)",
        "(line 399,col 13)-(line 399,col 31)",
        "(line 400,col 13)-(line 400,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.checkSymmetry(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 416,
      "end_line": 432,
      "comment": "\n         * Performs a symmetry check on the specified linear operator, and throws an\n         * exception in case this check fails. Given a linear operator L, and a\n         * vector x, this method checks that\n         * x\u0027 \u0026middot; L \u0026middot; y \u003d y\u0027 \u0026middot; L \u0026middot; x\n         * (within a given accuracy), where y \u003d L \u0026middot; x.\n         *\n         * @param l the linear operator L\n         * @param x the candidate vector x\n         * @param y the candidate vector y \u003d L \u0026middot; x\n         * @param z the vector z \u003d L \u0026middot; y\n         * @throws NonSelfAdjointOperatorException when the test fails\n         ",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 45)",
        "(line 420,col 13)-(line 420,col 45)",
        "(line 421,col 13)-(line 421,col 65)",
        "(line 422,col 13)-(line 431,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.throwNPDLOException(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 442,
      "end_line": 450,
      "comment": "\n         * Throws a new {@link NonPositiveDefiniteOperatorException} with\n         * appropriate context.\n         *\n         * @param l the offending linear operator\n         * @param v the offending vector\n         * @throws NonPositiveDefiniteOperatorException in any circumstances\n         ",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 57)",
        "(line 445,col 13)-(line 445,col 59)",
        "(line 446,col 13)-(line 446,col 60)",
        "(line 447,col 13)-(line 447,col 42)",
        "(line 448,col 13)-(line 448,col 40)",
        "(line 449,col 13)-(line 449,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.daxpy(double, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 461,
      "end_line": 467,
      "comment": "\n         * A clone of the BLAS {@code DAXPY} function, which carries out the\n         * operation y \u0026larr; a \u0026middot; x + y. This is for internal use only: no\n         * dimension checks are provided.\n         *\n         * @param a the scalar by which {@code x} is to be multiplied\n         * @param x the vector to be added to {@code y}\n         * @param y the vector to be incremented\n         ",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 43)",
        "(line 464,col 13)-(line 466,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.daxpbypz(double, org.apache.commons.math3.linear.RealVector, double, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 480,
      "end_line": 488,
      "comment": "\n         * A BLAS-like function, for the operation z \u0026larr; a \u0026middot; x + b\n         * \u0026middot; y + z. This is for internal use only: no dimension checks are\n         * provided.\n         *\n         * @param a the scalar by which {@code x} is to be multiplied\n         * @param x the first vector to be added to {@code z}\n         * @param b the scalar by which {@code y} is to be multiplied\n         * @param y the second vector to be added to {@code z}\n         * @param z the vector to be incremented\n         ",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 43)",
        "(line 483,col 13)-(line 487,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.refineSolution(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 503,
      "end_line": 537,
      "comment": "\n         * \u003cp\u003e\n         * Move to the CG point if it seems better. In this version of SYMMLQ,\n         * the convergence tests involve only cgnorm, so we\u0027re unlikely to stop\n         * at an LQ point, except if the iteration limit interferes.\n         * \u003c/p\u003e\n         * \u003cp\u003e\n         * Additional upudates are also carried out in case {@code goodb} is set\n         * to {@code true}.\n         * \u003c/p\u003e\n         *\n         * @param x the vector to be updated with the refined value of xL\n         ",
      "child_ranges": [
        "(line 504,col 13)-(line 504,col 49)",
        "(line 505,col 13)-(line 536,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.init()",
      "begin_line": 544,
      "end_line": 629,
      "comment": "\n         * Performs the initial phase of the SYMMLQ algorithm. On return, the\n         * value of the state variables of {@code this} object correspond to k \u003d\n         * 1.\n         ",
      "child_ranges": [
        "(line 545,col 13)-(line 545,col 28)",
        "(line 550,col 13)-(line 550,col 36)",
        "(line 551,col 13)-(line 551,col 78)",
        "(line 552,col 13)-(line 554,col 13)",
        "(line 556,col 13)-(line 556,col 52)",
        "(line 557,col 13)-(line 559,col 13)",
        "(line 560,col 13)-(line 564,col 13)",
        "(line 565,col 13)-(line 565,col 33)",
        "(line 566,col 13)-(line 566,col 51)",
        "(line 572,col 13)-(line 572,col 69)",
        "(line 573,col 13)-(line 573,col 39)",
        "(line 574,col 13)-(line 576,col 13)",
        "(line 581,col 13)-(line 581,col 42)",
        "(line 582,col 13)-(line 582,col 54)",
        "(line 583,col 13)-(line 583,col 56)",
        "(line 590,col 13)-(line 590,col 52)",
        "(line 591,col 13)-(line 591,col 47)",
        "(line 592,col 13)-(line 592,col 41)",
        "(line 593,col 13)-(line 593,col 36)",
        "(line 594,col 13)-(line 596,col 13)",
        "(line 597,col 13)-(line 597,col 35)",
        "(line 598,col 13)-(line 598,col 51)",
        "(line 599,col 13)-(line 601,col 13)",
        "(line 602,col 13)-(line 602,col 49)",
        "(line 610,col 13)-(line 610,col 37)",
        "(line 611,col 13)-(line 611,col 30)",
        "(line 612,col 13)-(line 612,col 34)",
        "(line 613,col 13)-(line 613,col 40)",
        "(line 614,col 13)-(line 614,col 35)",
        "(line 615,col 13)-(line 615,col 28)",
        "(line 616,col 13)-(line 616,col 29)",
        "(line 617,col 13)-(line 617,col 63)",
        "(line 618,col 13)-(line 618,col 29)",
        "(line 619,col 13)-(line 619,col 56)",
        "(line 620,col 13)-(line 620,col 34)",
        "(line 622,col 13)-(line 627,col 13)",
        "(line 628,col 13)-(line 628,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.update()",
      "begin_line": 637,
      "end_line": 754,
      "comment": "\n         * Performs the next iteration of the algorithm. The iteration count\n         * should be incremented prior to calling this method. On return, the\n         * value of the state variables of {@code this} object correspond to the\n         * current iteration count {@code k}.\n         ",
      "child_ranges": [
        "(line 638,col 13)-(line 638,col 58)",
        "(line 639,col 13)-(line 639,col 29)",
        "(line 640,col 13)-(line 640,col 53)",
        "(line 641,col 13)-(line 641,col 49)",
        "(line 652,col 13)-(line 652,col 40)",
        "(line 666,col 13)-(line 666,col 20)",
        "(line 667,col 13)-(line 667,col 19)",
        "(line 668,col 13)-(line 670,col 13)",
        "(line 671,col 13)-(line 671,col 24)",
        "(line 672,col 13)-(line 672,col 36)",
        "(line 673,col 13)-(line 675,col 13)",
        "(line 676,col 13)-(line 676,col 39)",
        "(line 685,col 13)-(line 685,col 63)",
        "(line 693,col 13)-(line 693,col 74)",
        "(line 694,col 13)-(line 694,col 42)",
        "(line 695,col 13)-(line 695,col 42)",
        "(line 705,col 13)-(line 705,col 55)",
        "(line 706,col 13)-(line 706,col 40)",
        "(line 707,col 13)-(line 707,col 40)",
        "(line 708,col 13)-(line 708,col 29)",
        "(line 709,col 13)-(line 709,col 50)",
        "(line 718,col 13)-(line 718,col 42)",
        "(line 719,col 13)-(line 719,col 42)",
        "(line 720,col 13)-(line 720,col 44)",
        "(line 721,col 13)-(line 727,col 13)",
        "(line 734,col 13)-(line 734,col 39)",
        "(line 735,col 13)-(line 735,col 24)",
        "(line 736,col 13)-(line 736,col 45)",
        "(line 737,col 13)-(line 737,col 45)",
        "(line 738,col 13)-(line 738,col 34)",
        "(line 739,col 13)-(line 739,col 53)",
        "(line 740,col 13)-(line 740,col 39)",
        "(line 753,col 13)-(line 753,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.updateNorms()",
      "begin_line": 760,
      "end_line": 796,
      "comment": "\n         * Computes the norms of the residuals, and checks for convergence.\n         * Updates {@link #lqnorm} and {@link #cgnorm}.\n         ",
      "child_ranges": [
        "(line 761,col 13)-(line 761,col 54)",
        "(line 762,col 13)-(line 762,col 55)",
        "(line 763,col 13)-(line 763,col 50)",
        "(line 764,col 13)-(line 764,col 58)",
        "(line 765,col 13)-(line 765,col 54)",
        "(line 766,col 13)-(line 766,col 57)",
        "(line 767,col 13)-(line 768,col 64)",
        "(line 769,col 13)-(line 769,col 49)",
        "(line 770,col 13)-(line 770,col 56)",
        "(line 778,col 13)-(line 778,col 31)",
        "(line 779,col 13)-(line 783,col 13)",
        "(line 784,col 13)-(line 786,col 13)",
        "(line 787,col 13)-(line 793,col 13)",
        "(line 794,col 13)-(line 794,col 49)",
        "(line 795,col 13)-(line 795,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.hasConverged()",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n         * Returns {@code true} if the default stopping criterion is fulfilled.\n         *\n         * @return {@code true} if convergence of the iterations has occured\n         ",
      "child_ranges": [
        "(line 804,col 13)-(line 804,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.bEqualsNullVector()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\n         * Returns {@code true} if the right-hand side vector is zero exactly.\n         *\n         * @return the boolean value of {@code b \u003d\u003d 0}\n         ",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.betaEqualsZero()",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n         * Returns {@code true} if {@code beta} is essentially zero. This method\n         * is used to check for early stop of the iterations.\n         *\n         * @return {@code true} if {@code beta \u003c }{@link #MACH_PREC}\n         ",
      "child_ranges": [
        "(line 823,col 13)-(line 823,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.State.getNormOfResidual()",
      "begin_line": 831,
      "end_line": 833,
      "comment": "\n         * Returns the norm of the updated, preconditioned residual.\n         *\n         * @return the norm of the residual, ||P * r||\n         ",
      "child_ranges": [
        "(line 832,col 13)-(line 832,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OPERATOR"
      ],
      "begin_line": 837,
      "end_line": 837,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "THRESHOLD"
      ],
      "begin_line": 840,
      "end_line": 840,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR"
      ],
      "begin_line": 843,
      "end_line": 843,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR1"
      ],
      "begin_line": 846,
      "end_line": 846,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR2"
      ],
      "begin_line": 849,
      "end_line": 849,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "check"
      ],
      "begin_line": 852,
      "end_line": 852,
      "comment": " {@code true} if symmetry of matrix and conditioner must be checked. "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 858,
      "end_line": 858,
      "comment": "\n     * The value of the custom tolerance \u0026delta; for the default stopping\n     * criterion.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SymmLQ.SymmLQ(int, double, boolean)",
      "begin_line": 870,
      "end_line": 875,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e. Note that setting {@code check} to {@code true}\n     * entails an extra matrix-vector product in the initial phase.\n     *\n     * @param maxIterations the maximum number of iterations\n     * @param delta the \u0026delta; parameter for the default stopping criterion\n     * @param check {@code true} if self-adjointedness of both matrix and\n     * preconditioner should be checked\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 29)",
        "(line 873,col 9)-(line 873,col 27)",
        "(line 874,col 9)-(line 874,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SymmLQ.SymmLQ(org.apache.commons.math3.util.IterationManager, double, boolean)",
      "begin_line": 888,
      "end_line": 893,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e and custom iteration manager. Note that setting\n     * {@code check} to {@code true} entails an extra matrix-vector product in\n     * the initial phase.\n     *\n     * @param manager the custom iteration manager\n     * @param delta the \u0026delta; parameter for the default stopping criterion\n     * @param check {@code true} if self-adjointedness of both matrix and\n     * preconditioner should be checked\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 23)",
        "(line 891,col 9)-(line 891,col 27)",
        "(line 892,col 9)-(line 892,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.getCheck()",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\n     * Returns {@code true} if symmetry of the matrix, and symmetry as well as\n     * positive definiteness of the preconditioner should be checked.\n     *\n     * @return {@code true} if the tests are to be performed\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 914,
      "end_line": 924,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 34)",
        "(line 922,col 9)-(line 922,col 73)",
        "(line 923,col 9)-(line 923,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, boolean, double)",
      "begin_line": 966,
      "end_line": 975,
      "comment": "\n     * Returns an estimate of the solution to the linear system (A - shift\n     * \u0026middot; I) \u0026middot; x \u003d b.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}; this however requires an\n     * extra call to the preconditioner.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a the linear operator A of the system\n     * @param m the preconditioner, M (can be {@code null})\n     * @param b the right-hand side vector\n     * @param goodb usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}\n     * @param shift the amount to be subtracted to all diagonal elements of A\n     * @return a reference to {@code x} (shallow copy)\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not square\n     * @throws DimensionMismatchException if {@code m} or {@code b} have dimensions\n     * inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 34)",
        "(line 973,col 9)-(line 973,col 73)",
        "(line 974,col 9)-(line 974,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 988,
      "end_line": 997,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x not meaningful in this implementation; should not be considered\n     * as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 34)",
        "(line 996,col 9)-(line 996,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1006,
      "end_line": 1015,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 34)",
        "(line 1012,col 9)-(line 1012,col 73)",
        "(line 1013,col 9)-(line 1013,col 18)",
        "(line 1014,col 9)-(line 1014,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, boolean, double)",
      "begin_line": 1052,
      "end_line": 1060,
      "comment": "\n     * Returns the solution to the system (A - shift \u0026middot; I) \u0026middot; x \u003d b.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a the linear operator A of the system\n     * @param b the right-hand side vector\n     * @param goodb usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}\n     * @param shift the amount to be subtracted to all diagonal elements of A\n     * @return a reference to {@code x}\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} is not square\n     * @throws DimensionMismatchException if {@code b} has dimensions\n     * inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 34)",
        "(line 1058,col 9)-(line 1058,col 73)",
        "(line 1059,col 9)-(line 1059,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solve(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1071,
      "end_line": 1079,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x not meaningful in this implementation; should not be considered\n     * as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 34)",
        "(line 1078,col 9)-(line 1078,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1092,
      "end_line": 1100,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x the vector to be updated with the solution; {@code x} should\n     * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, boolean, double)",
      "begin_line": 1144,
      "end_line": 1203,
      "comment": "\n     * Returns an estimate of the solution to the linear system (A - shift\n     * \u0026middot; I) \u0026middot; x \u003d b. The solution is computed in-place.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}; this however requires an\n     * extra call to the preconditioner.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a the linear operator A of the system\n     * @param m the preconditioner, M (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x the vector to be updated with the solution; {@code x} should\n     * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @param goodb usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}\n     * @param shift the amount to be subtracted to all diagonal elements of A\n     * @return a reference to {@code x} (shallow copy).\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not square\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}\n     * have dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction of the {@link IterationManager}\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 36)",
        "(line 1153,col 9)-(line 1153,col 63)",
        "(line 1155,col 9)-(line 1155,col 38)",
        "(line 1156,col 9)-(line 1156,col 42)",
        "(line 1158,col 9)-(line 1158,col 26)",
        "(line 1159,col 9)-(line 1159,col 63)",
        "(line 1160,col 9)-(line 1160,col 21)",
        "(line 1161,col 9)-(line 1161,col 32)",
        "(line 1162,col 9)-(line 1162,col 41)",
        "(line 1163,col 9)-(line 1167,col 81)",
        "(line 1168,col 9)-(line 1172,col 9)",
        "(line 1174,col 9)-(line 1174,col 32)",
        "(line 1175,col 9)-(line 1175,col 67)",
        "(line 1176,col 9)-(line 1176,col 47)",
        "(line 1177,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1200,col 81)",
        "(line 1201,col 9)-(line 1201,col 44)",
        "(line 1202,col 9)-(line 1202,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SymmLQ.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1214,
      "end_line": 1221,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x the vector to be updated with the solution; {@code x} should\n     * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 54)"
      ]
    }
  ]
}
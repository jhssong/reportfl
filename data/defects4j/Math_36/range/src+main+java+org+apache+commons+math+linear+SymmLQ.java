{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/linear/SymmLQ.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymmLQ",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver"
      ],
      "begin_line": 139,
      "end_line": 1185,
      "comment": "\n * \u003cp\u003e\n * Implementation of the SYMMLQ iterative linear solver proposed by \u003ca\n * href\u003d\"#PAIG1975\"\u003ePaige and Saunders (1975)\u003c/a\u003e. This implementation is\n * largely based on the FORTRAN code by Pr. Michael A. Saunders, available \u003ca\n * href\u003d\"http://www.stanford.edu/group/SOL/software/symmlq/f77/\"\u003ehere\u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * SYMMLQ is designed to solve the system of linear equations A \u0026middot; x \u003d b\n * where A is an n \u0026times; n self-adjoint linear operator (defined as a\n * {@link RealLinearOperator}), and b is a given vector. The operator A is not\n * required to be positive definite. If A is known to be definite, the method of\n * conjugate gradients might be preferred, since it will require about the same\n * number of iterations as SYMMLQ but slightly less work per iteration.\n * \u003c/p\u003e\n * \u003cp\u003e\n * SYMMLQ is designed to solve the system (A - shift \u0026middot; I) \u0026middot; x \u003d b,\n * where shift is a specified scalar value. If shift and b are suitably chosen,\n * the computed vector x may approximate an (unnormalized) eigenvector of A, as\n * in the methods of inverse iteration and/or Rayleigh-quotient iteration.\n * Again, the linear operator (A - shift \u0026middot; I) need not be positive\n * definite (but \u003cem\u003emust\u003c/em\u003e be self-adjoint). The work per iteration is very\n * slightly less if shift \u003d 0.\n * \u003c/p\u003e\n * \u003ch3\u003ePreconditioning\u003c/h3\u003e\n * \u003cp\u003e\n * Preconditioning may reduce the number of iterations required. The solver may be\n * provided with a positive definite preconditioner M \u003d C \u0026middot; C\u003csup\u003eT\u003c/sup\u003e\n * that is known to approximate (A - shift \u0026middot; I) in some sense, where\n * systems of the form M \u0026middot; y \u003d x can be solved efficiently. Then SYMMLQ\n * will implicitly solve the system of equations P \u0026middot; (A - shift \u0026middot;\n * I) \u0026middot; P\u003csup\u003eT\u003c/sup\u003e \u0026middot; xhat \u003d P \u0026middot; b, i.e. Ahat \u0026middot;\n * xhat \u003d bhat, where P \u003d C\u003csup\u003e-1\u003c/sup\u003e, Ahat \u003d P \u0026middot; (A - shift \u0026middot;\n * I) \u0026middot; P\u003csup\u003eT\u003c/sup\u003e, bhat \u003d P \u0026middot; b, and return the solution x \u003d\n * P\u003csup\u003eT\u003c/sup\u003e \u0026middot; xhat. The associated residual is rhat \u003d bhat - Ahat\n * \u0026middot; xhat \u003d P \u0026middot; [b - (A - shift \u0026middot; I) \u0026middot; x] \u003d P\n * \u0026middot; r.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"stopcrit\"\u003eDefault stopping criterion\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * A default stopping criterion is implemented. The iterations stop when || rhat\n * || \u0026le; \u0026delta; || Ahat || || xhat ||, where xhat is the current estimate of\n * the solution of the transformed system, rhat the current estimate of the\n * corresponding residual, and \u0026delta; a user-specified tolerance.\n * \u003c/p\u003e\n * \u003ch3\u003eIteration count\u003c/h3\u003e\n * \u003cp\u003e\n * In the present context, an iteration should be understood as one evaluation\n * of the matrix-vector product A \u0026middot; x. The initialization phase therefore\n * counts as one iteration. If the user requires checks on the symmetry of A,\n * this entails one further matrix-vector product in the initial phase. This\n * further product is \u003cem\u003enot\u003c/em\u003e accounted for in the iteration count. In\n * other words, the number of iterations required to reach convergence will be\n * identical, whether checks have been required or not.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The present definition of the iteration count differs from that adopted in\n * the original FOTRAN code, where the initialization phase was \u003cem\u003enot\u003c/em\u003e\n * taken into account.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"initguess\"\u003eInitial guess of the solution\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The {@code x} parameter in\n * \u003cul\u003e\n * \u003cli\u003e{@link #solve(RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solve(RealLinearOperator, RealLinearOperator, RealVector, RealVector)}},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector, boolean, double)},\u003c/li\u003e\n * \u003c/ul\u003e\n * should not be considered as an initial guess, as it is set to zero in the\n * initial phase. If x\u003csub\u003e0\u003c/sub\u003e is known to be a good approximation to x, one\n * should compute r\u003csub\u003e0\u003c/sub\u003e \u003d b - A \u0026middot; x, solve A \u0026middot; dx \u003d r0,\n * and set x \u003d x\u003csub\u003e0\u003c/sub\u003e + dx.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"context\"\u003eException context\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * Besides standard {@link DimensionMismatchException}, this class might throw\n * {@link NonSelfAdjointOperatorException} if the linear operator or the\n * preconditioner are not symmetric. In this case, the {@link ExceptionContext}\n * provides more information\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"} points to the offending linear operator, say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector1\"} points to the first offending vector, say x,\n * \u003cli\u003ekey {@code \"vector2\"} points to the second offending vector, say y, such\n * that x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; y \u0026ne; y\u003csup\u003eT\u003c/sup\u003e \u0026middot; L\n * \u0026middot; x (within a certain accuracy).\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link NonPositiveDefiniteOperatorException} might also be thrown in case the\n * preconditioner is not positive definite. The relevant keys to the\n * {@link ExceptionContext} are\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"}, which points to the offending linear operator,\n * say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector\"}, which points to the offending vector, say x, such\n * that x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; x \u003c 0.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003ch3\u003eReferences\u003c/h3\u003e\n * \u003cdl\u003e\n * \u003cdt\u003e\u003ca id\u003d\"PAIG1975\"\u003ePaige and Saunders (1975)\u003c/a\u003e\u003c/dt\u003e\n * \u003cdd\u003eC. C. Paige and M. A. Saunders, \u003ca\n * href\u003d\"http://www.stanford.edu/group/SOL/software/symmlq/PS75.pdf\"\u003e\u003cem\u003e\n * Solution of Sparse Indefinite Systems of Linear Equations\u003c/em\u003e\u003c/a\u003e, SIAM\n * Journal on Numerical Analysis 12(4): 617-629, 1975\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 228,
      "end_line": 654,
      "comment": "\n     * \u003cp\u003e\n     * A simple container holding the non-final variables used in the\n     * iterations. Making the current state of the solver visible from the\n     * outside is necessary, because during the iterations, {@code x} does not\n     * \u003cem\u003eexactly\u003c/em\u003e hold the current estimate of the solution. Indeed,\n     * {@code x} needs in general to be moved from the LQ point to the CG point.\n     * Besides, additional upudates must be carried out in case {@code goodb} is\n     * set to {@code true}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In all subsequent comments, the description of the state variables refer\n     * to their value after a call to {@link #update()}. In these comments, k is\n     * the current number of evaluations of matrix-vector products.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " Reference to the linear operator. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " Reference to the right-hand side vector. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " The value of beta[k+1]. "
    },
    {
      "type": "field",
      "varNames": [
        "beta1"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " The value of beta[1]. "
    },
    {
      "type": "field",
      "varNames": [
        "bstep"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " The value of bstep[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "cgnorm"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " The estimate of the norm of P * rC[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "dbar"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " The value of dbar[k+1] \u003d -beta[k+1] * c[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "gammaZeta"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n         * The value of gamma[k] * zeta[k]. Was called {@code rhs1} in the\n         * initial code.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "gbar"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " The value of gbar[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "gmax"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " The value of max(|alpha[1]|, gamma[1], ..., gamma[k-1]). "
    },
    {
      "type": "field",
      "varNames": [
        "gmin"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " The value of min(|alpha[1]|, gamma[1], ..., gamma[k-1]). "
    },
    {
      "type": "field",
      "varNames": [
        "goodb"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " Copy of the {@code goodb} parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "hasConverged"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " {@code true} if the default convergence criterion is verified. "
    },
    {
      "type": "field",
      "varNames": [
        "lqnorm"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " The estimate of the norm of P * rL[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "minv"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Reference to the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "minusEpsZeta"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n         * The value of (-eps[k+1] * zeta[k-1]). Was called {@code rhs2} in the\n         * initial code.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "minvb"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " The value of M^(-1) * b. "
    },
    {
      "type": "field",
      "varNames": [
        "oldb"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " The value of beta[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "r1"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " The value of beta[k] * M * P\u0027 * v[k]. "
    },
    {
      "type": "field",
      "varNames": [
        "r2"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": " The value of beta[k+1] * M * P\u0027 * v[k+1]. "
    },
    {
      "type": "field",
      "varNames": [
        "shift"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " Copy of the {@code shift} parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "snprod"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " The value of s[1] * ... * s[k-1]. "
    },
    {
      "type": "field",
      "varNames": [
        "tnorm"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": "\n         * An estimate of the square of the norm of A * V[k], based on Paige and\n         * Saunders (1975), equation (3.3).\n         "
    },
    {
      "type": "field",
      "varNames": [
        "wbar"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n         * The value of P\u0027 * wbar[k] or P\u0027 * (wbar[k] - s[1] * ... * s[k-1] *\n         * v[1]) if {@code goodb} is {@code true}. Was called {@code w} in the\n         * initial code.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": "\n         * A reference to the vector to be updated with the solution. Contains\n         * the value of xL[k-1] if {@code goodb} is {@code false}, (xL[k-1] -\n         * bstep[k-1] * v[1]) otherwise.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " The value of beta[k+1] * P\u0027 * v[k+1]. "
    },
    {
      "type": "field",
      "varNames": [
        "ynorm2"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " The value of zeta[1]^2 + ... + zeta[k-1]^2. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.State(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 342,
      "end_line": 354,
      "comment": "\n         * Creates and inits to k \u003d 1 a new instance of this class.\n         *\n         * @param a the linear operator A of the system\n         * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n         * (can be {@code null})\n         * @param b the right-hand side vector\n         * @param x the vector to be updated with the solution; {@code x} should\n         * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n         * @param goodb usually {@code false}, except if {@code x} is expected\n         * to contain a large multiple of {@code b}\n         * @param shift the amount to be subtracted to all diagonal elements of\n         * A\n         ",
      "child_ranges": [
        "(line 345,col 13)-(line 345,col 23)",
        "(line 346,col 13)-(line 346,col 29)",
        "(line 347,col 13)-(line 347,col 23)",
        "(line 348,col 13)-(line 348,col 23)",
        "(line 349,col 13)-(line 349,col 31)",
        "(line 350,col 13)-(line 350,col 31)",
        "(line 351,col 13)-(line 351,col 60)",
        "(line 352,col 13)-(line 352,col 38)",
        "(line 353,col 13)-(line 353,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.refine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 363,
      "end_line": 397,
      "comment": "\n         * Move to the CG point if it seems better. In this version of SYMMLQ,\n         * the convergence tests involve only cgnorm, so we\u0027re unlikely to stop\n         * at an LQ point, except if the iteration limit interferes.\n         *\n         * @param xRefined the vector to be updated with the refined value of x\n         ",
      "child_ranges": [
        "(line 364,col 13)-(line 364,col 48)",
        "(line 365,col 13)-(line 396,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.init()",
      "begin_line": 404,
      "end_line": 487,
      "comment": "\n         * Performs the initial phase of the SYMMLQ algorithm. On return, the\n         * value of the state variables of {@code this} object correspond to k \u003d\n         * 1.\n         ",
      "child_ranges": [
        "(line 405,col 13)-(line 405,col 27)",
        "(line 410,col 13)-(line 410,col 36)",
        "(line 411,col 13)-(line 411,col 84)",
        "(line 412,col 13)-(line 414,col 13)",
        "(line 416,col 13)-(line 416,col 52)",
        "(line 417,col 13)-(line 419,col 13)",
        "(line 420,col 13)-(line 423,col 13)",
        "(line 424,col 13)-(line 424,col 51)",
        "(line 430,col 13)-(line 430,col 69)",
        "(line 431,col 13)-(line 431,col 39)",
        "(line 432,col 13)-(line 434,col 13)",
        "(line 439,col 13)-(line 439,col 42)",
        "(line 440,col 13)-(line 440,col 54)",
        "(line 441,col 13)-(line 441,col 56)",
        "(line 448,col 13)-(line 448,col 52)",
        "(line 449,col 13)-(line 449,col 47)",
        "(line 450,col 13)-(line 450,col 41)",
        "(line 451,col 13)-(line 451,col 36)",
        "(line 452,col 13)-(line 454,col 13)",
        "(line 455,col 13)-(line 455,col 35)",
        "(line 456,col 13)-(line 456,col 51)",
        "(line 457,col 13)-(line 459,col 13)",
        "(line 460,col 13)-(line 460,col 49)",
        "(line 468,col 13)-(line 468,col 37)",
        "(line 469,col 13)-(line 469,col 30)",
        "(line 470,col 13)-(line 470,col 34)",
        "(line 471,col 13)-(line 471,col 40)",
        "(line 472,col 13)-(line 472,col 35)",
        "(line 473,col 13)-(line 473,col 28)",
        "(line 474,col 13)-(line 474,col 29)",
        "(line 475,col 13)-(line 475,col 63)",
        "(line 476,col 13)-(line 476,col 29)",
        "(line 477,col 13)-(line 477,col 56)",
        "(line 478,col 13)-(line 478,col 34)",
        "(line 480,col 13)-(line 485,col 13)",
        "(line 486,col 13)-(line 486,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.update()",
      "begin_line": 495,
      "end_line": 612,
      "comment": "\n         * Performs the next iteration of the algorithm. The iteration count\n         * should be incremented prior to calling this method. On return, the\n         * value of the state variables of {@code this} object correspond to the\n         * current iteration count {@code k}.\n         ",
      "child_ranges": [
        "(line 496,col 13)-(line 496,col 58)",
        "(line 497,col 13)-(line 497,col 29)",
        "(line 498,col 13)-(line 498,col 53)",
        "(line 499,col 13)-(line 499,col 49)",
        "(line 510,col 13)-(line 510,col 40)",
        "(line 524,col 13)-(line 524,col 20)",
        "(line 525,col 13)-(line 525,col 19)",
        "(line 526,col 13)-(line 528,col 13)",
        "(line 529,col 13)-(line 529,col 24)",
        "(line 530,col 13)-(line 530,col 36)",
        "(line 531,col 13)-(line 533,col 13)",
        "(line 534,col 13)-(line 534,col 39)",
        "(line 543,col 13)-(line 543,col 63)",
        "(line 551,col 13)-(line 551,col 74)",
        "(line 552,col 13)-(line 552,col 42)",
        "(line 553,col 13)-(line 553,col 42)",
        "(line 563,col 13)-(line 563,col 55)",
        "(line 564,col 13)-(line 564,col 40)",
        "(line 565,col 13)-(line 565,col 40)",
        "(line 566,col 13)-(line 566,col 29)",
        "(line 567,col 13)-(line 567,col 50)",
        "(line 576,col 13)-(line 576,col 42)",
        "(line 577,col 13)-(line 577,col 42)",
        "(line 578,col 13)-(line 578,col 43)",
        "(line 579,col 13)-(line 585,col 13)",
        "(line 592,col 13)-(line 592,col 39)",
        "(line 593,col 13)-(line 593,col 24)",
        "(line 594,col 13)-(line 594,col 45)",
        "(line 595,col 13)-(line 595,col 45)",
        "(line 596,col 13)-(line 596,col 34)",
        "(line 597,col 13)-(line 597,col 53)",
        "(line 598,col 13)-(line 598,col 39)",
        "(line 611,col 13)-(line 611,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.updateNorms()",
      "begin_line": 618,
      "end_line": 653,
      "comment": "\n         * Computes the norms of the residuals, and checks for convergence.\n         * Updates {@link #lqnorm} and {@link #cgnorm}.\n         ",
      "child_ranges": [
        "(line 619,col 13)-(line 619,col 54)",
        "(line 620,col 13)-(line 620,col 55)",
        "(line 621,col 13)-(line 621,col 50)",
        "(line 622,col 13)-(line 622,col 58)",
        "(line 623,col 13)-(line 623,col 54)",
        "(line 624,col 13)-(line 624,col 57)",
        "(line 625,col 13)-(line 626,col 64)",
        "(line 627,col 13)-(line 627,col 49)",
        "(line 628,col 13)-(line 628,col 56)",
        "(line 636,col 13)-(line 636,col 31)",
        "(line 637,col 13)-(line 641,col 13)",
        "(line 642,col 13)-(line 644,col 13)",
        "(line 645,col 13)-(line 651,col 13)",
        "(line 652,col 13)-(line 652,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SymmLQEvent",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.IterativeLinearSolverEvent"
      ],
      "begin_line": 661,
      "end_line": 711,
      "comment": "\n     * The type of all events fired by this implementation of the SYMMLQ method.\n     *\n     * @version $Id$\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 668,
      "end_line": 668,
      "comment": " "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 671,
      "end_line": 671,
      "comment": " A reference to the state of this solver. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQEvent.SymmLQEvent(java.lang.Object, org.apache.commons.math.linear.SymmLQ.State)",
      "begin_line": 680,
      "end_line": 683,
      "comment": "\n         * Creates a new instance of this class.\n         *\n         * @param source the iterative algorithm on which the event initially\n         * occurred\n         * @param state the state of this solver at the time of creation\n         ",
      "child_ranges": [
        "(line 681,col 13)-(line 681,col 65)",
        "(line 682,col 13)-(line 682,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQEvent.getIterations()",
      "begin_line": 686,
      "end_line": 689,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 688,col 13)-(line 688,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQEvent.getNormOfResidual()",
      "begin_line": 692,
      "end_line": 695,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 694,col 13)-(line 694,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQEvent.getRightHandSideVector()",
      "begin_line": 698,
      "end_line": 701,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 700,col 13)-(line 700,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQEvent.getSolution()",
      "begin_line": 704,
      "end_line": 710,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 706,col 13)-(line 706,col 49)",
        "(line 707,col 13)-(line 707,col 56)",
        "(line 708,col 13)-(line 708,col 28)",
        "(line 709,col 13)-(line 709,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CBRT_MACH_PREC"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": " The cubic root of {@link #MACH_PREC}. "
    },
    {
      "type": "field",
      "varNames": [
        "MACH_PREC"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": " The machine precision. "
    },
    {
      "type": "field",
      "varNames": [
        "OPERATOR"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "THRESHOLD"
      ],
      "begin_line": 723,
      "end_line": 723,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR"
      ],
      "begin_line": 726,
      "end_line": 726,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR1"
      ],
      "begin_line": 729,
      "end_line": 729,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR2"
      ],
      "begin_line": 732,
      "end_line": 732,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "check"
      ],
      "begin_line": 735,
      "end_line": 735,
      "comment": " {@code true} if symmetry of matrix and conditioner must be checked. "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 741,
      "end_line": 741,
      "comment": "\n     * The value of the custom tolerance \u0026delta; for the default stopping\n     * criterion.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQ(int, double, boolean)",
      "begin_line": 753,
      "end_line": 758,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e. Note that setting {@code check} to {@code true}\n     * entails an extra matrix-vector product in the initial phase.\n     *\n     * @param maxIterations the maximum number of iterations\n     * @param delta the \u0026delta; parameter for the default stopping criterion\n     * @param check {@code true} if self-adjointedness of both matrix and\n     * preconditioner should be checked\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 29)",
        "(line 756,col 9)-(line 756,col 27)",
        "(line 757,col 9)-(line 757,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQ(org.apache.commons.math.util.IterationManager, double, boolean)",
      "begin_line": 771,
      "end_line": 776,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e and custom iteration manager. Note that setting\n     * {@code check} to {@code true} entails an extra matrix-vector product in\n     * the initial phase.\n     *\n     * @param manager the custom iteration manager\n     * @param delta the \u0026delta; parameter for the default stopping criterion\n     * @param check {@code true} if self-adjointedness of both matrix and\n     * preconditioner should be checked\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 23)",
        "(line 774,col 9)-(line 774,col 27)",
        "(line 775,col 9)-(line 775,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.checkSymmetry(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 796,
      "end_line": 812,
      "comment": "\n     * Performs a symmetry check on the specified linear operator, and throws an\n     * exception in case this check fails. Given a linear operator L, and a\n     * vector x, this method checks that\n     * x\u0027 \u0026middot; L \u0026middot; y \u003d y\u0027 \u0026middot; L \u0026middot; x\n     * (within a given accuracy), where y \u003d L \u0026middot; x.\n     *\n     * @param l the linear operator L\n     * @param x the candidate vector x\n     * @param y the candidate vector y \u003d L \u0026middot; x\n     * @param z the vector z \u003d L \u0026middot; y\n     * @throws NonSelfAdjointOperatorException when the test fails\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 41)",
        "(line 800,col 9)-(line 800,col 41)",
        "(line 801,col 9)-(line 801,col 61)",
        "(line 802,col 9)-(line 811,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.daxpbypz(double, org.apache.commons.math.linear.RealVector, double, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 825,
      "end_line": 833,
      "comment": "\n     * A BLAS-like function, for the operation z \u0026larr; a \u0026middot; x + b\n     * \u0026middot; y + z. This is for internal use only: no dimension checks are\n     * provided.\n     *\n     * @param a the scalar by which {@code x} is to be multiplied\n     * @param x the first vector to be added to {@code z}\n     * @param b the scalar by which {@code y} is to be multiplied\n     * @param y the second vector to be added to {@code z}\n     * @param z the vector to be incremented\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 39)",
        "(line 828,col 9)-(line 832,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.daxpy(double, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 844,
      "end_line": 850,
      "comment": "\n     * A clone of the BLAS {@code DAXPY} function, which carries out the\n     * operation y \u0026larr; a \u0026middot; x + y. This is for internal use only: no\n     * dimension checks are provided.\n     *\n     * @param a the scalar by which {@code x} is to be multiplied\n     * @param x the vector to be added to {@code y}\n     * @param y the vector to be incremented\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 39)",
        "(line 847,col 9)-(line 849,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.throwNPDLOException(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 860,
      "end_line": 868,
      "comment": "\n     * Throws a new {@link NonPositiveDefiniteOperatorException} with\n     * appropriate context.\n     *\n     * @param l the offending linear operator\n     * @param v the offending vector\n     * @throws NonPositiveDefiniteOperatorException in any circumstances\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 53)",
        "(line 863,col 9)-(line 863,col 55)",
        "(line 864,col 9)-(line 864,col 56)",
        "(line 865,col 9)-(line 865,col 38)",
        "(line 866,col 9)-(line 866,col 36)",
        "(line 867,col 9)-(line 867,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.getCheck()",
      "begin_line": 876,
      "end_line": 878,
      "comment": "\n     * Returns {@code true} if symmetry of the matrix, and symmetry as well as\n     * positive definiteness of the preconditioner should be checked.\n     *\n     * @return {@code true} if the tests are to be performed\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 889,
      "end_line": 899,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code minv} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code minv} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 34)",
        "(line 897,col 9)-(line 897,col 73)",
        "(line 898,col 9)-(line 898,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 943,
      "end_line": 952,
      "comment": "\n     * Returns an estimate of the solution to the linear system (A - shift\n     * \u0026middot; I) \u0026middot; x \u003d b.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}; this however requires an\n     * extra call to the preconditioner.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a the linear operator A of the system\n     * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n     * (can be {@code null})\n     * @param b the right-hand side vector\n     * @param goodb usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}\n     * @param shift the amount to be subtracted to all diagonal elements of A\n     * @return a reference to {@code x} (shallow copy)\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code minv} is not\n     * square\n     * @throws DimensionMismatchException if {@code minv} or {@code b} have\n     * dimensions inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code minv} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code minv} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 34)",
        "(line 950,col 9)-(line 950,col 73)",
        "(line 951,col 9)-(line 951,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 965,
      "end_line": 974,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x not meaningful in this implementation; should not be considered\n     * as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code minv} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code minv} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 34)",
        "(line 973,col 9)-(line 973,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 983,
      "end_line": 992,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 34)",
        "(line 989,col 9)-(line 989,col 73)",
        "(line 990,col 9)-(line 990,col 18)",
        "(line 991,col 9)-(line 991,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 1029,
      "end_line": 1037,
      "comment": "\n     * Returns the solution to the system (A - shift \u0026middot; I) \u0026middot; x \u003d b.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a the linear operator A of the system\n     * @param b the right-hand side vector\n     * @param goodb usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}\n     * @param shift the amount to be subtracted to all diagonal elements of A\n     * @return a reference to {@code x}\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} is not square\n     * @throws DimensionMismatchException if {@code b} has dimensions\n     * inconsistent with {@code a}\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 34)",
        "(line 1035,col 9)-(line 1035,col 73)",
        "(line 1036,col 9)-(line 1036,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1048,
      "end_line": 1056,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x not meaningful in this implementation; should not be considered\n     * as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 34)",
        "(line 1055,col 9)-(line 1055,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1069,
      "end_line": 1077,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x the vector to be updated with the solution; {@code x} should\n     * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code minv} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code minv} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 1123,
      "end_line": 1166,
      "comment": "\n     * Returns an estimate of the solution to the linear system (A - shift\n     * \u0026middot; I) \u0026middot; x \u003d b. The solution is computed in-place.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}; this however requires an\n     * extra call to the preconditioner.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a the linear operator A of the system\n     * @param minv the inverse of the preconditioner, M\u003csup\u003e-1\u003c/sup\u003e\n     * (can be {@code null})\n     * @param b the right-hand side vector\n     * @param x the vector to be updated with the solution; {@code x} should\n     * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @param goodb usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}\n     * @param shift the amount to be subtracted to all diagonal elements of A\n     * @return a reference to {@code x} (shallow copy).\n     * @throws NullArgumentException if one of the parameters is {@code null}\n     * @throws NonSquareOperatorException if {@code a} or {@code minv} is not\n     * square\n     * @throws DimensionMismatchException if {@code minv}, {@code b} or\n     * {@code x} have dimensions inconsistent with {@code a}.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom\n     * {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback}\n     * has been set at construction\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code minv} is not self-adjoint\n     * @throws NonPositiveDefiniteOperatorException if {@code minv} is not\n     * positive definite\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 39)",
        "(line 1132,col 9)-(line 1132,col 63)",
        "(line 1134,col 9)-(line 1134,col 38)",
        "(line 1135,col 9)-(line 1135,col 42)",
        "(line 1137,col 9)-(line 1137,col 67)",
        "(line 1138,col 9)-(line 1138,col 78)",
        "(line 1139,col 9)-(line 1143,col 9)",
        "(line 1145,col 9)-(line 1145,col 32)",
        "(line 1146,col 9)-(line 1146,col 69)",
        "(line 1147,col 9)-(line 1147,col 47)",
        "(line 1148,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 24)",
        "(line 1162,col 9)-(line 1162,col 25)",
        "(line 1163,col 9)-(line 1163,col 29)",
        "(line 1164,col 9)-(line 1164,col 44)",
        "(line 1165,col 9)-(line 1165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1177,
      "end_line": 1184,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param x the vector to be updated with the solution; {@code x} should\n     * not be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e)\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1183,col 54)"
      ]
    }
  ]
}
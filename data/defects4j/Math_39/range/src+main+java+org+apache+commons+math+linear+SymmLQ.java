{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/linear/SymmLQ.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymmLQ",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver"
      ],
      "begin_line": 139,
      "end_line": 1236,
      "comment": "\n * \u003cp\u003e\n * Implementation of the SYMMLQ iterative linear solver proposed by \u003ca\n * href\u003d\"#PAIG1975\"\u003ePaige and Saunders (1975)\u003c/a\u003e. This implementation is\n * largely based on the FORTRAN code by Pr. Michael A. Saunders, available \u003ca\n * href\u003d\"http://www.stanford.edu/group/SOL/software/symmlq/f77/\"\u003ehere\u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * SYMMLQ is designed to solve the system of linear equations A \u0026middot; x \u003d b\n * where A is an n \u0026times; n self-adjoint linear operator (defined as a\n * {@link RealLinearOperator}), and b is a given vector. The operator A is not\n * required to be positive definite. If A is known to be definite, the method of\n * conjugate gradients might be preferred, since it will require about the same\n * number of iterations as SYMMLQ but slightly less work per iteration.\n * \u003c/p\u003e\n * \u003cp\u003e\n * SYMMLQ is designed to solve the system (A - shift \u0026middot; I) \u0026middot; x \u003d b,\n * where shift is a specified scalar value. If shift and b are suitably chosen,\n * the computed vector x may approximate an (unnormalized) eigenvector of A, as\n * in the methods of inverse iteration and/or Rayleigh-quotient iteration.\n * Again, the linear operator (A - shift \u0026middot; I) need not be positive\n * definite (but \u003cem\u003emust\u003c/em\u003e be self-adjoint). The work per iteration is very\n * slightly less if shift \u003d 0.\n * \u003c/p\u003e\n * \u003ch3\u003ePreconditioning\u003c/h3\u003e\n * \u003cp\u003e\n * Preconditioning may reduce the number of iterations required. The solver may be\n * provided with a positive definite preconditioner M \u003d C \u0026middot; C\u003csup\u003eT\u003c/sup\u003e\n * that is known to approximate (A - shift \u0026middot; I) in some sense, where\n * systems of the form M \u0026middot; y \u003d x can be solved efficiently. Then SYMMLQ\n * will implicitly solve the system of equations P \u0026middot; (A - shift \u0026middot;\n * I) \u0026middot; P\u003csup\u003eT\u003c/sup\u003e \u0026middot; xhat \u003d P \u0026middot; b, i.e. Ahat \u0026middot;\n * xhat \u003d bhat, where P \u003d C\u003csup\u003e-1\u003c/sup\u003e, Ahat \u003d P \u0026middot; (A - shift \u0026middot;\n * I) \u0026middot; P\u003csup\u003eT\u003c/sup\u003e, bhat \u003d P \u0026middot; b, and return the solution x \u003d\n * P\u003csup\u003eT\u003c/sup\u003e \u0026middot; xhat. The associated residual is rhat \u003d bhat - Ahat\n * \u0026middot; xhat \u003d P \u0026middot; [b - (A - shift \u0026middot; I) \u0026middot; x] \u003d P\n * \u0026middot; r.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"stopcrit\"\u003eDefault stopping criterion\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * A default stopping criterion is implemented. The iterations stop when || rhat\n * || \u0026le; \u0026delta; || Ahat || || xhat ||, where xhat is the current estimate of\n * the solution of the transformed system, rhat the current estimate of the\n * corresponding residual, and \u0026delta; a user-specified tolerance.\n * \u003c/p\u003e\n * \u003ch3\u003eIteration count\u003c/h3\u003e\n * \u003cp\u003e\n * In the present context, an iteration should be understood as one evaluation\n * of the matrix-vector product A \u0026middot; x. The initialization phase therefore\n * counts as one iteration. If the user requires checks on the symmetry of A,\n * this entails one further matrix-vector product in the initial phase. This\n * further product is \u003cem\u003enot\u003c/em\u003e accounted for in the iteration count. In\n * other words, the number of iterations required to reach convergence will be\n * identical, whether checks have been required or not.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The present definition of the iteration count differs from that adopted in\n * the original FOTRAN code, where the initialization phase was \u003cem\u003enot\u003c/em\u003e\n * taken into account.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"initguess\"\u003eInitial guess of the solution\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The {@code x} parameter in\n * \u003cul\u003e\n * \u003cli\u003e{@link #solve(RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solve(RealLinearOperator, InvertibleRealLinearOperator, RealVector, RealVector)}},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, InvertibleRealLinearOperator, RealVector, RealVector)},\u003c/li\u003e\n * \u003cli\u003e{@link #solveInPlace(RealLinearOperator, InvertibleRealLinearOperator, RealVector, RealVector, boolean, double)},\u003c/li\u003e\n * \u003c/ul\u003e\n * should not be considered as an initial guess, as it is set to zero in the\n * initial phase. If x\u003csub\u003e0\u003c/sub\u003e is known to be a good approximation to x, one\n * should compute r\u003csub\u003e0\u003c/sub\u003e \u003d b - A \u0026middot; x, solve A \u0026middot; dx \u003d r0,\n * and set x \u003d x\u003csub\u003e0\u003c/sub\u003e + dx.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"context\"\u003eException context\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * Besides standard {@link DimensionMismatchException}, this class might throw\n * {@link NonSelfAdjointOperatorException} if the linear operator or the\n * preconditioner are not symmetric. In this case, the {@link ExceptionContext}\n * provides more information\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"} points to the offending linear operator, say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector1\"} points to the first offending vector, say x,\n * \u003cli\u003ekey {@code \"vector2\"} points to the second offending vector, say y, such\n * that x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; y \u0026ne; y\u003csup\u003eT\u003c/sup\u003e \u0026middot; L\n * \u0026middot; x (within a certain accuracy).\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link NonPositiveDefiniteOperatorException} might also be thrown in case the\n * preconditioner is not positive definite. The relevant keys to the\n * {@link ExceptionContext} are\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"}, which points to the offending linear operator,\n * say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector\"}, which points to the offending vector, say x, such\n * that x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; x \u003c 0.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003ch3\u003eReferences\u003c/h3\u003e\n * \u003cdl\u003e\n * \u003cdt\u003e\u003ca id\u003d\"PAIG1975\"\u003ePaige and Saunders (1975)\u003c/a\u003e\u003c/dt\u003e\n * \u003cdd\u003eC. C. Paige and M. A. Saunders, \u003ca\n * href\u003d\"http://www.stanford.edu/group/SOL/software/symmlq/PS75.pdf\"\u003e\u003cem\u003e\n * Solution of Sparse Indefinite Systems of Linear Equations\u003c/em\u003e\u003c/a\u003e, SIAM\n * Journal on Numerical Analysis 12(4): 617-629, 1975\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 228,
      "end_line": 653,
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
        "m"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Reference to the preconditioner. "
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
        "mSolveB"
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
      "signature": "org.apache.commons.math.linear.SymmLQ.State.State(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 341,
      "end_line": 353,
      "comment": "\n         * Creates and inits to k \u003d 1 a new instance of this class.\n         *\n         * @param a Linear operator A of the system.\n         * @param m Preconditioner (can be {@code null}).\n         * @param b Right-hand side vector.\n         * @param x Vector to be updated with the solution. {@code x} should not\n         * be considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e).\n         * @param goodb Usually {@code false}, except if {@code x} is expected\n         * to contain a large multiple of {@code b}.\n         * @param shift The amount to be subtracted to all diagonal elements of\n         * A.\n         ",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 23)",
        "(line 345,col 13)-(line 345,col 23)",
        "(line 346,col 13)-(line 346,col 23)",
        "(line 347,col 13)-(line 347,col 23)",
        "(line 348,col 13)-(line 348,col 31)",
        "(line 349,col 13)-(line 349,col 31)",
        "(line 350,col 13)-(line 350,col 54)",
        "(line 351,col 13)-(line 351,col 38)",
        "(line 352,col 13)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.refine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 362,
      "end_line": 396,
      "comment": "\n         * Move to the CG point if it seems better. In this version of SYMMLQ,\n         * the convergence tests involve only cgnorm, so we\u0027re unlikely to stop\n         * at an LQ point, except if the iteration limit interferes.\n         *\n         * @param xRefined Vector to be updated with the refined value of x.\n         ",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 48)",
        "(line 364,col 13)-(line 395,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.init()",
      "begin_line": 403,
      "end_line": 486,
      "comment": "\n         * Performs the initial phase of the SYMMLQ algorithm. On return, the\n         * value of the state variables of {@code this} object correspond to k \u003d\n         * 1.\n         ",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 27)",
        "(line 409,col 13)-(line 409,col 36)",
        "(line 410,col 13)-(line 410,col 76)",
        "(line 411,col 13)-(line 413,col 13)",
        "(line 415,col 13)-(line 415,col 52)",
        "(line 416,col 13)-(line 418,col 13)",
        "(line 419,col 13)-(line 422,col 13)",
        "(line 423,col 13)-(line 423,col 51)",
        "(line 429,col 13)-(line 429,col 69)",
        "(line 430,col 13)-(line 430,col 39)",
        "(line 431,col 13)-(line 433,col 13)",
        "(line 438,col 13)-(line 438,col 42)",
        "(line 439,col 13)-(line 439,col 54)",
        "(line 440,col 13)-(line 440,col 56)",
        "(line 447,col 13)-(line 447,col 52)",
        "(line 448,col 13)-(line 448,col 47)",
        "(line 449,col 13)-(line 449,col 41)",
        "(line 450,col 13)-(line 450,col 36)",
        "(line 451,col 13)-(line 453,col 13)",
        "(line 454,col 13)-(line 454,col 35)",
        "(line 455,col 13)-(line 455,col 51)",
        "(line 456,col 13)-(line 458,col 13)",
        "(line 459,col 13)-(line 459,col 49)",
        "(line 467,col 13)-(line 467,col 37)",
        "(line 468,col 13)-(line 468,col 30)",
        "(line 469,col 13)-(line 469,col 34)",
        "(line 470,col 13)-(line 470,col 40)",
        "(line 471,col 13)-(line 471,col 35)",
        "(line 472,col 13)-(line 472,col 28)",
        "(line 473,col 13)-(line 473,col 29)",
        "(line 474,col 13)-(line 474,col 63)",
        "(line 475,col 13)-(line 475,col 29)",
        "(line 476,col 13)-(line 476,col 56)",
        "(line 477,col 13)-(line 477,col 34)",
        "(line 479,col 13)-(line 484,col 13)",
        "(line 485,col 13)-(line 485,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.update()",
      "begin_line": 494,
      "end_line": 611,
      "comment": "\n         * Performs the next iteration of the algorithm. The iteration count\n         * should be incremented prior to calling this method. On return, the\n         * value of the state variables of {@code this} object correspond to the\n         * current iteration count {@code k}.\n         ",
      "child_ranges": [
        "(line 495,col 13)-(line 495,col 58)",
        "(line 496,col 13)-(line 496,col 29)",
        "(line 497,col 13)-(line 497,col 53)",
        "(line 498,col 13)-(line 498,col 49)",
        "(line 509,col 13)-(line 509,col 40)",
        "(line 523,col 13)-(line 523,col 20)",
        "(line 524,col 13)-(line 524,col 19)",
        "(line 525,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 528,col 24)",
        "(line 529,col 13)-(line 529,col 36)",
        "(line 530,col 13)-(line 532,col 13)",
        "(line 533,col 13)-(line 533,col 39)",
        "(line 542,col 13)-(line 542,col 63)",
        "(line 550,col 13)-(line 550,col 74)",
        "(line 551,col 13)-(line 551,col 42)",
        "(line 552,col 13)-(line 552,col 42)",
        "(line 562,col 13)-(line 562,col 55)",
        "(line 563,col 13)-(line 563,col 40)",
        "(line 564,col 13)-(line 564,col 40)",
        "(line 565,col 13)-(line 565,col 29)",
        "(line 566,col 13)-(line 566,col 50)",
        "(line 575,col 13)-(line 575,col 42)",
        "(line 576,col 13)-(line 576,col 42)",
        "(line 577,col 13)-(line 577,col 43)",
        "(line 578,col 13)-(line 584,col 13)",
        "(line 591,col 13)-(line 591,col 39)",
        "(line 592,col 13)-(line 592,col 24)",
        "(line 593,col 13)-(line 593,col 45)",
        "(line 594,col 13)-(line 594,col 45)",
        "(line 595,col 13)-(line 595,col 34)",
        "(line 596,col 13)-(line 596,col 53)",
        "(line 597,col 13)-(line 597,col 39)",
        "(line 610,col 13)-(line 610,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.State.updateNorms()",
      "begin_line": 617,
      "end_line": 652,
      "comment": "\n         * Computes the norms of the residuals, and checks for convergence.\n         * Updates {@link #lqnorm} and {@link #cgnorm}.\n         ",
      "child_ranges": [
        "(line 618,col 13)-(line 618,col 54)",
        "(line 619,col 13)-(line 619,col 55)",
        "(line 620,col 13)-(line 620,col 50)",
        "(line 621,col 13)-(line 621,col 58)",
        "(line 622,col 13)-(line 622,col 54)",
        "(line 623,col 13)-(line 623,col 57)",
        "(line 624,col 13)-(line 625,col 64)",
        "(line 626,col 13)-(line 626,col 49)",
        "(line 627,col 13)-(line 627,col 56)",
        "(line 635,col 13)-(line 635,col 31)",
        "(line 636,col 13)-(line 640,col 13)",
        "(line 641,col 13)-(line 643,col 13)",
        "(line 644,col 13)-(line 650,col 13)",
        "(line 651,col 13)-(line 651,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CBRT_MACH_PREC"
      ],
      "begin_line": 656,
      "end_line": 656,
      "comment": " The cubic root of {@link #MACH_PREC}. "
    },
    {
      "type": "field",
      "varNames": [
        "MACH_PREC"
      ],
      "begin_line": 659,
      "end_line": 659,
      "comment": " The machine precision. "
    },
    {
      "type": "field",
      "varNames": [
        "OPERATOR"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "THRESHOLD"
      ],
      "begin_line": 665,
      "end_line": 665,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR"
      ],
      "begin_line": 668,
      "end_line": 668,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR1"
      ],
      "begin_line": 671,
      "end_line": 671,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR2"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": " Key for the exception context. "
    },
    {
      "type": "field",
      "varNames": [
        "check"
      ],
      "begin_line": 677,
      "end_line": 677,
      "comment": " {@code true} if symmetry of matrix and conditioner must be checked. "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 683,
      "end_line": 683,
      "comment": "\n     * The value of the custom tolerance \u0026delta; for the default stopping\n     * criterion.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQ(int, double, boolean)",
      "begin_line": 695,
      "end_line": 700,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e.\n     *\n     * @param maxIterations Maximum number of iterations.\n     * @param delta \u0026delta; parameter for the default stopping criterion.\n     * @param check {@code true} if self-adjointedness of both matrix and\n     * preconditioner should be checked. This entails an extra matrix-vector\n     * product in the initial phase.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 29)",
        "(line 698,col 9)-(line 698,col 27)",
        "(line 699,col 9)-(line 699,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SymmLQ.SymmLQ(org.apache.commons.math.util.IterationManager, double, boolean)",
      "begin_line": 712,
      "end_line": 717,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e and custom iteration manager.\n     *\n     * @param manager Custom iteration manager.\n     * @param delta \u0026delta; parameter for the default stopping criterion.\n     * @param check {@code true} if self-adjointedness of both matrix and\n     * preconditioner should be checked. This entails an extra matrix-vector\n     * product in the initial phase.\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 23)",
        "(line 715,col 9)-(line 715,col 27)",
        "(line 716,col 9)-(line 716,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.checkSymmetry(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 736,
      "end_line": 753,
      "comment": "\n     * Performs a symmetry check on the specified linear operator, and throws an\n     * exception in case this check fails. Given a linear operator L, and a\n     * vector x, this method checks that x\u0027 L y \u003d y\u0027 L x (within a given\n     * accuracy), where y \u003d L x.\n     *\n     * @param l The linear operator L.\n     * @param x The candidate vector x.\n     * @param y The candidate vector y \u003d L x.\n     * @param z The vector z \u003d L y.\n     * @throws NonSelfAdjointOperatorException when the test fails.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 41)",
        "(line 741,col 9)-(line 741,col 41)",
        "(line 742,col 9)-(line 742,col 61)",
        "(line 743,col 9)-(line 752,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.daxpbypz(double, org.apache.commons.math.linear.RealVector, double, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 766,
      "end_line": 775,
      "comment": "\n     * A BLAS-like function, for the operation z \u0026larr; a \u0026middot; x + b\n     * \u0026middot; y + z. This is for internal use only: no dimension checks are\n     * provided.\n     *\n     * @param a The scalar by which {@code x} is to be multiplied.\n     * @param x The first vector to be added to {@code z}.\n     * @param b The scalar by which {@code y} is to be multiplied.\n     * @param y The second vector to be added to {@code z}.\n     * @param z The vector to be incremented.\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 39)",
        "(line 770,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.daxpy(double, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 786,
      "end_line": 792,
      "comment": "\n     * A clone of the BLAS {@code DAXPY} function, which carries out the\n     * operation y \u0026larr; a \u0026middot; x + y. This is for internal use only: no\n     * dimension checks are provided.\n     *\n     * @param a The scalar by which {@code x} is to be multiplied.\n     * @param x The vector to be added to {@code y}.\n     * @param y The vector to be incremented.\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 39)",
        "(line 789,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.throwNPDLOException(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 802,
      "end_line": 811,
      "comment": "\n     * Throws a new {@link NonPositiveDefiniteOperatorException} with\n     * appropriate context.\n     *\n     * @param l The offending linear operator.\n     * @param v The offending vector.\n     * @throws NonPositiveDefiniteOperatorException in any circumstances.\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 53)",
        "(line 806,col 9)-(line 806,col 55)",
        "(line 807,col 9)-(line 807,col 56)",
        "(line 808,col 9)-(line 808,col 38)",
        "(line 809,col 9)-(line 809,col 36)",
        "(line 810,col 9)-(line 810,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.getCheck()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     * Returns {@code true} if symmetry of the matrix, and symmetry as well as\n     * positive definiteness of the preconditioner should be checked.\n     *\n     * @return {@code true} if the tests are to be performed.\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 845,
      "end_line": 856,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}\n     * have dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint.\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 34)",
        "(line 854,col 9)-(line 854,col 73)",
        "(line 855,col 9)-(line 855,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 898,
      "end_line": 909,
      "comment": "\n     * Returns an estimate of the solution to the linear system (A - shift\n     * \u0026middot; I) \u0026middot; x \u003d b.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}; this however requires an\n     * extra call to the preconditioner.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param goodb Usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}.\n     * @param shift The amount to be subtracted to all diagonal elements of A.\n     * @return A reference to {@code x} (shallow copy).\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m} or {@code b} have\n     * dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint.\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 34)",
        "(line 907,col 9)-(line 907,col 73)",
        "(line 908,col 9)-(line 908,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 935,
      "end_line": 945,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param x Not meaningful in this implementation. Should not be considered\n     * as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e).\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}\n     * have dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint.\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 34)",
        "(line 944,col 9)-(line 944,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector)",
      "begin_line": 965,
      "end_line": 974,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} has dimensions\n     * inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 34)",
        "(line 971,col 9)-(line 971,col 73)",
        "(line 972,col 9)-(line 972,col 18)",
        "(line 973,col 9)-(line 973,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 1010,
      "end_line": 1018,
      "comment": "\n     * Returns the solution to the system (A - shift \u0026middot; I) \u0026middot; x \u003d b.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @param goodb Usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}.\n     * @param shift The amount to be subtracted to all diagonal elements of A.\n     * @return a reference to {@code x}.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} has dimensions\n     * inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 34)",
        "(line 1016,col 9)-(line 1016,col 73)",
        "(line 1017,col 9)-(line 1017,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solve(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1040,
      "end_line": 1048,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b.\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @param x Not meaningful in this implementation. Should not be considered\n     * as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e).\n     * @return A new vector containing the solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} is not square.\n     * @throws DimensionMismatchException if {@code b} or {@code x} have\n     * dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} is not self-adjoint.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 34)",
        "(line 1047,col 9)-(line 1047,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1075,
      "end_line": 1084,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place.\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param x Vector to be updated with the solution. {@code x} should not be\n     * considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e).\n     * @return A reference to {@code x} (shallow copy) updated with the\n     * solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}\n     * have dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint.\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector, boolean, double)",
      "begin_line": 1128,
      "end_line": 1172,
      "comment": "\n     * Returns an estimate of the solution to the linear system (A - shift\n     * \u0026middot; I) \u0026middot; x \u003d b. The solution is computed in-place.\n     * \u003cp\u003e\n     * If the solution x is expected to contain a large multiple of {@code b}\n     * (as in Rayleigh-quotient iteration), then better precision may be\n     * achieved with {@code goodb} set to {@code true}; this however requires an\n     * extra call to the preconditioner.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * {@code shift} should be zero if the system A \u0026middot; x \u003d b is to be\n     * solved. Otherwise, it could be an approximation to an eigenvalue of A,\n     * such as the Rayleigh quotient b\u003csup\u003eT\u003c/sup\u003e \u0026middot; A \u0026middot; b /\n     * (b\u003csup\u003eT\u003c/sup\u003e \u0026middot; b) corresponding to the vector b. If b is\n     * sufficiently like an eigenvector corresponding to an eigenvalue near\n     * shift, then the computed x may have very large components. When\n     * normalized, x may be closer to an eigenvector than b.\n     * \u003c/p\u003e\n     *\n     * @param a Linear operator A of the system.\n     * @param m Preconditioner (can be {@code null}).\n     * @param b Right-hand side vector.\n     * @param x Vector to be updated with the solution. {@code x} should not be\n     * considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e).\n     * @param goodb Usually {@code false}, except if {@code x} is expected to\n     * contain a large multiple of {@code b}.\n     * @param shift The amount to be subtracted to all diagonal elements of A.\n     * @return A reference to {@code x} (shallow copy).\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}\n     * have dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint.\n     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive\n     * definite.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 36)",
        "(line 1138,col 9)-(line 1138,col 63)",
        "(line 1140,col 9)-(line 1140,col 38)",
        "(line 1141,col 9)-(line 1141,col 42)",
        "(line 1143,col 9)-(line 1143,col 64)",
        "(line 1144,col 9)-(line 1144,col 68)",
        "(line 1145,col 9)-(line 1149,col 9)",
        "(line 1151,col 9)-(line 1151,col 32)",
        "(line 1152,col 9)-(line 1152,col 69)",
        "(line 1153,col 9)-(line 1153,col 47)",
        "(line 1154,col 9)-(line 1161,col 9)",
        "(line 1162,col 9)-(line 1162,col 24)",
        "(line 1168,col 9)-(line 1168,col 25)",
        "(line 1169,col 9)-(line 1169,col 29)",
        "(line 1170,col 9)-(line 1170,col 44)",
        "(line 1171,col 9)-(line 1171,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1196,
      "end_line": 1203,
      "comment": "\n     * Returns an estimate of the solution to the linear system A \u0026middot; x \u003d\n     * b. The solution is computed in-place.\n     *\n     * @param a Linear operator A of the system.\n     * @param b Right-hand side vector.\n     * @param x Vector to be updated with the solution. {@code x} should not be\n     * considered as an initial guess (\u003ca href\u003d\"#initguess\"\u003emore\u003c/a\u003e).\n     * @return A reference to {@code x} (shallow copy) updated with the\n     * solution.\n     * @throws NullArgumentException if one of the parameters is {@code null}.\n     * @throws NonSquareOperatorException if {@code a} or {@code m} is not\n     * square.\n     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}\n     * have dimensions inconsistent with {@code a}.\n     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is\n     * {@code true}, and {@code a} or {@code m} is not self-adjoint.\n     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned.\n     * @throws MaxCountExceededException at exhaustion of the iteration count,\n     * unless a custom {@link org.apache.commons.math.util.Incrementor.MaxCountExceededCallback callback} has been set at\n     * construction.\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1202,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.createEvent(org.apache.commons.math.linear.SymmLQ.State)",
      "begin_line": 1213,
      "end_line": 1235,
      "comment": "\n     * Creates the event to be fired during the solution process. Unmodifiable\n     * views of the RHS vector, and the current estimate of the solution are\n     * returned by the created event.\n     *\n     * @param state Reference to the current state of this algorithm.\n     * @return The newly created event.\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 73)",
        "(line 1216,col 9)-(line 1216,col 47)",
        "(line 1217,col 9)-(line 1233,col 10)",
        "(line 1234,col 9)-(line 1234,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1219,
      "end_line": 1219,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.Anonymous-a647fae9-3e69-48cb-a058-4592ea68f580.getRightHandSideVector()",
      "begin_line": 1221,
      "end_line": 1224,
      "comment": "",
      "child_ranges": [
        "(line 1223,col 17)-(line 1223,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SymmLQ.Anonymous-d53c8318-d0b3-48a3-9ac7-6ec943d99d20.getSolution()",
      "begin_line": 1226,
      "end_line": 1232,
      "comment": "",
      "child_ranges": [
        "(line 1228,col 17)-(line 1228,col 53)",
        "(line 1229,col 17)-(line 1229,col 60)",
        "(line 1230,col 17)-(line 1230,col 32)",
        "(line 1231,col 17)-(line 1231,col 25)"
      ]
    }
  ]
}
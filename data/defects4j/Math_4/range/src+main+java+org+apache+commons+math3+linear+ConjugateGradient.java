{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/ConjugateGradient.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConjugateGradient",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver"
      ],
      "begin_line": 79,
      "end_line": 236,
      "comment": "\n * \u003cp\u003e\n * This is an implementation of the conjugate gradient method for\n * {@link RealLinearOperator}. It follows closely the template by \u003ca\n * href\u003d\"#BARR1994\"\u003eBarrett et al. (1994)\u003c/a\u003e (figure 2.5). The linear system at\n * hand is A \u0026middot; x \u003d b, and the residual is r \u003d b - A \u0026middot; x.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"stopcrit\"\u003eDefault stopping criterion\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * A default stopping criterion is implemented. The iterations stop when || r ||\n * \u0026le; \u0026delta; || b ||, where b is the right-hand side vector, r the current\n * estimate of the residual, and \u0026delta; a user-specified tolerance. It should\n * be noted that r is the so-called \u003cem\u003eupdated\u003c/em\u003e residual, which might\n * differ from the true residual due to rounding-off errors (see e.g. \u003ca\n * href\u003d\"#STRA2002\"\u003eStrakos and Tichy, 2002\u003c/a\u003e).\n * \u003c/p\u003e\n * \u003ch3\u003eIteration count\u003c/h3\u003e\n * \u003cp\u003e\n * In the present context, an iteration should be understood as one evaluation\n * of the matrix-vector product A \u0026middot; x. The initialization phase therefore\n * counts as one iteration.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"context\"\u003eException context\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * Besides standard {@link DimensionMismatchException}, this class might throw\n * {@link NonPositiveDefiniteOperatorException} if the linear operator or\n * the preconditioner are not positive definite. In this case, the\n * {@link ExceptionContext} provides some more information\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"} points to the offending linear operator, say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector\"} points to the offending vector, say x, such that\n * x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; x \u003c 0.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003ch3\u003eReferences\u003c/h3\u003e\n * \u003cdl\u003e\n * \u003cdt\u003e\u003ca id\u003d\"BARR1994\"\u003eBarret et al. (1994)\u003c/a\u003e\u003c/dt\u003e\n * \u003cdd\u003eR. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,\n * V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,\n * \u003ca href\u003d\"http://www.netlib.org/linalg/html_templates/Templates.html\"\u003e\u003cem\u003e\n * Templates for the Solution of Linear Systems: Building Blocks for Iterative\n * Methods\u003c/em\u003e\u003c/a\u003e, SIAM\u003c/dd\u003e\n * \u003cdt\u003e\u003ca id\u003d\"STRA2002\"\u003eStrakos and Tichy (2002)\n * \u003cdt\u003e\n * \u003cdd\u003eZ. Strakos and P. Tichy, \u003ca\n * href\u003d\"http://etna.mcs.kent.edu/vol.13.2002/pp56-80.dir/pp56-80.pdf\"\u003e\n * \u003cem\u003eOn error estimation in the conjugate gradient method and why it works\n * in finite precision computations\u003c/em\u003e\u003c/a\u003e, Electronic Transactions on\n * Numerical Analysis 13: 56-80, 2002\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "OPERATOR"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Key for the \u003ca href\u003d\"#context\"\u003eexception context\u003c/a\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Key for the \u003ca href\u003d\"#context\"\u003eexception context\u003c/a\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "check"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * {@code true} if positive-definiteness of matrix and preconditioner should\n     * be checked.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The value of \u0026delta;, for the default stopping criterion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ConjugateGradient.ConjugateGradient(int, double, boolean)",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e.\n     *\n     * @param maxIterations the maximum number of iterations\n     * @param delta the \u0026delta; parameter for the default stopping criterion\n     * @param check {@code true} if positive definiteness of both matrix and\n     * preconditioner should be checked\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)",
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 110,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.ConjugateGradient.ConjugateGradient(org.apache.commons.math3.util.IterationManager, double, boolean)",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e and custom iteration manager.\n     *\n     * @param manager the custom iteration manager\n     * @param delta the \u0026delta; parameter for the default stopping criterion\n     * @param check {@code true} if positive definiteness of both matrix and\n     * preconditioner should be checked\n     * @throws NullArgumentException if {@code manager} is {@code null}\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 23)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 128,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradient.getCheck()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Returns {@code true} if positive-definiteness should be checked for both\n     * matrix and preconditioner.\n     *\n     * @return {@code true} if the tests are to be performed\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.ConjugateGradient.solveInPlace(org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealLinearOperator, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 147,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NonPositiveDefiniteOperatorException if {@code a} or {@code m} is\n     * not positive definite\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 37)",
        "(line 156,col 9)-(line 156,col 63)",
        "(line 158,col 9)-(line 158,col 38)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 160,col 9)-(line 160,col 68)",
        "(line 163,col 9)-(line 163,col 42)",
        "(line 167,col 9)-(line 167,col 32)",
        "(line 168,col 9)-(line 168,col 68)",
        "(line 169,col 9)-(line 169,col 38)",
        "(line 170,col 9)-(line 170,col 36)",
        "(line 172,col 9)-(line 172,col 49)",
        "(line 173,col 9)-(line 173,col 68)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 175,col 9)-(line 175,col 21)",
        "(line 176,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 39)",
        "(line 182,col 9)-(line 183,col 59)",
        "(line 184,col 9)-(line 184,col 45)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 28)",
        "(line 190,col 9)-(line 234,col 9)"
      ]
    }
  ]
}
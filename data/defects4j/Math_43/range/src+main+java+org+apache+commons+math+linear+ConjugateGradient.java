{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/linear/ConjugateGradient.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConjugateGradient",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.PreconditionedIterativeLinearSolver"
      ],
      "begin_line": 79,
      "end_line": 261,
      "comment": "\n * \u003cp\u003e\n * This is an implementation of the conjugate gradient method for\n * {@link RealLinearOperator}. It follows closely the template by \u003ca\n * href\u003d\"#BARR1994\"\u003eBarrett et al. (1994)\u003c/a\u003e (figure 2.5). The linear system at\n * hand is A \u0026middot; x \u003d b, and the residual is r \u003d b - A \u0026middot; x.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"stopcrit\"\u003eDefault stopping criterion\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * A default stopping criterion is implemented. The iterations stop when || r ||\n * \u0026le; \u0026delta; || b ||, where b is the right-hand side vector, r the current\n * estimate of the residual, and \u0026delta; a user-specified tolerance. It should\n * be noted that r is the so-called \u003cem\u003eupdated\u003c/em\u003e residual, which might\n * differ from the true residual due to rounding-off errors (see e.g. \u003ca\n * href\u003d\"#STRA2002\"\u003eStrakos and Tichy, 2002\u003c/a\u003e).\n * \u003c/p\u003e\n * \u003ch3\u003eIteration count\u003c/h3\u003e\n * \u003cp\u003e\n * In the present context, an iteration should be understood as one evaluation\n * of the matrix-vector product A \u0026middot; x. The initialization phase therefore\n * counts as one iteration.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"context\"\u003eException context\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * Besides standard {@link DimensionMismatchException}, this class might throw\n * {@link NonPositiveDefiniteOperatorException} if the linear operator or\n * the preconditioner are not positive definite. In this case, the\n * {@link ExceptionContext} provides some more information\n * \u003cul\u003e\n * \u003cli\u003ekey {@code \"operator\"} points to the offending linear operator, say L,\u003c/li\u003e\n * \u003cli\u003ekey {@code \"vector\"} points to the offending vector, say x, such that\n * x\u003csup\u003eT\u003c/sup\u003e \u0026middot; L \u0026middot; x \u003c 0.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003ch3\u003eReferences\u003c/h3\u003e\n * \u003cdl\u003e\n * \u003cdt\u003e\u003ca id\u003d\"BARR1994\"\u003eBarret et al. (1994)\u003c/a\u003e\u003c/dt\u003e\n * \u003cdd\u003eR. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,\n * V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,\n * \u003ca href\u003d\"http://www.netlib.org/linalg/html_templates/Templates.html\"\u003e\u003cem\u003e\n * Templates for the Solution of Linear Systems: Building Blocks for Iterative\n * Methods\u003c/em\u003e\u003c/a\u003e, SIAM\u003c/dd\u003e\n * \u003cdt\u003e\u003ca id\u003d\"STRA2002\"\u003eStrakos and Tichy (2002)\n * \u003cdt\u003e\n * \u003cdd\u003eZ. Strakos and P. Tichy, \u003ca\n * href\u003d\"http://etna.mcs.kent.edu/vol.13.2002/pp56-80.dir/pp56-80.pdf\"\u003e\n * \u003cem\u003eOn error estimation in the conjugate gradient method and why it works\n * in finite precision computations\u003c/em\u003e\u003c/a\u003e, Electronic Transactions on\n * Numerical Analysis 13: 56-80, 2002\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "class_interface",
      "name": "ConjugateGradientEvent",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.IterativeLinearSolverEvent",
        "org.apache.commons.math.linear.ProvidesResidual"
      ],
      "begin_line": 89,
      "end_line": 105,
      "comment": "\n     * The type of all events fired by this implementation of the Conjugate\n     * Gradient method.\n     *\n     * @version $Id: ConjugateGradient.java 1175404 2011-09-25 14:48:18Z\n     * celestin $\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.ConjugateGradientEvent.ConjugateGradientEvent(java.lang.Object)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n         * Creates a new instance of this class.\n         *\n         * @param source The iterative algorithm on which the event initially\n         * occurred.\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OPERATOR"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Key for the \u003ca href\u003d\"#context\"\u003eexception context\u003c/a\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Key for the \u003ca href\u003d\"#context\"\u003eexception context\u003c/a\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "check"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * {@code true} if positive-definiteness of matrix and preconditioner should\n     * be checked.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delta"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The value of \u0026delta;, for the default stopping criterion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.ConjugateGradient(int, double, boolean)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e.\n     *\n     * @param maxIterations Maximum number of iterations.\n     * @param delta \u0026delta; parameter for the default stopping criterion.\n     * @param check {@code true} if positive definiteness of both matrix and\n     * preconditioner should be checked.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.ConjugateGradient(org.apache.commons.math.util.IterationManager, double, boolean)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\n     * Creates a new instance of this class, with \u003ca href\u003d\"#stopcrit\"\u003edefault\n     * stopping criterion\u003c/a\u003e and custom iteration manager.\n     *\n     * @param manager Custom iteration manager.\n     * @param delta \u0026delta; parameter for the default stopping criterion.\n     * @param check {@code true} if positive definiteness of both matrix and\n     * preconditioner should be checked.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 150,col 27)",
        "(line 151,col 9)-(line 151,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.getCheck()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns {@code true} if positive-definiteness should be checked for both\n     * matrix and preconditioner.\n     *\n     * @return {@code true} if the tests are to be performed.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.solveInPlace(org.apache.commons.math.linear.RealLinearOperator, org.apache.commons.math.linear.InvertibleRealLinearOperator, org.apache.commons.math.linear.RealVector, org.apache.commons.math.linear.RealVector)",
      "begin_line": 165,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 37)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 174,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 175,col 61)",
        "(line 178,col 9)-(line 178,col 42)",
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 184,col 9)-(line 184,col 36)",
        "(line 186,col 9)-(line 186,col 49)",
        "(line 187,col 9)-(line 187,col 36)",
        "(line 188,col 9)-(line 188,col 21)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 212,col 10)",
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 28)",
        "(line 219,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.Anonymous-973db4e2-2b6c-4105-a007-210de0bb8b1f.getResidual()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 17)-(line 200,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.Anonymous-dd2f2573-bd18-4111-a34f-693cf890f0b1.getRightHandSideVector()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 17)-(line 205,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ConjugateGradient.Anonymous-6d60bec2-2173-48f2-aab3-b3ecbba693f4.getSolution()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 17)-(line 210,col 65)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/analysis/solvers/BaseAbstractUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateRealSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver\u003cFUNC\u003e"
      ],
      "begin_line": 35,
      "end_line": 294,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_ACCURACY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FUNCTION_VALUE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double, double)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double, double, double)",
      "begin_line": 89,
      "end_line": 95,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 94,col 9)-(line 94,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMaxEvaluations()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getEvaluations()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMin()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMax()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getStartValue()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getAbsoluteAccuracy()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getRelativeAccuracy()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getFunctionValueAccuracy()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.setup(int, FUNC, double, double, double)",
      "begin_line": 166,
      "end_line": 180,
      "comment": "\n     * Prepare for computation.\n     * Subclasses must call this method if they override any of the\n     * {@code solve} methods.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param maxEval Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 34)",
        "(line 174,col 9)-(line 174,col 24)",
        "(line 175,col 9)-(line 175,col 24)",
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 177,col 21)",
        "(line 178,col 9)-(line 178,col 45)",
        "(line 179,col 9)-(line 179,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(int, FUNC, double, double, double)",
      "begin_line": 183,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 48)",
        "(line 188,col 9)-(line 188,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(int, FUNC, double, double)",
      "begin_line": 192,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(int, FUNC, double)",
      "begin_line": 197,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.doSolve()",
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the root.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.isBracketing(double, double)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * Check whether the function takes opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @return {@code true} if the function values have opposite signs at the\n     * given points.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.isSequence(double, double, double)",
      "begin_line": 232,
      "end_line": 236,
      "comment": "\n     * Check whether the arguments form a (strictly) increasing sequence.\n     *\n     * @param start First number.\n     * @param mid Second number.\n     * @param end Third number.\n     * @return {@code true} if the arguments form an increasing sequence.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifyInterval(double, double)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * Check that the endpoints specify an interval.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifySequence(double, double, double)",
      "begin_line": 260,
      "end_line": 264,
      "comment": "\n     * Check that {@code lower \u003c initial \u003c upper}.\n     *\n     * @param lower Lower endpoint.\n     * @param initial Initial value.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if {@code lower \u003e\u003d initial} or {@code initial \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifyBracketing(double, double)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Check that the endpoints specify an interval and the function takes\n     * opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NoBracketingException if\n     * the function has the same sign at the endpoints.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount()",
      "begin_line": 287,
      "end_line": 293,
      "comment": "\n     * Increment the evaluation count by one.\n     * Method {@link #computeObjectiveValue(double)} calls this method internally.\n     * It is provided for subclasses that do not exclusively use\n     * {@code computeObjectiveValue} to solve the function.\n     * See e.g. {@link AbstractDifferentiableUnivariateRealSolver}.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 292,col 9)"
      ]
    }
  ]
}
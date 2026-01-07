{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/analysis/solvers/BaseAbstractUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateRealSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver\u003cFUNC\u003e"
      ],
      "begin_line": 35,
      "end_line": 296,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @version $Revision: 1030464 $ $Date: 2010-11-03 14:46:04 +0100 (Wed, 03 Nov 2010) $\n * @since 2.0\n "
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
      "end_line": 182,
      "comment": "\n     * Prepare for computation.\n     * Subclasses must call this method if they override any of the\n     * {@code solve} methods.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param maxEval Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 176,col 9)-(line 176,col 24)",
        "(line 177,col 9)-(line 177,col 24)",
        "(line 178,col 9)-(line 178,col 33)",
        "(line 179,col 9)-(line 179,col 21)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 181,col 9)-(line 181,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(int, FUNC, double, double, double)",
      "begin_line": 185,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 48)",
        "(line 190,col 9)-(line 190,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(int, FUNC, double, double)",
      "begin_line": 194,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(int, FUNC, double)",
      "begin_line": 199,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.doSolve()",
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the root.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.isBracketing(double, double)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Check whether the function takes opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @return {@code true} if the function values have opposite signs at the\n     * given points.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.isSequence(double, double, double)",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * Check whether the arguments form a (strictly) increasing sequence.\n     *\n     * @param start First number.\n     * @param mid Second number.\n     * @param end Third number.\n     * @return {@code true} if the arguments form an increasing sequence.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifyInterval(double, double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * Check that the endpoints specify an interval.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifySequence(double, double, double)",
      "begin_line": 262,
      "end_line": 266,
      "comment": "\n     * Check that {@code lower \u003c initial \u003c upper}.\n     *\n     * @param lower Lower endpoint.\n     * @param initial Initial value.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if {@code lower \u003e\u003d initial} or {@code initial \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifyBracketing(double, double)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Check that the endpoints specify an interval and the function takes\n     * opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NoBracketingException if\n     * the function has the same sign at the endpoints.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount()",
      "begin_line": 289,
      "end_line": 295,
      "comment": "\n     * Increment the evaluation count by one.\n     * Method {@link #computeObjectiveValue(double)} calls this method internally.\n     * It is provided for subclasses that do not exclusively use\n     * {@code computeObjectiveValue} to solve the function.\n     * See e.g. {@link AbstractDifferentiableUnivariateRealSolver}.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 294,col 9)"
      ]
    }
  ]
}
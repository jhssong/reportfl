{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/analysis/solvers/BaseAbstractUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateRealSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver\u003cFUNC\u003e"
      ],
      "begin_line": 36,
      "end_line": 299,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FUNCTION_VALUE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double, double)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double, double, double)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 49)",
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 95,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMaxEvaluations()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getEvaluations()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMin()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMax()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getStartValue()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getAbsoluteAccuracy()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getRelativeAccuracy()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getFunctionValueAccuracy()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(double)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 35)",
        "(line 154,col 9)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.setup(int, FUNC, double, double, double)",
      "begin_line": 168,
      "end_line": 182,
      "comment": "\n     * Prepare for computation.\n     * Subclasses must call this method if they override any of the\n     * {@code solve} methods.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param maxEval Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 34)",
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
      "begin_line": 213,
      "end_line": 214,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the root.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws NoBracketingException if the initial search interval does not bracket\n     * a root and the solver requires it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.isBracketing(double, double)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * Check whether the function takes opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @return {@code true} if the function values have opposite signs at the\n     * given points.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.isSequence(double, double, double)",
      "begin_line": 237,
      "end_line": 241,
      "comment": "\n     * Check whether the arguments form a (strictly) increasing sequence.\n     *\n     * @param start First number.\n     * @param mid Second number.\n     * @param end Third number.\n     * @return {@code true} if the arguments form an increasing sequence.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifyInterval(double, double)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * Check that the endpoints specify an interval.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifySequence(double, double, double)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "\n     * Check that {@code lower \u003c initial \u003c upper}.\n     *\n     * @param lower Lower endpoint.\n     * @param initial Initial value.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if {@code lower \u003e\u003d initial} or {@code initial \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.verifyBracketing(double, double)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Check that the endpoints specify an interval and the function takes\n     * opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws org.apache.commons.math.exception.NoBracketingException if\n     * the function has the same sign at the endpoints.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.incrementEvaluationCount()",
      "begin_line": 292,
      "end_line": 298,
      "comment": "\n     * Increment the evaluation count by one.\n     * Method {@link #computeObjectiveValue(double)} calls this method internally.\n     * It is provided for subclasses that do not exclusively use\n     * {@code computeObjectiveValue} to solve the function.\n     * See e.g. {@link AbstractDifferentiableUnivariateRealSolver}.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 297,col 9)"
      ]
    }
  ]
}
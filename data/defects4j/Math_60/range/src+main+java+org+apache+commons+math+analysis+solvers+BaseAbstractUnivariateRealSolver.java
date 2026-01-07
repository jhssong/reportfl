{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/solvers/BaseAbstractUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateRealSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver\u003cFUNC\u003e"
      ],
      "begin_line": 35,
      "end_line": 299,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @version $Revision: 1030464 $ $Date: 2010-11-03 14:46:04 +0100 (Wed, 03 Nov 2010) $\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default absolute accuracy "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FUNCTION_VALUE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double, double)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.BaseAbstractUnivariateRealSolver(double, double, double)",
      "begin_line": 91,
      "end_line": 97,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 95,col 49)",
        "(line 96,col 9)-(line 96,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.setMaxEvaluations(int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMaxEvaluations()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getEvaluations()",
      "begin_line": 108,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMin()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getMax()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getStartValue()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getAbsoluteAccuracy()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getRelativeAccuracy()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.getFunctionValueAccuracy()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.computeObjectiveValue(double)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 35)",
        "(line 158,col 9)-(line 158,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.setup(FUNC, double, double, double)",
      "begin_line": 171,
      "end_line": 185,
      "comment": "\n     * Prepare for computation.\n     * Subclasses must call this method if they override any of the\n     * {@code solve} methods.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 24)",
        "(line 181,col 9)-(line 181,col 24)",
        "(line 182,col 9)-(line 182,col 33)",
        "(line 183,col 9)-(line 183,col 21)",
        "(line 184,col 9)-(line 184,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(FUNC, double, double, double)",
      "begin_line": 188,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 39)",
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(FUNC, double, double)",
      "begin_line": 197,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.solve(FUNC, double)",
      "begin_line": 202,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver.doSolve()",
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the root.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
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
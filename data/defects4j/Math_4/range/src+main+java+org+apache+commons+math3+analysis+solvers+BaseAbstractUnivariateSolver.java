{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/BaseAbstractUnivariateSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver\u003cFUNC\u003e"
      ],
      "begin_line": 38,
      "end_line": 315,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * solvers.\n *\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RELATIVE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FUNCTION_VALUE_ACCURACY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Function to solve. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.BaseAbstractUnivariateSolver(double)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Construct a solver with given absolute accuracy.\n     *\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.BaseAbstractUnivariateSolver(double, double)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.BaseAbstractUnivariateSolver(double, double, double)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * Construct a solver with given accuracies.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 49)",
        "(line 96,col 9)-(line 96,col 49)",
        "(line 97,col 9)-(line 97,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getMaxEvaluations()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getEvaluations()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getMin()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getMax()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getStartValue()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getAbsoluteAccuracy()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getRelativeAccuracy()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.getFunctionValueAccuracy()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.computeObjectiveValue(double)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.setup(int, FUNC, double, double, double)",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n     * Prepare for computation.\n     * Subclasses must call this method if they override any of the\n     * {@code solve} methods.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param maxEval Maximum number of evaluations.\n     * @exception NullArgumentException if f is null\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 34)",
        "(line 180,col 9)-(line 180,col 24)",
        "(line 181,col 9)-(line 181,col 24)",
        "(line 182,col 9)-(line 182,col 33)",
        "(line 183,col 9)-(line 183,col 21)",
        "(line 184,col 9)-(line 184,col 45)",
        "(line 185,col 9)-(line 185,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.solve(int, FUNC, double, double, double)",
      "begin_line": 189,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 48)",
        "(line 196,col 9)-(line 196,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.solve(int, FUNC, double, double)",
      "begin_line": 200,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.solve(int, FUNC, double)",
      "begin_line": 205,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.doSolve()",
      "begin_line": 221,
      "end_line": 222,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the root.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws NoBracketingException if the initial search interval does not bracket\n     * a root and the solver requires it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.isBracketing(double, double)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Check whether the function takes opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @return {@code true} if the function values have opposite signs at the\n     * given points.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.isSequence(double, double, double)",
      "begin_line": 245,
      "end_line": 249,
      "comment": "\n     * Check whether the arguments form a (strictly) increasing sequence.\n     *\n     * @param start First number.\n     * @param mid Second number.\n     * @param end Third number.\n     * @return {@code true} if the arguments form an increasing sequence.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.verifyInterval(double, double)",
      "begin_line": 258,
      "end_line": 262,
      "comment": "\n     * Check that the endpoints specify an interval.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.verifySequence(double, double, double)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "\n     * Check that {@code lower \u003c initial \u003c upper}.\n     *\n     * @param lower Lower endpoint.\n     * @param initial Initial value.\n     * @param upper Upper endpoint.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d initial} or\n     * {@code initial \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.verifyBracketing(double, double)",
      "begin_line": 290,
      "end_line": 295,
      "comment": "\n     * Check that the endpoints specify an interval and the function takes\n     * opposite signs at the endpoints.\n     *\n     * @param lower Lower endpoint.\n     * @param upper Upper endpoint.\n     * @throws NullArgumentException if the function has not been set.\n     * @throws NoBracketingException if the function has the same sign at\n     * the endpoints.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver.incrementEvaluationCount()",
      "begin_line": 307,
      "end_line": 314,
      "comment": "\n     * Increment the evaluation count by one.\n     * Method {@link #computeObjectiveValue(double)} calls this method internally.\n     * It is provided for subclasses that do not exclusively use\n     * {@code computeObjectiveValue} to solve the function.\n     * See e.g. {@link AbstractUnivariateDifferentiableSolver}.\n     *\n     * @throws TooManyEvaluationsException when the allowed number of function\n     * evaluations has been exhausted.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 313,col 9)"
      ]
    }
  ]
}
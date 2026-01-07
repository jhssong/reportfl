{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/univariate/BaseAbstractUnivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.univariate.UnivariateOptimizer"
      ],
      "begin_line": 36,
      "end_line": 163,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Optimization type "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Initial guess . "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Function to optimize. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.BaseAbstractUnivariateOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.univariate.UnivariatePointValuePair\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * @param checker Convergence checking procedure.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getMaxEvaluations()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getEvaluations()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getGoalType()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getMin()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getMax()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getStartValue()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.computeObjectiveValue(double)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.optimize(int, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.optimization.GoalType, double, double, double)",
      "begin_line": 114,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 127,col 9)-(line 127,col 24)",
        "(line 128,col 9)-(line 128,col 24)",
        "(line 129,col 9)-(line 129,col 33)",
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 131,col 21)",
        "(line 132,col 9)-(line 132,col 45)",
        "(line 133,col 9)-(line 133,col 33)",
        "(line 136,col 9)-(line 136,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.optimize(int, org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.optimization.GoalType, double, double)",
      "begin_line": 140,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.getConvergenceChecker()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer.doOptimize()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the optimum and its corresponding function value.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": []
    }
  ]
}
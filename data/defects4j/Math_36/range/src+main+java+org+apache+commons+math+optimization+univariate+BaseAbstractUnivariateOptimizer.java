{
  "filepath": "/tmp/Math-36b/src/main/java/org/apache/commons/math/optimization/univariate/BaseAbstractUnivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractUnivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer"
      ],
      "begin_line": 35,
      "end_line": 161,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Optimization type "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Initial guess . "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Function to optimize. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.BaseAbstractUnivariateOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariatePointValuePair\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * @param checker Convergence checking procedure.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getMaxEvaluations()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getEvaluations()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getGoalType()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getMin()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getMax()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getStartValue()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.computeObjectiveValue(double)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.optimize(int, org.apache.commons.math.analysis.UnivariateFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 112,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 24)",
        "(line 126,col 9)-(line 126,col 24)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 24)",
        "(line 129,col 9)-(line 129,col 21)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 134,col 9)-(line 134,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.optimize(int, org.apache.commons.math.analysis.UnivariateFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 138,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.getConvergenceChecker()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer.doOptimize()",
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the optimum and its corresponding function value.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": []
    }
  ]
}
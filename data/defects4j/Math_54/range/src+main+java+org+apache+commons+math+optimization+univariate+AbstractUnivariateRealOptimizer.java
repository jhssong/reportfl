{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer"
      ],
      "begin_line": 35,
      "end_line": 165,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 53,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getGoalType()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMin()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMax()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getStartValue()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(double)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * objective function throws one.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(int, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 107,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 120,col 24)",
        "(line 121,col 9)-(line 121,col 24)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 24)",
        "(line 124,col 9)-(line 124,col 21)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 129,col 9)-(line 129,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(int, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 133,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.doOptimize()",
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the optimum and its corresponding function value.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * function to optimize throws one during search.\n     ",
      "child_ranges": []
    }
  ]
}
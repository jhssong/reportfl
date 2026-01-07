{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer"
      ],
      "begin_line": 36,
      "end_line": 167,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Optimization type "
    },
    {
      "type": "field",
      "varNames": [
        "searchMin"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchMax"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "searchStart"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Initial guess . "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Function to optimize. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 59,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 64,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getGoalType()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMin()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return the lower end of the search interval.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMax()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @return the higher end of the search interval.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getStartValue()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(double)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws MathUserException if objective function throws one\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 112,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 24)",
        "(line 126,col 9)-(line 126,col 24)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 24)",
        "(line 129,col 9)-(line 129,col 21)",
        "(line 130,col 9)-(line 130,col 33)",
        "(line 133,col 9)-(line 133,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 137,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.doOptimize()",
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the optimum and its corresponding function value.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * is exceeded.\n     * @throws MathUserException if the function to optimize throws one during search.\n     ",
      "child_ranges": []
    }
  ]
}
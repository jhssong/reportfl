{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 37,
      "end_line": 265,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Optimization type "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Lower end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Higher end of search interval. "
    },
    {
      "type": "field",
      "varNames": [
        "startValue"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Initial guess . "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Function to optimize. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer(int, double)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * FunctionEvaluationExceptionFunctionEvaluationException\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated in 2.2. Please use the \"setter\" methods to assign meaningful\n     * values to the maximum numbers of iterations and evaluations, and to the\n     * absolute and relative accuracy thresholds.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 69)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Default constructor.\n     * To be removed once the single non-default one has been removed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.checkResultComputed()",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Check whether a result has been computed.\n     * @throws NoDataException if no result has been computed\n     * @deprecated in 2.2 (no alternative).\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getResult()",
      "begin_line": 96,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 104,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, double, int)",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     * @deprecated in 2.2 (no alternative).\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 32)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 45)",
        "(line 129,col 9)-(line 129,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.clearResult()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Convenience function for implementations.\n     * @deprecated in 2.2 (no alternative).\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getGoalType()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMin()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * @return the lower of the search interval.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMax()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * @return the higher of the search interval.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getStartValue()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 190,
      "end_line": 198,
      "comment": "\n     * Compute the objective function value.\n     * @param f objective function\n     * @param point point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or the maximal number of iterations is exceeded\n     * @deprecated in 2.2. Use this {@link #computeObjectiveValue(double)\n     * replacement} instead.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(double)",
      "begin_line": 208,
      "end_line": 216,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or the maximal number of iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 219,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 23)",
        "(line 224,col 9)-(line 224,col 23)",
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 227,col 33)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 24)",
        "(line 232,col 9)-(line 232,col 33)",
        "(line 235,col 9)-(line 235,col 30)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setFunctionValue(double)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Set the value at the optimum.\n     *\n     * @param functionValue Value of the objective function at the optimum.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 251,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.doOptimize()",
      "begin_line": 263,
      "end_line": 264,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the optimum.\n     ",
      "child_ranges": []
    }
  ]
}
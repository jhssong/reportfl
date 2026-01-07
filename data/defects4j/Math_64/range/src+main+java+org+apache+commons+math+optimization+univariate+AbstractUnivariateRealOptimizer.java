{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 36,
      "end_line": 268,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Indicates where a root has been computed. "
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizationGoal"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Optimization type "
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
      "comment": " Initial guess . "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Function to optimize. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer(int, double)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * FunctionEvaluationExceptionFunctionEvaluationException\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated in 2.2. Please use the \"setter\" methods to assign meaningful\n     * values to the maximum numbers of iterations and evaluations, and to the\n     * absolute and relative accuracy thresholds.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 69)",
        "(line 73,col 9)-(line 73,col 31)",
        "(line 74,col 9)-(line 74,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer()",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Default constructor.\n     * To be removed once the single non-default one has been removed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.checkResultComputed()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Check whether a result has been computed.\n     * @throws NoDataException if no result has been computed\n     * @deprecated in 2.2 (no alternative).\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getResult()",
      "begin_line": 95,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 103,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, double, int)",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     * @deprecated in 2.2 (no alternative).\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 45)",
        "(line 128,col 9)-(line 128,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.clearResult()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Convenience function for implementations.\n     * @deprecated in 2.2 (no alternative).\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 140,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getGoalType()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMin()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * @return the lower of the search interval.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMax()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * @return the higher of the search interval.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getStartValue()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 189,
      "end_line": 197,
      "comment": "\n     * Compute the objective function value.\n     * @param f objective function\n     * @param point point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or the maximal number of iterations is exceeded\n     * @deprecated in 2.2. Use this {@link #computeObjectiveValue(double)\n     * replacement} instead.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(double)",
      "begin_line": 207,
      "end_line": 215,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at specified point.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or the maximal number of iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 218,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 223,col 29)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 226,col 26)",
        "(line 229,col 9)-(line 229,col 35)",
        "(line 230,col 9)-(line 230,col 24)",
        "(line 231,col 9)-(line 231,col 33)",
        "(line 234,col 9)-(line 234,col 30)",
        "(line 235,col 9)-(line 235,col 30)",
        "(line 237,col 9)-(line 237,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setFunctionValue(double)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Set the value at the optimum.\n     *\n     * @param functionValue Value of the objective function at the optimum.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 250,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.doOptimize()",
      "begin_line": 266,
      "end_line": 267,
      "comment": "\n     * Method for implementing actual optimization algorithms in derived\n     * classes.\n     *\n     * @return the optimum.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function.\n     ",
      "child_ranges": []
    }
  ]
}
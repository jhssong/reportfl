{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 34,
      "end_line": 155,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * optimizers.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "resultComputed"
      ],
      "begin_line": 38,
      "end_line": 38,
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer(int, double)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * FunctionEvaluationExceptionFunctionEvaluationException\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 69)",
        "(line 63,col 9)-(line 63,col 31)",
        "(line 64,col 9)-(line 64,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.checkResultComputed()",
      "begin_line": 70,
      "end_line": 74,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getResult()",
      "begin_line": 77,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 83,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, int)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param result the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)",
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, double, int)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Convenience function for implementations.\n     * \n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 45)",
        "(line 112,col 9)-(line 112,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.clearResult()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 123,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 128,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 145,
      "end_line": 153,
      "comment": " \n     * Compute the objective function value.\n     * @param f objective function\n     * @param point point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or the maximal number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 30)"
      ]
    }
  ]
}
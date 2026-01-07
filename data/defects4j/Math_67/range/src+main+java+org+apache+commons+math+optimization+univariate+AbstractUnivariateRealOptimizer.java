{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/optimization/univariate/AbstractUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithmImpl",
        "org.apache.commons.math.optimization.UnivariateRealOptimizer"
      ],
      "begin_line": 35,
      "end_line": 144,
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
      "begin_line": 42,
      "end_line": 42,
      "comment": " The last computed root. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValue"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Value of the function at the last computed result. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.AbstractUnivariateRealOptimizer(int, double)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * Construct a solver with given iteration count and accuracy.\n     * FunctionEvaluationExceptionFunctionEvaluationException\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 69)",
        "(line 64,col 9)-(line 64,col 31)",
        "(line 65,col 9)-(line 65,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.checkResultComputed()",
      "begin_line": 71,
      "end_line": 75,
      "comment": " Check if a result has been computed.\n     * @exception IllegalStateException if no result has been computed\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getResult()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 30)",
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 86,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setResult(double, double, int)",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n     * Convenience function for implementations.\n     *\n     * @param x the result to set\n     * @param fx the result to set\n     * @param iterationCount the iteration count to set\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 32)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 45)",
        "(line 101,col 9)-(line 101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.clearResult()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Convenience function for implementations.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer.computeObjectiveValue(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n     * Compute the objective function value.\n     * @param f objective function\n     * @param point point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or the maximal number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 30)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 37,
      "end_line": 117,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Convergence checker.\n     * @deprecated in 2.2 (to be removed in 3.0). Please use the accessor\n     * {@link BaseAbstractScalarOptimizer#getConvergenceChecker()} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Type of optimization.\n     * @since 2.1\n     * @deprecated in 2.2 (to be removed in 3.0). Please use the accessor\n     * {@link BaseAbstractScalarOptimizer#getGoalType()} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Current point set.\n     * @deprecated in 2.2 (to be removed in 3.0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gradientEvaluations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of gradient evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Objective function gradient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link org.apache.commons.math.optimization.SimpleScalarValueChecker},\n     * the allowed number of iterations and evaluations are set to their\n     * default values.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.RealConvergenceChecker, int, int)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxIterations Maximum number of iterations.\n     * @param maxEvaluations Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 54)",
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getGradientEvaluations()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Compute the gradient vector.\n     * @param evaluationPoint point at which the gradient must be evaluated\n     * @return gradient at the specified point\n     * @exception FunctionEvaluationException if the function gradient\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 30)",
        "(line 97,col 9)-(line 97,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 101,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)",
        "(line 110,col 9)-(line 110,col 32)",
        "(line 112,col 9)-(line 112,col 24)",
        "(line 113,col 9)-(line 113,col 35)",
        "(line 115,col 9)-(line 115,col 55)"
      ]
    }
  ]
}
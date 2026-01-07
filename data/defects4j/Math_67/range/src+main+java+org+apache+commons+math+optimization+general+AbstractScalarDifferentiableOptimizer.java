{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 40,
      "end_line": 118,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradientEvaluations"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Number of gradient evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Objective function gradient. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Convergence checker.\n     * @deprecated in 2.2 (to be removed in 3.0). Please use the accessor\n     * {@link BaseAbstractScalarOptimizer#getConvergenceChecker()} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Type of optimization.\n     * @since 2.1\n     * @deprecated in 2.2 (to be removed in 3.0). Please use the accessor\n     * {@link BaseAbstractScalarOptimizer#getGoalType()} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Current point set.\n     * @deprecated in 2.2 (to be removed in 3.0).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleScalarValueChecker},\n     * the allowed number of iterations and evaluations are set to their\n     * default values.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.RealConvergenceChecker, int, int)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * @param convergenceChecker Convergence checker.\n     * @param maxIterations Maximum number of iterations.\n     * @param maxEvaluations Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 54)",
        "(line 81,col 9)-(line 81,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.getGradientEvaluations()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Compute the gradient vector.\n     * @param evaluationPoint point at which the gradient must be evaluated\n     * @return gradient at the specified point\n     * @exception FunctionEvaluationException if the function gradient\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 30)",
        "(line 98,col 9)-(line 98,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 102,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 32)",
        "(line 111,col 9)-(line 111,col 32)",
        "(line 113,col 9)-(line 113,col 24)",
        "(line 114,col 9)-(line 114,col 35)",
        "(line 116,col 9)-(line 116,col 55)"
      ]
    }
  ]
}
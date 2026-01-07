{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/general/AbstractDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction\u003e"
      ],
      "begin_line": 39,
      "end_line": 91,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Objective function gradient.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.AbstractDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated In 3.1. Please use\n     * {@link #optimizeInternal(int,MultivariateDifferentiableFunction,GoalType,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 80,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 43)",
        "(line 89,col 9)-(line 89,col 69)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/optimization/general/AbstractDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction\u003e"
      ],
      "begin_line": 38,
      "end_line": 89,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Objective function gradient.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.AbstractDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated In 3.1. Please use\n     * {@link #optimizeInternal(int,MultivariateDifferentiableFunction,GoalType,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 78,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 43)",
        "(line 87,col 9)-(line 87,col 69)"
      ]
    }
  ]
}
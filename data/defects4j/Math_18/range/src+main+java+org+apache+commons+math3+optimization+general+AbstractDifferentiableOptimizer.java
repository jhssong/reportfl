{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/optimization/general/AbstractDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer"
      ],
      "begin_line": 37,
      "end_line": 76,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Objective function gradient.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.AbstractDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractDifferentiableOptimizer.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 64,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 43)",
        "(line 72,col 9)-(line 72,col 64)"
      ]
    }
  ]
}
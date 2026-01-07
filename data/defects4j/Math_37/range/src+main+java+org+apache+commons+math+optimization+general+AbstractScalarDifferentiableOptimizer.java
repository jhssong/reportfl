{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateOptimizer"
      ],
      "begin_line": 36,
      "end_line": 81,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Objective function gradient.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a\n     * {@link org.apache.commons.math.optimization.SimpleScalarValueChecker\n     * SimpleScalarValueChecker}.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(int, org.apache.commons.math.analysis.DifferentiableMultivariateFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 71,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 32)",
        "(line 79,col 9)-(line 79,col 64)"
      ]
    }
  ]
}
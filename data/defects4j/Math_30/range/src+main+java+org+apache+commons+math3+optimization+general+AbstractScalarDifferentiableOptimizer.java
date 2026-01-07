{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateOptimizer"
      ],
      "begin_line": 36,
      "end_line": 84,
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
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a\n     * {@link org.apache.commons.math3.optimization.SimpleValueChecker\n     * SimpleValueChecker}.\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(int, org.apache.commons.math3.analysis.DifferentiableMultivariateFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 74,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)",
        "(line 82,col 9)-(line 82,col 64)"
      ]
    }
  ]
}
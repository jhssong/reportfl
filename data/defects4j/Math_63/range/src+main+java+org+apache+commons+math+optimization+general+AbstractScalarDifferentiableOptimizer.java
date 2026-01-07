{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 36,
      "end_line": 85,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e, int)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximum number of function evaluations.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     * @throws FunctionEvaluationException if the function gradient cannot be\n     * evaluated.\n     * @throws TooManyEvaluationsException if the allowed number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 76,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 32)",
        "(line 83,col 9)-(line 83,col 55)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/general/AbstractScalarDifferentiableOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarDifferentiableOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateOptimizer"
      ],
      "begin_line": 39,
      "end_line": 115,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Objective function gradient.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer()",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a\n     * {@link org.apache.commons.math3.optimization.SimpleValueChecker\n     * SimpleValueChecker}.\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.AbstractScalarDifferentiableOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param evaluationPoint Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.DifferentiableMultivariateFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 78,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 32)",
        "(line 86,col 9)-(line 86,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractScalarDifferentiableOptimizer.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 113,col 44)"
      ]
    }
  ]
}
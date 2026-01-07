{
  "filepath": "/tmp/Math-11b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateSimpleBoundsOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateSimpleBoundsOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003cFUNC\u003e",
        "org.apache.commons.math3.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e",
        "org.apache.commons.math3.optimization.BaseMultivariateSimpleBoundsOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 44,
      "end_line": 97,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions,\n * subject to simple bounds: The valid range of the parameters is an interval.\n * The interval can possibly be infinite (in one or both directions).\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n * @deprecated As of 3.1 since the {@link BaseAbstractMultivariateOptimizer\n * base class} contains similar functionality.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer()",
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence checker is set to a\n     * {@link org.apache.commons.math3.optimization.SimpleValueChecker}.\n     *\n     * @see BaseAbstractMultivariateOptimizer#BaseAbstractMultivariateOptimizer()\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getLowerBound()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getUpperBound()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 82,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[], double[], double[])",
      "begin_line": 90,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 70)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-17b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateSimpleBoundsOptimizer.java",
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
      "begin_line": 43,
      "end_line": 96,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions,\n * subject to simple bounds: The valid range of the parameters is an interval.\n * The interval can possibly be infinite (in one or both directions).\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 3.0\n * @deprecated As of 3.1 since the {@link BaseAbstractMultivariateSimpleBoundsOptimizer\n * base class} contains similar functionality.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer()",
      "begin_line": 56,
      "end_line": 57,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence checker is set to a\n     * {@link org.apache.commons.math3.optimization.SimpleValueChecker}.\n     *\n     * @see BaseAbstractMultivariateOptimizer#BaseAbstractMultivariateOptimizer()\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getLowerBound()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getUpperBound()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 81,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 85,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[], double[], double[])",
      "begin_line": 89,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 70)"
      ]
    }
  ]
}
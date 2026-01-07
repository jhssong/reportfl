{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/optimization/direct/BaseAbstractMultivariateSimpleBoundsOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateSimpleBoundsOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer\u003cFUNC\u003e",
        "org.apache.commons.math.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e",
        "org.apache.commons.math.optimization.BaseMultivariateSimpleBoundsOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 42,
      "end_line": 140,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions,\n * subject to simple bounds: The valid range of the parameters is an interval.\n * The interval can possibly be infinite (in one or both directions).\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Upper bounds. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence checker is set to a\n     * {@link org.apache.commons.math.optimization.SimpleScalarValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     *\n     * @see BaseAbstractMultivariateOptimizer#BaseAbstractMultivariateOptimizer()\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getLowerBound()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getUpperBound()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 83,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math.optimization.GoalType, double[], double[], double[])",
      "begin_line": 89,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 42)",
        "(line 94,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 135,col 9)",
        "(line 138,col 9)-(line 138,col 64)"
      ]
    }
  ]
}
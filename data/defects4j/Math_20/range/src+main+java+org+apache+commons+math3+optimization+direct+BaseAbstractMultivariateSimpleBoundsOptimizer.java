{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateSimpleBoundsOptimizer.java",
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
      "begin_line": 42,
      "end_line": 142,
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
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer()",
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence checker is set to a\n     * {@link org.apache.commons.math3.optimization.SimpleValueChecker}.\n     *\n     * @see BaseAbstractMultivariateOptimizer#BaseAbstractMultivariateOptimizer()\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.BaseAbstractMultivariateSimpleBoundsOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getLowerBound()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getUpperBound()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 84,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[], double[], double[])",
      "begin_line": 91,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 42)",
        "(line 96,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 137,col 9)",
        "(line 140,col 9)-(line 140,col 64)"
      ]
    }
  ]
}
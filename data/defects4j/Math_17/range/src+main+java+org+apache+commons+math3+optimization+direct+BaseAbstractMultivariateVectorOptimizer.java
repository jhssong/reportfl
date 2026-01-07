{
  "filepath": "/tmp/Math-17b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateVectorOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 41,
      "end_line": 192,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e the type of the objective function to be optimized\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Target value for the objective functions at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Weight for the least squares cost computation. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.BaseAbstractMultivariateVectorOptimizer()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorValueChecker}.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.BaseAbstractMultivariateVectorOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getMaxEvaluations()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getEvaluations()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getConvergenceChecker()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(double[])",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 105,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.MultivariateVectorFunction, double[], double[], double[])",
      "begin_line": 130,
      "end_line": 163,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param t Target value for the objective functions at optimum.\n     * @param w Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 151,col 9)-(line 151,col 45)",
        "(line 152,col 9)-(line 152,col 33)",
        "(line 155,col 9)-(line 155,col 21)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 27)",
        "(line 158,col 9)-(line 158,col 35)",
        "(line 161,col 9)-(line 161,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getStartPoint()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.doOptimize()",
      "begin_line": 178,
      "end_line": 178,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getTargetRef()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * @return a reference to the {@link #target array}.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeightRef()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * @return a reference to the {@link #weight array}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 22)"
      ]
    }
  ]
}
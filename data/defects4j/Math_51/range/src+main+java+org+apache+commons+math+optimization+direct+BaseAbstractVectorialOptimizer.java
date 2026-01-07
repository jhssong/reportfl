{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/optimization/direct/BaseAbstractVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 41,
      "end_line": 173,
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
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.BaseAbstractVectorialOptimizer()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorialValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.BaseAbstractVectorialOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getEvaluations()",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.computeObjectiveValue(double[])",
      "begin_line": 101,
      "end_line": 108,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * objective function throws one.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 111,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 131,col 45)",
        "(line 132,col 9)-(line 132,col 33)",
        "(line 135,col 9)-(line 135,col 21)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 35)",
        "(line 141,col 9)-(line 141,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getStartPoint()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.doOptimize()",
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for the\n     * objective function.\n     * @throws org.apache.commons.math.exception.MathUserException if\n     * the function throws one during search.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getTargetRef()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * @return a reference to the {@link #target array}.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getWeightRef()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * @return a reference to the {@link #weight array}.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 22)"
      ]
    }
  ]
}
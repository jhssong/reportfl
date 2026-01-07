{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/direct/BaseAbstractVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 42,
      "end_line": 183,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e the type of the objective function to be optimized\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Target value for the objective functions at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Weight for the least squares cost computation. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.BaseAbstractVectorialOptimizer()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorialValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.BaseAbstractVectorialOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e, int)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximum number of function evaluations.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 31)",
        "(line 72,col 9)-(line 72,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.setMaxEvaluations(int)",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getEvaluations()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.computeObjectiveValue(double[])",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws FunctionEvaluationException if the function cannot be evaluated.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.optimize(FUNC, double[], double[], double[])",
      "begin_line": 120,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 142,col 33)",
        "(line 145,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 27)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 151,col 9)-(line 151,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getStartPoint()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.doOptimize()",
      "begin_line": 168,
      "end_line": 169,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for objective function\n     * @throws FunctionEvaluationException if the objective function throws one during\n     * the search\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getTargetRef()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * @return a reference to the {@link #target array}.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer.getWeightRef()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * @return a reference to the {@link #weight array}.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 22)"
      ]
    }
  ]
}
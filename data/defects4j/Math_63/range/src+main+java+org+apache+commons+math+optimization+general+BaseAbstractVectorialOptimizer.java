{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/BaseAbstractVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 44,
      "end_line": 185,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e the type of the objective function to be optimized\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Target value for the objective functions at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Weight for the least squares cost computation. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.BaseAbstractVectorialOptimizer()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorialValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.BaseAbstractVectorialOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e, int)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximum number of function evaluations.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 31)",
        "(line 74,col 9)-(line 74,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.setMaxEvaluations(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.getEvaluations()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.computeObjectiveValue(double[])",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws FunctionEvaluationException if the function cannot be evaluated.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.optimize(FUNC, double[], double[], double[])",
      "begin_line": 122,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 144,col 9)-(line 144,col 33)",
        "(line 147,col 9)-(line 147,col 21)",
        "(line 148,col 9)-(line 148,col 37)",
        "(line 149,col 9)-(line 149,col 37)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 153,col 9)-(line 153,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.getStartPoint()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.doOptimize()",
      "begin_line": 170,
      "end_line": 171,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for objective function\n     * @throws FunctionEvaluationException if the objective function throws one during\n     * the search\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.getTargetRef()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * @return a reference to the {@link #target array}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractVectorialOptimizer.getWeightRef()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * @return a reference to the {@link #weight array}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 22)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-76b/src/main/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 39,
      "end_line": 237,
      "comment": "\n * Special implementation of the {@link DifferentiableMultivariateVectorialOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalJacobianEvaluations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of jacobian evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.MultiStartDifferentiableMultivariateVectorialOptimizer(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 80,
      "end_line": 93,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)",
        "(line 85,col 9)-(line 85,col 42)",
        "(line 86,col 9)-(line 86,col 42)",
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 88,col 47)",
        "(line 89,col 9)-(line 89,col 50)",
        "(line 90,col 9)-(line 90,col 45)",
        "(line 91,col 9)-(line 91,col 44)",
        "(line 92,col 9)-(line 92,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getOptima()",
      "begin_line": 122,
      "end_line": 127,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} method returns the\n     * best point only. This method returns all the points found at the\n     * end of each starts, including the best one already returned by the {@link\n     * #optimize(DifferentiableMultivariateVectorialFunction, double[],\n     * double[], double[]) optimize} method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} method did throw a {@link\n     * org.apache.commons.math.ConvergenceException ConvergenceException}).\n     * This also means that if the first element is non null, it is the best\n     * point found across all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setMaxIterations(int)",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getMaxIterations()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getIterations()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setMaxEvaluations(int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getEvaluations()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getJacobianEvaluations()",
      "begin_line": 160,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 165,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 170,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 175,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 71)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 186,col 9)-(line 203,col 9)",
        "(line 206,col 9)-(line 224,col 11)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 233,col 9)-(line 233,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.Anonymous-4fa62a36-96d2-4f18-a89b-2ff6c15ff88d.compare(org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 207,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 208,col 17)-(line 212,col 17)",
        "(line 213,col 17)-(line 213,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.Anonymous-1a46919f-c792-4d64-882a-e802a6207095.weightedResidual(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 215,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 216,col 17)-(line 216,col 56)",
        "(line 217,col 17)-(line 217,col 31)",
        "(line 218,col 17)-(line 221,col 17)",
        "(line 222,col 17)-(line 222,col 27)"
      ]
    }
  ]
}
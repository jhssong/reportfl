{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 40,
      "end_line": 238,
      "comment": "\n * Special implementation of the {@link DifferentiableMultivariateVectorialOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalJacobianEvaluations"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Number of jacobian evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.MultiStartDifferentiableMultivariateVectorialOptimizer(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 81,
      "end_line": 94,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 42)",
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 89,col 9)-(line 89,col 47)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 91,col 45)",
        "(line 92,col 9)-(line 92,col 44)",
        "(line 93,col 9)-(line 93,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getOptima()",
      "begin_line": 123,
      "end_line": 128,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} method returns the\n     * best point only. This method returns all the points found at the\n     * end of each starts, including the best one already returned by the {@link\n     * #optimize(DifferentiableMultivariateVectorialFunction, double[],\n     * double[], double[]) optimize} method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} method did throw a {@link\n     * org.apache.commons.math.ConvergenceException ConvergenceException}).\n     * This also means that if the first element is non null, it is the best\n     * point found across all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setMaxIterations(int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getMaxIterations()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getIterations()",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setMaxEvaluations(int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getEvaluations()",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getJacobianEvaluations()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 166,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 171,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 176,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 71)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 184,col 37)",
        "(line 187,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 225,col 11)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.Anonymous-2bcc89fc-2b72-480f-b4a2-613f57991856.compare(org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 208,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 209,col 17)-(line 213,col 17)",
        "(line 214,col 17)-(line 214,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.Anonymous-5315f176-f8e0-4ce9-8e99-df0cd0546d5d.weightedResidual(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 216,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 217,col 17)-(line 217,col 56)",
        "(line 218,col 17)-(line 218,col 31)",
        "(line 219,col 17)-(line 222,col 17)",
        "(line 223,col 17)-(line 223,col 27)"
      ]
    }
  ]
}
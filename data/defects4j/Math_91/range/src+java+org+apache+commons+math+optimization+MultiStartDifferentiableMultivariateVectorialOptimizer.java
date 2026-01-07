{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 41,
      "end_line": 223,
      "comment": " \n * Special implementation of the {@link DifferentiableMultivariateVectorialOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalJacobianEvaluations"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Number of jacobian evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.MultiStartDifferentiableMultivariateVectorialOptimizer(org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 79,
      "end_line": 91,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 84,col 58)",
        "(line 85,col 9)-(line 85,col 42)",
        "(line 86,col 9)-(line 86,col 42)",
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 88,col 47)",
        "(line 89,col 9)-(line 89,col 50)",
        "(line 90,col 9)-(line 90,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getOptima()",
      "begin_line": 119,
      "end_line": 124,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(MultivariateRealFunction, GoalType, double[]) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(MultivariateRealFunction, GoalType,\n     * double[]) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(MultivariateRealFunction, GoalType, double[]) optimize}\n     * method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(MultivariateRealFunction,\n     * GoalType, double[]) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is non null, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(MultivariateRealFunction,\n     * GoalType, double[]) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setMaxIterations(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getMaxIterations()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getIterations()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getEvaluations()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getJacobianEvaluations()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 162,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 71)",
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 169,col 37)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 173,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 210,col 11)",
        "(line 212,col 9)-(line 216,col 9)",
        "(line 219,col 9)-(line 219,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.Anonymous-70b6f415-5f91-41c7-8c60-3876f3e5932f.compare(org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 193,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 17)-(line 198,col 17)",
        "(line 199,col 17)-(line 199,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer.Anonymous-d6cbe911-41da-4319-93af-5eb578dafa84.weightedResidual(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 201,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 202,col 17)-(line 202,col 56)",
        "(line 203,col 17)-(line 203,col 31)",
        "(line 204,col 17)-(line 207,col 17)",
        "(line 208,col 17)-(line 208,col 27)"
      ]
    }
  ]
}
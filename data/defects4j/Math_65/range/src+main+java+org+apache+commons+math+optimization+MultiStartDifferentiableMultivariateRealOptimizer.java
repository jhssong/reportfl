{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 40,
      "end_line": 228,
      "comment": "\n * Special implementation of the {@link DifferentiableMultivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalGradientEvaluations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of gradient evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.MultiStartDifferentiableMultivariateRealOptimizer(org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 78,
      "end_line": 90,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)",
        "(line 82,col 9)-(line 82,col 42)",
        "(line 83,col 9)-(line 83,col 42)",
        "(line 84,col 9)-(line 84,col 42)",
        "(line 85,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 50)",
        "(line 87,col 9)-(line 87,col 45)",
        "(line 88,col 9)-(line 88,col 44)",
        "(line 89,col 9)-(line 89,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getOptima()",
      "begin_line": 119,
      "end_line": 124,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(DifferentiableMultivariateRealFunction, GoalType, double[])\n     * optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(DifferentiableMultivariateRealFunction,\n     * GoalType, double[]) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(DifferentiableMultivariateRealFunction, GoalType, double[])\n     * optimize} method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(DifferentiableMultivariateRealFunction,\n     * GoalType, double[]) optimize} method did throw a {@link\n     * org.apache.commons.math.ConvergenceException ConvergenceException}).\n     * This also means that if the first element is non null, it is the best\n     * point found across all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(DifferentiableMultivariateRealFunction,\n     * GoalType, double[]) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.setMaxIterations(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getMaxIterations()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getIterations()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getEvaluations()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getGradientEvaluations()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 162,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 167,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 172,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 66)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 37)",
        "(line 180,col 9)-(line 180,col 37)",
        "(line 183,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 215,col 11)",
        "(line 217,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.Anonymous-7dd257c7-0f91-4c38-947d-0017f98f3f26.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 205,col 17)-(line 209,col 17)",
        "(line 210,col 17)-(line 210,col 48)",
        "(line 211,col 17)-(line 211,col 48)",
        "(line 212,col 17)-(line 213,col 72)"
      ]
    }
  ]
}
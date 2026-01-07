{
  "filepath": "/tmp/Math-69b/src/main/java/org/apache/commons/math/optimization/MultiStartDifferentiableMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartDifferentiableMultivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer"
      ],
      "begin_line": 39,
      "end_line": 227,
      "comment": "\n * Special implementation of the {@link DifferentiableMultivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalIterations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalGradientEvaluations"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Number of gradient evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.MultiStartDifferentiableMultivariateRealOptimizer(org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 77,
      "end_line": 89,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 50)",
        "(line 81,col 9)-(line 81,col 42)",
        "(line 82,col 9)-(line 82,col 42)",
        "(line 83,col 9)-(line 83,col 42)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 45)",
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 88,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getOptima()",
      "begin_line": 118,
      "end_line": 123,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(DifferentiableMultivariateRealFunction, GoalType, double[])\n     * optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(DifferentiableMultivariateRealFunction,\n     * GoalType, double[]) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(DifferentiableMultivariateRealFunction, GoalType, double[])\n     * optimize} method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(DifferentiableMultivariateRealFunction,\n     * GoalType, double[]) optimize} method did throw a {@link\n     * org.apache.commons.math.ConvergenceException ConvergenceException}).\n     * This also means that if the first element is non null, it is the best\n     * point found across all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(DifferentiableMultivariateRealFunction,\n     * GoalType, double[]) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.setMaxIterations(int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getMaxIterations()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getIterations()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getEvaluations()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getGradientEvaluations()",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 161,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 166,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 171,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 66)",
        "(line 177,col 9)-(line 177,col 37)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 37)",
        "(line 182,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 214,col 11)",
        "(line 216,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizer.Anonymous-853c3c58-babe-4ddc-8233-1e9f0e50ebbb.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 203,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 204,col 17)-(line 208,col 17)",
        "(line 209,col 17)-(line 209,col 48)",
        "(line 210,col 17)-(line 210,col 48)",
        "(line 211,col 17)-(line 212,col 72)"
      ]
    }
  ]
}
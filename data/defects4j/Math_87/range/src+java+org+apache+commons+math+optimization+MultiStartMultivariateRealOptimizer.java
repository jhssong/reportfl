{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/optimization/MultiStartMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartMultivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.MultivariateRealOptimizer",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 220,
      "comment": " \n * Special implementation of the {@link MultivariateRealOptimizer} interface adding\n * multi-start features to an existing optimizer.\n * \u003cp\u003e\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Maximal number of iterations allowed. "
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
        "totalIterations"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Number of iterations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of evaluations already performed for all starts. "
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
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.MultiStartMultivariateRealOptimizer(org.apache.commons.math.optimization.MultivariateRealOptimizer, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 80,
      "end_line": 90,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer\n     * @param optimizer single-start optimizer to wrap\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 42)",
        "(line 84,col 9)-(line 84,col 50)",
        "(line 85,col 9)-(line 85,col 34)",
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 89,col 9)-(line 89,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.getOptima()",
      "begin_line": 118,
      "end_line": 123,
      "comment": " Get all the optima found during the last call to {@link\n     * #optimize(MultivariateRealFunction, GoalType, double[]) optimize}.\n     * \u003cp\u003eThe optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(MultivariateRealFunction, GoalType,\n     * double[]) optimize} method returns the best point only. This\n     * method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(MultivariateRealFunction, GoalType, double[]) optimize}\n     * method.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(MultivariateRealFunction,\n     * GoalType, double[]) optimize} method did throw a {@link\n     * ConvergenceException ConvergenceException}). This also means that\n     * if the first element is non null, it is the best point found across\n     * all starts.\u003c/p\u003e\n     * @return array containing the optima\n     * @exception IllegalStateException if {@link #optimize(MultivariateRealFunction,\n     * GoalType, double[]) optimize} has not been called\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.setMaxIterations(int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.getMaxIterations()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.getIterations()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.getEvaluations()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 156,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.optimize(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 166,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 173,col 29)",
        "(line 176,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 207,col 11)",
        "(line 209,col 9)-(line 213,col 9)",
        "(line 216,col 9)-(line 216,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizer.Anonymous-a36ccdc4-299e-4687-984a-029f73ed4d9b.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 196,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 197,col 17)-(line 201,col 17)",
        "(line 202,col 17)-(line 202,col 48)",
        "(line 203,col 17)-(line 203,col 48)",
        "(line 204,col 17)-(line 205,col 72)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/optim/univariate/MultiStartUnivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.univariate.UnivariateOptimizer"
      ],
      "begin_line": 41,
      "end_line": 228,
      "comment": "\n * Special implementation of the {@link UnivariateOptimizer} interface\n * adding multi-start features to an existing optimizer.\n * \u003cbr/\u003e\n * This class wraps an optimizer in order to use it several times in\n * turn with different starting points (trying to avoid being trapped\n * in a local extremum when looking for a global one).\n *\n * @version $Id$\n * @since 3.0\n "
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
        "totalEvaluations"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Found optima. "
    },
    {
      "type": "field",
      "varNames": [
        "optimData"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Optimization data. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvalIndex"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Location in {@link #optimData} where the updated maximum\n     * number of evaluations will be stored.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchIntervalIndex"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Location in {@link #optimData} where the updated start value\n     * will be stored.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.MultiStartUnivariateOptimizer(org.apache.commons.math3.optim.univariate.UnivariateOptimizer, int, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 76,
      "end_line": 88,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@code optimize} methods will return the same solution as\n     * {@code optimizer} would.\n     * @param generator Random generator to use for restarts.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 49)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 35)",
        "(line 86,col 9)-(line 86,col 29)",
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.getEvaluations()",
      "begin_line": 91,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.getOptima()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Gets all the optima found during the last call to {@code optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@code optimize} method returns the best point only.\n     * This method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@code optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@code optimize} method did throw\n     * an exception.\n     * This also means that if the first element is not {@code null}, it is\n     * the best point found across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link #optimize(OptimizationData[])\n     * optimize} has not been called.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalStateException if {@code optData} does not contain an\n     * instance of {@link MaxEval} or {@link SearchInterval}.\n     ",
      "child_ranges": [
        "(line 134,col 8)-(line 134,col 27)",
        "(line 136,col 9)-(line 136,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.doOptimize()",
      "begin_line": 140,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 46)",
        "(line 167,col 9)-(line 167,col 54)",
        "(line 168,col 9)-(line 168,col 29)",
        "(line 170,col 9)-(line 170,col 48)",
        "(line 171,col 9)-(line 171,col 36)",
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 173,col 50)",
        "(line 176,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 33)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 204,col 9)-(line 204,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.sortPairs(org.apache.commons.math3.optim.nonlinear.scalar.GoalType)",
      "begin_line": 212,
      "end_line": 227,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 226,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.MultiStartUnivariateOptimizer.Anonymous-97050cb0-0925-43be-8805-4519bd32ed16.compare(org.apache.commons.math3.optim.univariate.UnivariatePointValuePair, org.apache.commons.math3.optim.univariate.UnivariatePointValuePair)",
      "begin_line": 214,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 216,col 21)-(line 220,col 21)",
        "(line 221,col 21)-(line 221,col 52)",
        "(line 222,col 21)-(line 222,col 52)",
        "(line 223,col 21)-(line 224,col 72)"
      ]
    }
  ]
}
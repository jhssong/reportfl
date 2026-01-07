{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/univariate/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 46,
      "end_line": 206,
      "comment": "\n * Special implementation of the {@link UnivariateRealOptimizer} interface\n * adding multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
        "maxEvaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.MultiStartUnivariateRealOptimizer(org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 35)",
        "(line 74,col 9)-(line 74,col 29)",
        "(line 75,col 9)-(line 75,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 103,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 45)",
        "(line 105,col 9)-(line 105,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(FUNC,GoalType,double,double) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(FUNC,GoalType,double,double) optimize}\n     * method returns the best point only. This method returns all the points\n     * found at the end of each starts, including the best one already\n     * returned by the {@link #optimize(FUNC,GoalType,double,double) optimize}\n     * method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@link\n     * #optimize(FUNC,GoalType,double,double) optimize} method did throw a\n     * {@link ConvergenceException}). This also means that if the first\n     * element is not {@code null}, it is the best point found across all\n     * starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(FUNC,GoalType,double,double) optimize} has not been called.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 142,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 150,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 58)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 158,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 24)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 182,col 9)-(line 182,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.sortPairs(org.apache.commons.math.optimization.GoalType)",
      "begin_line": 190,
      "end_line": 205,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 204,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.Anonymous-61754c28-79ab-4ff7-b44f-b873f2a75799.compare(org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair, org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair)",
      "begin_line": 192,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 194,col 21)-(line 198,col 21)",
        "(line 199,col 21)-(line 199,col 52)",
        "(line 200,col 21)-(line 200,col 52)",
        "(line 201,col 21)-(line 202,col 72)"
      ]
    }
  ]
}
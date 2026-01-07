{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/univariate/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 45,
      "end_line": 204,
      "comment": "\n * Special implementation of the {@link UnivariateRealOptimizer} interface\n * adding multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
        "maxEvaluations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.MultiStartUnivariateRealOptimizer(org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)",
        "(line 73,col 9)-(line 73,col 29)",
        "(line 74,col 9)-(line 74,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 102,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 45)",
        "(line 104,col 9)-(line 104,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(FUNC,GoalType,double,double) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(FUNC,GoalType,double,double) optimize}\n     * method returns the best point only. This method returns all the points\n     * found at the end of each starts, including the best one already\n     * returned by the {@link #optimize(FUNC,GoalType,double,double) optimize}\n     * method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@link\n     * #optimize(FUNC,GoalType,double,double) optimize} method did throw a\n     * {@link ConvergenceException}). This also means that if the first\n     * element is not {@code null}, it is the best point found across all\n     * starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(FUNC,GoalType,double,double) optimize} has not been called.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 141,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 149,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 58)",
        "(line 154,col 9)-(line 154,col 29)",
        "(line 157,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 24)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.sortPairs(org.apache.commons.math.optimization.GoalType)",
      "begin_line": 188,
      "end_line": 203,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 202,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.Anonymous-119de864-4cc3-4b3b-95d1-59d29fc28786.compare(org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair, org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair)",
      "begin_line": 190,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 192,col 21)-(line 196,col 21)",
        "(line 197,col 21)-(line 197,col 52)",
        "(line 198,col 21)-(line 198,col 52)",
        "(line 199,col 21)-(line 200,col 72)"
      ]
    }
  ]
}
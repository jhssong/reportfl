{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/univariate/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 44,
      "end_line": 203,
      "comment": "\n * Special implementation of the {@link UnivariateRealOptimizer} interface\n * adding multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
        "maxEvaluations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.MultiStartUnivariateRealOptimizer(org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 68,
      "end_line": 74,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 35)",
        "(line 72,col 9)-(line 72,col 29)",
        "(line 73,col 9)-(line 73,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 45)",
        "(line 103,col 9)-(line 103,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(UnivariateRealFunction,GoalType,double,double) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(UnivariateRealFunction,GoalType,double,double) optimize}\n     * method returns the best point only. This method returns all the points\n     * found at the end of each starts, including the best one already\n     * returned by the {@link #optimize(UnivariateRealFunction,GoalType,double,double) optimize}\n     * method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@link\n     * #optimize(UnivariateRealFunction,GoalType,double,double) optimize}\n     * method did throw a {@link MathUserException}). This also means that\n     * if the first element is not {@code null}, it is the best point found\n     * across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(UnivariateRealFunction,GoalType,double,double) optimize}\n     * has not been called.\n     ",
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
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 47)",
        "(line 154,col 9)-(line 154,col 58)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 158,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 24)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.sortPairs(org.apache.commons.math.optimization.GoalType)",
      "begin_line": 187,
      "end_line": 202,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 201,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.Anonymous-8617c88c-6a10-4f08-9631-0eb998509abf.compare(org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair, org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair)",
      "begin_line": 189,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 191,col 21)-(line 195,col 21)",
        "(line 196,col 21)-(line 196,col 52)",
        "(line 197,col 21)-(line 197,col 52)",
        "(line 198,col 21)-(line 199,col 72)"
      ]
    }
  ]
}
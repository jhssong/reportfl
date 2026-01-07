{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/optimization/univariate/UnivariateMultiStartOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateMultiStartOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 46,
      "end_line": 203,
      "comment": "\n * Special implementation of the {@link UnivariateOptimizer} interface\n * adding multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Underlying classical optimizer. "
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
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.UnivariateMultiStartOptimizer(org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer\u003cFUNC\u003e, int, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 74,
      "end_line": 88,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@code optimize} methods will return the same solution as\n     * {@code optimizer} would.\n     * @param generator Random generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 35)",
        "(line 86,col 9)-(line 86,col 29)",
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.getConvergenceChecker()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.getMaxEvaluations()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.getEvaluations()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.getOptima()",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(int,UnivariateFunction,GoalType,double,double) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(int,UnivariateFunction,GoalType,double,double) optimize}\n     * method returns the best point only. This method returns all the points\n     * found at the end of each starts, including the best one already\n     * returned by the {@link #optimize(int,UnivariateFunction,GoalType,double,double) optimize}\n     * method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@link\n     * #optimize(int,UnivariateFunction,GoalType,double,double) optimize}\n     * method did throw an exception.\n     * This also means that if the first element is not {@code null}, it is\n     * the best point found across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(int,UnivariateFunction,GoalType,double,double) optimize}\n     * has not been called.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double, double)",
      "begin_line": 142,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double, double, double)",
      "begin_line": 149,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 46)",
        "(line 154,col 9)-(line 154,col 54)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 158,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 24)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.sortPairs(org.apache.commons.math3.optimization.GoalType)",
      "begin_line": 187,
      "end_line": 202,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 201,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizer.Anonymous-1902e3a4-3be9-4255-8dd8-b13ac859af7c.compare(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair)",
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
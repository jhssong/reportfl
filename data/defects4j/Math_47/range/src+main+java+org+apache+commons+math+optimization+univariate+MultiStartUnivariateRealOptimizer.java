{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/optimization/univariate/MultiStartUnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiStartUnivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 46,
      "end_line": 207,
      "comment": "\n * Special implementation of the {@link UnivariateRealOptimizer} interface\n * adding multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 3.0\n "
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
      "begin_line": 73,
      "end_line": 87,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@code optimize} methods will return the same solution as\n     * {@code optimizer} would.\n     * @param generator Random generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 35)",
        "(line 85,col 9)-(line 85,col 29)",
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair\u003e)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getEvaluations()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.getOptima()",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(int,UnivariateRealFunction,GoalType,double,double) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(int,UnivariateRealFunction,GoalType,double,double) optimize}\n     * method returns the best point only. This method returns all the points\n     * found at the end of each starts, including the best one already\n     * returned by the {@link #optimize(int,UnivariateRealFunction,GoalType,double,double) optimize}\n     * method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@link\n     * #optimize(int,UnivariateRealFunction,GoalType,double,double) optimize}\n     * method did throw a {@link MathUserException}).\n     * This also means that if the first element is not {@code null}, it is\n     * the best point found across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(int,UnivariateRealFunction,GoalType,double,double) optimize}\n     * has not been called.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(int, FUNC, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 148,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.optimize(int, FUNC, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 155,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 160,col 58)",
        "(line 161,col 9)-(line 161,col 29)",
        "(line 164,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 24)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.sortPairs(org.apache.commons.math.optimization.GoalType)",
      "begin_line": 191,
      "end_line": 206,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 205,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer.Anonymous-6bd7e0e9-9be5-4073-9a39-703d8a0032f6.compare(org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair, org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair)",
      "begin_line": 193,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 195,col 21)-(line 199,col 21)",
        "(line 200,col 21)-(line 200,col 52)",
        "(line 201,col 21)-(line 201,col 52)",
        "(line 202,col 21)-(line 203,col 72)"
      ]
    }
  ]
}
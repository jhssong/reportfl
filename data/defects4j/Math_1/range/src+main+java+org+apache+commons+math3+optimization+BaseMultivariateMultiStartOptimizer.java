{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optimization/BaseMultivariateMultiStartOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateMultiStartOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 44,
      "end_line": 193,
      "comment": "\n * Base class for all implementations of a multi-start optimizer.\n *\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link MultivariateMultiStartOptimizer} or on\n * {@link DifferentiableMultivariateMultiStartOptimizer}.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.BaseMultivariateMultiStartOptimizer(org.apache.commons.math3.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 72,
      "end_line": 86,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@link #optimize(int,MultivariateFunction,GoalType,double[])\n     * optimize} will return the same solution as {@code optimizer} would.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 35)",
        "(line 84,col 9)-(line 84,col 29)",
        "(line 85,col 9)-(line 85,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.getOptima()",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(int,MultivariateFunction,GoalType,double[]) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(int,MultivariateFunction,GoalType,double[])\n     * optimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(int,MultivariateFunction,GoalType,double[]) optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(int,MultivariateFunction,GoalType,double[])\n     * optimize} method did throw an exception.\n     * This also means that if the first element is not {@code null}, it\n     * is the best point found across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(int,MultivariateFunction,GoalType,double[]) optimize}\n     * has not been called.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.getMaxEvaluations()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.getEvaluations()",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.getConvergenceChecker()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 139,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 29)",
        "(line 148,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 24)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.sortPairs(org.apache.commons.math3.optimization.GoalType)",
      "begin_line": 177,
      "end_line": 192,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 191,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateMultiStartOptimizer.Anonymous-fa9e7c15-163f-4e36-90d5-a8110003cdf5.compare(org.apache.commons.math3.optimization.PointValuePair, org.apache.commons.math3.optimization.PointValuePair)",
      "begin_line": 179,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 181,col 21)-(line 185,col 21)",
        "(line 186,col 21)-(line 186,col 52)",
        "(line 187,col 21)-(line 187,col 52)",
        "(line 188,col 21)-(line 189,col 72)"
      ]
    }
  ]
}
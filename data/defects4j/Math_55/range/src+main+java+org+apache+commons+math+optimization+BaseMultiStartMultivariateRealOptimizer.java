{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/optimization/BaseMultiStartMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultiStartMultivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 44,
      "end_line": 195,
      "comment": "\n * Base class for all implementations of a multi-start optimizer.\n *\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link MultiStartMultivariateRealOptimizer} or on\n * {@link MultiStartDifferentiableMultivariateRealOptimizer}.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.BaseMultiStartMultivariateRealOptimizer(org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 71,
      "end_line": 85,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@link #optimize(int,MultivariateRealFunction,GoalType,double[])\n     * optimize} will return the same solution as {@code optimizer} would.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 35)",
        "(line 83,col 9)-(line 83,col 29)",
        "(line 84,col 9)-(line 84,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getOptima()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(int,MultivariateRealFunction,GoalType,double[]) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(int,MultivariateRealFunction,GoalType,double[])\n     * optimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(int,MultivariateRealFunction,GoalType,double[]) optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(int,MultivariateRealFunction,GoalType,double[])\n     * optimize} method did throw a {@link MathUserException}).\n     * This also means that if the first element is not {@code null}, it\n     * is the best point found across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(int,MultivariateRealFunction,GoalType,double[]) optimize}\n     * has not been called.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getEvaluations()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.optimize(int, FUNC, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 143,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 48)",
        "(line 149,col 9)-(line 149,col 29)",
        "(line 152,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 24)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 171,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.sortPairs(org.apache.commons.math.optimization.GoalType)",
      "begin_line": 179,
      "end_line": 194,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 193,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.Anonymous-0ef04de7-4895-41f3-a458-5a9e365ed835.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 181,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 183,col 21)-(line 187,col 21)",
        "(line 188,col 21)-(line 188,col 52)",
        "(line 189,col 21)-(line 189,col 52)",
        "(line 190,col 21)-(line 191,col 72)"
      ]
    }
  ]
}
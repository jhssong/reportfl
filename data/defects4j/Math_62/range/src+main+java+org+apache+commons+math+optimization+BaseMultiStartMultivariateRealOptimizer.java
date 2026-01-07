{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/BaseMultiStartMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultiStartMultivariateRealOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 43,
      "end_line": 191,
      "comment": "\n * Base class for all implementations of a multi-start optimizer.\n *\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link MultiStartMultivariateRealOptimizer} or on\n * {@link MultiStartDifferentiableMultivariateRealOptimizer}.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.BaseMultiStartMultivariateRealOptimizer(org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random vector generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 72,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getOptima()",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(FUNC,GoalType,double[]) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(FUNC,GoalType,double[])\n     * optimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts,\n     * including the best one already returned by the {@link\n     * #optimize(FUNC,GoalType,double[]) optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link #optimize(FUNC,GoalType,double[])\n     * optimize} method did throw a {@link ConvergenceException}).\n     * This also means that if the first element is not {@code null}, it\n     * is the best point found across all starts.\n     *\n     * @return an array containing the optima.\n     * @throws MathIllegalStateException if {@link\n     * #optimize(FUNC,GoalType,double[]) optimize} has not been called.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 108,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getEvaluations()",
      "begin_line": 113,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 118,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 45)",
        "(line 120,col 9)-(line 120,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 124,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 136,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 48)",
        "(line 143,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 24)",
        "(line 161,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 167,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.sortPairs(org.apache.commons.math.optimization.GoalType)",
      "begin_line": 175,
      "end_line": 190,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param goal Goal type.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 189,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateRealOptimizer.Anonymous-678ae3ad-950b-49f3-8d05-083a2741ead1.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 177,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 179,col 21)-(line 183,col 21)",
        "(line 184,col 21)-(line 184,col 52)",
        "(line 185,col 21)-(line 185,col 52)",
        "(line 186,col 21)-(line 187,col 72)"
      ]
    }
  ]
}
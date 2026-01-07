{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/BaseMultiStartMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultiStartMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseMultivariateOptimizer\u003cPAIR\u003e"
      ],
      "begin_line": 38,
      "end_line": 230,
      "comment": "\n * Base class multi-start optimizer for a multivariate function.\n * \u003cbr/\u003e\n * This class wraps an optimizer in order to use it several times in\n * turn with different starting points (trying to avoid being trapped\n * in a local extremum when looking for a global one).\n * \u003cem\u003eIt is not a \"user\" class.\u003c/em\u003e\n *\n * @param \u003cPAIR\u003e Type of the point/value pair returned by the optimization\n * algorithm.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optimData"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Optimization data. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvalIndex"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Location in {@link #optimData} where the updated maximum\n     * number of evaluations will be stored.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialGuessIndex"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Location in {@link #optimData} where the updated start value\n     * will be stored.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.BaseMultiStartMultivariateOptimizer(org.apache.commons.math3.optim.BaseMultivariateOptimizer\u003cPAIR\u003e, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 79,
      "end_line": 91,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     * \u003cp\u003e\n     * Note that if there are bounds constraints (see {@link #getLowerBound()}\n     * and {@link #getUpperBound()}), then a simple rejection algorithm is used\n     * at each restart. This implies that the random vector generator should have\n     * a good probability to generate vectors in the bounded domain, otherwise the\n     * rejection algorithm will hit the {@link #getMaxEvaluations()} count without\n     * generating a proper restart point. Users must be take great care of the \u003ca\n     * href\u003d\"http://en.wikipedia.org/wiki/Curse_of_dimensionality\"\u003ecurse of dimensionality\u003c/a\u003e.\n     * \u003c/p\u003e\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@link #optimize(OptimizationData[]) optimize} will return the\n     * same solution as the given {@code optimizer} would return.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 49)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 89,col 29)",
        "(line 90,col 9)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.getEvaluations()",
      "begin_line": 94,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.getOptima()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Gets all the optima found during the last call to {@code optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@code optimize} method returns the best point only.\n     * This method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@code optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@code optimize} method did throw\n     * an exception.\n     * This also means that if the first element is not {@code null}, it is\n     * the best point found across all starts.\n     * \u003cbr/\u003e\n     * The behaviour is undefined if this method is called before\n     * {@code optimize}; it will likely throw {@code NullPointerException}.\n     *\n     * @return an array containing the optima sorted from best to worst.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 130,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalStateException if {@code optData} does not contain an\n     * instance of {@link MaxEval} or {@link InitialGuess}.\n     ",
      "child_ranges": [
        "(line 133,col 8)-(line 133,col 27)",
        "(line 135,col 9)-(line 135,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize()",
      "begin_line": 139,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 46)",
        "(line 165,col 9)-(line 165,col 29)",
        "(line 166,col 9)-(line 166,col 16)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 169,col 45)",
        "(line 170,col 9)-(line 170,col 45)",
        "(line 171,col 9)-(line 171,col 52)",
        "(line 174,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 42)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.store(PAIR)",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * Method that will be called in order to store each found optimum.\n     *\n     * @param optimum Result of an optimization run.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.clear()",
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n     * Method that will called in order to clear all stored optima.\n     ",
      "child_ranges": []
    }
  ]
}
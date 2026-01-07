{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/optim/BaseMultiStartMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultiStartMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseMultivariateOptimizer\u003cPAIR\u003e"
      ],
      "begin_line": 37,
      "end_line": 206,
      "comment": "\n * Base class multi-start optimizer for a multivariate function.\n * \u003cbr/\u003e\n * This class wraps an optimizer in order to use it several times in\n * turn with different starting points (trying to avoid being trapped\n * in a local extremum when looking for a global one).\n * \u003cem\u003eIt is not a \"user\" class.\u003c/em\u003e\n *\n * @param \u003cPAIR\u003e Type of the point/value pair returned by the optimization\n * algorithm.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optimData"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Optimization data. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvalIndex"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Location in {@link #optimData} where the updated maximum\n     * number of evaluations will be stored.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialGuessIndex"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Location in {@link #optimData} where the updated start value\n     * will be stored.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.BaseMultiStartMultivariateOptimizer(org.apache.commons.math3.optim.BaseMultivariateOptimizer\u003cPAIR\u003e, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 70,
      "end_line": 82,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@link #optimize(OptimizationData[]) optimize} will return the\n     * same solution as the given {@code optimizer} would return.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 49)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 35)",
        "(line 80,col 9)-(line 80,col 29)",
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.getEvaluations()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.getOptima()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Gets all the optima found during the last call to {@code optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@code optimize} method returns the best point only.\n     * This method returns all the points found at the end of each starts,\n     * including the best one already returned by the {@code optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e in ascending order if minimizing and in\n     * descending order if maximizing), followed by {@code null} elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be {@code null} if the {@code optimize} method did throw\n     * an exception.\n     * This also means that if the first element is not {@code null}, it is\n     * the best point found across all starts.\n     * \u003cbr/\u003e\n     * The behaviour is undefined if this method is called before\n     * {@code optimize}; it will likely throw {@code NullPointerException}.\n     *\n     * @return an array containing the optima sorted from best to worst.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalStateException if {@code optData} does not contain an\n     * instance of {@link MaxEval} or {@link InitialGuess}.\n     ",
      "child_ranges": [
        "(line 124,col 8)-(line 124,col 27)",
        "(line 126,col 9)-(line 126,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize()",
      "begin_line": 130,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 46)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 157,col 9)-(line 157,col 16)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 52)",
        "(line 165,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 42)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.store(PAIR)",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n     * Method that will be called in order to store each found optimum.\n     *\n     * @param optimum Result of an optimization run.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.clear()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Method that will called in order to clear all stored optima.\n     ",
      "child_ranges": []
    }
  ]
}
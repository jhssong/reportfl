{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/optimization/BaseMultiStartMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultiStartMultivariateVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 44,
      "end_line": 206,
      "comment": "\n * Base class for all implementations of a multi-start optimizer.\n *\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link MultiStartDifferentiableMultivariateVectorialOptimizer}.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.BaseMultiStartMultivariateVectorialOptimizer(org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 70,
      "end_line": 84,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform, must be \u003e\u003d1. \n     * Multi-start is disabled if {@code starts \u003d\u003d 1}.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 35)",
        "(line 82,col 9)-(line 82,col 29)",
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getOptima()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(int,MultivariateVectorialFunction,double[],double[],double[]) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(int,MultivariateVectorialFunction,double[],double[],double[])\n     * optimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts, including\n     * the best one already returned by the {@link\n     * #optimize(int,MultivariateVectorialFunction,double[],double[],double[]) optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e. in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link\n     * #optimize(int,MultivariateVectorialFunction,double[],double[],double[]) optimize} method did\n     * throw a {@link ConvergenceException}). This also means that if\n     * the first element is not {@code null}, it is the best point found\n     * across all starts.\n     *\n     * @return array containing the optima\n     * @throws MathIllegalStateException if {@link\n     * #optimize(int,MultivariateVectorialFunction,double[],double[],double[]) optimize} has not been\n     * called.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getEvaluations()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 143,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 53)",
        "(line 149,col 9)-(line 149,col 29)",
        "(line 152,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 174,col 9)-(line 174,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.sortPairs(double[], double[])",
      "begin_line": 183,
      "end_line": 205,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param target Target value for the objective functions at optimum.\n     * @param weights Weights for the least-squares cost computation.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 204,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.Anonymous-6377cfa9-eeab-4b75-a4f1-75eaaf66f6a8.compare(org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 186,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 188,col 21)-(line 192,col 21)",
        "(line 193,col 21)-(line 193,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.Anonymous-9b259e39-a478-48d7-94df-3cb5a85099c1.weightedResidual(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 195,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 196,col 21)-(line 196,col 60)",
        "(line 197,col 21)-(line 197,col 35)",
        "(line 198,col 21)-(line 201,col 21)",
        "(line 202,col 21)-(line 202,col 31)"
      ]
    }
  ]
}
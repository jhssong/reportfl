{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/BaseMultiStartMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultiStartMultivariateVectorialOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 42,
      "end_line": 201,
      "comment": "\n * Base class for all implementations of a multi-start optimizer.\n *\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link MultiStartDifferentiableMultivariateVectorialOptimizer}.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Underlying classical optimizer. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "totalEvaluations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Number of evaluations already performed for all starts. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "optima"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Found optima. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.BaseMultiStartMultivariateVectorialOptimizer(org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer\u003cFUNC\u003e, int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random vector generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 35)",
        "(line 70,col 9)-(line 70,col 29)",
        "(line 71,col 9)-(line 71,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getOptima()",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(FUNC,double[],double[],double[]) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(FUNC,double[],double[],double[])\n     * optimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts, including\n     * the best one already returned by the {@link\n     * #optimize(FUNC,double[],double[],double[]) optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e. in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link\n     * #optimize(FUNC,double[],double[],double[]) optimize} method did\n     * throw a {@link ConvergenceException}). This also means that if\n     * the first element is not {@code null}, it is the best point found\n     * across all starts.\n     *\n     * @return array containing the optima\n     * @throws MathIllegalStateException if {@link\n     * #optimize(FUNC,double[],double[],double[]) optimize} has not been\n     * called.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getEvaluations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.setMaxEvaluations(int)",
      "begin_line": 119,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 45)",
        "(line 121,col 9)-(line 121,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 125,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.optimize(FUNC, double[], double[], double[])",
      "begin_line": 137,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 53)",
        "(line 145,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.sortPairs(double[], double[])",
      "begin_line": 178,
      "end_line": 200,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param target Target value for the objective functions at optimum.\n     * @param weights Weights for the least-squares cost computation.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 199,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.Anonymous-eae18de0-7744-4def-8076-c71eb4a6f41e.compare(org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 181,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 183,col 21)-(line 187,col 21)",
        "(line 188,col 21)-(line 188,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer.Anonymous-25e02408-f194-4fb4-ae9e-7ac8432e4184.weightedResidual(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 190,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 191,col 21)-(line 191,col 60)",
        "(line 192,col 21)-(line 192,col 35)",
        "(line 193,col 21)-(line 196,col 21)",
        "(line 197,col 21)-(line 197,col 31)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/optimization/BaseMultivariateVectorMultiStartOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateVectorMultiStartOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 43,
      "end_line": 203,
      "comment": "\n * Base class for all implementations of a multi-start optimizer.\n *\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link DifferentiableMultivariateVectorMultiStartOptimizer}.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 3.0\n "
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
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.BaseMultivariateVectorMultiStartOptimizer(org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer\u003cFUNC\u003e, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 70,
      "end_line": 84,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform. If {@code starts \u003d\u003d 1},\n     * the {@link #optimize(int,MultivariateVectorFunction,double[],double[],double[])\n     * optimize} will return the same solution as {@code optimizer} would.\n     * @param generator Random vector generator to use for restarts.\n     * @throws NullArgumentException if {@code optimizer} or {@code generator}\n     * is {@code null}.\n     * @throws NotStrictlyPositiveException if {@code starts \u003c 1}.\n     ",
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
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.getOptima()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Get all the optima found during the last call to {@link\n     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize}.\n     * The optimizer stores all the optima found during a set of\n     * restarts. The {@link #optimize(int,MultivariateVectorFunction,double[],double[],double[])\n     * optimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts, including\n     * the best one already returned by the {@link\n     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize} method.\n     * \u003cbr/\u003e\n     * The returned array as one element for each start as specified\n     * in the constructor. It is ordered with the results from the\n     * runs that did converge first, sorted from best to worst\n     * objective value (i.e. in ascending order if minimizing and in\n     * descending order if maximizing), followed by and null elements\n     * corresponding to the runs that did not converge. This means all\n     * elements will be null if the {@link\n     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize} method did\n     * throw a {@link ConvergenceException}). This also means that if\n     * the first element is not {@code null}, it is the best point found\n     * across all starts.\n     *\n     * @return array containing the optima\n     * @throws MathIllegalStateException if {@link\n     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize} has not been\n     * called.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.getMaxEvaluations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.getEvaluations()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.getConvergenceChecker()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 138,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 33)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 144,col 29)",
        "(line 147,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 171,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.sortPairs(double[], double[])",
      "begin_line": 180,
      "end_line": 202,
      "comment": "\n     * Sort the optima from best to worst, followed by {@code null} elements.\n     *\n     * @param target Target value for the objective functions at optimum.\n     * @param weights Weights for the least-squares cost computation.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 201,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.Anonymous-72177de8-6310-4273-b52b-2dec579464fc.compare(org.apache.commons.math3.optimization.PointVectorValuePair, org.apache.commons.math3.optimization.PointVectorValuePair)",
      "begin_line": 183,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 185,col 21)-(line 189,col 21)",
        "(line 190,col 21)-(line 190,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer.Anonymous-0997e5e5-7be1-47a3-9b8b-bbb15c02e0ea.weightedResidual(org.apache.commons.math3.optimization.PointVectorValuePair)",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 21)-(line 193,col 60)",
        "(line 194,col 21)-(line 194,col 35)",
        "(line 195,col 21)-(line 198,col 21)",
        "(line 199,col 21)-(line 199,col 31)"
      ]
    }
  ]
}
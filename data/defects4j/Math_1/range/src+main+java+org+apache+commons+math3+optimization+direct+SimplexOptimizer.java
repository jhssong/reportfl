{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optimization/direct/SimplexOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 88,
      "end_line": 234,
      "comment": "\n * This class implements simplex-based direct search optimization.\n *\n * \u003cp\u003e\n *  Direct search methods only use objective function values, they do\n *  not need derivatives and don\u0027t either try to compute approximation\n *  of the derivatives. According to a 1996 paper by Margaret H. Wright\n *  (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n *  Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n *  when either the computation of the derivative is impossible (noisy\n *  functions, unpredictable discontinuities) or difficult (complexity,\n *  computation cost). In the first cases, rather than an optimum, a\n *  \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n *  optimum is desired but cannot be reasonably found. In all cases\n *  direct search methods can be useful.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Simplex-based direct search methods are based on comparison of\n *  the objective function values at the vertices of a simplex (which is a\n *  set of n+1 points in dimension n) that is updated by the algorithms\n *  steps.\n * \u003cp\u003e\n * \u003cp\u003e\n *  The {@link #setSimplex(AbstractSimplex) setSimplex} method \u003cem\u003emust\u003c/em\u003e\n *  be called prior to calling the {@code optimize} method.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Each call to {@link #optimize(int,MultivariateFunction,GoalType,double[])\n *  optimize} will re-use the start configuration of the current simplex and\n *  move it such that its first vertex is at the provided start point of the\n *  optimization. If the {@code optimize} method is called to solve a different\n *  problem and the number of parameters change, the simplex must be\n *  re-initialized to one with the appropriate dimensions.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Convergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n *  previous and current simplex to the convergence checker, not the best\n *  ones.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This simplex optimizer implementation does not directly support constrained\n * optimization with simple bounds, so for such optimizations, either a more\n * dedicated method must be used like {@link CMAESOptimizer} or {@link\n * BOBYQAOptimizer}, or the optimized method must be wrapped in an adapter like\n * {@link MultivariateFunctionMappingAdapter} or {@link\n * MultivariateFunctionPenaltyAdapter}.\n * \u003c/p\u003e\n *\n * @see AbstractSimplex\n * @see MultivariateFunctionMappingAdapter\n * @see MultivariateFunctionPenaltyAdapter\n * @see CMAESOptimizer\n * @see BOBYQAOptimizer\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Simplex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.SimplexOptimizer()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Constructor using a default {@link SimpleValueChecker convergence\n     * checker}.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.SimplexOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.SimplexOptimizer(double, double)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.setSimplex(org.apache.commons.math3.optimization.direct.AbstractSimplex)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Set the simplex algorithm.\n     *\n     * @param simplex Simplex.\n     * @deprecated As of 3.1. The initial simplex can now be passed as an\n     * argument of the {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}\n     * method.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 148,
      "end_line": 158,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link AbstractSimplex}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 39)",
        "(line 157,col 9)-(line 157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 169,
      "end_line": 178,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link AbstractSimplex}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.doOptimize()",
      "begin_line": 181,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 189,col 9)-(line 194,col 14)",
        "(line 196,col 9)-(line 196,col 67)",
        "(line 197,col 9)-(line 205,col 10)",
        "(line 208,col 9)-(line 208,col 39)",
        "(line 209,col 9)-(line 209,col 47)",
        "(line 211,col 9)-(line 211,col 41)",
        "(line 212,col 9)-(line 212,col 26)",
        "(line 213,col 9)-(line 213,col 83)",
        "(line 214,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.Anonymous-e6275eaf-0a42-4b1a-8af6-44d098abeb72.value(double[])",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 21)-(line 192,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.SimplexOptimizer.Anonymous-d5505bf2-7155-4ecc-bf4e-b1c720a4494b.compare(org.apache.commons.math3.optimization.PointValuePair, org.apache.commons.math3.optimization.PointValuePair)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 201,col 17)-(line 201,col 48)",
        "(line 202,col 17)-(line 202,col 48)",
        "(line 203,col 17)-(line 203,col 81)"
      ]
    }
  ]
}
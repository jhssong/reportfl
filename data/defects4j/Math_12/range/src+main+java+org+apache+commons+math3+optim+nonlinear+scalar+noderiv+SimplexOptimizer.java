{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/SimplexOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 84,
      "end_line": 201,
      "comment": "\n * This class implements simplex-based direct search optimization.\n *\n * \u003cp\u003e\n *  Direct search methods only use objective function values, they do\n *  not need derivatives and don\u0027t either try to compute approximation\n *  of the derivatives. According to a 1996 paper by Margaret H. Wright\n *  (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n *  Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n *  when either the computation of the derivative is impossible (noisy\n *  functions, unpredictable discontinuities) or difficult (complexity,\n *  computation cost). In the first cases, rather than an optimum, a\n *  \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n *  optimum is desired but cannot be reasonably found. In all cases\n *  direct search methods can be useful.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Simplex-based direct search methods are based on comparison of\n *  the objective function values at the vertices of a simplex (which is a\n *  set of n+1 points in dimension n) that is updated by the algorithms\n *  steps.\n * \u003cp\u003e\n * \u003cp\u003e\n *  The simplex update procedure ({@link NelderMeadSimplex} or\n * {@link MultiDirectionalSimplex})  must be passed to the\n * {@code optimize} method.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Each call to {@code optimize} will re-use the start configuration of\n *  the current simplex and move it such that its first vertex is at the\n *  provided start point of the optimization.\n *  If the {@code optimize} method is called to solve a different problem\n *  and the number of parameters change, the simplex must be re-initialized\n *  to one with the appropriate dimensions.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Convergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n *  previous and current simplex to the convergence checker, not the best\n *  ones.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  This simplex optimizer implementation does not directly support constrained\n *  optimization with simple bounds; so, for such optimizations, either a more\n *  dedicated algorithm must be used like\n *  {@link CMAESOptimizer} or {@link BOBYQAOptimizer}, or the objective\n *  function must be wrapped in an adapter like\n *  {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter\n *  MultivariateFunctionMappingAdapter} or\n *  {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter\n *  MultivariateFunctionPenaltyAdapter}.\n * \u003c/p\u003e\n *\n * @version $Id: SimplexOptimizer.java 1397759 2012-10-13 01:12:58Z erans $\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Simplex update rule. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.SimplexOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.SimplexOptimizer(double, double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.MaxEval}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.SimpleBounds}\u003c/li\u003e\n     *  \u003cli\u003e{@link AbstractSimplex}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 39)",
        "(line 121,col 9)-(line 121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize()",
      "begin_line": 125,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 133,col 9)-(line 138,col 14)",
        "(line 140,col 9)-(line 140,col 67)",
        "(line 141,col 9)-(line 149,col 10)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 47)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 26)",
        "(line 157,col 9)-(line 157,col 83)",
        "(line 158,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.Anonymous-13b2c4c9-3a7b-4be7-9b9a-ccb5e01d0565.value(double[])",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 21)-(line 136,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.Anonymous-53f566b7-8cb0-4707-8131-300a801a1f50.compare(org.apache.commons.math3.optim.PointValuePair, org.apache.commons.math3.optim.PointValuePair)",
      "begin_line": 143,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 17)-(line 145,col 48)",
        "(line 146,col 17)-(line 146,col 48)",
        "(line 147,col 17)-(line 147,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 189,
      "end_line": 200,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link AbstractSimplex}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 199,col 9)"
      ]
    }
  ]
}
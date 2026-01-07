{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/optimization/direct/SimplexOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 86,
      "end_line": 177,
      "comment": "\n * This class implements simplex-based direct search optimization.\n *\n * \u003cp\u003e\n *  Direct search methods only use objective function values, they do\n *  not need derivatives and don\u0027t either try to compute approximation\n *  of the derivatives. According to a 1996 paper by Margaret H. Wright\n *  (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n *  Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n *  when either the computation of the derivative is impossible (noisy\n *  functions, unpredictable discontinuities) or difficult (complexity,\n *  computation cost). In the first cases, rather than an optimum, a\n *  \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n *  optimum is desired but cannot be reasonably found. In all cases\n *  direct search methods can be useful.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Simplex-based direct search methods are based on comparison of\n *  the objective function values at the vertices of a simplex (which is a\n *  set of n+1 points in dimension n) that is updated by the algorithms\n *  steps.\n * \u003cp\u003e\n * \u003cp\u003e\n *  The {@link #setSimplex(AbstractSimplex) setSimplex} method \u003cem\u003emust\u003c/em\u003e\n *  be called prior to calling the {@code optimize} method.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Each call to {@link #optimize(int,MultivariateFunction,GoalType,double[])\n *  optimize} will re-use the start configuration of the current simplex and\n *  move it such that its first vertex is at the provided start point of the\n *  optimization. If the {@code optimize} method is called to solve a different\n *  problem and the number of parameters change, the simplex must be\n *  re-initialized to one with the appropriate dimensions.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Convergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n *  previous and current simplex to the convergence checker, not the best\n *  ones.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This simplex optimizer implementation does not directly support constrained\n * optimization with simple bounds, so for such optimizations, either a more\n * dedicated method must be used like {@link CMAESOptimizer} or {@link\n * BOBYQAOptimizer}, or the optimized method must be wrapped in an adapter like\n * {@link MultivariateFunctionMappingAdapter} or {@link\n * MultivariateFunctionPenaltyAdapter}.\n * \u003c/p\u003e\n *\n * @see AbstractSimplex\n * @see MultivariateFunctionMappingAdapter\n * @see MultivariateFunctionPenaltyAdapter\n * @see CMAESOptimizer\n * @see BOBYQAOptimizer\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Simplex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Constructor using a default {@link SimpleScalarValueChecker convergence\n     * checker}.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(double, double)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.setSimplex(org.apache.commons.math.optimization.direct.AbstractSimplex)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Set the simplex algorithm.\n     *\n     * @param simplex Simplex.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.doOptimize()",
      "begin_line": 125,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 133,col 9)-(line 138,col 14)",
        "(line 140,col 9)-(line 140,col 67)",
        "(line 141,col 9)-(line 149,col 10)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 47)",
        "(line 155,col 9)-(line 155,col 45)",
        "(line 156,col 9)-(line 156,col 26)",
        "(line 157,col 9)-(line 157,col 87)",
        "(line 158,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-7938a732-f4ae-474b-87cd-29b14be5152a.value(double[])",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 21)-(line 136,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-643aa1fa-c246-4325-878d-76a70aeb4c52.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 143,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 17)-(line 145,col 48)",
        "(line 146,col 17)-(line 146,col 48)",
        "(line 147,col 17)-(line 147,col 81)"
      ]
    }
  ]
}
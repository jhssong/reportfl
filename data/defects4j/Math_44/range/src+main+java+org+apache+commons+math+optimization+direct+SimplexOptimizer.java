{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/optimization/direct/SimplexOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 74,
      "end_line": 165,
      "comment": "\n * This class implements simplex-based direct search optimization.\n *\n * \u003cp\u003e\n *  Direct search methods only use objective function values, they do\n *  not need derivatives and don\u0027t either try to compute approximation\n *  of the derivatives. According to a 1996 paper by Margaret H. Wright\n *  (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n *  Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n *  when either the computation of the derivative is impossible (noisy\n *  functions, unpredictable discontinuities) or difficult (complexity,\n *  computation cost). In the first cases, rather than an optimum, a\n *  \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n *  optimum is desired but cannot be reasonably found. In all cases\n *  direct search methods can be useful.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Simplex-based direct search methods are based on comparison of\n *  the objective function values at the vertices of a simplex (which is a\n *  set of n+1 points in dimension n) that is updated by the algorithms\n *  steps.\n * \u003cp\u003e\n * \u003cp\u003e\n *  The {@link #setSimplex(AbstractSimplex) setSimplex} method \u003cem\u003emust\u003c/em\u003e\n *  be called prior to calling the {@code optimize} method.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Each call to {@link #optimize(int,MultivariateRealFunction,GoalType,double[])\n *  optimize} will re-use the start configuration of the current simplex and\n *  move it such that its first vertex is at the provided start point of the\n *  optimization. If the {@code optimize} method is called to solve a different\n *  problem and the number of parameters change, the simplex must be\n *  re-initialized to one with the appropriate dimensions.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Convergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n *  previous and current simplex to the convergence checker, not the best\n *  ones.\n * \u003c/p\u003e\n *\n * @see AbstractSimplex\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Simplex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Constructor using a default {@link SimpleScalarValueChecker convergence\n     * checker}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(double, double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.setSimplex(org.apache.commons.math.optimization.direct.AbstractSimplex)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Set the simplex algorithm.\n     *\n     * @param simplex Simplex.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.doOptimize()",
      "begin_line": 113,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 121,col 9)-(line 126,col 14)",
        "(line 128,col 9)-(line 128,col 67)",
        "(line 129,col 9)-(line 137,col 10)",
        "(line 140,col 9)-(line 140,col 39)",
        "(line 141,col 9)-(line 141,col 47)",
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 26)",
        "(line 145,col 9)-(line 145,col 87)",
        "(line 146,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-9b79388b-59c6-43a6-ba6f-80d5e8cc51ef.value(double[])",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 21)-(line 124,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-773fee09-426a-4c2d-8446-e20c38ed49ae.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 133,col 17)-(line 133,col 48)",
        "(line 134,col 17)-(line 134,col 48)",
        "(line 135,col 17)-(line 135,col 81)"
      ]
    }
  ]
}
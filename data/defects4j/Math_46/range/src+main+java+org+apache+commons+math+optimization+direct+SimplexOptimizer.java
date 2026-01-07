{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/optimization/direct/SimplexOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 75,
      "end_line": 166,
      "comment": "\n * This class implements simplex-based direct search optimization.\n *\n * \u003cp\u003e\n *  Direct search methods only use objective function values, they do\n *  not need derivatives and don\u0027t either try to compute approximation\n *  of the derivatives. According to a 1996 paper by Margaret H. Wright\n *  (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n *  Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n *  when either the computation of the derivative is impossible (noisy\n *  functions, unpredictable discontinuities) or difficult (complexity,\n *  computation cost). In the first cases, rather than an optimum, a\n *  \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n *  optimum is desired but cannot be reasonably found. In all cases\n *  direct search methods can be useful.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Simplex-based direct search methods are based on comparison of\n *  the objective function values at the vertices of a simplex (which is a\n *  set of n+1 points in dimension n) that is updated by the algorithms\n *  steps.\n * \u003cp\u003e\n * \u003cp\u003e\n *  The {@link #setSimplex(AbstractSimplex) setSimplex} method \u003cem\u003emust\u003c/em\u003e\n *  be called prior to calling the {@code optimize} method.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Each call to {@link #optimize(int,MultivariateRealFunction,GoalType,double[])\n *  optimize} will re-use the start configuration of the current simplex and\n *  move it such that its first vertex is at the provided start point of the\n *  optimization. If the {@code optimize} method is called to solve a different\n *  problem and the number of parameters change, the simplex must be\n *  re-initialized to one with the appropriate dimensions.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Convergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n *  previous and current simplex to the convergence checker, not the best\n *  ones.\n * \u003c/p\u003e\n *\n * @see AbstractSimplex\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Simplex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Constructor using a default {@link SimpleScalarValueChecker convergence\n     * checker}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(double, double)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.setSimplex(org.apache.commons.math.optimization.direct.AbstractSimplex)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Set the simplex algorithm.\n     *\n     * @param simplex Simplex.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.doOptimize()",
      "begin_line": 114,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 122,col 9)-(line 127,col 14)",
        "(line 129,col 9)-(line 129,col 67)",
        "(line 130,col 9)-(line 138,col 10)",
        "(line 141,col 9)-(line 141,col 39)",
        "(line 142,col 9)-(line 142,col 47)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 145,col 26)",
        "(line 146,col 9)-(line 146,col 87)",
        "(line 147,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-86982c18-297d-40d9-9dc1-b9cef6cc0262.value(double[])",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 21)-(line 125,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-82481341-1980-406e-9d02-8e20c7c5bb39.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 132,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 134,col 17)-(line 134,col 48)",
        "(line 135,col 17)-(line 135,col 48)",
        "(line 136,col 17)-(line 136,col 81)"
      ]
    }
  ]
}
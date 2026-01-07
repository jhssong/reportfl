{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/optimization/direct/SimplexOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 79,
      "end_line": 162,
      "comment": "\n * This class implements simplex-based direct search optimization.\n *\n * \u003cp\u003e\n *  Direct search methods only use objective function values, they do\n *  not need derivatives and don\u0027t either try to compute approximation\n *  of the derivatives. According to a 1996 paper by Margaret H. Wright\n *  (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n *  Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n *  when either the computation of the derivative is impossible (noisy\n *  functions, unpredictable discontinuities) or difficult (complexity,\n *  computation cost). In the first cases, rather than an optimum, a\n *  \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n *  optimum is desired but cannot be reasonably found. In all cases\n *  direct search methods can be useful.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Simplex-based direct search methods are based on comparison of\n *  the objective function values at the vertices of a simplex (which is a\n *  set of n+1 points in dimension n) that is updated by the algorithms\n *  steps.\n * \u003cp\u003e\n * \u003cp\u003e\n *  The {@link #setSimplex(AbstractSimplex) setSimplex} method \u003cem\u003emust\u003c/em\u003e\n *  be called prior to calling the {@code optimize} method.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Each call to {@link #optimize(int,MultivariateRealFunction,GoalType,double[])\n *  optimize} will re-use the start configuration of the current simplex and\n *  move it such that its first vertex is at the provided start point of the\n *  optimization. If the {@code optimize} method is called to solve a different\n *  problem and the number of parameters change, the simplex must be\n *  re-initialized to one with the appropriate dimensions.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  If {@link #setConvergenceChecker(ConvergenceChecker)} is not called,\n *  a default {@link SimpleScalarValueChecker} is used.\n * \u003c/p\u003e\n * \u003cp\u003e\n *  Convergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n *  previous and current simplex to the convergence checker, not the best\n *  ones.\n * \u003c/p\u003e\n *\n * @see AbstractSimplex\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Simplex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.SimplexOptimizer(double, double)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.setSimplex(org.apache.commons.math.optimization.direct.AbstractSimplex)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Set the simplex algorithm.\n     *\n     * @param simplex Simplex.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.doOptimize()",
      "begin_line": 110,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 118,col 9)-(line 123,col 14)",
        "(line 125,col 9)-(line 125,col 67)",
        "(line 126,col 9)-(line 134,col 10)",
        "(line 137,col 9)-(line 137,col 39)",
        "(line 138,col 9)-(line 138,col 47)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 26)",
        "(line 142,col 9)-(line 142,col 87)",
        "(line 143,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-5526151f-5113-4e10-a874-b1612900c6df.value(double[])",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 21)-(line 121,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.SimplexOptimizer.Anonymous-262428e7-06ca-4366-bd5a-7ebb10bb7fa6.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 17)-(line 130,col 48)",
        "(line 131,col 17)-(line 131,col 48)",
        "(line 132,col 17)-(line 132,col 81)"
      ]
    }
  ]
}
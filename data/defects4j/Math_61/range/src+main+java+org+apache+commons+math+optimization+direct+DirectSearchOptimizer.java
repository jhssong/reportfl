{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/direct/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e"
      ],
      "begin_line": 84,
      "end_line": 329,
      "comment": "\n * This class implements simplex-based direct search optimization\n * algorithms.\n *\n * \u003cp\u003eDirect search methods only use objective function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable discontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n *\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the objective function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003cp\u003e\n *\n * \u003cp\u003eThe initial configuration of the simplex can be set using either\n * {@link #setStartConfiguration(double[])} or {@link\n * #setStartConfiguration(double[][])}. If neither method has been called\n * before optimization is attempted, an explicit call to the first method\n * with all steps set to +1 is triggered, thus building a default\n * configuration from a unit hypercube. Each call to {@link\n * #optimize(MultivariateRealFunction, GoalType, double[]) optimize} will reuse\n * the current start configuration and move it such that its first vertex\n * is at the provided start point of the optimization. If the {@code optimize}\n * method is called to solve a different problem and the number of parameters\n * change, the start configuration will be reset to a default one with the\n * appropriate dimensions.\u003c/p\u003e\n *\n * \u003cp\u003eIf {@link #setConvergenceChecker(ConvergenceChecker)} is not called,\n * a default {@link SimpleScalarValueChecker} is used.\u003c/p\u003e\n *\n * \u003cp\u003eConvergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n * previous and current simplex to the convergence checker, not the best ones.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n *\n * @see MultivariateRealFunction\n * @see NelderMead\n * @see MultiDirectional\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[])",
      "begin_line": 117,
      "end_line": 133,
      "comment": "\n     * Set start configuration for simplex.\n     *\n     * \u003cp\u003eThe start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\u003c/p\u003e\n     * \u003cp\u003eAs an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\u003c/p\u003e\n     *\n     * @param steps Steps along the canonical axes representing box edges. They\n     * may be negative but not zero.\n     * @throws IllegalArgumentException if one step is zero.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 46)",
        "(line 123,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[][])",
      "begin_line": 146,
      "end_line": 191,
      "comment": "\n     * Set start configuration for simplex.\n     * The real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\n     *\n     * @param referenceSimplex Reference simplex.\n     * @throws IllegalArgumentException if the reference simplex does not\n     * contain at least one point, or if there is a dimension mismatch\n     * in the reference simplex or if one of its vertices is duplicated.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 50)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 46)",
        "(line 157,col 9)-(line 157,col 50)",
        "(line 160,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.doOptimize()",
      "begin_line": 194,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 52)",
        "(line 198,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 67)",
        "(line 208,col 9)-(line 216,col 10)",
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 220,col 36)",
        "(line 222,col 9)-(line 222,col 79)",
        "(line 223,col 9)-(line 223,col 26)",
        "(line 224,col 9)-(line 224,col 87)",
        "(line 225,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.Anonymous-5c16e9e1-e15c-447f-9ae7-92c57c87e630.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 210,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 212,col 17)-(line 212,col 48)",
        "(line 213,col 17)-(line 213,col 48)",
        "(line 214,col 17)-(line 214,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 255,
      "end_line": 256,
      "comment": "\n     * Compute the next simplex of the algorithm.\n     *\n     * @param comparator Comparator to use to sort simplex vertices from best to worst.\n     * @throws FunctionEvaluationException if the function cannot be evaluated at\n     * some point.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException if\n     * the algorithm fails to converge.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException if\n     * the start point dimension is wrong.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.buildSimplex(double[])",
      "begin_line": 265,
      "end_line": 285,
      "comment": "\n     * Build an initial simplex.\n     *\n     * @param startPoint Start point for optimization.\n     * @throws DimensionMismatchException if the start point does not match\n     * simplex dimension.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 40)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 273,col 9)-(line 273,col 48)",
        "(line 274,col 9)-(line 274,col 68)",
        "(line 277,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 295,
      "end_line": 309,
      "comment": "\n     * Evaluate all the non-evaluated points of the simplex.\n     *\n     * @param comparator Comparator to use to sort simplex vertices from best to worst.\n     * @throws FunctionEvaluationException if no value can be computed for the parameters.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 305,col 9)",
        "(line 308,col 9)-(line 308,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.RealPointValuePair, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 317,
      "end_line": 328,
      "comment": "\n     * Replace the worst point of the simplex by a new point.\n     *\n     * @param pointValuePair Point to insert.\n     * @param comparator Comparator to use to sort simplex vertices from best to worst.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 35)",
        "(line 320,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 36)"
      ]
    }
  ]
}
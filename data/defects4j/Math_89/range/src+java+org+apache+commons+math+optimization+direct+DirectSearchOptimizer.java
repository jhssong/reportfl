{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/optimization/direct/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 85,
      "end_line": 403,
      "comment": " \n * This class implements simplex-based direct search optimization\n * algorithms.\n *\n * \u003cp\u003eDirect search methods only use objective function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable discontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n *\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the objective function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003cp\u003e\n *\n * \u003cp\u003eThe initial configuration of the simplex can be set using either\n * {@link #setStartConfiguration(double[])} or {@link\n * #setStartConfiguration(double[][])}. If neither method has been called\n * before optimization is attempted, an explicit call to the first method\n * with all steps set to +1 is triggered, thus building a default\n * configuration from a unit hypercube. Each call to {@link\n * #optimize(MultivariateRealFunction, GoalType, double[]) optimize} will reuse\n * the current start configuration and move it such that its first vertex\n * is at the provided start point of the optimization. If the same optimizer\n * is used to solve different problems and the number of parameters change,\n * the start configuration \u003cem\u003emust\u003c/em\u003e be reset or a dimension mismatch\n * will occur.\u003c/p\u003e\n *\n * \u003cp\u003eIf {@link #setConvergenceChecker(RealConvergenceChecker)} is not called,\n * a default {@link SimpleScalarValueChecker} is used.\u003c/p\u003e\n *\n * \u003cp\u003eConvergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n * previous and current simplex to the convergence checker, not the best ones.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n *\n * @see MultivariateRealFunction\n * @see NelderMead\n * @see MultiDirectional\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 113,
      "end_line": 116,
      "comment": " Simple constructor.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 62)",
        "(line 115,col 9)-(line 115,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[])",
      "begin_line": 134,
      "end_line": 151,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\u003c/p\u003e\n     * \u003cp\u003eAs an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\u003c/p\u003e\n     * @param steps steps along the canonical axes representing box edges,\n     * they may be negative but not null\n     * @exception IllegalArgumentException if one step is null\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 35)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[][])",
      "begin_line": 162,
      "end_line": 212,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\u003c/p\u003e\n     * @param referenceSimplex reference simplex\n     * @exception IllegalArgumentException if the reference simplex does not\n     * contain at least one point, or if there is a dimension mismatch\n     * in the reference simplex or if one of its vertices is duplicated\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 50)",
        "(line 176,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxIterations(int)",
      "begin_line": 215,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxIterations()",
      "begin_line": 220,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getIterations()",
      "begin_line": 225,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getEvaluations()",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 235,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getConvergenceChecker()",
      "begin_line": 240,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.optimize(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 245,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 19)",
        "(line 260,col 9)-(line 269,col 14)",
        "(line 272,col 9)-(line 272,col 24)",
        "(line 273,col 9)-(line 273,col 24)",
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 36)",
        "(line 277,col 9)-(line 277,col 79)",
        "(line 278,col 9)-(line 295,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.Anonymous-1f60f943-cfad-44ef-8be6-5cbb2fb3111c.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 262,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 264,col 21)-(line 264,col 52)",
        "(line 265,col 21)-(line 265,col 52)",
        "(line 266,col 21)-(line 267,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.incrementIterationsCounter()",
      "begin_line": 303,
      "end_line": 308,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 317,
      "end_line": 318,
      "comment": " Compute the next simplex of the algorithm.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     * @exception OptimizationException if the algorithm fails to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(double[])",
      "begin_line": 328,
      "end_line": 332,
      "comment": " Evaluate the objective function on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the objective function should be evaluated\n     * @return objective function value at the given point\n     * @exception FunctionEvaluationException if no value can be computed for the parameters\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 22)",
        "(line 331,col 9)-(line 331,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.buildSimplex(double[])",
      "begin_line": 339,
      "end_line": 363,
      "comment": " Build an initial simplex.\n     * @param startPoint the start point for optimization\n     * @exception IllegalArgumentException if the start point does not match\n     * simplex dimension\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 40)",
        "(line 343,col 9)-(line 347,col 9)",
        "(line 350,col 9)-(line 350,col 48)",
        "(line 351,col 9)-(line 351,col 68)",
        "(line 354,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 369,
      "end_line": 384,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if no value can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 379,col 9)",
        "(line 382,col 9)-(line 382,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.RealPointValuePair, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 390,
      "end_line": 401,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointValuePair point to insert\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 35)",
        "(line 393,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 36)"
      ]
    }
  ]
}
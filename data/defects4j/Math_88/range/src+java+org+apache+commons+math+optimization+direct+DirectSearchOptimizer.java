{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/optimization/direct/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.MultivariateRealOptimizer",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 427,
      "comment": " \n * This class implements simplex-based direct search optimization\n * algorithms.\n *\n * \u003cp\u003eDirect search methods only use objective function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable discontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n *\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the objective function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003cp\u003e\n *\n * \u003cp\u003eThe initial configuration of the simplex can be set using either\n * {@link #setStartConfiguration(double[])} or {@link\n * #setStartConfiguration(double[][])}. If neither method has been called\n * before optimization is attempted, an explicit call to the first method\n * with all steps set to +1 is triggered, thus building a default\n * configuration from a unit hypercube. Each call to {@link\n * #optimize(MultivariateRealFunction, GoalType, double[]) optimize} will reuse\n * the current start configuration and move it such that its first vertex\n * is at the provided start point of the optimization. If the same optimizer\n * is used to solve different problems and the number of parameters change,\n * the start configuration \u003cem\u003emust\u003c/em\u003e be reset or a dimension mismatch\n * will occur.\u003c/p\u003e\n *\n * \u003cp\u003eIf {@link #setConvergenceChecker(RealConvergenceChecker)} is not called,\n * a default {@link SimpleScalarValueChecker} is used.\u003c/p\u003e\n *\n * \u003cp\u003eConvergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n * previous and current simplex to the convergence checker, not the best ones.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n *\n * implements MultivariateRealOptimizer, Serializable since 2.0\n * \n * @see MultivariateRealFunction\n * @see NelderMead\n * @see MultiDirectional\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 122,
      "end_line": 126,
      "comment": " Simple constructor.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 62)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[])",
      "begin_line": 144,
      "end_line": 161,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\u003c/p\u003e\n     * \u003cp\u003eAs an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\u003c/p\u003e\n     * @param steps steps along the canonical axes representing box edges,\n     * they may be negative but not null\n     * @exception IllegalArgumentException if one step is null\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 46)",
        "(line 150,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[][])",
      "begin_line": 172,
      "end_line": 222,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\u003c/p\u003e\n     * @param referenceSimplex reference simplex\n     * @exception IllegalArgumentException if the reference simplex does not\n     * contain at least one point, or if there is a dimension mismatch\n     * in the reference simplex or if one of its vertices is duplicated\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 50)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 183,col 50)",
        "(line 186,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxIterations(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxIterations()",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxEvaluations(int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxEvaluations()",
      "begin_line": 240,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getIterations()",
      "begin_line": 245,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getEvaluations()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 255,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getConvergenceChecker()",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.optimize(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 265,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 19)",
        "(line 280,col 9)-(line 289,col 14)",
        "(line 292,col 9)-(line 292,col 24)",
        "(line 293,col 9)-(line 293,col 24)",
        "(line 294,col 9)-(line 294,col 33)",
        "(line 295,col 9)-(line 295,col 36)",
        "(line 297,col 9)-(line 297,col 79)",
        "(line 298,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.Anonymous-e6634179-d23a-4a7d-b297-7508e077058b.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 282,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 284,col 21)-(line 284,col 52)",
        "(line 285,col 21)-(line 285,col 52)",
        "(line 286,col 21)-(line 287,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.incrementIterationsCounter()",
      "begin_line": 323,
      "end_line": 328,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 337,
      "end_line": 338,
      "comment": " Compute the next simplex of the algorithm.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     * @exception OptimizationException if the algorithm fails to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(double[])",
      "begin_line": 349,
      "end_line": 355,
      "comment": " Evaluate the objective function on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the objective function should be evaluated\n     * @return objective function value at the given point\n     * @exception FunctionEvaluationException if no value can be computed for the parameters\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     * @exception OptimizationException if the maximal number of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.buildSimplex(double[])",
      "begin_line": 362,
      "end_line": 386,
      "comment": " Build an initial simplex.\n     * @param startPoint the start point for optimization\n     * @exception IllegalArgumentException if the start point does not match\n     * simplex dimension\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 40)",
        "(line 366,col 9)-(line 370,col 9)",
        "(line 373,col 9)-(line 373,col 48)",
        "(line 374,col 9)-(line 374,col 68)",
        "(line 377,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 393,
      "end_line": 408,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if no value can be computed for the parameters\n     * @exception OptimizationException if the maximal number of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 403,col 9)",
        "(line 406,col 9)-(line 406,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.RealPointValuePair, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 414,
      "end_line": 425,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointValuePair point to insert\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 35)",
        "(line 417,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 36)"
      ]
    }
  ]
}
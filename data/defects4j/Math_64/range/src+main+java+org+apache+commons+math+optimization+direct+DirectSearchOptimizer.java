{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/direct/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 89,
      "end_line": 420,
      "comment": "\n * This class implements simplex-based direct search optimization\n * algorithms.\n *\n * \u003cp\u003eDirect search methods only use objective function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable discontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n *\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the objective function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003cp\u003e\n *\n * \u003cp\u003eThe initial configuration of the simplex can be set using either\n * {@link #setStartConfiguration(double[])} or {@link\n * #setStartConfiguration(double[][])}. If neither method has been called\n * before optimization is attempted, an explicit call to the first method\n * with all steps set to +1 is triggered, thus building a default\n * configuration from a unit hypercube. Each call to {@link\n * #optimize(MultivariateRealFunction, GoalType, double[]) optimize} will reuse\n * the current start configuration and move it such that its first vertex\n * is at the provided start point of the optimization. If the {@code optimize}\n * method is called to solve a different problem and the number of parameters\n * change, the start configuration will be reset to a default one with the\n * appropriate dimensions.\u003c/p\u003e\n *\n * \u003cp\u003eIf {@link #setConvergenceChecker(RealConvergenceChecker)} is not called,\n * a default {@link SimpleScalarValueChecker} is used.\u003c/p\u003e\n *\n * \u003cp\u003eConvergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n * previous and current simplex to the convergence checker, not the best ones.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n *\n * implements MultivariateRealOptimizer since 2.0\n *\n * @see MultivariateRealFunction\n * @see NelderMead\n * @see MultiDirectional\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 117,
      "end_line": 121,
      "comment": " Simple constructor.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 62)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[])",
      "begin_line": 139,
      "end_line": 155,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\u003c/p\u003e\n     * \u003cp\u003eAs an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\u003c/p\u003e\n     * @param steps steps along the canonical axes representing box edges,\n     * they may be negative but not null\n     * @exception IllegalArgumentException if one step is null\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[][])",
      "begin_line": 166,
      "end_line": 214,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\u003c/p\u003e\n     * @param referenceSimplex reference simplex\n     * @exception IllegalArgumentException if the reference simplex does not\n     * contain at least one point, or if there is a dimension mismatch\n     * in the reference simplex or if one of its vertices is duplicated\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 50)",
        "(line 172,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 50)",
        "(line 180,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxIterations(int)",
      "begin_line": 217,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxIterations()",
      "begin_line": 222,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxEvaluations(int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxEvaluations()",
      "begin_line": 232,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getIterations()",
      "begin_line": 237,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getEvaluations()",
      "begin_line": 242,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 247,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getConvergenceChecker()",
      "begin_line": 252,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.optimize(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 257,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 26)",
        "(line 273,col 9)-(line 282,col 14)",
        "(line 285,col 9)-(line 285,col 24)",
        "(line 286,col 9)-(line 286,col 24)",
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 36)",
        "(line 290,col 9)-(line 290,col 79)",
        "(line 291,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.Anonymous-c53556d1-7537-4f30-a269-f6efa4ab3d0c.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 277,col 21)-(line 277,col 52)",
        "(line 278,col 21)-(line 278,col 52)",
        "(line 279,col 21)-(line 280,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.incrementIterationsCounter()",
      "begin_line": 316,
      "end_line": 321,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 330,
      "end_line": 331,
      "comment": " Compute the next simplex of the algorithm.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     * @exception OptimizationException if the algorithm fails to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(double[])",
      "begin_line": 342,
      "end_line": 349,
      "comment": " Evaluate the objective function on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the objective function should be evaluated\n     * @return objective function value at the given point\n     * @exception FunctionEvaluationException if no value can be computed for the\n     * parameters or if the maximal number of evaluations is exceeded\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.buildSimplex(double[])",
      "begin_line": 356,
      "end_line": 379,
      "comment": " Build an initial simplex.\n     * @param startPoint the start point for optimization\n     * @exception IllegalArgumentException if the start point does not match\n     * simplex dimension\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 40)",
        "(line 360,col 9)-(line 363,col 9)",
        "(line 366,col 9)-(line 366,col 48)",
        "(line 367,col 9)-(line 367,col 68)",
        "(line 370,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 386,
      "end_line": 401,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if no value can be computed for the parameters\n     * @exception OptimizationException if the maximal number of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 396,col 9)",
        "(line 399,col 9)-(line 399,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.RealPointValuePair, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 407,
      "end_line": 418,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointValuePair point to insert\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 35)",
        "(line 410,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 36)"
      ]
    }
  ]
}
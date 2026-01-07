{
  "filepath": "/tmp/Math-77b/src/main/java/org/apache/commons/math/optimization/direct/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 88,
      "end_line": 426,
      "comment": "\n * This class implements simplex-based direct search optimization\n * algorithms.\n *\n * \u003cp\u003eDirect search methods only use objective function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable discontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n *\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the objective function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003cp\u003e\n *\n * \u003cp\u003eThe initial configuration of the simplex can be set using either\n * {@link #setStartConfiguration(double[])} or {@link\n * #setStartConfiguration(double[][])}. If neither method has been called\n * before optimization is attempted, an explicit call to the first method\n * with all steps set to +1 is triggered, thus building a default\n * configuration from a unit hypercube. Each call to {@link\n * #optimize(MultivariateRealFunction, GoalType, double[]) optimize} will reuse\n * the current start configuration and move it such that its first vertex\n * is at the provided start point of the optimization. If the same optimizer\n * is used to solve different problems and the number of parameters change,\n * the start configuration \u003cem\u003emust\u003c/em\u003e be reset or a dimension mismatch\n * will occur.\u003c/p\u003e\n *\n * \u003cp\u003eIf {@link #setConvergenceChecker(RealConvergenceChecker)} is not called,\n * a default {@link SimpleScalarValueChecker} is used.\u003c/p\u003e\n *\n * \u003cp\u003eConvergence is checked by providing the \u003cem\u003eworst\u003c/em\u003e points of\n * previous and current simplex to the convergence checker, not the best ones.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n *\n * implements MultivariateRealOptimizer since 2.0\n *\n * @see MultivariateRealFunction\n * @see NelderMead\n * @see MultiDirectional\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "EQUAL_VERTICES_MESSAGE"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " Message for equal vertices. "
    },
    {
      "type": "field",
      "varNames": [
        "DIMENSION_MISMATCH_MESSAGE"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": " Message for dimension mismatch. "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 124,
      "end_line": 128,
      "comment": " Simple constructor.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 62)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 127,col 9)-(line 127,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[])",
      "begin_line": 146,
      "end_line": 162,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\u003c/p\u003e\n     * \u003cp\u003eAs an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\u003c/p\u003e\n     * @param steps steps along the canonical axes representing box edges,\n     * they may be negative but not null\n     * @exception IllegalArgumentException if one step is null\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 46)",
        "(line 152,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setStartConfiguration(double[][])",
      "begin_line": 173,
      "end_line": 221,
      "comment": " Set start configuration for simplex.\n     * \u003cp\u003eThe real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\u003c/p\u003e\n     * @param referenceSimplex reference simplex\n     * @exception IllegalArgumentException if the reference simplex does not\n     * contain at least one point, or if there is a dimension mismatch\n     * in the reference simplex or if one of its vertices is duplicated\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 50)",
        "(line 179,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 184,col 50)",
        "(line 187,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxIterations(int)",
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxIterations()",
      "begin_line": 229,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setMaxEvaluations(int)",
      "begin_line": 234,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getMaxEvaluations()",
      "begin_line": 239,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getIterations()",
      "begin_line": 244,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getEvaluations()",
      "begin_line": 249,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 254,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.getConvergenceChecker()",
      "begin_line": 259,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.optimize(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 264,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 26)",
        "(line 279,col 9)-(line 288,col 14)",
        "(line 291,col 9)-(line 291,col 24)",
        "(line 292,col 9)-(line 292,col 24)",
        "(line 293,col 9)-(line 293,col 33)",
        "(line 294,col 9)-(line 294,col 36)",
        "(line 296,col 9)-(line 296,col 79)",
        "(line 297,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.Anonymous-8becc359-aa8e-412f-94e8-53f0ae02fb0b.compare(org.apache.commons.math.optimization.RealPointValuePair, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 281,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 283,col 21)-(line 283,col 52)",
        "(line 284,col 21)-(line 284,col 52)",
        "(line 285,col 21)-(line 286,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.incrementIterationsCounter()",
      "begin_line": 322,
      "end_line": 327,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 336,
      "end_line": 337,
      "comment": " Compute the next simplex of the algorithm.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     * @exception OptimizationException if the algorithm fails to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluate(double[])",
      "begin_line": 348,
      "end_line": 355,
      "comment": " Evaluate the objective function on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the objective function should be evaluated\n     * @return objective function value at the given point\n     * @exception FunctionEvaluationException if no value can be computed for the\n     * parameters or if the maximal number of evaluations is exceeded\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.buildSimplex(double[])",
      "begin_line": 362,
      "end_line": 385,
      "comment": " Build an initial simplex.\n     * @param startPoint the start point for optimization\n     * @exception IllegalArgumentException if the start point does not match\n     * simplex dimension\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 40)",
        "(line 366,col 9)-(line 369,col 9)",
        "(line 372,col 9)-(line 372,col 48)",
        "(line 373,col 9)-(line 373,col 68)",
        "(line 376,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.evaluateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 392,
      "end_line": 407,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     * @exception FunctionEvaluationException if no value can be computed for the parameters\n     * @exception OptimizationException if the maximal number of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 402,col 9)",
        "(line 405,col 9)-(line 405,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.RealPointValuePair, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 413,
      "end_line": 424,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointValuePair point to insert\n     * @param comparator comparator to use to sort simplex vertices from best to worst\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 35)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 36)"
      ]
    }
  ]
}
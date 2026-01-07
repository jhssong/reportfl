{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/optimization/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 601,
      "comment": " This class implements simplex-based direct search optimization\n * algorithms.\n\n * \u003cp\u003eDirect search methods only use cost function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable dicontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the cost function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003c/p\u003e\n\n * \u003cp\u003eMinimization can be attempted either in single-start or in\n * multi-start mode. Multi-start is a traditional way to try to avoid\n * being trapped in a local minimum and miss the global minimum of a\n * function. It can also be used to verify the convergence of an\n * algorithm. The various multi-start-enabled \u003ccode\u003eminimizes\u003c/code\u003e\n * methods return the best minimum found after all starts, and the\n * {@link #getMinima getMinima} method can be used to retrieve all\n * minima from all starts (including the one already provided by the\n * {@link #minimizes(CostFunction, int, ConvergenceChecker, double[],\n * double[]) minimizes} method).\u003c/p\u003e\n\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n\n * @version $Id: DirectSearchOptimizer.java 1705 2006-09-17 19:57:39Z luc $\n * @see CostFunction\n * @see NelderMead\n * @see MultiDirectional\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 81,
      "end_line": 82,
      "comment": " Simple constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[], double[])",
      "begin_line": 108,
      "end_line": 120,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe initial simplex is built from two vertices that are\n     * considered to represent two opposite vertices of a box parallel\n     * to the canonical axes of the space. The simplex is the subset of\n     * vertices encountered while going from vertexA to vertexB\n     * traveling along the box edges only. This can be seen as a scaled\n     * regular simplex using the projected separation between the given\n     * points as the scaling factor along each coordinate axis.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception NoConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 118,col 9)-(line 118,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[], double[], int, long)",
      "begin_line": 150,
      "end_line": 179,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe initial simplex is built from two vertices that are\n     * considered to represent two opposite vertices of a box parallel\n     * to the canonical axes of the space. The simplex is the subset of\n     * vertices encountered while going from vertexA to vertexB\n     * traveling along the box edges only. This can be seen as a scaled\n     * regular simplex using the projected separation between the given\n     * points as the scaling factor along each coordinate axis.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param seed seed for the random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception NoConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 39)",
        "(line 162,col 9)-(line 162,col 64)",
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 54)",
        "(line 170,col 9)-(line 170,col 25)",
        "(line 171,col 9)-(line 171,col 68)",
        "(line 172,col 9)-(line 173,col 80)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 177,col 9)-(line 177,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[][])",
      "begin_line": 198,
      "end_line": 210,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built from all its vertices.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertices array containing all vertices of the simplex\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 31)",
        "(line 205,col 9)-(line 205,col 25)",
        "(line 208,col 9)-(line 208,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[][], int, long)",
      "begin_line": 235,
      "end_line": 273,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built from all its vertices.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertices array containing all vertices of the simplex\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param seed seed for the random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception NotPositiveDefiniteMatrixException if the vertices\n     * array is degenerated\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 292,
      "end_line": 304,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built randomly.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param generator random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 32)",
        "(line 299,col 9)-(line 299,col 25)",
        "(line 302,col 9)-(line 302,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, org.apache.commons.math.random.RandomVectorGenerator, int)",
      "begin_line": 326,
      "end_line": 339,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built randomly.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param generator random vector generator\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 32)",
        "(line 334,col 9)-(line 334,col 41)",
        "(line 337,col 9)-(line 337,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(double[], double[])",
      "begin_line": 352,
      "end_line": 369,
      "comment": " Build a simplex from two extreme vertices.\n     * \u003cp\u003eThe two vertices are considered to represent two opposite\n     * vertices of a box parallel to the canonical axes of the\n     * space. The simplex is the subset of vertices encountered while\n     * going from vertexA to vertexB traveling along the box edges\n     * only. This can be seen as a scaled regular simplex using the\n     * projected separation between the given points as the scaling\n     * factor along each coordinate axis.\u003c/p\u003e\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 31)",
        "(line 355,col 9)-(line 355,col 43)",
        "(line 358,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(double[][])",
      "begin_line": 374,
      "end_line": 380,
      "comment": " Build a simplex from all its points.\n     * @param vertices array containing all vertices of the simplex\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 36)",
        "(line 376,col 9)-(line 376,col 43)",
        "(line 377,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 385,
      "end_line": 398,
      "comment": " Build a simplex randomly.\n     * @param generator random vector generator\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 49)",
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 43)",
        "(line 391,col 9)-(line 391,col 59)",
        "(line 394,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.setSingleStart()",
      "begin_line": 402,
      "end_line": 406,
      "comment": " Set up single-start mode.\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 22)",
        "(line 404,col 9)-(line 404,col 25)",
        "(line 405,col 9)-(line 405,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.setMultiStart(int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 414,
      "end_line": 424,
      "comment": " Set up multi-start mode.\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.getMinima()",
      "begin_line": 449,
      "end_line": 451,
      "comment": " Get all the minima found during the last call to {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes}.\n     * \u003cp\u003eThe optimizer stores all the minima found during a set of\n     * restarts when multi-start mode is enabled. The {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes} method returns the best point only. This method\n     * returns all the points found at the end of each starts, including\n     * the best one already returned by the {@link #minimizes(CostFunction,\n     * int, ConvergenceChecker, double[], double[]) minimizes} method.\n     * The array as one element for each start as specified in the constructor\n     * (it has one element only if optimizer has been set up for single-start).\u003c/p\u003e\n     * \u003cp\u003eThe array containing the minima is ordered with the results\n     * from the runs that did converge first, sorted from lowest to\n     * highest minimum cost, and null elements corresponding to the runs\n     * that did not converge (all elements will be null if the {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes} method did throw a {@link ConvergenceException\n     * ConvergenceException}).\u003c/p\u003e\n     * @return array containing the minima, or null if {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes} has not been called\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker)",
      "begin_line": 467,
      "end_line": 515,
      "comment": " Minimizes a cost function.\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 19)",
        "(line 472,col 9)-(line 472,col 43)",
        "(line 475,col 9)-(line 499,col 9)",
        "(line 503,col 9)-(line 503,col 53)",
        "(line 506,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.iterateSimplex()",
      "begin_line": 519,
      "end_line": 520,
      "comment": " Compute the next simplex of the algorithm.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.evaluateCost(double[])",
      "begin_line": 529,
      "end_line": 533,
      "comment": " Evaluate the cost on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the cost function should be evaluated\n     * @return cost at the given point\n     * @exception CostException if no cost can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 22)",
        "(line 532,col 9)-(line 532,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.evaluateSimplex()",
      "begin_line": 538,
      "end_line": 552,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @exception CostException if no cost can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 550,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.PointCostPair)",
      "begin_line": 557,
      "end_line": 567,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointCostPair point to insert\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 35)",
        "(line 559,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pointCostPairComparator"
      ],
      "begin_line": 570,
      "end_line": 581,
      "comment": " Comparator for {@link PointCostPair PointCostPair} objects. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.Anonymous-233cc2b3-010f-4cfb-998e-da2a5653c29c.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 571,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 572,col 13)-(line 576,col 13)",
        "(line 577,col 13)-(line 577,col 53)",
        "(line 578,col 13)-(line 578,col 53)",
        "(line 579,col 13)-(line 579,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 584,
      "end_line": 584,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 587,
      "end_line": 587,
      "comment": " Cost function. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 590,
      "end_line": 590,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 593,
      "end_line": 593,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 596,
      "end_line": 596,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "minima"
      ],
      "begin_line": 599,
      "end_line": 599,
      "comment": " Found minima. "
    }
  ]
}
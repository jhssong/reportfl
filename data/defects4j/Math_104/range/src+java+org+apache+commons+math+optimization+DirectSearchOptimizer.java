{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/optimization/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 603,
      "comment": " This class implements simplex-based direct search optimization\n * algorithms.\n\n * \u003cp\u003eDirect search methods only use cost function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable dicontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the cost function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003c/p\u003e\n\n * \u003cp\u003eThe instances can be built either in single-start or in\n * multi-start mode. Multi-start is a traditional way to try to avoid\n * beeing trapped in a local minimum and miss the global minimum of a\n * function. It can also be used to verify the convergence of an\n * algorithm. In multi-start mode, the {@link #minimizes(CostFunction,\n * int, ConvergenceChecker, double[], double[]) minimizes}\n * method returns the best minimum found after all starts, and the\n * {@link #getMinima getMinima} method can be used to retrieve all\n * minima from all starts (including the one already provided by the\n * {@link #minimizes(CostFunction, int, ConvergenceChecker, double[],\n * double[]) minimizes} method).\u003c/p\u003e\n\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n\n * @version $Id: DirectSearchOptimizer.java 1705 2006-09-17 19:57:39Z luc $\n * @see CostFunction\n * @see NelderMead\n * @see MultiDirectional\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 82,
      "end_line": 83,
      "comment": " Simple constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[], double[])",
      "begin_line": 109,
      "end_line": 121,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe initial simplex is built from two vertices that are\n     * considered to represent two opposite vertices of a box parallel\n     * to the canonical axes of the space. The simplex is the subset of\n     * vertices encountered while going from vertexA to vertexB\n     * travelling along the box edges only. This can be seen as a scaled\n     * regular simplex using the projected separation between the given\n     * points as the scaling factor along each coordinate axis.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception NoConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 25)",
        "(line 119,col 9)-(line 119,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[], double[], int, long)",
      "begin_line": 151,
      "end_line": 180,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe initial simplex is built from two vertices that are\n     * considered to represent two opposite vertices of a box parallel\n     * to the canonical axes of the space. The simplex is the subset of\n     * vertices encountered while going from vertexA to vertexB\n     * travelling along the box edges only. This can be seen as a scaled\n     * regular simplex using the projected separation between the given\n     * points as the scaling factor along each coordinate axis.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param seed seed for the random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception NoConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 39)",
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 164,col 64)",
        "(line 165,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 54)",
        "(line 171,col 9)-(line 171,col 25)",
        "(line 172,col 9)-(line 172,col 68)",
        "(line 173,col 9)-(line 174,col 80)",
        "(line 175,col 9)-(line 175,col 35)",
        "(line 178,col 9)-(line 178,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[][])",
      "begin_line": 199,
      "end_line": 211,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built from all its vertices.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertices array containing all vertices of the simplex\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 31)",
        "(line 206,col 9)-(line 206,col 25)",
        "(line 209,col 9)-(line 209,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[][], int, long)",
      "begin_line": 236,
      "end_line": 274,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built from all its vertices.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertices array containing all vertices of the simplex\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param seed seed for the random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception NotPositiveDefiniteMatrixException if the vertices\n     * array is degenerated\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 293,
      "end_line": 305,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built randomly.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param generator random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 32)",
        "(line 300,col 9)-(line 300,col 25)",
        "(line 303,col 9)-(line 303,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, org.apache.commons.math.random.RandomVectorGenerator, int)",
      "begin_line": 327,
      "end_line": 340,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built randomly.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param generator random vector generator\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 32)",
        "(line 335,col 9)-(line 335,col 41)",
        "(line 338,col 9)-(line 338,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(double[], double[])",
      "begin_line": 353,
      "end_line": 370,
      "comment": " Build a simplex from two extreme vertices.\n     * \u003cp\u003eThe two vertices are considered to represent two opposite\n     * vertices of a box parallel to the canonical axes of the\n     * space. The simplex is the subset of vertices encountered while\n     * going from vertexA to vertexB travelling along the box edges\n     * only. This can be seen as a scaled regular simplex using the\n     * projected separation between the given points as the scaling\n     * factor along each coordinate axis.\u003c/p\u003e\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 31)",
        "(line 356,col 9)-(line 356,col 43)",
        "(line 359,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(double[][])",
      "begin_line": 375,
      "end_line": 381,
      "comment": " Build a simplex from all its points.\n     * @param vertices array containing all vertices of the simplex\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 36)",
        "(line 377,col 9)-(line 377,col 43)",
        "(line 378,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 386,
      "end_line": 399,
      "comment": " Build a simplex randomly.\n     * @param generator random vector generator\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 49)",
        "(line 390,col 9)-(line 390,col 30)",
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 392,col 59)",
        "(line 395,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.setSingleStart()",
      "begin_line": 403,
      "end_line": 407,
      "comment": " Set up single-start mode.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 22)",
        "(line 405,col 9)-(line 405,col 25)",
        "(line 406,col 9)-(line 406,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.setMultiStart(int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 415,
      "end_line": 425,
      "comment": " Set up multi-start mode.\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 424,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.getMinima()",
      "begin_line": 450,
      "end_line": 452,
      "comment": " Get all the minima found during the last call to {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes}.\n     * \u003cp\u003eThe optimizer stores all the minima found during a set of\n     * restarts when multi-start mode is enabled. The {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes} method returns the best point only. This method\n     * returns all the points found at the end of each starts, including\n     * the best one already returned by the {@link #minimizes(CostFunction,\n     * int, ConvergenceChecker, double[], double[]) minimizes} method.\n     * The array as one element for each start as specified in the constructor\n     * (it has one element only if optimizer has been set up for single-start).\u003c/p\u003e\n     * \u003cp\u003eThe array containing the minima is ordered with the results\n     * from the runs that did converge first, sorted from lowest to\n     * highest minimum cost, and null elements corresponding to the runs\n     * that did not converge (all elements will be null if the {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes} method throwed a {@link ConvergenceException\n     * ConvergenceException}).\u003c/p\u003e\n     * @return array containing the minima, or null if {@link\n     * #minimizes(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimizes} has not been called\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimizes(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker)",
      "begin_line": 468,
      "end_line": 516,
      "comment": " Minimizes a cost function.\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 19)",
        "(line 473,col 9)-(line 473,col 43)",
        "(line 476,col 9)-(line 500,col 9)",
        "(line 504,col 9)-(line 504,col 53)",
        "(line 507,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.iterateSimplex()",
      "begin_line": 520,
      "end_line": 521,
      "comment": " Compute the next simplex of the algorithm.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.evaluateCost(double[])",
      "begin_line": 530,
      "end_line": 534,
      "comment": " Evaluate the cost on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the cost function should be evaluated\n     * @return cost at the given point\n     * @exception CostException if no cost can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 22)",
        "(line 533,col 9)-(line 533,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.evaluateSimplex()",
      "begin_line": 539,
      "end_line": 553,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @exception CostException if no cost can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 548,col 9)",
        "(line 551,col 9)-(line 551,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.PointCostPair)",
      "begin_line": 558,
      "end_line": 568,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointCostPair point to insert\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 35)",
        "(line 560,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pointCostPairComparator"
      ],
      "begin_line": 571,
      "end_line": 583,
      "comment": " Comparator for {@link PointCostPair PointCostPair} objects. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.Anonymous-cf59d01c-e0d7-45ce-993f-cb4ba9600bee.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 572,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 573,col 13)-(line 581,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 586,
      "end_line": 586,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": " Cost function. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 592,
      "end_line": 592,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "minima"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": " Found minima. "
    }
  ]
}
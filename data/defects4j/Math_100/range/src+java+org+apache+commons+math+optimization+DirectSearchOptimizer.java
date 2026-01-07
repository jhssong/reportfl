{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/optimization/DirectSearchOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DirectSearchOptimizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 605,
      "comment": " \n * This class implements simplex-based direct search optimization\n * algorithms.\n *\n * \u003cp\u003eDirect search methods only use cost function values, they don\u0027t\n * need derivatives and don\u0027t either try to compute approximation of\n * the derivatives. According to a 1996 paper by Margaret H. Wright\n * (\u003ca href\u003d\"http://cm.bell-labs.com/cm/cs/doc/96/4-02.ps.gz\"\u003eDirect\n * Search Methods: Once Scorned, Now Respectable\u003c/a\u003e), they are used\n * when either the computation of the derivative is impossible (noisy\n * functions, unpredictable dicontinuities) or difficult (complexity,\n * computation cost). In the first cases, rather than an optimum, a\n * \u003cem\u003enot too bad\u003c/em\u003e point is desired. In the latter cases, an\n * optimum is desired but cannot be reasonably found. In all cases\n * direct search methods can be useful.\u003c/p\u003e\n *\n * \u003cp\u003eSimplex-based direct search methods are based on comparison of\n * the cost function values at the vertices of a simplex (which is a\n * set of n+1 points in dimension n) that is updated by the algorithms\n * steps.\u003c/p\u003e\n *\n * \u003cp\u003eMinimization can be attempted either in single-start or in\n * multi-start mode. Multi-start is a traditional way to try to avoid\n * being trapped in a local minimum and miss the global minimum of a\n * function. It can also be used to verify the convergence of an\n * algorithm. The various multi-start-enabled \u003ccode\u003eminimize\u003c/code\u003e\n * methods return the best minimum found after all starts, and the\n * {@link #getMinima getMinima} method can be used to retrieve all\n * minima from all starts (including the one already provided by the\n * {@link #minimize(CostFunction, int, ConvergenceChecker, double[],\n * double[]) minimize} method).\u003c/p\u003e\n *\n * \u003cp\u003eThis class is the base class performing the boilerplate simplex\n * initialization and handling. The simplex update by itself is\n * performed by the derived classes according to the implemented\n * algorithms.\u003c/p\u003e\n *\n * @see CostFunction\n * @see NelderMead\n * @see MultiDirectional\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.DirectSearchOptimizer()",
      "begin_line": 83,
      "end_line": 84,
      "comment": " Simple constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[], double[])",
      "begin_line": 110,
      "end_line": 122,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe initial simplex is built from two vertices that are\n     * considered to represent two opposite vertices of a box parallel\n     * to the canonical axes of the space. The simplex is the subset of\n     * vertices encountered while going from vertexA to vertexB\n     * traveling along the box edges only. This can be seen as a scaled\n     * regular simplex using the projected separation between the given\n     * points as the scaling factor along each coordinate axis.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 25)",
        "(line 120,col 9)-(line 120,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[], double[], int, long)",
      "begin_line": 152,
      "end_line": 181,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe initial simplex is built from two vertices that are\n     * considered to represent two opposite vertices of a box parallel\n     * to the canonical axes of the space. The simplex is the subset of\n     * vertices encountered while going from vertexA to vertexB\n     * traveling along the box edges only. This can be seen as a scaled\n     * regular simplex using the projected separation between the given\n     * points as the scaling factor along each coordinate axis.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param seed seed for the random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 39)",
        "(line 164,col 9)-(line 164,col 64)",
        "(line 165,col 9)-(line 165,col 64)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 54)",
        "(line 172,col 9)-(line 172,col 25)",
        "(line 173,col 9)-(line 173,col 68)",
        "(line 174,col 9)-(line 175,col 80)",
        "(line 176,col 9)-(line 176,col 35)",
        "(line 179,col 9)-(line 179,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[][])",
      "begin_line": 200,
      "end_line": 212,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built from all its vertices.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertices array containing all vertices of the simplex\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 31)",
        "(line 207,col 9)-(line 207,col 25)",
        "(line 210,col 9)-(line 210,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, double[][], int, long)",
      "begin_line": 237,
      "end_line": 275,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built from all its vertices.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param vertices array containing all vertices of the simplex\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param seed seed for the random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception NotPositiveDefiniteMatrixException if the vertices\n     * array is degenerated\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 294,
      "end_line": 306,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built randomly.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in single-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param generator random vector generator\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 32)",
        "(line 301,col 9)-(line 301,col 25)",
        "(line 304,col 9)-(line 304,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker, org.apache.commons.math.random.RandomVectorGenerator, int)",
      "begin_line": 328,
      "end_line": 341,
      "comment": " Minimizes a cost function.\n     * \u003cp\u003eThe simplex is built randomly.\u003c/p\u003e\n     * \u003cp\u003eThe optimization is performed in multi-start mode.\u003c/p\u003e\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @param generator random vector generator\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 32)",
        "(line 336,col 9)-(line 336,col 41)",
        "(line 339,col 9)-(line 339,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(double[], double[])",
      "begin_line": 354,
      "end_line": 371,
      "comment": " Build a simplex from two extreme vertices.\n     * \u003cp\u003eThe two vertices are considered to represent two opposite\n     * vertices of a box parallel to the canonical axes of the\n     * space. The simplex is the subset of vertices encountered while\n     * going from vertexA to vertexB traveling along the box edges\n     * only. This can be seen as a scaled regular simplex using the\n     * projected separation between the given points as the scaling\n     * factor along each coordinate axis.\u003c/p\u003e\n     * @param vertexA first vertex\n     * @param vertexB last vertex\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 357,col 43)",
        "(line 360,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(double[][])",
      "begin_line": 376,
      "end_line": 382,
      "comment": " Build a simplex from all its points.\n     * @param vertices array containing all vertices of the simplex\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 378,col 43)",
        "(line 379,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.buildSimplex(org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 387,
      "end_line": 400,
      "comment": " Build a simplex randomly.\n     * @param generator random vector generator\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 49)",
        "(line 391,col 9)-(line 391,col 30)",
        "(line 392,col 9)-(line 392,col 43)",
        "(line 393,col 9)-(line 393,col 59)",
        "(line 396,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.setSingleStart()",
      "begin_line": 404,
      "end_line": 408,
      "comment": " Set up single-start mode.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 22)",
        "(line 406,col 9)-(line 406,col 25)",
        "(line 407,col 9)-(line 407,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.setMultiStart(int, org.apache.commons.math.random.RandomVectorGenerator)",
      "begin_line": 416,
      "end_line": 426,
      "comment": " Set up multi-start mode.\n     * @param starts number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1\n     * @param generator random vector generator to use for restarts\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.getMinima()",
      "begin_line": 451,
      "end_line": 453,
      "comment": " Get all the minima found during the last call to {@link\n     * #minimize(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimize}.\n     * \u003cp\u003eThe optimizer stores all the minima found during a set of\n     * restarts when multi-start mode is enabled. The {@link\n     * #minimize(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimize} method returns the best point only. This method\n     * returns all the points found at the end of each starts, including\n     * the best one already returned by the {@link #minimize(CostFunction,\n     * int, ConvergenceChecker, double[], double[]) minimize} method.\n     * The array as one element for each start as specified in the constructor\n     * (it has one element only if optimizer has been set up for single-start).\u003c/p\u003e\n     * \u003cp\u003eThe array containing the minima is ordered with the results\n     * from the runs that did converge first, sorted from lowest to\n     * highest minimum cost, and null elements corresponding to the runs\n     * that did not converge (all elements will be null if the {@link\n     * #minimize(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimize} method did throw a {@link ConvergenceException\n     * ConvergenceException}).\u003c/p\u003e\n     * @return array containing the minima, or null if {@link\n     * #minimize(CostFunction, int, ConvergenceChecker, double[], double[])\n     * minimize} has not been called\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.minimize(org.apache.commons.math.optimization.CostFunction, int, org.apache.commons.math.optimization.ConvergenceChecker)",
      "begin_line": 469,
      "end_line": 517,
      "comment": " Minimizes a cost function.\n     * @param f cost function\n     * @param maxEvaluations maximal number of function calls for each\n     * start (note that the number will be checked \u003cem\u003eafter\u003c/em\u003e\n     * complete simplices have been evaluated, this means that in some\n     * cases this number will be exceeded by a few units, depending on\n     * the dimension of the problem)\n     * @param checker object to use to check for convergence\n     * @return the point/cost pairs giving the minimal cost\n     * @exception CostException if the cost function throws one during\n     * the search\n     * @exception ConvergenceException if none of the starts did\n     * converge (it is not thrown if at least one start did converge)\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 19)",
        "(line 474,col 9)-(line 474,col 43)",
        "(line 477,col 9)-(line 501,col 9)",
        "(line 505,col 9)-(line 505,col 53)",
        "(line 508,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.iterateSimplex()",
      "begin_line": 523,
      "end_line": 524,
      "comment": " Compute the next simplex of the algorithm.\n     * @exception CostException if the function cannot be evaluated at\n     * some point\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.evaluateCost(double[])",
      "begin_line": 533,
      "end_line": 537,
      "comment": " Evaluate the cost on one point.\n     * \u003cp\u003eA side effect of this method is to count the number of\n     * function evaluations\u003c/p\u003e\n     * @param x point on which the cost function should be evaluated\n     * @return cost at the given point\n     * @exception CostException if no cost can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 22)",
        "(line 536,col 9)-(line 536,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.evaluateSimplex()",
      "begin_line": 542,
      "end_line": 556,
      "comment": " Evaluate all the non-evaluated points of the simplex.\n     * @exception CostException if no cost can be computed for the parameters\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 551,col 9)",
        "(line 554,col 9)-(line 554,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.replaceWorstPoint(org.apache.commons.math.optimization.PointCostPair)",
      "begin_line": 561,
      "end_line": 571,
      "comment": " Replace the worst point of the simplex by a new point.\n     * @param pointCostPair point to insert\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 35)",
        "(line 563,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "pointCostPairComparator"
      ],
      "begin_line": 574,
      "end_line": 585,
      "comment": " Comparator for {@link PointCostPair PointCostPair} objects. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DirectSearchOptimizer.Anonymous-01171f2a-fbe4-4ed7-95f4-ed4102d774bc.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 575,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 576,col 13)-(line 580,col 13)",
        "(line 581,col 13)-(line 581,col 58)",
        "(line 582,col 13)-(line 582,col 58)",
        "(line 583,col 13)-(line 583,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 588,
      "end_line": 588,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": " Cost function. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "starts"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": " Number of starts to go. "
    },
    {
      "type": "field",
      "varNames": [
        "generator"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": " Random generator for multi-start. "
    },
    {
      "type": "field",
      "varNames": [
        "minima"
      ],
      "begin_line": 603,
      "end_line": 603,
      "comment": " Found minima. "
    }
  ]
}
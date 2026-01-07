{
  "filepath": "/tmp/Math-7b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 79,
      "end_line": 1316,
      "comment": "\n * \u003cp\u003eAn implementation of the active Covariance Matrix Adaptation Evolution Strategy (CMA-ES)\n * for non-linear, non-convex, non-smooth, global function minimization.\n * The CMA-Evolution Strategy (CMA-ES) is a reliable stochastic optimization method\n * which should be applied if derivative-based methods, e.g. quasi-Newton BFGS or\n * conjugate gradient, fail due to a rugged search landscape (e.g. noise, local\n * optima, outlier, etc.) of the objective function. Like a\n * quasi-Newton method, the CMA-ES learns and applies a variable metric\n * on the underlying search space. Unlike a quasi-Newton method, the\n * CMA-ES neither estimates nor uses gradients, making it considerably more\n * reliable in terms of finding a good, or even close to optimal, solution.\u003c/p\u003e\n *\n * \u003cp\u003eIn general, on smooth objective functions the CMA-ES is roughly ten times\n * slower than BFGS (counting objective function evaluations, no gradients provided).\n * For up to \u003cmath\u003eN\u003d10\u003c/math\u003e variables also the derivative-free simplex\n * direct search method (Nelder and Mead) can be faster, but it is\n * far less reliable than CMA-ES.\u003c/p\u003e\n *\n * \u003cp\u003eThe CMA-ES is particularly well suited for non-separable\n * and/or badly conditioned problems. To observe the advantage of CMA compared\n * to a conventional evolution strategy, it will usually take about\n * \u003cmath\u003e30 N\u003c/math\u003e function evaluations. On difficult problems the complete\n * optimization (a single run) is expected to take \u003cem\u003eroughly\u003c/em\u003e between\n * \u003cmath\u003e30 N\u003c/math\u003e and \u003cmath\u003e300 N\u003csup\u003e2\u003c/sup\u003e\u003c/math\u003e\n * function evaluations.\u003c/p\u003e\n *\n * \u003cp\u003eThis implementation is translated and adapted from the Matlab version\n * of the CMA-ES algorithm as implemented in module {@code cmaes.m} version 3.51.\u003c/p\u003e\n *\n * For more information, please refer to the following links:\n * \u003cul\u003e\n *  \u003cli\u003e\u003ca href\u003d\"http://www.lri.fr/~hansen/cmaes.m\"\u003eMatlab code\u003c/a\u003e\u003c/li\u003e\n *  \u003cli\u003e\u003ca href\u003d\"http://www.lri.fr/~hansen/cmaesintro.html\"\u003eIntroduction to CMA-ES\u003c/a\u003e\u003c/li\u003e\n *  \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/CMA-ES\"\u003eWikipedia\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " population size"
    },
    {
      "type": "field",
      "varNames": [
        "isActiveCMA"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Covariance update mechanism, default is active CMA. isActiveCMA \u003d true\n     * turns on \"active CMA\" with a negative update of the covariance matrix and\n     * checks for positive definiteness. OPTS.CMA.active \u003d 2 does not check for\n     * pos. def. and is numerically faster. Active CMA usually speeds up the\n     * adaptation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "checkFeasableCount"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * @see Sigma\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopFitness"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.CMAESOptimizer(int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 223,
      "end_line": 239,
      "comment": "\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 23)",
        "(line 232,col 9)-(line 232,col 43)",
        "(line 233,col 9)-(line 233,col 39)",
        "(line 234,col 9)-(line 234,col 39)",
        "(line 235,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sigma",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 280,
      "end_line": 306,
      "comment": "\n     * Input sigma values.\n     * They define the initial coordinate-wise standard deviations for\n     * sampling new search points around the initial guess.\n     * It is suggested to set them to the estimated distance from the\n     * initial to the desired optimum.\n     * Small values induce the search to be more local (and very small\n     * values are more likely to find a local optimum close to the initial\n     * guess).\n     * Too small values might however lead to early termination.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " Sigma values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma.Sigma(double[])",
      "begin_line": 289,
      "end_line": 298,
      "comment": "\n         * @param s Sigma values.\n         * @throws NotPositiveException if any of the array entries is smaller\n         * than zero.\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 295,col 13)",
        "(line 297,col 13)-(line 297,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma.getSigma()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n         * @return the sigma values.\n         ",
      "child_ranges": [
        "(line 304,col 13)-(line 304,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PopulationSize",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 318,
      "end_line": 340,
      "comment": "\n     * Population size.\n     * The number of offspring is the primary strategy parameter.\n     * In the absence of better clues, a good default could be an\n     * integer close to {@code 4 + 3 ln(n)}, where {@code n} is the\n     * number of optimized parameters.\n     * Increasing the population size improves global search properties\n     * at the expense of speed (which in general decreases at most\n     * linearly with increasing population size).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Population size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize.PopulationSize(int)",
      "begin_line": 326,
      "end_line": 332,
      "comment": "\n         * @param size Population size.\n         * @throws NotStrictlyPositiveException if {@code size \u003c\u003d 0}.\n         ",
      "child_ranges": [
        "(line 328,col 13)-(line 330,col 13)",
        "(line 331,col 13)-(line 331,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize.getPopulationSize()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n         * @return the population size.\n         ",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 358,
      "end_line": 364,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link MultivariateOptimizer#parseOptimizationData(OptimizationData[])\n     * MultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize()",
      "begin_line": 367,
      "end_line": 514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 61)",
        "(line 371,col 9)-(line 371,col 61)",
        "(line 372,col 9)-(line 372,col 47)",
        "(line 374,col 9)-(line 374,col 33)",
        "(line 375,col 9)-(line 375,col 29)",
        "(line 376,col 9)-(line 376,col 23)",
        "(line 377,col 9)-(line 377,col 47)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 381,col 70)",
        "(line 382,col 9)-(line 382,col 41)",
        "(line 386,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 526,
      "end_line": 545,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 45)",
        "(line 533,col 9)-(line 542,col 9)",
        "(line 544,col 9)-(line 544,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters()",
      "begin_line": 550,
      "end_line": 565,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 46)",
        "(line 552,col 9)-(line 552,col 44)",
        "(line 553,col 9)-(line 553,col 44)",
        "(line 555,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 572,
      "end_line": 636,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 577,col 66)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 79)",
        "(line 582,col 9)-(line 582,col 29)",
        "(line 585,col 9)-(line 585,col 40)",
        "(line 586,col 9)-(line 586,col 40)",
        "(line 587,col 9)-(line 587,col 27)",
        "(line 588,col 9)-(line 588,col 31)",
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 592,col 36)",
        "(line 593,col 9)-(line 593,col 79)",
        "(line 594,col 9)-(line 594,col 24)",
        "(line 595,col 9)-(line 595,col 25)",
        "(line 596,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 51)",
        "(line 602,col 9)-(line 602,col 36)",
        "(line 605,col 9)-(line 606,col 56)",
        "(line 607,col 9)-(line 607,col 52)",
        "(line 608,col 9)-(line 611,col 66)",
        "(line 612,col 9)-(line 612,col 68)",
        "(line 613,col 9)-(line 614,col 71)",
        "(line 615,col 9)-(line 615,col 62)",
        "(line 616,col 9)-(line 616,col 72)",
        "(line 617,col 9)-(line 618,col 91)",
        "(line 620,col 9)-(line 620,col 58)",
        "(line 621,col 9)-(line 621,col 50)",
        "(line 622,col 9)-(line 622,col 30)",
        "(line 623,col 9)-(line 623,col 33)",
        "(line 624,col 9)-(line 624,col 33)",
        "(line 625,col 9)-(line 625,col 39)",
        "(line 627,col 9)-(line 627,col 38)",
        "(line 628,col 9)-(line 628,col 31)",
        "(line 629,col 9)-(line 629,col 63)",
        "(line 630,col 9)-(line 630,col 64)",
        "(line 631,col 9)-(line 631,col 72)",
        "(line 632,col 9)-(line 632,col 49)",
        "(line 633,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 646,
      "end_line": 659,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 59)",
        "(line 650,col 9)-(line 650,col 39)",
        "(line 651,col 9)-(line 653,col 54)",
        "(line 654,col 9)-(line 654,col 39)",
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 668,
      "end_line": 686,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 60)",
        "(line 672,col 9)-(line 672,col 43)",
        "(line 673,col 9)-(line 676,col 45)",
        "(line 677,col 9)-(line 677,col 28)",
        "(line 678,col 9)-(line 685,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 699,
      "end_line": 758,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 27)",
        "(line 703,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateBD(double)",
      "begin_line": 765,
      "end_line": 794,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 793,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push(double[], double)",
      "begin_line": 802,
      "end_line": 807,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals History queue.\n     * @param val Current best fitness value.\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 815,
      "end_line": 826,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 66)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 25)",
        "(line 821,col 9)-(line 821,col 54)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 832,
      "end_line": 873,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 836,
      "end_line": 836,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 842,
      "end_line": 845,
      "comment": "\n         * @param value Value to compare.\n         * @param index Index into sorted array.\n         ",
      "child_ranges": [
        "(line 843,col 13)-(line 843,col 31)",
        "(line 844,col 13)-(line 844,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex)",
      "begin_line": 848,
      "end_line": 850,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 853,
      "end_line": 865,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 856,col 13)-(line 858,col 13)",
        "(line 860,col 13)-(line 862,col 13)",
        "(line 864,col 13)-(line 864,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 868,
      "end_line": 872,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 870,col 13)-(line 870,col 55)",
        "(line 871,col 13)-(line 871,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 880,
      "end_line": 972,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 882,
      "end_line": 882,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 887,
      "end_line": 887,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 891,
      "end_line": 894,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 27)",
        "(line 893,col 13)-(line 893,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 900,
      "end_line": 910,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 25)",
        "(line 902,col 13)-(line 908,col 13)",
        "(line 909,col 13)-(line 909,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 916,
      "end_line": 929,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 917,col 13)-(line 917,col 68)",
        "(line 918,col 13)-(line 918,col 68)",
        "(line 920,col 13)-(line 927,col 13)",
        "(line 928,col 13)-(line 928,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 935,col 13)-(line 935,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 942,
      "end_line": 957,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired (i.e. all in bounds) objective variables.\n         ",
      "child_ranges": [
        "(line 943,col 13)-(line 943,col 68)",
        "(line 944,col 13)-(line 944,col 68)",
        "(line 946,col 13)-(line 946,col 59)",
        "(line 947,col 13)-(line 955,col 13)",
        "(line 956,col 13)-(line 956,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 964,
      "end_line": 971,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 965,col 13)-(line 965,col 31)",
        "(line 966,col 13)-(line 969,col 13)",
        "(line 970,col 13)-(line 970,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 980,
      "end_line": 988,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 85)",
        "(line 982,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 994,
      "end_line": 1002,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 85)",
        "(line 996,col 9)-(line 1000,col 9)",
        "(line 1001,col 9)-(line 1001,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1008,
      "end_line": 1017,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square of m.\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 85)",
        "(line 1010,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1024,
      "end_line": 1032,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 85)",
        "(line 1026,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1031,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1039,
      "end_line": 1047,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 85)",
        "(line 1041,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1046,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1054,
      "end_line": 1062,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 74)",
        "(line 1056,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1061,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1069,
      "end_line": 1077,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1070,col 9)-(line 1070,col 85)",
        "(line 1071,col 9)-(line 1075,col 9)",
        "(line 1076,col 9)-(line 1076,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1083,
      "end_line": 1093,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 67)",
        "(line 1085,col 9)-(line 1091,col 9)",
        "(line 1092,col 9)-(line 1092,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1100,
      "end_line": 1114,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1124,
      "end_line": 1129,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.ones(int, int)",
      "begin_line": 1136,
      "end_line": 1142,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 46)",
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1141,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.eye(int, int)",
      "begin_line": 1150,
      "end_line": 1158,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0 values out of diagonal, and 1 values on\n     * the diagonal.\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 46)",
        "(line 1152,col 9)-(line 1156,col 9)",
        "(line 1157,col 9)-(line 1157,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1165,
      "end_line": 1167,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of zero values.\n     ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1175,
      "end_line": 1185,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 45)",
        "(line 1177,col 9)-(line 1177,col 48)",
        "(line 1178,col 9)-(line 1178,col 56)",
        "(line 1179,col 9)-(line 1183,col 9)",
        "(line 1184,col 9)-(line 1184,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1193,
      "end_line": 1202,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1194,col 58)",
        "(line 1195,col 9)-(line 1195,col 49)",
        "(line 1196,col 9)-(line 1196,col 29)",
        "(line 1197,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1201,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1208,
      "end_line": 1219,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1209,col 39)",
        "(line 1210,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1225,
      "end_line": 1236,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 38)",
        "(line 1227,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1235,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(double[])",
      "begin_line": 1242,
      "end_line": 1250,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 39)",
        "(line 1244,col 9)-(line 1248,col 9)",
        "(line 1249,col 9)-(line 1249,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(double[])",
      "begin_line": 1256,
      "end_line": 1264,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 38)",
        "(line 1258,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse(int[])",
      "begin_line": 1270,
      "end_line": 1276,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 54)",
        "(line 1272,col 9)-(line 1274,col 9)",
        "(line 1275,col 9)-(line 1275,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.reverse(int[])",
      "begin_line": 1282,
      "end_line": 1288,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1283,col 9)-(line 1283,col 54)",
        "(line 1284,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1287,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(int)",
      "begin_line": 1294,
      "end_line": 1300,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 48)",
        "(line 1296,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1299,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1307,
      "end_line": 1315,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1308,col 9)-(line 1308,col 55)",
        "(line 1309,col 9)-(line 1313,col 9)",
        "(line 1314,col 9)-(line 1314,col 50)"
      ]
    }
  ]
}
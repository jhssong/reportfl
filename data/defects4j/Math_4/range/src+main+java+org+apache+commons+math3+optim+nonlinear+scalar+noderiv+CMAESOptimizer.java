{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 79,
      "end_line": 1314,
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
      "end_line": 512,
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
        "(line 386,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 524,
      "end_line": 543,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 45)",
        "(line 531,col 9)-(line 540,col 9)",
        "(line 542,col 9)-(line 542,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters()",
      "begin_line": 548,
      "end_line": 563,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 46)",
        "(line 550,col 9)-(line 550,col 44)",
        "(line 551,col 9)-(line 551,col 44)",
        "(line 553,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 570,
      "end_line": 634,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 573,col 9)",
        "(line 575,col 9)-(line 575,col 66)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 79)",
        "(line 580,col 9)-(line 580,col 29)",
        "(line 583,col 9)-(line 583,col 40)",
        "(line 584,col 9)-(line 584,col 40)",
        "(line 585,col 9)-(line 585,col 27)",
        "(line 586,col 9)-(line 586,col 31)",
        "(line 589,col 9)-(line 589,col 24)",
        "(line 590,col 9)-(line 590,col 36)",
        "(line 591,col 9)-(line 591,col 79)",
        "(line 592,col 9)-(line 592,col 24)",
        "(line 593,col 9)-(line 593,col 25)",
        "(line 594,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 51)",
        "(line 600,col 9)-(line 600,col 36)",
        "(line 603,col 9)-(line 604,col 56)",
        "(line 605,col 9)-(line 605,col 52)",
        "(line 606,col 9)-(line 609,col 66)",
        "(line 610,col 9)-(line 610,col 68)",
        "(line 611,col 9)-(line 612,col 71)",
        "(line 613,col 9)-(line 613,col 62)",
        "(line 614,col 9)-(line 614,col 72)",
        "(line 615,col 9)-(line 616,col 91)",
        "(line 618,col 9)-(line 618,col 58)",
        "(line 619,col 9)-(line 619,col 50)",
        "(line 620,col 9)-(line 620,col 30)",
        "(line 621,col 9)-(line 621,col 33)",
        "(line 622,col 9)-(line 622,col 33)",
        "(line 623,col 9)-(line 623,col 39)",
        "(line 625,col 9)-(line 625,col 38)",
        "(line 626,col 9)-(line 626,col 31)",
        "(line 627,col 9)-(line 627,col 63)",
        "(line 628,col 9)-(line 628,col 64)",
        "(line 629,col 9)-(line 629,col 72)",
        "(line 630,col 9)-(line 630,col 49)",
        "(line 631,col 9)-(line 633,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 644,
      "end_line": 657,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 647,col 59)",
        "(line 648,col 9)-(line 648,col 39)",
        "(line 649,col 9)-(line 651,col 54)",
        "(line 652,col 9)-(line 652,col 39)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 666,
      "end_line": 684,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 60)",
        "(line 670,col 9)-(line 670,col 43)",
        "(line 671,col 9)-(line 674,col 45)",
        "(line 675,col 9)-(line 675,col 28)",
        "(line 676,col 9)-(line 683,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 697,
      "end_line": 756,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 27)",
        "(line 701,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateBD(double)",
      "begin_line": 763,
      "end_line": 792,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push(double[], double)",
      "begin_line": 800,
      "end_line": 805,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals History queue.\n     * @param val Current best fitness value.\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 813,
      "end_line": 824,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 66)",
        "(line 815,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 25)",
        "(line 819,col 9)-(line 819,col 54)",
        "(line 820,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 830,
      "end_line": 871,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 832,
      "end_line": 832,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 840,
      "end_line": 843,
      "comment": "\n         * @param value Value to compare.\n         * @param index Index into sorted array.\n         ",
      "child_ranges": [
        "(line 841,col 13)-(line 841,col 31)",
        "(line 842,col 13)-(line 842,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex)",
      "begin_line": 846,
      "end_line": 848,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 847,col 13)-(line 847,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 851,
      "end_line": 863,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 854,col 13)-(line 856,col 13)",
        "(line 858,col 13)-(line 860,col 13)",
        "(line 862,col 13)-(line 862,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 866,
      "end_line": 870,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 868,col 13)-(line 868,col 55)",
        "(line 869,col 13)-(line 869,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 878,
      "end_line": 970,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 885,
      "end_line": 885,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 889,
      "end_line": 892,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 890,col 13)-(line 890,col 27)",
        "(line 891,col 13)-(line 891,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 898,
      "end_line": 908,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 899,col 13)-(line 899,col 25)",
        "(line 900,col 13)-(line 906,col 13)",
        "(line 907,col 13)-(line 907,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 914,
      "end_line": 927,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 68)",
        "(line 916,col 13)-(line 916,col 68)",
        "(line 918,col 13)-(line 925,col 13)",
        "(line 926,col 13)-(line 926,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 933,col 13)-(line 933,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 940,
      "end_line": 955,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired (i.e. all in bounds) objective variables.\n         ",
      "child_ranges": [
        "(line 941,col 13)-(line 941,col 68)",
        "(line 942,col 13)-(line 942,col 68)",
        "(line 944,col 13)-(line 944,col 59)",
        "(line 945,col 13)-(line 953,col 13)",
        "(line 954,col 13)-(line 954,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 962,
      "end_line": 969,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 963,col 13)-(line 963,col 31)",
        "(line 964,col 13)-(line 967,col 13)",
        "(line 968,col 13)-(line 968,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 978,
      "end_line": 986,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 85)",
        "(line 980,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 985,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 992,
      "end_line": 1000,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 85)",
        "(line 994,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 999,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1006,
      "end_line": 1015,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square of m.\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 85)",
        "(line 1008,col 9)-(line 1013,col 9)",
        "(line 1014,col 9)-(line 1014,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1022,
      "end_line": 1030,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 85)",
        "(line 1024,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1029,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1037,
      "end_line": 1045,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 85)",
        "(line 1039,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1044,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1052,
      "end_line": 1060,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 74)",
        "(line 1054,col 9)-(line 1058,col 9)",
        "(line 1059,col 9)-(line 1059,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1067,
      "end_line": 1075,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 85)",
        "(line 1069,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1081,
      "end_line": 1091,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 67)",
        "(line 1083,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1098,
      "end_line": 1112,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1122,
      "end_line": 1127,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.ones(int, int)",
      "begin_line": 1134,
      "end_line": 1140,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 46)",
        "(line 1136,col 9)-(line 1138,col 9)",
        "(line 1139,col 9)-(line 1139,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.eye(int, int)",
      "begin_line": 1148,
      "end_line": 1156,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0 values out of diagonal, and 1 values on\n     * the diagonal.\n     ",
      "child_ranges": [
        "(line 1149,col 9)-(line 1149,col 46)",
        "(line 1150,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1155,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1163,
      "end_line": 1165,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of zero values.\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1173,
      "end_line": 1183,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 45)",
        "(line 1175,col 9)-(line 1175,col 48)",
        "(line 1176,col 9)-(line 1176,col 56)",
        "(line 1177,col 9)-(line 1181,col 9)",
        "(line 1182,col 9)-(line 1182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1191,
      "end_line": 1200,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 58)",
        "(line 1193,col 9)-(line 1193,col 49)",
        "(line 1194,col 9)-(line 1194,col 29)",
        "(line 1195,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1206,
      "end_line": 1217,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1207,col 39)",
        "(line 1208,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1223,
      "end_line": 1234,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 38)",
        "(line 1225,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(double[])",
      "begin_line": 1240,
      "end_line": 1248,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1241,col 39)",
        "(line 1242,col 9)-(line 1246,col 9)",
        "(line 1247,col 9)-(line 1247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(double[])",
      "begin_line": 1254,
      "end_line": 1262,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 38)",
        "(line 1256,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1261,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse(int[])",
      "begin_line": 1268,
      "end_line": 1274,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1269,col 54)",
        "(line 1270,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.reverse(int[])",
      "begin_line": 1280,
      "end_line": 1286,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 54)",
        "(line 1282,col 9)-(line 1284,col 9)",
        "(line 1285,col 9)-(line 1285,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(int)",
      "begin_line": 1292,
      "end_line": 1298,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1293,col 48)",
        "(line 1294,col 9)-(line 1296,col 9)",
        "(line 1297,col 9)-(line 1297,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1305,
      "end_line": 1313,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 55)",
        "(line 1307,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1312,col 50)"
      ]
    }
  ]
}
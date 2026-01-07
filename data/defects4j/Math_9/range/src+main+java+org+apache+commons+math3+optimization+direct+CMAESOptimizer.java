{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 85,
      "end_line": 1446,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHECKFEASABLECOUNT"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Default value for {@link #checkFeasableCount}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPFITNESS"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Default value for {@link #stopFitness}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ISACTIVECMA"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Default value for {@link #isActiveCMA}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXITERATIONS"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Default value for {@link #maxIterations}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAGONALONLY"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Default value for {@link #diagonalOnly}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANDOMGENERATOR"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Default value for {@link #random}. "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " population size"
    },
    {
      "type": "field",
      "varNames": [
        "isActiveCMA"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Covariance update mechanism, default is active CMA. isActiveCMA \u003d true\n     * turns on \"active CMA\" with a negative update of the covariance matrix and\n     * checks for positive definiteness. OPTS.CMA.active \u003d 2 does not check for\n     * pos. def. and is numerically faster. Active CMA usually speeds up the\n     * adaptation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "checkFeasableCount"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * @see Sigma\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopFitness"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Default constructor, uses default parameters\n     *\n     * @deprecated As of version 3.1: Parameter {@code lambda} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize} (whereas in the current code it is set to an undocumented value).\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n     * @param lambda Population size.\n     * @deprecated As of version 3.1: Parameter {@code lambda} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize} (whereas in the current code it is set to an undocumented value)..\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 250,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[])",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial standard deviations to sample new points\n     * around the initial guess.\n     * @deprecated As of version 3.1: Parameters {@code lambda} and {@code inputSigma} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize}.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean)",
      "begin_line": 284,
      "end_line": 292,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial standard deviations to sample new points\n     * around the initial guess.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 313,
      "end_line": 329,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial standard deviations to sample new points\n     * around the initial guess.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     * @deprecated As of version 3.1: Parameters {@code lambda} and {@code inputSigma} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize}.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 23)",
        "(line 320,col 9)-(line 320,col 29)",
        "(line 321,col 9)-(line 321,col 84)",
        "(line 322,col 9)-(line 322,col 43)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 39)",
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 53)",
        "(line 327,col 9)-(line 327,col 29)",
        "(line 328,col 9)-(line 328,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 346,
      "end_line": 362,
      "comment": "\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 23)",
        "(line 355,col 9)-(line 355,col 43)",
        "(line 356,col 9)-(line 356,col 39)",
        "(line 357,col 9)-(line 357,col 39)",
        "(line 358,col 9)-(line 358,col 41)",
        "(line 359,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 360,col 29)",
        "(line 361,col 9)-(line 361,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sigma",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 404,
      "end_line": 430,
      "comment": "\n     * Input sigma values.\n     * They define the initial coordinate-wise standard deviations for\n     * sampling new search points around the initial guess.\n     * It is suggested to set them to the estimated distance from the\n     * initial to the desired optimum.\n     * Small values induce the search to be more local (and very small\n     * values are more likely to find a local optimum close to the initial\n     * guess).\n     * Too small values might however lead to early termination.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Sigma values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.Sigma.Sigma(double[])",
      "begin_line": 413,
      "end_line": 422,
      "comment": "\n         * @param s Sigma values.\n         * @throws NotPositiveException if any of the array entries is smaller\n         * than zero.\n         ",
      "child_ranges": [
        "(line 415,col 13)-(line 419,col 13)",
        "(line 421,col 13)-(line 421,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.Sigma.getSigma()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n         * @return the sigma values.\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PopulationSize",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 443,
      "end_line": 465,
      "comment": "\n     * Population size.\n     * The number of offspring is the primary strategy parameter.\n     * In the absence of better clues, a good default could be an\n     * integer close to {@code 4 + 3 ln(n)}, where {@code n} is the\n     * number of optimized parameters.\n     * Increasing the population size improves global search properties\n     * at the expense of speed (which in general decreases at most\n     * linearly with increasing population size).\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": " Population size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.PopulationSize.PopulationSize(int)",
      "begin_line": 451,
      "end_line": 457,
      "comment": "\n         * @param size Population size.\n         * @throws NotStrictlyPositiveException if {@code size \u003c\u003d 0}.\n         ",
      "child_ranges": [
        "(line 453,col 13)-(line 455,col 13)",
        "(line 456,col 13)-(line 456,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.PopulationSize.getPopulationSize()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n         * @return the population size.\n         ",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 482,
      "end_line": 492,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 39)",
        "(line 491,col 9)-(line 491,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 495,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 26)",
        "(line 499,col 9)-(line 499,col 61)",
        "(line 500,col 9)-(line 500,col 61)",
        "(line 501,col 9)-(line 501,col 47)",
        "(line 503,col 9)-(line 503,col 33)",
        "(line 504,col 9)-(line 504,col 29)",
        "(line 505,col 9)-(line 505,col 23)",
        "(line 506,col 9)-(line 506,col 47)",
        "(line 507,col 9)-(line 507,col 40)",
        "(line 508,col 9)-(line 509,col 53)",
        "(line 510,col 9)-(line 510,col 41)",
        "(line 514,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 654,
      "end_line": 667,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 672,
      "end_line": 691,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 46)",
        "(line 674,col 9)-(line 674,col 44)",
        "(line 675,col 9)-(line 675,col 44)",
        "(line 677,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 698,
      "end_line": 766,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 66)",
        "(line 706,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 79)",
        "(line 712,col 9)-(line 712,col 29)",
        "(line 715,col 9)-(line 715,col 40)",
        "(line 716,col 9)-(line 716,col 40)",
        "(line 717,col 9)-(line 717,col 27)",
        "(line 718,col 9)-(line 718,col 31)",
        "(line 721,col 9)-(line 721,col 24)",
        "(line 722,col 9)-(line 722,col 36)",
        "(line 723,col 9)-(line 723,col 79)",
        "(line 724,col 9)-(line 724,col 24)",
        "(line 725,col 9)-(line 725,col 25)",
        "(line 726,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 731,col 51)",
        "(line 732,col 9)-(line 732,col 36)",
        "(line 735,col 9)-(line 736,col 56)",
        "(line 737,col 9)-(line 737,col 52)",
        "(line 738,col 9)-(line 741,col 66)",
        "(line 742,col 9)-(line 742,col 68)",
        "(line 743,col 9)-(line 744,col 71)",
        "(line 745,col 9)-(line 745,col 62)",
        "(line 746,col 9)-(line 746,col 72)",
        "(line 747,col 9)-(line 748,col 91)",
        "(line 750,col 9)-(line 750,col 58)",
        "(line 751,col 9)-(line 751,col 50)",
        "(line 752,col 9)-(line 752,col 30)",
        "(line 753,col 9)-(line 753,col 33)",
        "(line 754,col 9)-(line 754,col 33)",
        "(line 755,col 9)-(line 755,col 39)",
        "(line 757,col 9)-(line 757,col 38)",
        "(line 758,col 9)-(line 758,col 31)",
        "(line 759,col 9)-(line 759,col 63)",
        "(line 760,col 9)-(line 760,col 64)",
        "(line 761,col 9)-(line 761,col 72)",
        "(line 762,col 9)-(line 762,col 49)",
        "(line 763,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 776,
      "end_line": 789,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 779,col 59)",
        "(line 780,col 9)-(line 780,col 39)",
        "(line 781,col 9)-(line 783,col 54)",
        "(line 784,col 9)-(line 784,col 39)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 798,
      "end_line": 816,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 60)",
        "(line 802,col 9)-(line 802,col 43)",
        "(line 803,col 9)-(line 806,col 45)",
        "(line 807,col 9)-(line 807,col 28)",
        "(line 808,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 829,
      "end_line": 888,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 27)",
        "(line 833,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 895,
      "end_line": 924,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 923,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 932,
      "end_line": 937,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals History queue.\n     * @param val Current best fitness value.\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 945,
      "end_line": 956,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 66)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 25)",
        "(line 951,col 9)-(line 951,col 54)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 962,
      "end_line": 1003,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 972,
      "end_line": 975,
      "comment": "\n         * @param value Value to compare.\n         * @param index Index into sorted array.\n         ",
      "child_ranges": [
        "(line 973,col 13)-(line 973,col 31)",
        "(line 974,col 13)-(line 974,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 978,
      "end_line": 980,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 979,col 13)-(line 979,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 983,
      "end_line": 995,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 986,col 13)-(line 988,col 13)",
        "(line 990,col 13)-(line 992,col 13)",
        "(line 994,col 13)-(line 994,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 998,
      "end_line": 1002,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1000,col 13)-(line 1000,col 55)",
        "(line 1001,col 13)-(line 1001,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1010,
      "end_line": 1102,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 1012,
      "end_line": 1012,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 1017,
      "end_line": 1017,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 1021,
      "end_line": 1024,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 1022,col 13)-(line 1022,col 27)",
        "(line 1023,col 13)-(line 1023,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 1030,
      "end_line": 1040,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 1031,col 13)-(line 1031,col 25)",
        "(line 1032,col 13)-(line 1038,col 13)",
        "(line 1039,col 13)-(line 1039,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 1046,
      "end_line": 1059,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 1047,col 13)-(line 1047,col 68)",
        "(line 1048,col 13)-(line 1048,col 68)",
        "(line 1050,col 13)-(line 1057,col 13)",
        "(line 1058,col 13)-(line 1058,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 1065,col 13)-(line 1065,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 1072,
      "end_line": 1087,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired (i.e. all in bounds) objective variables.\n         ",
      "child_ranges": [
        "(line 1073,col 13)-(line 1073,col 68)",
        "(line 1074,col 13)-(line 1074,col 68)",
        "(line 1076,col 13)-(line 1076,col 59)",
        "(line 1077,col 13)-(line 1085,col 13)",
        "(line 1086,col 13)-(line 1086,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 1094,
      "end_line": 1101,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 1095,col 13)-(line 1095,col 31)",
        "(line 1096,col 13)-(line 1099,col 13)",
        "(line 1100,col 13)-(line 1100,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1110,
      "end_line": 1118,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 85)",
        "(line 1112,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1117,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1124,
      "end_line": 1132,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 85)",
        "(line 1126,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1131,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1138,
      "end_line": 1147,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square of m.\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 85)",
        "(line 1140,col 9)-(line 1145,col 9)",
        "(line 1146,col 9)-(line 1146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1154,
      "end_line": 1162,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1155,col 85)",
        "(line 1156,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1161,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1169,
      "end_line": 1177,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 85)",
        "(line 1171,col 9)-(line 1175,col 9)",
        "(line 1176,col 9)-(line 1176,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1184,
      "end_line": 1192,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 74)",
        "(line 1186,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1199,
      "end_line": 1207,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 85)",
        "(line 1201,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1206,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1213,
      "end_line": 1223,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 67)",
        "(line 1215,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1222,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1230,
      "end_line": 1244,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1254,
      "end_line": 1259,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1266,
      "end_line": 1272,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 46)",
        "(line 1268,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1271,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1280,
      "end_line": 1288,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0 values out of diagonal, and 1 values on\n     * the diagonal.\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 46)",
        "(line 1282,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1287,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1295,
      "end_line": 1297,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of zero values.\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1305,
      "end_line": 1315,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 45)",
        "(line 1307,col 9)-(line 1307,col 48)",
        "(line 1308,col 9)-(line 1308,col 56)",
        "(line 1309,col 9)-(line 1313,col 9)",
        "(line 1314,col 9)-(line 1314,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1323,
      "end_line": 1332,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1324,col 9)-(line 1324,col 58)",
        "(line 1325,col 9)-(line 1325,col 49)",
        "(line 1326,col 9)-(line 1326,col 29)",
        "(line 1327,col 9)-(line 1330,col 9)",
        "(line 1331,col 9)-(line 1331,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1338,
      "end_line": 1349,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 39)",
        "(line 1340,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1355,
      "end_line": 1366,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1356,col 38)",
        "(line 1357,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1365,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1372,
      "end_line": 1380,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 39)",
        "(line 1374,col 9)-(line 1378,col 9)",
        "(line 1379,col 9)-(line 1379,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1386,
      "end_line": 1394,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 38)",
        "(line 1388,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1393,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1400,
      "end_line": 1406,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1401,col 9)-(line 1401,col 54)",
        "(line 1402,col 9)-(line 1404,col 9)",
        "(line 1405,col 9)-(line 1405,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1412,
      "end_line": 1418,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1413,col 9)-(line 1413,col 54)",
        "(line 1414,col 9)-(line 1416,col 9)",
        "(line 1417,col 9)-(line 1417,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1424,
      "end_line": 1430,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 48)",
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1429,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1437,
      "end_line": 1445,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 55)",
        "(line 1439,col 9)-(line 1443,col 9)",
        "(line 1444,col 9)-(line 1444,col 50)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 84,
      "end_line": 1444,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHECKFEASABLECOUNT"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Default value for {@link #checkFeasableCount}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPFITNESS"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Default value for {@link #stopFitness}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ISACTIVECMA"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Default value for {@link #isActiveCMA}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXITERATIONS"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Default value for {@link #maxIterations}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAGONALONLY"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Default value for {@link #diagonalOnly}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANDOMGENERATOR"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Default value for {@link #random}. "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " population size"
    },
    {
      "type": "field",
      "varNames": [
        "isActiveCMA"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Covariance update mechanism, default is active CMA. isActiveCMA \u003d true\n     * turns on \"active CMA\" with a negative update of the covariance matrix and\n     * checks for positive definiteness. OPTS.CMA.active \u003d 2 does not check for\n     * pos. def. and is numerically faster. Active CMA usually speeds up the\n     * adaptation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "checkFeasableCount"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * @see Sigma\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopFitness"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Default constructor, uses default parameters\n     *\n     * @deprecated As of version 3.1: Parameter {@code lambda} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize} (whereas in the current code it is set to an undocumented value).\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 244,
      "end_line": 249,
      "comment": "\n     * @param lambda Population size.\n     * @deprecated As of version 3.1: Parameter {@code lambda} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize} (whereas in the current code it is set to an undocumented value)..\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[])",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial standard deviations to sample new points\n     * around the initial guess.\n     * @deprecated As of version 3.1: Parameters {@code lambda} and {@code inputSigma} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize}.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean)",
      "begin_line": 282,
      "end_line": 290,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial standard deviations to sample new points\n     * around the initial guess.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 311,
      "end_line": 327,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial standard deviations to sample new points\n     * around the initial guess.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     * @deprecated As of version 3.1: Parameters {@code lambda} and {@code inputSigma} must be\n     * passed with the call to {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])\n     * optimize}.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 23)",
        "(line 318,col 9)-(line 318,col 29)",
        "(line 319,col 9)-(line 319,col 84)",
        "(line 320,col 9)-(line 320,col 43)",
        "(line 321,col 9)-(line 321,col 39)",
        "(line 322,col 9)-(line 322,col 39)",
        "(line 323,col 9)-(line 323,col 41)",
        "(line 324,col 9)-(line 324,col 53)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 326,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 344,
      "end_line": 360,
      "comment": "\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 23)",
        "(line 353,col 9)-(line 353,col 43)",
        "(line 354,col 9)-(line 354,col 39)",
        "(line 355,col 9)-(line 355,col 39)",
        "(line 356,col 9)-(line 356,col 41)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 358,col 9)-(line 358,col 29)",
        "(line 359,col 9)-(line 359,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sigma",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 401,
      "end_line": 427,
      "comment": "\n     * Input sigma values.\n     * They define the initial coordinate-wise standard deviations for\n     * sampling new search points around the initial guess.\n     * It is suggested to set them to the estimated distance from the\n     * initial to the desired optimum.\n     * Small values induce the search to be more local (and very small\n     * values are more likely to find a local optimum close to the initial\n     * guess).\n     * Too small values might however lead to early termination.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 403,
      "end_line": 403,
      "comment": " Sigma values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.Sigma.Sigma(double[])",
      "begin_line": 410,
      "end_line": 419,
      "comment": "\n         * @param s Sigma values.\n         * @throws NotPositiveException if any of the array entries is smaller\n         * than zero.\n         ",
      "child_ranges": [
        "(line 412,col 13)-(line 416,col 13)",
        "(line 418,col 13)-(line 418,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.Sigma.getSigma()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n         * @return the sigma values.\n         ",
      "child_ranges": [
        "(line 425,col 13)-(line 425,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PopulationSize",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 439,
      "end_line": 461,
      "comment": "\n     * Population size.\n     * The number of offspring is the primary strategy parameter.\n     * In the absence of better clues, a good default could be an\n     * integer close to {@code 4 + 3 ln(n)}, where {@code n} is the\n     * number of optimized parameters.\n     * Increasing the population size improves global search properties\n     * at the expense of speed (which in general decreases at most\n     * linearly with increasing population size).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Population size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.PopulationSize.PopulationSize(int)",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n         * @param size Population size.\n         * @throws NotStrictlyPositiveException if {@code size \u003c\u003d 0}.\n         ",
      "child_ranges": [
        "(line 449,col 13)-(line 451,col 13)",
        "(line 452,col 13)-(line 452,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.PopulationSize.getPopulationSize()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n         * @return the population size.\n         ",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 478,
      "end_line": 488,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 39)",
        "(line 487,col 9)-(line 487,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 491,
      "end_line": 638,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 26)",
        "(line 495,col 9)-(line 495,col 61)",
        "(line 496,col 9)-(line 496,col 61)",
        "(line 497,col 9)-(line 497,col 47)",
        "(line 499,col 9)-(line 499,col 33)",
        "(line 500,col 9)-(line 500,col 29)",
        "(line 501,col 9)-(line 501,col 23)",
        "(line 502,col 9)-(line 502,col 47)",
        "(line 503,col 9)-(line 503,col 40)",
        "(line 504,col 9)-(line 505,col 53)",
        "(line 506,col 9)-(line 506,col 41)",
        "(line 510,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 650,
      "end_line": 663,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Sigma}\u003c/li\u003e\n     *  \u003cli\u003e{@link PopulationSize}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 662,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 668,
      "end_line": 687,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 46)",
        "(line 670,col 9)-(line 670,col 44)",
        "(line 671,col 9)-(line 671,col 44)",
        "(line 673,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 694,
      "end_line": 762,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 701,col 66)",
        "(line 702,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 79)",
        "(line 708,col 9)-(line 708,col 29)",
        "(line 711,col 9)-(line 711,col 40)",
        "(line 712,col 9)-(line 712,col 40)",
        "(line 713,col 9)-(line 713,col 27)",
        "(line 714,col 9)-(line 714,col 31)",
        "(line 717,col 9)-(line 717,col 24)",
        "(line 718,col 9)-(line 718,col 36)",
        "(line 719,col 9)-(line 719,col 79)",
        "(line 720,col 9)-(line 720,col 24)",
        "(line 721,col 9)-(line 721,col 25)",
        "(line 722,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 51)",
        "(line 728,col 9)-(line 728,col 36)",
        "(line 731,col 9)-(line 732,col 56)",
        "(line 733,col 9)-(line 733,col 52)",
        "(line 734,col 9)-(line 737,col 66)",
        "(line 738,col 9)-(line 738,col 68)",
        "(line 739,col 9)-(line 740,col 71)",
        "(line 741,col 9)-(line 741,col 62)",
        "(line 742,col 9)-(line 742,col 72)",
        "(line 743,col 9)-(line 744,col 91)",
        "(line 746,col 9)-(line 746,col 58)",
        "(line 747,col 9)-(line 747,col 50)",
        "(line 748,col 9)-(line 748,col 30)",
        "(line 749,col 9)-(line 749,col 33)",
        "(line 750,col 9)-(line 750,col 33)",
        "(line 751,col 9)-(line 751,col 39)",
        "(line 753,col 9)-(line 753,col 38)",
        "(line 754,col 9)-(line 754,col 31)",
        "(line 755,col 9)-(line 755,col 63)",
        "(line 756,col 9)-(line 756,col 64)",
        "(line 757,col 9)-(line 757,col 72)",
        "(line 758,col 9)-(line 758,col 49)",
        "(line 759,col 9)-(line 761,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 772,
      "end_line": 785,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 775,col 59)",
        "(line 776,col 9)-(line 776,col 39)",
        "(line 777,col 9)-(line 779,col 54)",
        "(line 780,col 9)-(line 780,col 39)",
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 795,
      "end_line": 814,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 60)",
        "(line 800,col 9)-(line 800,col 43)",
        "(line 801,col 9)-(line 804,col 45)",
        "(line 805,col 9)-(line 805,col 28)",
        "(line 806,col 9)-(line 813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 827,
      "end_line": 886,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 27)",
        "(line 831,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 893,
      "end_line": 922,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 921,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 930,
      "end_line": 935,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals History queue.\n     * @param val Current best fitness value.\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 934,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 943,
      "end_line": 954,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 66)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 948,col 25)",
        "(line 949,col 9)-(line 949,col 54)",
        "(line 950,col 9)-(line 952,col 9)",
        "(line 953,col 9)-(line 953,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 960,
      "end_line": 1001,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 970,
      "end_line": 973,
      "comment": "\n         * @param value Value to compare.\n         * @param index Index into sorted array.\n         ",
      "child_ranges": [
        "(line 971,col 13)-(line 971,col 31)",
        "(line 972,col 13)-(line 972,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 976,
      "end_line": 978,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 977,col 13)-(line 977,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 981,
      "end_line": 993,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 984,col 13)-(line 986,col 13)",
        "(line 988,col 13)-(line 990,col 13)",
        "(line 992,col 13)-(line 992,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 996,
      "end_line": 1000,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 998,col 13)-(line 998,col 55)",
        "(line 999,col 13)-(line 999,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1008,
      "end_line": 1100,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 1010,
      "end_line": 1010,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 1015,
      "end_line": 1015,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 1019,
      "end_line": 1022,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 1020,col 13)-(line 1020,col 27)",
        "(line 1021,col 13)-(line 1021,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 1028,
      "end_line": 1038,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 1029,col 13)-(line 1029,col 25)",
        "(line 1030,col 13)-(line 1036,col 13)",
        "(line 1037,col 13)-(line 1037,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 1044,
      "end_line": 1057,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 1045,col 13)-(line 1045,col 68)",
        "(line 1046,col 13)-(line 1046,col 68)",
        "(line 1048,col 13)-(line 1055,col 13)",
        "(line 1056,col 13)-(line 1056,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 1062,
      "end_line": 1064,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 1063,col 13)-(line 1063,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 1070,
      "end_line": 1085,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired (i.e. all in bounds) objective variables.\n         ",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 68)",
        "(line 1072,col 13)-(line 1072,col 68)",
        "(line 1074,col 13)-(line 1074,col 59)",
        "(line 1075,col 13)-(line 1083,col 13)",
        "(line 1084,col 13)-(line 1084,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 1092,
      "end_line": 1099,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 1093,col 13)-(line 1093,col 31)",
        "(line 1094,col 13)-(line 1097,col 13)",
        "(line 1098,col 13)-(line 1098,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1108,
      "end_line": 1116,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 85)",
        "(line 1110,col 9)-(line 1114,col 9)",
        "(line 1115,col 9)-(line 1115,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1122,
      "end_line": 1130,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1123,col 85)",
        "(line 1124,col 9)-(line 1128,col 9)",
        "(line 1129,col 9)-(line 1129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1136,
      "end_line": 1145,
      "comment": "\n     * @param m Input matrix.\n     * @return Matrix representing the element-wise square of m.\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 85)",
        "(line 1138,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1144,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1152,
      "end_line": 1160,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1153,col 85)",
        "(line 1154,col 9)-(line 1158,col 9)",
        "(line 1159,col 9)-(line 1159,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1167,
      "end_line": 1175,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 85)",
        "(line 1169,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1174,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1182,
      "end_line": 1190,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1183,col 74)",
        "(line 1184,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1189,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1197,
      "end_line": 1205,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 85)",
        "(line 1199,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1211,
      "end_line": 1221,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 67)",
        "(line 1213,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1228,
      "end_line": 1242,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1252,
      "end_line": 1257,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1264,
      "end_line": 1270,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1265,col 46)",
        "(line 1266,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1269,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1278,
      "end_line": 1286,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0 values out of diagonal, and 1 values on\n     * the diagonal.\n     ",
      "child_ranges": [
        "(line 1279,col 9)-(line 1279,col 46)",
        "(line 1280,col 9)-(line 1284,col 9)",
        "(line 1285,col 9)-(line 1285,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1293,
      "end_line": 1295,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of zero values.\n     ",
      "child_ranges": [
        "(line 1294,col 9)-(line 1294,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1303,
      "end_line": 1313,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1304,col 9)-(line 1304,col 45)",
        "(line 1305,col 9)-(line 1305,col 48)",
        "(line 1306,col 9)-(line 1306,col 56)",
        "(line 1307,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1312,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1321,
      "end_line": 1330,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1322,col 58)",
        "(line 1323,col 9)-(line 1323,col 49)",
        "(line 1324,col 9)-(line 1324,col 29)",
        "(line 1325,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1329,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1336,
      "end_line": 1347,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1337,col 39)",
        "(line 1338,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1353,
      "end_line": 1364,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1354,col 9)-(line 1354,col 38)",
        "(line 1355,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1363,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1370,
      "end_line": 1378,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1371,col 39)",
        "(line 1372,col 9)-(line 1376,col 9)",
        "(line 1377,col 9)-(line 1377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1384,
      "end_line": 1392,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1385,col 38)",
        "(line 1386,col 9)-(line 1390,col 9)",
        "(line 1391,col 9)-(line 1391,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1398,
      "end_line": 1404,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 54)",
        "(line 1400,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1403,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1410,
      "end_line": 1416,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 54)",
        "(line 1412,col 9)-(line 1414,col 9)",
        "(line 1415,col 9)-(line 1415,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1422,
      "end_line": 1428,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1423,col 48)",
        "(line 1424,col 9)-(line 1426,col 9)",
        "(line 1427,col 9)-(line 1427,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1435,
      "end_line": 1443,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 55)",
        "(line 1437,col 9)-(line 1441,col 9)",
        "(line 1442,col 9)-(line 1442,col 50)"
      ]
    }
  ]
}
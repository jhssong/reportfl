{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 83,
      "end_line": 1350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHECKFEASABLECOUNT"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Default value for {@link #checkFeasableCount}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPFITNESS"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Default value for {@link #stopFitness}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ISACTIVECMA"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Default value for {@link #isActiveCMA}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXITERATIONS"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Default value for {@link #maxIterations}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAGONALONLY"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Default value for {@link #diagonalOnly}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANDOMGENERATOR"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Default value for {@link #random}. "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " population size"
    },
    {
      "type": "field",
      "varNames": [
        "isActiveCMA"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Covariance update mechanism, default is active CMA. isActiveCMA \u003d true\n     * turns on \"active CMA\" with a negative update of the covariance matrix and\n     * checks for positive definiteness. OPTS.CMA.active \u003d 2 does not check for\n     * pos. def. and is numerically faster. Active CMA usually speeds up the\n     * adaptation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "checkFeasableCount"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0. Only relevant if\n     * boundaries !\u003d null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundaries"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Lower and upper boundaries of the objective variables. boundaries \u003d\u003d null\n     * means no boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Individual sigma values - initial search volume. inputSigma determines\n     * the initial coordinate wise standard deviations for the search. Setting\n     * SIGMA one third of the initial search region is appropriate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopFitness"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Default constructor, uses default parameters\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * @param lambda Population size.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][])",
      "begin_line": 255,
      "end_line": 260,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param boundaries Boundaries for objective variables.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][], int, double, boolean, int, int, org.apache.commons.math.random.RandomGenerator, boolean)",
      "begin_line": 277,
      "end_line": 284,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param boundaries Boundaries for objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][], int, double, boolean, int, int, org.apache.commons.math.random.RandomGenerator, boolean, org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 302,
      "end_line": 327,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param boundaries Boundaries for objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 23)",
        "(line 308,col 9)-(line 308,col 29)",
        "(line 309,col 9)-(line 309,col 84)",
        "(line 310,col 9)-(line 319,col 9)",
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
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 358,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 26)",
        "(line 362,col 9)-(line 362,col 61)",
        "(line 363,col 9)-(line 363,col 61)",
        "(line 364,col 9)-(line 364,col 62)",
        "(line 366,col 9)-(line 366,col 33)",
        "(line 367,col 9)-(line 367,col 29)",
        "(line 368,col 9)-(line 368,col 23)",
        "(line 369,col 9)-(line 369,col 47)",
        "(line 370,col 9)-(line 370,col 40)",
        "(line 371,col 9)-(line 372,col 53)",
        "(line 373,col 9)-(line 373,col 45)",
        "(line 377,col 9)-(line 501,col 13)",
        "(line 502,col 9)-(line 502,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 508,
      "end_line": 553,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 40)",
        "(line 510,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 560,
      "end_line": 627,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 60)",
        "(line 566,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 73)",
        "(line 571,col 9)-(line 571,col 29)",
        "(line 574,col 9)-(line 574,col 40)",
        "(line 575,col 9)-(line 575,col 40)",
        "(line 576,col 9)-(line 576,col 27)",
        "(line 577,col 9)-(line 577,col 31)",
        "(line 580,col 9)-(line 580,col 24)",
        "(line 581,col 9)-(line 581,col 36)",
        "(line 582,col 9)-(line 582,col 80)",
        "(line 583,col 9)-(line 583,col 24)",
        "(line 584,col 9)-(line 584,col 25)",
        "(line 585,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 52)",
        "(line 591,col 9)-(line 591,col 36)",
        "(line 594,col 9)-(line 595,col 58)",
        "(line 596,col 9)-(line 596,col 53)",
        "(line 597,col 9)-(line 601,col 47)",
        "(line 602,col 9)-(line 602,col 69)",
        "(line 603,col 9)-(line 604,col 63)",
        "(line 605,col 9)-(line 605,col 63)",
        "(line 606,col 9)-(line 606,col 73)",
        "(line 607,col 9)-(line 608,col 81)",
        "(line 610,col 9)-(line 610,col 58)",
        "(line 612,col 9)-(line 612,col 51)",
        "(line 613,col 9)-(line 613,col 30)",
        "(line 614,col 9)-(line 614,col 33)",
        "(line 615,col 9)-(line 615,col 33)",
        "(line 616,col 9)-(line 616,col 39)",
        "(line 618,col 9)-(line 618,col 38)",
        "(line 619,col 9)-(line 619,col 31)",
        "(line 620,col 9)-(line 620,col 63)",
        "(line 621,col 9)-(line 621,col 64)",
        "(line 622,col 9)-(line 622,col 65)",
        "(line 623,col 9)-(line 623,col 49)",
        "(line 624,col 9)-(line 626,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 637,
      "end_line": 651,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 640,col 60)",
        "(line 641,col 9)-(line 641,col 39)",
        "(line 642,col 9)-(line 644,col 51)",
        "(line 645,col 9)-(line 645,col 40)",
        "(line 646,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 661,
      "end_line": 681,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 61)",
        "(line 666,col 9)-(line 666,col 44)",
        "(line 667,col 9)-(line 672,col 52)",
        "(line 673,col 9)-(line 673,col 28)",
        "(line 674,col 9)-(line 680,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, int[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 694,
      "end_line": 760,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 27)",
        "(line 697,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 767,
      "end_line": 796,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 795,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 804,
      "end_line": 809,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals History queue.\n     * @param val Current best fitness value.\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 817,
      "end_line": 828,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 60)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 25)",
        "(line 823,col 9)-(line 823,col 48)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 834,
      "end_line": 877,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 836,
      "end_line": 836,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 838,
      "end_line": 838,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 844,
      "end_line": 847,
      "comment": "\n         * @param value Value to compare.\n         * @param index Index into sorted array.\n         ",
      "child_ranges": [
        "(line 845,col 13)-(line 845,col 31)",
        "(line 846,col 13)-(line 846,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 850,
      "end_line": 852,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 13)-(line 851,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 855,
      "end_line": 868,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 858,col 13)-(line 860,col 13)",
        "(line 862,col 13)-(line 864,col 13)",
        "(line 866,col 13)-(line 866,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 871,
      "end_line": 875,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 13)-(line 873,col 55)",
        "(line 874,col 13)-(line 874,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 884,
      "end_line": 1007,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 891,
      "end_line": 891,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 895,
      "end_line": 898,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 896,col 13)-(line 896,col 29)",
        "(line 897,col 13)-(line 897,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 904,
      "end_line": 914,
      "comment": "\n         * @param x Original objective variables.\n         * @return the normalized objective variables.\n         ",
      "child_ranges": [
        "(line 905,col 13)-(line 907,col 13)",
        "(line 908,col 13)-(line 908,col 48)",
        "(line 909,col 13)-(line 912,col 13)",
        "(line 913,col 13)-(line 913,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 920,
      "end_line": 930,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the original objective variables.\n         ",
      "child_ranges": [
        "(line 921,col 13)-(line 923,col 13)",
        "(line 924,col 13)-(line 924,col 48)",
        "(line 925,col 13)-(line 928,col 13)",
        "(line 929,col 13)-(line 929,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 936,
      "end_line": 948,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 937,col 13)-(line 937,col 25)",
        "(line 938,col 13)-(line 946,col 13)",
        "(line 947,col 13)-(line 947,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 954,
      "end_line": 967,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 955,col 13)-(line 957,col 13)",
        "(line 958,col 13)-(line 965,col 13)",
        "(line 966,col 13)-(line 966,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 972,
      "end_line": 974,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 973,col 13)-(line 973,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 980,
      "end_line": 992,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 981,col 13)-(line 981,col 53)",
        "(line 982,col 13)-(line 990,col 13)",
        "(line 991,col 13)-(line 991,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 999,
      "end_line": 1006,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 1000,col 13)-(line 1000,col 31)",
        "(line 1001,col 13)-(line 1004,col 13)",
        "(line 1005,col 13)-(line 1005,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.log(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1015,
      "end_line": 1023,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 79)",
        "(line 1017,col 9)-(line 1021,col 9)",
        "(line 1022,col 9)-(line 1022,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1030,
      "end_line": 1038,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 79)",
        "(line 1032,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.square(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1044,
      "end_line": 1053,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 79)",
        "(line 1046,col 9)-(line 1051,col 9)",
        "(line 1052,col 9)-(line 1052,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1060,
      "end_line": 1068,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 79)",
        "(line 1062,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1075,
      "end_line": 1083,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 79)",
        "(line 1077,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1082,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math.linear.RealMatrix, int[])",
      "begin_line": 1090,
      "end_line": 1098,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 68)",
        "(line 1092,col 9)-(line 1096,col 9)",
        "(line 1097,col 9)-(line 1097,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1105,
      "end_line": 1113,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 79)",
        "(line 1107,col 9)-(line 1111,col 9)",
        "(line 1112,col 9)-(line 1112,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1119,
      "end_line": 1129,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 61)",
        "(line 1121,col 9)-(line 1127,col 9)",
        "(line 1128,col 9)-(line 1128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1136,
      "end_line": 1150,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math.linear.RealMatrix, int, org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1160,
      "end_line": 1164,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix 1.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1171,
      "end_line": 1177,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1172,col 9)-(line 1172,col 40)",
        "(line 1173,col 9)-(line 1175,col 9)",
        "(line 1176,col 9)-(line 1176,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1184,
      "end_line": 1192,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 40)",
        "(line 1186,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1199,
      "end_line": 1201,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math.linear.RealMatrix, int, int)",
      "begin_line": 1209,
      "end_line": 1219,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 39)",
        "(line 1211,col 9)-(line 1211,col 42)",
        "(line 1212,col 9)-(line 1212,col 50)",
        "(line 1213,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1218,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1227,
      "end_line": 1236,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1228,col 52)",
        "(line 1229,col 9)-(line 1229,col 43)",
        "(line 1230,col 9)-(line 1230,col 29)",
        "(line 1231,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1235,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1242,
      "end_line": 1253,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 39)",
        "(line 1244,col 9)-(line 1251,col 9)",
        "(line 1252,col 9)-(line 1252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1259,
      "end_line": 1270,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 38)",
        "(line 1261,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1269,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1276,
      "end_line": 1284,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 39)",
        "(line 1278,col 9)-(line 1282,col 9)",
        "(line 1283,col 9)-(line 1283,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1290,
      "end_line": 1298,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1291,col 38)",
        "(line 1292,col 9)-(line 1296,col 9)",
        "(line 1297,col 9)-(line 1297,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1304,
      "end_line": 1310,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 48)",
        "(line 1306,col 9)-(line 1308,col 9)",
        "(line 1309,col 9)-(line 1309,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1316,
      "end_line": 1322,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 48)",
        "(line 1318,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1321,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1328,
      "end_line": 1334,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 42)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1333,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1341,
      "end_line": 1349,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1342,col 9)-(line 1342,col 49)",
        "(line 1343,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 50)"
      ]
    }
  ]
}
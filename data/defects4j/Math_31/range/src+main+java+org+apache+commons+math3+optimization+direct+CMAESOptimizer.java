{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 83,
      "end_line": 1346,
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Default constructor, uses default parameters\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * @param lambda Population size.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[])",
      "begin_line": 254,
      "end_line": 258,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean)",
      "begin_line": 274,
      "end_line": 281,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 298,
      "end_line": 313,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 23)",
        "(line 304,col 9)-(line 304,col 29)",
        "(line 305,col 9)-(line 305,col 84)",
        "(line 306,col 9)-(line 306,col 43)",
        "(line 307,col 9)-(line 307,col 39)",
        "(line 308,col 9)-(line 308,col 39)",
        "(line 309,col 9)-(line 309,col 41)",
        "(line 310,col 9)-(line 310,col 53)",
        "(line 311,col 9)-(line 311,col 29)",
        "(line 312,col 9)-(line 312,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 344,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 26)",
        "(line 348,col 9)-(line 348,col 61)",
        "(line 349,col 9)-(line 349,col 61)",
        "(line 350,col 9)-(line 350,col 62)",
        "(line 352,col 9)-(line 352,col 33)",
        "(line 353,col 9)-(line 353,col 29)",
        "(line 354,col 9)-(line 354,col 23)",
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 356,col 40)",
        "(line 357,col 9)-(line 358,col 53)",
        "(line 359,col 9)-(line 359,col 41)",
        "(line 363,col 9)-(line 487,col 13)",
        "(line 488,col 9)-(line 488,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 494,
      "end_line": 549,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 496,col 44)",
        "(line 497,col 9)-(line 497,col 44)",
        "(line 500,col 9)-(line 500,col 40)",
        "(line 501,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 509,col 42)",
        "(line 510,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 556,
      "end_line": 623,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 561,col 9)-(line 561,col 60)",
        "(line 562,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 73)",
        "(line 567,col 9)-(line 567,col 29)",
        "(line 570,col 9)-(line 570,col 40)",
        "(line 571,col 9)-(line 571,col 40)",
        "(line 572,col 9)-(line 572,col 27)",
        "(line 573,col 9)-(line 573,col 31)",
        "(line 576,col 9)-(line 576,col 24)",
        "(line 577,col 9)-(line 577,col 36)",
        "(line 578,col 9)-(line 578,col 80)",
        "(line 579,col 9)-(line 579,col 24)",
        "(line 580,col 9)-(line 580,col 25)",
        "(line 581,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 52)",
        "(line 587,col 9)-(line 587,col 36)",
        "(line 590,col 9)-(line 591,col 58)",
        "(line 592,col 9)-(line 592,col 53)",
        "(line 593,col 9)-(line 597,col 47)",
        "(line 598,col 9)-(line 598,col 69)",
        "(line 599,col 9)-(line 600,col 63)",
        "(line 601,col 9)-(line 601,col 63)",
        "(line 602,col 9)-(line 602,col 73)",
        "(line 603,col 9)-(line 604,col 81)",
        "(line 606,col 9)-(line 606,col 58)",
        "(line 608,col 9)-(line 608,col 51)",
        "(line 609,col 9)-(line 609,col 30)",
        "(line 610,col 9)-(line 610,col 33)",
        "(line 611,col 9)-(line 611,col 33)",
        "(line 612,col 9)-(line 612,col 39)",
        "(line 614,col 9)-(line 614,col 38)",
        "(line 615,col 9)-(line 615,col 31)",
        "(line 616,col 9)-(line 616,col 63)",
        "(line 617,col 9)-(line 617,col 64)",
        "(line 618,col 9)-(line 618,col 65)",
        "(line 619,col 9)-(line 619,col 49)",
        "(line 620,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 633,
      "end_line": 647,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 636,col 60)",
        "(line 637,col 9)-(line 637,col 39)",
        "(line 638,col 9)-(line 640,col 51)",
        "(line 641,col 9)-(line 641,col 40)",
        "(line 642,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 657,
      "end_line": 677,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 61)",
        "(line 662,col 9)-(line 662,col 44)",
        "(line 663,col 9)-(line 668,col 52)",
        "(line 669,col 9)-(line 669,col 28)",
        "(line 670,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 690,
      "end_line": 756,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 27)",
        "(line 693,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 763,
      "end_line": 792,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(double[], double)",
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 813,
      "end_line": 824,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 60)",
        "(line 815,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 25)",
        "(line 819,col 9)-(line 819,col 48)",
        "(line 820,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 830,
      "end_line": 873,
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 846,
      "end_line": 848,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 847,col 13)-(line 847,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 851,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 854,col 13)-(line 856,col 13)",
        "(line 858,col 13)-(line 860,col 13)",
        "(line 862,col 13)-(line 862,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 867,
      "end_line": 871,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 13)-(line 869,col 55)",
        "(line 870,col 13)-(line 870,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 880,
      "end_line": 1003,
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 891,
      "end_line": 894,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 29)",
        "(line 893,col 13)-(line 893,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 900,
      "end_line": 910,
      "comment": "\n         * @param x Original objective variables.\n         * @return the normalized objective variables.\n         ",
      "child_ranges": [
        "(line 901,col 13)-(line 903,col 13)",
        "(line 904,col 13)-(line 904,col 48)",
        "(line 905,col 13)-(line 908,col 13)",
        "(line 909,col 13)-(line 909,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 916,
      "end_line": 926,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the original objective variables.\n         ",
      "child_ranges": [
        "(line 917,col 13)-(line 919,col 13)",
        "(line 920,col 13)-(line 920,col 48)",
        "(line 921,col 13)-(line 924,col 13)",
        "(line 925,col 13)-(line 925,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 932,
      "end_line": 944,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 933,col 13)-(line 933,col 25)",
        "(line 934,col 13)-(line 942,col 13)",
        "(line 943,col 13)-(line 943,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 950,
      "end_line": 963,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 951,col 13)-(line 953,col 13)",
        "(line 954,col 13)-(line 961,col 13)",
        "(line 962,col 13)-(line 962,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 969,col 13)-(line 969,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 976,
      "end_line": 988,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 977,col 13)-(line 977,col 53)",
        "(line 978,col 13)-(line 986,col 13)",
        "(line 987,col 13)-(line 987,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 995,
      "end_line": 1002,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 996,col 13)-(line 996,col 31)",
        "(line 997,col 13)-(line 1000,col 13)",
        "(line 1001,col 13)-(line 1001,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1011,
      "end_line": 1019,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 79)",
        "(line 1013,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1018,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1026,
      "end_line": 1034,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 79)",
        "(line 1028,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1040,
      "end_line": 1049,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 79)",
        "(line 1042,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1048,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1056,
      "end_line": 1064,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 79)",
        "(line 1058,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1063,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1071,
      "end_line": 1079,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 79)",
        "(line 1073,col 9)-(line 1077,col 9)",
        "(line 1078,col 9)-(line 1078,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1086,
      "end_line": 1094,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 68)",
        "(line 1088,col 9)-(line 1092,col 9)",
        "(line 1093,col 9)-(line 1093,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1101,
      "end_line": 1109,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1102,col 79)",
        "(line 1103,col 9)-(line 1107,col 9)",
        "(line 1108,col 9)-(line 1108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1115,
      "end_line": 1125,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1116,col 9)-(line 1116,col 61)",
        "(line 1117,col 9)-(line 1123,col 9)",
        "(line 1124,col 9)-(line 1124,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1132,
      "end_line": 1146,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1156,
      "end_line": 1160,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix 1.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1167,
      "end_line": 1173,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 40)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1180,
      "end_line": 1188,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 40)",
        "(line 1182,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1187,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1195,
      "end_line": 1197,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1196,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1205,
      "end_line": 1215,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1206,col 9)-(line 1206,col 39)",
        "(line 1207,col 9)-(line 1207,col 42)",
        "(line 1208,col 9)-(line 1208,col 50)",
        "(line 1209,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1223,
      "end_line": 1232,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 52)",
        "(line 1225,col 9)-(line 1225,col 43)",
        "(line 1226,col 9)-(line 1226,col 29)",
        "(line 1227,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1231,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1238,
      "end_line": 1249,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1239,col 9)-(line 1239,col 39)",
        "(line 1240,col 9)-(line 1247,col 9)",
        "(line 1248,col 9)-(line 1248,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1255,
      "end_line": 1266,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 38)",
        "(line 1257,col 9)-(line 1264,col 9)",
        "(line 1265,col 9)-(line 1265,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1272,
      "end_line": 1280,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 39)",
        "(line 1274,col 9)-(line 1278,col 9)",
        "(line 1279,col 9)-(line 1279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1286,
      "end_line": 1294,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 38)",
        "(line 1288,col 9)-(line 1292,col 9)",
        "(line 1293,col 9)-(line 1293,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1300,
      "end_line": 1306,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 48)",
        "(line 1302,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1305,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1312,
      "end_line": 1318,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 48)",
        "(line 1314,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1317,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1324,
      "end_line": 1330,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1325,col 9)-(line 1325,col 42)",
        "(line 1326,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1329,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1337,
      "end_line": 1345,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 49)",
        "(line 1339,col 9)-(line 1343,col 9)",
        "(line 1344,col 9)-(line 1344,col 50)"
      ]
    }
  ]
}